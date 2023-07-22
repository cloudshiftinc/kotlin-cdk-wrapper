@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.managedblockchain.CfnMember

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
