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
import software.amazon.awscdk.services.elasticache.CfnUserGroup
import software.constructs.Construct

/**
 * For Redis engine version 6.0 onwards: Creates a Redis user group. For more information, see
 * [Using Role Based Access Control (RBAC)](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.RBAC.html).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CfnUserGroup cfnUserGroup = CfnUserGroup.Builder.create(this, "MyCfnUserGroup")
 * .engine("engine")
 * .userGroupId("userGroupId")
 * .userIds(List.of("userIds"))
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html)
 */
@CdkDslMarker
public class CfnUserGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserGroup.Builder = CfnUserGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userIds: MutableList<String> = mutableListOf()

    /**
     * The current supported value is redis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-engine)
     *
     * @param engine The current supported value is redis.
     */
    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-tags)
     *
     * @param tags An array of key-value pairs to apply to this user.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-tags)
     *
     * @param tags An array of key-value pairs to apply to this user.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the user group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-usergroupid)
     *
     * @param userGroupId The ID of the user group.
     */
    public fun userGroupId(userGroupId: String) {
        cdkBuilder.userGroupId(userGroupId)
    }

    /**
     * The list of user IDs that belong to the user group.
     *
     * A user named `default` must be included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-userids)
     *
     * @param userIds The list of user IDs that belong to the user group.
     */
    public fun userIds(vararg userIds: String) {
        _userIds.addAll(listOf(*userIds))
    }

    /**
     * The list of user IDs that belong to the user group.
     *
     * A user named `default` must be included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-userids)
     *
     * @param userIds The list of user IDs that belong to the user group.
     */
    public fun userIds(userIds: Collection<String>) {
        _userIds.addAll(userIds)
    }

    public fun build(): CfnUserGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userIds.isNotEmpty()) cdkBuilder.userIds(_userIds)
        return cdkBuilder.build()
    }
}
