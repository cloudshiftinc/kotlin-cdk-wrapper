@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserGroupProps {
  public fun engine(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userGroupId(): String

  public fun userIds(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun engine(engine: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userGroupId(userGroupId: String)

    public fun userIds(userIds: List<String>)

    public fun userIds(vararg userIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnUserGroupProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnUserGroupProps.builder()

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

    public fun build(): software.amazon.awscdk.services.elasticache.CfnUserGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticache.CfnUserGroupProps,
  ) : CdkObject(cdkObject), CfnUserGroupProps {
    override fun engine(): String = unwrap(this).getEngine()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userGroupId(): String = unwrap(this).getUserGroupId()

    override fun userIds(): List<String> = unwrap(this).getUserIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUserGroupProps):
        CfnUserGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserGroupProps):
        software.amazon.awscdk.services.elasticache.CfnUserGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnUserGroupProps
  }
}
