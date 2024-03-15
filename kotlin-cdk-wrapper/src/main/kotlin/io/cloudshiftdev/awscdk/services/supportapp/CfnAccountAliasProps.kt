@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnAccountAliasProps {
  public fun accountAlias(): String

  @CdkDslMarker
  public interface Builder {
    public fun accountAlias(accountAlias: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.supportapp.CfnAccountAliasProps.Builder
        = software.amazon.awscdk.services.supportapp.CfnAccountAliasProps.builder()

    override fun accountAlias(accountAlias: String) {
      cdkBuilder.accountAlias(accountAlias)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnAccountAliasProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAliasProps,
  ) : CdkObject(cdkObject), CfnAccountAliasProps {
    override fun accountAlias(): String = unwrap(this).getAccountAlias()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAliasProps):
        CfnAccountAliasProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountAliasProps):
        software.amazon.awscdk.services.supportapp.CfnAccountAliasProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.supportapp.CfnAccountAliasProps
  }
}
