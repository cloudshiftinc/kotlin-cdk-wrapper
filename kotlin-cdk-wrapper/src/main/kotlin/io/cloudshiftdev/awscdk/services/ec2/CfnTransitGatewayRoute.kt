@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun blackhole(): Any? = unwrap(this).getBlackhole()

  public open fun blackhole(`value`: Boolean) {
    unwrap(this).setBlackhole(`value`)
  }

  public open fun blackhole(`value`: IResolvable) {
    unwrap(this).setBlackhole(`value`.let(IResolvable::unwrap))
  }

  public open fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun transitGatewayAttachmentId(): String? =
      unwrap(this).getTransitGatewayAttachmentId()

  public open fun transitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransitGatewayAttachmentId(`value`)
  }

  public open fun transitGatewayRouteTableId(): String =
      unwrap(this).getTransitGatewayRouteTableId()

  public open fun transitGatewayRouteTableId(`value`: String) {
    unwrap(this).setTransitGatewayRouteTableId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun blackhole(blackhole: Boolean)

    public fun blackhole(blackhole: IResolvable)

    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute.Builder.create(scope, id)

    override fun blackhole(blackhole: Boolean) {
      cdkBuilder.blackhole(blackhole)
    }

    override fun blackhole(blackhole: IResolvable) {
      cdkBuilder.blackhole(blackhole.let(IResolvable::unwrap))
    }

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute):
        CfnTransitGatewayRoute = CfnTransitGatewayRoute(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRoute):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute = wrapped.cdkObject
  }
}
