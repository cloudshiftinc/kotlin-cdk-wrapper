@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.events.Archive
import software.amazon.awscdk.services.events.CfnApiDestination
import software.amazon.awscdk.services.events.CfnArchive
import software.amazon.awscdk.services.events.CfnConnection
import software.amazon.awscdk.services.events.CfnEndpoint
import software.amazon.awscdk.services.events.CfnEventBus
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.amazon.awscdk.services.events.CfnRule
import software.amazon.awscdk.services.events.EventBus
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult

public inline fun CfnApiDestination.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnArchive.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnConnection.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConnection.setAuthParameters(block: CfnConnectionAuthParametersPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnConnectionAuthParametersPropertyDsl()
  builder.apply(block)
  return setAuthParameters(builder.build())
}

public inline fun CfnEndpoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnEndpoint.setReplicationConfig(block: CfnEndpointReplicationConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEndpointReplicationConfigPropertyDsl()
  builder.apply(block)
  return setReplicationConfig(builder.build())
}

public inline fun CfnEndpoint.setRoutingConfig(block: CfnEndpointRoutingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEndpointRoutingConfigPropertyDsl()
  builder.apply(block)
  return setRoutingConfig(builder.build())
}

public inline fun CfnEventBus.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEventBusPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnEventBusPolicy.setCondition(block: CfnEventBusPolicyConditionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnEventBusPolicyConditionPropertyDsl()
  builder.apply(block)
  return setCondition(builder.build())
}

public inline fun CfnRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun EventBus.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun EventBus.archive(arg0: String, block: BaseArchivePropsDsl.() -> Unit = {}):
    Archive {
  val builder = BaseArchivePropsDsl()
  builder.apply(block)
  return archive(arg0,builder.build())
}

public inline fun Rule.addEventPattern(block: EventPatternDsl.() -> Unit = {}) {
  val builder = EventPatternDsl()
  builder.apply(block)
  return addEventPattern(builder.build())
}
