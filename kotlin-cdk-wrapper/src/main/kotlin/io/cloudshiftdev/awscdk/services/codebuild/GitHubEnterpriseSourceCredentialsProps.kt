@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface GitHubEnterpriseSourceCredentialsProps {
  public fun accessToken(): SecretValue

  @CdkDslMarker
  public interface Builder {
    public fun accessToken(accessToken: SecretValue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps.Builder =
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps.builder()

    override fun accessToken(accessToken: SecretValue) {
      cdkBuilder.accessToken(accessToken.let(SecretValue::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps,
  ) : CdkObject(cdkObject), GitHubEnterpriseSourceCredentialsProps {
    override fun accessToken(): SecretValue = unwrap(this).getAccessToken().let(SecretValue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        GitHubEnterpriseSourceCredentialsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps):
        GitHubEnterpriseSourceCredentialsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubEnterpriseSourceCredentialsProps):
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps
  }
}
