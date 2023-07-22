@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateIpv4PrefixSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.Builder =
      CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.builder()

  /**
   * @param ipv4Prefix The IPv4 prefix.
   * For information, see [Assigning prefixes to Amazon EC2 network
   * interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun ipv4Prefix(ipv4Prefix: String) {
    cdkBuilder.ipv4Prefix(ipv4Prefix)
  }

  public fun build(): CfnLaunchTemplate.Ipv4PrefixSpecificationProperty = cdkBuilder.build()
}
