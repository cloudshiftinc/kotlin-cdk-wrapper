@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormValueMappingPropertyDsl {
  private val cdkBuilder: CfnForm.ValueMappingProperty.Builder =
      CfnForm.ValueMappingProperty.builder()

  /**
   * @param displayValue The value to display for the complex object.
   */
  public fun displayValue(displayValue: IResolvable) {
    cdkBuilder.displayValue(displayValue)
  }

  /**
   * @param displayValue The value to display for the complex object.
   */
  public fun displayValue(displayValue: CfnForm.FormInputValuePropertyProperty) {
    cdkBuilder.displayValue(displayValue)
  }

  /**
   * @param value The complex object. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The complex object. 
   */
  public fun `value`(`value`: CfnForm.FormInputValuePropertyProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnForm.ValueMappingProperty = cdkBuilder.build()
}
