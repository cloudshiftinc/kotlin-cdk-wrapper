@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `EfsFileSystemLocation`.
 *
 * Example:
 *
 * ```
 * Project.Builder.create(this, "MyProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2")))
 * .fileSystemLocations(List.of(FileSystemLocation.efs(EfsFileSystemLocationProps.builder()
 * .identifier("myidentifier2")
 * .location("myclodation.mydnsroot.com:/loc")
 * .mountPoint("/media")
 * .mountOptions("opts")
 * .build())))
 * .build();
 * ```
 */
public interface EfsFileSystemLocationProps {
  /**
   * The name used to access a file system created by Amazon EFS.
   */
  public fun identifier(): String

  /**
   * A string that specifies the location of the file system, like Amazon EFS.
   *
   * This value looks like `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory`.
   */
  public fun location(): String

  /**
   * The mount options for a file system such as Amazon EFS.
   *
   * Default: 'nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2'.
   */
  public fun mountOptions(): String? = unwrap(this).getMountOptions()

  /**
   * The location in the container where you mount the file system.
   */
  public fun mountPoint(): String

  /**
   * A builder for [EfsFileSystemLocationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identifier The name used to access a file system created by Amazon EFS. 
     */
    public fun identifier(identifier: String)

    /**
     * @param location A string that specifies the location of the file system, like Amazon EFS. 
     * This value looks like `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory`.
     */
    public fun location(location: String)

    /**
     * @param mountOptions The mount options for a file system such as Amazon EFS.
     */
    public fun mountOptions(mountOptions: String)

    /**
     * @param mountPoint The location in the container where you mount the file system. 
     */
    public fun mountPoint(mountPoint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps.Builder =
        software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps.builder()

    /**
     * @param identifier The name used to access a file system created by Amazon EFS. 
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param location A string that specifies the location of the file system, like Amazon EFS. 
     * This value looks like `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory`.
     */
    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    /**
     * @param mountOptions The mount options for a file system such as Amazon EFS.
     */
    override fun mountOptions(mountOptions: String) {
      cdkBuilder.mountOptions(mountOptions)
    }

    /**
     * @param mountPoint The location in the container where you mount the file system. 
     */
    override fun mountPoint(mountPoint: String) {
      cdkBuilder.mountPoint(mountPoint)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps,
  ) : CdkObject(cdkObject),
      EfsFileSystemLocationProps {
    /**
     * The name used to access a file system created by Amazon EFS.
     */
    override fun identifier(): String = unwrap(this).getIdentifier()

    /**
     * A string that specifies the location of the file system, like Amazon EFS.
     *
     * This value looks like `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory`.
     */
    override fun location(): String = unwrap(this).getLocation()

    /**
     * The mount options for a file system such as Amazon EFS.
     *
     * Default: 'nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2'.
     */
    override fun mountOptions(): String? = unwrap(this).getMountOptions()

    /**
     * The location in the container where you mount the file system.
     */
    override fun mountPoint(): String = unwrap(this).getMountPoint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EfsFileSystemLocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps):
        EfsFileSystemLocationProps = CdkObjectWrappers.wrap(cdkObject) as?
        EfsFileSystemLocationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EfsFileSystemLocationProps):
        software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps
  }
}
