@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceReferenceSchemaPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder =
      CfnApplicationReferenceDataSource.ReferenceSchemaProperty.builder()

  private val _recordColumns: MutableList<Any> = mutableListOf()

  public fun recordColumns(vararg recordColumns: Any) {
    _recordColumns.addAll(listOf(*recordColumns))
  }

  public fun recordColumns(recordColumns: Collection<Any>) {
    _recordColumns.addAll(recordColumns)
  }

  public fun recordColumns(recordColumns: IResolvable) {
    cdkBuilder.recordColumns(recordColumns)
  }

  public fun recordEncoding(recordEncoding: String) {
    cdkBuilder.recordEncoding(recordEncoding)
  }

  public fun recordFormat(recordFormat: IResolvable) {
    cdkBuilder.recordFormat(recordFormat)
  }

  public fun recordFormat(recordFormat: CfnApplicationReferenceDataSource.RecordFormatProperty) {
    cdkBuilder.recordFormat(recordFormat)
  }

  public fun build(): CfnApplicationReferenceDataSource.ReferenceSchemaProperty {
    if(_recordColumns.isNotEmpty()) cdkBuilder.recordColumns(_recordColumns)
    return cdkBuilder.build()
  }
}
