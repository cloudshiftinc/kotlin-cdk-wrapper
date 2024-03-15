@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IGrantable {
  public fun grantPrincipal(): IPrincipal

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.IGrantable,
  ) : CdkObject(cdkObject), IGrantable {
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IGrantable): IGrantable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGrantable): software.amazon.awscdk.services.iam.IGrantable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.IGrantable
  }
}
