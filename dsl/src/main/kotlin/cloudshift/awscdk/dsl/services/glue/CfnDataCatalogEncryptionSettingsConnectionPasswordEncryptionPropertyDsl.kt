@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

/**
 * The data structure used by the Data Catalog to encrypt the password as part of `CreateConnection`
 * or `UpdateConnection` and store it in the `ENCRYPTED_PASSWORD` field in the connection properties.
 *
 * You can enable catalog encryption or only password encryption.
 *
 * When a `CreationConnection` request arrives containing a password, the Data Catalog first
 * encrypts the password using your AWS KMS key. It then encrypts the whole connection object again if
 * catalog encryption is also enabled.
 *
 * This encryption requires that you set AWS KMS key permissions to enable or restrict access on the
 * password key according to your security requirements. For example, you might want only
 * administrators to have decrypt permission on the password key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * ConnectionPasswordEncryptionProperty connectionPasswordEncryptionProperty =
 * ConnectionPasswordEncryptionProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .returnConnectionPasswordEncrypted(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html)
 */
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
