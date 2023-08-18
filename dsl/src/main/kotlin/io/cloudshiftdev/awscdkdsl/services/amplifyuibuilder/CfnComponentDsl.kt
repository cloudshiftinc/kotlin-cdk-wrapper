@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.amplifyuibuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import software.constructs.Construct

/**
 * The AWS::AmplifyUIBuilder::Component resource specifies a component within an Amplify app.
 *
 * A component is a user interface (UI) element that you can customize. Use `ComponentChild` to
 * configure an instance of a `Component` . A `ComponentChild` instance inherits the configuration
 * of the main `Component` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html)
 */
@CdkDslMarker
public class CfnComponentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnComponent.Builder = CfnComponent.Builder.create(scope, id)

    private val _children: MutableList<Any> = mutableListOf()

    private val _variants: MutableList<Any> = mutableListOf()

    /**
     * The unique ID of the Amplify app associated with the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-appid)
     *
     * @param appId The unique ID of the Amplify app associated with the component.
     */
    public fun appId(appId: String) {
        cdkBuilder.appId(appId)
    }

    /**
     * The information to connect a component's properties to data at runtime.
     *
     * You can't specify `tags` as a valid property for `bindingProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
     *
     * @param bindingProperties The information to connect a component's properties to data at
     *   runtime.
     */
    public fun bindingProperties(bindingProperties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(bindingProperties)
        cdkBuilder.bindingProperties(builder.map)
    }

    /**
     * The information to connect a component's properties to data at runtime.
     *
     * You can't specify `tags` as a valid property for `bindingProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
     *
     * @param bindingProperties The information to connect a component's properties to data at
     *   runtime.
     */
    public fun bindingProperties(bindingProperties: Map<String, Any>) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /**
     * The information to connect a component's properties to data at runtime.
     *
     * You can't specify `tags` as a valid property for `bindingProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-bindingproperties)
     *
     * @param bindingProperties The information to connect a component's properties to data at
     *   runtime.
     */
    public fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties)
    }

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     *
     * @param children A list of the component's `ComponentChild` instances.
     */
    public fun children(vararg children: Any) {
        _children.addAll(listOf(*children))
    }

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     *
     * @param children A list of the component's `ComponentChild` instances.
     */
    public fun children(children: Collection<Any>) {
        _children.addAll(children)
    }

    /**
     * A list of the component's `ComponentChild` instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-children)
     *
     * @param children A list of the component's `ComponentChild` instances.
     */
    public fun children(children: IResolvable) {
        cdkBuilder.children(children)
    }

    /**
     * The data binding configuration for the component's properties.
     *
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
     *
     * @param collectionProperties The data binding configuration for the component's properties.
     */
    public fun collectionProperties(collectionProperties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(collectionProperties)
        cdkBuilder.collectionProperties(builder.map)
    }

    /**
     * The data binding configuration for the component's properties.
     *
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
     *
     * @param collectionProperties The data binding configuration for the component's properties.
     */
    public fun collectionProperties(collectionProperties: Map<String, Any>) {
        cdkBuilder.collectionProperties(collectionProperties)
    }

    /**
     * The data binding configuration for the component's properties.
     *
     * Use this for a collection component. You can't specify `tags` as a valid property for
     * `collectionProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-collectionproperties)
     *
     * @param collectionProperties The data binding configuration for the component's properties.
     */
    public fun collectionProperties(collectionProperties: IResolvable) {
        cdkBuilder.collectionProperties(collectionProperties)
    }

    /**
     * The type of the component.
     *
     * This can be an Amplify custom UI component or another custom component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-componenttype)
     *
     * @param componentType The type of the component.
     */
    public fun componentType(componentType: String) {
        cdkBuilder.componentType(componentType)
    }

    /**
     * The name of the backend environment that is a part of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-environmentname)
     *
     * @param environmentName The name of the backend environment that is a part of the Amplify app.
     */
    public fun environmentName(environmentName: String) {
        cdkBuilder.environmentName(environmentName)
    }

    /**
     * Describes the events that can be raised on the component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
     *
     * @param events Describes the events that can be raised on the component.
     */
    public fun events(events: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(events)
        cdkBuilder.events(builder.map)
    }

    /**
     * Describes the events that can be raised on the component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
     *
     * @param events Describes the events that can be raised on the component.
     */
    public fun events(events: Map<String, Any>) {
        cdkBuilder.events(events)
    }

    /**
     * Describes the events that can be raised on the component.
     *
     * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-events)
     *
     * @param events Describes the events that can be raised on the component.
     */
    public fun events(events: IResolvable) {
        cdkBuilder.events(events)
    }

    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-name)
     *
     * @param name The name of the component.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Describes the component's properties that can be overriden in a customized instance of the
     * component.
     *
     * You can't specify `tags` as a valid property for `overrides` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-overrides)
     *
     * @param overrides Describes the component's properties that can be overriden in a customized
     *   instance of the component.
     */
    public fun overrides(overrides: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(overrides)
        cdkBuilder.overrides(builder.map)
    }

    /**
     * Describes the component's properties that can be overriden in a customized instance of the
     * component.
     *
     * You can't specify `tags` as a valid property for `overrides` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-overrides)
     *
     * @param overrides Describes the component's properties that can be overriden in a customized
     *   instance of the component.
     */
    public fun overrides(overrides: Any) {
        cdkBuilder.overrides(overrides)
    }

    /**
     * Describes the component's properties.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
     *
     * @param properties Describes the component's properties.
     */
    public fun properties(properties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(properties)
        cdkBuilder.properties(builder.map)
    }

    /**
     * Describes the component's properties.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
     *
     * @param properties Describes the component's properties.
     */
    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    /**
     * Describes the component's properties.
     *
     * You can't specify `tags` as a valid property for `properties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-properties)
     *
     * @param properties Describes the component's properties.
     */
    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    /**
     * The schema version of the component when it was imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-schemaversion)
     *
     * @param schemaVersion The schema version of the component when it was imported.
     */
    public fun schemaVersion(schemaVersion: String) {
        cdkBuilder.schemaVersion(schemaVersion)
    }

    /**
     * The unique ID of the component in its original source system, such as Figma.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-sourceid)
     *
     * @param sourceId The unique ID of the component in its original source system, such as Figma.
     */
    public fun sourceId(sourceId: String) {
        cdkBuilder.sourceId(sourceId)
    }

    /**
     * One or more key-value pairs to use when tagging the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-tags)
     *
     * @param tags One or more key-value pairs to use when tagging the component.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     *
     * @param variants A list of the component's variants.
     */
    public fun variants(vararg variants: Any) {
        _variants.addAll(listOf(*variants))
    }

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     *
     * @param variants A list of the component's variants.
     */
    public fun variants(variants: Collection<Any>) {
        _variants.addAll(variants)
    }

    /**
     * A list of the component's variants.
     *
     * A variant is a unique style configuration of a main component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplifyuibuilder-component.html#cfn-amplifyuibuilder-component-variants)
     *
     * @param variants A list of the component's variants.
     */
    public fun variants(variants: IResolvable) {
        cdkBuilder.variants(variants)
    }

    public fun build(): CfnComponent {
        if (_children.isNotEmpty()) cdkBuilder.children(_children)
        if (_variants.isNotEmpty()) cdkBuilder.variants(_variants)
        return cdkBuilder.build()
    }
}
