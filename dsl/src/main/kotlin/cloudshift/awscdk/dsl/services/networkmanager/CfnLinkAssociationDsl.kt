@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociation
import software.constructs.Construct

/**
 * Describes the association between a device and a link.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnLinkAssociation cfnLinkAssociation = CfnLinkAssociation.Builder.create(this,
 * "MyCfnLinkAssociation")
 * .deviceId("deviceId")
 * .globalNetworkId("globalNetworkId")
 * .linkId("linkId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html)
 */
@CdkDslMarker
public class CfnLinkAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLinkAssociation.Builder = CfnLinkAssociation.Builder.create(scope, id)

  /**
   * The device ID for the link association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid)
   * @param deviceId The device ID for the link association. 
   */
  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid)
   * @param globalNetworkId The ID of the global network. 
   */
  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  /**
   * The ID of the link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid)
   * @param linkId The ID of the link. 
   */
  public fun linkId(linkId: String) {
    cdkBuilder.linkId(linkId)
  }

  public fun build(): CfnLinkAssociation = cdkBuilder.build()
}
