@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::AmplifyUIBuilder::Component resource specifies a component within an Amplify app.
 *
 * A component is a user interface (UI) element that you can customize. Use `ComponentChild` to
 * configure an instance of a `Component` . A `ComponentChild` instance inherits the configuration of
 * the main `Component` .
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html)
 */
public open class CfnComponent internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The unique ID of the Amplify app associated with the component.
   */
  public open fun appId(): String? = unwrap(this).getAppId()

  /**
   * The unique ID of the Amplify app associated with the component.
   */
  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  /**
   * The time that the component was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The unique ID of the component.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The time that the component was modified.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * The information to connect a component's properties to data at runtime.
   */
  public open fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

  /**
   * The information to connect a component's properties to data at runtime.
   */
  public open fun bindingProperties(`value`: IResolvable) {
    unwrap(this).setBindingProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The information to connect a component's properties to data at runtime.
   */
  public open fun bindingProperties(`value`: Map<String, Any>) {
    unwrap(this).setBindingProperties(`value`)
  }

  /**
   * A list of the component's `ComponentChild` instances.
   */
  public open fun children(): Any? = unwrap(this).getChildren()

  /**
   * A list of the component's `ComponentChild` instances.
   */
  public open fun children(`value`: IResolvable) {
    unwrap(this).setChildren(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the component's `ComponentChild` instances.
   */
  public open fun children(`value`: List<Any>) {
    unwrap(this).setChildren(`value`)
  }

  /**
   * A list of the component's `ComponentChild` instances.
   */
  public open fun children(vararg `value`: Any): Unit = children(`value`.toList())

  /**
   * The data binding configuration for the component's properties.
   */
  public open fun collectionProperties(): Any? = unwrap(this).getCollectionProperties()

  /**
   * The data binding configuration for the component's properties.
   */
  public open fun collectionProperties(`value`: IResolvable) {
    unwrap(this).setCollectionProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The data binding configuration for the component's properties.
   */
  public open fun collectionProperties(`value`: Map<String, Any>) {
    unwrap(this).setCollectionProperties(`value`)
  }

  /**
   * The type of the component.
   */
  public open fun componentType(): String? = unwrap(this).getComponentType()

  /**
   * The type of the component.
   */
  public open fun componentType(`value`: String) {
    unwrap(this).setComponentType(`value`)
  }

  /**
   * The name of the backend environment that is a part of the Amplify app.
   */
  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The name of the backend environment that is a part of the Amplify app.
   */
  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  /**
   * Describes the events that can be raised on the component.
   */
  public open fun events(): Any? = unwrap(this).getEvents()

  /**
   * Describes the events that can be raised on the component.
   */
  public open fun events(`value`: IResolvable) {
    unwrap(this).setEvents(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the events that can be raised on the component.
   */
  public open fun events(`value`: Map<String, Any>) {
    unwrap(this).setEvents(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the component.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the component.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Describes the component's properties that can be overriden in a customized instance of the
   * component.
   */
  public open fun overrides(): Any? = unwrap(this).getOverrides()

  /**
   * Describes the component's properties that can be overriden in a customized instance of the
   * component.
   */
  public open fun overrides(`value`: Any) {
    unwrap(this).setOverrides(`value`)
  }

  /**
   * Describes the component's properties.
   */
  public open fun properties(): Any? = unwrap(this).getProperties()

  /**
   * Describes the component's properties.
   */
  public open fun properties(`value`: IResolvable) {
    unwrap(this).setProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the component's properties.
   */
  public open fun properties(`value`: Map<String, Any>) {
    unwrap(this).setProperties(`value`)
  }

  /**
   * The schema version of the component when it was imported.
   */
  public open fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

  /**
   * The schema version of the component when it was imported.
   */
  public open fun schemaVersion(`value`: String) {
    unwrap(this).setSchemaVersion(`value`)
  }

  /**
   * The unique ID of the component in its original source system, such as Figma.
   */
  public open fun sourceId(): String? = unwrap(this).getSourceId()

  /**
   * The unique ID of the component in its original source system, such as Figma.
   */
  public open fun sourceId(`value`: String) {
    unwrap(this).setSourceId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more key-value pairs to use when tagging the component.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * One or more key-value pairs to use when tagging the component.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A list of the component's variants.
   */
  public open fun variants(): Any? = unwrap(this).getVariants()

  /**
   * A list of the component's variants.
   */
  public open fun variants(`value`: IResolvable) {
    unwrap(this).setVariants(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the component's variants.
   */
  public open fun variants(`value`: List<Any>) {
    unwrap(this).setVariants(`value`)
  }

  /**
   * A list of the component's variants.
   */
  public open fun variants(vararg `value`: Any): Unit = variants(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amplifyuibuilder.CfnComponent].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique ID of the Amplify app associated with the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-appid)
     * @param appId The unique ID of the Amplify app associated with the component. 
     */
    public fun appId(appId: String)

    /**
     * The information to connect a component's properties to data at runtime.
     *
     * You can't specify `tags` as a valid property for `bindingProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
     * @param bindingProperties The information to connect a component's properties to data at
     * runtime. 
     */
    public fun bindingProperties(bindingProperties: IResolvable)

    /**
     * The information to connect a component's properties to data at runtime.
     *
     * You can't specify `tags` as a valid property for `bindingProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
     * @param bindingProperties The information to connect a component's properties to data at
     * runtime. 
     */
    public fun bindingProperties(bindingProperties: Map<String, Any>)

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     * @param children A list of the component's `ComponentChild` instances. 
     */
    public fun children(children: IResolvable)

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     * @param children A list of the component's `ComponentChild` instances. 
     */
    public fun children(children: List<Any>)

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     * @param children A list of the component's `ComponentChild` instances. 
     */
    public fun children(vararg children: Any)

    /**
     * The data binding configuration for the component's properties.
     *
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
     * @param collectionProperties The data binding configuration for the component's properties. 
     */
    public fun collectionProperties(collectionProperties: IResolvable)

    /**
     * The data binding configuration for the component's properties.
     *
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
     * @param collectionProperties The data binding configuration for the component's properties. 
     */
    public fun collectionProperties(collectionProperties: Map<String, Any>)

    /**
     * The type of the component.
     *
     * This can be an Amplify custom UI component or another custom component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-componenttype)
     * @param componentType The type of the component. 
     */
    public fun componentType(componentType: String)

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-environmentname)
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     * 
     */
    public fun environmentName(environmentName: String)

    /**
     * Describes the events that can be raised on the component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
     * @param events Describes the events that can be raised on the component. 
     */
    public fun events(events: IResolvable)

    /**
     * Describes the events that can be raised on the component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
     * @param events Describes the events that can be raised on the component. 
     */
    public fun events(events: Map<String, Any>)

    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-name)
     * @param name The name of the component. 
     */
    public fun name(name: String)

    /**
     * Describes the component's properties that can be overriden in a customized instance of the
     * component.
     *
     * You can't specify `tags` as a valid property for `overrides` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-overrides)
     * @param overrides Describes the component's properties that can be overriden in a customized
     * instance of the component. 
     */
    public fun overrides(overrides: Any)

    /**
     * Describes the component's properties.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
     * @param properties Describes the component's properties. 
     */
    public fun properties(properties: IResolvable)

    /**
     * Describes the component's properties.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
     * @param properties Describes the component's properties. 
     */
    public fun properties(properties: Map<String, Any>)

    /**
     * The schema version of the component when it was imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-schemaversion)
     * @param schemaVersion The schema version of the component when it was imported. 
     */
    public fun schemaVersion(schemaVersion: String)

    /**
     * The unique ID of the component in its original source system, such as Figma.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-sourceid)
     * @param sourceId The unique ID of the component in its original source system, such as Figma. 
     */
    public fun sourceId(sourceId: String)

    /**
     * One or more key-value pairs to use when tagging the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-tags)
     * @param tags One or more key-value pairs to use when tagging the component. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     * @param variants A list of the component's variants. 
     */
    public fun variants(variants: IResolvable)

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     * @param variants A list of the component's variants. 
     */
    public fun variants(variants: List<Any>)

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     * @param variants A list of the component's variants. 
     */
    public fun variants(vararg variants: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.Builder.create(scope, id)

    /**
     * The unique ID of the Amplify app associated with the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-appid)
     * @param appId The unique ID of the Amplify app associated with the component. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * The information to connect a component's properties to data at runtime.
     *
     * You can't specify `tags` as a valid property for `bindingProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
     * @param bindingProperties The information to connect a component's properties to data at
     * runtime. 
     */
    override fun bindingProperties(bindingProperties: IResolvable) {
      cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
    }

    /**
     * The information to connect a component's properties to data at runtime.
     *
     * You can't specify `tags` as a valid property for `bindingProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
     * @param bindingProperties The information to connect a component's properties to data at
     * runtime. 
     */
    override fun bindingProperties(bindingProperties: Map<String, Any>) {
      cdkBuilder.bindingProperties(bindingProperties)
    }

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     * @param children A list of the component's `ComponentChild` instances. 
     */
    override fun children(children: IResolvable) {
      cdkBuilder.children(children.let(IResolvable::unwrap))
    }

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     * @param children A list of the component's `ComponentChild` instances. 
     */
    override fun children(children: List<Any>) {
      cdkBuilder.children(children)
    }

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     * @param children A list of the component's `ComponentChild` instances. 
     */
    override fun children(vararg children: Any): Unit = children(children.toList())

    /**
     * The data binding configuration for the component's properties.
     *
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
     * @param collectionProperties The data binding configuration for the component's properties. 
     */
    override fun collectionProperties(collectionProperties: IResolvable) {
      cdkBuilder.collectionProperties(collectionProperties.let(IResolvable::unwrap))
    }

    /**
     * The data binding configuration for the component's properties.
     *
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
     * @param collectionProperties The data binding configuration for the component's properties. 
     */
    override fun collectionProperties(collectionProperties: Map<String, Any>) {
      cdkBuilder.collectionProperties(collectionProperties)
    }

    /**
     * The type of the component.
     *
     * This can be an Amplify custom UI component or another custom component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-componenttype)
     * @param componentType The type of the component. 
     */
    override fun componentType(componentType: String) {
      cdkBuilder.componentType(componentType)
    }

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-environmentname)
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     * 
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * Describes the events that can be raised on the component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
     * @param events Describes the events that can be raised on the component. 
     */
    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    /**
     * Describes the events that can be raised on the component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
     * @param events Describes the events that can be raised on the component. 
     */
    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-name)
     * @param name The name of the component. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Describes the component's properties that can be overriden in a customized instance of the
     * component.
     *
     * You can't specify `tags` as a valid property for `overrides` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-overrides)
     * @param overrides Describes the component's properties that can be overriden in a customized
     * instance of the component. 
     */
    override fun overrides(overrides: Any) {
      cdkBuilder.overrides(overrides)
    }

    /**
     * Describes the component's properties.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
     * @param properties Describes the component's properties. 
     */
    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    /**
     * Describes the component's properties.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
     * @param properties Describes the component's properties. 
     */
    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    /**
     * The schema version of the component when it was imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-schemaversion)
     * @param schemaVersion The schema version of the component when it was imported. 
     */
    override fun schemaVersion(schemaVersion: String) {
      cdkBuilder.schemaVersion(schemaVersion)
    }

    /**
     * The unique ID of the component in its original source system, such as Figma.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-sourceid)
     * @param sourceId The unique ID of the component in its original source system, such as Figma. 
     */
    override fun sourceId(sourceId: String) {
      cdkBuilder.sourceId(sourceId)
    }

    /**
     * One or more key-value pairs to use when tagging the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-tags)
     * @param tags One or more key-value pairs to use when tagging the component. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     * @param variants A list of the component's variants. 
     */
    override fun variants(variants: IResolvable) {
      cdkBuilder.variants(variants.let(IResolvable::unwrap))
    }

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     * @param variants A list of the component's variants. 
     */
    override fun variants(variants: List<Any>) {
      cdkBuilder.variants(variants)
    }

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     * @param variants A list of the component's variants. 
     */
    override fun variants(vararg variants: Any): Unit = variants(variants.toList())

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnComponent =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent):
        CfnComponent = CfnComponent(cdkObject)

    internal fun unwrap(wrapped: CfnComponent):
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponent = wrapped.cdkObject
  }

  /**
   * Represents the state configuration when an action modifies a property of another element within
   * the same component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * ComponentPropertyProperty componentPropertyProperty_;
   * MutationActionSetStateParameterProperty mutationActionSetStateParameterProperty =
   * MutationActionSetStateParameterProperty.builder()
   * .componentName("componentName")
   * .property("property")
   * .set(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-mutationactionsetstateparameter.html)
   */
  public interface MutationActionSetStateParameterProperty {
    /**
     * The name of the component that is being modified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-mutationactionsetstateparameter.html#cfn-amplifyuibuilder-component-mutationactionsetstateparameter-componentname)
     */
    public fun componentName(): String

    /**
     * The name of the component property to apply the state configuration to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-mutationactionsetstateparameter.html#cfn-amplifyuibuilder-component-mutationactionsetstateparameter-property)
     */
    public fun `property`(): String

    /**
     * The state configuration to assign to the property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-mutationactionsetstateparameter.html#cfn-amplifyuibuilder-component-mutationactionsetstateparameter-set)
     */
    public fun `set`(): Any

    /**
     * A builder for [MutationActionSetStateParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentName The name of the component that is being modified. 
       */
      public fun componentName(componentName: String)

      /**
       * @param property The name of the component property to apply the state configuration to. 
       */
      public fun `property`(`property`: String)

      /**
       * @param set The state configuration to assign to the property. 
       */
      public fun `set`(`set`: IResolvable)

      /**
       * @param set The state configuration to assign to the property. 
       */
      public fun `set`(`set`: ComponentPropertyProperty)

      /**
       * @param set The state configuration to assign to the property. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("268e7dd1367b58ce4520bdb52a483dcab7206d642fd774d0fe24797972f81210")
      public fun `set`(`set`: ComponentPropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty.builder()

      /**
       * @param componentName The name of the component that is being modified. 
       */
      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      /**
       * @param property The name of the component property to apply the state configuration to. 
       */
      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      /**
       * @param set The state configuration to assign to the property. 
       */
      override fun `set`(`set`: IResolvable) {
        cdkBuilder.`set`(`set`.let(IResolvable::unwrap))
      }

      /**
       * @param set The state configuration to assign to the property. 
       */
      override fun `set`(`set`: ComponentPropertyProperty) {
        cdkBuilder.`set`(`set`.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param set The state configuration to assign to the property. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("268e7dd1367b58ce4520bdb52a483dcab7206d642fd774d0fe24797972f81210")
      override fun `set`(`set`: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          `set`(ComponentPropertyProperty(`set`))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty,
    ) : CdkObject(cdkObject), MutationActionSetStateParameterProperty {
      /**
       * The name of the component that is being modified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-mutationactionsetstateparameter.html#cfn-amplifyuibuilder-component-mutationactionsetstateparameter-componentname)
       */
      override fun componentName(): String = unwrap(this).getComponentName()

      /**
       * The name of the component property to apply the state configuration to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-mutationactionsetstateparameter.html#cfn-amplifyuibuilder-component-mutationactionsetstateparameter-property)
       */
      override fun `property`(): String = unwrap(this).getProperty()

      /**
       * The state configuration to assign to the property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-mutationactionsetstateparameter.html#cfn-amplifyuibuilder-component-mutationactionsetstateparameter-set)
       */
      override fun `set`(): Any = unwrap(this).getSet()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MutationActionSetStateParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty):
          MutationActionSetStateParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MutationActionSetStateParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutationActionSetStateParameterProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.MutationActionSetStateParameterProperty
    }
  }

  /**
   * The `ComponentChild` property specifies a nested UI configuration within a parent `Component` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * ComponentChildProperty componentChildProperty_;
   * ComponentPropertyProperty componentPropertyProperty_;
   * ComponentChildProperty componentChildProperty = ComponentChildProperty.builder()
   * .componentType("componentType")
   * .name("name")
   * .properties(Map.of(
   * "propertiesKey", ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build()))
   * // the properties below are optional
   * .children(List.of(componentChildProperty_))
   * .events(Map.of(
   * "eventsKey", ComponentEventProperty.builder()
   * .action("action")
   * .bindingEvent("bindingEvent")
   * .parameters(ActionParametersProperty.builder()
   * .anchor(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .fields(Map.of(
   * "fieldsKey", ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build()))
   * .global(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .id(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .model("model")
   * .state(MutationActionSetStateParameterProperty.builder()
   * .componentName("componentName")
   * .property("property")
   * .set(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .build())
   * .target(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .type(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .url(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .build())
   * .build()))
   * .sourceId("sourceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html)
   */
  public interface ComponentChildProperty {
    /**
     * The list of `ComponentChild` instances for this component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-children)
     */
    public fun children(): Any? = unwrap(this).getChildren()

    /**
     * The type of the child component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-componenttype)
     */
    public fun componentType(): String

    /**
     * Describes the events that can be raised on the child component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-events)
     */
    public fun events(): Any? = unwrap(this).getEvents()

    /**
     * The name of the child component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-name)
     */
    public fun name(): String

    /**
     * Describes the properties of the child component.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-properties)
     */
    public fun properties(): Any

    /**
     * The unique ID of the child component in its original source system, such as Figma.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-sourceid)
     */
    public fun sourceId(): String? = unwrap(this).getSourceId()

    /**
     * A builder for [ComponentChildProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param children The list of `ComponentChild` instances for this component.
       */
      public fun children(children: IResolvable)

      /**
       * @param children The list of `ComponentChild` instances for this component.
       */
      public fun children(children: List<Any>)

      /**
       * @param children The list of `ComponentChild` instances for this component.
       */
      public fun children(vararg children: Any)

      /**
       * @param componentType The type of the child component. 
       */
      public fun componentType(componentType: String)

      /**
       * @param events Describes the events that can be raised on the child component.
       * Use for the workflow feature in Amplify Studio that allows you to bind events and actions
       * to components.
       */
      public fun events(events: IResolvable)

      /**
       * @param events Describes the events that can be raised on the child component.
       * Use for the workflow feature in Amplify Studio that allows you to bind events and actions
       * to components.
       */
      public fun events(events: Map<String, Any>)

      /**
       * @param name The name of the child component. 
       */
      public fun name(name: String)

      /**
       * @param properties Describes the properties of the child component. 
       * You can't specify `tags` as a valid property for `properties` .
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties Describes the properties of the child component. 
       * You can't specify `tags` as a valid property for `properties` .
       */
      public fun properties(properties: Map<String, Any>)

      /**
       * @param sourceId The unique ID of the child component in its original source system, such as
       * Figma.
       */
      public fun sourceId(sourceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty.builder()

      /**
       * @param children The list of `ComponentChild` instances for this component.
       */
      override fun children(children: IResolvable) {
        cdkBuilder.children(children.let(IResolvable::unwrap))
      }

      /**
       * @param children The list of `ComponentChild` instances for this component.
       */
      override fun children(children: List<Any>) {
        cdkBuilder.children(children)
      }

      /**
       * @param children The list of `ComponentChild` instances for this component.
       */
      override fun children(vararg children: Any): Unit = children(children.toList())

      /**
       * @param componentType The type of the child component. 
       */
      override fun componentType(componentType: String) {
        cdkBuilder.componentType(componentType)
      }

      /**
       * @param events Describes the events that can be raised on the child component.
       * Use for the workflow feature in Amplify Studio that allows you to bind events and actions
       * to components.
       */
      override fun events(events: IResolvable) {
        cdkBuilder.events(events.let(IResolvable::unwrap))
      }

      /**
       * @param events Describes the events that can be raised on the child component.
       * Use for the workflow feature in Amplify Studio that allows you to bind events and actions
       * to components.
       */
      override fun events(events: Map<String, Any>) {
        cdkBuilder.events(events)
      }

      /**
       * @param name The name of the child component. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param properties Describes the properties of the child component. 
       * You can't specify `tags` as a valid property for `properties` .
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      /**
       * @param properties Describes the properties of the child component. 
       * You can't specify `tags` as a valid property for `properties` .
       */
      override fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
      }

      /**
       * @param sourceId The unique ID of the child component in its original source system, such as
       * Figma.
       */
      override fun sourceId(sourceId: String) {
        cdkBuilder.sourceId(sourceId)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty,
    ) : CdkObject(cdkObject), ComponentChildProperty {
      /**
       * The list of `ComponentChild` instances for this component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-children)
       */
      override fun children(): Any? = unwrap(this).getChildren()

      /**
       * The type of the child component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-componenttype)
       */
      override fun componentType(): String = unwrap(this).getComponentType()

      /**
       * Describes the events that can be raised on the child component.
       *
       * Use for the workflow feature in Amplify Studio that allows you to bind events and actions
       * to components.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-events)
       */
      override fun events(): Any? = unwrap(this).getEvents()

      /**
       * The name of the child component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Describes the properties of the child component.
       *
       * You can't specify `tags` as a valid property for `properties` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-properties)
       */
      override fun properties(): Any = unwrap(this).getProperties()

      /**
       * The unique ID of the child component in its original source system, such as Figma.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentchild.html#cfn-amplifyuibuilder-component-componentchild-sourceid)
       */
      override fun sourceId(): String? = unwrap(this).getSourceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentChildProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty):
          ComponentChildProperty = CdkObjectWrappers.wrap(cdkObject) as? ComponentChildProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentChildProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentChildProperty
    }
  }

  /**
   * Describes how to bind a component property to form data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * FormBindingElementProperty formBindingElementProperty = FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-formbindingelement.html)
   */
  public interface FormBindingElementProperty {
    /**
     * The name of the component to retrieve a value from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-formbindingelement.html#cfn-amplifyuibuilder-component-formbindingelement-element)
     */
    public fun element(): String

    /**
     * The property to retrieve a value from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-formbindingelement.html#cfn-amplifyuibuilder-component-formbindingelement-property)
     */
    public fun `property`(): String

    /**
     * A builder for [FormBindingElementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param element The name of the component to retrieve a value from. 
       */
      public fun element(element: String)

      /**
       * @param property The property to retrieve a value from. 
       */
      public fun `property`(`property`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty.builder()

      /**
       * @param element The name of the component to retrieve a value from. 
       */
      override fun element(element: String) {
        cdkBuilder.element(element)
      }

      /**
       * @param property The property to retrieve a value from. 
       */
      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty,
    ) : CdkObject(cdkObject), FormBindingElementProperty {
      /**
       * The name of the component to retrieve a value from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-formbindingelement.html#cfn-amplifyuibuilder-component-formbindingelement-element)
       */
      override fun element(): String = unwrap(this).getElement()

      /**
       * The property to retrieve a value from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-formbindingelement.html#cfn-amplifyuibuilder-component-formbindingelement-property)
       */
      override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FormBindingElementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty):
          FormBindingElementProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FormBindingElementProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormBindingElementProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.FormBindingElementProperty
    }
  }

  /**
   * The `ComponentEvent` property specifies the configuration of an event.
   *
   * You can bind an event and a corresponding action to a `Component` or a `ComponentChild` . A
   * button click is an example of an event.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * ComponentPropertyProperty componentPropertyProperty_;
   * ComponentEventProperty componentEventProperty = ComponentEventProperty.builder()
   * .action("action")
   * .bindingEvent("bindingEvent")
   * .parameters(ActionParametersProperty.builder()
   * .anchor(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .fields(Map.of(
   * "fieldsKey", ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build()))
   * .global(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .id(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .model("model")
   * .state(MutationActionSetStateParameterProperty.builder()
   * .componentName("componentName")
   * .property("property")
   * .set(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .build())
   * .target(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .type(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .url(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentevent.html)
   */
  public interface ComponentEventProperty {
    /**
     * The action to perform when a specific event is raised.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentevent.html#cfn-amplifyuibuilder-component-componentevent-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * Binds an event to an action on a component.
     *
     * When you specify a `bindingEvent` , the event is called when the action is performed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentevent.html#cfn-amplifyuibuilder-component-componentevent-bindingevent)
     */
    public fun bindingEvent(): String? = unwrap(this).getBindingEvent()

    /**
     * Describes information about the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentevent.html#cfn-amplifyuibuilder-component-componentevent-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A builder for [ComponentEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action to perform when a specific event is raised.
       */
      public fun action(action: String)

      /**
       * @param bindingEvent Binds an event to an action on a component.
       * When you specify a `bindingEvent` , the event is called when the action is performed.
       */
      public fun bindingEvent(bindingEvent: String)

      /**
       * @param parameters Describes information about the action.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters Describes information about the action.
       */
      public fun parameters(parameters: ActionParametersProperty)

      /**
       * @param parameters Describes information about the action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2830b6054ec32069ea63b002e6341cc356b212c778069b2b216fb49e696dd57")
      public fun parameters(parameters: ActionParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty.builder()

      /**
       * @param action The action to perform when a specific event is raised.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param bindingEvent Binds an event to an action on a component.
       * When you specify a `bindingEvent` , the event is called when the action is performed.
       */
      override fun bindingEvent(bindingEvent: String) {
        cdkBuilder.bindingEvent(bindingEvent)
      }

      /**
       * @param parameters Describes information about the action.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters Describes information about the action.
       */
      override fun parameters(parameters: ActionParametersProperty) {
        cdkBuilder.parameters(parameters.let(ActionParametersProperty::unwrap))
      }

      /**
       * @param parameters Describes information about the action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2830b6054ec32069ea63b002e6341cc356b212c778069b2b216fb49e696dd57")
      override fun parameters(parameters: ActionParametersProperty.Builder.() -> Unit): Unit =
          parameters(ActionParametersProperty(parameters))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty,
    ) : CdkObject(cdkObject), ComponentEventProperty {
      /**
       * The action to perform when a specific event is raised.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentevent.html#cfn-amplifyuibuilder-component-componentevent-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * Binds an event to an action on a component.
       *
       * When you specify a `bindingEvent` , the event is called when the action is performed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentevent.html#cfn-amplifyuibuilder-component-componentevent-bindingevent)
       */
      override fun bindingEvent(): String? = unwrap(this).getBindingEvent()

      /**
       * Describes information about the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentevent.html#cfn-amplifyuibuilder-component-componentevent-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty):
          ComponentEventProperty = CdkObjectWrappers.wrap(cdkObject) as? ComponentEventProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentEventProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentEventProperty
    }
  }

  /**
   * The `ComponentProperty` property specifies the configuration for all of a component's
   * properties.
   *
   * Use `ComponentProperty` to specify the values to render or bind by default.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * ComponentPropertyProperty componentPropertyProperty_;
   * ComponentPropertyProperty componentPropertyProperty = ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html)
   */
  public interface ComponentPropertyProperty {
    /**
     * The information to bind the component property to data at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-bindingproperties)
     */
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    /**
     * The information to bind the component property to form data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-bindings)
     */
    public fun bindings(): Any? = unwrap(this).getBindings()

    /**
     * The information to bind the component property to data at runtime.
     *
     * Use this for collection components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-collectionbindingproperties)
     */
    public fun collectionBindingProperties(): Any? = unwrap(this).getCollectionBindingProperties()

    /**
     * The name of the component that is affected by an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-componentname)
     */
    public fun componentName(): String? = unwrap(this).getComponentName()

    /**
     * A list of component properties to concatenate to create the value to assign to this component
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-concat)
     */
    public fun concat(): Any? = unwrap(this).getConcat()

    /**
     * The conditional expression to use to assign a value to the component property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-condition)
     */
    public fun condition(): Any? = unwrap(this).getCondition()

    /**
     * Specifies whether the user configured the property in Amplify Studio after importing it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-configured)
     */
    public fun configured(): Any? = unwrap(this).getConfigured()

    /**
     * The default value to assign to the component property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * An event that occurs in your app.
     *
     * Use this for workflow data binding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-event)
     */
    public fun event(): String? = unwrap(this).getEvent()

    /**
     * The default value assigned to the property when the component is imported into an app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-importedvalue)
     */
    public fun importedValue(): String? = unwrap(this).getImportedValue()

    /**
     * The data model to use to assign a value to the component property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-model)
     */
    public fun model(): String? = unwrap(this).getModel()

    /**
     * The name of the component's property that is affected by an event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-property)
     */
    public fun `property`(): String? = unwrap(this).getProperty()

    /**
     * The component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * An authenticated user attribute to use to assign a value to the component property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-userattribute)
     */
    public fun userAttribute(): String? = unwrap(this).getUserAttribute()

    /**
     * The value to assign to the component property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ComponentPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bindingProperties The information to bind the component property to data at runtime.
       */
      public fun bindingProperties(bindingProperties: IResolvable)

      /**
       * @param bindingProperties The information to bind the component property to data at runtime.
       */
      public fun bindingProperties(bindingProperties: ComponentPropertyBindingPropertiesProperty)

      /**
       * @param bindingProperties The information to bind the component property to data at runtime.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dcd3db6920bfaa007a0b3fb1ff2b36cc7f8fd52acfeed84578d23db202caa90")
      public
          fun bindingProperties(bindingProperties: ComponentPropertyBindingPropertiesProperty.Builder.() -> Unit)

      /**
       * @param bindings The information to bind the component property to form data.
       */
      public fun bindings(bindings: IResolvable)

      /**
       * @param bindings The information to bind the component property to form data.
       */
      public fun bindings(bindings: Map<String, Any>)

      /**
       * @param collectionBindingProperties The information to bind the component property to data
       * at runtime.
       * Use this for collection components.
       */
      public fun collectionBindingProperties(collectionBindingProperties: IResolvable)

      /**
       * @param collectionBindingProperties The information to bind the component property to data
       * at runtime.
       * Use this for collection components.
       */
      public
          fun collectionBindingProperties(collectionBindingProperties: ComponentPropertyBindingPropertiesProperty)

      /**
       * @param collectionBindingProperties The information to bind the component property to data
       * at runtime.
       * Use this for collection components.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1fddd1f0dd5ea438a032b6b81a2bfb7edadb0fcd314202ebffb5e3d9b377c62")
      public
          fun collectionBindingProperties(collectionBindingProperties: ComponentPropertyBindingPropertiesProperty.Builder.() -> Unit)

      /**
       * @param componentName The name of the component that is affected by an event.
       */
      public fun componentName(componentName: String)

      /**
       * @param concat A list of component properties to concatenate to create the value to assign
       * to this component property.
       */
      public fun concat(concat: IResolvable)

      /**
       * @param concat A list of component properties to concatenate to create the value to assign
       * to this component property.
       */
      public fun concat(concat: List<Any>)

      /**
       * @param concat A list of component properties to concatenate to create the value to assign
       * to this component property.
       */
      public fun concat(vararg concat: Any)

      /**
       * @param condition The conditional expression to use to assign a value to the component
       * property.
       */
      public fun condition(condition: IResolvable)

      /**
       * @param condition The conditional expression to use to assign a value to the component
       * property.
       */
      public fun condition(condition: ComponentConditionPropertyProperty)

      /**
       * @param condition The conditional expression to use to assign a value to the component
       * property.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e62b20dc5d4889db9e220ec40a5ff6226b3ee7051309bf21dcff586c5556c04")
      public fun condition(condition: ComponentConditionPropertyProperty.Builder.() -> Unit)

      /**
       * @param configured Specifies whether the user configured the property in Amplify Studio
       * after importing it.
       */
      public fun configured(configured: Boolean)

      /**
       * @param configured Specifies whether the user configured the property in Amplify Studio
       * after importing it.
       */
      public fun configured(configured: IResolvable)

      /**
       * @param defaultValue The default value to assign to the component property.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param event An event that occurs in your app.
       * Use this for workflow data binding.
       */
      public fun event(event: String)

      /**
       * @param importedValue The default value assigned to the property when the component is
       * imported into an app.
       */
      public fun importedValue(importedValue: String)

      /**
       * @param model The data model to use to assign a value to the component property.
       */
      public fun model(model: String)

      /**
       * @param property The name of the component's property that is affected by an event.
       */
      public fun `property`(`property`: String)

      /**
       * @param type The component type.
       */
      public fun type(type: String)

      /**
       * @param userAttribute An authenticated user attribute to use to assign a value to the
       * component property.
       */
      public fun userAttribute(userAttribute: String)

      /**
       * @param value The value to assign to the component property.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty.builder()

      /**
       * @param bindingProperties The information to bind the component property to data at runtime.
       */
      override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      /**
       * @param bindingProperties The information to bind the component property to data at runtime.
       */
      override
          fun bindingProperties(bindingProperties: ComponentPropertyBindingPropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties.let(ComponentPropertyBindingPropertiesProperty::unwrap))
      }

      /**
       * @param bindingProperties The information to bind the component property to data at runtime.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dcd3db6920bfaa007a0b3fb1ff2b36cc7f8fd52acfeed84578d23db202caa90")
      override
          fun bindingProperties(bindingProperties: ComponentPropertyBindingPropertiesProperty.Builder.() -> Unit):
          Unit = bindingProperties(ComponentPropertyBindingPropertiesProperty(bindingProperties))

      /**
       * @param bindings The information to bind the component property to form data.
       */
      override fun bindings(bindings: IResolvable) {
        cdkBuilder.bindings(bindings.let(IResolvable::unwrap))
      }

      /**
       * @param bindings The information to bind the component property to form data.
       */
      override fun bindings(bindings: Map<String, Any>) {
        cdkBuilder.bindings(bindings)
      }

      /**
       * @param collectionBindingProperties The information to bind the component property to data
       * at runtime.
       * Use this for collection components.
       */
      override fun collectionBindingProperties(collectionBindingProperties: IResolvable) {
        cdkBuilder.collectionBindingProperties(collectionBindingProperties.let(IResolvable::unwrap))
      }

      /**
       * @param collectionBindingProperties The information to bind the component property to data
       * at runtime.
       * Use this for collection components.
       */
      override
          fun collectionBindingProperties(collectionBindingProperties: ComponentPropertyBindingPropertiesProperty) {
        cdkBuilder.collectionBindingProperties(collectionBindingProperties.let(ComponentPropertyBindingPropertiesProperty::unwrap))
      }

      /**
       * @param collectionBindingProperties The information to bind the component property to data
       * at runtime.
       * Use this for collection components.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1fddd1f0dd5ea438a032b6b81a2bfb7edadb0fcd314202ebffb5e3d9b377c62")
      override
          fun collectionBindingProperties(collectionBindingProperties: ComponentPropertyBindingPropertiesProperty.Builder.() -> Unit):
          Unit =
          collectionBindingProperties(ComponentPropertyBindingPropertiesProperty(collectionBindingProperties))

      /**
       * @param componentName The name of the component that is affected by an event.
       */
      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      /**
       * @param concat A list of component properties to concatenate to create the value to assign
       * to this component property.
       */
      override fun concat(concat: IResolvable) {
        cdkBuilder.concat(concat.let(IResolvable::unwrap))
      }

      /**
       * @param concat A list of component properties to concatenate to create the value to assign
       * to this component property.
       */
      override fun concat(concat: List<Any>) {
        cdkBuilder.concat(concat)
      }

      /**
       * @param concat A list of component properties to concatenate to create the value to assign
       * to this component property.
       */
      override fun concat(vararg concat: Any): Unit = concat(concat.toList())

      /**
       * @param condition The conditional expression to use to assign a value to the component
       * property.
       */
      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable::unwrap))
      }

      /**
       * @param condition The conditional expression to use to assign a value to the component
       * property.
       */
      override fun condition(condition: ComponentConditionPropertyProperty) {
        cdkBuilder.condition(condition.let(ComponentConditionPropertyProperty::unwrap))
      }

      /**
       * @param condition The conditional expression to use to assign a value to the component
       * property.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e62b20dc5d4889db9e220ec40a5ff6226b3ee7051309bf21dcff586c5556c04")
      override fun condition(condition: ComponentConditionPropertyProperty.Builder.() -> Unit): Unit
          = condition(ComponentConditionPropertyProperty(condition))

      /**
       * @param configured Specifies whether the user configured the property in Amplify Studio
       * after importing it.
       */
      override fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
      }

      /**
       * @param configured Specifies whether the user configured the property in Amplify Studio
       * after importing it.
       */
      override fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured.let(IResolvable::unwrap))
      }

      /**
       * @param defaultValue The default value to assign to the component property.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param event An event that occurs in your app.
       * Use this for workflow data binding.
       */
      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      /**
       * @param importedValue The default value assigned to the property when the component is
       * imported into an app.
       */
      override fun importedValue(importedValue: String) {
        cdkBuilder.importedValue(importedValue)
      }

      /**
       * @param model The data model to use to assign a value to the component property.
       */
      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      /**
       * @param property The name of the component's property that is affected by an event.
       */
      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      /**
       * @param type The component type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param userAttribute An authenticated user attribute to use to assign a value to the
       * component property.
       */
      override fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
      }

      /**
       * @param value The value to assign to the component property.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty,
    ) : CdkObject(cdkObject), ComponentPropertyProperty {
      /**
       * The information to bind the component property to data at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-bindingproperties)
       */
      override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      /**
       * The information to bind the component property to form data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-bindings)
       */
      override fun bindings(): Any? = unwrap(this).getBindings()

      /**
       * The information to bind the component property to data at runtime.
       *
       * Use this for collection components.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-collectionbindingproperties)
       */
      override fun collectionBindingProperties(): Any? =
          unwrap(this).getCollectionBindingProperties()

      /**
       * The name of the component that is affected by an event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-componentname)
       */
      override fun componentName(): String? = unwrap(this).getComponentName()

      /**
       * A list of component properties to concatenate to create the value to assign to this
       * component property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-concat)
       */
      override fun concat(): Any? = unwrap(this).getConcat()

      /**
       * The conditional expression to use to assign a value to the component property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-condition)
       */
      override fun condition(): Any? = unwrap(this).getCondition()

      /**
       * Specifies whether the user configured the property in Amplify Studio after importing it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-configured)
       */
      override fun configured(): Any? = unwrap(this).getConfigured()

      /**
       * The default value to assign to the component property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * An event that occurs in your app.
       *
       * Use this for workflow data binding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-event)
       */
      override fun event(): String? = unwrap(this).getEvent()

      /**
       * The default value assigned to the property when the component is imported into an app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-importedvalue)
       */
      override fun importedValue(): String? = unwrap(this).getImportedValue()

      /**
       * The data model to use to assign a value to the component property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-model)
       */
      override fun model(): String? = unwrap(this).getModel()

      /**
       * The name of the component's property that is affected by an event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-property)
       */
      override fun `property`(): String? = unwrap(this).getProperty()

      /**
       * The component type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * An authenticated user attribute to use to assign a value to the component property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-userattribute)
       */
      override fun userAttribute(): String? = unwrap(this).getUserAttribute()

      /**
       * The value to assign to the component property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentproperty.html#cfn-amplifyuibuilder-component-componentproperty-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty):
          ComponentPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentPropertyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentPropertyProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyProperty
    }
  }

  /**
   * The `ComponentBindingPropertiesValueProperties` property specifies the data binding
   * configuration for a specific property using data stored in AWS .
   *
   * For AWS connected properties, you can bind a property to data stored in an Amazon S3 bucket, an
   * Amplify DataStore model or an authenticated user attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * PredicateProperty predicateProperty_;
   * ComponentBindingPropertiesValuePropertiesProperty
   * componentBindingPropertiesValuePropertiesProperty =
   * ComponentBindingPropertiesValuePropertiesProperty.builder()
   * .bucket("bucket")
   * .defaultValue("defaultValue")
   * .field("field")
   * .key("key")
   * .model("model")
   * .predicates(List.of(PredicateProperty.builder()
   * .and(List.of(predicateProperty_))
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .or(List.of(predicateProperty_))
   * .build()))
   * .slotName("slotName")
   * .userAttribute("userAttribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html)
   */
  public interface ComponentBindingPropertiesValuePropertiesProperty {
    /**
     * An Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-bucket)
     */
    public fun bucket(): String? = unwrap(this).getBucket()

    /**
     * The default value to assign to the property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * The field to bind the data to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The storage key for an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * An Amplify DataStore model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-model)
     */
    public fun model(): String? = unwrap(this).getModel()

    /**
     * A list of predicates for binding a component's properties to data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-predicates)
     */
    public fun predicates(): Any? = unwrap(this).getPredicates()

    /**
     * The name of a component slot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-slotname)
     */
    public fun slotName(): String? = unwrap(this).getSlotName()

    /**
     * An authenticated user attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-userattribute)
     */
    public fun userAttribute(): String? = unwrap(this).getUserAttribute()

    /**
     * A builder for [ComponentBindingPropertiesValuePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket An Amazon S3 bucket.
       */
      public fun bucket(bucket: String)

      /**
       * @param defaultValue The default value to assign to the property.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param field The field to bind the data to.
       */
      public fun `field`(`field`: String)

      /**
       * @param key The storage key for an Amazon S3 bucket.
       */
      public fun key(key: String)

      /**
       * @param model An Amplify DataStore model.
       */
      public fun model(model: String)

      /**
       * @param predicates A list of predicates for binding a component's properties to data.
       */
      public fun predicates(predicates: IResolvable)

      /**
       * @param predicates A list of predicates for binding a component's properties to data.
       */
      public fun predicates(predicates: List<Any>)

      /**
       * @param predicates A list of predicates for binding a component's properties to data.
       */
      public fun predicates(vararg predicates: Any)

      /**
       * @param slotName The name of a component slot.
       */
      public fun slotName(slotName: String)

      /**
       * @param userAttribute An authenticated user attribute.
       */
      public fun userAttribute(userAttribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty.builder()

      /**
       * @param bucket An Amazon S3 bucket.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param defaultValue The default value to assign to the property.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param field The field to bind the data to.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param key The storage key for an Amazon S3 bucket.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param model An Amplify DataStore model.
       */
      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      /**
       * @param predicates A list of predicates for binding a component's properties to data.
       */
      override fun predicates(predicates: IResolvable) {
        cdkBuilder.predicates(predicates.let(IResolvable::unwrap))
      }

      /**
       * @param predicates A list of predicates for binding a component's properties to data.
       */
      override fun predicates(predicates: List<Any>) {
        cdkBuilder.predicates(predicates)
      }

      /**
       * @param predicates A list of predicates for binding a component's properties to data.
       */
      override fun predicates(vararg predicates: Any): Unit = predicates(predicates.toList())

      /**
       * @param slotName The name of a component slot.
       */
      override fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
      }

      /**
       * @param userAttribute An authenticated user attribute.
       */
      override fun userAttribute(userAttribute: String) {
        cdkBuilder.userAttribute(userAttribute)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty,
    ) : CdkObject(cdkObject), ComponentBindingPropertiesValuePropertiesProperty {
      /**
       * An Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-bucket)
       */
      override fun bucket(): String? = unwrap(this).getBucket()

      /**
       * The default value to assign to the property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * The field to bind the data to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The storage key for an Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * An Amplify DataStore model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-model)
       */
      override fun model(): String? = unwrap(this).getModel()

      /**
       * A list of predicates for binding a component's properties to data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-predicates)
       */
      override fun predicates(): Any? = unwrap(this).getPredicates()

      /**
       * The name of a component slot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-slotname)
       */
      override fun slotName(): String? = unwrap(this).getSlotName()

      /**
       * An authenticated user attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalueproperties.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalueproperties-userattribute)
       */
      override fun userAttribute(): String? = unwrap(this).getUserAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentBindingPropertiesValuePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty):
          ComponentBindingPropertiesValuePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentBindingPropertiesValuePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentBindingPropertiesValuePropertiesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValuePropertiesProperty
    }
  }

  /**
   * The `SortProperty` property specifies how to sort the data that you bind to a component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * SortPropertyProperty sortPropertyProperty = SortPropertyProperty.builder()
   * .direction("direction")
   * .field("field")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-sortproperty.html)
   */
  public interface SortPropertyProperty {
    /**
     * The direction of the sort, either ascending or descending.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-sortproperty.html#cfn-amplifyuibuilder-component-sortproperty-direction)
     */
    public fun direction(): String

    /**
     * The field to perform the sort on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-sortproperty.html#cfn-amplifyuibuilder-component-sortproperty-field)
     */
    public fun `field`(): String

    /**
     * A builder for [SortPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param direction The direction of the sort, either ascending or descending. 
       */
      public fun direction(direction: String)

      /**
       * @param field The field to perform the sort on. 
       */
      public fun `field`(`field`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty.builder()

      /**
       * @param direction The direction of the sort, either ascending or descending. 
       */
      override fun direction(direction: String) {
        cdkBuilder.direction(direction)
      }

      /**
       * @param field The field to perform the sort on. 
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty,
    ) : CdkObject(cdkObject), SortPropertyProperty {
      /**
       * The direction of the sort, either ascending or descending.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-sortproperty.html#cfn-amplifyuibuilder-component-sortproperty-direction)
       */
      override fun direction(): String = unwrap(this).getDirection()

      /**
       * The field to perform the sort on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-sortproperty.html#cfn-amplifyuibuilder-component-sortproperty-field)
       */
      override fun `field`(): String = unwrap(this).getField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SortPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty):
          SortPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as? SortPropertyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SortPropertyProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.SortPropertyProperty
    }
  }

  /**
   * The `ComponentConditionProperty` property specifies a conditional expression for setting a
   * component property.
   *
   * Use `ComponentConditionProperty` to set a property to different values conditionally, based on
   * the value of another property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * ComponentConditionPropertyProperty componentConditionPropertyProperty_;
   * ComponentPropertyProperty componentPropertyProperty_;
   * ComponentConditionPropertyProperty componentConditionPropertyProperty =
   * ComponentConditionPropertyProperty.builder()
   * .else(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(componentConditionPropertyProperty_)
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(componentConditionPropertyProperty_)
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html)
   */
  public interface ComponentConditionPropertyProperty {
    /**
     * The value to assign to the property if the condition is not met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-else)
     */
    public fun elseValue(): Any? = unwrap(this).getElseValue()

    /**
     * The name of a field.
     *
     * Specify this when the property is a data model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The value of the property to evaluate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-operand)
     */
    public fun operand(): String? = unwrap(this).getOperand()

    /**
     * The type of the property to evaluate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-operandtype)
     */
    public fun operandType(): String? = unwrap(this).getOperandType()

    /**
     * The operator to use to perform the evaluation, such as `eq` to represent equals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-operator)
     */
    public fun `operator`(): String? = unwrap(this).getOperator()

    /**
     * The name of the conditional property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-property)
     */
    public fun `property`(): String? = unwrap(this).getProperty()

    /**
     * The value to assign to the property if the condition is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-then)
     */
    public fun then(): Any? = unwrap(this).getThen()

    /**
     * A builder for [ComponentConditionPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param elseValue The value to assign to the property if the condition is not met.
       */
      public fun elseValue(elseValue: IResolvable)

      /**
       * @param elseValue The value to assign to the property if the condition is not met.
       */
      public fun elseValue(elseValue: ComponentPropertyProperty)

      /**
       * @param elseValue The value to assign to the property if the condition is not met.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eca01b8b92d9526b56f720609de95a3966bbd801629f5d93e39777c641a8b2a4")
      public fun elseValue(elseValue: ComponentPropertyProperty.Builder.() -> Unit)

      /**
       * @param field The name of a field.
       * Specify this when the property is a data model.
       */
      public fun `field`(`field`: String)

      /**
       * @param operand The value of the property to evaluate.
       */
      public fun operand(operand: String)

      /**
       * @param operandType The type of the property to evaluate.
       */
      public fun operandType(operandType: String)

      /**
       * @param operator The operator to use to perform the evaluation, such as `eq` to represent
       * equals.
       */
      public fun `operator`(`operator`: String)

      /**
       * @param property The name of the conditional property.
       */
      public fun `property`(`property`: String)

      /**
       * @param then The value to assign to the property if the condition is met.
       */
      public fun then(then: IResolvable)

      /**
       * @param then The value to assign to the property if the condition is met.
       */
      public fun then(then: ComponentPropertyProperty)

      /**
       * @param then The value to assign to the property if the condition is met.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40f024eeb71e4a3806fdb425ae62ef18b8adba72de5a6c410aea5203f23f681e")
      public fun then(then: ComponentPropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty.builder()

      /**
       * @param elseValue The value to assign to the property if the condition is not met.
       */
      override fun elseValue(elseValue: IResolvable) {
        cdkBuilder.elseValue(elseValue.let(IResolvable::unwrap))
      }

      /**
       * @param elseValue The value to assign to the property if the condition is not met.
       */
      override fun elseValue(elseValue: ComponentPropertyProperty) {
        cdkBuilder.elseValue(elseValue.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param elseValue The value to assign to the property if the condition is not met.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eca01b8b92d9526b56f720609de95a3966bbd801629f5d93e39777c641a8b2a4")
      override fun elseValue(elseValue: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          elseValue(ComponentPropertyProperty(elseValue))

      /**
       * @param field The name of a field.
       * Specify this when the property is a data model.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param operand The value of the property to evaluate.
       */
      override fun operand(operand: String) {
        cdkBuilder.operand(operand)
      }

      /**
       * @param operandType The type of the property to evaluate.
       */
      override fun operandType(operandType: String) {
        cdkBuilder.operandType(operandType)
      }

      /**
       * @param operator The operator to use to perform the evaluation, such as `eq` to represent
       * equals.
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param property The name of the conditional property.
       */
      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      /**
       * @param then The value to assign to the property if the condition is met.
       */
      override fun then(then: IResolvable) {
        cdkBuilder.then(then.let(IResolvable::unwrap))
      }

      /**
       * @param then The value to assign to the property if the condition is met.
       */
      override fun then(then: ComponentPropertyProperty) {
        cdkBuilder.then(then.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param then The value to assign to the property if the condition is met.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40f024eeb71e4a3806fdb425ae62ef18b8adba72de5a6c410aea5203f23f681e")
      override fun then(then: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          then(ComponentPropertyProperty(then))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty,
    ) : CdkObject(cdkObject), ComponentConditionPropertyProperty {
      /**
       * The value to assign to the property if the condition is not met.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-else)
       */
      override fun elseValue(): Any? = unwrap(this).getElseValue()

      /**
       * The name of a field.
       *
       * Specify this when the property is a data model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The value of the property to evaluate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-operand)
       */
      override fun operand(): String? = unwrap(this).getOperand()

      /**
       * The type of the property to evaluate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-operandtype)
       */
      override fun operandType(): String? = unwrap(this).getOperandType()

      /**
       * The operator to use to perform the evaluation, such as `eq` to represent equals.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-operator)
       */
      override fun `operator`(): String? = unwrap(this).getOperator()

      /**
       * The name of the conditional property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-property)
       */
      override fun `property`(): String? = unwrap(this).getProperty()

      /**
       * The value to assign to the property if the condition is met.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentconditionproperty.html#cfn-amplifyuibuilder-component-componentconditionproperty-then)
       */
      override fun then(): Any? = unwrap(this).getThen()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentConditionPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty):
          ComponentConditionPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentConditionPropertyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConditionPropertyProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentConditionPropertyProperty
    }
  }

  /**
   * The `ComponentBindingPropertiesValue` property specifies the data binding configuration for a
   * component at runtime.
   *
   * You can use `ComponentBindingPropertiesValue` to add exposed properties to a component to allow
   * different values to be entered when a component is reused in different places in an app.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * PredicateProperty predicateProperty_;
   * ComponentBindingPropertiesValueProperty componentBindingPropertiesValueProperty =
   * ComponentBindingPropertiesValueProperty.builder()
   * .bindingProperties(ComponentBindingPropertiesValuePropertiesProperty.builder()
   * .bucket("bucket")
   * .defaultValue("defaultValue")
   * .field("field")
   * .key("key")
   * .model("model")
   * .predicates(List.of(PredicateProperty.builder()
   * .and(List.of(predicateProperty_))
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .or(List.of(predicateProperty_))
   * .build()))
   * .slotName("slotName")
   * .userAttribute("userAttribute")
   * .build())
   * .defaultValue("defaultValue")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalue.html)
   */
  public interface ComponentBindingPropertiesValueProperty {
    /**
     * Describes the properties to customize with data at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalue.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalue-bindingproperties)
     */
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    /**
     * The default value of the property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalue.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalue-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * The property type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalue.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalue-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ComponentBindingPropertiesValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      public fun bindingProperties(bindingProperties: IResolvable)

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      public
          fun bindingProperties(bindingProperties: ComponentBindingPropertiesValuePropertiesProperty)

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1692f10397a6ae11fa8801385935e558d961ff4ad8638e3301b1012903fbe79f")
      public
          fun bindingProperties(bindingProperties: ComponentBindingPropertiesValuePropertiesProperty.Builder.() -> Unit)

      /**
       * @param defaultValue The default value of the property.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param type The property type.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty.builder()

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      override
          fun bindingProperties(bindingProperties: ComponentBindingPropertiesValuePropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties.let(ComponentBindingPropertiesValuePropertiesProperty::unwrap))
      }

      /**
       * @param bindingProperties Describes the properties to customize with data at runtime.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1692f10397a6ae11fa8801385935e558d961ff4ad8638e3301b1012903fbe79f")
      override
          fun bindingProperties(bindingProperties: ComponentBindingPropertiesValuePropertiesProperty.Builder.() -> Unit):
          Unit =
          bindingProperties(ComponentBindingPropertiesValuePropertiesProperty(bindingProperties))

      /**
       * @param defaultValue The default value of the property.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param type The property type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty,
    ) : CdkObject(cdkObject), ComponentBindingPropertiesValueProperty {
      /**
       * Describes the properties to customize with data at runtime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalue.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalue-bindingproperties)
       */
      override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      /**
       * The default value of the property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalue.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalue-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * The property type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentbindingpropertiesvalue.html#cfn-amplifyuibuilder-component-componentbindingpropertiesvalue-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentBindingPropertiesValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty):
          ComponentBindingPropertiesValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentBindingPropertiesValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentBindingPropertiesValueProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentBindingPropertiesValueProperty
    }
  }

  /**
   * The `Predicate` property specifies information for generating Amplify DataStore queries.
   *
   * Use `Predicate` to retrieve a subset of the data in a collection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * PredicateProperty predicateProperty_;
   * PredicateProperty predicateProperty = PredicateProperty.builder()
   * .and(List.of(predicateProperty_))
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .or(List.of(predicateProperty_))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html)
   */
  public interface PredicateProperty {
    /**
     * A list of predicates to combine logically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-and)
     */
    public fun and(): Any? = unwrap(this).getAnd()

    /**
     * The field to query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The value to use when performing the evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-operand)
     */
    public fun operand(): String? = unwrap(this).getOperand()

    /**
     * The type of value to use when performing the evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-operandtype)
     */
    public fun operandType(): String? = unwrap(this).getOperandType()

    /**
     * The operator to use to perform the evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-operator)
     */
    public fun `operator`(): String? = unwrap(this).getOperator()

    /**
     * A list of predicates to combine logically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-or)
     */
    public fun or(): Any? = unwrap(this).getOr()

    /**
     * A builder for [PredicateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param and A list of predicates to combine logically.
       */
      public fun and(and: IResolvable)

      /**
       * @param and A list of predicates to combine logically.
       */
      public fun and(and: List<Any>)

      /**
       * @param and A list of predicates to combine logically.
       */
      public fun and(vararg and: Any)

      /**
       * @param field The field to query.
       */
      public fun `field`(`field`: String)

      /**
       * @param operand The value to use when performing the evaluation.
       */
      public fun operand(operand: String)

      /**
       * @param operandType The type of value to use when performing the evaluation.
       */
      public fun operandType(operandType: String)

      /**
       * @param operator The operator to use to perform the evaluation.
       */
      public fun `operator`(`operator`: String)

      /**
       * @param or A list of predicates to combine logically.
       */
      public fun or(or: IResolvable)

      /**
       * @param or A list of predicates to combine logically.
       */
      public fun or(or: List<Any>)

      /**
       * @param or A list of predicates to combine logically.
       */
      public fun or(vararg or: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty.builder()

      /**
       * @param and A list of predicates to combine logically.
       */
      override fun and(and: IResolvable) {
        cdkBuilder.and(and.let(IResolvable::unwrap))
      }

      /**
       * @param and A list of predicates to combine logically.
       */
      override fun and(and: List<Any>) {
        cdkBuilder.and(and)
      }

      /**
       * @param and A list of predicates to combine logically.
       */
      override fun and(vararg and: Any): Unit = and(and.toList())

      /**
       * @param field The field to query.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param operand The value to use when performing the evaluation.
       */
      override fun operand(operand: String) {
        cdkBuilder.operand(operand)
      }

      /**
       * @param operandType The type of value to use when performing the evaluation.
       */
      override fun operandType(operandType: String) {
        cdkBuilder.operandType(operandType)
      }

      /**
       * @param operator The operator to use to perform the evaluation.
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param or A list of predicates to combine logically.
       */
      override fun or(or: IResolvable) {
        cdkBuilder.or(or.let(IResolvable::unwrap))
      }

      /**
       * @param or A list of predicates to combine logically.
       */
      override fun or(or: List<Any>) {
        cdkBuilder.or(or)
      }

      /**
       * @param or A list of predicates to combine logically.
       */
      override fun or(vararg or: Any): Unit = or(or.toList())

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty,
    ) : CdkObject(cdkObject), PredicateProperty {
      /**
       * A list of predicates to combine logically.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-and)
       */
      override fun and(): Any? = unwrap(this).getAnd()

      /**
       * The field to query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The value to use when performing the evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-operand)
       */
      override fun operand(): String? = unwrap(this).getOperand()

      /**
       * The type of value to use when performing the evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-operandtype)
       */
      override fun operandType(): String? = unwrap(this).getOperandType()

      /**
       * The operator to use to perform the evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-operator)
       */
      override fun `operator`(): String? = unwrap(this).getOperator()

      /**
       * A list of predicates to combine logically.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-predicate.html#cfn-amplifyuibuilder-component-predicate-or)
       */
      override fun or(): Any? = unwrap(this).getOr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty):
          PredicateProperty = CdkObjectWrappers.wrap(cdkObject) as? PredicateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.PredicateProperty
    }
  }

  /**
   * The `ComponentPropertyBindingProperties` property specifies a component property to associate
   * with a binding property.
   *
   * This enables exposed properties on the top level component to propagate data to the component's
   * property values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * ComponentPropertyBindingPropertiesProperty componentPropertyBindingPropertiesProperty =
   * ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentpropertybindingproperties.html)
   */
  public interface ComponentPropertyBindingPropertiesProperty {
    /**
     * The data field to bind the property to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentpropertybindingproperties.html#cfn-amplifyuibuilder-component-componentpropertybindingproperties-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The component property to bind to the data field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentpropertybindingproperties.html#cfn-amplifyuibuilder-component-componentpropertybindingproperties-property)
     */
    public fun `property`(): String

    /**
     * A builder for [ComponentPropertyBindingPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param field The data field to bind the property to.
       */
      public fun `field`(`field`: String)

      /**
       * @param property The component property to bind to the data field. 
       */
      public fun `property`(`property`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty.builder()

      /**
       * @param field The data field to bind the property to.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param property The component property to bind to the data field. 
       */
      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty,
    ) : CdkObject(cdkObject), ComponentPropertyBindingPropertiesProperty {
      /**
       * The data field to bind the property to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentpropertybindingproperties.html#cfn-amplifyuibuilder-component-componentpropertybindingproperties-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The component property to bind to the data field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentpropertybindingproperties.html#cfn-amplifyuibuilder-component-componentpropertybindingproperties-property)
       */
      override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentPropertyBindingPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty):
          ComponentPropertyBindingPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentPropertyBindingPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentPropertyBindingPropertiesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentPropertyBindingPropertiesProperty
    }
  }

  /**
   * The `ComponentVariant` property specifies the style configuration of a unique variation of a
   * main component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * Object overrides;
   * ComponentVariantProperty componentVariantProperty = ComponentVariantProperty.builder()
   * .overrides(overrides)
   * .variantValues(Map.of(
   * "variantValuesKey", "variantValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentvariant.html)
   */
  public interface ComponentVariantProperty {
    /**
     * The properties of the component variant that can be overriden when customizing an instance of
     * the component.
     *
     * You can't specify `tags` as a valid property for `overrides` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentvariant.html#cfn-amplifyuibuilder-component-componentvariant-overrides)
     */
    public fun overrides(): Any? = unwrap(this).getOverrides()

    /**
     * The combination of variants that comprise this variant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentvariant.html#cfn-amplifyuibuilder-component-componentvariant-variantvalues)
     */
    public fun variantValues(): Any? = unwrap(this).getVariantValues()

    /**
     * A builder for [ComponentVariantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param overrides The properties of the component variant that can be overriden when
       * customizing an instance of the component.
       * You can't specify `tags` as a valid property for `overrides` .
       */
      public fun overrides(overrides: Any)

      /**
       * @param variantValues The combination of variants that comprise this variant.
       */
      public fun variantValues(variantValues: IResolvable)

      /**
       * @param variantValues The combination of variants that comprise this variant.
       */
      public fun variantValues(variantValues: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty.builder()

      /**
       * @param overrides The properties of the component variant that can be overriden when
       * customizing an instance of the component.
       * You can't specify `tags` as a valid property for `overrides` .
       */
      override fun overrides(overrides: Any) {
        cdkBuilder.overrides(overrides)
      }

      /**
       * @param variantValues The combination of variants that comprise this variant.
       */
      override fun variantValues(variantValues: IResolvable) {
        cdkBuilder.variantValues(variantValues.let(IResolvable::unwrap))
      }

      /**
       * @param variantValues The combination of variants that comprise this variant.
       */
      override fun variantValues(variantValues: Map<String, String>) {
        cdkBuilder.variantValues(variantValues)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty,
    ) : CdkObject(cdkObject), ComponentVariantProperty {
      /**
       * The properties of the component variant that can be overriden when customizing an instance
       * of the component.
       *
       * You can't specify `tags` as a valid property for `overrides` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentvariant.html#cfn-amplifyuibuilder-component-componentvariant-overrides)
       */
      override fun overrides(): Any? = unwrap(this).getOverrides()

      /**
       * The combination of variants that comprise this variant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentvariant.html#cfn-amplifyuibuilder-component-componentvariant-variantvalues)
       */
      override fun variantValues(): Any? = unwrap(this).getVariantValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty):
          ComponentVariantProperty = CdkObjectWrappers.wrap(cdkObject) as? ComponentVariantProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentVariantProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentVariantProperty
    }
  }

  /**
   * Represents the event action configuration for an element of a `Component` or `ComponentChild` .
   *
   * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
   * components. `ActionParameters` defines the action that is performed when an event occurs on the
   * component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * ComponentPropertyProperty componentPropertyProperty_;
   * ActionParametersProperty actionParametersProperty = ActionParametersProperty.builder()
   * .anchor(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .fields(Map.of(
   * "fieldsKey", ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build()))
   * .global(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .id(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .model("model")
   * .state(MutationActionSetStateParameterProperty.builder()
   * .componentName("componentName")
   * .property("property")
   * .set(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .build())
   * .target(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .type(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .url(ComponentPropertyProperty.builder()
   * .bindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .bindings(Map.of(
   * "bindingsKey", FormBindingElementProperty.builder()
   * .element("element")
   * .property("property")
   * .build()))
   * .collectionBindingProperties(ComponentPropertyBindingPropertiesProperty.builder()
   * .property("property")
   * // the properties below are optional
   * .field("field")
   * .build())
   * .componentName("componentName")
   * .concat(List.of(componentPropertyProperty_))
   * .condition(ComponentConditionPropertyProperty.builder()
   * .else(componentPropertyProperty_)
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .property("property")
   * .then(componentPropertyProperty_)
   * .build())
   * .configured(false)
   * .defaultValue("defaultValue")
   * .event("event")
   * .importedValue("importedValue")
   * .model("model")
   * .property("property")
   * .type("type")
   * .userAttribute("userAttribute")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html)
   */
  public interface ActionParametersProperty {
    /**
     * The HTML anchor link to the location to open.
     *
     * Specify this value for a navigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-anchor)
     */
    public fun anchor(): Any? = unwrap(this).getAnchor()

    /**
     * A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model.
     *
     * Use when the action performs an operation on an Amplify DataStore model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-fields)
     */
    public fun fields(): Any? = unwrap(this).getFields()

    /**
     * Specifies whether the user should be signed out globally.
     *
     * Specify this value for an auth sign out action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-global)
     */
    public fun global(): Any? = unwrap(this).getGlobal()

    /**
     * The unique ID of the component that the `ActionParameters` apply to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-id)
     */
    public fun id(): Any? = unwrap(this).getId()

    /**
     * The name of the data model.
     *
     * Use when the action performs an operation on an Amplify DataStore model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-model)
     */
    public fun model(): String? = unwrap(this).getModel()

    /**
     * A key-value pair that specifies the state property name and its initial value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-state)
     */
    public fun state(): Any? = unwrap(this).getState()

    /**
     * The element within the same component to modify when the action occurs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-target)
     */
    public fun target(): Any? = unwrap(this).getTarget()

    /**
     * The type of navigation action.
     *
     * Valid values are `url` and `anchor` . This value is required for a navigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-type)
     */
    public fun type(): Any? = unwrap(this).getType()

    /**
     * The URL to the location to open.
     *
     * Specify this value for a navigation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-url)
     */
    public fun url(): Any? = unwrap(this).getUrl()

    /**
     * A builder for [ActionParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param anchor The HTML anchor link to the location to open.
       * Specify this value for a navigation action.
       */
      public fun anchor(anchor: IResolvable)

      /**
       * @param anchor The HTML anchor link to the location to open.
       * Specify this value for a navigation action.
       */
      public fun anchor(anchor: ComponentPropertyProperty)

      /**
       * @param anchor The HTML anchor link to the location to open.
       * Specify this value for a navigation action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b99fc0a65594fae1e242ee44d06d80da334b5849915ec16f39b8b408ab72a670")
      public fun anchor(anchor: ComponentPropertyProperty.Builder.() -> Unit)

      /**
       * @param fields A dictionary of key-value pairs mapping Amplify Studio properties to fields
       * in a data model.
       * Use when the action performs an operation on an Amplify DataStore model.
       */
      public fun fields(fields: IResolvable)

      /**
       * @param fields A dictionary of key-value pairs mapping Amplify Studio properties to fields
       * in a data model.
       * Use when the action performs an operation on an Amplify DataStore model.
       */
      public fun fields(fields: Map<String, Any>)

      /**
       * @param global Specifies whether the user should be signed out globally.
       * Specify this value for an auth sign out action.
       */
      public fun global(global: IResolvable)

      /**
       * @param global Specifies whether the user should be signed out globally.
       * Specify this value for an auth sign out action.
       */
      public fun global(global: ComponentPropertyProperty)

      /**
       * @param global Specifies whether the user should be signed out globally.
       * Specify this value for an auth sign out action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56dda333eb785f4338e29ac168711f8b5ef42304bac44d78dec3135a2045cbbb")
      public fun global(global: ComponentPropertyProperty.Builder.() -> Unit)

      /**
       * @param id The unique ID of the component that the `ActionParameters` apply to.
       */
      public fun id(id: IResolvable)

      /**
       * @param id The unique ID of the component that the `ActionParameters` apply to.
       */
      public fun id(id: ComponentPropertyProperty)

      /**
       * @param id The unique ID of the component that the `ActionParameters` apply to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e11d4ed0b9dfe83d7a76ae590944cd50c9096a38808380b4243a847062b562a2")
      public fun id(id: ComponentPropertyProperty.Builder.() -> Unit)

      /**
       * @param model The name of the data model.
       * Use when the action performs an operation on an Amplify DataStore model.
       */
      public fun model(model: String)

      /**
       * @param state A key-value pair that specifies the state property name and its initial value.
       */
      public fun state(state: IResolvable)

      /**
       * @param state A key-value pair that specifies the state property name and its initial value.
       */
      public fun state(state: MutationActionSetStateParameterProperty)

      /**
       * @param state A key-value pair that specifies the state property name and its initial value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b05b4096837075a71dfa3d3fa8ded0e88897a8d87c89734554e5d74a3ad83208")
      public fun state(state: MutationActionSetStateParameterProperty.Builder.() -> Unit)

      /**
       * @param target The element within the same component to modify when the action occurs.
       */
      public fun target(target: IResolvable)

      /**
       * @param target The element within the same component to modify when the action occurs.
       */
      public fun target(target: ComponentPropertyProperty)

      /**
       * @param target The element within the same component to modify when the action occurs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5b059659d10e5bdc3d91347b4d72756f093694d997f855776a6cc043c4c1705")
      public fun target(target: ComponentPropertyProperty.Builder.() -> Unit)

      /**
       * @param type The type of navigation action.
       * Valid values are `url` and `anchor` . This value is required for a navigation action.
       */
      public fun type(type: IResolvable)

      /**
       * @param type The type of navigation action.
       * Valid values are `url` and `anchor` . This value is required for a navigation action.
       */
      public fun type(type: ComponentPropertyProperty)

      /**
       * @param type The type of navigation action.
       * Valid values are `url` and `anchor` . This value is required for a navigation action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7342f6066ddaff2c907eb9bb3b8099bd7317f9ea594e28953470da7aacd19cd3")
      public fun type(type: ComponentPropertyProperty.Builder.() -> Unit)

      /**
       * @param url The URL to the location to open.
       * Specify this value for a navigation action.
       */
      public fun url(url: IResolvable)

      /**
       * @param url The URL to the location to open.
       * Specify this value for a navigation action.
       */
      public fun url(url: ComponentPropertyProperty)

      /**
       * @param url The URL to the location to open.
       * Specify this value for a navigation action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36bca09fd23e69f3b7e7ca1a6a4546eb710cd44df45097796b263c13e5ca35fd")
      public fun url(url: ComponentPropertyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty.builder()

      /**
       * @param anchor The HTML anchor link to the location to open.
       * Specify this value for a navigation action.
       */
      override fun anchor(anchor: IResolvable) {
        cdkBuilder.anchor(anchor.let(IResolvable::unwrap))
      }

      /**
       * @param anchor The HTML anchor link to the location to open.
       * Specify this value for a navigation action.
       */
      override fun anchor(anchor: ComponentPropertyProperty) {
        cdkBuilder.anchor(anchor.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param anchor The HTML anchor link to the location to open.
       * Specify this value for a navigation action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b99fc0a65594fae1e242ee44d06d80da334b5849915ec16f39b8b408ab72a670")
      override fun anchor(anchor: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          anchor(ComponentPropertyProperty(anchor))

      /**
       * @param fields A dictionary of key-value pairs mapping Amplify Studio properties to fields
       * in a data model.
       * Use when the action performs an operation on an Amplify DataStore model.
       */
      override fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields.let(IResolvable::unwrap))
      }

      /**
       * @param fields A dictionary of key-value pairs mapping Amplify Studio properties to fields
       * in a data model.
       * Use when the action performs an operation on an Amplify DataStore model.
       */
      override fun fields(fields: Map<String, Any>) {
        cdkBuilder.fields(fields)
      }

      /**
       * @param global Specifies whether the user should be signed out globally.
       * Specify this value for an auth sign out action.
       */
      override fun global(global: IResolvable) {
        cdkBuilder.global(global.let(IResolvable::unwrap))
      }

      /**
       * @param global Specifies whether the user should be signed out globally.
       * Specify this value for an auth sign out action.
       */
      override fun global(global: ComponentPropertyProperty) {
        cdkBuilder.global(global.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param global Specifies whether the user should be signed out globally.
       * Specify this value for an auth sign out action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56dda333eb785f4338e29ac168711f8b5ef42304bac44d78dec3135a2045cbbb")
      override fun global(global: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          global(ComponentPropertyProperty(global))

      /**
       * @param id The unique ID of the component that the `ActionParameters` apply to.
       */
      override fun id(id: IResolvable) {
        cdkBuilder.id(id.let(IResolvable::unwrap))
      }

      /**
       * @param id The unique ID of the component that the `ActionParameters` apply to.
       */
      override fun id(id: ComponentPropertyProperty) {
        cdkBuilder.id(id.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param id The unique ID of the component that the `ActionParameters` apply to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e11d4ed0b9dfe83d7a76ae590944cd50c9096a38808380b4243a847062b562a2")
      override fun id(id: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          id(ComponentPropertyProperty(id))

      /**
       * @param model The name of the data model.
       * Use when the action performs an operation on an Amplify DataStore model.
       */
      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      /**
       * @param state A key-value pair that specifies the state property name and its initial value.
       */
      override fun state(state: IResolvable) {
        cdkBuilder.state(state.let(IResolvable::unwrap))
      }

      /**
       * @param state A key-value pair that specifies the state property name and its initial value.
       */
      override fun state(state: MutationActionSetStateParameterProperty) {
        cdkBuilder.state(state.let(MutationActionSetStateParameterProperty::unwrap))
      }

      /**
       * @param state A key-value pair that specifies the state property name and its initial value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b05b4096837075a71dfa3d3fa8ded0e88897a8d87c89734554e5d74a3ad83208")
      override fun state(state: MutationActionSetStateParameterProperty.Builder.() -> Unit): Unit =
          state(MutationActionSetStateParameterProperty(state))

      /**
       * @param target The element within the same component to modify when the action occurs.
       */
      override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable::unwrap))
      }

      /**
       * @param target The element within the same component to modify when the action occurs.
       */
      override fun target(target: ComponentPropertyProperty) {
        cdkBuilder.target(target.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param target The element within the same component to modify when the action occurs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5b059659d10e5bdc3d91347b4d72756f093694d997f855776a6cc043c4c1705")
      override fun target(target: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          target(ComponentPropertyProperty(target))

      /**
       * @param type The type of navigation action.
       * Valid values are `url` and `anchor` . This value is required for a navigation action.
       */
      override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable::unwrap))
      }

      /**
       * @param type The type of navigation action.
       * Valid values are `url` and `anchor` . This value is required for a navigation action.
       */
      override fun type(type: ComponentPropertyProperty) {
        cdkBuilder.type(type.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param type The type of navigation action.
       * Valid values are `url` and `anchor` . This value is required for a navigation action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7342f6066ddaff2c907eb9bb3b8099bd7317f9ea594e28953470da7aacd19cd3")
      override fun type(type: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          type(ComponentPropertyProperty(type))

      /**
       * @param url The URL to the location to open.
       * Specify this value for a navigation action.
       */
      override fun url(url: IResolvable) {
        cdkBuilder.url(url.let(IResolvable::unwrap))
      }

      /**
       * @param url The URL to the location to open.
       * Specify this value for a navigation action.
       */
      override fun url(url: ComponentPropertyProperty) {
        cdkBuilder.url(url.let(ComponentPropertyProperty::unwrap))
      }

      /**
       * @param url The URL to the location to open.
       * Specify this value for a navigation action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36bca09fd23e69f3b7e7ca1a6a4546eb710cd44df45097796b263c13e5ca35fd")
      override fun url(url: ComponentPropertyProperty.Builder.() -> Unit): Unit =
          url(ComponentPropertyProperty(url))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty,
    ) : CdkObject(cdkObject), ActionParametersProperty {
      /**
       * The HTML anchor link to the location to open.
       *
       * Specify this value for a navigation action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-anchor)
       */
      override fun anchor(): Any? = unwrap(this).getAnchor()

      /**
       * A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data
       * model.
       *
       * Use when the action performs an operation on an Amplify DataStore model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-fields)
       */
      override fun fields(): Any? = unwrap(this).getFields()

      /**
       * Specifies whether the user should be signed out globally.
       *
       * Specify this value for an auth sign out action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-global)
       */
      override fun global(): Any? = unwrap(this).getGlobal()

      /**
       * The unique ID of the component that the `ActionParameters` apply to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-id)
       */
      override fun id(): Any? = unwrap(this).getId()

      /**
       * The name of the data model.
       *
       * Use when the action performs an operation on an Amplify DataStore model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-model)
       */
      override fun model(): String? = unwrap(this).getModel()

      /**
       * A key-value pair that specifies the state property name and its initial value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-state)
       */
      override fun state(): Any? = unwrap(this).getState()

      /**
       * The element within the same component to modify when the action occurs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-target)
       */
      override fun target(): Any? = unwrap(this).getTarget()

      /**
       * The type of navigation action.
       *
       * Valid values are `url` and `anchor` . This value is required for a navigation action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-type)
       */
      override fun type(): Any? = unwrap(this).getType()

      /**
       * The URL to the location to open.
       *
       * Specify this value for a navigation action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-actionparameters.html#cfn-amplifyuibuilder-component-actionparameters-url)
       */
      override fun url(): Any? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty):
          ActionParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionParametersProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionParametersProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ActionParametersProperty
    }
  }

  /**
   * The `ComponentDataConfiguration` property specifies the configuration for binding a component's
   * properties to data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplifyuibuilder.*;
   * PredicateProperty predicateProperty_;
   * ComponentDataConfigurationProperty componentDataConfigurationProperty =
   * ComponentDataConfigurationProperty.builder()
   * .model("model")
   * // the properties below are optional
   * .identifiers(List.of("identifiers"))
   * .predicate(PredicateProperty.builder()
   * .and(List.of(predicateProperty_))
   * .field("field")
   * .operand("operand")
   * .operandType("operandType")
   * .operator("operator")
   * .or(List.of(predicateProperty_))
   * .build())
   * .sort(List.of(SortPropertyProperty.builder()
   * .direction("direction")
   * .field("field")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html)
   */
  public interface ComponentDataConfigurationProperty {
    /**
     * A list of IDs to use to bind data to a component.
     *
     * Use this property to bind specifically chosen data, rather than data retrieved from a query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html#cfn-amplifyuibuilder-component-componentdataconfiguration-identifiers)
     */
    public fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

    /**
     * The name of the data model to use to bind data to a component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html#cfn-amplifyuibuilder-component-componentdataconfiguration-model)
     */
    public fun model(): String

    /**
     * Represents the conditional logic to use when binding data to a component.
     *
     * Use this property to retrieve only a subset of the data in a collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html#cfn-amplifyuibuilder-component-componentdataconfiguration-predicate)
     */
    public fun predicate(): Any? = unwrap(this).getPredicate()

    /**
     * Describes how to sort the component's properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html#cfn-amplifyuibuilder-component-componentdataconfiguration-sort)
     */
    public fun sort(): Any? = unwrap(this).getSort()

    /**
     * A builder for [ComponentDataConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param identifiers A list of IDs to use to bind data to a component.
       * Use this property to bind specifically chosen data, rather than data retrieved from a
       * query.
       */
      public fun identifiers(identifiers: List<String>)

      /**
       * @param identifiers A list of IDs to use to bind data to a component.
       * Use this property to bind specifically chosen data, rather than data retrieved from a
       * query.
       */
      public fun identifiers(vararg identifiers: String)

      /**
       * @param model The name of the data model to use to bind data to a component. 
       */
      public fun model(model: String)

      /**
       * @param predicate Represents the conditional logic to use when binding data to a component.
       * Use this property to retrieve only a subset of the data in a collection.
       */
      public fun predicate(predicate: IResolvable)

      /**
       * @param predicate Represents the conditional logic to use when binding data to a component.
       * Use this property to retrieve only a subset of the data in a collection.
       */
      public fun predicate(predicate: PredicateProperty)

      /**
       * @param predicate Represents the conditional logic to use when binding data to a component.
       * Use this property to retrieve only a subset of the data in a collection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fc9628f2bca7ef392d9c2c88057753e581a430b34742ede1c075d08502caaa7")
      public fun predicate(predicate: PredicateProperty.Builder.() -> Unit)

      /**
       * @param sort Describes how to sort the component's properties.
       */
      public fun sort(sort: IResolvable)

      /**
       * @param sort Describes how to sort the component's properties.
       */
      public fun sort(sort: List<Any>)

      /**
       * @param sort Describes how to sort the component's properties.
       */
      public fun sort(vararg sort: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty.builder()

      /**
       * @param identifiers A list of IDs to use to bind data to a component.
       * Use this property to bind specifically chosen data, rather than data retrieved from a
       * query.
       */
      override fun identifiers(identifiers: List<String>) {
        cdkBuilder.identifiers(identifiers)
      }

      /**
       * @param identifiers A list of IDs to use to bind data to a component.
       * Use this property to bind specifically chosen data, rather than data retrieved from a
       * query.
       */
      override fun identifiers(vararg identifiers: String): Unit = identifiers(identifiers.toList())

      /**
       * @param model The name of the data model to use to bind data to a component. 
       */
      override fun model(model: String) {
        cdkBuilder.model(model)
      }

      /**
       * @param predicate Represents the conditional logic to use when binding data to a component.
       * Use this property to retrieve only a subset of the data in a collection.
       */
      override fun predicate(predicate: IResolvable) {
        cdkBuilder.predicate(predicate.let(IResolvable::unwrap))
      }

      /**
       * @param predicate Represents the conditional logic to use when binding data to a component.
       * Use this property to retrieve only a subset of the data in a collection.
       */
      override fun predicate(predicate: PredicateProperty) {
        cdkBuilder.predicate(predicate.let(PredicateProperty::unwrap))
      }

      /**
       * @param predicate Represents the conditional logic to use when binding data to a component.
       * Use this property to retrieve only a subset of the data in a collection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fc9628f2bca7ef392d9c2c88057753e581a430b34742ede1c075d08502caaa7")
      override fun predicate(predicate: PredicateProperty.Builder.() -> Unit): Unit =
          predicate(PredicateProperty(predicate))

      /**
       * @param sort Describes how to sort the component's properties.
       */
      override fun sort(sort: IResolvable) {
        cdkBuilder.sort(sort.let(IResolvable::unwrap))
      }

      /**
       * @param sort Describes how to sort the component's properties.
       */
      override fun sort(sort: List<Any>) {
        cdkBuilder.sort(sort)
      }

      /**
       * @param sort Describes how to sort the component's properties.
       */
      override fun sort(vararg sort: Any): Unit = sort(sort.toList())

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty,
    ) : CdkObject(cdkObject), ComponentDataConfigurationProperty {
      /**
       * A list of IDs to use to bind data to a component.
       *
       * Use this property to bind specifically chosen data, rather than data retrieved from a
       * query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html#cfn-amplifyuibuilder-component-componentdataconfiguration-identifiers)
       */
      override fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

      /**
       * The name of the data model to use to bind data to a component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html#cfn-amplifyuibuilder-component-componentdataconfiguration-model)
       */
      override fun model(): String = unwrap(this).getModel()

      /**
       * Represents the conditional logic to use when binding data to a component.
       *
       * Use this property to retrieve only a subset of the data in a collection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html#cfn-amplifyuibuilder-component-componentdataconfiguration-predicate)
       */
      override fun predicate(): Any? = unwrap(this).getPredicate()

      /**
       * Describes how to sort the component's properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-component-componentdataconfiguration.html#cfn-amplifyuibuilder-component-componentdataconfiguration-sort)
       */
      override fun sort(): Any? = unwrap(this).getSort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentDataConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty):
          ComponentDataConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentDataConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentDataConfigurationProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnComponent.ComponentDataConfigurationProperty
    }
  }
}
