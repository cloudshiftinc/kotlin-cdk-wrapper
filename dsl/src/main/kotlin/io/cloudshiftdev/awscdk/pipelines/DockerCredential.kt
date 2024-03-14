package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class DockerCredential internal constructor(
  private val cdkObject: software.amazon.awscdk.pipelines.DockerCredential,
) {
  /**
   * Grant read-only access to the registry credentials.
   *
   * This grants read access to any secrets, and pull access to any repositories.
   *
   * @param grantee 
   * @param usage 
   */
  public open fun grantRead(grantee: IGrantable, usage: DockerCredentialUsage) {
    unwrap(this).grantRead(grantee.let(IGrantable::unwrap),
        usage.let(DockerCredentialUsage::unwrap))
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.DockerCredential,
  ) : DockerCredential(cdkObject)

  public companion object {
    public fun customRegistry(registryDomain: String, secret: ISecret): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.customRegistry(registryDomain,
        secret.let(ISecret::unwrap)).let(DockerCredential::wrap)

    public fun customRegistry(
      registryDomain: String,
      secret: ISecret,
      opts: ExternalDockerCredentialOptions,
    ): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.customRegistry(registryDomain,
        secret.let(ISecret::unwrap),
        opts.let(ExternalDockerCredentialOptions::unwrap)).let(DockerCredential::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d23b4beaac37ca90eba5e8b4970534cb3083b04cb66ab2904b29d2e823359bab")
    public fun customRegistry(
      registryDomain: String,
      secret: ISecret,
      opts: ExternalDockerCredentialOptions.Builder.() -> Unit,
    ): DockerCredential = customRegistry(registryDomain, secret,
        ExternalDockerCredentialOptions(opts))

    public fun dockerHub(secret: ISecret): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.dockerHub(secret.let(ISecret::unwrap)).let(DockerCredential::wrap)

    public fun dockerHub(secret: ISecret, opts: ExternalDockerCredentialOptions): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.dockerHub(secret.let(ISecret::unwrap),
        opts.let(ExternalDockerCredentialOptions::unwrap)).let(DockerCredential::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fceff65d9006bae8da325e7db5e800e46cfb33e4cda44ab3401e4f7a40d62fd4")
    public fun dockerHub(secret: ISecret, opts: ExternalDockerCredentialOptions.Builder.() -> Unit):
        DockerCredential = dockerHub(secret, ExternalDockerCredentialOptions(opts))

    public fun ecr(repositories: List<IRepository>): DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.ecr(repositories.map(IRepository::unwrap)).let(DockerCredential::wrap)

    public fun ecr(vararg repositories: IRepository): DockerCredential = ecr(repositories.toList())

    public fun ecr(repositories: List<IRepository>, opts: EcrDockerCredentialOptions):
        DockerCredential =
        software.amazon.awscdk.pipelines.DockerCredential.ecr(repositories.map(IRepository::unwrap),
        opts.let(EcrDockerCredentialOptions::unwrap)).let(DockerCredential::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7210c36c19d1476ed348714034975fa320f5ef4bc6e62a69e366bb36f7999461")
    public fun ecr(repositories: List<IRepository>,
        opts: EcrDockerCredentialOptions.Builder.() -> Unit): DockerCredential = ecr(repositories,
        EcrDockerCredentialOptions(opts))

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.DockerCredential):
        DockerCredential = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerCredential):
        software.amazon.awscdk.pipelines.DockerCredential = (wrapped as Wrapper).cdkObject
  }
}
