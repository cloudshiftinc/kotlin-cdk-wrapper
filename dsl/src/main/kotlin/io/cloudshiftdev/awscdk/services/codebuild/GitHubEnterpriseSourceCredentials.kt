package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GitHubEnterpriseSourceCredentials internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials,
) : Resource(cdkObject) {
  public interface Builder {
    public fun accessToken(accessToken: SecretValue) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials.Builder =
        software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials.Builder.create(scope,
        id)

    public override fun accessToken(accessToken: SecretValue) {
      cdkBuilder.accessToken(accessToken.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        wrapped.cdkObject
  }
}
