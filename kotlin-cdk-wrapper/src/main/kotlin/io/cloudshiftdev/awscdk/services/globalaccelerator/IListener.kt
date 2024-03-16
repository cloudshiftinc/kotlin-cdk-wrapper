@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface of the Listener.
 */
public interface IListener : IResource {
  /**
   * The ARN of the listener.
   */
  public fun listenerArn(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IListener):
        IListener = CdkObjectWrappers.wrap(cdkObject) as IListener

    internal fun unwrap(wrapped: IListener):
        software.amazon.awscdk.services.globalaccelerator.IListener = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.IListener
  }
}
