@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationMarketoSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.MarketoSourcePropertiesProperty.Builder =
      CfnIntegration.MarketoSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the Marketo flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnIntegration.MarketoSourcePropertiesProperty = cdkBuilder.build()
}
