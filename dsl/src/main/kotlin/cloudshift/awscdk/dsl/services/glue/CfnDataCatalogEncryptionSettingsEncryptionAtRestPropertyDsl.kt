@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

/**
 * Specifies the encryption-at-rest configuration for the Data Catalog.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * EncryptionAtRestProperty encryptionAtRestProperty = EncryptionAtRestProperty.builder()
 * .catalogEncryptionMode("catalogEncryptionMode")
 * .sseAwsKmsKeyId("sseAwsKmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html)
 */
@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsEncryptionAtRestPropertyDsl {
  private val cdkBuilder: CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.Builder =
      CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.builder()

  /**
   * @param catalogEncryptionMode The encryption-at-rest mode for encrypting Data Catalog data.
   */
  public fun catalogEncryptionMode(catalogEncryptionMode: String) {
    cdkBuilder.catalogEncryptionMode(catalogEncryptionMode)
  }

  /**
   * @param sseAwsKmsKeyId The ID of the AWS KMS key to use for encryption at rest.
   */
  public fun sseAwsKmsKeyId(sseAwsKmsKeyId: String) {
    cdkBuilder.sseAwsKmsKeyId(sseAwsKmsKeyId)
  }

  public fun build(): CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty = cdkBuilder.build()
}
