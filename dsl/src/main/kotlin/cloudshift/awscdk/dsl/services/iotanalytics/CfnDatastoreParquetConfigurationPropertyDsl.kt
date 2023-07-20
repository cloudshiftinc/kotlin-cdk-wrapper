@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreParquetConfigurationPropertyDsl {
  private val cdkBuilder: CfnDatastore.ParquetConfigurationProperty.Builder =
      CfnDatastore.ParquetConfigurationProperty.builder()

  public fun schemaDefinition(schemaDefinition: IResolvable) {
    cdkBuilder.schemaDefinition(schemaDefinition)
  }

  public fun schemaDefinition(schemaDefinition: CfnDatastore.SchemaDefinitionProperty) {
    cdkBuilder.schemaDefinition(schemaDefinition)
  }

  public fun build(): CfnDatastore.ParquetConfigurationProperty = cdkBuilder.build()
}
