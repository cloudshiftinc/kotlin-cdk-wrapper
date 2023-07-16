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

  public fun bindingProperties(bindingProperties: IResolvable) {
    cdkBuilder.bindingProperties(bindingProperties)
  }

  public
      fun bindingProperties(bindingProperties: CfnComponent.ComponentPropertyBindingPropertiesProperty) {
    cdkBuilder.bindingProperties(bindingProperties)
  }

  public fun bindings(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.bindings(builder.map)
  }

  public fun bindings(bindings: Map<String, *>) {
    cdkBuilder.bindings(bindings)
  }

  public fun bindings(bindings: IResolvable) {
    cdkBuilder.bindings(bindings)
  }

  public fun collectionBindingProperties(collectionBindingProperties: IResolvable) {
    cdkBuilder.collectionBindingProperties(collectionBindingProperties)
  }

  public
      fun collectionBindingProperties(collectionBindingProperties: CfnComponent.ComponentPropertyBindingPropertiesProperty) {
    cdkBuilder.collectionBindingProperties(collectionBindingProperties)
  }

  public fun componentName(componentName: String) {
    cdkBuilder.componentName(componentName)
  }

  public fun concat(vararg concat: Any) {
    _concat.addAll(listOf(*concat))
  }

  public fun concat(concat: Collection<Any>) {
    _concat.addAll(concat)
  }

  public fun concat(concat: IResolvable) {
    cdkBuilder.concat(concat)
  }

  public fun condition(condition: IResolvable) {
    cdkBuilder.condition(condition)
  }

  public fun condition(condition: CfnComponent.ComponentConditionPropertyProperty) {
    cdkBuilder.condition(condition)
  }

  public fun configured(configured: Boolean) {
    cdkBuilder.configured(configured)
  }

  public fun configured(configured: IResolvable) {
    cdkBuilder.configured(configured)
  }

  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun event(event: String) {
    cdkBuilder.event(event)
  }

  public fun importedValue(importedValue: String) {
    cdkBuilder.importedValue(importedValue)
  }

  public fun model(model: String) {
    cdkBuilder.model(model)
  }

  public fun `property`(`property`: String) {
    cdkBuilder.`property`(`property`)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun userAttribute(userAttribute: String) {
    cdkBuilder.userAttribute(userAttribute)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnComponent.ComponentPropertyProperty {
    if(_concat.isNotEmpty()) cdkBuilder.concat(_concat)
    return cdkBuilder.build()
  }
}
