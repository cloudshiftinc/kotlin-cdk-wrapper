@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps

@CdkDslMarker
public class CfnMonitoringSubscriptionPropsDsl {
  private val cdkBuilder: CfnMonitoringSubscriptionProps.Builder =
      CfnMonitoringSubscriptionProps.builder()

  public fun distributionId(distributionId: String) {
    cdkBuilder.distributionId(distributionId)
  }

  public fun monitoringSubscription(monitoringSubscription: IResolvable) {
    cdkBuilder.monitoringSubscription(monitoringSubscription)
  }

  public
      fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty) {
    cdkBuilder.monitoringSubscription(monitoringSubscription)
  }

  public fun build(): CfnMonitoringSubscriptionProps = cdkBuilder.build()
}
