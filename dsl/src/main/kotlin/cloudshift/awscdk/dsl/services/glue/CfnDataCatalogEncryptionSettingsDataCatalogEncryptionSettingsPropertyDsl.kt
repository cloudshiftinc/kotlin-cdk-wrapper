@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsPropertyDsl {
  private val cdkBuilder:
      CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder =
      CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.builder()

  /**
   * @param connectionPasswordEncryption When connection password protection is enabled, the Data
   * Catalog uses a customer-provided key to encrypt the password as part of `CreateConnection` or
   * `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the connection properties.
   * You can enable catalog encryption or only password encryption.
   */
  public fun connectionPasswordEncryption(connectionPasswordEncryption: IResolvable) {
    cdkBuilder.connectionPasswordEncryption(connectionPasswordEncryption)
  }

  /**
   * @param connectionPasswordEncryption When connection password protection is enabled, the Data
   * Catalog uses a customer-provided key to encrypt the password as part of `CreateConnection` or
   * `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the connection properties.
   * You can enable catalog encryption or only password encryption.
   */
  public
      fun connectionPasswordEncryption(connectionPasswordEncryption: CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty) {
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
  public
      fun encryptionAtRest(encryptionAtRest: CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty) {
    cdkBuilder.encryptionAtRest(encryptionAtRest)
  }

  public fun build(): CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty =
      cdkBuilder.build()
}
