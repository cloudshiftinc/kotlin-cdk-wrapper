@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

@CdkDslMarker
public class CfnMemberNetworkFrameworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnMember.NetworkFrameworkConfigurationProperty.Builder =
      CfnMember.NetworkFrameworkConfigurationProperty.builder()

  /**
   * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a member
   * in a Managed Blockchain network that is using the Hyperledger Fabric framework.
   */
  public fun networkFabricConfiguration(networkFabricConfiguration: IResolvable) {
    cdkBuilder.networkFabricConfiguration(networkFabricConfiguration)
  }

  /**
   * @param networkFabricConfiguration Configuration properties for Hyperledger Fabric for a member
   * in a Managed Blockchain network that is using the Hyperledger Fabric framework.
   */
  public
      fun networkFabricConfiguration(networkFabricConfiguration: CfnMember.NetworkFabricConfigurationProperty) {
    cdkBuilder.networkFabricConfiguration(networkFabricConfiguration)
  }

  public fun build(): CfnMember.NetworkFrameworkConfigurationProperty = cdkBuilder.build()
}
