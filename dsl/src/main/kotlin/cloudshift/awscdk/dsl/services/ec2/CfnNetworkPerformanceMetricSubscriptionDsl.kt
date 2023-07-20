@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscription
import software.constructs.Construct

@CdkDslMarker
public class CfnNetworkPerformanceMetricSubscriptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkPerformanceMetricSubscription.Builder =
      CfnNetworkPerformanceMetricSubscription.Builder.create(scope, id)

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun metric(metric: String) {
    cdkBuilder.metric(metric)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun build(): CfnNetworkPerformanceMetricSubscription = cdkBuilder.build()
}
