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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnContactFlowModuleProps

/**
 * Properties for defining a `CfnContactFlowModule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnContactFlowModuleProps cfnContactFlowModuleProps = CfnContactFlowModuleProps.builder()
 * .content("content")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .state("state")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html)
 */
@CdkDslMarker
public class CfnContactFlowModulePropsDsl {
    private val cdkBuilder: CfnContactFlowModuleProps.Builder = CfnContactFlowModuleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param content The content of the flow module. */
    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    /** @param description The description of the flow module. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param instanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the flow module. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param state The state of the flow module. */
    public fun state(state: String) {
        cdkBuilder.state(state)
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

    public fun build(): CfnContactFlowModuleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
