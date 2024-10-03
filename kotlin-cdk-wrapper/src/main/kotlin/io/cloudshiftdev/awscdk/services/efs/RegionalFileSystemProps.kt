@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Properties for configuring ReplicationConfiguration to replicate to a new Regional file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Key key;
 * RegionalFileSystemProps regionalFileSystemProps = RegionalFileSystemProps.builder()
 * .kmsKey(key)
 * .region("region")
 * .build();
 * ```
 */
public interface RegionalFileSystemProps {
  /**
   * AWS KMS key used to protect the encrypted file system.
   *
   * Default: - use service-managed KMS key for Amazon EFS
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * The AWS Region in which the destination file system is located.
   *
   * Default: - the region of the stack
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [RegionalFileSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param kmsKey AWS KMS key used to protect the encrypted file system.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param region The AWS Region in which the destination file system is located.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.RegionalFileSystemProps.Builder =
        software.amazon.awscdk.services.efs.RegionalFileSystemProps.builder()

    /**
     * @param kmsKey AWS KMS key used to protect the encrypted file system.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param region The AWS Region in which the destination file system is located.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.efs.RegionalFileSystemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.RegionalFileSystemProps,
  ) : CdkObject(cdkObject),
      RegionalFileSystemProps {
    /**
     * AWS KMS key used to protect the encrypted file system.
     *
     * Default: - use service-managed KMS key for Amazon EFS
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * The AWS Region in which the destination file system is located.
     *
     * Default: - the region of the stack
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RegionalFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.RegionalFileSystemProps):
        RegionalFileSystemProps = CdkObjectWrappers.wrap(cdkObject) as? RegionalFileSystemProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RegionalFileSystemProps):
        software.amazon.awscdk.services.efs.RegionalFileSystemProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.efs.RegionalFileSystemProps
  }
}
