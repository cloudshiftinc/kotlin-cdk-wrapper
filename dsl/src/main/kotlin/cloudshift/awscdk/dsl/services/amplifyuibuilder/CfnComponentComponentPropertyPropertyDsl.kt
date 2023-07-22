@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentPropertyPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentPropertyProperty.Builder =
      CfnComponent.ComponentPropertyProperty.builder()

  private val _concat: MutableList<Any> = mutableListOf()

  /**
   * @param bindingProperties The information to bind the component property to data at runtime.
   */
  public fun bindingProperties(bindingProperties: IResolvable) {
    cdkBuilder.bindingProperties(bindingProperties)
  }

  /**
   * @param bindingProperties The information to bind the component property to data at runtime.
   */
  public
      fun bindingProperties(bindingProperties: CfnComponent.ComponentPropertyBindingPropertiesProperty) {
    cdkBuilder.bindingProperties(bindingProperties)
  }

  /**
   * @param bindings The information to bind the component property to form data.
   */
  public fun bindings(bindings: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(bindings)
    cdkBuilder.bindings(builder.map)
  }

  /**
   * @param bindings The information to bind the component property to form data.
   */
  public fun bindings(bindings: Map<String, Any>) {
    cdkBuilder.bindings(bindings)
  }

  /**
   * @param bindings The information to bind the component property to form data.
   */
  public fun bindings(bindings: IResolvable) {
    cdkBuilder.bindings(bindings)
  }

  /**
   * @param collectionBindingProperties The information to bind the component property to data at
   * runtime.
   * Use this for collection components.
   */
  public fun collectionBindingProperties(collectionBindingProperties: IResolvable) {
    cdkBuilder.collectionBindingProperties(collectionBindingProperties)
  }

  /**
   * @param collectionBindingProperties The information to bind the component property to data at
   * runtime.
   * Use this for collection components.
   */
  public
      fun collectionBindingProperties(collectionBindingProperties: CfnComponent.ComponentPropertyBindingPropertiesProperty) {
    cdkBuilder.collectionBindingProperties(collectionBindingProperties)
  }

  /**
   * @param componentName The name of the component that is affected by an event.
   */
  public fun componentName(componentName: String) {
    cdkBuilder.componentName(componentName)
  }

  /**
   * @param concat A list of component properties to concatenate to create the value to assign to
   * this component property.
   */
  public fun concat(vararg concat: Any) {
    _concat.addAll(listOf(*concat))
  }

  /**
   * @param concat A list of component properties to concatenate to create the value to assign to
   * this component property.
   */
  public fun concat(concat: Collection<Any>) {
    _concat.addAll(concat)
  }

  /**
   * @param concat A list of component properties to concatenate to create the value to assign to
   * this component property.
   */
  public fun concat(concat: IResolvable) {
    cdkBuilder.concat(concat)
  }

  /**
   * @param condition The conditional expression to use to assign a value to the component property.
   */
  public fun condition(condition: IResolvable) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param condition The conditional expression to use to assign a value to the component property.
   */
  public fun condition(condition: CfnComponent.ComponentConditionPropertyProperty) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param configured Specifies whether the user configured the property in Amplify Studio after
   * importing it.
   */
  public fun configured(configured: Boolean) {
    cdkBuilder.configured(configured)
  }

  /**
   * @param configured Specifies whether the user configured the property in Amplify Studio after
   * importing it.
   */
  public fun configured(configured: IResolvable) {
    cdkBuilder.configured(configured)
  }

  /**
   * @param defaultValue The default value to assign to the component property.
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param event An event that occurs in your app.
   * Use this for workflow data binding.
   */
  public fun event(event: String) {
    cdkBuilder.event(event)
  }

  /**
   * @param importedValue The default value assigned to the property when the component is imported
   * into an app.
   */
  public fun importedValue(importedValue: String) {
    cdkBuilder.importedValue(importedValue)
  }

  /**
   * @param model The data model to use to assign a value to the component property.
   */
  public fun model(model: String) {
    cdkBuilder.model(model)
  }

  /**
   * @param property The name of the component's property that is affected by an event.
   */
  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  /**
   * @param type The component type.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param userAttribute An authenticated user attribute to use to assign a value to the component
   * property.
   */
  public fun userAttribute(userAttribute: String) {
    cdkBuilder.userAttribute(userAttribute)
  }

  /**
   * @param value The value to assign to the component property.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnComponent.ComponentPropertyProperty {
    if(_concat.isNotEmpty()) cdkBuilder.concat(_concat)
    return cdkBuilder.build()
  }
}
