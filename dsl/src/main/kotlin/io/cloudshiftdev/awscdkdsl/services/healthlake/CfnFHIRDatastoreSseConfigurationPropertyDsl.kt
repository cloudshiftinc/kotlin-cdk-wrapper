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

package io.cloudshiftdev.awscdkdsl.services.healthlake

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

/**
 * The server-side encryption key configuration for a customer provided encryption key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.healthlake.*;
 * SseConfigurationProperty sseConfigurationProperty = SseConfigurationProperty.builder()
 * .kmsEncryptionConfig(KmsEncryptionConfigProperty.builder()
 * .cmkType("cmkType")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-sseconfiguration.html)
 */
@CdkDslMarker
public class CfnFHIRDatastoreSseConfigurationPropertyDsl {
    private val cdkBuilder: CfnFHIRDatastore.SseConfigurationProperty.Builder =
        CfnFHIRDatastore.SseConfigurationProperty.builder()

    /**
     * @param kmsEncryptionConfig The server-side encryption key configuration for a customer
     *   provided encryption key (CMK).
     */
    public fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig)
    }

    /**
     * @param kmsEncryptionConfig The server-side encryption key configuration for a customer
     *   provided encryption key (CMK).
     */
    public fun kmsEncryptionConfig(
        kmsEncryptionConfig: CfnFHIRDatastore.KmsEncryptionConfigProperty
    ) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig)
    }

    public fun build(): CfnFHIRDatastore.SseConfigurationProperty = cdkBuilder.build()
}
