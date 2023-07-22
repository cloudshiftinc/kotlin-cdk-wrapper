@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreFileFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDatastore.FileFormatConfigurationProperty.Builder =
      CfnDatastore.FileFormatConfigurationProperty.builder()

  /**
   * @param jsonConfiguration Contains the configuration information of the JSON format.
   */
  public fun jsonConfiguration(jsonConfiguration: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(jsonConfiguration)
    cdkBuilder.jsonConfiguration(builder.map)
  }

  /**
   * @param jsonConfiguration Contains the configuration information of the JSON format.
   */
  public fun jsonConfiguration(jsonConfiguration: Any) {
    cdkBuilder.jsonConfiguration(jsonConfiguration)
  }

  /**
   * @param parquetConfiguration Contains the configuration information of the Parquet format.
   */
  public fun parquetConfiguration(parquetConfiguration: IResolvable) {
    cdkBuilder.parquetConfiguration(parquetConfiguration)
  }

  /**
   * @param parquetConfiguration Contains the configuration information of the Parquet format.
   */
  public fun parquetConfiguration(parquetConfiguration: CfnDatastore.ParquetConfigurationProperty) {
    cdkBuilder.parquetConfiguration(parquetConfiguration)
  }

  public fun build(): CfnDatastore.FileFormatConfigurationProperty = cdkBuilder.build()
}
