@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Any object that has an associated principal that a permission can be granted to.
 */
public interface IGrantable {
  /**
   * The principal to grant permissions to.
   */
  public fun grantPrincipal(): IPrincipal

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IGrantable): IGrantable =
        CdkObjectWrappers.wrap(cdkObject) as IGrantable

    internal fun unwrap(wrapped: IGrantable): software.amazon.awscdk.services.iam.IGrantable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.IGrantable
  }
}
