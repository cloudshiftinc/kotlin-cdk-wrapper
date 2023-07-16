@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotthingsgraph

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps
import software.constructs.Construct

public object iotthingsgraph {
  public inline fun cfnFlowTemplate(
    scope: Construct,
    id: String,
    block: CfnFlowTemplateDsl.() -> Unit = {},
  ): CfnFlowTemplate {
    val builder = CfnFlowTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFlowTemplateDefinitionDocumentProperty(block: CfnFlowTemplateDefinitionDocumentPropertyDsl.() -> Unit
      = {}): CfnFlowTemplate.DefinitionDocumentProperty {
    val builder = CfnFlowTemplateDefinitionDocumentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFlowTemplateProps(block: CfnFlowTemplatePropsDsl.() -> Unit = {}):
      CfnFlowTemplateProps {
    val builder = CfnFlowTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
