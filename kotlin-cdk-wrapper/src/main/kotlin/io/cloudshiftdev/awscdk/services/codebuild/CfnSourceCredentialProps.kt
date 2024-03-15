@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSourceCredentialProps {
  public fun authType(): String

  public fun serverType(): String

  public fun token(): String

  public fun username(): String? = unwrap(this).getUsername()

  @CdkDslMarker
  public interface Builder {
    public fun authType(authType: String)

    public fun serverType(serverType: String)

    public fun token(token: String)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps.Builder =
        software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps.builder()

    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    override fun serverType(serverType: String) {
      cdkBuilder.serverType(serverType)
    }

    override fun token(token: String) {
      cdkBuilder.token(token)
    }

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps,
  ) : CdkObject(cdkObject), CfnSourceCredentialProps {
    override fun authType(): String = unwrap(this).getAuthType()

    override fun serverType(): String = unwrap(this).getServerType()

    override fun token(): String = unwrap(this).getToken()

    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSourceCredentialProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps):
        CfnSourceCredentialProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSourceCredentialProps):
        software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
  }
}
