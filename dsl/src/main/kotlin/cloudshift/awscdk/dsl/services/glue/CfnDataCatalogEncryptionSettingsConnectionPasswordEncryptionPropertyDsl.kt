@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsConnectionPasswordEncryptionPropertyDsl {
  private val cdkBuilder:
      CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.Builder =
      CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.builder()

  /**
   * @param kmsKeyId An AWS KMS key that is used to encrypt the connection password.
   * If connection password protection is enabled, the caller of `CreateConnection` and
   * `UpdateConnection` needs at least `kms:Encrypt` permission on the specified AWS KMS key, to
   * encrypt passwords before storing them in the Data Catalog. You can set the decrypt permission to
   * enable or restrict access on the password key according to your security requirements.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param returnConnectionPasswordEncrypted When the `ReturnConnectionPasswordEncrypted` flag is
   * set to "true", passwords remain encrypted in the responses of `GetConnection` and `GetConnections`
   * .
   * This encryption takes effect independently from catalog encryption.
   */
  public fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: Boolean) {
    cdkBuilder.returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted)
  }

  /**
   * @param returnConnectionPasswordEncrypted When the `ReturnConnectionPasswordEncrypted` flag is
   * set to "true", passwords remain encrypted in the responses of `GetConnection` and `GetConnections`
   * .
   * This encryption takes effect independently from catalog encryption.
   */
  public fun returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted: IResolvable) {
    cdkBuilder.returnConnectionPasswordEncrypted(returnConnectionPasswordEncrypted)
  }

  public fun build(): CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty =
      cdkBuilder.build()
}
