package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.ActionConfig,
  ) : ActionConfig {
    /**
     *
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionConfig):
        ActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActionConfig):
        software.amazon.awscdk.services.codepipeline.ActionConfig = (wrapped as Wrapper).cdkObject
  }
}
