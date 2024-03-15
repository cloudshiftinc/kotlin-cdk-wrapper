@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCEndpointConnectionNotificationProps {
  public fun connectionEvents(): List<String>

  public fun connectionNotificationArn(): String

  public fun serviceId(): String? = unwrap(this).getServiceId()

  public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  @CdkDslMarker
  public interface Builder {
    public fun connectionEvents(connectionEvents: List<String>)

    public fun connectionEvents(vararg connectionEvents: String)

    public fun connectionNotificationArn(connectionNotificationArn: String)

    public fun serviceId(serviceId: String)

    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps,
  ) : CdkObject(cdkObject), CfnVPCEndpointConnectionNotificationProps {
    override fun connectionEvents(): List<String> = unwrap(this).getConnectionEvents()

    override fun connectionNotificationArn(): String = unwrap(this).getConnectionNotificationArn()

    override fun serviceId(): String? = unwrap(this).getServiceId()

    override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnVPCEndpointConnectionNotificationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps):
        CfnVPCEndpointConnectionNotificationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointConnectionNotificationProps):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps
  }
}
