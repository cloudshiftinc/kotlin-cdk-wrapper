@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateParameterDateTimePickerControlPropertyDsl {
  private val cdkBuilder: CfnTemplate.ParameterDateTimePickerControlProperty.Builder =
      CfnTemplate.ParameterDateTimePickerControlProperty.builder()

  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public
      fun displayOptions(displayOptions: CfnTemplate.DateTimePickerControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun parameterControlId(parameterControlId: String) {
    cdkBuilder.parameterControlId(parameterControlId)
  }

  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnTemplate.ParameterDateTimePickerControlProperty = cdkBuilder.build()
}
