@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettingsProps

@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsPropsDsl {
  private val cdkBuilder: CfnDataCatalogEncryptionSettingsProps.Builder =
      CfnDataCatalogEncryptionSettingsProps.builder()

  /**
   * @param catalogId The ID of the Data Catalog in which the settings are created. 
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
   * Catalog security. 
   */
  public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
    cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
  }

  /**
   * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
   * Catalog security. 
   */
  public
      fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty) {
    cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
  }

  public fun build(): CfnDataCatalogEncryptionSettingsProps = cdkBuilder.build()
}
