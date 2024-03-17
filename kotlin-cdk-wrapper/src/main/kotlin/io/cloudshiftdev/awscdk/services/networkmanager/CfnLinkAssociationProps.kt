@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnLinkAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnLinkAssociationProps cfnLinkAssociationProps = CfnLinkAssociationProps.builder()
 * .deviceId("deviceId")
 * .globalNetworkId("globalNetworkId")
 * .linkId("linkId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html)
 */
public interface CfnLinkAssociationProps {
  /**
   * The device ID for the link association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid)
   */
  public fun deviceId(): String

  /**
   * The ID of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid)
   */
  public fun globalNetworkId(): String

  /**
   * The ID of the link.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid)
   */
  public fun linkId(): String

  /**
   * A builder for [CfnLinkAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deviceId The device ID for the link association. 
     */
    public fun deviceId(deviceId: String)

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * @param linkId The ID of the link. 
     */
    public fun linkId(linkId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps.builder()

    /**
     * @param deviceId The device ID for the link association. 
     */
    override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    /**
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * @param linkId The ID of the link. 
     */
    override fun linkId(linkId: String) {
      cdkBuilder.linkId(linkId)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps,
  ) : CdkObject(cdkObject), CfnLinkAssociationProps {
    /**
     * The device ID for the link association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-deviceid)
     */
    override fun deviceId(): String = unwrap(this).getDeviceId()

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-globalnetworkid)
     */
    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    /**
     * The ID of the link.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html#cfn-networkmanager-linkassociation-linkid)
     */
    override fun linkId(): String = unwrap(this).getLinkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLinkAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps):
        CfnLinkAssociationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLinkAssociationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLinkAssociationProps):
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps
  }
}
