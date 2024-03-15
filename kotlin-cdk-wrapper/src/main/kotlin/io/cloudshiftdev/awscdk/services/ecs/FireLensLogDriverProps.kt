@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface FireLensLogDriverProps : BaseLogDriverProps {
  public fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

  public fun secretOptions(): Map<String, Secret> =
      unwrap(this).getSecretOptions()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun options(options: Map<String, String>)

    public fun secretOptions(secretOptions: Map<String, Secret>)

    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FireLensLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.FireLensLogDriverProps.builder()

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

    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    override fun secretOptions(secretOptions: Map<String, Secret>) {
      cdkBuilder.secretOptions(secretOptions.mapValues{Secret.unwrap(it.value)})
    }

    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    public fun build(): software.amazon.awscdk.services.ecs.FireLensLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.FireLensLogDriverProps,
  ) : CdkObject(cdkObject), FireLensLogDriverProps {
    override fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

    override fun envRegex(): String? = unwrap(this).getEnvRegex()

    override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    override fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

    override fun secretOptions(): Map<String, Secret> =
        unwrap(this).getSecretOptions()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    override fun tag(): String? = unwrap(this).getTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FireLensLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FireLensLogDriverProps):
        FireLensLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FireLensLogDriverProps):
        software.amazon.awscdk.services.ecs.FireLensLogDriverProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.FireLensLogDriverProps
  }
}
