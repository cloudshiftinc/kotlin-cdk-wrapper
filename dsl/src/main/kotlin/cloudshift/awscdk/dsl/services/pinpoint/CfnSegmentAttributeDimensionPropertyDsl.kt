@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pinpoint.CfnSegment

/**
 * Specifies attribute-based criteria for including or excluding endpoints from a segment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * AttributeDimensionProperty attributeDimensionProperty = AttributeDimensionProperty.builder()
 * .attributeType("attributeType")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-attributedimension.html)
 */
@CdkDslMarker
public class CfnSegmentAttributeDimensionPropertyDsl {
  private val cdkBuilder: CfnSegment.AttributeDimensionProperty.Builder =
      CfnSegment.AttributeDimensionProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param attributeType The type of segment dimension to use. Valid values are:.
   * * `INCLUSIVE` – endpoints that have attributes matching the values are included in the segment.
   * * `EXCLUSIVE` – endpoints that have attributes matching the values are excluded from the
   * segment.
   * * `CONTAINS` – endpoints that have attributes' substrings match the values are included in the
   * segment.
   * * `BEFORE` – endpoints with attributes read as ISO_INSTANT datetimes before the value are
   * included in the segment.
   * * `AFTER` – endpoints with attributes read as ISO_INSTANT datetimes after the value are
   * included in the segment.
   * * `BETWEEN` – endpoints with attributes read as ISO_INSTANT datetimes between the values are
   * included in the segment.
   * * `ON` – endpoints with attributes read as ISO_INSTANT dates on the value are included in the
   * segment. Time is ignored in this comparison.
   */
  public fun attributeType(attributeType: String) {
    cdkBuilder.attributeType(attributeType)
  }

  /**
   * @param values The criteria values to use for the segment dimension.
   * Depending on the value of the `AttributeType` property, endpoints are included or excluded from
   * the segment if their attribute values match the criteria values.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The criteria values to use for the segment dimension.
   * Depending on the value of the `AttributeType` property, endpoints are included or excluded from
   * the segment if their attribute values match the criteria values.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnSegment.AttributeDimensionProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
