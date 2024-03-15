@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEndpointConnectionNotification internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrVpcEndpointConnectionNotificationId(): String =
      unwrap(this).getAttrVpcEndpointConnectionNotificationId()

  public open fun connectionEvents(): List<String> = unwrap(this).getConnectionEvents()

  public open fun connectionEvents(`value`: List<String>) {
    unwrap(this).setConnectionEvents(`value`)
  }

  public open fun connectionEvents(vararg `value`: String): Unit =
      connectionEvents(`value`.toList())

  public open fun connectionNotificationArn(): String = unwrap(this).getConnectionNotificationArn()

  public open fun connectionNotificationArn(`value`: String) {
    unwrap(this).setConnectionNotificationArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serviceId(): String? = unwrap(this).getServiceId()

  public open fun serviceId(`value`: String) {
    unwrap(this).setServiceId(`value`)
  }

  public open fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  public open fun vpcEndpointId(`value`: String) {
    unwrap(this).setVpcEndpointId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun connectionEvents(connectionEvents: List<String>)

    public fun connectionEvents(vararg connectionEvents: String)

    public fun connectionNotificationArn(connectionNotificationArn: String)

    public fun serviceId(serviceId: String)

    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification.Builder.create(scope,
        id)

    override fun connectionEvents(connectionEvents: List<String>) {
      cdkBuilder.connectionEvents(connectionEvents)
    }

    override fun connectionEvents(vararg connectionEvents: String): Unit =
        connectionEvents(connectionEvents.toList())

    override fun connectionNotificationArn(connectionNotificationArn: String) {
      cdkBuilder.connectionNotificationArn(connectionNotificationArn)
    }

    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpointConnectionNotification {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpointConnectionNotification(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification):
        CfnVPCEndpointConnectionNotification = CfnVPCEndpointConnectionNotification(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointConnectionNotification):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification = wrapped.cdkObject
  }
}
