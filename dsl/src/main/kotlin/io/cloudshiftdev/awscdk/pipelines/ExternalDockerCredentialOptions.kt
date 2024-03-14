package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ExternalDockerCredentialOptions {
  public fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

  public fun secretPasswordField(): String? = unwrap(this).getSecretPasswordField()

  public fun secretUsernameField(): String? = unwrap(this).getSecretUsernameField()

  public fun usages(): List<DockerCredentialUsage> =
      unwrap(this).getUsages()?.map(DockerCredentialUsage::wrap) ?: emptyList()

  public interface Builder {
    public fun assumeRole(assumeRole: IRole)

    public fun secretPasswordField(secretPasswordField: String)

    public fun secretUsernameField(secretUsernameField: String)

    public fun usages(usages: List<DockerCredentialUsage>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions.Builder
        = software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions.builder()

    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
    }

    override fun secretPasswordField(secretPasswordField: String) {
      cdkBuilder.secretPasswordField(secretPasswordField)
    }

    override fun secretUsernameField(secretUsernameField: String) {
      cdkBuilder.secretUsernameField(secretUsernameField)
    }

    override fun usages(usages: List<DockerCredentialUsage>) {
      cdkBuilder.usages(usages.map(DockerCredentialUsage::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions,
  ) : ExternalDockerCredentialOptions {
    override fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

    override fun secretPasswordField(): String? = unwrap(this).getSecretPasswordField()

    override fun secretUsernameField(): String? = unwrap(this).getSecretUsernameField()

    override fun usages(): List<DockerCredentialUsage> =
        unwrap(this).getUsages()?.map(DockerCredentialUsage::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ExternalDockerCredentialOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions):
        ExternalDockerCredentialOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExternalDockerCredentialOptions):
        software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions = (wrapped as
        Wrapper).cdkObject
  }
}
