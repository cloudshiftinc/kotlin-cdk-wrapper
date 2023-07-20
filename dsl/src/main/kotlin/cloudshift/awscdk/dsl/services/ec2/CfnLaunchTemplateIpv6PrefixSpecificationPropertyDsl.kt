@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateIpv6PrefixSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.Builder =
      CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.builder()

  public fun ipv6Prefix(ipv6Prefix: String) {
    cdkBuilder.ipv6Prefix(ipv6Prefix)
  }

  public fun build(): CfnLaunchTemplate.Ipv6PrefixSpecificationProperty = cdkBuilder.build()
}
