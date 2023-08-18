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
 * Specifies how job bookmark data should be encrypted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * JobBookmarksEncryptionProperty jobBookmarksEncryptionProperty =
 * JobBookmarksEncryptionProperty.builder()
 * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationJobBookmarksEncryptionPropertyDsl {
    private val cdkBuilder: CfnSecurityConfiguration.JobBookmarksEncryptionProperty.Builder =
        CfnSecurityConfiguration.JobBookmarksEncryptionProperty.builder()

    /** @param jobBookmarksEncryptionMode The encryption mode to use for job bookmarks data. */
    public fun jobBookmarksEncryptionMode(jobBookmarksEncryptionMode: String) {
        cdkBuilder.jobBookmarksEncryptionMode(jobBookmarksEncryptionMode)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the
     *   data.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun build(): CfnSecurityConfiguration.JobBookmarksEncryptionProperty = cdkBuilder.build()
}
