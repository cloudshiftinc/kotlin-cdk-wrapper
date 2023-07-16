@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationRecordColumnPropertyDsl {
  private val cdkBuilder: CfnApplication.RecordColumnProperty.Builder =
      CfnApplication.RecordColumnProperty.builder()

  public fun mapping(mapping: String) {
    cdkBuilder.mapping(mapping)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sqlType(sqlType: String) {
    cdkBuilder.sqlType(sqlType)
  }

  public fun build(): CfnApplication.RecordColumnProperty = cdkBuilder.build()
}
