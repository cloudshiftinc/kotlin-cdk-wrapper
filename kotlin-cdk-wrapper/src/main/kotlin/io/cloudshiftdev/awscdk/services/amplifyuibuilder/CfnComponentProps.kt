@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

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
public interface CfnComponentProps {
  /**
   * The unique ID of the Amplify app associated with the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-appid)
   */
  public fun appId(): String? = unwrap(this).getAppId()

  /**
   * The information to connect a component's properties to data at runtime.
   *
   * You can't specify `tags` as a valid property for `bindingProperties` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
   */
  public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

  /**
   * A list of the component's `ComponentChild` instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
   */
  public fun children(): Any? = unwrap(this).getChildren()

  /**
   * The data binding configuration for the component's properties.
   *
   * Use this for a collection component. You can't specify `tags` as a valid property for
   * `collectionProperties` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
   */
  public fun collectionProperties(): Any? = unwrap(this).getCollectionProperties()

  /**
   * The type of the component.
   *
   * This can be an Amplify custom UI component or another custom component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-componenttype)
   */
  public fun componentType(): String? = unwrap(this).getComponentType()

  /**
   * The name of the backend environment that is a part of the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-environmentname)
   */
  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * Describes the events that can be raised on the component.
   *
   * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
   * components.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
   */
  public fun events(): Any? = unwrap(this).getEvents()

  /**
   * The name of the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Describes the component's properties that can be overriden in a customized instance of the
   * component.
   *
   * You can't specify `tags` as a valid property for `overrides` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-overrides)
   */
  public fun overrides(): Any? = unwrap(this).getOverrides()

  /**
   * Describes the component's properties.
   *
   * You can't specify `tags` as a valid property for `properties` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
   */
  public fun properties(): Any? = unwrap(this).getProperties()

  /**
   * The schema version of the component when it was imported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-schemaversion)
   */
  public fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

  /**
   * The unique ID of the component in its original source system, such as Figma.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-sourceid)
   */
  public fun sourceId(): String? = unwrap(this).getSourceId()

  /**
   * One or more key-value pairs to use when tagging the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A list of the component's variants.
   *
   * A variant is a unique style configuration of a main component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
   */
  public fun variants(): Any? = unwrap(this).getVariants()

  /**
   * A builder for [CfnComponentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appId The unique ID of the Amplify app associated with the component.
     */
    public fun appId(appId: String)

    /**
     * @param bindingProperties The information to connect a component's properties to data at
     * runtime.
     * You can't specify `tags` as a valid property for `bindingProperties` .
     */
    public fun bindingProperties(bindingProperties: IResolvable)

    /**
     * @param bindingProperties The information to connect a component's properties to data at
     * runtime.
     * You can't specify `tags` as a valid property for `bindingProperties` .
     */
    public fun bindingProperties(bindingProperties: Map<String, Any>)

    /**
     * @param children A list of the component's `ComponentChild` instances.
     */
    public fun children(children: IResolvable)

    /**
     * @param children A list of the component's `ComponentChild` instances.
     */
    public fun children(children: List<Any>)

    /**
     * @param children A list of the component's `ComponentChild` instances.
     */
    public fun children(vararg children: Any)

    /**
     * @param collectionProperties The data binding configuration for the component's properties.
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     */
    public fun collectionProperties(collectionProperties: IResolvable)

    /**
     * @param collectionProperties The data binding configuration for the component's properties.
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     */
    public fun collectionProperties(collectionProperties: Map<String, Any>)

    /**
     * @param componentType The type of the component.
     * This can be an Amplify custom UI component or another custom component.
     */
    public fun componentType(componentType: String)

    /**
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     */
    public fun environmentName(environmentName: String)

    /**
     * @param events Describes the events that can be raised on the component.
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     */
    public fun events(events: IResolvable)

    /**
     * @param events Describes the events that can be raised on the component.
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     */
    public fun events(events: Map<String, Any>)

    /**
     * @param name The name of the component.
     */
    public fun name(name: String)

    /**
     * @param overrides Describes the component's properties that can be overriden in a customized
     * instance of the component.
     * You can't specify `tags` as a valid property for `overrides` .
     */
    public fun overrides(overrides: Any)

    /**
     * @param properties Describes the component's properties.
     * You can't specify `tags` as a valid property for `properties` .
     */
    public fun properties(properties: IResolvable)

    /**
     * @param properties Describes the component's properties.
     * You can't specify `tags` as a valid property for `properties` .
     */
    public fun properties(properties: Map<String, Any>)

    /**
     * @param schemaVersion The schema version of the component when it was imported.
     */
    public fun schemaVersion(schemaVersion: String)

    /**
     * @param sourceId The unique ID of the component in its original source system, such as Figma.
     */
    public fun sourceId(sourceId: String)

    /**
     * @param tags One or more key-value pairs to use when tagging the component.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param variants A list of the component's variants.
     * A variant is a unique style configuration of a main component.
     */
    public fun variants(variants: IResolvable)

    /**
     * @param variants A list of the component's variants.
     * A variant is a unique style configuration of a main component.
     */
    public fun variants(variants: List<Any>)

    /**
     * @param variants A list of the component's variants.
     * A variant is a unique style configuration of a main component.
     */
    public fun variants(vararg variants: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps.builder()

    /**
     * @param appId The unique ID of the Amplify app associated with the component.
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * @param bindingProperties The information to connect a component's properties to data at
     * runtime.
     * You can't specify `tags` as a valid property for `bindingProperties` .
     */
    override fun bindingProperties(bindingProperties: IResolvable) {
      cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
    }

    /**
     * @param bindingProperties The information to connect a component's properties to data at
     * runtime.
     * You can't specify `tags` as a valid property for `bindingProperties` .
     */
    override fun bindingProperties(bindingProperties: Map<String, Any>) {
      cdkBuilder.bindingProperties(bindingProperties)
    }

    /**
     * @param children A list of the component's `ComponentChild` instances.
     */
    override fun children(children: IResolvable) {
      cdkBuilder.children(children.let(IResolvable::unwrap))
    }

    /**
     * @param children A list of the component's `ComponentChild` instances.
     */
    override fun children(children: List<Any>) {
      cdkBuilder.children(children)
    }

    /**
     * @param children A list of the component's `ComponentChild` instances.
     */
    override fun children(vararg children: Any): Unit = children(children.toList())

    /**
     * @param collectionProperties The data binding configuration for the component's properties.
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     */
    override fun collectionProperties(collectionProperties: IResolvable) {
      cdkBuilder.collectionProperties(collectionProperties.let(IResolvable::unwrap))
    }

    /**
     * @param collectionProperties The data binding configuration for the component's properties.
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     */
    override fun collectionProperties(collectionProperties: Map<String, Any>) {
      cdkBuilder.collectionProperties(collectionProperties)
    }

    /**
     * @param componentType The type of the component.
     * This can be an Amplify custom UI component or another custom component.
     */
    override fun componentType(componentType: String) {
      cdkBuilder.componentType(componentType)
    }

    /**
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param events Describes the events that can be raised on the component.
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     */
    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    /**
     * @param events Describes the events that can be raised on the component.
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     */
    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    /**
     * @param name The name of the component.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param overrides Describes the component's properties that can be overriden in a customized
     * instance of the component.
     * You can't specify `tags` as a valid property for `overrides` .
     */
    override fun overrides(overrides: Any) {
      cdkBuilder.overrides(overrides)
    }

    /**
     * @param properties Describes the component's properties.
     * You can't specify `tags` as a valid property for `properties` .
     */
    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    /**
     * @param properties Describes the component's properties.
     * You can't specify `tags` as a valid property for `properties` .
     */
    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    /**
     * @param schemaVersion The schema version of the component when it was imported.
     */
    override fun schemaVersion(schemaVersion: String) {
      cdkBuilder.schemaVersion(schemaVersion)
    }

    /**
     * @param sourceId The unique ID of the component in its original source system, such as Figma.
     */
    override fun sourceId(sourceId: String) {
      cdkBuilder.sourceId(sourceId)
    }

    /**
     * @param tags One or more key-value pairs to use when tagging the component.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param variants A list of the component's variants.
     * A variant is a unique style configuration of a main component.
     */
    override fun variants(variants: IResolvable) {
      cdkBuilder.variants(variants.let(IResolvable::unwrap))
    }

    /**
     * @param variants A list of the component's variants.
     * A variant is a unique style configuration of a main component.
     */
    override fun variants(variants: List<Any>) {
      cdkBuilder.variants(variants)
    }

    /**
     * @param variants A list of the component's variants.
     * A variant is a unique style configuration of a main component.
     */
    override fun variants(vararg variants: Any): Unit = variants(variants.toList())

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps,
  ) : CdkObject(cdkObject), CfnComponentProps {
    /**
     * The unique ID of the Amplify app associated with the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-appid)
     */
    override fun appId(): String? = unwrap(this).getAppId()

    /**
     * The information to connect a component's properties to data at runtime.
     *
     * You can't specify `tags` as a valid property for `bindingProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
     */
    override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     */
    override fun children(): Any? = unwrap(this).getChildren()

    /**
     * The data binding configuration for the component's properties.
     *
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
     */
    override fun collectionProperties(): Any? = unwrap(this).getCollectionProperties()

    /**
     * The type of the component.
     *
     * This can be an Amplify custom UI component or another custom component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-componenttype)
     */
    override fun componentType(): String? = unwrap(this).getComponentType()

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-environmentname)
     */
    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    /**
     * Describes the events that can be raised on the component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
     */
    override fun events(): Any? = unwrap(this).getEvents()

    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Describes the component's properties that can be overriden in a customized instance of the
     * component.
     *
     * You can't specify `tags` as a valid property for `overrides` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-overrides)
     */
    override fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * Describes the component's properties.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
     */
    override fun properties(): Any? = unwrap(this).getProperties()

    /**
     * The schema version of the component when it was imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-schemaversion)
     */
    override fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

    /**
     * The unique ID of the component in its original source system, such as Figma.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-sourceid)
     */
    override fun sourceId(): String? = unwrap(this).getSourceId()

    /**
     * One or more key-value pairs to use when tagging the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     */
    override fun variants(): Any? = unwrap(this).getVariants()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComponentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps):
        CfnComponentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnComponentProps):
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps
  }
}
