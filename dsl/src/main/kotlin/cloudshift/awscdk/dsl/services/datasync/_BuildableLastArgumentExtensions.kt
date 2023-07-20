@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationEFS
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS
import software.amazon.awscdk.services.datasync.CfnLocationHDFS
import software.amazon.awscdk.services.datasync.CfnLocationNFS
import software.amazon.awscdk.services.datasync.CfnLocationS3
import software.amazon.awscdk.services.datasync.CfnLocationSMB
import software.amazon.awscdk.services.datasync.CfnStorageSystem
import software.amazon.awscdk.services.datasync.CfnTask

public inline
    fun CfnLocationFSxOpenZFS.setProtocol(block: CfnLocationFSxOpenZFSProtocolPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLocationFSxOpenZFSProtocolPropertyDsl()
  builder.apply(block)
  return setProtocol(builder.build())
}

public inline
    fun CfnLocationNFS.setOnPremConfig(block: CfnLocationNFSOnPremConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationNFSOnPremConfigPropertyDsl()
  builder.apply(block)
  return setOnPremConfig(builder.build())
}

public inline
    fun CfnLocationNFS.setMountOptions(block: CfnLocationNFSMountOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationNFSMountOptionsPropertyDsl()
  builder.apply(block)
  return setMountOptions(builder.build())
}

public inline fun CfnLocationS3.setS3Config(block: CfnLocationS3S3ConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationS3S3ConfigPropertyDsl()
  builder.apply(block)
  return setS3Config(builder.build())
}

public inline fun CfnLocationEFS.setEc2Config(block: CfnLocationEFSEc2ConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationEFSEc2ConfigPropertyDsl()
  builder.apply(block)
  return setEc2Config(builder.build())
}

public inline
    fun CfnLocationHDFS.setQopConfiguration(block: CfnLocationHDFSQopConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLocationHDFSQopConfigurationPropertyDsl()
  builder.apply(block)
  return setQopConfiguration(builder.build())
}

public inline fun CfnTask.setOptions(block: CfnTaskOptionsPropertyDsl.() -> Unit = {}) {
  val builder = CfnTaskOptionsPropertyDsl()
  builder.apply(block)
  return setOptions(builder.build())
}

public inline fun CfnTask.setSchedule(block: CfnTaskTaskSchedulePropertyDsl.() -> Unit = {}) {
  val builder = CfnTaskTaskSchedulePropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
}

public inline
    fun CfnLocationFSxONTAP.setProtocol(block: CfnLocationFSxONTAPProtocolPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationFSxONTAPProtocolPropertyDsl()
  builder.apply(block)
  return setProtocol(builder.build())
}

public inline
    fun CfnLocationSMB.setMountOptions(block: CfnLocationSMBMountOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationSMBMountOptionsPropertyDsl()
  builder.apply(block)
  return setMountOptions(builder.build())
}

public inline
    fun CfnStorageSystem.setServerConfiguration(block: CfnStorageSystemServerConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStorageSystemServerConfigurationPropertyDsl()
  builder.apply(block)
  return setServerConfiguration(builder.build())
}

public inline
    fun CfnStorageSystem.setServerCredentials(block: CfnStorageSystemServerCredentialsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStorageSystemServerCredentialsPropertyDsl()
  builder.apply(block)
  return setServerCredentials(builder.build())
}
