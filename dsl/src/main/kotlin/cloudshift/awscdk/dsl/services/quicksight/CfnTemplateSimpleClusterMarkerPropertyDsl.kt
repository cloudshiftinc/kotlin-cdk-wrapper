@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSimpleClusterMarkerPropertyDsl {
  private val cdkBuilder: CfnTemplate.SimpleClusterMarkerProperty.Builder =
      CfnTemplate.SimpleClusterMarkerProperty.builder()

  /**
   * @param color The color of the simple cluster marker.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun build(): CfnTemplate.SimpleClusterMarkerProperty = cdkBuilder.build()
}
