@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * Information about third-party services integrated into a response plan.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * IntegrationProperty integrationProperty = IntegrationProperty.builder()
 * .pagerDutyConfiguration(PagerDutyConfigurationProperty.builder()
 * .name("name")
 * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
 * .serviceId("serviceId")
 * .build())
 * .secretId("secretId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-integration.html)
 */
@CdkDslMarker
public class CfnResponsePlanIntegrationPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.IntegrationProperty.Builder =
      CfnResponsePlan.IntegrationProperty.builder()

  /**
   * @param pagerDutyConfiguration Information about the PagerDuty service where the response plan
   * creates an incident. 
   */
  public fun pagerDutyConfiguration(pagerDutyConfiguration: IResolvable) {
    cdkBuilder.pagerDutyConfiguration(pagerDutyConfiguration)
  }

  /**
   * @param pagerDutyConfiguration Information about the PagerDuty service where the response plan
   * creates an incident. 
   */
  public
      fun pagerDutyConfiguration(pagerDutyConfiguration: CfnResponsePlan.PagerDutyConfigurationProperty) {
    cdkBuilder.pagerDutyConfiguration(pagerDutyConfiguration)
  }

  public fun build(): CfnResponsePlan.IntegrationProperty = cdkBuilder.build()
}
