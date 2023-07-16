@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentActionParametersPropertyDsl {
  private val cdkBuilder: CfnComponent.ActionParametersProperty.Builder =
      CfnComponent.ActionParametersProperty.builder()

  public fun anchor(anchor: IResolvable) {
    cdkBuilder.anchor(anchor)
  }

  public fun anchor(anchor: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.anchor(anchor)
  }

  public fun fields(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.fields(builder.map)
  }

  public fun fields(fields: Map<String, *>) {
    cdkBuilder.fields(fields)
  }

  public fun fields(fields: IResolvable) {
    cdkBuilder.fields(fields)
  }

  public fun global(global: IResolvable) {
    cdkBuilder.global(global)
  }

  public fun global(global: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.global(global)
  }

  public fun id(id: IResolvable) {
    cdkBuilder.id(id)
  }

  public fun id(id: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.id(id)
  }

  public fun model(model: String) {
    cdkBuilder.model(model)
  }

  public fun state(state: IResolvable) {
    cdkBuilder.state(state)
  }

  public fun state(state: CfnComponent.MutationActionSetStateParameterProperty) {
    cdkBuilder.state(state)
  }

  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  public fun target(target: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.target(target)
  }

  public fun type(type: IResolvable) {
    cdkBuilder.type(type)
  }

  public fun type(type: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.type(type)
  }

  public fun url(url: IResolvable) {
    cdkBuilder.url(url)
  }

  public fun url(url: CfnComponent.ComponentPropertyProperty) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnComponent.ActionParametersProperty = cdkBuilder.build()
}
