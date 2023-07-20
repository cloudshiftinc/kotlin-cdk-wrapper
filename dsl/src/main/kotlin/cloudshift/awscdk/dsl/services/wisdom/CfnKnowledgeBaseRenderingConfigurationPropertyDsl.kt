@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

@CdkDslMarker
public class CfnKnowledgeBaseRenderingConfigurationPropertyDsl {
  private val cdkBuilder: CfnKnowledgeBase.RenderingConfigurationProperty.Builder =
      CfnKnowledgeBase.RenderingConfigurationProperty.builder()

  public fun templateUri(templateUri: String) {
    cdkBuilder.templateUri(templateUri)
  }

  public fun build(): CfnKnowledgeBase.RenderingConfigurationProperty = cdkBuilder.build()
}
