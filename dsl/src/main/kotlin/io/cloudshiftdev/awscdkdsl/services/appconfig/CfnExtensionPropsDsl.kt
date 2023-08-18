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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnExtensionProps

/**
 * Properties for defining a `CfnExtension`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * Object actions;
 * CfnExtensionProps cfnExtensionProps = CfnExtensionProps.builder()
 * .actions(actions)
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .latestVersionNumber(123)
 * .parameters(Map.of(
 * "parametersKey", ParameterProperty.builder()
 * .required(false)
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html)
 */
@CdkDslMarker
public class CfnExtensionPropsDsl {
    private val cdkBuilder: CfnExtensionProps.Builder = CfnExtensionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param actions The actions defined in the extension. */
    public fun actions(actions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(actions)
        cdkBuilder.actions(builder.map)
    }

    /** @param actions The actions defined in the extension. */
    public fun actions(actions: Any) {
        cdkBuilder.actions(actions)
    }

    /** @param description Information about the extension. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param latestVersionNumber You can omit this field when you create an extension. When you
     *   create a new version, specify the most recent current version number. For example, you
     *   create version 3, enter 2 for this field.
     */
    public fun latestVersionNumber(latestVersionNumber: Number) {
        cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * @param name A name for the extension. Each extension name in your account must be unique.
     *   Extension versions use the same name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param parameters The parameters accepted by the extension. You specify parameter values when
     *   you associate the extension to an AWS AppConfig resource by using the
     *   `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these parameters
     *   are included in the Lambda request object.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * @param parameters The parameters accepted by the extension. You specify parameter values when
     *   you associate the extension to an AWS AppConfig resource by using the
     *   `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these parameters
     *   are included in the Lambda request object.
     */
    public fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param parameters The parameters accepted by the extension. You specify parameter values when
     *   you associate the extension to an AWS AppConfig resource by using the
     *   `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these parameters
     *   are included in the Lambda request object.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags Adds one or more tags for the specified extension. Tags are metadata that help
     *   you categorize resources in different ways, for example, by purpose, owner, or environment.
     *   Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Adds one or more tags for the specified extension. Tags are metadata that help
     *   you categorize resources in different ways, for example, by purpose, owner, or environment.
     *   Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnExtensionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
