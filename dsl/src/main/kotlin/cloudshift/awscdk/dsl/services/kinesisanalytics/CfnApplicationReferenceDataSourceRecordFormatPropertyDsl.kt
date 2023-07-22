@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceRecordFormatPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.RecordFormatProperty.Builder =
      CfnApplicationReferenceDataSource.RecordFormatProperty.builder()

  /**
   * @param mappingParameters When configuring application input at the time of creating or updating
   * an application, provides additional mapping information specific to the record format (such as
   * JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
   */
  public fun mappingParameters(mappingParameters: IResolvable) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  /**
   * @param mappingParameters When configuring application input at the time of creating or updating
   * an application, provides additional mapping information specific to the record format (such as
   * JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
   */
  public
      fun mappingParameters(mappingParameters: CfnApplicationReferenceDataSource.MappingParametersProperty) {
    cdkBuilder.mappingParameters(mappingParameters)
  }

  /**
   * @param recordFormatType The type of record format. 
   */
  public fun recordFormatType(recordFormatType: String) {
    cdkBuilder.recordFormatType(recordFormatType)
  }

  public fun build(): CfnApplicationReferenceDataSource.RecordFormatProperty = cdkBuilder.build()
}
