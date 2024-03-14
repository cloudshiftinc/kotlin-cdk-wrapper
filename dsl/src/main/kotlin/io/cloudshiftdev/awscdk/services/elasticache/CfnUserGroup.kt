package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnUserGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun engine(): String = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun userGroupId(): String = unwrap(this).getUserGroupId()

  public open fun userGroupId(`value`: String) {
    unwrap(this).setUserGroupId(`value`)
  }

  public open fun userIds(): List<String> = unwrap(this).getUserIds()

  public open fun userIds(`value`: List<String>) {
    unwrap(this).setUserIds(`value`)
  }

  public open fun userIds(vararg `value`: String): Unit = userIds(`value`.toList())

  public interface Builder {
    public fun engine(engine: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userGroupId(userGroupId: String)

    public fun userIds(userIds: List<String>)

    public fun userIds(vararg userIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnUserGroup.Builder =
        software.amazon.awscdk.services.elasticache.CfnUserGroup.Builder.create(scope, id)

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userGroupId(userGroupId: String) {
      cdkBuilder.userGroupId(userGroupId)
    }

    override fun userIds(userIds: List<String>) {
      cdkBuilder.userIds(userIds)
    }

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
