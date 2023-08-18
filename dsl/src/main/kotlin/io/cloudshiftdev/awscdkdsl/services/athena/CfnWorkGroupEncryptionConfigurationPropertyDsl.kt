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

package io.cloudshiftdev.awscdkdsl.services.athena

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

/**
 * If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
 * `SSE_KMS` or `CSE_KMS` ) and key information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * EncryptionConfigurationProperty encryptionConfigurationProperty =
 * EncryptionConfigurationProperty.builder()
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnWorkGroupEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkGroup.EncryptionConfigurationProperty.Builder =
        CfnWorkGroup.EncryptionConfigurationProperty.builder()

    /**
     * @param encryptionOption Indicates whether Amazon S3 server-side encryption with Amazon
     *   S3-managed keys ( `SSE_S3` ), server-side encryption with KMS-managed keys ( `SSE_KMS` ),
     *   or client-side encryption with KMS-managed keys ( `CSE_KMS` ) is used. If a query runs in a
     *   workgroup and the workgroup overrides client-side settings, then the workgroup's setting
     *   for encryption is used. It specifies whether query results must be encrypted, for all
     *   queries that run in this workgroup.
     */
    public fun encryptionOption(encryptionOption: String) {
        cdkBuilder.encryptionOption(encryptionOption)
    }

    /** @param kmsKey For `SSE_KMS` and `CSE_KMS` , this is the KMS key ARN or ID. */
    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun build(): CfnWorkGroup.EncryptionConfigurationProperty = cdkBuilder.build()
}
