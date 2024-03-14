package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SnapshotCredentialsFromGeneratedPasswordOptions {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public fun replicaRegions(): List<ReplicaRegion> =
      unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()

  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey) {
    }

    public fun excludeCharacters(excludeCharacters: String) {
    }

    public fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions.Builder
        =
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions.builder()

    public override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    public override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public override fun replicaRegions(replicaRegions: List<ReplicaRegion>) {
      cdkBuilder.replicaRegions(replicaRegions.map(ReplicaRegion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions,
  ) : SnapshotCredentialsFromGeneratedPasswordOptions {
    public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    public override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    public override fun replicaRegions(): List<ReplicaRegion> =
        unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        SnapshotCredentialsFromGeneratedPasswordOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions):
        SnapshotCredentialsFromGeneratedPasswordOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnapshotCredentialsFromGeneratedPasswordOptions):
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions =
        (wrapped as Wrapper).cdkObject
  }
}
