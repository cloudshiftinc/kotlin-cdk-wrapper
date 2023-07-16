@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryMultiMeasureAttributeMappingPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.MultiMeasureAttributeMappingProperty.Builder =
      CfnScheduledQuery.MultiMeasureAttributeMappingProperty.builder()

  public fun measureValueType(measureValueType: String) {
    cdkBuilder.measureValueType(measureValueType)
  }

  public fun sourceColumn(sourceColumn: String) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  public fun targetMultiMeasureAttributeName(targetMultiMeasureAttributeName: String) {
    cdkBuilder.targetMultiMeasureAttributeName(targetMultiMeasureAttributeName)
  }

  public fun build(): CfnScheduledQuery.MultiMeasureAttributeMappingProperty = cdkBuilder.build()
}
