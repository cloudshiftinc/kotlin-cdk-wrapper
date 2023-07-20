@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

public inline
    fun CfnIntegration.setFlowDefinition(block: CfnIntegrationFlowDefinitionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnIntegrationFlowDefinitionPropertyDsl()
  builder.apply(block)
  return setFlowDefinition(builder.build())
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
