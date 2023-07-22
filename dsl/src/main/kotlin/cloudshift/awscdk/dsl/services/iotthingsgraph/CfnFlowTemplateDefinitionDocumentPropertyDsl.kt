@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotthingsgraph

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotthingsgraph.*;
 * DefinitionDocumentProperty definitionDocumentProperty = DefinitionDocumentProperty.builder()
 * .language("language")
 * .text("text")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html)
 */
@CdkDslMarker
public class CfnFlowTemplateDefinitionDocumentPropertyDsl {
  private val cdkBuilder: CfnFlowTemplate.DefinitionDocumentProperty.Builder =
      CfnFlowTemplate.DefinitionDocumentProperty.builder()

  /**
   * @param language the value to be set. 
   */
  public fun language(language: String) {
    cdkBuilder.language(language)
  }

  /**
   * @param text the value to be set. 
   */
  public fun text(text: String) {
    cdkBuilder.text(text)
  }

  public fun build(): CfnFlowTemplate.DefinitionDocumentProperty = cdkBuilder.build()
}
