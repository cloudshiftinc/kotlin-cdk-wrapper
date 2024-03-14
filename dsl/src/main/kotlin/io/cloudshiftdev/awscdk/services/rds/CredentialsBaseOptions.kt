package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CredentialsBaseOptions {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  public fun secretName(): String? = unwrap(this).getSecretName()

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun excludeCharacters(excludeCharacters: String)

    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)

    public fun secretName(secretName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CredentialsBaseOptions.Builder =
        software.amazon.awscdk.services.rds.CredentialsBaseOptions.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion::unwrap))
    }

    override fun replicaRegions(vararg replicaRegions: ReplicaRegion): Unit =
        replicaRegions(replicaRegions.toList())

    override fun secretName(secretName: String) {
      cdkBuilder.secretName(secretName)
    }

    public fun build(): software.amazon.awscdk.services.rds.CredentialsBaseOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.CredentialsBaseOptions,
  ) : CredentialsBaseOptions {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun replicaRegions(): List<ReplicaRegion> =
        unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

    override fun secretName(): String? = unwrap(this).getSecretName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CredentialsBaseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CredentialsBaseOptions):
        CredentialsBaseOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CredentialsBaseOptions):
        software.amazon.awscdk.services.rds.CredentialsBaseOptions = (wrapped as Wrapper).cdkObject
  }
}
