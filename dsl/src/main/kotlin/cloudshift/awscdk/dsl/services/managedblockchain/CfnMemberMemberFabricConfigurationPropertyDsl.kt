@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.managedblockchain.CfnMember

/**
 * Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain network that
 * is using the Hyperledger Fabric framework.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * MemberFabricConfigurationProperty memberFabricConfigurationProperty =
 * MemberFabricConfigurationProperty.builder()
 * .adminPassword("adminPassword")
 * .adminUsername("adminUsername")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html)
 */
@CdkDslMarker
public class CfnMemberMemberFabricConfigurationPropertyDsl {
  private val cdkBuilder: CfnMember.MemberFabricConfigurationProperty.Builder =
      CfnMember.MemberFabricConfigurationProperty.builder()

  /**
   * @param adminPassword The password for the member's initial administrative user. 
   * The `AdminPassword` must be at least 8 characters long and no more than 32 characters. It must
   * contain at least one uppercase letter, one lowercase letter, and one digit. It cannot have a
   * single quotation mark (‘), a double quotation marks (“), a forward slash(/), a backward slash(),
   */
  public fun adminPassword(adminPassword: String) {
    cdkBuilder.adminPassword(adminPassword)
  }

  /**
   * @param adminUsername The user name for the member's initial administrative user. 
   */
  public fun adminUsername(adminUsername: String) {
    cdkBuilder.adminUsername(adminUsername)
  }

  public fun build(): CfnMember.MemberFabricConfigurationProperty = cdkBuilder.build()
}
