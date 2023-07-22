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
 * Only one of MixedMeasureMappings or MultiMeasureMappings is to be provided.
 *
 * MultiMeasureMappings can be used to ingest data as multi measures in the derived table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * MultiMeasureMappingsProperty multiMeasureMappingsProperty =
 * MultiMeasureMappingsProperty.builder()
 * .multiMeasureAttributeMappings(List.of(MultiMeasureAttributeMappingProperty.builder()
 * .measureValueType("measureValueType")
 * .sourceColumn("sourceColumn")
 * // the properties below are optional
 * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
 * .build()))
 * // the properties below are optional
 * .targetMultiMeasureName("targetMultiMeasureName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasuremappings.html)
 */
@CdkDslMarker
public class CfnScheduledQueryMultiMeasureMappingsPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.MultiMeasureMappingsProperty.Builder =
      CfnScheduledQuery.MultiMeasureMappingsProperty.builder()

  private val _multiMeasureAttributeMappings: MutableList<Any> = mutableListOf()

  /**
   * @param multiMeasureAttributeMappings Required. 
   * Attribute mappings to be used for mapping query results to ingest data for multi-measure
   * attributes.
   */
  public fun multiMeasureAttributeMappings(vararg multiMeasureAttributeMappings: Any) {
    _multiMeasureAttributeMappings.addAll(listOf(*multiMeasureAttributeMappings))
  }

  /**
   * @param multiMeasureAttributeMappings Required. 
   * Attribute mappings to be used for mapping query results to ingest data for multi-measure
   * attributes.
   */
  public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: Collection<Any>) {
    _multiMeasureAttributeMappings.addAll(multiMeasureAttributeMappings)
  }

  /**
   * @param multiMeasureAttributeMappings Required. 
   * Attribute mappings to be used for mapping query results to ingest data for multi-measure
   * attributes.
   */
  public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable) {
    cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings)
  }

  /**
   * @param targetMultiMeasureName The name of the target multi-measure name in the derived table.
   * This input is required when measureNameColumn is not provided. If MeasureNameColumn is
   * provided, then value from that column will be used as multi-measure name.
   */
  public fun targetMultiMeasureName(targetMultiMeasureName: String) {
    cdkBuilder.targetMultiMeasureName(targetMultiMeasureName)
  }

  public fun build(): CfnScheduledQuery.MultiMeasureMappingsProperty {
    if(_multiMeasureAttributeMappings.isNotEmpty())
        cdkBuilder.multiMeasureAttributeMappings(_multiMeasureAttributeMappings)
    return cdkBuilder.build()
  }
}
