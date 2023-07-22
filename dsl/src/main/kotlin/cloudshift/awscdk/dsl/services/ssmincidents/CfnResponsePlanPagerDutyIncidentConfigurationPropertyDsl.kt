@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * Details about the PagerDuty service where the response plan creates an incident.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * PagerDutyIncidentConfigurationProperty pagerDutyIncidentConfigurationProperty =
 * PagerDutyIncidentConfigurationProperty.builder()
 * .serviceId("serviceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyincidentconfiguration.html)
 */
@CdkDslMarker
public class CfnResponsePlanPagerDutyIncidentConfigurationPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.PagerDutyIncidentConfigurationProperty.Builder =
      CfnResponsePlan.PagerDutyIncidentConfigurationProperty.builder()

  /**
   * @param serviceId The ID of the PagerDuty service that the response plan associates with an
   * incident when it launches. 
   */
  public fun serviceId(serviceId: String) {
    cdkBuilder.serviceId(serviceId)
  }

  public fun build(): CfnResponsePlan.PagerDutyIncidentConfigurationProperty = cdkBuilder.build()
}
