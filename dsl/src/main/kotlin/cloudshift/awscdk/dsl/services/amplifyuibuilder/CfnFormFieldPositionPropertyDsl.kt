@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

@CdkDslMarker
public class CfnFormFieldPositionPropertyDsl {
  private val cdkBuilder: CfnForm.FieldPositionProperty.Builder =
      CfnForm.FieldPositionProperty.builder()

  public fun below(below: String) {
    cdkBuilder.below(below)
  }

  public fun fixed(fixed: String) {
    cdkBuilder.fixed(fixed)
  }

  public fun rightOf(rightOf: String) {
    cdkBuilder.rightOf(rightOf)
  }

  public fun build(): CfnForm.FieldPositionProperty = cdkBuilder.build()
}
