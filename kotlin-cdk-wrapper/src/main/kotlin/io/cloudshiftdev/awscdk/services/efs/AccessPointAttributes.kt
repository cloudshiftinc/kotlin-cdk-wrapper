@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Attributes that can be specified when importing an AccessPoint.
 *
 * Example:
 *
 * ```
 * AccessPoint.fromAccessPointAttributes(this, "ap", AccessPointAttributes.builder()
 * .accessPointId("fsap-1293c4d9832fo0912")
 * .fileSystem(FileSystem.fromFileSystemAttributes(this, "efs", FileSystemAttributes.builder()
 * .fileSystemId("fs-099d3e2f")
 * .securityGroup(SecurityGroup.fromSecurityGroupId(this, "sg", "sg-51530134"))
 * .build()))
 * .build());
 * ```
 */
public interface AccessPointAttributes {
  /**
   * The ARN of the AccessPoint One of this, or `accessPointId` is required.
   *
   * Default: - determined based on accessPointId
   */
  public fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

  /**
   * The ID of the AccessPoint One of this, or `accessPointArn` is required.
   *
   * Default: - determined based on accessPointArn
   */
  public fun accessPointId(): String? = unwrap(this).getAccessPointId()

  /**
   * The EFS file system.
   *
   * Default: - no EFS file system
   */
  public fun fileSystem(): IFileSystem? = unwrap(this).getFileSystem()?.let(IFileSystem::wrap)

  /**
   * A builder for [AccessPointAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPointArn The ARN of the AccessPoint One of this, or `accessPointId` is required.
     */
    public fun accessPointArn(accessPointArn: String)

    /**
     * @param accessPointId The ID of the AccessPoint One of this, or `accessPointArn` is required.
     */
    public fun accessPointId(accessPointId: String)

    /**
     * @param fileSystem The EFS file system.
     */
    public fun fileSystem(fileSystem: IFileSystem)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPointAttributes.Builder =
        software.amazon.awscdk.services.efs.AccessPointAttributes.builder()

    /**
     * @param accessPointArn The ARN of the AccessPoint One of this, or `accessPointId` is required.
     */
    override fun accessPointArn(accessPointArn: String) {
      cdkBuilder.accessPointArn(accessPointArn)
    }

    /**
     * @param accessPointId The ID of the AccessPoint One of this, or `accessPointArn` is required.
     */
    override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    /**
     * @param fileSystem The EFS file system.
     */
    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.efs.AccessPointAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.AccessPointAttributes,
  ) : CdkObject(cdkObject), AccessPointAttributes {
    /**
     * The ARN of the AccessPoint One of this, or `accessPointId` is required.
     *
     * Default: - determined based on accessPointId
     */
    override fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    /**
     * The ID of the AccessPoint One of this, or `accessPointArn` is required.
     *
     * Default: - determined based on accessPointArn
     */
    override fun accessPointId(): String? = unwrap(this).getAccessPointId()

    /**
     * The EFS file system.
     *
     * Default: - no EFS file system
     */
    override fun fileSystem(): IFileSystem? = unwrap(this).getFileSystem()?.let(IFileSystem::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPointAttributes):
        AccessPointAttributes = CdkObjectWrappers.wrap(cdkObject) as? AccessPointAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPointAttributes):
        software.amazon.awscdk.services.efs.AccessPointAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.efs.AccessPointAttributes
  }
}
