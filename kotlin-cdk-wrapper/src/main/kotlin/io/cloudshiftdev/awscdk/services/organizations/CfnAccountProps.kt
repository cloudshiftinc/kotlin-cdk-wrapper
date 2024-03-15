@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAccountProps {
  public fun accountName(): String

  public fun email(): String

  public fun parentIds(): List<String> = unwrap(this).getParentIds() ?: emptyList()

  public fun roleName(): String? = unwrap(this).getRoleName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accountName(accountName: String)

    public fun email(email: String)

    public fun parentIds(parentIds: List<String>)

    public fun parentIds(vararg parentIds: String)

    public fun roleName(roleName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnAccountProps.Builder =
        software.amazon.awscdk.services.organizations.CfnAccountProps.builder()

    override fun accountName(accountName: String) {
      cdkBuilder.accountName(accountName)
    }

    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    override fun parentIds(parentIds: List<String>) {
      cdkBuilder.parentIds(parentIds)
    }

    override fun parentIds(vararg parentIds: String): Unit = parentIds(parentIds.toList())

    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnAccountProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.organizations.CfnAccountProps,
  ) : CdkObject(cdkObject), CfnAccountProps {
    override fun accountName(): String = unwrap(this).getAccountName()

    override fun email(): String = unwrap(this).getEmail()

    override fun parentIds(): List<String> = unwrap(this).getParentIds() ?: emptyList()

    override fun roleName(): String? = unwrap(this).getRoleName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnAccountProps):
        CfnAccountProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountProps):
        software.amazon.awscdk.services.organizations.CfnAccountProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.organizations.CfnAccountProps
  }
}
