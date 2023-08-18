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
import software.amazon.awscdk.services.frauddetector.CfnEventType
import software.constructs.Construct

/**
 * Manages an event type.
 *
 * An event is a business activity that is evaluated for fraud risk. With Amazon Fraud Detector, you
 * generate fraud predictions for events. An event type defines the structure for an event sent to
 * Amazon Fraud Detector. This includes the variables sent as part of the event, the entity
 * performing the event (such as a customer), and the labels that classify the event. Example event
 * types include online payment transactions, account registrations, and authentications.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
 * CfnEventType cfnEventType = CfnEventType.Builder.create(this, "MyCfnEventType")
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
public class CfnEventTypeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventType.Builder = CfnEventType.Builder.create(scope, id)

    private val _entityTypes: MutableList<Any> = mutableListOf()

    private val _eventVariables: MutableList<Any> = mutableListOf()

    private val _labels: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The event type description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-description)
     *
     * @param description The event type description.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     *
     * @param entityTypes The event type entity types.
     */
    public fun entityTypes(vararg entityTypes: Any) {
        _entityTypes.addAll(listOf(*entityTypes))
    }

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     *
     * @param entityTypes The event type entity types.
     */
    public fun entityTypes(entityTypes: Collection<Any>) {
        _entityTypes.addAll(entityTypes)
    }

    /**
     * The event type entity types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-entitytypes)
     *
     * @param entityTypes The event type entity types.
     */
    public fun entityTypes(entityTypes: IResolvable) {
        cdkBuilder.entityTypes(entityTypes)
    }

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     *
     * @param eventVariables The event type event variables.
     */
    public fun eventVariables(vararg eventVariables: Any) {
        _eventVariables.addAll(listOf(*eventVariables))
    }

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     *
     * @param eventVariables The event type event variables.
     */
    public fun eventVariables(eventVariables: Collection<Any>) {
        _eventVariables.addAll(eventVariables)
    }

    /**
     * The event type event variables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-eventvariables)
     *
     * @param eventVariables The event type event variables.
     */
    public fun eventVariables(eventVariables: IResolvable) {
        cdkBuilder.eventVariables(eventVariables)
    }

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     *
     * @param labels The event type labels.
     */
    public fun labels(vararg labels: Any) {
        _labels.addAll(listOf(*labels))
    }

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     *
     * @param labels The event type labels.
     */
    public fun labels(labels: Collection<Any>) {
        _labels.addAll(labels)
    }

    /**
     * The event type labels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-labels)
     *
     * @param labels The event type labels.
     */
    public fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels)
    }

    /**
     * The event type name.
     *
     * Pattern : `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-name)
     *
     * @param name The event type name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-eventtype.html#cfn-frauddetector-eventtype-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventType {
        if (_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
        if (_eventVariables.isNotEmpty()) cdkBuilder.eventVariables(_eventVariables)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
