# adapted from linux-imx.inc, copyright (C) 2012-2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-wandboard.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# Wandboard branch - based on 3.16-rc1 from torvalds git
SRCBRANCH = "master"
SRCREV = "7171511eaec5bf23fb06078f59784a3a0626b38f"
LOCALVERSION = "-1.0.0-wandboard"


COMPATIBLE_MACHINE = "(wandboard)"
