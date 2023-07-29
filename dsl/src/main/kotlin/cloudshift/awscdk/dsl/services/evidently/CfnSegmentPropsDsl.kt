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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.evidently.CfnSegmentProps

/**
 * Properties for defining a `CfnSegment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * CfnSegmentProps cfnSegmentProps = CfnSegmentProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .pattern("pattern")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-segment.html)
 */
@CdkDslMarker
public class CfnSegmentPropsDsl {
    private val cdkBuilder: CfnSegmentProps.Builder = CfnSegmentProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description An optional description for this segment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name A name for the segment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param pattern The pattern to use for the segment. For more information about pattern syntax,
     *   see
     *   [Segment rule pattern syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments-syntax.html)
     *   .
     */
    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature. Tags can help you
     *   organize and categorize your resources. You can also use them to scope user permissions by
     *   granting a user permission to access or change only resources with certain tag values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a feature.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the feature. Tags can help you
     *   organize and categorize your resources. You can also use them to scope user permissions by
     *   granting a user permission to access or change only resources with certain tag values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a feature.
     *
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSegmentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
