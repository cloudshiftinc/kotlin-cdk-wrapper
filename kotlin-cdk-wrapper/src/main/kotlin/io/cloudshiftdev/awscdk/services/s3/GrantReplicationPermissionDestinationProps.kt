@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

/**
 * The properties for the destination bucket for granting replication permission.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * Key key;
 * GrantReplicationPermissionDestinationProps grantReplicationPermissionDestinationProps =
 * GrantReplicationPermissionDestinationProps.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .encryptionKey(key)
 * .build();
 * ```
 */
public interface GrantReplicationPermissionDestinationProps {
  /**
   * The destination bucket.
   */
  public fun bucket(): IBucket

  /**
   * The KMS key to use for encryption if a destination bucket needs to be encrypted with a
   * customer-managed KMS key.
   *
   * Default: - no KMS key is used for replication.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * A builder for [GrantReplicationPermissionDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The destination bucket. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param encryptionKey The KMS key to use for encryption if a destination bucket needs to be
     * encrypted with a customer-managed KMS key.
     */
    public fun encryptionKey(encryptionKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.GrantReplicationPermissionDestinationProps.Builder =
        software.amazon.awscdk.services.s3.GrantReplicationPermissionDestinationProps.builder()

    /**
     * @param bucket The destination bucket. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param encryptionKey The KMS key to use for encryption if a destination bucket needs to be
     * encrypted with a customer-managed KMS key.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.s3.GrantReplicationPermissionDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.GrantReplicationPermissionDestinationProps,
  ) : CdkObject(cdkObject),
      GrantReplicationPermissionDestinationProps {
    /**
     * The destination bucket.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The KMS key to use for encryption if a destination bucket needs to be encrypted with a
     * customer-managed KMS key.
     *
     * Default: - no KMS key is used for replication.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        GrantReplicationPermissionDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.GrantReplicationPermissionDestinationProps):
        GrantReplicationPermissionDestinationProps = CdkObjectWrappers.wrap(cdkObject) as?
        GrantReplicationPermissionDestinationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantReplicationPermissionDestinationProps):
        software.amazon.awscdk.services.s3.GrantReplicationPermissionDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.GrantReplicationPermissionDestinationProps
  }
}
