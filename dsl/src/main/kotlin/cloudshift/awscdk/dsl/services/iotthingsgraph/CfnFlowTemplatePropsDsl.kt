@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotthingsgraph

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps

@CdkDslMarker
public class CfnFlowTemplatePropsDsl {
  private val cdkBuilder: CfnFlowTemplateProps.Builder = CfnFlowTemplateProps.builder()

  public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
    cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
  }

  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty) {
    cdkBuilder.definition(definition)
  }

  public fun build(): CfnFlowTemplateProps = cdkBuilder.build()
}
