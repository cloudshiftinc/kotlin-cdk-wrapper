@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetLookbackWindowPropertyDsl {
  private val cdkBuilder: CfnDataSet.LookbackWindowProperty.Builder =
      CfnDataSet.LookbackWindowProperty.builder()

  /**
   * @param columnName Column Name</p>.
   */
  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  /**
   * @param size Size</p>.
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  /**
   * @param sizeUnit the value to be set.
   */
  public fun sizeUnit(sizeUnit: String) {
    cdkBuilder.sizeUnit(sizeUnit)
  }

  public fun build(): CfnDataSet.LookbackWindowProperty = cdkBuilder.build()
}
