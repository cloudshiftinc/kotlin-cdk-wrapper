@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnContactListProps {
  public fun contactListName(): String? = unwrap(this).getContactListName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun topics(): Any? = unwrap(this).getTopics()

  @CdkDslMarker
  public interface Builder {
    public fun contactListName(contactListName: String)

    public fun description(description: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun topics(topics: IResolvable)

    public fun topics(topics: List<Any>)

    public fun topics(vararg topics: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnContactListProps.Builder =
        software.amazon.awscdk.services.ses.CfnContactListProps.builder()

    override fun contactListName(contactListName: String) {
      cdkBuilder.contactListName(contactListName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun topics(topics: IResolvable) {
      cdkBuilder.topics(topics.let(IResolvable::unwrap))
    }

    override fun topics(topics: List<Any>) {
      cdkBuilder.topics(topics)
    }

    override fun topics(vararg topics: Any): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnContactListProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnContactListProps,
  ) : CdkObject(cdkObject), CfnContactListProps {
    override fun contactListName(): String? = unwrap(this).getContactListName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun topics(): Any? = unwrap(this).getTopics()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnContactListProps):
        CfnContactListProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactListProps):
        software.amazon.awscdk.services.ses.CfnContactListProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnContactListProps
  }
}
