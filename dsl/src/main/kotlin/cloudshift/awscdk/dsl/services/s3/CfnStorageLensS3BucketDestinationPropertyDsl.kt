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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource contains the details of the bucket where the Amazon S3 Storage Lens metrics export
 * will be placed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Object sses3;
 * S3BucketDestinationProperty s3BucketDestinationProperty = S3BucketDestinationProperty.builder()
 * .accountId("accountId")
 * .arn("arn")
 * .format("format")
 * .outputSchemaVersion("outputSchemaVersion")
 * // the properties below are optional
 * .encryption(EncryptionProperty.builder()
 * .ssekms(SSEKMSProperty.builder()
 * .keyId("keyId")
 * .build())
 * .sses3(sses3)
 * .build())
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-s3bucketdestination.html)
 */
@CdkDslMarker
public class CfnStorageLensS3BucketDestinationPropertyDsl {
    private val cdkBuilder: CfnStorageLens.S3BucketDestinationProperty.Builder =
        CfnStorageLens.S3BucketDestinationProperty.builder()

    /**
     * @param accountId This property contains the details of the AWS account ID of the S3 Storage
     *   Lens export bucket destination.
     */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * @param arn This property contains the details of the ARN of the bucket destination of the S3
     *   Storage Lens export.
     */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param encryption This property contains the details of the encryption of the bucket
     *   destination of the Amazon S3 Storage Lens metrics export.
     */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * @param encryption This property contains the details of the encryption of the bucket
     *   destination of the Amazon S3 Storage Lens metrics export.
     */
    public fun encryption(encryption: CfnStorageLens.EncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * @param format This property contains the details of the format of the S3 Storage Lens export
     *   bucket destination.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * @param outputSchemaVersion This property contains the details of the output schema version of
     *   the S3 Storage Lens export bucket destination.
     */
    public fun outputSchemaVersion(outputSchemaVersion: String) {
        cdkBuilder.outputSchemaVersion(outputSchemaVersion)
    }

    /**
     * @param prefix This property contains the details of the prefix of the bucket destination of
     *   the S3 Storage Lens export .
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnStorageLens.S3BucketDestinationProperty = cdkBuilder.build()
}
