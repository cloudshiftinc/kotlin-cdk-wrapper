@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Secret replica region.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * Key key;
 * ReplicaRegion replicaRegion = ReplicaRegion.builder()
 * .region("region")
 * // the properties below are optional
 * .encryptionKey(key)
 * .build();
 * ```
 */
public interface ReplicaRegion {
  /**
   * The customer-managed encryption key to use for encrypting the secret value.
   *
   * Default: - A default KMS key for the account and region is used.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The name of the region.
   */
  public fun region(): String

  /**
   * A builder for [ReplicaRegion]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
     * value.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param region The name of the region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.ReplicaRegion.Builder =
        software.amazon.awscdk.services.secretsmanager.ReplicaRegion.builder()

    /**
     * @param encryptionKey The customer-managed encryption key to use for encrypting the secret
     * value.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param region The name of the region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.ReplicaRegion =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.secretsmanager.ReplicaRegion,
  ) : CdkObject(cdkObject), ReplicaRegion {
    /**
     * The customer-managed encryption key to use for encrypting the secret value.
     *
     * Default: - A default KMS key for the account and region is used.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The name of the region.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaRegion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ReplicaRegion):
        ReplicaRegion = CdkObjectWrappers.wrap(cdkObject) as? ReplicaRegion ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReplicaRegion):
        software.amazon.awscdk.services.secretsmanager.ReplicaRegion = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.ReplicaRegion
  }
}
