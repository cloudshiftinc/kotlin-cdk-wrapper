@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceConfluencePageToIndexFieldMappingPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConfluencePageToIndexFieldMappingProperty.Builder =
      CfnDataSource.ConfluencePageToIndexFieldMappingProperty.builder()

  public fun dataSourceFieldName(dataSourceFieldName: String) {
    cdkBuilder.dataSourceFieldName(dataSourceFieldName)
  }

  public fun dateFieldFormat(dateFieldFormat: String) {
    cdkBuilder.dateFieldFormat(dateFieldFormat)
  }

  public fun indexFieldName(indexFieldName: String) {
    cdkBuilder.indexFieldName(indexFieldName)
  }

  public fun build(): CfnDataSource.ConfluencePageToIndexFieldMappingProperty = cdkBuilder.build()
}
