#!/usr/bin/python3

#  Copyright (C) 2012 Hai Bison
#
#  See the file LICENSE at the root directory of this project for copying
#  permission.

'''
This tool parses `messages.properties` and generates all strings to their
respective IDs, which can be put into class R.string.
'''

import os
import os.path
import re
import sys

SOURCE_FILE = os.sep.join([os.path.dirname(os.path.dirname(os.path.abspath(sys.argv[0]))),
                           'code','src','group','pals','desktop','app',
                           'apksigner','i18n','messages_en.properties'])

# PARSE SOURCE FILE

# Should start from 1...
count = 1

with open(SOURCE_FILE, 'r') as f:
    for line in f:
        line = line.strip()
        if line and not line.startswith('#'):
            print('public static final int {} = 0x{:08x};'\
                   .format(re.sub(r'(?s)=.*', '', line).strip(), count))
            count += 1
