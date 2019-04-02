SUMMARY = "CommonAPI"
SECTION = "libs"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"
PROVIDES = "common-api2"
PR = "r0"

SRCREV = "4d1a57a008904455899c7fd6367eac9efe3292c6"
SRC_URI = "git://github.com/GENIVI/capicxx-core-runtime.git;protocol=https"
S = "${WORKDIR}/git"

CXXFLAGS := "${@oe_filter_out('-fvisibility-inlines-hidden', '${CXXFLAGS}', d)}"

inherit autotools lib_package pkgconfig
