@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

/**
 * Kms Keys for encryption ECS managed storage.
 *
 * Example:
 *
 * ```
 * Key key;
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .managedStorageConfiguration(ManagedStorageConfiguration.builder()
 * .fargateEphemeralStorageKmsKey(key)
 * .build())
 * .build();
 * ```
 */
public interface ManagedStorageConfiguration {
  /**
   * KMS Key used to encrypt ECS Fargate ephemeral Storage.
   *
   * The configured KMS Key's policy will be modified to allow ECS to use the Key to encrypt the
   * ephemeral Storage for this cluster.
   *
   * Default: No encryption will be applied
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-storage-encryption.html)
   */
  public fun fargateEphemeralStorageKmsKey(): IKey? =
      unwrap(this).getFargateEphemeralStorageKmsKey()?.let(IKey::wrap)

  /**
   * A builder for [ManagedStorageConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fargateEphemeralStorageKmsKey KMS Key used to encrypt ECS Fargate ephemeral Storage.
     * The configured KMS Key's policy will be modified to allow ECS to use the Key to encrypt the
     * ephemeral Storage for this cluster.
     */
    public fun fargateEphemeralStorageKmsKey(fargateEphemeralStorageKmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ManagedStorageConfiguration.Builder
        = software.amazon.awscdk.services.ecs.ManagedStorageConfiguration.builder()

    /**
     * @param fargateEphemeralStorageKmsKey KMS Key used to encrypt ECS Fargate ephemeral Storage.
     * The configured KMS Key's policy will be modified to allow ECS to use the Key to encrypt the
     * ephemeral Storage for this cluster.
     */
    override fun fargateEphemeralStorageKmsKey(fargateEphemeralStorageKmsKey: IKey) {
      cdkBuilder.fargateEphemeralStorageKmsKey(fargateEphemeralStorageKmsKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ManagedStorageConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ManagedStorageConfiguration,
  ) : CdkObject(cdkObject),
      ManagedStorageConfiguration {
    /**
     * KMS Key used to encrypt ECS Fargate ephemeral Storage.
     *
     * The configured KMS Key's policy will be modified to allow ECS to use the Key to encrypt the
     * ephemeral Storage for this cluster.
     *
     * Default: No encryption will be applied
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/fargate-storage-encryption.html)
     */
    override fun fargateEphemeralStorageKmsKey(): IKey? =
        unwrap(this).getFargateEphemeralStorageKmsKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManagedStorageConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ManagedStorageConfiguration):
        ManagedStorageConfiguration = CdkObjectWrappers.wrap(cdkObject) as?
        ManagedStorageConfiguration ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManagedStorageConfiguration):
        software.amazon.awscdk.services.ecs.ManagedStorageConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ManagedStorageConfiguration
  }
}
