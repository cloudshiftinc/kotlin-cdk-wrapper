@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.managedblockchain.CfnMember

/**
 * Hyperledger Fabric configuration properties for the network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.managedblockchain.*;
 * NetworkFabricConfigurationProperty networkFabricConfigurationProperty =
 * NetworkFabricConfigurationProperty.builder()
 * .edition("edition")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html)
 */
@CdkDslMarker
public class CfnMemberNetworkFabricConfigurationPropertyDsl {
  private val cdkBuilder: CfnMember.NetworkFabricConfigurationProperty.Builder =
      CfnMember.NetworkFabricConfigurationProperty.builder()

  /**
   * @param edition The edition of Amazon Managed Blockchain that the network uses. 
   * Valid values are `standard` and `starter` . For more information, see [Amazon Managed
   * Blockchain Pricing](https://docs.aws.amazon.com/managed-blockchain/pricing/)
   */
  public fun edition(edition: String) {
    cdkBuilder.edition(edition)
  }

  public fun build(): CfnMember.NetworkFabricConfigurationProperty = cdkBuilder.build()
}
