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

package io.cloudshiftdev.awscdkdsl.services.frauddetector

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnEventTypeProps

/**
 * Properties for defining a `CfnEventType`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
 * CfnEventTypeProps cfnEventTypeProps = CfnEventTypeProps.builder()
 * .entityTypes(List.of(EntityTypeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .eventVariables(List.of(EventVariableProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .dataSource("dataSource")
 * .dataType("dataType")
 * .defaultValue("defaultValue")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variableType("variableType")
 * .build()))
 * .labels(List.of(LabelProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html)
 */
@CdkDslMarker
public class CfnEventTypePropsDsl {
    private val cdkBuilder: CfnEventTypeProps.Builder = CfnEventTypeProps.builder()

    private val _entityTypes: MutableList<Any> = mutableListOf()

    private val _eventVariables: MutableList<Any> = mutableListOf()

    private val _labels: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The event type description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param entityTypes The event type entity types. */
    public fun entityTypes(vararg entityTypes: Any) {
        _entityTypes.addAll(listOf(*entityTypes))
    }

    /** @param entityTypes The event type entity types. */
    public fun entityTypes(entityTypes: Collection<Any>) {
        _entityTypes.addAll(entityTypes)
    }

    /** @param entityTypes The event type entity types. */
    public fun entityTypes(entityTypes: IResolvable) {
        cdkBuilder.entityTypes(entityTypes)
    }

    /** @param eventVariables The event type event variables. */
    public fun eventVariables(vararg eventVariables: Any) {
        _eventVariables.addAll(listOf(*eventVariables))
    }

    /** @param eventVariables The event type event variables. */
    public fun eventVariables(eventVariables: Collection<Any>) {
        _eventVariables.addAll(eventVariables)
    }

    /** @param eventVariables The event type event variables. */
    public fun eventVariables(eventVariables: IResolvable) {
        cdkBuilder.eventVariables(eventVariables)
    }

    /** @param labels The event type labels. */
    public fun labels(vararg labels: Any) {
        _labels.addAll(listOf(*labels))
    }

    /** @param labels The event type labels. */
    public fun labels(labels: Collection<Any>) {
        _labels.addAll(labels)
    }

    /** @param labels The event type labels. */
    public fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels)
    }

    /** @param name The event type name. Pattern : `^[0-9a-z_-]+$` */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventTypeProps {
        if (_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
        if (_eventVariables.isNotEmpty()) cdkBuilder.eventVariables(_eventVariables)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
