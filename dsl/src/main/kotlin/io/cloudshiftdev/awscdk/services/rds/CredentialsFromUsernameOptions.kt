package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CredentialsFromUsernameOptions : CredentialsBaseOptions {
  public fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun excludeCharacters(excludeCharacters: String)

    public fun password(password: SecretValue)

    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)

    public fun secretName(secretName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions.Builder =
        software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion::unwrap))
    }

    override fun replicaRegions(vararg replicaRegions: ReplicaRegion): Unit =
        replicaRegions(replicaRegions.toList())

    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    public fun build(): software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions,
  ) : CredentialsFromUsernameOptions {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

    override fun replicaRegions(): List<ReplicaRegion> =
        unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

    override fun secretName(): String? = unwrap(this).getSecretName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CredentialsFromUsernameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions):
        CredentialsFromUsernameOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CredentialsFromUsernameOptions):
        software.amazon.awscdk.services.rds.CredentialsFromUsernameOptions = (wrapped as
        Wrapper).cdkObject
  }
}
