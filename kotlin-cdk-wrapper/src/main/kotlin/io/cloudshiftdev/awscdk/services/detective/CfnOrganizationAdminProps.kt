@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnOrganizationAdminProps {
  public fun accountId(): String

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.detective.CfnOrganizationAdminProps.Builder =
        software.amazon.awscdk.services.detective.CfnOrganizationAdminProps.builder()

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnOrganizationAdminProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.detective.CfnOrganizationAdminProps,
  ) : CdkObject(cdkObject), CfnOrganizationAdminProps {
    override fun accountId(): String = unwrap(this).getAccountId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationAdminProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnOrganizationAdminProps):
        CfnOrganizationAdminProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationAdminProps):
        software.amazon.awscdk.services.detective.CfnOrganizationAdminProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.detective.CfnOrganizationAdminProps
  }
}
