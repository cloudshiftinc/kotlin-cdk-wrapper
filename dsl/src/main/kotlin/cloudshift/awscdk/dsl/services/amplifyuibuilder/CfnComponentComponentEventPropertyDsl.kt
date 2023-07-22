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

  /**
   * @param action The action to perform when a specific event is raised.
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param parameters Describes information about the action.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters Describes information about the action.
   */
  public fun parameters(parameters: CfnComponent.ActionParametersProperty) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnComponent.ComponentEventProperty = cdkBuilder.build()
}
