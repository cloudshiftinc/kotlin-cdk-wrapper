@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions

/**
 * Configures the timeout and maximum number of retries for processing a transform job invocation.
 *
 * Example:
 * ```
 * SageMakerCreateTransformJob.Builder.create(this, "Batch Inference")
 * .transformJobName("MyTransformJob")
 * .modelName("MyModelName")
 * .modelClientOptions(ModelClientOptions.builder()
 * .invocationsMaxRetries(3) // default is 0
 * .invocationsTimeout(Duration.minutes(5))
 * .build())
 * .transformInput(TransformInput.builder()
 * .transformDataSource(TransformDataSource.builder()
 * .s3DataSource(TransformS3DataSource.builder()
 * .s3Uri("s3://inputbucket/train")
 * .s3DataType(S3DataType.S3_PREFIX)
 * .build())
 * .build())
 * .build())
 * .transformOutput(TransformOutput.builder()
 * .s3OutputPath("s3://outputbucket/TransformJobOutputPath")
 * .build())
 * .transformResources(TransformResources.builder()
 * .instanceCount(1)
 * .instanceType(InstanceType.of(InstanceClass.M4, InstanceSize.XLARGE))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ModelClientOptionsDsl {
    private val cdkBuilder: ModelClientOptions.Builder = ModelClientOptions.builder()

    /**
     * @param invocationsMaxRetries The maximum number of retries when invocation requests are
     *   failing.
     */
    public fun invocationsMaxRetries(invocationsMaxRetries: Number) {
        cdkBuilder.invocationsMaxRetries(invocationsMaxRetries)
    }

    /** @param invocationsTimeout The timeout duration for an invocation request. */
    public fun invocationsTimeout(invocationsTimeout: Duration) {
        cdkBuilder.invocationsTimeout(invocationsTimeout)
    }

    public fun build(): ModelClientOptions = cdkBuilder.build()
}
