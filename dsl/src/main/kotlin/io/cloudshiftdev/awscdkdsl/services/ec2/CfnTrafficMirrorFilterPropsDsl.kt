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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps

/**
 * Properties for defining a `CfnTrafficMirrorFilter`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTrafficMirrorFilterProps cfnTrafficMirrorFilterProps = CfnTrafficMirrorFilterProps.builder()
 * .description("description")
 * .networkServices(List.of("networkServices"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html)
 */
@CdkDslMarker
public class CfnTrafficMirrorFilterPropsDsl {
    private val cdkBuilder: CfnTrafficMirrorFilterProps.Builder =
        CfnTrafficMirrorFilterProps.builder()

    private val _networkServices: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the Traffic Mirror filter. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     *   filter. Valid values are `amazon-dns` .
     */
    public fun networkServices(vararg networkServices: String) {
        _networkServices.addAll(listOf(*networkServices))
    }

    /**
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     *   filter. Valid values are `amazon-dns` .
     */
    public fun networkServices(networkServices: Collection<String>) {
        _networkServices.addAll(networkServices)
    }

    /** @param tags The tags to assign to a Traffic Mirror filter. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to a Traffic Mirror filter. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrafficMirrorFilterProps {
        if (_networkServices.isNotEmpty()) cdkBuilder.networkServices(_networkServices)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
