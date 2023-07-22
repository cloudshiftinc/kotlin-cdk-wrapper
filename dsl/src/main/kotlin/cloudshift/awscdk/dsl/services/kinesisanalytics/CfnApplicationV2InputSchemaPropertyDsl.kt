@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2InputSchemaPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.InputSchemaProperty.Builder =
      CfnApplicationV2.InputSchemaProperty.builder()

  private val _recordColumns: MutableList<Any> = mutableListOf()

  /**
   * @param recordColumns A list of `RecordColumn` objects. 
   */
  public fun recordColumns(vararg recordColumns: Any) {
    _recordColumns.addAll(listOf(*recordColumns))
  }

  /**
   * @param recordColumns A list of `RecordColumn` objects. 
   */
  public fun recordColumns(recordColumns: Collection<Any>) {
    _recordColumns.addAll(recordColumns)
  }

  /**
   * @param recordColumns A list of `RecordColumn` objects. 
   */
  public fun recordColumns(recordColumns: IResolvable) {
    cdkBuilder.recordColumns(recordColumns)
  }

  /**
   * @param recordEncoding Specifies the encoding of the records in the streaming source.
   * For example, UTF-8.
   */
  public fun recordEncoding(recordEncoding: String) {
    cdkBuilder.recordEncoding(recordEncoding)
  }

  /**
   * @param recordFormat Specifies the format of the records on the streaming source. 
   */
  public fun recordFormat(recordFormat: IResolvable) {
    cdkBuilder.recordFormat(recordFormat)
  }

  /**
   * @param recordFormat Specifies the format of the records on the streaming source. 
   */
  public fun recordFormat(recordFormat: CfnApplicationV2.RecordFormatProperty) {
    cdkBuilder.recordFormat(recordFormat)
  }

  public fun build(): CfnApplicationV2.InputSchemaProperty {
    if(_recordColumns.isNotEmpty()) cdkBuilder.recordColumns(_recordColumns)
    return cdkBuilder.build()
  }
}
