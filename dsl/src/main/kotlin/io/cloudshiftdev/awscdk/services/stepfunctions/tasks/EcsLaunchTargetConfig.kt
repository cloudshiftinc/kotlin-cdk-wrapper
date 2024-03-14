package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface EcsLaunchTargetConfig {
  /**
   * Additional parameters to pass to the base task.
   *
   * Default: - No additional parameters passed
   */
  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * A builder for [EcsLaunchTargetConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameters Additional parameters to pass to the base task.
     */
    public fun parameters(parameters: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig.builder()

    /**
     * @param parameters Additional parameters to pass to the base task.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig,
  ) : EcsLaunchTargetConfig {
    /**
     * Additional parameters to pass to the base task.
     *
     * Default: - No additional parameters passed
     */
    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EcsLaunchTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig):
        EcsLaunchTargetConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsLaunchTargetConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig = (wrapped as
        Wrapper).cdkObject
  }
}
