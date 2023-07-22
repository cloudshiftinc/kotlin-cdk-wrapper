@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentChildPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentChildProperty.Builder =
      CfnComponent.ComponentChildProperty.builder()

  private val _children: MutableList<Any> = mutableListOf()

  /**
   * @param children The list of `ComponentChild` instances for this component.
   */
  public fun children(vararg children: Any) {
    _children.addAll(listOf(*children))
  }

  /**
   * @param children The list of `ComponentChild` instances for this component.
   */
  public fun children(children: Collection<Any>) {
    _children.addAll(children)
  }

  /**
   * @param children The list of `ComponentChild` instances for this component.
   */
  public fun children(children: IResolvable) {
    cdkBuilder.children(children)
  }

  /**
   * @param componentType The type of the child component. 
   */
  public fun componentType(componentType: String) {
    cdkBuilder.componentType(componentType)
  }

  /**
   * @param events Describes the events that can be raised on the child component.
   * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
   * components.
   */
  public fun events(events: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(events)
    cdkBuilder.events(builder.map)
  }

  /**
   * @param events Describes the events that can be raised on the child component.
   * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
   * components.
   */
  public fun events(events: Map<String, Any>) {
    cdkBuilder.events(events)
  }

  /**
   * @param events Describes the events that can be raised on the child component.
   * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
   * components.
   */
  public fun events(events: IResolvable) {
    cdkBuilder.events(events)
  }

  /**
   * @param name The name of the child component. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param properties Describes the properties of the child component. 
   * You can't specify `tags` as a valid property for `properties` .
   */
  public fun properties(properties: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(properties)
    cdkBuilder.properties(builder.map)
  }

  /**
   * @param properties Describes the properties of the child component. 
   * You can't specify `tags` as a valid property for `properties` .
   */
  public fun properties(properties: Map<String, Any>) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties Describes the properties of the child component. 
   * You can't specify `tags` as a valid property for `properties` .
   */
  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  public fun build(): CfnComponent.ComponentChildProperty {
    if(_children.isNotEmpty()) cdkBuilder.children(_children)
    return cdkBuilder.build()
  }
}
