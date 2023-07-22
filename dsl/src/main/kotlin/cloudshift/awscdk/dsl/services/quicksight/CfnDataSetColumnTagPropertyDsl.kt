@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

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
