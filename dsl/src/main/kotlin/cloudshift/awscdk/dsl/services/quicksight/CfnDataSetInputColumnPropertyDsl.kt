@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetInputColumnPropertyDsl {
  private val cdkBuilder: CfnDataSet.InputColumnProperty.Builder =
      CfnDataSet.InputColumnProperty.builder()

  /**
   * @param name The name of this column in the underlying data source. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type The data type of the column. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataSet.InputColumnProperty = cdkBuilder.build()
}
