@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription
import software.constructs.Construct

@CdkDslMarker
public class CfnMonitoringSubscriptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMonitoringSubscription.Builder =
      CfnMonitoringSubscription.Builder.create(scope, id)

  /**
   * The ID of the distribution that you are enabling metrics for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-distributionid)
   * @param distributionId The ID of the distribution that you are enabling metrics for. 
   */
  public fun distributionId(distributionId: String) {
    cdkBuilder.distributionId(distributionId)
  }

  /**
   * A subscription configuration for additional CloudWatch metrics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
   * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics. 
   */
  public fun monitoringSubscription(monitoringSubscription: IResolvable) {
    cdkBuilder.monitoringSubscription(monitoringSubscription)
  }

  /**
   * A subscription configuration for additional CloudWatch metrics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html#cfn-cloudfront-monitoringsubscription-monitoringsubscription)
   * @param monitoringSubscription A subscription configuration for additional CloudWatch metrics. 
   */
  public
      fun monitoringSubscription(monitoringSubscription: CfnMonitoringSubscription.MonitoringSubscriptionProperty) {
    cdkBuilder.monitoringSubscription(monitoringSubscription)
  }

  public fun build(): CfnMonitoringSubscription = cdkBuilder.build()
}
