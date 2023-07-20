@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverRule

@CdkDslMarker
public class CfnResolverRuleTargetAddressPropertyDsl {
  private val cdkBuilder: CfnResolverRule.TargetAddressProperty.Builder =
      CfnResolverRule.TargetAddressProperty.builder()

  public fun ip(ip: String) {
    cdkBuilder.ip(ip)
  }

  public fun ipv6(ipv6: String) {
    cdkBuilder.ipv6(ipv6)
  }

  public fun port(port: String) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnResolverRule.TargetAddressProperty = cdkBuilder.build()
}
