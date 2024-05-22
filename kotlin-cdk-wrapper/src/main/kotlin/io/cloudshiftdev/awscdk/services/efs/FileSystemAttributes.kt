@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit

/**
 * Properties that describe an existing EFS file system.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * IFileSystem importedFileSystem = FileSystem.fromFileSystemAttributes(this, "existingFS",
 * FileSystemAttributes.builder()
 * .fileSystemId("fs-12345678") // You can also use fileSystemArn instead of fileSystemId.
 * .securityGroup(SecurityGroup.fromSecurityGroupId(this, "SG", "sg-123456789",
 * SecurityGroupImportOptions.builder()
 * .allowAllOutbound(false)
 * .build()))
 * .build());
 * ```
 */
public interface FileSystemAttributes {
  /**
   * The File System's Arn.
   *
   * Default: - determined based on fileSystemId
   */
  public fun fileSystemArn(): String? = unwrap(this).getFileSystemArn()

  /**
   * The File System's ID.
   *
   * Default: - determined based on fileSystemArn
   */
  public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

  /**
   * The security group of the file system.
   */
  public fun securityGroup(): ISecurityGroup

  /**
   * A builder for [FileSystemAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fileSystemArn The File System's Arn.
     */
    public fun fileSystemArn(fileSystemArn: String)

    /**
     * @param fileSystemId The File System's ID.
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param securityGroup The security group of the file system. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.FileSystemAttributes.Builder =
        software.amazon.awscdk.services.efs.FileSystemAttributes.builder()

    /**
     * @param fileSystemArn The File System's Arn.
     */
    override fun fileSystemArn(fileSystemArn: String) {
      cdkBuilder.fileSystemArn(fileSystemArn)
    }

    /**
     * @param fileSystemId The File System's ID.
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param securityGroup The security group of the file system. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.efs.FileSystemAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.FileSystemAttributes,
  ) : CdkObject(cdkObject), FileSystemAttributes {
    /**
     * The File System's Arn.
     *
     * Default: - determined based on fileSystemId
     */
    override fun fileSystemArn(): String? = unwrap(this).getFileSystemArn()

    /**
     * The File System's ID.
     *
     * Default: - determined based on fileSystemArn
     */
    override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    /**
     * The security group of the file system.
     */
    override fun securityGroup(): ISecurityGroup =
        unwrap(this).getSecurityGroup().let(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.FileSystemAttributes):
        FileSystemAttributes = CdkObjectWrappers.wrap(cdkObject) as? FileSystemAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemAttributes):
        software.amazon.awscdk.services.efs.FileSystemAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.efs.FileSystemAttributes
  }
}
