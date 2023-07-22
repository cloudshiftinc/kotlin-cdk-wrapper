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
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps

/**
 * Properties for defining a `CfnComponent`.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html)
 */
@CdkDslMarker
public class CfnComponentPropsDsl {
  private val cdkBuilder: CfnComponentProps.Builder = CfnComponentProps.builder()

  private val _children: MutableList<Any> = mutableListOf()

  private val _variants: MutableList<Any> = mutableListOf()

  /**
   * @param appId The unique ID of the Amplify app associated with the component.
   */
  public fun appId(appId: String) {
    cdkBuilder.appId(appId)
  }

  /**
   * @param bindingProperties The information to connect a component's properties to data at
   * runtime. 
   * You can't specify `tags` as a valid property for `bindingProperties` .
   */
  public fun bindingProperties(bindingProperties: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(bindingProperties)
    cdkBuilder.bindingProperties(builder.map)
  }

  /**
   * @param bindingProperties The information to connect a component's properties to data at
   * runtime. 
   * You can't specify `tags` as a valid property for `bindingProperties` .
   */
  public fun bindingProperties(bindingProperties: Map<String, Any>) {
    cdkBuilder.bindingProperties(bindingProperties)
  }

  /**
   * @param bindingProperties The information to connect a component's properties to data at
   * runtime. 
   * You can't specify `tags` as a valid property for `bindingProperties` .
   */
  public fun bindingProperties(bindingProperties: IResolvable) {
    cdkBuilder.bindingProperties(bindingProperties)
  }

  /**
   * @param children A list of the component's `ComponentChild` instances.
   */
  public fun children(vararg children: Any) {
    _children.addAll(listOf(*children))
  }

  /**
   * @param children A list of the component's `ComponentChild` instances.
   */
  public fun children(children: Collection<Any>) {
    _children.addAll(children)
  }

  /**
   * @param children A list of the component's `ComponentChild` instances.
   */
  public fun children(children: IResolvable) {
    cdkBuilder.children(children)
  }

  /**
   * @param collectionProperties The data binding configuration for the component's properties.
   * Use this for a collection component. You can't specify `tags` as a valid property for
   * `collectionProperties` .
   */
  public fun collectionProperties(collectionProperties: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(collectionProperties)
    cdkBuilder.collectionProperties(builder.map)
  }

  /**
   * @param collectionProperties The data binding configuration for the component's properties.
   * Use this for a collection component. You can't specify `tags` as a valid property for
   * `collectionProperties` .
   */
  public fun collectionProperties(collectionProperties: Map<String, Any>) {
    cdkBuilder.collectionProperties(collectionProperties)
  }

  /**
   * @param collectionProperties The data binding configuration for the component's properties.
   * Use this for a collection component. You can't specify `tags` as a valid property for
   * `collectionProperties` .
   */
  public fun collectionProperties(collectionProperties: IResolvable) {
    cdkBuilder.collectionProperties(collectionProperties)
  }

  /**
   * @param componentType The type of the component. 
   * This can be an Amplify custom UI component or another custom component.
   */
  public fun componentType(componentType: String) {
    cdkBuilder.componentType(componentType)
  }

  /**
   * @param environmentName The name of the backend environment that is a part of the Amplify app.
   */
  public fun environmentName(environmentName: String) {
    cdkBuilder.environmentName(environmentName)
  }

  /**
   * @param events Describes the events that can be raised on the component.
   * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
   * components.
   */
  public fun events(events: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(events)
    cdkBuilder.events(builder.map)
  }

  /**
   * @param events Describes the events that can be raised on the component.
   * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
   * components.
   */
  public fun events(events: Map<String, Any>) {
    cdkBuilder.events(events)
  }

  /**
   * @param events Describes the events that can be raised on the component.
   * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
   * components.
   */
  public fun events(events: IResolvable) {
    cdkBuilder.events(events)
  }

  /**
   * @param name The name of the component. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param overrides Describes the component's properties that can be overriden in a customized
   * instance of the component. 
   * You can't specify `tags` as a valid property for `overrides` .
   */
  public fun overrides(overrides: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(overrides)
    cdkBuilder.overrides(builder.map)
  }

  /**
   * @param overrides Describes the component's properties that can be overriden in a customized
   * instance of the component. 
   * You can't specify `tags` as a valid property for `overrides` .
   */
  public fun overrides(overrides: Any) {
    cdkBuilder.overrides(overrides)
  }

  /**
   * @param properties Describes the component's properties. 
   * You can't specify `tags` as a valid property for `properties` .
   */
  public fun properties(properties: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(properties)
    cdkBuilder.properties(builder.map)
  }

  /**
   * @param properties Describes the component's properties. 
   * You can't specify `tags` as a valid property for `properties` .
   */
  public fun properties(properties: Map<String, Any>) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties Describes the component's properties. 
   * You can't specify `tags` as a valid property for `properties` .
   */
  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param schemaVersion The schema version of the component when it was imported.
   */
  public fun schemaVersion(schemaVersion: String) {
    cdkBuilder.schemaVersion(schemaVersion)
  }

  /**
   * @param sourceId The unique ID of the component in its original source system, such as Figma.
   */
  public fun sourceId(sourceId: String) {
    cdkBuilder.sourceId(sourceId)
  }

  /**
   * @param tags One or more key-value pairs to use when tagging the component.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param variants A list of the component's variants. 
   * A variant is a unique style configuration of a main component.
   */
  public fun variants(vararg variants: Any) {
    _variants.addAll(listOf(*variants))
  }

  /**
   * @param variants A list of the component's variants. 
   * A variant is a unique style configuration of a main component.
   */
  public fun variants(variants: Collection<Any>) {
    _variants.addAll(variants)
  }

  /**
   * @param variants A list of the component's variants. 
   * A variant is a unique style configuration of a main component.
   */
  public fun variants(variants: IResolvable) {
    cdkBuilder.variants(variants)
  }

  public fun build(): CfnComponentProps {
    if(_children.isNotEmpty()) cdkBuilder.children(_children)
    if(_variants.isNotEmpty()) cdkBuilder.variants(_variants)
    return cdkBuilder.build()
  }
}
