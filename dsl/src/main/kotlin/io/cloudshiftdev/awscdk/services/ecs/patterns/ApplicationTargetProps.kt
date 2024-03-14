package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.ecs.Protocol
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ApplicationTargetProps {
  public fun containerPort(): Number

  public fun hostHeader(): String? = unwrap(this).getHostHeader()

  public fun listener(): String? = unwrap(this).getListener()

  public fun pathPattern(): String? = unwrap(this).getPathPattern()

  public fun priority(): Number? = unwrap(this).getPriority()

  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  public interface Builder {
    public fun containerPort(containerPort: Number) {
    }

    public fun hostHeader(hostHeader: String) {
    }

    public fun listener(listener: String) {
    }

    public fun pathPattern(pathPattern: String) {
    }

    public fun priority(priority: Number) {
    }

    public fun protocol(protocol: Protocol) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps.builder()

    public override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    public override fun hostHeader(hostHeader: String) {
      cdkBuilder.hostHeader(hostHeader)
    }

    public override fun listener(listener: String) {
      cdkBuilder.listener(listener)
    }

    public override fun pathPattern(pathPattern: String) {
      cdkBuilder.pathPattern(pathPattern)
    }

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps,
  ) : ApplicationTargetProps {
    public override fun containerPort(): Number = unwrap(this).getContainerPort()

    public override fun hostHeader(): String? = unwrap(this).getHostHeader()

    public override fun listener(): String? = unwrap(this).getListener()

    public override fun pathPattern(): String? = unwrap(this).getPathPattern()

    public override fun priority(): Number? = unwrap(this).getPriority()

    public override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps):
        ApplicationTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationTargetProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps = (wrapped as
        Wrapper).cdkObject
  }
}
