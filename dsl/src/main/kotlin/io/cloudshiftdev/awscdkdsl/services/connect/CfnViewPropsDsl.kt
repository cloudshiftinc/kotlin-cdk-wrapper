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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnViewProps

/**
 * Properties for defining a `CfnView`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * Object template;
 * CfnViewProps cfnViewProps = CfnViewProps.builder()
 * .actions(List.of("actions"))
 * .instanceArn("instanceArn")
 * .name("name")
 * .template(template)
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html)
 */
@CdkDslMarker
public class CfnViewPropsDsl {
    private val cdkBuilder: CfnViewProps.Builder = CfnViewProps.builder()

    private val _actions: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param actions A list of actions possible from the view. */
    public fun actions(vararg actions: String) {
        _actions.addAll(listOf(*actions))
    }

    /** @param actions A list of actions possible from the view. */
    public fun actions(actions: Collection<String>) {
        _actions.addAll(actions)
    }

    /** @param description The description of the view. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param instanceArn The Amazon Resource Name (ARN) of the instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the view. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The tags associated with the view resource (not specific to view version). */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags associated with the view resource (not specific to view version). */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param template The view template representing the structure of the view. */
    public fun template(template: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(template)
        cdkBuilder.template(builder.map)
    }

    /** @param template The view template representing the structure of the view. */
    public fun template(template: Any) {
        cdkBuilder.template(template)
    }

    public fun build(): CfnViewProps {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
