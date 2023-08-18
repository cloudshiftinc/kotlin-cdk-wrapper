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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes a custom encryption key that AWS App Runner uses to encrypt copies of the source
 * repository and service logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * EncryptionConfigurationProperty encryptionConfigurationProperty =
 * EncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-encryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.EncryptionConfigurationProperty.Builder =
        CfnService.EncryptionConfigurationProperty.builder()

    /** @param kmsKey The ARN of the KMS key that's used for encryption. */
    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun build(): CfnService.EncryptionConfigurationProperty = cdkBuilder.build()
}
