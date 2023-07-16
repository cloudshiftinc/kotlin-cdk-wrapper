@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentEventPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentEventProperty.Builder =
      CfnComponent.ComponentEventProperty.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun parameters(parameters: CfnComponent.ActionParametersProperty) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnComponent.ComponentEventProperty = cdkBuilder.build()
}
