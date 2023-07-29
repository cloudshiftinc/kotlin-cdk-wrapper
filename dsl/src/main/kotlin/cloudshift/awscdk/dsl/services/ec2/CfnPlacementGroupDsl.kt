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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnPlacementGroup
import software.constructs.Construct

/**
 * Specifies a placement group in which to launch instances.
 *
 * The strategy of the placement group determines how the instances are organized within the group.
 *
 * A `cluster` placement group is a logical grouping of instances within a single Availability Zone
 * that benefit from low network latency, high network throughput. A `spread` placement group places
 * instances on distinct hardware. A `partition` placement group places groups of instances in
 * different partitions, where instances in one partition do not share the same hardware with
 * instances in another partition.
 *
 * For more information, see
 * [Placement Groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in
 * the *Amazon EC2 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnPlacementGroup cfnPlacementGroup = CfnPlacementGroup.Builder.create(this,
 * "MyCfnPlacementGroup")
 * .partitionCount(123)
 * .spreadLevel("spreadLevel")
 * .strategy("strategy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html)
 */
@CdkDslMarker
public class CfnPlacementGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPlacementGroup.Builder = CfnPlacementGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The number of partitions.
     *
     * Valid only when *Strategy* is set to `partition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-partitioncount)
     *
     * @param partitionCount The number of partitions.
     */
    public fun partitionCount(partitionCount: Number) {
        cdkBuilder.partitionCount(partitionCount)
    }

    /**
     * Determines how placement groups spread instances.
     * * Host – You can use `host` only with Outpost placement groups.
     * * Rack – No usage restrictions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-spreadlevel)
     *
     * @param spreadLevel Determines how placement groups spread instances.
     */
    public fun spreadLevel(spreadLevel: String) {
        cdkBuilder.spreadLevel(spreadLevel)
    }

    /**
     * The placement strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy)
     *
     * @param strategy The placement strategy.
     */
    public fun strategy(strategy: String) {
        cdkBuilder.strategy(strategy)
    }

    /**
     * The tags to apply to the new placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
     *
     * @param tags The tags to apply to the new placement group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to apply to the new placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-tags)
     *
     * @param tags The tags to apply to the new placement group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPlacementGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
