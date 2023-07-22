@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCustomContentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.CustomContentConfigurationProperty.Builder =
      CfnDashboard.CustomContentConfigurationProperty.builder()

  /**
   * @param contentType The content type of the custom content visual.
   * You can use this to have the visual render as an image.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param contentUrl The input URL that links to the custom content that you want in the custom
   * visual.
   */
  public fun contentUrl(contentUrl: String) {
    cdkBuilder.contentUrl(contentUrl)
  }

  /**
   * @param imageScaling The sizing options for the size of the custom content visual.
   * This structure is required when the `ContentType` of the visual is `'IMAGE'` .
   */
  public fun imageScaling(imageScaling: String) {
    cdkBuilder.imageScaling(imageScaling)
  }

  public fun build(): CfnDashboard.CustomContentConfigurationProperty = cdkBuilder.build()
}
