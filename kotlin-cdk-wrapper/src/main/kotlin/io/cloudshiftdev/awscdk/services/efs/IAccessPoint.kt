@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an EFS AccessPoint.
 */
public interface IAccessPoint : IResource {
  /**
   * The ARN of the AccessPoint.
   */
  public fun accessPointArn(): String

  /**
   * The ID of the AccessPoint.
   */
  public fun accessPointId(): String

  /**
   * The EFS file system.
   */
  public fun fileSystem(): IFileSystem

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.IAccessPoint): IAccessPoint =
        CdkObjectWrappers.wrap(cdkObject) as IAccessPoint

    internal fun unwrap(wrapped: IAccessPoint): software.amazon.awscdk.services.efs.IAccessPoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.efs.IAccessPoint
  }
}
