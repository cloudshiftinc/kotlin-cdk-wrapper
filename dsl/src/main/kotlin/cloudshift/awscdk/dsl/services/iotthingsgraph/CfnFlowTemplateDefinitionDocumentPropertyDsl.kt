@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotthingsgraph

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate

@CdkDslMarker
public class CfnFlowTemplateDefinitionDocumentPropertyDsl {
  private val cdkBuilder: CfnFlowTemplate.DefinitionDocumentProperty.Builder =
      CfnFlowTemplate.DefinitionDocumentProperty.builder()

  public fun language(language: String) {
    cdkBuilder.language(language)
  }

  public fun text(text: String) {
    cdkBuilder.text(text)
  }

  public fun build(): CfnFlowTemplate.DefinitionDocumentProperty = cdkBuilder.build()
}
