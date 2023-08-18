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
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter
import software.constructs.Construct

/**
 * Specifies a Traffic Mirror filter.
 *
 * A Traffic Mirror filter is a set of rules that defines the traffic to mirror.
 *
 * By default, no traffic is mirrored. To mirror traffic, use
 * [AWS::EC2::TrafficMirrorFilterRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
 * to add Traffic Mirror rules to the filter. The rules you add define what traffic gets mirrored.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTrafficMirrorFilter cfnTrafficMirrorFilter = CfnTrafficMirrorFilter.Builder.create(this,
 * "MyCfnTrafficMirrorFilter")
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
public class CfnTrafficMirrorFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrafficMirrorFilter.Builder =
        CfnTrafficMirrorFilter.Builder.create(scope, id)

    private val _networkServices: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-description)
     *
     * @param description The description of the Traffic Mirror filter.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The network service traffic that is associated with the Traffic Mirror filter.
     *
     * Valid values are `amazon-dns` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-networkservices)
     *
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     *   filter.
     */
    public fun networkServices(vararg networkServices: String) {
        _networkServices.addAll(listOf(*networkServices))
    }

    /**
     * The network service traffic that is associated with the Traffic Mirror filter.
     *
     * Valid values are `amazon-dns` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-networkservices)
     *
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     *   filter.
     */
    public fun networkServices(networkServices: Collection<String>) {
        _networkServices.addAll(networkServices)
    }

    /**
     * The tags to assign to a Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-tags)
     *
     * @param tags The tags to assign to a Traffic Mirror filter.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to a Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-tags)
     *
     * @param tags The tags to assign to a Traffic Mirror filter.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrafficMirrorFilter {
        if (_networkServices.isNotEmpty()) cdkBuilder.networkServices(_networkServices)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
