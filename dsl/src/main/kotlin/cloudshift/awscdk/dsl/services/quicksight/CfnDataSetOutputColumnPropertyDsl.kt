@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetOutputColumnPropertyDsl {
  private val cdkBuilder: CfnDataSet.OutputColumnProperty.Builder =
      CfnDataSet.OutputColumnProperty.builder()

  /**
   * @param description A description for a column.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name A display name for the dataset.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type The type.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataSet.OutputColumnProperty = cdkBuilder.build()
}
