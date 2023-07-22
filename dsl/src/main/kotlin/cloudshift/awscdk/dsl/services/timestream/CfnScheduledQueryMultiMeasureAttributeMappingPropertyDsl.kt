@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryMultiMeasureAttributeMappingPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.MultiMeasureAttributeMappingProperty.Builder =
      CfnScheduledQuery.MultiMeasureAttributeMappingProperty.builder()

  /**
   * @param measureValueType Type of the attribute to be read from the source column. 
   */
  public fun measureValueType(measureValueType: String) {
    cdkBuilder.measureValueType(measureValueType)
  }

  /**
   * @param sourceColumn Source column from where the attribute value is to be read. 
   */
  public fun sourceColumn(sourceColumn: String) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  /**
   * @param targetMultiMeasureAttributeName Custom name to be used for attribute name in derived
   * table.
   * If not provided, source column name would be used.
   */
  public fun targetMultiMeasureAttributeName(targetMultiMeasureAttributeName: String) {
    cdkBuilder.targetMultiMeasureAttributeName(targetMultiMeasureAttributeName)
  }

  public fun build(): CfnScheduledQuery.MultiMeasureAttributeMappingProperty = cdkBuilder.build()
}
