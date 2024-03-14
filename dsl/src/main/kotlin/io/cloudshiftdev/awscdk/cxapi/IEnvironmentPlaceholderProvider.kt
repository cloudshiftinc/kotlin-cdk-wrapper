package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IEnvironmentPlaceholderProvider {
  /**
   * Return the account.
   */
  public fun accountId(): String

  /**
   * Return the partition.
   */
  public fun partition(): String

  /**
   * Return the region.
   */
  public fun region(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.IEnvironmentPlaceholderProvider,
  ) : CdkObject(cdkObject), IEnvironmentPlaceholderProvider {
    /**
     * Return the account.
     */
    override fun accountId(): String = unwrap(this).accountId()

    /**
     * Return the partition.
     */
    override fun partition(): String = unwrap(this).partition()

    /**
     * Return the region.
     */
    override fun region(): String = unwrap(this).region()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.IEnvironmentPlaceholderProvider):
        IEnvironmentPlaceholderProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEnvironmentPlaceholderProvider):
        software.amazon.awscdk.cxapi.IEnvironmentPlaceholderProvider = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cxapi.IEnvironmentPlaceholderProvider
  }
}
