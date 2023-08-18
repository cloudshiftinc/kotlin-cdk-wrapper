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
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith
import software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput

/**
 * S3 location where you want Amazon SageMaker to save the results from the transform job.
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
public class TransformOutputDsl {
    private val cdkBuilder: TransformOutput.Builder = TransformOutput.builder()

    /** @param accept MIME type used to specify the output data. */
    public fun accept(accept: String) {
        cdkBuilder.accept(accept)
    }

    /**
     * @param assembleWith Defines how to assemble the results of the transform job as a single S3
     *   object.
     */
    public fun assembleWith(assembleWith: AssembleWith) {
        cdkBuilder.assembleWith(assembleWith)
    }

    /**
     * @param encryptionKey AWS KMS key that Amazon SageMaker uses to encrypt the model artifacts at
     *   rest using Amazon S3 server-side encryption.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param s3OutputPath S3 path where you want Amazon SageMaker to store the results of the
     *   transform job.
     */
    public fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
    }

    public fun build(): TransformOutput = cdkBuilder.build()
}
