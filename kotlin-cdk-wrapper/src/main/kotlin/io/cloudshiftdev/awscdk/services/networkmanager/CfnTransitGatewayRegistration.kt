@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Registers a transit gateway in your global network.
 *
 * Not all Regions support transit gateways for global networks. For a list of the supported
 * Regions, see [Region
 * Availability](https://docs.aws.amazon.com/network-manager/latest/tgwnm/what-are-global-networks.html#nm-available-regions)
 * in the *AWS Transit Gateways for Global Networks User Guide* . The transit gateway can be in any of
 * the supported AWS Regions, but it must be owned by the same AWS account that owns the global
 * network. You cannot register a transit gateway in more than one global network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnTransitGatewayRegistration cfnTransitGatewayRegistration =
 * CfnTransitGatewayRegistration.Builder.create(this, "MyCfnTransitGatewayRegistration")
 * .globalNetworkId("globalNetworkId")
 * .transitGatewayArn("transitGatewayArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html)
 */
public open class CfnTransitGatewayRegistration(
  cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayRegistrationProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTransitGatewayRegistrationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayRegistrationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransitGatewayRegistrationProps(props)
  )

  /**
   * The ID of the global network.
   */
  public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

  /**
   * The ID of the global network.
   */
  public open fun globalNetworkId(`value`: String) {
    unwrap(this).setGlobalNetworkId(`value`)
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
   * The Amazon Resource Name (ARN) of the transit gateway.
   */
  public open fun transitGatewayArn(): String = unwrap(this).getTransitGatewayArn()

  /**
   * The Amazon Resource Name (ARN) of the transit gateway.
   */
  public open fun transitGatewayArn(`value`: String) {
    unwrap(this).setTransitGatewayArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.networkmanager.CfnTransitGatewayRegistration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid)
     * @param globalNetworkId The ID of the global network. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * The Amazon Resource Name (ARN) of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn)
     * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway. 
     */
    public fun transitGatewayArn(transitGatewayArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration.Builder =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration.Builder.create(scope,
        id)

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid)
     * @param globalNetworkId The ID of the global network. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * The Amazon Resource Name (ARN) of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn)
     * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway. 
     */
    override fun transitGatewayArn(transitGatewayArn: String) {
      cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayRegistration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayRegistration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration):
        CfnTransitGatewayRegistration = CfnTransitGatewayRegistration(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRegistration):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration =
        wrapped.cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration
  }
}
