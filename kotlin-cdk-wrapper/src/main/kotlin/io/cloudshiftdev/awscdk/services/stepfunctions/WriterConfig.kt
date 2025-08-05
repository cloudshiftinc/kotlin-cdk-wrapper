@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Configuration to format the output.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * // create a bucket
 * Bucket bucket = new Bucket(this, "Bucket");
 * // create a WriterConfig
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
 * .resultWriterV2(ResultWriterV2.Builder.create()
 * .bucket(bucket)
 * .prefix("my-prefix")
 * .writerConfig(Map.of(
 * "outputType", OutputType.JSONL,
 * "transformation", Transformation.NONE))
 * .build())
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass State"));
 * ```
 */
public open class WriterConfig(
  cdkObject: software.amazon.awscdk.services.stepfunctions.WriterConfig,
) : CdkObject(cdkObject) {
  public constructor(props: WriterConfigProps) :
      this(software.amazon.awscdk.services.stepfunctions.WriterConfig(props.let(WriterConfigProps.Companion::unwrap))
  )

  public constructor(props: WriterConfigProps.Builder.() -> Unit) : this(WriterConfigProps(props)
  )

  /**
   * The format of the Output of the child workflow executions.
   */
  public open fun outputType(): OutputType = unwrap(this).getOutputType().let(OutputType::wrap)

  /**
   * The transformation to be applied to the Output of the Child Workflow executions.
   */
  public open fun transformation(): Transformation =
      unwrap(this).getTransformation().let(Transformation::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.WriterConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The format of the Output of the child workflow executions.
     *
     * @param outputType The format of the Output of the child workflow executions. 
     */
    public fun outputType(outputType: OutputType)

    /**
     * The transformation to be applied to the Output of the Child Workflow executions.
     *
     * @param transformation The transformation to be applied to the Output of the Child Workflow
     * executions. 
     */
    public fun transformation(transformation: Transformation)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.WriterConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.WriterConfig.Builder.create()

    /**
     * The format of the Output of the child workflow executions.
     *
     * @param outputType The format of the Output of the child workflow executions. 
     */
    override fun outputType(outputType: OutputType) {
      cdkBuilder.outputType(outputType.let(OutputType.Companion::unwrap))
    }

    /**
     * The transformation to be applied to the Output of the Child Workflow executions.
     *
     * @param transformation The transformation to be applied to the Output of the Child Workflow
     * executions. 
     */
    override fun transformation(transformation: Transformation) {
      cdkBuilder.transformation(transformation.let(Transformation.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.WriterConfig =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WriterConfig {
      val builderImpl = BuilderImpl()
      return WriterConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.WriterConfig):
        WriterConfig = WriterConfig(cdkObject)

    internal fun unwrap(wrapped: WriterConfig):
        software.amazon.awscdk.services.stepfunctions.WriterConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.WriterConfig
  }
}
