@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.VariableValue

/**
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
 * .defaultInterval(Duration.days(7))
 * .variables(List.of(DashboardVariable.Builder.create()
 * .id("region")
 * .type(VariableType.PROPERTY)
 * .label("Region")
 * .inputType(VariableInputType.RADIO)
 * .value("region")
 * .values(Values.fromValues(VariableValue.builder().label("IAD").value("us-east-1").build(),
 * VariableValue.builder().label("DUB").value("us-west-2").build()))
 * .defaultValue(DefaultValue.value("us-east-1"))
 * .visible(true)
 * .build()))
 * .build();
 * ```
 */
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
