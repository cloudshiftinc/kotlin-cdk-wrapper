@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun excludeCharacters(excludeCharacters: String)

    public fun replicaRegions(replicaRegions: List<ReplicaRegion>)

    public fun replicaRegions(vararg replicaRegions: ReplicaRegion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions.Builder
        =
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions.builder()

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

    public fun build():
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions,
  ) : CdkObject(cdkObject), SnapshotCredentialsFromGeneratedPasswordOptions {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun replicaRegions(): List<ReplicaRegion> =
        unwrap(this).getReplicaRegions()?.map(ReplicaRegion::wrap) ?: emptyList()
  }

  public companion object {
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
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.SnapshotCredentialsFromGeneratedPasswordOptions
  }
}
