@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface BaseLogDriverProps {
  public fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

  public fun envRegex(): String? = unwrap(this).getEnvRegex()

  public fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

  public fun tag(): String? = unwrap(this).getTag()

  @CdkDslMarker
  public interface Builder {
    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BaseLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.BaseLogDriverProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ecs.BaseLogDriverProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.BaseLogDriverProps,
  ) : CdkObject(cdkObject), BaseLogDriverProps {
    override fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

    override fun envRegex(): String? = unwrap(this).getEnvRegex()

    override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    override fun tag(): String? = unwrap(this).getTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BaseLogDriverProps):
        BaseLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseLogDriverProps):
        software.amazon.awscdk.services.ecs.BaseLogDriverProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.BaseLogDriverProps
  }
}
