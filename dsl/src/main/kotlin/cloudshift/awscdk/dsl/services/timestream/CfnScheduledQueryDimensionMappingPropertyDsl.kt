@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * This type is used to map column(s) from the query result to a dimension in the destination table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * DimensionMappingProperty dimensionMappingProperty = DimensionMappingProperty.builder()
 * .dimensionValueType("dimensionValueType")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-dimensionmapping.html)
 */
@CdkDslMarker
public class CfnScheduledQueryDimensionMappingPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.DimensionMappingProperty.Builder =
      CfnScheduledQuery.DimensionMappingProperty.builder()

  /**
   * @param dimensionValueType Type for the dimension: VARCHAR. 
   */
  public fun dimensionValueType(dimensionValueType: String) {
    cdkBuilder.dimensionValueType(dimensionValueType)
  }

  /**
   * @param name Column name from query result. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnScheduledQuery.DimensionMappingProperty = cdkBuilder.build()
}
