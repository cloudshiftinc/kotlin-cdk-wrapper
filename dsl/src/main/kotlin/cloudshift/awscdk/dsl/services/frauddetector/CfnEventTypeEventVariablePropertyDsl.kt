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

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnEventType

/**
 * The variables associated with this event type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
 * EventVariableProperty eventVariableProperty = EventVariableProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-eventtype-eventvariable.html)
 */
@CdkDslMarker
public class CfnEventTypeEventVariablePropertyDsl {
    private val cdkBuilder: CfnEventType.EventVariableProperty.Builder =
        CfnEventType.EventVariableProperty.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param arn The event variable ARN. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /** @param createdTime Timestamp for when event variable was created. */
    public fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
    }

    /**
     * @param dataSource The source of the event variable. Valid values: `EVENT |
     *   EXTERNAL_MODEL_SCORE`
     *
     * When defining a variable within a event type, you can only use the `EVENT` value for
     * DataSource when the *Inline* property is set to true. If the *Inline* property is set false,
     * you can use either `EVENT` or `MODEL_SCORE` for DataSource.
     */
    public fun dataSource(dataSource: String) {
        cdkBuilder.dataSource(dataSource)
    }

    /**
     * @param dataType The data type of the event variable. For more information, see
     *   [Data types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#data-types)
     *   .
     */
    public fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
    }

    /** @param defaultValue The default value of the event variable. */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /** @param description The event variable description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param inline Indicates whether the resource is defined within this CloudFormation template
     *   and impacts the create, update, and delete behavior of the stack. If the value is `true` ,
     *   CloudFormation will create/update/delete the resource when creating/updating/deleting the
     *   stack. If the value is `false` , CloudFormation will validate that the object exists and
     *   then use it within the resource without making changes to the object.
     *
     * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
     * variables. You can set `Inline=true` for these variables and CloudFormation will
     * create/update/delete the Variables as part of stack operations. However, if you set
     * `Inline=false` , CloudFormation will associate the variables to your event type but not
     * execute any changes to the variables.
     */
    public fun `inline`(`inline`: Boolean) {
        cdkBuilder.`inline`(`inline`)
    }

    /**
     * @param inline Indicates whether the resource is defined within this CloudFormation template
     *   and impacts the create, update, and delete behavior of the stack. If the value is `true` ,
     *   CloudFormation will create/update/delete the resource when creating/updating/deleting the
     *   stack. If the value is `false` , CloudFormation will validate that the object exists and
     *   then use it within the resource without making changes to the object.
     *
     * For example, when creating `AWS::FraudDetector::EventType` you must define at least two
     * variables. You can set `Inline=true` for these variables and CloudFormation will
     * create/update/delete the Variables as part of stack operations. However, if you set
     * `Inline=false` , CloudFormation will associate the variables to your event type but not
     * execute any changes to the variables.
     */
    public fun `inline`(`inline`: IResolvable) {
        cdkBuilder.`inline`(`inline`)
    }

    /** @param lastUpdatedTime Timestamp for when the event variable was last updated. */
    public fun lastUpdatedTime(lastUpdatedTime: String) {
        cdkBuilder.lastUpdatedTime(lastUpdatedTime)
    }

    /** @param name The name of the event variable. */
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

    /**
     * @param variableType The type of event variable. For more information, see
     *   [Variable types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types)
     *   .
     */
    public fun variableType(variableType: String) {
        cdkBuilder.variableType(variableType)
    }

    public fun build(): CfnEventType.EventVariableProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
