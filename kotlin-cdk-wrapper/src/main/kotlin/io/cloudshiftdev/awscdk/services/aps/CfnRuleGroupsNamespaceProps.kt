@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRuleGroupsNamespaceProps {
  public fun `data`(): String

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun workspace(): String

  @CdkDslMarker
  public interface Builder {
    public fun `data`(`data`: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workspace(workspace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps.Builder
        = software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps.builder()

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workspace(workspace: String) {
      cdkBuilder.workspace(workspace)
    }

    public fun build(): software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps,
  ) : CdkObject(cdkObject), CfnRuleGroupsNamespaceProps {
    override fun `data`(): String = unwrap(this).getData()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun workspace(): String = unwrap(this).getWorkspace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleGroupsNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps):
        CfnRuleGroupsNamespaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupsNamespaceProps):
        software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps
  }
}
