@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface GenericLogDriverProps {
  public fun logDriver(): String

  public fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

  public fun secretOptions(): Map<String, Secret> =
      unwrap(this).getSecretOptions()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun logDriver(logDriver: String)

    public fun options(options: Map<String, String>)

    public fun secretOptions(secretOptions: Map<String, Secret>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.GenericLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.GenericLogDriverProps.builder()

    override fun logDriver(logDriver: String) {
      cdkBuilder.logDriver(logDriver)
    }

    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    override fun secretOptions(secretOptions: Map<String, Secret>) {
      cdkBuilder.secretOptions(secretOptions.mapValues{Secret.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ecs.GenericLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.GenericLogDriverProps,
  ) : CdkObject(cdkObject), GenericLogDriverProps {
    override fun logDriver(): String = unwrap(this).getLogDriver()

    override fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

    override fun secretOptions(): Map<String, Secret> =
        unwrap(this).getSecretOptions()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GenericLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GenericLogDriverProps):
        GenericLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GenericLogDriverProps):
        software.amazon.awscdk.services.ecs.GenericLogDriverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.GenericLogDriverProps
  }
}
