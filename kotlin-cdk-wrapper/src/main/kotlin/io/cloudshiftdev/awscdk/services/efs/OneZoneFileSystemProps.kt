@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Properties for configuring ReplicationConfiguration to replicate to a new One Zone file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Key key;
 * OneZoneFileSystemProps oneZoneFileSystemProps = OneZoneFileSystemProps.builder()
 * .availabilityZone("availabilityZone")
 * .region("region")
 * // the properties below are optional
 * .kmsKey(key)
 * .build();
 * ```
 */
public interface OneZoneFileSystemProps {
  /**
   * The availability zone name of the destination file system.
   *
   * One zone file system is used as the destination file system when this property is set.
   */
  public fun availabilityZone(): String

  /**
   * AWS KMS key used to protect the encrypted file system.
   *
   * Default: - use service-managed KMS key for Amazon EFS
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * The AWS Region in which the destination file system is located.
   */
  public fun region(): String

  /**
   * A builder for [OneZoneFileSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The availability zone name of the destination file system. 
     * One zone file system is used as the destination file system when this property is set.
     */
    public fun availabilityZone(availabilityZone: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.efs.OneZoneFileSystemProps.Builder =
        software.amazon.awscdk.services.efs.OneZoneFileSystemProps.builder()

    /**
     * @param availabilityZone The availability zone name of the destination file system. 
     * One zone file system is used as the destination file system when this property is set.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

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

    public fun build(): software.amazon.awscdk.services.efs.OneZoneFileSystemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.OneZoneFileSystemProps,
  ) : CdkObject(cdkObject), OneZoneFileSystemProps {
    /**
     * The availability zone name of the destination file system.
     *
     * One zone file system is used as the destination file system when this property is set.
     */
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    /**
     * AWS KMS key used to protect the encrypted file system.
     *
     * Default: - use service-managed KMS key for Amazon EFS
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * The AWS Region in which the destination file system is located.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OneZoneFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.OneZoneFileSystemProps):
        OneZoneFileSystemProps = CdkObjectWrappers.wrap(cdkObject) as? OneZoneFileSystemProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: OneZoneFileSystemProps):
        software.amazon.awscdk.services.efs.OneZoneFileSystemProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.efs.OneZoneFileSystemProps
  }
}
