package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GitHubSourceCredentials internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codebuild.GitHubSourceCredentials,
) : Resource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.GitHubSourceCredentials].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The personal access token to use when contacting the GitHub API.
     *
     * @param accessToken The personal access token to use when contacting the GitHub API. 
     */
    public fun accessToken(accessToken: SecretValue)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.GitHubSourceCredentials.Builder =
        software.amazon.awscdk.services.codebuild.GitHubSourceCredentials.Builder.create(scope, id)

    /**
     * The personal access token to use when contacting the GitHub API.
     *
     * @param accessToken The personal access token to use when contacting the GitHub API. 
     */
    override fun accessToken(accessToken: SecretValue) {
      cdkBuilder.accessToken(accessToken.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.GitHubSourceCredentials =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): GitHubSourceCredentials {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return GitHubSourceCredentials(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.GitHubSourceCredentials):
        GitHubSourceCredentials = GitHubSourceCredentials(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceCredentials):
        software.amazon.awscdk.services.codebuild.GitHubSourceCredentials = wrapped.cdkObject
  }
}
