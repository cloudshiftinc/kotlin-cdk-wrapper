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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnIPAMScopeProps

/**
 * Properties for defining a `CfnIPAMScope`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnIPAMScopeProps cfnIPAMScopeProps = CfnIPAMScopeProps.builder()
 * .ipamId("ipamId")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html)
 */
@CdkDslMarker
public class CfnIPAMScopePropsDsl {
    private val cdkBuilder: CfnIPAMScopeProps.Builder = CfnIPAMScopeProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the scope. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param ipamId The ID of the IPAM for which you're creating this scope. */
    public fun ipamId(ipamId: String) {
        cdkBuilder.ipamId(ipamId)
    }

    /**
     * @param tags The key/value combination of a tag assigned to the resource. Use the tag key in
     *   the filter name and the tag value as the filter value. For example, to find all resources
     *   that have a tag with the key `Owner` and the value `TeamA` , specify `tag:Owner` for the
     *   filter name and `TeamA` for the filter value.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The key/value combination of a tag assigned to the resource. Use the tag key in
     *   the filter name and the tag value as the filter value. For example, to find all resources
     *   that have a tag with the key `Owner` and the value `TeamA` , specify `tag:Owner` for the
     *   filter name and `TeamA` for the filter value.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIPAMScopeProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
