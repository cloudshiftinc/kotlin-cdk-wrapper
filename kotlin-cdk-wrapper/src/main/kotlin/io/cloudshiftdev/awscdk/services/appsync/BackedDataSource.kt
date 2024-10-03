@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal

/**
 * Abstract AppSync datasource implementation.
 *
 * Do not use directly but use subclasses for resource backed datasources
 */
public abstract class BackedDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource,
) : BaseDataSource(cdkObject),
    IGrantable {
  /**
   * the principal of the data source to be IGrantable.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource,
  ) : BackedDataSource(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource):
        BackedDataSource = CdkObjectWrappers.wrap(cdkObject) as? BackedDataSource ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackedDataSource):
        software.amazon.awscdk.services.appsync.BackedDataSource = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.BackedDataSource
  }
}
