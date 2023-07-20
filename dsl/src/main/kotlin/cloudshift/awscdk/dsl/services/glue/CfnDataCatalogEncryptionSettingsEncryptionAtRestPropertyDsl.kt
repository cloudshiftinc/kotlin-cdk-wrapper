@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsEncryptionAtRestPropertyDsl {
  private val cdkBuilder: CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.Builder =
      CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.builder()

  public fun catalogEncryptionMode(catalogEncryptionMode: String) {
    cdkBuilder.catalogEncryptionMode(catalogEncryptionMode)
  }

  public fun sseAwsKmsKeyId(sseAwsKmsKeyId: String) {
    cdkBuilder.sseAwsKmsKeyId(sseAwsKmsKeyId)
  }

  public fun build(): CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty = cdkBuilder.build()
}
