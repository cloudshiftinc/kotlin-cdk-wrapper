@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceRecordColumnPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.RecordColumnProperty.Builder =
      CfnApplicationReferenceDataSource.RecordColumnProperty.builder()

  /**
   * @param mapping Reference to the data element in the streaming input or the reference data
   * source.
   * This element is required if the
   * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
   * is `JSON` .
   */
  public fun mapping(mapping: String) {
    cdkBuilder.mapping(mapping)
  }

  /**
   * @param name Name of the column created in the in-application input stream or reference table. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sqlType Type of column created in the in-application input stream or reference table. 
   */
  public fun sqlType(sqlType: String) {
    cdkBuilder.sqlType(sqlType)
  }

  public fun build(): CfnApplicationReferenceDataSource.RecordColumnProperty = cdkBuilder.build()
}
