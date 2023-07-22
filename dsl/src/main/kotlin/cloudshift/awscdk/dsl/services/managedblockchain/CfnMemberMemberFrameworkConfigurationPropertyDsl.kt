@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

@CdkDslMarker
public class CfnMemberMemberFrameworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnMember.MemberFrameworkConfigurationProperty.Builder =
      CfnMember.MemberFrameworkConfigurationProperty.builder()

  /**
   * @param memberFabricConfiguration Configuration properties for Hyperledger Fabric.
   */
  public fun memberFabricConfiguration(memberFabricConfiguration: IResolvable) {
    cdkBuilder.memberFabricConfiguration(memberFabricConfiguration)
  }

  /**
   * @param memberFabricConfiguration Configuration properties for Hyperledger Fabric.
   */
  public
      fun memberFabricConfiguration(memberFabricConfiguration: CfnMember.MemberFabricConfigurationProperty) {
    cdkBuilder.memberFabricConfiguration(memberFabricConfiguration)
  }

  public fun build(): CfnMember.MemberFrameworkConfigurationProperty = cdkBuilder.build()
}
