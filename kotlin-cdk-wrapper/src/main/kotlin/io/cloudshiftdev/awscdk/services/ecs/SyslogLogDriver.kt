@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class SyslogLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.SyslogLogDriver,
) : LogDriver(cdkObject) {
  public override fun bind(_scope: Construct, _containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      _containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun address(address: String)

    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun facility(facility: String)

    public fun format(format: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun tag(tag: String)

    public fun tlsCaCert(tlsCaCert: String)

    public fun tlsCert(tlsCert: String)

    public fun tlsKey(tlsKey: String)

    public fun tlsSkipVerify(tlsSkipVerify: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SyslogLogDriver.Builder =
        software.amazon.awscdk.services.ecs.SyslogLogDriver.Builder.create()

    override fun address(address: String) {
      cdkBuilder.address(address)
    }

    override fun env(env: List<String>) {
      cdkBuilder.env(env)
    }

    override fun env(vararg env: String): Unit = env(env.toList())

    override fun envRegex(envRegex: String) {
      cdkBuilder.envRegex(envRegex)
    }

    override fun facility(facility: String) {
      cdkBuilder.facility(facility)
    }

    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    override fun labels(labels: List<String>) {
      cdkBuilder.labels(labels)
    }

    override fun labels(vararg labels: String): Unit = labels(labels.toList())

    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    override fun tlsCaCert(tlsCaCert: String) {
      cdkBuilder.tlsCaCert(tlsCaCert)
    }

    override fun tlsCert(tlsCert: String) {
      cdkBuilder.tlsCert(tlsCert)
    }

    override fun tlsKey(tlsKey: String) {
      cdkBuilder.tlsKey(tlsKey)
    }

    override fun tlsSkipVerify(tlsSkipVerify: Boolean) {
      cdkBuilder.tlsSkipVerify(tlsSkipVerify)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SyslogLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SyslogLogDriver {
      val builderImpl = BuilderImpl()
      return SyslogLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SyslogLogDriver):
        SyslogLogDriver = SyslogLogDriver(cdkObject)

    internal fun unwrap(wrapped: SyslogLogDriver):
        software.amazon.awscdk.services.ecs.SyslogLogDriver = wrapped.cdkObject
  }
}
