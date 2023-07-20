@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCustomContentConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.CustomContentConfigurationProperty.Builder =
      CfnTemplate.CustomContentConfigurationProperty.builder()

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun contentUrl(contentUrl: String) {
    cdkBuilder.contentUrl(contentUrl)
  }

  public fun imageScaling(imageScaling: String) {
    cdkBuilder.imageScaling(imageScaling)
  }

  public fun build(): CfnTemplate.CustomContentConfigurationProperty = cdkBuilder.build()
}
