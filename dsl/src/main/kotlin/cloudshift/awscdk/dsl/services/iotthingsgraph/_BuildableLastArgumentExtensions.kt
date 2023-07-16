@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotthingsgraph

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate

public inline fun CfnFlowTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFlowTemplate.setDefinition(block: CfnFlowTemplateDefinitionDocumentPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFlowTemplateDefinitionDocumentPropertyDsl()
  builder.apply(block)
  return setDefinition(builder.build())
}
