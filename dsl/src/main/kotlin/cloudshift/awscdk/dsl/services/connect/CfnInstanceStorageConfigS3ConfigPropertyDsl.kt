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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

/**
 * Information about the Amazon Simple Storage Service (Amazon S3) storage type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * // the properties below are optional
 * .encryptionConfig(EncryptionConfigProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-s3config.html)
 */
@CdkDslMarker
public class CfnInstanceStorageConfigS3ConfigPropertyDsl {
    private val cdkBuilder: CfnInstanceStorageConfig.S3ConfigProperty.Builder =
        CfnInstanceStorageConfig.S3ConfigProperty.builder()

    /** @param bucketName The S3 bucket name. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /** @param bucketPrefix The S3 bucket prefix. */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /** @param encryptionConfig The Amazon S3 encryption configuration. */
    public fun encryptionConfig(encryptionConfig: IResolvable) {
        cdkBuilder.encryptionConfig(encryptionConfig)
    }

    /** @param encryptionConfig The Amazon S3 encryption configuration. */
    public fun encryptionConfig(
        encryptionConfig: CfnInstanceStorageConfig.EncryptionConfigProperty
    ) {
        cdkBuilder.encryptionConfig(encryptionConfig)
    }

    public fun build(): CfnInstanceStorageConfig.S3ConfigProperty = cdkBuilder.build()
}
