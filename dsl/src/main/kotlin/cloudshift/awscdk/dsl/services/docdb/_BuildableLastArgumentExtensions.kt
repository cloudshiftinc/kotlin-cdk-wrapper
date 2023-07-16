@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.secretsmanager.RotationScheduleOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.docdb.CfnDBCluster
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.docdb.CfnDBInstance
import software.amazon.awscdk.services.docdb.CfnDBSubnetGroup
import software.amazon.awscdk.services.docdb.DatabaseCluster
import software.amazon.awscdk.services.docdb.DatabaseSecret
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.SecretRotation

public inline fun CfnDBCluster.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBClusterParameterGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBInstance.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBSubnetGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun DatabaseCluster.addRotationMultiUser(arg0: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(arg0,builder.build())
}

public inline fun DatabaseSecret.addRotationSchedule(arg0: String,
    block: RotationScheduleOptionsDsl.() -> Unit = {}): RotationSchedule {
  val builder = RotationScheduleOptionsDsl()
  builder.apply(block)
  return addRotationSchedule(arg0,builder.build())
}

public inline fun DatabaseSecret.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}
