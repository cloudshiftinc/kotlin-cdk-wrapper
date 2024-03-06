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

package io.cloudshiftdev.awscdkdsl.services.iotwireless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotwireless.CfnDestinationProps

/**
 * Properties for defining a `CfnDestination`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnDestinationProps cfnDestinationProps = CfnDestinationProps.builder()
 * .expression("expression")
 * .expressionType("expressionType")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-destination.html)
 */
@CdkDslMarker
public class CfnDestinationPropsDsl {
    private val cdkBuilder: CfnDestinationProps.Builder = CfnDestinationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param description The description of the new resource. Maximum length is 2048 characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param expression The rule name to send messages to. */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /** @param expressionType The type of value in `Expression` . */
    public fun expressionType(expressionType: String) {
        cdkBuilder.expressionType(expressionType)
    }

    /** @param name The name of the new resource. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param roleArn The ARN of the IAM Role that authorizes the destination. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     *   Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     *   Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDestinationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
