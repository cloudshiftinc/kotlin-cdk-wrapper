@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDropDownControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.DropDownControlDisplayOptionsProperty.Builder =
      CfnTemplate.DropDownControlDisplayOptionsProperty.builder()

  public fun selectAllOptions(selectAllOptions: IResolvable) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun selectAllOptions(selectAllOptions: CfnTemplate.ListControlSelectAllOptionsProperty) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun titleOptions(titleOptions: CfnTemplate.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnTemplate.DropDownControlDisplayOptionsProperty = cdkBuilder.build()
}
