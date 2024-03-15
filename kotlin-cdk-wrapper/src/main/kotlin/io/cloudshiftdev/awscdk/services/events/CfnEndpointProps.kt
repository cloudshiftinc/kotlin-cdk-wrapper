@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEndpointProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun eventBuses(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun replicationConfig(): Any? = unwrap(this).getReplicationConfig()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun routingConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun eventBuses(eventBuses: IResolvable)

    public fun eventBuses(eventBuses: List<Any>)

    public fun eventBuses(vararg eventBuses: Any)

    public fun name(name: String)

    public fun replicationConfig(replicationConfig: IResolvable)

    public fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fa351b7c019bc3e7c126243278aa13713c2b4c485c414a3586f5d73b4a79371")
    public
        fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun routingConfig(routingConfig: IResolvable)

    public fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e415056e0d0613e9acaa9f8469885a733c09738b15fe55931dd1df0efdaebce1")
    public fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEndpointProps.Builder =
        software.amazon.awscdk.services.events.CfnEndpointProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventBuses(eventBuses: IResolvable) {
      cdkBuilder.eventBuses(eventBuses.let(IResolvable::unwrap))
    }

    override fun eventBuses(eventBuses: List<Any>) {
      cdkBuilder.eventBuses(eventBuses)
    }

    override fun eventBuses(vararg eventBuses: Any): Unit = eventBuses(eventBuses.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun replicationConfig(replicationConfig: IResolvable) {
      cdkBuilder.replicationConfig(replicationConfig.let(IResolvable::unwrap))
    }

    override fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty) {
      cdkBuilder.replicationConfig(replicationConfig.let(CfnEndpoint.ReplicationConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fa351b7c019bc3e7c126243278aa13713c2b4c485c414a3586f5d73b4a79371")
    override
        fun replicationConfig(replicationConfig: CfnEndpoint.ReplicationConfigProperty.Builder.() -> Unit):
        Unit = replicationConfig(CfnEndpoint.ReplicationConfigProperty(replicationConfig))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun routingConfig(routingConfig: IResolvable) {
      cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
    }

    override fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty) {
      cdkBuilder.routingConfig(routingConfig.let(CfnEndpoint.RoutingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e415056e0d0613e9acaa9f8469885a733c09738b15fe55931dd1df0efdaebce1")
    override fun routingConfig(routingConfig: CfnEndpoint.RoutingConfigProperty.Builder.() -> Unit):
        Unit = routingConfig(CfnEndpoint.RoutingConfigProperty(routingConfig))

    public fun build(): software.amazon.awscdk.services.events.CfnEndpointProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.CfnEndpointProps,
  ) : CdkObject(cdkObject), CfnEndpointProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun eventBuses(): Any = unwrap(this).getEventBuses()

    override fun name(): String? = unwrap(this).getName()

    override fun replicationConfig(): Any? = unwrap(this).getReplicationConfig()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun routingConfig(): Any = unwrap(this).getRoutingConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpointProps):
        CfnEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointProps):
        software.amazon.awscdk.services.events.CfnEndpointProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.CfnEndpointProps
  }
}
