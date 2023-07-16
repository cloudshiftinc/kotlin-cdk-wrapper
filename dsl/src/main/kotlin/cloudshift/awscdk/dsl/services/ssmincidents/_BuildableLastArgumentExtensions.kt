@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

public inline fun CfnReplicationSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResponsePlan.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnResponsePlan.setChatChannel(block: CfnResponsePlanChatChannelPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnResponsePlanChatChannelPropertyDsl()
  builder.apply(block)
  return setChatChannel(builder.build())
}

public inline
    fun CfnResponsePlan.setIncidentTemplate(block: CfnResponsePlanIncidentTemplatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResponsePlanIncidentTemplatePropertyDsl()
  builder.apply(block)
  return setIncidentTemplate(builder.build())
}
