@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.efs.AccessPoint
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.amazon.awscdk.services.efs.CfnFileSystem
import software.amazon.awscdk.services.efs.CfnMountTarget
import software.amazon.awscdk.services.efs.FileSystem
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult

public inline fun CfnAccessPoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAccessPoint.setPosixUser(block: CfnAccessPointPosixUserPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAccessPointPosixUserPropertyDsl()
  builder.apply(block)
  return setPosixUser(builder.build())
}

public inline
    fun CfnAccessPoint.setRootDirectory(block: CfnAccessPointRootDirectoryPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAccessPointRootDirectoryPropertyDsl()
  builder.apply(block)
  return setRootDirectory(builder.build())
}

public inline fun CfnFileSystem.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFileSystem.setBackupPolicy(block: CfnFileSystemBackupPolicyPropertyDsl.() -> Unit = {}) {
  val builder = CfnFileSystemBackupPolicyPropertyDsl()
  builder.apply(block)
  return setBackupPolicy(builder.build())
}

public inline fun CfnMountTarget.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun FileSystem.addAccessPoint(arg0: String, block: AccessPointOptionsDsl.() -> Unit =
    {}): AccessPoint {
  val builder = AccessPointOptionsDsl()
  builder.apply(block)
  return addAccessPoint(arg0,builder.build())
}

public inline fun FileSystem.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}
