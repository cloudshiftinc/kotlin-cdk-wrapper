@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceRecordColumnPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.RecordColumnProperty.Builder =
      CfnApplicationReferenceDataSource.RecordColumnProperty.builder()

  /**
   * @param mapping A reference to the data element in the streaming input or the reference data
   * source.
   */
  public fun mapping(mapping: String) {
    cdkBuilder.mapping(mapping)
  }

  /**
   * @param name The name of the column that is created in the in-application input stream or
   * reference table. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sqlType The type of column created in the in-application input stream or reference
   * table. 
   */
  public fun sqlType(sqlType: String) {
    cdkBuilder.sqlType(sqlType)
  }

  public fun build(): CfnApplicationReferenceDataSource.RecordColumnProperty = cdkBuilder.build()
}
