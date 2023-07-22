@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFieldPositionPropertyDsl {
  private val cdkBuilder: CfnForm.FieldPositionProperty.Builder =
      CfnForm.FieldPositionProperty.builder()

  /**
   * @param below The field position is below the field specified by the string.
   */
  public fun below(below: String) {
    cdkBuilder.below(below)
  }

  /**
   * @param fixed The field position is fixed and doesn't change in relation to other fields.
   */
  public fun fixed(fixed: String) {
    cdkBuilder.fixed(fixed)
  }

  /**
   * @param rightOf The field position is to the right of the field specified by the string.
   */
  public fun rightOf(rightOf: String) {
    cdkBuilder.rightOf(rightOf)
  }

  public fun build(): CfnForm.FieldPositionProperty = cdkBuilder.build()
}
