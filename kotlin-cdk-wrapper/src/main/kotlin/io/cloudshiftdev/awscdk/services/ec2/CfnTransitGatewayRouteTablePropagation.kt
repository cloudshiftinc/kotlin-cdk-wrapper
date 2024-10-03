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
 * Enables the specified attachment to propagate routes to the specified propagation route table.
 *
 * For more information about enabling transit gateway route propagation, see
 * [EnableTransitGatewayRouteTablePropagation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EnableTransitGatewayRouteTablePropagation.html)
 * in the *Amazon EC2 API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteTablePropagation cfnTransitGatewayRouteTablePropagation =
 * CfnTransitGatewayRouteTablePropagation.Builder.create(this,
 * "MyCfnTransitGatewayRouteTablePropagation")
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .transitGatewayRouteTableId("transitGatewayRouteTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html)
 */
public open class CfnTransitGatewayRouteTablePropagation(
  cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayRouteTablePropagationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTransitGatewayRouteTablePropagationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayRouteTablePropagationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransitGatewayRouteTablePropagationProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the attachment.
   */
  public open fun transitGatewayAttachmentId(): String =
      unwrap(this).getTransitGatewayAttachmentId()

  /**
   * The ID of the attachment.
   */
  public open fun transitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransitGatewayAttachmentId(`value`)
  }

  /**
   * The ID of the propagation route table.
   */
  public open fun transitGatewayRouteTableId(): String =
      unwrap(this).getTransitGatewayRouteTableId()

  /**
   * The ID of the propagation route table.
   */
  public open fun transitGatewayRouteTableId(`value`: String) {
    unwrap(this).setTransitGatewayRouteTableId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid)
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    /**
     * The ID of the propagation route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid)
     * @param transitGatewayRouteTableId The ID of the propagation route table. 
     */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation.Builder.create(scope,
        id)

    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid)
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * The ID of the propagation route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid)
     * @param transitGatewayRouteTableId The ID of the propagation route table. 
     */
    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayRouteTablePropagation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayRouteTablePropagation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation):
        CfnTransitGatewayRouteTablePropagation = CfnTransitGatewayRouteTablePropagation(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTablePropagation):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation =
        wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation
  }
}
