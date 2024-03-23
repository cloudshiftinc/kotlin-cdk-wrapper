@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The source credentials used when contacting the GitHub Enterprise API.
 *
 * **Note**: CodeBuild only allows a single credential for GitHub Enterprise
 * to be saved in a given AWS account in a given region -
 * any attempt to add more than one will result in an error.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * SecretValue secretValue;
 * GitHubEnterpriseSourceCredentials gitHubEnterpriseSourceCredentials =
 * GitHubEnterpriseSourceCredentials.Builder.create(this, "MyGitHubEnterpriseSourceCredentials")
 * .accessToken(secretValue)
 * .build();
 * ```
 */
public open class GitHubEnterpriseSourceCredentials(
  cdkObject: software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: GitHubEnterpriseSourceCredentialsProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(GitHubEnterpriseSourceCredentialsProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: GitHubEnterpriseSourceCredentialsProps.Builder.() -> Unit,
  ) : this(scope, id, GitHubEnterpriseSourceCredentialsProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The personal access token to use when contacting the instance of the GitHub Enterprise API.
     *
     * @param accessToken The personal access token to use when contacting the instance of the
     * GitHub Enterprise API. 
     */
    public fun accessToken(accessToken: SecretValue)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials.Builder =
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials.Builder.create(scope,
        id)

    /**
     * The personal access token to use when contacting the instance of the GitHub Enterprise API.
     *
     * @param accessToken The personal access token to use when contacting the instance of the
     * GitHub Enterprise API. 
     */
    override fun accessToken(accessToken: SecretValue) {
      cdkBuilder.accessToken(accessToken.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): GitHubEnterpriseSourceCredentials {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return GitHubEnterpriseSourceCredentials(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials):
        GitHubEnterpriseSourceCredentials = GitHubEnterpriseSourceCredentials(cdkObject)

    internal fun unwrap(wrapped: GitHubEnterpriseSourceCredentials):
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials =
        wrapped.cdkObject as
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
  }
}
