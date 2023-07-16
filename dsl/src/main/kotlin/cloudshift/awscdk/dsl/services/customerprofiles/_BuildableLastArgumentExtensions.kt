@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import software.amazon.awscdk.services.customerprofiles.CfnDomain
import software.amazon.awscdk.services.customerprofiles.CfnEventStream
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import software.amazon.awscdk.services.customerprofiles.CfnObjectType

public inline fun CfnCalculatedAttributeDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCalculatedAttributeDefinition.setAttributeDetails(block: CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl()
  builder.apply(block)
  return setAttributeDetails(builder.build())
}

public inline
    fun CfnCalculatedAttributeDefinition.setConditions(block: CfnCalculatedAttributeDefinitionConditionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCalculatedAttributeDefinitionConditionsPropertyDsl()
  builder.apply(block)
  return setConditions(builder.build())
}

public inline fun CfnDomain.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEventStream.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIntegration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnIntegration.setFlowDefinition(block: CfnIntegrationFlowDefinitionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnIntegrationFlowDefinitionPropertyDsl()
  builder.apply(block)
  return setFlowDefinition(builder.build())
}

public inline fun CfnObjectType.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
