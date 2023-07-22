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

/**
 * The type of protocol that AWS DataSync uses to access your file system.
 */
public inline
    fun CfnLocationFSxOpenZFS.setProtocol(block: CfnLocationFSxOpenZFSProtocolPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLocationFSxOpenZFSProtocolPropertyDsl()
  builder.apply(block)
  return setProtocol(builder.build())
}

/**
 * Specifies the Amazon Resource Names (ARNs) of agents that DataSync uses to connect to your NFS
 * file server.
 */
public inline
    fun CfnLocationNFS.setOnPremConfig(block: CfnLocationNFSOnPremConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationNFSOnPremConfigPropertyDsl()
  builder.apply(block)
  return setOnPremConfig(builder.build())
}

/**
 * Specifies the mount options that DataSync can use to mount your NFS share.
 */
public inline
    fun CfnLocationNFS.setMountOptions(block: CfnLocationNFSMountOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationNFSMountOptionsPropertyDsl()
  builder.apply(block)
  return setMountOptions(builder.build())
}

/**
 * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is used
 * to access an Amazon S3 bucket.
 */
public inline fun CfnLocationS3.setS3Config(block: CfnLocationS3S3ConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationS3S3ConfigPropertyDsl()
  builder.apply(block)
  return setS3Config(builder.build())
}

/**
 * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
 */
public inline fun CfnLocationEFS.setEc2Config(block: CfnLocationEFSEc2ConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationEFSEc2ConfigPropertyDsl()
  builder.apply(block)
  return setEc2Config(builder.build())
}

/**
 * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data
 * transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
 */
public inline
    fun CfnLocationHDFS.setQopConfiguration(block: CfnLocationHDFSQopConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLocationHDFSQopConfigurationPropertyDsl()
  builder.apply(block)
  return setQopConfiguration(builder.build())
}

/**
 * Specifies the configuration options for a task.
 *
 * Some options include preserving file or object metadata and verifying data integrity.
 */
public inline fun CfnTask.setOptions(block: CfnTaskOptionsPropertyDsl.() -> Unit = {}) {
  val builder = CfnTaskOptionsPropertyDsl()
  builder.apply(block)
  return setOptions(builder.build())
}

/**
 * Specifies a schedule used to periodically transfer files from a source to a destination location.
 */
public inline fun CfnTask.setSchedule(block: CfnTaskTaskSchedulePropertyDsl.() -> Unit = {}) {
  val builder = CfnTaskTaskSchedulePropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
}

/**
 * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file system.
 */
public inline
    fun CfnLocationFSxONTAP.setProtocol(block: CfnLocationFSxONTAPProtocolPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationFSxONTAPProtocolPropertyDsl()
  builder.apply(block)
  return setProtocol(builder.build())
}

/**
 * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
 */
public inline
    fun CfnLocationSMB.setMountOptions(block: CfnLocationSMBMountOptionsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLocationSMBMountOptionsPropertyDsl()
  builder.apply(block)
  return setMountOptions(builder.build())
}

/**
 * Specifies the server name and network port required to connect with the management interface of
 * your on-premises storage system.
 */
public inline
    fun CfnStorageSystem.setServerConfiguration(block: CfnStorageSystemServerConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStorageSystemServerConfigurationPropertyDsl()
  builder.apply(block)
  return setServerConfiguration(builder.build())
}

/**
 * Specifies the user name and password for accessing your on-premises storage system's management
 * interface.
 */
public inline
    fun CfnStorageSystem.setServerCredentials(block: CfnStorageSystemServerCredentialsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStorageSystemServerCredentialsPropertyDsl()
  builder.apply(block)
  return setServerCredentials(builder.build())
}
