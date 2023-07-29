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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.TransformResources

/**
 * ML compute instances for the transform job.
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
public class TransformResourcesDsl {
    private val cdkBuilder: TransformResources.Builder = TransformResources.builder()

    /** @param instanceCount Number of ML compute instances to use in the transform job. */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /** @param instanceType ML compute instance type for the transform job. */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param volumeEncryptionKey AWS KMS key that Amazon SageMaker uses to encrypt data on the
     *   storage volume attached to the ML compute instance(s).
     */
    public fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
        cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
    }

    public fun build(): TransformResources = cdkBuilder.build()
}
