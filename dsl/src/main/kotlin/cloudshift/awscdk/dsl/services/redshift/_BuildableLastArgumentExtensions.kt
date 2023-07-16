@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.redshift.CfnCluster
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup
import software.amazon.awscdk.services.redshift.CfnEndpointAccess
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorization
import software.amazon.awscdk.services.redshift.CfnEventSubscription
import software.amazon.awscdk.services.redshift.CfnScheduledAction

public inline fun CfnCluster.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCluster.setEndpoint(block: CfnClusterEndpointPropertyDsl.() -> Unit = {}) {
  val builder = CfnClusterEndpointPropertyDsl()
  builder.apply(block)
  return setEndpoint(builder.build())
}

public inline
    fun CfnCluster.setLoggingProperties(block: CfnClusterLoggingPropertiesPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterLoggingPropertiesPropertyDsl()
  builder.apply(block)
  return setLoggingProperties(builder.build())
}

public inline fun CfnClusterParameterGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnClusterSecurityGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnClusterSecurityGroupIngress.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnClusterSubnetGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEndpointAccess.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEndpointAuthorization.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEventSubscription.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnScheduledAction.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnScheduledAction.setTargetAction(block: CfnScheduledActionScheduledActionTypePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduledActionScheduledActionTypePropertyDsl()
  builder.apply(block)
  return setTargetAction(builder.build())
}
