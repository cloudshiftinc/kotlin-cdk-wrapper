@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotthingsgraph

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnFlowTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFlowTemplate.Builder = CfnFlowTemplate.Builder.create(scope, id)

  public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
    cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
  }

  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty) {
    cdkBuilder.definition(definition)
  }

  public fun build(): CfnFlowTemplate = cdkBuilder.build()
}
