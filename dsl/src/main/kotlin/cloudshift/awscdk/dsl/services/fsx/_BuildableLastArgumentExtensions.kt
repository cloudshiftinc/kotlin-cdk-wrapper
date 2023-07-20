@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine
import software.amazon.awscdk.services.fsx.CfnVolume

public inline
    fun CfnVolume.setOntapConfiguration(block: CfnVolumeOntapConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnVolumeOntapConfigurationPropertyDsl()
  builder.apply(block)
  return setOntapConfiguration(builder.build())
}

public inline
    fun CfnVolume.setOpenZfsConfiguration(block: CfnVolumeOpenZFSConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVolumeOpenZFSConfigurationPropertyDsl()
  builder.apply(block)
  return setOpenZfsConfiguration(builder.build())
}

public inline
    fun CfnDataRepositoryAssociation.setS3(block: CfnDataRepositoryAssociationS3PropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataRepositoryAssociationS3PropertyDsl()
  builder.apply(block)
  return setS3(builder.build())
}

public inline
    fun CfnFileSystem.setLustreConfiguration(block: CfnFileSystemLustreConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFileSystemLustreConfigurationPropertyDsl()
  builder.apply(block)
  return setLustreConfiguration(builder.build())
}

public inline
    fun CfnFileSystem.setOntapConfiguration(block: CfnFileSystemOntapConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFileSystemOntapConfigurationPropertyDsl()
  builder.apply(block)
  return setOntapConfiguration(builder.build())
}

public inline
    fun CfnFileSystem.setOpenZfsConfiguration(block: CfnFileSystemOpenZFSConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFileSystemOpenZFSConfigurationPropertyDsl()
  builder.apply(block)
  return setOpenZfsConfiguration(builder.build())
}

public inline
    fun CfnFileSystem.setWindowsConfiguration(block: CfnFileSystemWindowsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFileSystemWindowsConfigurationPropertyDsl()
  builder.apply(block)
  return setWindowsConfiguration(builder.build())
}

public inline
    fun CfnStorageVirtualMachine.setActiveDirectoryConfiguration(block: CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl()
  builder.apply(block)
  return setActiveDirectoryConfiguration(builder.build())
}
