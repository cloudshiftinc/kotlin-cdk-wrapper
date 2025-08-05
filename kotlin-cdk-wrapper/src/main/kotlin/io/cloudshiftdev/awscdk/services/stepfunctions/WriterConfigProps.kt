@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Interface for Writer Config props.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * WriterConfigProps writerConfigProps = WriterConfigProps.builder()
 * .outputType(OutputType.JSON)
 * .transformation(Transformation.NONE)
 * .build();
 * ```
 */
public interface WriterConfigProps {
  /**
   * The format of the Output of the child workflow executions.
   */
  public fun outputType(): OutputType

  /**
   * The transformation to be applied to the Output of the Child Workflow executions.
   */
  public fun transformation(): Transformation

  /**
   * A builder for [WriterConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param outputType The format of the Output of the child workflow executions. 
     */
    public fun outputType(outputType: OutputType)

    /**
     * @param transformation The transformation to be applied to the Output of the Child Workflow
     * executions. 
     */
    public fun transformation(transformation: Transformation)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.WriterConfigProps.Builder
        = software.amazon.awscdk.services.stepfunctions.WriterConfigProps.builder()

    /**
     * @param outputType The format of the Output of the child workflow executions. 
     */
    override fun outputType(outputType: OutputType) {
      cdkBuilder.outputType(outputType.let(OutputType.Companion::unwrap))
    }

    /**
     * @param transformation The transformation to be applied to the Output of the Child Workflow
     * executions. 
     */
    override fun transformation(transformation: Transformation) {
      cdkBuilder.transformation(transformation.let(Transformation.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.WriterConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.WriterConfigProps,
  ) : CdkObject(cdkObject),
      WriterConfigProps {
    /**
     * The format of the Output of the child workflow executions.
     */
    override fun outputType(): OutputType = unwrap(this).getOutputType().let(OutputType::wrap)

    /**
     * The transformation to be applied to the Output of the Child Workflow executions.
     */
    override fun transformation(): Transformation =
        unwrap(this).getTransformation().let(Transformation::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WriterConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.WriterConfigProps):
        WriterConfigProps = CdkObjectWrappers.wrap(cdkObject) as? WriterConfigProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: WriterConfigProps):
        software.amazon.awscdk.services.stepfunctions.WriterConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.WriterConfigProps
  }
}
