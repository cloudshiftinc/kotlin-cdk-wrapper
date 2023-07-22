@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup

/**
 * An IPv4 CIDR range to include in this input security group.
 *
 * The parent of this entity is InputSecurityGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputWhitelistRuleCidrProperty inputWhitelistRuleCidrProperty =
 * InputWhitelistRuleCidrProperty.builder()
 * .cidr("cidr")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html)
 */
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
