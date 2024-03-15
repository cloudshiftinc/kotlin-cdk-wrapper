@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class GelfLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.GelfLogDriver,
) : LogDriver(cdkObject) {
  public override fun bind(_scope: Construct, _containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      _containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun address(address: String)

    public fun compressionLevel(compressionLevel: Number)

    public fun compressionType(compressionType: GelfCompressionType)

    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun tag(tag: String)

    public fun tcpMaxReconnect(tcpMaxReconnect: Number)

    public fun tcpReconnectDelay(tcpReconnectDelay: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.GelfLogDriver.Builder =
        software.amazon.awscdk.services.ecs.GelfLogDriver.Builder.create()

    override fun address(address: String) {
      cdkBuilder.address(address)
    }

    override fun compressionLevel(compressionLevel: Number) {
      cdkBuilder.compressionLevel(compressionLevel)
    }

    override fun compressionType(compressionType: GelfCompressionType) {
      cdkBuilder.compressionType(compressionType.let(GelfCompressionType::unwrap))
    }

    override fun env(env: List<String>) {
      cdkBuilder.env(env)
    }

    override fun env(vararg env: String): Unit = env(env.toList())

    override fun envRegex(envRegex: String) {
      cdkBuilder.envRegex(envRegex)
    }

    override fun labels(labels: List<String>) {
      cdkBuilder.labels(labels)
    }

    override fun labels(vararg labels: String): Unit = labels(labels.toList())

    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    override fun tcpMaxReconnect(tcpMaxReconnect: Number) {
      cdkBuilder.tcpMaxReconnect(tcpMaxReconnect)
    }

    override fun tcpReconnectDelay(tcpReconnectDelay: Duration) {
      cdkBuilder.tcpReconnectDelay(tcpReconnectDelay.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.GelfLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GelfLogDriver {
      val builderImpl = BuilderImpl()
      return GelfLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GelfLogDriver): GelfLogDriver =
        GelfLogDriver(cdkObject)

    internal fun unwrap(wrapped: GelfLogDriver): software.amazon.awscdk.services.ecs.GelfLogDriver =
        wrapped.cdkObject
  }
}
