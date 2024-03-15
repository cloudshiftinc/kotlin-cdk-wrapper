@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal

public abstract class BackedDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource,
) : BaseDataSource(cdkObject), IGrantable {
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource,
  ) : BackedDataSource(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource):
        BackedDataSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackedDataSource):
        software.amazon.awscdk.services.appsync.BackedDataSource = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.BackedDataSource
  }
}
