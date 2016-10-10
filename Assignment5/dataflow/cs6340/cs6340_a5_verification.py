#!/usr/bin/env python3
import re
import sys, getopt
import subprocess

'''
    This script is used to verify your output with the results
    You output needs to be cut to the same format as the result text file
    The script assume the line number of the two files are exactly the same
    The first line of the files should be
    ********** ENTER Analysis Results **********
    The last line of the fiels should be
    ********** LEAVE Analysis Results **********

    usage:
    cs6340_a5_verification.py myliveness.txt liveness.txt liveness
    cs6340_a5_verification.py myreachdef.txt reachdef.txt reachdef
'''


class bcolors:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'


def read_result(filename):
    """
    Read in the html file and return a long string
    :param filename:
    :return:
    """
    with open(filename, "r") as myfile:
        data = myfile.readlines()
    return data


def format_to_sets(data, problem):
    # calculate the lines
    total_line = len(data)
    number_record = int((total_line - 2) / 3)
    in_dict = dict()
    out_dict = dict()

    # traverse the file
    for i in range(number_record):
        record_index = int(1 + i * 3)
        record = data[record_index]
        in_line = data[record_index + 1]
        out_line = data[record_index + 2]
        in_set = get_set(in_line, problem)
        out_set = get_set(out_line, problem)
        in_dict[record] = in_set
        out_dict[record] = out_set

    return in_dict, out_dict


def get_set(line, problem):
    """
    get set from the input line
    :param line:
    :return:
    """
    if problem == 'reachdef':
        mypattern = '(?<=<).+?(?=>)'
        return set(re.findall(mypattern, line))
    elif problem == 'liveness':

        return set(line[5:].split())
    else:
        raise Exception('Method is not defined')


def reshape_file(result1, result2):
    # cut part of result out
    end_tag = '********** LEAVE Analysis Results **********\n';
    start_tag = '********** ENTER Analysis Results **********\n'
    ending = result1.index(end_tag)
    starting = result1.index(start_tag)
    result1_cut = result1[starting:ending + 1]

    ending = result2.index(end_tag)
    starting = result2.index(start_tag)
    result2_cut = result2[starting:ending + 1]

    return result1_cut, result2_cut


def print_diff(set1, set2):
    if len(set1) > len(set2):
        diff = set1 - set2
    else:
        diff = set2 - set1
    print(sorted(list(diff)))


def main(argv):
    problem = argv[2]
    input_file = argv[0]
    input_file2 = argv[1]
    result1 = read_result(input_file)
    result2 = read_result(input_file2)

    (result1, result2) = reshape_file(result1, result2)

    (in_dict1, out_dict1) = format_to_sets(result1, problem)

    (in_dict2, out_dict2) = format_to_sets(result2, problem)

    all_passed = True
    inFailures = 0
    outFailures = 0

    for key in in_dict1:

        print(bcolors.OKBLUE + "\n" + key + bcolors.ENDC)
        if in_dict1[key] == in_dict2[key]:
            print(bcolors.OKGREEN + "IN PASSED!" + bcolors.ENDC)
            print(sorted(list(in_dict1[key])))
            print(sorted(list(in_dict2[key])))

        else:
            print(bcolors.FAIL + "IN FAILED!" + bcolors.ENDC)
            print(sorted(list(in_dict1[key])))
            print(sorted(list(in_dict2[key])))
            print_diff(in_dict1[key], in_dict2[key])
            all_passed = False
            inFailures += 1

        if out_dict1[key] == out_dict2[key]:
            print(bcolors.OKGREEN + "OUT PASSED!" + bcolors.ENDC)
            print(sorted(list(out_dict1[key])))
            print(sorted(list(out_dict2[key])))
        else:
            print(bcolors.FAIL + "OUT FAILED!" + bcolors.ENDC)
            print(sorted(list(out_dict1[key])))
            print(sorted(list(out_dict2[key])))
            print_diff(out_dict1[key], out_dict2[key])
            all_passed = False
            outFailures += 1

    if all_passed:
        print(bcolors.OKGREEN + "All good! Great Work!!!" + bcolors.ENDC)
    else:
        print(bcolors.FAIL + "Sorry! Need more work!!!" + bcolors.ENDC)
        print(bcolors.FAIL + "IN Failures: " + str(inFailures) + bcolors.ENDC)
        print(bcolors.FAIL + "OUT Failures: " + str(outFailures) + bcolors.ENDC)


if __name__ == "__main__":
    main(sys.argv[1:])
