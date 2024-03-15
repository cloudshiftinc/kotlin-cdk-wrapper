@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface GelfLogDriverProps : BaseLogDriverProps {
  public fun address(): String

  public fun compressionLevel(): Number? = unwrap(this).getCompressionLevel()

  public fun compressionType(): GelfCompressionType? =
      unwrap(this).getCompressionType()?.let(GelfCompressionType::wrap)

  public fun tcpMaxReconnect(): Number? = unwrap(this).getTcpMaxReconnect()

  public fun tcpReconnectDelay(): Duration? =
      unwrap(this).getTcpReconnectDelay()?.let(Duration::wrap)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.GelfLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.GelfLogDriverProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ecs.GelfLogDriverProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.GelfLogDriverProps,
  ) : CdkObject(cdkObject), GelfLogDriverProps {
    override fun address(): String = unwrap(this).getAddress()

    override fun compressionLevel(): Number? = unwrap(this).getCompressionLevel()

    override fun compressionType(): GelfCompressionType? =
        unwrap(this).getCompressionType()?.let(GelfCompressionType::wrap)

    override fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

    override fun envRegex(): String? = unwrap(this).getEnvRegex()

    override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    override fun tag(): String? = unwrap(this).getTag()

    override fun tcpMaxReconnect(): Number? = unwrap(this).getTcpMaxReconnect()

    override fun tcpReconnectDelay(): Duration? =
        unwrap(this).getTcpReconnectDelay()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GelfLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GelfLogDriverProps):
        GelfLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GelfLogDriverProps):
        software.amazon.awscdk.services.ecs.GelfLogDriverProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.GelfLogDriverProps
  }
}
