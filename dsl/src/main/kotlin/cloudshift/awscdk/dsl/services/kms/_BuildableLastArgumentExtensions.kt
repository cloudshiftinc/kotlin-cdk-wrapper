@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Boolean
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.CfnAlias
import software.amazon.awscdk.services.kms.CfnKey
import software.amazon.awscdk.services.kms.CfnReplicaKey
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.ViaServicePrincipal

public inline fun Alias.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun CfnAlias.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnReplicaKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun Key.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun ViaServicePrincipal.addToAssumeRolePolicy(block: PolicyDocumentDsl.() -> Unit =
    {}) {
  val builder = PolicyDocumentDsl()
  builder.apply(block)
  return addToAssumeRolePolicy(builder.build())
}

public inline fun ViaServicePrincipal.addToPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPolicy(builder.build())
}

public inline fun ViaServicePrincipal.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}
