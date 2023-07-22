@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.VariableValue

@CdkDslMarker
public class VariableValueDsl {
  private val cdkBuilder: VariableValue.Builder = VariableValue.builder()

  /**
   * @param label Optional label for the selected item.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param value Value of the selected item. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): VariableValue = cdkBuilder.build()
}
