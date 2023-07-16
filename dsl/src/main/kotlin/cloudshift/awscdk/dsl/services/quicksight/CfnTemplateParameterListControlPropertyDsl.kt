@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateParameterListControlPropertyDsl {
  private val cdkBuilder: CfnTemplate.ParameterListControlProperty.Builder =
      CfnTemplate.ParameterListControlProperty.builder()

  public fun cascadingControlConfiguration(cascadingControlConfiguration: IResolvable) {
    cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
  }

  public
      fun cascadingControlConfiguration(cascadingControlConfiguration: CfnTemplate.CascadingControlConfigurationProperty) {
    cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
  }

  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun displayOptions(displayOptions: CfnTemplate.ListControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun parameterControlId(parameterControlId: String) {
    cdkBuilder.parameterControlId(parameterControlId)
  }

  public fun selectableValues(selectableValues: IResolvable) {
    cdkBuilder.selectableValues(selectableValues)
  }

  public fun selectableValues(selectableValues: CfnTemplate.ParameterSelectableValuesProperty) {
    cdkBuilder.selectableValues(selectableValues)
  }

  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTemplate.ParameterListControlProperty = cdkBuilder.build()
}
