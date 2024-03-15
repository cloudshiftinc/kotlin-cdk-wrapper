@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnOrganizationalUnitProps {
  public fun name(): String

  public fun parentId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun parentId(parentId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps.Builder =
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parentId(parentId: String) {
      cdkBuilder.parentId(parentId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps,
  ) : CdkObject(cdkObject), CfnOrganizationalUnitProps {
    override fun name(): String = unwrap(this).getName()

    override fun parentId(): String = unwrap(this).getParentId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationalUnitProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps):
        CfnOrganizationalUnitProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationalUnitProps):
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps
  }
}
