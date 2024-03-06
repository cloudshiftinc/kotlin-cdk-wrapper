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
     * @param kmsMasterKeyId AWS Key Management Service (KMS) customer AWS KMS key ID to use for the
     *   default encryption. This parameter is allowed if and only if `SSEAlgorithm` is set to
     *   `aws:kms` or `aws:kms:dsse` .
     *
     * You can specify the key ID, key alias, or the Amazon Resource Name (ARN) of the KMS key.
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key Alias: `alias/alias-name`
     *
     * If you use a key ID, you can run into a LogDestination undeliverable error when creating a
     * VPC flow log.
     *
     * If you are using encryption with cross-account or AWS service operations you must use a fully
     * qualified KMS key ARN. For more information, see
     * [Using encryption for cross-account operations](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy)
     * .
     *
     * Amazon S3 only supports symmetric encryption KMS keys. For more information, see
     * [Asymmetric keys in AWS KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html)
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
