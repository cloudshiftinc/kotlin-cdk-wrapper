@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public open class GenericLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.GenericLogDriver,
) : LogDriver(cdkObject) {
  public override fun bind(_scope: Construct, _containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      _containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun logDriver(logDriver: String)

    public fun options(options: Map<String, String>)

    public fun secretOptions(secretOptions: Map<String, Secret>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.GenericLogDriver.Builder =
        software.amazon.awscdk.services.ecs.GenericLogDriver.Builder.create()

    override fun logDriver(logDriver: String) {
      cdkBuilder.logDriver(logDriver)
    }

    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    override fun secretOptions(secretOptions: Map<String, Secret>) {
      cdkBuilder.secretOptions(secretOptions.mapValues{Secret.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ecs.GenericLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GenericLogDriver {
      val builderImpl = BuilderImpl()
      return GenericLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GenericLogDriver):
        GenericLogDriver = GenericLogDriver(cdkObject)

    internal fun unwrap(wrapped: GenericLogDriver):
        software.amazon.awscdk.services.ecs.GenericLogDriver = wrapped.cdkObject
  }
}
