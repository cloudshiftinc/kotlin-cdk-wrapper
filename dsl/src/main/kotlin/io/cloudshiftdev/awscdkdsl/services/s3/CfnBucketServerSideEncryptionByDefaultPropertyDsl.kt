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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Describes the default server-side encryption to apply to new objects in the bucket.
 *
 * If a PUT Object request doesn't specify any server-side encryption, this default encryption will
 * be applied. If you don't specify a customer managed key at configuration, Amazon S3 automatically
 * creates an AWS KMS key in your AWS account the first time that you add an object encrypted with
 * SSE-KMS to a bucket. By default, Amazon S3 uses this KMS key for SSE-KMS. For more information,
 * see
 * [PUT Bucket encryption](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html)
 * in the *Amazon S3 API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ServerSideEncryptionByDefaultProperty serverSideEncryptionByDefaultProperty =
 * ServerSideEncryptionByDefaultProperty.builder()
 * .sseAlgorithm("sseAlgorithm")
 * // the properties below are optional
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html)
 */
@CdkDslMarker
public class CfnBucketServerSideEncryptionByDefaultPropertyDsl {
    private val cdkBuilder: CfnBucket.ServerSideEncryptionByDefaultProperty.Builder =
        CfnBucket.ServerSideEncryptionByDefaultProperty.builder()

    /**
     * @param kmsMasterKeyId KMS key ID to use for the default encryption. This parameter is allowed
     *   if SSEAlgorithm is aws:kms. You can specify the key ID, key alias, or the Amazon Resource
     *   Name (ARN) of the CMK. However, if you are using encryption with cross-account operations,
     *   you must use a fully qualified CMK ARN. For more information, see
     *   [Using encryption for cross-account operations](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy)
     *   .
     *
     * For example:
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     *
     * Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information,
     * see
     * [Using Symmetric and Asymmetric Keys](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html)
     * in the *AWS Key Management Service Developer Guide* .
     */
    public fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    /** @param sseAlgorithm Server-side encryption algorithm to use for the default encryption. */
    public fun sseAlgorithm(sseAlgorithm: String) {
        cdkBuilder.sseAlgorithm(sseAlgorithm)
    }

    public fun build(): CfnBucket.ServerSideEncryptionByDefaultProperty = cdkBuilder.build()
}
