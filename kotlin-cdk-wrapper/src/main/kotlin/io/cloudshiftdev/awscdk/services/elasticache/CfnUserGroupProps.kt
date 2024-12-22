@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnUserGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnUserGroupProps cfnUserGroupProps = CfnUserGroupProps.builder()
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
public interface CfnUserGroupProps {
  /**
   * The current supported values are valkey and redis.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-engine)
   */
  public fun engine(): String

  /**
   * The list of tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the user group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-usergroupid)
   */
  public fun userGroupId(): String

  /**
   * The list of user IDs that belong to the user group.
   *
   * A user named `default` must be included.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-userids)
   */
  public fun userIds(): List<String>

  /**
   * A builder for [CfnUserGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param engine The current supported values are valkey and redis. 
     */
    public fun engine(engine: String)

    /**
     * @param tags The list of tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userGroupId The ID of the user group. 
     */
    public fun userGroupId(userGroupId: String)

    /**
     * @param userIds The list of user IDs that belong to the user group. 
     * A user named `default` must be included.
     */
    public fun userIds(userIds: List<String>)

    /**
     * @param userIds The list of user IDs that belong to the user group. 
     * A user named `default` must be included.
     */
    public fun userIds(vararg userIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnUserGroupProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnUserGroupProps.builder()

    /**
     * @param engine The current supported values are valkey and redis. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param tags The list of tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The list of tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userGroupId The ID of the user group. 
     */
    override fun userGroupId(userGroupId: String) {
      cdkBuilder.userGroupId(userGroupId)
    }

    /**
     * @param userIds The list of user IDs that belong to the user group. 
     * A user named `default` must be included.
     */
    override fun userIds(userIds: List<String>) {
      cdkBuilder.userIds(userIds)
    }

    /**
     * @param userIds The list of user IDs that belong to the user group. 
     * A user named `default` must be included.
     */
    override fun userIds(vararg userIds: String): Unit = userIds(userIds.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnUserGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticache.CfnUserGroupProps,
  ) : CdkObject(cdkObject),
      CfnUserGroupProps {
    /**
     * The current supported values are valkey and redis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-engine)
     */
    override fun engine(): String = unwrap(this).getEngine()

    /**
     * The list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the user group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-usergroupid)
     */
    override fun userGroupId(): String = unwrap(this).getUserGroupId()

    /**
     * The list of user IDs that belong to the user group.
     *
     * A user named `default` must be included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-userids)
     */
    override fun userIds(): List<String> = unwrap(this).getUserIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUserGroupProps):
        CfnUserGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserGroupProps):
        software.amazon.awscdk.services.elasticache.CfnUserGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnUserGroupProps
  }
}
