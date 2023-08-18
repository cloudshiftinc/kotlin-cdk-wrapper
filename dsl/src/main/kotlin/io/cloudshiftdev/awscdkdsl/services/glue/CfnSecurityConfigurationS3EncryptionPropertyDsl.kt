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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

/**
 * Specifies how Amazon Simple Storage Service (Amazon S3) data should be encrypted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * S3EncryptionProperty s3EncryptionProperty = S3EncryptionProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .s3EncryptionMode("s3EncryptionMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationS3EncryptionPropertyDsl {
    private val cdkBuilder: CfnSecurityConfiguration.S3EncryptionProperty.Builder =
        CfnSecurityConfiguration.S3EncryptionProperty.builder()

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
     *   data.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /** @param s3EncryptionMode The encryption mode to use for Amazon S3 data. */
    public fun s3EncryptionMode(s3EncryptionMode: String) {
        cdkBuilder.s3EncryptionMode(s3EncryptionMode)
    }

    public fun build(): CfnSecurityConfiguration.S3EncryptionProperty = cdkBuilder.build()
}
