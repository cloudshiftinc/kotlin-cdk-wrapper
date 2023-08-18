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
 * Specifies the KMS key that is used to encrypt the user's data stores in Athena.
 *
 * This setting does not apply to Athena SQL workgroups.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CustomerContentEncryptionConfigurationProperty customerContentEncryptionConfigurationProperty =
 * CustomerContentEncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-customercontentencryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnWorkGroupCustomerContentEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.Builder =
        CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.builder()

    /** @param kmsKey The KMS key that is used to encrypt the user's data stores in Athena. */
    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun build(): CfnWorkGroup.CustomerContentEncryptionConfigurationProperty =
        cdkBuilder.build()
}
