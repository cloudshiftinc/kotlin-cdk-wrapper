@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.fsx

import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
 * with a data repository association.
 */
public inline fun CfnDataRepositoryAssociation.setS3(
    block: CfnDataRepositoryAssociationS3PropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataRepositoryAssociationS3PropertyDsl()
    builder.apply(block)
    return setS3(builder.build())
}

/** The Lustre configuration for the file system being created. */
public inline fun CfnFileSystem.setLustreConfiguration(
    block: CfnFileSystemLustreConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFileSystemLustreConfigurationPropertyDsl()
    builder.apply(block)
    return setLustreConfiguration(builder.build())
}

/** The ONTAP configuration properties of the FSx for ONTAP file system that you are creating. */
public inline fun CfnFileSystem.setOntapConfiguration(
    block: CfnFileSystemOntapConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFileSystemOntapConfigurationPropertyDsl()
    builder.apply(block)
    return setOntapConfiguration(builder.build())
}

/**
 * The Amazon FSx for OpenZFS configuration properties for the file system that you are creating.
 */
public inline fun CfnFileSystem.setOpenZfsConfiguration(
    block: CfnFileSystemOpenZFSConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFileSystemOpenZFSConfigurationPropertyDsl()
    builder.apply(block)
    return setOpenZfsConfiguration(builder.build())
}

/** The configuration object for the Microsoft Windows file system you are creating. */
public inline fun CfnFileSystem.setWindowsConfiguration(
    block: CfnFileSystemWindowsConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFileSystemWindowsConfigurationPropertyDsl()
    builder.apply(block)
    return setWindowsConfiguration(builder.build())
}

/**
 * Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
 */
public inline fun CfnStorageVirtualMachine.setActiveDirectoryConfiguration(
    block: CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl()
    builder.apply(block)
    return setActiveDirectoryConfiguration(builder.build())
}

/** The configuration of an Amazon FSx for NetApp ONTAP volume. */
public inline fun CfnVolume.setOntapConfiguration(
    block: CfnVolumeOntapConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVolumeOntapConfigurationPropertyDsl()
    builder.apply(block)
    return setOntapConfiguration(builder.build())
}

/** The configuration of an Amazon FSx for OpenZFS volume. */
public inline fun CfnVolume.setOpenZfsConfiguration(
    block: CfnVolumeOpenZFSConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVolumeOpenZFSConfigurationPropertyDsl()
    builder.apply(block)
    return setOpenZfsConfiguration(builder.build())
}
