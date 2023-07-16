@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2RecordColumnPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder =
      CfnApplicationReferenceDataSourceV2.RecordColumnProperty.builder()

  public fun mapping(mapping: String) {
    cdkBuilder.mapping(mapping)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun sqlType(sqlType: String) {
    cdkBuilder.sqlType(sqlType)
  }

  public fun build(): CfnApplicationReferenceDataSourceV2.RecordColumnProperty = cdkBuilder.build()
}
