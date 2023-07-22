@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * MixedMeasureMappings are mappings that can be used to ingest data into a mixture of narrow and
 * multi measures in the derived table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * MixedMeasureMappingProperty mixedMeasureMappingProperty = MixedMeasureMappingProperty.builder()
 * .measureValueType("measureValueType")
 * // the properties below are optional
 * .measureName("measureName")
 * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
 * .measureValueType("measureValueType")
 * .sourceColumn("sourceColumn")
 * // the properties below are optional
 * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
 * .build()))
 * .sourceColumn("sourceColumn")
 * .targetMeasureName("targetMeasureName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-mixedmeasuremapping.html)
 */
@CdkDslMarker
public class CfnScheduledQueryMixedMeasureMappingPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.MixedMeasureMappingProperty.Builder =
      CfnScheduledQuery.MixedMeasureMappingProperty.builder()

  private val _multiMeasureAttributeMappings: MutableList<Any> = mutableListOf()

  /**
   * @param measureName Refers to the value of measure_name in a result row.
   * This field is required if MeasureNameColumn is provided.
   */
  public fun measureName(measureName: String) {
    cdkBuilder.measureName(measureName)
  }

  /**
   * @param measureValueType Type of the value that is to be read from sourceColumn. 
   * If the mapping is for MULTI, use MeasureValueType.MULTI.
   */
  public fun measureValueType(measureValueType: String) {
    cdkBuilder.measureValueType(measureValueType)
  }

  /**
   * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
   * Attribute mappings for MULTI value measures.
   */
  public fun multiMeasureAttributeMappings(vararg multiMeasureAttributeMappings: Any) {
    _multiMeasureAttributeMappings.addAll(listOf(*multiMeasureAttributeMappings))
  }

  /**
   * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
   * Attribute mappings for MULTI value measures.
   */
  public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: Collection<Any>) {
    _multiMeasureAttributeMappings.addAll(multiMeasureAttributeMappings)
  }

  /**
   * @param multiMeasureAttributeMappings Required when measureValueType is MULTI.
   * Attribute mappings for MULTI value measures.
   */
  public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable) {
    cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings)
  }

  /**
   * @param sourceColumn This field refers to the source column from which measure-value is to be
   * read for result materialization.
   */
  public fun sourceColumn(sourceColumn: String) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  /**
   * @param targetMeasureName Target measure name to be used.
   * If not provided, the target measure name by default would be measure-name if provided, or
   * sourceColumn otherwise.
   */
  public fun targetMeasureName(targetMeasureName: String) {
    cdkBuilder.targetMeasureName(targetMeasureName)
  }

  public fun build(): CfnScheduledQuery.MixedMeasureMappingProperty {
    if(_multiMeasureAttributeMappings.isNotEmpty())
        cdkBuilder.multiMeasureAttributeMappings(_multiMeasureAttributeMappings)
    return cdkBuilder.build()
  }
}
