package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnUserGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the user group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Indicates user group status.
   *
   * Can be "creating", "active", "modifying", "deleting".
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The current supported value is redis.
   */
  public open fun engine(): String = unwrap(this).getEngine()

  /**
   * The current supported value is redis.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this user.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this user.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this user.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the user group.
   */
  public open fun userGroupId(): String = unwrap(this).getUserGroupId()

  /**
   * The ID of the user group.
   */
  public open fun userGroupId(`value`: String) {
    unwrap(this).setUserGroupId(`value`)
  }

  /**
   * The list of user IDs that belong to the user group.
   */
  public open fun userIds(): List<String> = unwrap(this).getUserIds()

  /**
   * The list of user IDs that belong to the user group.
   */
  public open fun userIds(`value`: List<String>) {
    unwrap(this).setUserIds(`value`)
  }

  /**
   * The list of user IDs that belong to the user group.
   */
  public open fun userIds(vararg `value`: String): Unit = userIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnUserGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The current supported value is redis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-engine)
     * @param engine The current supported value is redis. 
     */
    public fun engine(engine: String)

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-tags)
     * @param tags An array of key-value pairs to apply to this user. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-tags)
     * @param tags An array of key-value pairs to apply to this user. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID of the user group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-usergroupid)
     * @param userGroupId The ID of the user group. 
     */
    public fun userGroupId(userGroupId: String)

    /**
     * The list of user IDs that belong to the user group.
     *
     * A user named `default` must be included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-userids)
     * @param userIds The list of user IDs that belong to the user group. 
     */
    public fun userIds(userIds: List<String>)

    /**
     * The list of user IDs that belong to the user group.
     *
     * A user named `default` must be included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-userids)
     * @param userIds The list of user IDs that belong to the user group. 
     */
    public fun userIds(vararg userIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnUserGroup.Builder =
        software.amazon.awscdk.services.elasticache.CfnUserGroup.Builder.create(scope, id)

    /**
     * The current supported value is redis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-engine)
     * @param engine The current supported value is redis. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-tags)
     * @param tags An array of key-value pairs to apply to this user. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-tags)
     * @param tags An array of key-value pairs to apply to this user. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID of the user group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-usergroupid)
     * @param userGroupId The ID of the user group. 
     */
    override fun userGroupId(userGroupId: String) {
      cdkBuilder.userGroupId(userGroupId)
    }

    /**
     * The list of user IDs that belong to the user group.
     *
     * A user named `default` must be included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-userids)
     * @param userIds The list of user IDs that belong to the user group. 
     */
    override fun userIds(userIds: List<String>) {
      cdkBuilder.userIds(userIds)
    }

    /**
     * The list of user IDs that belong to the user group.
     *
     * A user named `default` must be included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-usergroup.html#cfn-elasticache-usergroup-userids)
     * @param userIds The list of user IDs that belong to the user group. 
     */
    override fun userIds(vararg userIds: String): Unit = userIds(userIds.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnUserGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUserGroup):
        CfnUserGroup = CfnUserGroup(cdkObject)

    internal fun unwrap(wrapped: CfnUserGroup):
        software.amazon.awscdk.services.elasticache.CfnUserGroup = wrapped.cdkObject
  }
}
