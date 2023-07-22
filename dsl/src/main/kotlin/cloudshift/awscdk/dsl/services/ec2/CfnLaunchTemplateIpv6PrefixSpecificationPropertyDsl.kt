@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies an IPv6 prefix for a network interface.
 *
 * `Ipv6PrefixSpecification` is a property of [AWS::EC2::LaunchTemplate
 * NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Ipv6PrefixSpecificationProperty ipv6PrefixSpecificationProperty =
 * Ipv6PrefixSpecificationProperty.builder()
 * .ipv6Prefix("ipv6Prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6prefixspecification.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateIpv6PrefixSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.Builder =
      CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.builder()

  /**
   * @param ipv6Prefix The IPv6 prefix.
   */
  public fun ipv6Prefix(ipv6Prefix: String) {
    cdkBuilder.ipv6Prefix(ipv6Prefix)
  }

  public fun build(): CfnLaunchTemplate.Ipv6PrefixSpecificationProperty = cdkBuilder.build()
}
