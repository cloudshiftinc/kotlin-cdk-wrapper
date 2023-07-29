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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

/**
 * The Amazon Simple Storage (Amazon S3) location and and security configuration for `OfflineStore`
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * S3StorageConfigProperty s3StorageConfigProperty = S3StorageConfigProperty.builder()
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-featuregroup-s3storageconfig.html)
 */
@CdkDslMarker
public class CfnFeatureGroupS3StorageConfigPropertyDsl {
    private val cdkBuilder: CfnFeatureGroup.S3StorageConfigProperty.Builder =
        CfnFeatureGroup.S3StorageConfigProperty.builder()

    /**
     * @param kmsKeyId The AWS Key Management Service (KMS) key ARN of the key used to encrypt any
     *   objects written into the `OfflineStore` S3 location. The IAM `roleARN` that is passed as a
     *   parameter to `CreateFeatureGroup` must have below permissions to the `KmsKeyId` :
     * * `"kms:GenerateDataKey"`
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param s3Uri The S3 URI, or location in Amazon S3, of `OfflineStore` . S3 URIs have a format
     *   similar to the following: `s3://example-bucket/prefix/` .
     */
    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnFeatureGroup.S3StorageConfigProperty = cdkBuilder.build()
}
