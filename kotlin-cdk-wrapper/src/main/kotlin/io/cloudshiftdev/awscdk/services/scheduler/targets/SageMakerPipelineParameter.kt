@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a pipeline parameter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.scheduler.targets.*;
 * SageMakerPipelineParameter sageMakerPipelineParameter = SageMakerPipelineParameter.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 */
public interface SageMakerPipelineParameter {
  /**
   * Name of parameter to start execution of a SageMaker Model Building Pipeline.
   */
  public fun name(): String

  /**
   * Value of parameter to start execution of a SageMaker Model Building Pipeline.
   */
  public fun `value`(): String

  /**
   * A builder for [SageMakerPipelineParameter]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
     */
    public fun name(name: String)

    /**
     * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.SageMakerPipelineParameter.Builder =
        software.amazon.awscdk.services.scheduler.targets.SageMakerPipelineParameter.builder()

    /**
     * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.scheduler.targets.SageMakerPipelineParameter
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.SageMakerPipelineParameter,
  ) : CdkObject(cdkObject),
      SageMakerPipelineParameter {
    /**
     * Name of parameter to start execution of a SageMaker Model Building Pipeline.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Value of parameter to start execution of a SageMaker Model Building Pipeline.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SageMakerPipelineParameter {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.SageMakerPipelineParameter):
        SageMakerPipelineParameter = CdkObjectWrappers.wrap(cdkObject) as?
        SageMakerPipelineParameter ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SageMakerPipelineParameter):
        software.amazon.awscdk.services.scheduler.targets.SageMakerPipelineParameter = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.scheduler.targets.SageMakerPipelineParameter
  }
}
