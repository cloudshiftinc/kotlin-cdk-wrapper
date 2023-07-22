@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentBindingPropertiesValuePropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentBindingPropertiesValueProperty.Builder =
      CfnComponent.ComponentBindingPropertiesValueProperty.builder()

  /**
   * @param bindingProperties Describes the properties to customize with data at runtime.
   */
  public fun bindingProperties(bindingProperties: IResolvable) {
    cdkBuilder.bindingProperties(bindingProperties)
  }

  /**
   * @param bindingProperties Describes the properties to customize with data at runtime.
   */
  public
      fun bindingProperties(bindingProperties: CfnComponent.ComponentBindingPropertiesValuePropertiesProperty) {
    cdkBuilder.bindingProperties(bindingProperties)
  }

  /**
   * @param defaultValue The default value of the property.
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param type The property type.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnComponent.ComponentBindingPropertiesValueProperty = cdkBuilder.build()
}
