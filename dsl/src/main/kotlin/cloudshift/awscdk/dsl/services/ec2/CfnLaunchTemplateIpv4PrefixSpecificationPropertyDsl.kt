@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateIpv4PrefixSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.Builder =
      CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.builder()

  public fun ipv4Prefix(ipv4Prefix: String) {
    cdkBuilder.ipv4Prefix(ipv4Prefix)
  }

  public fun build(): CfnLaunchTemplate.Ipv4PrefixSpecificationProperty = cdkBuilder.build()
}
