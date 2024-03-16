@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A FlowLog.
 */
public interface IFlowLog : IResource {
  /**
   * The Id of the VPC Flow Log.
   */
  public fun flowLogId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IFlowLog): IFlowLog =
        CdkObjectWrappers.wrap(cdkObject) as IFlowLog

    internal fun unwrap(wrapped: IFlowLog): software.amazon.awscdk.services.ec2.IFlowLog = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IFlowLog
  }
}
