@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnTable

/**
 * Specifies skewed values in a table.
 *
 * Skewed values are those that occur with very high frequency.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object skewedColumnValueLocationMaps;
 * SkewedInfoProperty skewedInfoProperty = SkewedInfoProperty.builder()
 * .skewedColumnNames(List.of("skewedColumnNames"))
 * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
 * .skewedColumnValues(List.of("skewedColumnValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html)
 */
@CdkDslMarker
public class CfnTableSkewedInfoPropertyDsl {
  private val cdkBuilder: CfnTable.SkewedInfoProperty.Builder =
      CfnTable.SkewedInfoProperty.builder()

  private val _skewedColumnNames: MutableList<String> = mutableListOf()

  private val _skewedColumnValues: MutableList<String> = mutableListOf()

  /**
   * @param skewedColumnNames A list of names of columns that contain skewed values.
   */
  public fun skewedColumnNames(vararg skewedColumnNames: String) {
    _skewedColumnNames.addAll(listOf(*skewedColumnNames))
  }

  /**
   * @param skewedColumnNames A list of names of columns that contain skewed values.
   */
  public fun skewedColumnNames(skewedColumnNames: Collection<String>) {
    _skewedColumnNames.addAll(skewedColumnNames)
  }

  /**
   * @param skewedColumnValueLocationMaps A mapping of skewed values to the columns that contain
   * them.
   */
  public fun skewedColumnValueLocationMaps(skewedColumnValueLocationMaps: MapBuilder.() -> Unit =
      {}) {
    val builder = MapBuilder()
    builder.apply(skewedColumnValueLocationMaps)
    cdkBuilder.skewedColumnValueLocationMaps(builder.map)
  }

  /**
   * @param skewedColumnValueLocationMaps A mapping of skewed values to the columns that contain
   * them.
   */
  public fun skewedColumnValueLocationMaps(skewedColumnValueLocationMaps: Any) {
    cdkBuilder.skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
  }

  /**
   * @param skewedColumnValues A list of values that appear so frequently as to be considered
   * skewed.
   */
  public fun skewedColumnValues(vararg skewedColumnValues: String) {
    _skewedColumnValues.addAll(listOf(*skewedColumnValues))
  }

  /**
   * @param skewedColumnValues A list of values that appear so frequently as to be considered
   * skewed.
   */
  public fun skewedColumnValues(skewedColumnValues: Collection<String>) {
    _skewedColumnValues.addAll(skewedColumnValues)
  }

  public fun build(): CfnTable.SkewedInfoProperty {
    if(_skewedColumnNames.isNotEmpty()) cdkBuilder.skewedColumnNames(_skewedColumnNames)
    if(_skewedColumnValues.isNotEmpty()) cdkBuilder.skewedColumnValues(_skewedColumnValues)
    return cdkBuilder.build()
  }
}
