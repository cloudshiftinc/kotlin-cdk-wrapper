@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.managedblockchain.CfnMember

@CdkDslMarker
public class CfnMemberNetworkFrameworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnMember.NetworkFrameworkConfigurationProperty.Builder =
      CfnMember.NetworkFrameworkConfigurationProperty.builder()

  public fun networkFabricConfiguration(networkFabricConfiguration: IResolvable) {
    cdkBuilder.networkFabricConfiguration(networkFabricConfiguration)
  }

  public
      fun networkFabricConfiguration(networkFabricConfiguration: CfnMember.NetworkFabricConfigurationProperty) {
    cdkBuilder.networkFabricConfiguration(networkFabricConfiguration)
  }

  public fun build(): CfnMember.NetworkFrameworkConfigurationProperty = cdkBuilder.build()
}
