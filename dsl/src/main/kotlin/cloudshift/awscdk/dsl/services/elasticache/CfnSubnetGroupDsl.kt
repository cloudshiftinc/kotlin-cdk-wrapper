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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.elasticache.CfnSubnetGroup
import software.constructs.Construct

/**
 * Creates a cache subnet group.
 *
 * For more information about cache subnet groups, go to Cache Subnet Groups in the *Amazon
 * ElastiCache User Guide* or go to
 * [CreateCacheSubnetGroup](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html)
 * in the *Amazon ElastiCache API Reference Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CfnSubnetGroup cfnSubnetGroup = CfnSubnetGroup.Builder.create(this, "MyCfnSubnetGroup")
 * .description("description")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .cacheSubnetGroupName("cacheSubnetGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html)
 */
@CdkDslMarker
public class CfnSubnetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubnetGroup.Builder = CfnSubnetGroup.Builder.create(scope, id)

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name for the cache subnet group. This value is stored as a lowercase string.
     *
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *
     * Example: `mysubnetgroup`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname)
     *
     * @param cacheSubnetGroupName The name for the cache subnet group. This value is stored as a
     *   lowercase string.
     */
    public fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
        cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    /**
     * The description for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description)
     *
     * @param description The description for the cache subnet group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The EC2 subnet IDs for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
     *
     * @param subnetIds The EC2 subnet IDs for the cache subnet group.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * The EC2 subnet IDs for the cache subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids)
     *
     * @param subnetIds The EC2 subnet IDs for the cache subnet group.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * A tag that can be added to an ElastiCache subnet group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-tags)
     *
     * @param tags A tag that can be added to an ElastiCache subnet group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A tag that can be added to an ElastiCache subnet group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * subnet groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-tags)
     *
     * @param tags A tag that can be added to an ElastiCache subnet group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSubnetGroup {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
