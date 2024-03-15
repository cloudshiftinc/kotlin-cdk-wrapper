@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit

public interface ActionConfig {
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.ActionConfig.Builder =
        software.amazon.awscdk.services.codepipeline.ActionConfig.builder()

    override fun configuration(configuration: Any) {
      cdkBuilder.configuration(configuration)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.ActionConfig,
  ) : CdkObject(cdkObject), ActionConfig {
    override fun configuration(): Any? = unwrap(this).getConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionConfig):
        ActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionConfig):
        software.amazon.awscdk.services.codepipeline.ActionConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codepipeline.ActionConfig
  }
}
