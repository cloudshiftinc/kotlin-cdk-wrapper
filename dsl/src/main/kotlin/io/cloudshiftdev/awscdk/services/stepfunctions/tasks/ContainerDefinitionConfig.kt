package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ContainerDefinitionConfig {
  /**
   * Additional parameters to pass to the base task.
   *
   * Default: - No additional parameters passed
   */
  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * A builder for [ContainerDefinitionConfig]
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
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig.builder()

    /**
     * @param parameters Additional parameters to pass to the base task.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig,
  ) : ContainerDefinitionConfig {
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

    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig):
        ContainerDefinitionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerDefinitionConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig = (wrapped as
        Wrapper).cdkObject
  }
}
