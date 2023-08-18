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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.amazon.awscdk.services.stepfunctions.CfnActivityProps

/**
 * Properties for defining a `CfnActivity`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * CfnActivityProps cfnActivityProps = CfnActivityProps.builder()
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html)
 */
@CdkDslMarker
public class CfnActivityPropsDsl {
    private val cdkBuilder: CfnActivityProps.Builder = CfnActivityProps.builder()

    private val _tags: MutableList<CfnActivity.TagsEntryProperty> = mutableListOf()

    /**
     * @param name The name of the activity. A name must *not* contain:
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The list of tags to add to a resource. Tags may only contain Unicode letters,
     *   digits, white space, or these symbols: `_ . : / = + -
     */
    public fun tags(tags: CfnActivityTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnActivityTagsEntryPropertyDsl().apply(tags).build())
    }

    /**
     * @param tags The list of tags to add to a resource. Tags may only contain Unicode letters,
     *   digits, white space, or these symbols: `_ . : / = + -
     */
    public fun tags(tags: Collection<CfnActivity.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnActivityProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
