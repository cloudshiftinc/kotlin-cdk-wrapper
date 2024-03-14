package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayRouteTablePropagation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun transitGatewayAttachmentId(): String =
      unwrap(this).getTransitGatewayAttachmentId()

  public open fun transitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransitGatewayAttachmentId(`value`)
  }

  public open fun transitGatewayRouteTableId(): String =
      unwrap(this).getTransitGatewayRouteTableId()

  public open fun transitGatewayRouteTableId(`value`: String) {
    unwrap(this).setTransitGatewayRouteTableId(`value`)
  }

  public interface Builder {
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
    }

    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation.Builder.create(scope,
        id)

    public override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    public override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        wrapped.cdkObject
  }
}
