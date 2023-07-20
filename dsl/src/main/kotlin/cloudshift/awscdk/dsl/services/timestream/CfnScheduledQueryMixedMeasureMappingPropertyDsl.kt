@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryMixedMeasureMappingPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.MixedMeasureMappingProperty.Builder =
      CfnScheduledQuery.MixedMeasureMappingProperty.builder()

  private val _multiMeasureAttributeMappings: MutableList<Any> = mutableListOf()

  public fun measureName(measureName: String) {
    cdkBuilder.measureName(measureName)
  }

  public fun measureValueType(measureValueType: String) {
    cdkBuilder.measureValueType(measureValueType)
  }

  public fun multiMeasureAttributeMappings(vararg multiMeasureAttributeMappings: Any) {
    _multiMeasureAttributeMappings.addAll(listOf(*multiMeasureAttributeMappings))
  }

  public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: Collection<Any>) {
    _multiMeasureAttributeMappings.addAll(multiMeasureAttributeMappings)
  }

  public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable) {
    cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings)
  }

  public fun sourceColumn(sourceColumn: String) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  public fun targetMeasureName(targetMeasureName: String) {
    cdkBuilder.targetMeasureName(targetMeasureName)
  }

  public fun build(): CfnScheduledQuery.MixedMeasureMappingProperty {
    if(_multiMeasureAttributeMappings.isNotEmpty())
        cdkBuilder.multiMeasureAttributeMappings(_multiMeasureAttributeMappings)
    return cdkBuilder.build()
  }
}
