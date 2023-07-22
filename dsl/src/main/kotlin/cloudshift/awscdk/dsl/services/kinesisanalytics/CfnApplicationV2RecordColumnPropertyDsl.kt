@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2RecordColumnPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.RecordColumnProperty.Builder =
      CfnApplicationV2.RecordColumnProperty.builder()

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

  public fun build(): CfnApplicationV2.RecordColumnProperty = cdkBuilder.build()
}
