package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal

public abstract class BackedDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource,
) : BaseDataSource(cdkObject), IGrantable {
  /**
   * the principal of the data source to be IGrantable.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource,
  ) : BackedDataSource(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BackedDataSource):
        BackedDataSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackedDataSource):
        software.amazon.awscdk.services.appsync.BackedDataSource = (wrapped as Wrapper).cdkObject
  }
}
