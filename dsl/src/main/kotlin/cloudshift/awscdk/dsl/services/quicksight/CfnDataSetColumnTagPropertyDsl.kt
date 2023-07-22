@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A tag for a column in a
 * `[TagColumnOperation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_TagColumnOperation.html)`
 * structure. This is a variant type structure. For this structure to be valid, only one of the
 * attributes can be non-null.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnTagProperty columnTagProperty = ColumnTagProperty.builder()
 * .columnDescription(ColumnDescriptionProperty.builder()
 * .text("text")
 * .build())
 * .columnGeographicRole("columnGeographicRole")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columntag.html)
 */
@CdkDslMarker
public class CfnDataSetColumnTagPropertyDsl {
  private val cdkBuilder: CfnDataSet.ColumnTagProperty.Builder =
      CfnDataSet.ColumnTagProperty.builder()

  /**
   * @param columnDescription A description for a column.
   */
  public fun columnDescription(columnDescription: IResolvable) {
    cdkBuilder.columnDescription(columnDescription)
  }

  /**
   * @param columnDescription A description for a column.
   */
  public fun columnDescription(columnDescription: CfnDataSet.ColumnDescriptionProperty) {
    cdkBuilder.columnDescription(columnDescription)
  }

  /**
   * @param columnGeographicRole A geospatial role for a column.
   */
  public fun columnGeographicRole(columnGeographicRole: String) {
    cdkBuilder.columnGeographicRole(columnGeographicRole)
  }

  public fun build(): CfnDataSet.ColumnTagProperty = cdkBuilder.build()
}
