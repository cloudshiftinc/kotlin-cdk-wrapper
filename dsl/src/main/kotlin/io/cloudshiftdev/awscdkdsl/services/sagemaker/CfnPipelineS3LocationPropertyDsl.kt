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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnPipeline

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .eTag("eTag")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html)
 */
@CdkDslMarker
public class CfnPipelineS3LocationPropertyDsl {
    private val cdkBuilder: CfnPipeline.S3LocationProperty.Builder =
        CfnPipeline.S3LocationProperty.builder()

    /** @param bucket The name of the S3 bucket where the PipelineDefinition file is stored. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param eTag The Amazon S3 ETag (a file checksum) of the PipelineDefinition file. If you don't
     *   specify a value, SageMaker skips ETag validation of your PipelineDefinition file.
     */
    public fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
    }

    /** @param key The file name of the PipelineDefinition file (Amazon S3 object name). */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param version For versioning-enabled buckets, a specific version of the PipelineDefinition
     *   file.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnPipeline.S3LocationProperty = cdkBuilder.build()
}
