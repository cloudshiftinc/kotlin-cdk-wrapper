@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * [IPv6 only] Specifies an egress-only internet gateway for your VPC.
 *
 * An egress-only internet gateway is used to enable outbound communication over IPv6 from instances
 * in your VPC to the internet, and prevents hosts outside of your VPC from initiating an IPv6
 * connection with your instance.
 *
 * For more information, see [Egress-only internet
 * gateway](https://docs.aws.amazon.com/vpc/latest/userguide/egress-only-internet-gateway.html) in the
 * *Amazon VPC User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnEgressOnlyInternetGateway cfnEgressOnlyInternetGateway =
 * CfnEgressOnlyInternetGateway.Builder.create(this, "MyCfnEgressOnlyInternetGateway")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html)
 */
public open class CfnEgressOnlyInternetGateway(
  cdkObject: software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEgressOnlyInternetGatewayProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEgressOnlyInternetGatewayProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEgressOnlyInternetGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEgressOnlyInternetGatewayProps(props)
  )

  /**
   * The ID of the egress-only internet gateway.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the VPC for which to create the egress-only internet gateway.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC for which to create the egress-only internet gateway.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnEgressOnlyInternetGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the VPC for which to create the egress-only internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
     * @param vpcId The ID of the VPC for which to create the egress-only internet gateway. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway.Builder
        = software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway.Builder.create(scope, id)

    /**
     * The ID of the VPC for which to create the egress-only internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
     * @param vpcId The ID of the VPC for which to create the egress-only internet gateway. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEgressOnlyInternetGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEgressOnlyInternetGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway):
        CfnEgressOnlyInternetGateway = CfnEgressOnlyInternetGateway(cdkObject)

    internal fun unwrap(wrapped: CfnEgressOnlyInternetGateway):
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway
  }
}
