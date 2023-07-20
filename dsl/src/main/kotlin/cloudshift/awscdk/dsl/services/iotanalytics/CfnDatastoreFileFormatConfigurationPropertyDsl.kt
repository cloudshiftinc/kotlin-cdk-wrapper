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

  public fun jsonConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.jsonConfiguration(builder.map)
  }

  public fun jsonConfiguration(jsonConfiguration: Any) {
    cdkBuilder.jsonConfiguration(jsonConfiguration)
  }

  public fun parquetConfiguration(parquetConfiguration: IResolvable) {
    cdkBuilder.parquetConfiguration(parquetConfiguration)
  }

  public fun parquetConfiguration(parquetConfiguration: CfnDatastore.ParquetConfigurationProperty) {
    cdkBuilder.parquetConfiguration(parquetConfiguration)
  }

  public fun build(): CfnDatastore.FileFormatConfigurationProperty = cdkBuilder.build()
}
