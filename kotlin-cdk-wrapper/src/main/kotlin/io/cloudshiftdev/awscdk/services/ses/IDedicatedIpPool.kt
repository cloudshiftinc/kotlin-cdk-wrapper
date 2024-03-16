@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A dedicated IP pool.
 */
public interface IDedicatedIpPool : IResource {
  /**
   * The name of the dedicated IP pool.
   */
  public fun dedicatedIpPoolName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IDedicatedIpPool):
        IDedicatedIpPool = CdkObjectWrappers.wrap(cdkObject) as IDedicatedIpPool

    internal fun unwrap(wrapped: IDedicatedIpPool):
        software.amazon.awscdk.services.ses.IDedicatedIpPool = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IDedicatedIpPool
  }
}
