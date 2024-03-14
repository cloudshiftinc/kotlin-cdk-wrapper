package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.CfnEndpoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrEndpointId(): String = unwrap(this).getAttrEndpointId()

  public open fun attrEndpointUrl(): String = unwrap(this).getAttrEndpointUrl()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrStateReason(): String = unwrap(this).getAttrStateReason()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun eventBuses(): Any = unwrap(this).getEventBuses()

  public open fun eventBuses(`value`: IResolvable) {
    unwrap(this).setEventBuses(`value`.let(IResolvable::unwrap))
  }

  public open fun eventBuses(__idx_ac66f0: List<Any>) {
    unwrap(this).setEventBuses(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun replicationConfig(): Any? = unwrap(this).getReplicationConfig()

  public open fun replicationConfig(`value`: IResolvable) {
    unwrap(this).setReplicationConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationConfig(`value`: ReplicationConfigProperty) {
    unwrap(this).setReplicationConfig(`value`.let(ReplicationConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb179bb413e7502bfecb694cd445f0eea606b383ed87bbf3f6df0b8e4e28b62f")
  public open fun replicationConfig(`value`: ReplicationConfigProperty.Builder.() -> Unit): Unit =
      replicationConfig(ReplicationConfigProperty(`value`))

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun routingConfig(): Any = unwrap(this).getRoutingConfig()

  public open fun routingConfig(`value`: IResolvable) {
    unwrap(this).setRoutingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun routingConfig(`value`: RoutingConfigProperty) {
    unwrap(this).setRoutingConfig(`value`.let(RoutingConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("018e5d0a7fc0c3ea68061bda3bed3517c5cfadb6b6d79d23fd4f3c688698d42c")
  public open fun routingConfig(`value`: RoutingConfigProperty.Builder.() -> Unit): Unit =
      routingConfig(RoutingConfigProperty(`value`))

  public interface Builder {
    public fun description(description: String) {
    }

    public fun eventBuses(eventBuses: IResolvable) {
    }

    public fun eventBuses(eventBuses: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun replicationConfig(replicationConfig: IResolvable) {
    }

    public fun replicationConfig(replicationConfig: ReplicationConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9fbd3c3749022dff789ce44ab31bef0639788cee39515b62e26328cf9cca128")
    public fun replicationConfig(replicationConfig: ReplicationConfigProperty.Builder.() -> Unit) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun routingConfig(routingConfig: IResolvable) {
    }

    public fun routingConfig(routingConfig: RoutingConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34380cb8c43c8004bcf1af22bf8bc416de468b6de50c36decd7bd5cf34e72171")
    public fun routingConfig(routingConfig: RoutingConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnEndpoint.Builder =
        software.amazon.awscdk.services.events.CfnEndpoint.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun eventBuses(eventBuses: IResolvable) {
      cdkBuilder.eventBuses(eventBuses.let(IResolvable::unwrap))
    }

    public override fun eventBuses(eventBuses: List<Any>) {
      cdkBuilder.eventBuses(eventBuses)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun replicationConfig(replicationConfig: IResolvable) {
      cdkBuilder.replicationConfig(replicationConfig.let(IResolvable::unwrap))
    }

    public override fun replicationConfig(replicationConfig: ReplicationConfigProperty) {
      cdkBuilder.replicationConfig(replicationConfig.let(ReplicationConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9fbd3c3749022dff789ce44ab31bef0639788cee39515b62e26328cf9cca128")
    public override
        fun replicationConfig(replicationConfig: ReplicationConfigProperty.Builder.() -> Unit): Unit
        = replicationConfig(ReplicationConfigProperty(replicationConfig))

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun routingConfig(routingConfig: IResolvable) {
      cdkBuilder.routingConfig(routingConfig.let(IResolvable::unwrap))
    }

    public override fun routingConfig(routingConfig: RoutingConfigProperty) {
      cdkBuilder.routingConfig(routingConfig.let(RoutingConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34380cb8c43c8004bcf1af22bf8bc416de468b6de50c36decd7bd5cf34e72171")
    public override fun routingConfig(routingConfig: RoutingConfigProperty.Builder.() -> Unit): Unit
        = routingConfig(RoutingConfigProperty(routingConfig))

    public fun build(): software.amazon.awscdk.services.events.CfnEndpoint = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint): CfnEndpoint =
        CfnEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnEndpoint): software.amazon.awscdk.services.events.CfnEndpoint =
        wrapped.cdkObject
  }

  public interface SecondaryProperty {
    public fun route(): String

    public interface Builder {
      public fun route(route: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty.builder()

      public override fun route(route: String) {
        cdkBuilder.route(route)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty,
    ) : SecondaryProperty {
      public override fun route(): String = unwrap(this).getRoute()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecondaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty):
          SecondaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecondaryProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.SecondaryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RoutingConfigProperty {
    public fun failoverConfig(): Any

    public interface Builder {
      public fun failoverConfig(failoverConfig: IResolvable) {
      }

      public fun failoverConfig(failoverConfig: FailoverConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c201bc9a8b40ad793a154eff923fe9e833d8422279f2fa895ef34d06ea5b98")
      public fun failoverConfig(failoverConfig: FailoverConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty.builder()

      public override fun failoverConfig(failoverConfig: IResolvable) {
        cdkBuilder.failoverConfig(failoverConfig.let(IResolvable::unwrap))
      }

      public override fun failoverConfig(failoverConfig: FailoverConfigProperty) {
        cdkBuilder.failoverConfig(failoverConfig.let(FailoverConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39c201bc9a8b40ad793a154eff923fe9e833d8422279f2fa895ef34d06ea5b98")
      public override fun failoverConfig(failoverConfig: FailoverConfigProperty.Builder.() -> Unit):
          Unit = failoverConfig(FailoverConfigProperty(failoverConfig))

      public fun build(): software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty,
    ) : RoutingConfigProperty {
      public override fun failoverConfig(): Any = unwrap(this).getFailoverConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty):
          RoutingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingConfigProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.RoutingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FailoverConfigProperty {
    public fun primary(): Any

    public fun secondary(): Any

    public interface Builder {
      public fun primary(primary: IResolvable) {
      }

      public fun primary(primary: PrimaryProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a62d771df973cb5a72c7e270f89dc23414aeb08f5fc9e9937444f26f565b90c")
      public fun primary(primary: PrimaryProperty.Builder.() -> Unit) {
      }

      public fun secondary(secondary: IResolvable) {
      }

      public fun secondary(secondary: SecondaryProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fff17fb41c63512ded3ee3d510421c5944b3c4000dda52c8ec07e507182c8de1")
      public fun secondary(secondary: SecondaryProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty.builder()

      public override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      public override fun primary(primary: PrimaryProperty) {
        cdkBuilder.primary(primary.let(PrimaryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a62d771df973cb5a72c7e270f89dc23414aeb08f5fc9e9937444f26f565b90c")
      public override fun primary(primary: PrimaryProperty.Builder.() -> Unit): Unit =
          primary(PrimaryProperty(primary))

      public override fun secondary(secondary: IResolvable) {
        cdkBuilder.secondary(secondary.let(IResolvable::unwrap))
      }

      public override fun secondary(secondary: SecondaryProperty) {
        cdkBuilder.secondary(secondary.let(SecondaryProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fff17fb41c63512ded3ee3d510421c5944b3c4000dda52c8ec07e507182c8de1")
      public override fun secondary(secondary: SecondaryProperty.Builder.() -> Unit): Unit =
          secondary(SecondaryProperty(secondary))

      public fun build(): software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty,
    ) : FailoverConfigProperty {
      public override fun primary(): Any = unwrap(this).getPrimary()

      public override fun secondary(): Any = unwrap(this).getSecondary()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty):
          FailoverConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConfigProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.FailoverConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ReplicationConfigProperty {
    public fun state(): String

    public interface Builder {
      public fun state(state: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty.builder()

      public override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty,
    ) : ReplicationConfigProperty {
      public override fun state(): String = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty):
          ReplicationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationConfigProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.ReplicationConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EndpointEventBusProperty {
    public fun eventBusArn(): String

    public interface Builder {
      public fun eventBusArn(eventBusArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty.builder()

      public override fun eventBusArn(eventBusArn: String) {
        cdkBuilder.eventBusArn(eventBusArn)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty,
    ) : EndpointEventBusProperty {
      public override fun eventBusArn(): String = unwrap(this).getEventBusArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointEventBusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty):
          EndpointEventBusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointEventBusProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.EndpointEventBusProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PrimaryProperty {
    public fun healthCheck(): String

    public interface Builder {
      public fun healthCheck(healthCheck: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty.Builder =
          software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty.builder()

      public override fun healthCheck(healthCheck: String) {
        cdkBuilder.healthCheck(healthCheck)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty,
    ) : PrimaryProperty {
      public override fun healthCheck(): String = unwrap(this).getHealthCheck()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrimaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty):
          PrimaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrimaryProperty):
          software.amazon.awscdk.services.events.CfnEndpoint.PrimaryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
