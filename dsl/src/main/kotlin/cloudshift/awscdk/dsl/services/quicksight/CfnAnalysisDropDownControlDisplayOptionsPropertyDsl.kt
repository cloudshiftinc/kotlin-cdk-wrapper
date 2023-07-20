@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDropDownControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DropDownControlDisplayOptionsProperty.Builder =
      CfnAnalysis.DropDownControlDisplayOptionsProperty.builder()

  public fun selectAllOptions(selectAllOptions: IResolvable) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun selectAllOptions(selectAllOptions: CfnAnalysis.ListControlSelectAllOptionsProperty) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun titleOptions(titleOptions: CfnAnalysis.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnAnalysis.DropDownControlDisplayOptionsProperty = cdkBuilder.build()
}
