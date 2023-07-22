@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup

@CdkDslMarker
public class CfnInputSecurityGroupInputWhitelistRuleCidrPropertyDsl {
  private val cdkBuilder: CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.Builder =
      CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.builder()

  /**
   * @param cidr An IPv4 CIDR range to include in this input security group.
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun build(): CfnInputSecurityGroup.InputWhitelistRuleCidrProperty = cdkBuilder.build()
}
