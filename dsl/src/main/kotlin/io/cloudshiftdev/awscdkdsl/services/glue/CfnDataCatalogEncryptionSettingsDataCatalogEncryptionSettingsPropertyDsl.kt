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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

/**
 * Contains configuration information for maintaining Data Catalog security.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * DataCatalogEncryptionSettingsProperty dataCatalogEncryptionSettingsProperty =
 * DataCatalogEncryptionSettingsProperty.builder()
 * .connectionPasswordEncryption(ConnectionPasswordEncryptionProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .returnConnectionPasswordEncrypted(false)
 * .build())
 * .encryptionAtRest(EncryptionAtRestProperty.builder()
 * .catalogEncryptionMode("catalogEncryptionMode")
 * .sseAwsKmsKeyId("sseAwsKmsKeyId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html)
 */
@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl {
    private val cdkBuilder:
        CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder =
        CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.builder()

    /**
     * @param connectionPasswordEncryption When connection password protection is enabled, the Data
     *   Catalog uses a customer-provided key to encrypt the password as part of `CreateConnection`
     *   or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the connection
     *   properties. You can enable catalog encryption or only password encryption.
     */
    public fun connectionPasswordEncryption(connectionPasswordEncryption: IResolvable) {
        cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption)
    }

    /**
     * @param connectionPasswordEncryption When connection password protection is enabled, the Data
     *   Catalog uses a customer-provided key to encrypt the password as part of `CreateConnection`
     *   or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the connection
     *   properties. You can enable catalog encryption or only password encryption.
     */
    public fun connectionPasswordEncryption(
        connectionPasswordEncryption:
            CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty
    ) {
        cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption)
    }

    /**
     * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data Catalog.
     */
    public fun encryptionAtRest(encryptionAtRest: IResolvable) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    /**
     * @param encryptionAtRest Specifies the encryption-at-rest configuration for the Data Catalog.
     */
    public fun encryptionAtRest(
        encryptionAtRest: CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty
    ) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    public fun build(): CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty =
        cdkBuilder.build()
}
