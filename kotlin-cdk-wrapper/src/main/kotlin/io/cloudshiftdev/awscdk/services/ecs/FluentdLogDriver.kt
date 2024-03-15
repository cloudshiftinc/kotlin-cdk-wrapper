@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class FluentdLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.FluentdLogDriver,
) : LogDriver(cdkObject) {
  public override fun bind(_scope: Construct, _containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      _containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FluentdLogDriver.Builder =
        software.amazon.awscdk.services.ecs.FluentdLogDriver.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.ecs.FluentdLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FluentdLogDriver {
      val builderImpl = BuilderImpl()
      return FluentdLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FluentdLogDriver):
        FluentdLogDriver = FluentdLogDriver(cdkObject)

    internal fun unwrap(wrapped: FluentdLogDriver):
        software.amazon.awscdk.services.ecs.FluentdLogDriver = wrapped.cdkObject
  }
}
