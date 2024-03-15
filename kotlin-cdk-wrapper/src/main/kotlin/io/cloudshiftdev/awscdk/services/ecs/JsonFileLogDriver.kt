@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class JsonFileLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.JsonFileLogDriver,
) : LogDriver(cdkObject) {
  public override fun bind(_scope: Construct, _containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      _containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun compress(compress: Boolean)

    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun maxFile(maxFile: Number)

    public fun maxSize(maxSize: String)

    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.JsonFileLogDriver.Builder =
        software.amazon.awscdk.services.ecs.JsonFileLogDriver.Builder.create()

    override fun compress(compress: Boolean) {
      cdkBuilder.compress(compress)
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

    override fun maxFile(maxFile: Number) {
      cdkBuilder.maxFile(maxFile)
    }

    override fun maxSize(maxSize: String) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    public fun build(): software.amazon.awscdk.services.ecs.JsonFileLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonFileLogDriver {
      val builderImpl = BuilderImpl()
      return JsonFileLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.JsonFileLogDriver):
        JsonFileLogDriver = JsonFileLogDriver(cdkObject)

    internal fun unwrap(wrapped: JsonFileLogDriver):
        software.amazon.awscdk.services.ecs.JsonFileLogDriver = wrapped.cdkObject
  }
}
