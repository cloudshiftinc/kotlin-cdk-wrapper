@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnWALWorkspaceProps {
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun walWorkspaceName(): String? = unwrap(this).getWalWorkspaceName()

  @CdkDslMarker
  public interface Builder {
    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun walWorkspaceName(walWorkspaceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnWALWorkspaceProps.Builder =
        software.amazon.awscdk.services.emr.CfnWALWorkspaceProps.builder()

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun walWorkspaceName(walWorkspaceName: String) {
      cdkBuilder.walWorkspaceName(walWorkspaceName)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnWALWorkspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnWALWorkspaceProps,
  ) : CdkObject(cdkObject), CfnWALWorkspaceProps {
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun walWorkspaceName(): String? = unwrap(this).getWalWorkspaceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWALWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnWALWorkspaceProps):
        CfnWALWorkspaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWALWorkspaceProps):
        software.amazon.awscdk.services.emr.CfnWALWorkspaceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.emr.CfnWALWorkspaceProps
  }
}
