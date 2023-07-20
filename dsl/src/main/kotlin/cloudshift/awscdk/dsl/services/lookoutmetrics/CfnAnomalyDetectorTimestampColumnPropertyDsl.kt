@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorTimestampColumnPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.TimestampColumnProperty.Builder =
      CfnAnomalyDetector.TimestampColumnProperty.builder()

  public fun columnFormat(columnFormat: String) {
    cdkBuilder.columnFormat(columnFormat)
  }

  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  public fun build(): CfnAnomalyDetector.TimestampColumnProperty = cdkBuilder.build()
}
