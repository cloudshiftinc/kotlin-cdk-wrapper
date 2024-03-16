@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IResourceWithPolicy
import io.cloudshiftdev.constructs.IDependable
import kotlin.String

/**
 * Represents an Amazon EFS file system.
 */
public interface IFileSystem : IConnectable, IResourceWithPolicy {
  /**
   * The ARN of the file system.
   */
  public fun fileSystemArn(): String

  /**
   * The ID of the file system, assigned by Amazon EFS.
   */
  public fun fileSystemId(): String

  /**
   * Grant the actions defined in actions to the given grantee on this File System resource.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  /**
   * Grant read permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant read to. 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * Grant read and write permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant read and write to. 
   */
  public fun grantReadWrite(grantee: IGrantable): Grant

  /**
   * As root user, grant read and write permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant root access to. 
   */
  public fun grantRootAccess(grantee: IGrantable): Grant

  /**
   * Dependable that can be depended upon to ensure the mount targets of the filesystem are ready.
   */
  public fun mountTargetsAvailable(): IDependable

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.IFileSystem): IFileSystem =
        CdkObjectWrappers.wrap(cdkObject) as IFileSystem

    internal fun unwrap(wrapped: IFileSystem): software.amazon.awscdk.services.efs.IFileSystem =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.efs.IFileSystem
  }
}
