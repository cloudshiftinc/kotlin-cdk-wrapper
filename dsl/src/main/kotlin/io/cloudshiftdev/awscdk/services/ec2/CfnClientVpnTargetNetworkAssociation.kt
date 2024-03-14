package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClientVpnTargetNetworkAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the Client VPN endpoint.
   */
  public open fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

  /**
   * The ID of the Client VPN endpoint.
   */
  public open fun clientVpnEndpointId(`value`: String) {
    unwrap(this).setClientVpnEndpointId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the subnet to associate with the Client VPN endpoint.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet to associate with the Client VPN endpoint.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-clientvpnendpointid)
     * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
     */
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-subnetid)
     * @param subnetId The ID of the subnet to associate with the Client VPN endpoint. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation.Builder.create(scope,
        id)

    /**
     * The ID of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-clientvpnendpointid)
     * @param clientVpnEndpointId The ID of the Client VPN endpoint. 
     */
    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-subnetid)
     * @param subnetId The ID of the subnet to associate with the Client VPN endpoint. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClientVpnTargetNetworkAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClientVpnTargetNetworkAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation):
        CfnClientVpnTargetNetworkAssociation = CfnClientVpnTargetNetworkAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnTargetNetworkAssociation):
        software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation = wrapped.cdkObject
  }
}
