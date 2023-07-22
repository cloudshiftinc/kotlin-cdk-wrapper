@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationServiceNowSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.ServiceNowSourcePropertiesProperty.Builder =
      CfnIntegration.ServiceNowSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the ServiceNow flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnIntegration.ServiceNowSourcePropertiesProperty = cdkBuilder.build()
}
