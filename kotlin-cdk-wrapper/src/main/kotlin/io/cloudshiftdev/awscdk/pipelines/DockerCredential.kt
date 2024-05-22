@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Represents credentials used to access a Docker registry.
 *
 * Example:
 *
 * ```
 * ISecret dockerHubSecret = Secret.fromSecretCompleteArn(this, "DHSecret", "arn:aws:...");
 * ISecret customRegSecret = Secret.fromSecretCompleteArn(this, "CRSecret", "arn:aws:...");
 * IRepository repo1 = Repository.fromRepositoryArn(this, "Repo",
 * "arn:aws:ecr:eu-west-1:0123456789012:repository/Repo1");
 * IRepository repo2 = Repository.fromRepositoryArn(this, "Repo",
 * "arn:aws:ecr:eu-west-1:0123456789012:repository/Repo2");
 * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
 * .dockerCredentials(List.of(DockerCredential.dockerHub(dockerHubSecret),
 * DockerCredential.customRegistry("dockerregistry.example.com", customRegSecret),
 * DockerCredential.ecr(List.of(repo1, repo2))))
 * .synth(ShellStep.Builder.create("Synth")
 * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
 * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
 * .build()))
 * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
 * .build())
 * .build();
 * ```
 */
public abstract class DockerCredential(
  cdkObject: software.amazon.awscdk.pipelines.DockerCredential,
) : CdkObject(cdkObject) {
  /**
   * Grant read-only access to the registry credentials.
   *
   * This grants read access to any secrets, and pull access to any repositories.
   *
   * @param grantee 
   * @param usage 
   */
  public open fun grantRead(grantee: IGrantable, usage: DockerCredentialUsage) {
    unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap),
        usage.let(DockerCredentialUsage.Companion::unwrap))
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.DockerCredential,
  ) : DockerCredential(cdkObject)

  public companion object {
    public fun customRegistry(registryDomain: String, secret: ISecret): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.customRegistry(registryDomain,
        secret.let(ISecret.Companion::unwrap)).let(DockerCredential::wrap)

    public fun customRegistry(
      registryDomain: String,
      secret: ISecret,
      opts: ExternalDockerCredentialOptions,
    ): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.customRegistry(registryDomain,
        secret.let(ISecret.Companion::unwrap),
        opts.let(ExternalDockerCredentialOptions.Companion::unwrap)).let(DockerCredential::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d23b4beaac37ca90eba5e8b4970534cb3083b04cb66ab2904b29d2e823359bab")
    public fun customRegistry(
      registryDomain: String,
      secret: ISecret,
      opts: ExternalDockerCredentialOptions.Builder.() -> Unit,
    ): DockerCredential = customRegistry(registryDomain, secret,
        ExternalDockerCredentialOptions(opts))

    public fun dockerHub(secret: ISecret): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.dockerHub(secret.let(ISecret.Companion::unwrap)).let(DockerCredential::wrap)

    public fun dockerHub(secret: ISecret, opts: ExternalDockerCredentialOptions): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.dockerHub(secret.let(ISecret.Companion::unwrap),
        opts.let(ExternalDockerCredentialOptions.Companion::unwrap)).let(DockerCredential::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fceff65d9006bae8da325e7db5e800e46cfb33e4cda44ab3401e4f7a40d62fd4")
    public fun dockerHub(secret: ISecret, opts: ExternalDockerCredentialOptions.Builder.() -> Unit):
        DockerCredential = dockerHub(secret, ExternalDockerCredentialOptions(opts))

    public fun ecr(repositories: List<IRepository>): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.ecr(repositories.map(IRepository.Companion::unwrap)).let(DockerCredential::wrap)

    public fun ecr(vararg repositories: IRepository): DockerCredential = ecr(repositories.toList())

    public fun ecr(repositories: List<IRepository>, opts: EcrDockerCredentialOptions):
        DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.ecr(repositories.map(IRepository.Companion::unwrap),
        opts.let(EcrDockerCredentialOptions.Companion::unwrap)).let(DockerCredential::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7210c36c19d1476ed348714034975fa320f5ef4bc6e62a69e366bb36f7999461")
    public fun ecr(repositories: List<IRepository>,
        opts: EcrDockerCredentialOptions.Builder.() -> Unit): DockerCredential = ecr(repositories,
        EcrDockerCredentialOptions(opts))

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.DockerCredential):
        DockerCredential = CdkObjectWrappers.wrap(cdkObject) as? DockerCredential ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerCredential):
        software.amazon.awscdk.pipelines.DockerCredential = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.DockerCredential
  }
}
