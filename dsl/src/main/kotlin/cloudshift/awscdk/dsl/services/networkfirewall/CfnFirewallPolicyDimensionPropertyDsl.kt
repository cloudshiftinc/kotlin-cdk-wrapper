@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

/**
 * The value to use in an Amazon CloudWatch custom metric dimension.
 *
 * This is used in the `PublishMetrics` custom action. A CloudWatch custom metric dimension is a
 * name/value pair that's part of the identity of a metric.
 *
 * AWS Network Firewall sets the dimension name to `CustomAction` and you provide the dimension
 * value.
 *
 * For more information about CloudWatch custom metric dimensions, see [Publishing Custom
 * Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#usingDimensions)
 * in the [Amazon CloudWatch User
 * Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * DimensionProperty dimensionProperty = DimensionProperty.builder()
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-dimension.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyDimensionPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.DimensionProperty.Builder =
      CfnFirewallPolicy.DimensionProperty.builder()

  /**
   * @param value The value to use in the custom metric dimension. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnFirewallPolicy.DimensionProperty = cdkBuilder.build()
}
