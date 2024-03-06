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
 * The location of the pipeline definition stored in Amazon S3.
 *
 * If specified, SageMaker will retrieve the pipeline definition from this location.
 *
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

    /** @param bucket The name of the S3 bucket. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param eTag A file checksum of the pipeline definition file. */
    public fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
    }

    /**
     * @param key The object key (or key name) which uniquely identifies the object in an S3 bucket.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param version The version ID of the pipeline definition file. If not specified, Amazon
     *   SageMaker will retrieve the latest version.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnPipeline.S3LocationProperty = cdkBuilder.build()
}
