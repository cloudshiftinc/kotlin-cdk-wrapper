@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings
import software.constructs.Construct

/**
 * Sets the security configuration for a specified catalog.
 *
 * After the configuration has been set, the specified encryption is applied to every catalog write
 * thereafter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnDataCatalogEncryptionSettings cfnDataCatalogEncryptionSettings =
 * CfnDataCatalogEncryptionSettings.Builder.create(this, "MyCfnDataCatalogEncryptionSettings")
 * .catalogId("catalogId")
 * .dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsProperty.builder()
 * .connectionPasswordEncryption(ConnectionPasswordEncryptionProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .returnConnectionPasswordEncrypted(false)
 * .build())
 * .encryptionAtRest(EncryptionAtRestProperty.builder()
 * .catalogEncryptionMode("catalogEncryptionMode")
 * .sseAwsKmsKeyId("sseAwsKmsKeyId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html)
 */
@CdkDslMarker
public class CfnDataCatalogEncryptionSettingsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataCatalogEncryptionSettings.Builder =
      CfnDataCatalogEncryptionSettings.Builder.create(scope, id)

  /**
   * The ID of the Data Catalog in which the settings are created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid)
   * @param catalogId The ID of the Data Catalog in which the settings are created. 
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * Contains configuration information for maintaining Data Catalog security.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
   * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
   * Catalog security. 
   */
  public fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: IResolvable) {
    cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
  }

  /**
   * Contains configuration information for maintaining Data Catalog security.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-datacatalogencryptionsettings)
   * @param dataCatalogEncryptionSettings Contains configuration information for maintaining Data
   * Catalog security. 
   */
  public
      fun dataCatalogEncryptionSettings(dataCatalogEncryptionSettings: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty) {
    cdkBuilder.dataCatalogEncryptionSettings(dataCatalogEncryptionSettings)
  }

  public fun build(): CfnDataCatalogEncryptionSettings = cdkBuilder.build()
}
