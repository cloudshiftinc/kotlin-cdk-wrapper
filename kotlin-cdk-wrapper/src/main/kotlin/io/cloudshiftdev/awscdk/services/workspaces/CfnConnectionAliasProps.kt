@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConnectionAliasProps {
  public fun connectionString(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun connectionString(connectionString: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps.Builder =
        software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps.builder()

    override fun connectionString(connectionString: String) {
      cdkBuilder.connectionString(connectionString)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps,
  ) : CdkObject(cdkObject), CfnConnectionAliasProps {
    override fun connectionString(): String = unwrap(this).getConnectionString()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps):
        CfnConnectionAliasProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionAliasProps):
        software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspaces.CfnConnectionAliasProps
  }
}
