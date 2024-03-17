@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Creation properties for `GitHubEnterpriseSourceCredentials`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * SecretValue secretValue;
 * GitHubEnterpriseSourceCredentialsProps gitHubEnterpriseSourceCredentialsProps =
 * GitHubEnterpriseSourceCredentialsProps.builder()
 * .accessToken(secretValue)
 * .build();
 * ```
 */
public interface GitHubEnterpriseSourceCredentialsProps {
  /**
   * The personal access token to use when contacting the instance of the GitHub Enterprise API.
   */
  public fun accessToken(): SecretValue

  /**
   * A builder for [GitHubEnterpriseSourceCredentialsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessToken The personal access token to use when contacting the instance of the
     * GitHub Enterprise API. 
     */
    public fun accessToken(accessToken: SecretValue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps.Builder =
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps.builder()

    /**
     * @param accessToken The personal access token to use when contacting the instance of the
     * GitHub Enterprise API. 
     */
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
    /**
     * The personal access token to use when contacting the instance of the GitHub Enterprise API.
     */
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
        GitHubEnterpriseSourceCredentialsProps = CdkObjectWrappers.wrap(cdkObject) as?
        GitHubEnterpriseSourceCredentialsProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubEnterpriseSourceCredentialsProps):
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps
  }
}
