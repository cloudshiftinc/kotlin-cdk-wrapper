@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IEnvironmentPlaceholderProvider {
  public fun accountId(): String

  public fun partition(): String

  public fun region(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.IEnvironmentPlaceholderProvider,
  ) : CdkObject(cdkObject), IEnvironmentPlaceholderProvider {
    override fun accountId(): String = unwrap(this).accountId()

    override fun partition(): String = unwrap(this).partition()

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
