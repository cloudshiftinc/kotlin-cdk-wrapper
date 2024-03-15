@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPolicyProps {
  public fun content(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetIds(): List<String> = unwrap(this).getTargetIds() ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun content(content: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetIds(targetIds: List<String>)

    public fun targetIds(vararg targetIds: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnPolicyProps.Builder =
        software.amazon.awscdk.services.organizations.CfnPolicyProps.builder()

    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetIds(targetIds: List<String>) {
      cdkBuilder.targetIds(targetIds)
    }

    override fun targetIds(vararg targetIds: String): Unit = targetIds(targetIds.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.organizations.CfnPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.organizations.CfnPolicyProps,
  ) : CdkObject(cdkObject), CfnPolicyProps {
    override fun content(): Any = unwrap(this).getContent()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetIds(): List<String> = unwrap(this).getTargetIds() ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnPolicyProps):
        CfnPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyProps):
        software.amazon.awscdk.services.organizations.CfnPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.organizations.CfnPolicyProps
  }
}
