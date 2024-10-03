@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * Object configuration;
 * ActionConfig actionConfig = ActionConfig.builder()
 * .configuration(configuration)
 * .build();
 * ```
 */
public interface ActionConfig {
  /**
   *
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * A builder for [ActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration the value to be set.
     */
    public fun configuration(configuration: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.ActionConfig.Builder =
        software.amazon.awscdk.services.codepipeline.ActionConfig.builder()

    /**
     * @param configuration the value to be set.
     */
    override fun configuration(configuration: Any) {
      cdkBuilder.configuration(configuration)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.ActionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.ActionConfig,
  ) : CdkObject(cdkObject),
      ActionConfig {
    /**
     *
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionConfig):
        ActionConfig = CdkObjectWrappers.wrap(cdkObject) as? ActionConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionConfig):
        software.amazon.awscdk.services.codepipeline.ActionConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codepipeline.ActionConfig
  }
}
