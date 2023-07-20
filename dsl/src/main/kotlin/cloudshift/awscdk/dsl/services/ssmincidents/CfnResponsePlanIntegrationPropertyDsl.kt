@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanIntegrationPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.IntegrationProperty.Builder =
      CfnResponsePlan.IntegrationProperty.builder()

  public fun pagerDutyConfiguration(pagerDutyConfiguration: IResolvable) {
    cdkBuilder.pagerDutyConfiguration(pagerDutyConfiguration)
  }

  public
      fun pagerDutyConfiguration(pagerDutyConfiguration: CfnResponsePlan.PagerDutyConfigurationProperty) {
    cdkBuilder.pagerDutyConfiguration(pagerDutyConfiguration)
  }

  public fun build(): CfnResponsePlan.IntegrationProperty = cdkBuilder.build()
}
