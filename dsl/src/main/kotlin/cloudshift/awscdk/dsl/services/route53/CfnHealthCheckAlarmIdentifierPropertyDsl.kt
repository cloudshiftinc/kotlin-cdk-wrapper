@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHealthCheck

/**
 * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers
 * to use to determine whether the specified health check is healthy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * AlarmIdentifierProperty alarmIdentifierProperty = AlarmIdentifierProperty.builder()
 * .name("name")
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-healthcheck-alarmidentifier.html)
 */
@CdkDslMarker
public class CfnHealthCheckAlarmIdentifierPropertyDsl {
  private val cdkBuilder: CfnHealthCheck.AlarmIdentifierProperty.Builder =
      CfnHealthCheck.AlarmIdentifierProperty.builder()

  /**
   * @param name The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to
   * use to determine whether this health check is healthy. 
   *
   * Route 53 supports CloudWatch alarms with the following features:
   *
   * * Standard-resolution metrics. High-resolution metrics aren't supported. For more information,
   * see [High-Resolution
   * Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html#high-resolution-metrics)
   * in the *Amazon CloudWatch User Guide* .
   * * Statistics: Average, Minimum, Maximum, Sum, and SampleCount. Extended statistics aren't
   * supported.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param region For the CloudWatch alarm that you want Route 53 health checkers to use to
   * determine whether this health check is healthy, the region that the alarm was created in. 
   * For the current list of CloudWatch regions, see [Amazon CloudWatch endpoints and
   * quotas](https://docs.aws.amazon.com/general/latest/gr/cw_region.html) in the *Amazon Web Services
   * General Reference* .
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): CfnHealthCheck.AlarmIdentifierProperty = cdkBuilder.build()
}
