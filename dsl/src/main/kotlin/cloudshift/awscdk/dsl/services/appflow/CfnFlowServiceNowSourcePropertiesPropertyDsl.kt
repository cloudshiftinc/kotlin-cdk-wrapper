@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowServiceNowSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.ServiceNowSourcePropertiesProperty.Builder =
      CfnFlow.ServiceNowSourcePropertiesProperty.builder()

  /**
   * @param object The object specified in the ServiceNow flow source. 
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun build(): CfnFlow.ServiceNowSourcePropertiesProperty = cdkBuilder.build()
}
