@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FluentdLogDriverProps : BaseLogDriverProps {
  public fun address(): String? = unwrap(this).getAddress()

  public fun asyncConnect(): Boolean? = unwrap(this).getAsyncConnect()

  public fun bufferLimit(): Number? = unwrap(this).getBufferLimit()

  public fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  public fun retryWait(): Duration? = unwrap(this).getRetryWait()?.let(Duration::wrap)

  public fun subSecondPrecision(): Boolean? = unwrap(this).getSubSecondPrecision()

  @CdkDslMarker
  public interface Builder {
    public fun address(address: String)

    public fun asyncConnect(asyncConnect: Boolean)

    public fun bufferLimit(bufferLimit: Number)

    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun maxRetries(maxRetries: Number)

    public fun retryWait(retryWait: Duration)

    public fun subSecondPrecision(subSecondPrecision: Boolean)

    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FluentdLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.FluentdLogDriverProps.builder()

    override fun address(address: String) {
      cdkBuilder.address(address)
    }

    override fun asyncConnect(asyncConnect: Boolean) {
      cdkBuilder.asyncConnect(asyncConnect)
    }

    override fun bufferLimit(bufferLimit: Number) {
      cdkBuilder.bufferLimit(bufferLimit)
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

    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    override fun retryWait(retryWait: Duration) {
      cdkBuilder.retryWait(retryWait.let(Duration::unwrap))
    }

    override fun subSecondPrecision(subSecondPrecision: Boolean) {
      cdkBuilder.subSecondPrecision(subSecondPrecision)
    }

    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    public fun build(): software.amazon.awscdk.services.ecs.FluentdLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.FluentdLogDriverProps,
  ) : CdkObject(cdkObject), FluentdLogDriverProps {
    override fun address(): String? = unwrap(this).getAddress()

    override fun asyncConnect(): Boolean? = unwrap(this).getAsyncConnect()

    override fun bufferLimit(): Number? = unwrap(this).getBufferLimit()

    override fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

    override fun envRegex(): String? = unwrap(this).getEnvRegex()

    override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()

    override fun retryWait(): Duration? = unwrap(this).getRetryWait()?.let(Duration::wrap)

    override fun subSecondPrecision(): Boolean? = unwrap(this).getSubSecondPrecision()

    override fun tag(): String? = unwrap(this).getTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FluentdLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FluentdLogDriverProps):
        FluentdLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FluentdLogDriverProps):
        software.amazon.awscdk.services.ecs.FluentdLogDriverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.FluentdLogDriverProps
  }
}
