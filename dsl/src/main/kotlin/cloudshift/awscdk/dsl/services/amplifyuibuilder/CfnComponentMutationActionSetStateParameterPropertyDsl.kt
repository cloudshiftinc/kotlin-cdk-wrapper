@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentMutationActionSetStateParameterPropertyDsl {
  private val cdkBuilder: CfnComponent.MutationActionSetStateParameterProperty.Builder =
      CfnComponent.MutationActionSetStateParameterProperty.builder()

  /**
   * @param componentName The name of the component that is being modified. 
   */
  public fun componentName(componentName: String) {
    cdkBuilder.componentName(componentName)
  }

  /**
   * @param property The name of the component property to apply the state configuration to. 
   */
  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  /**
   * @param set The state configuration to assign to the property. 
   */
  public fun `set`(`set`: IResolvable) {
    cdkBuilder.`set`(`set`)
  }

  /**
   * @param set The state configuration to assign to the property. 
   */
  public fun `set`(`set`: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.`set`(`set`)
  }

  public fun build(): CfnComponent.MutationActionSetStateParameterProperty = cdkBuilder.build()
}
