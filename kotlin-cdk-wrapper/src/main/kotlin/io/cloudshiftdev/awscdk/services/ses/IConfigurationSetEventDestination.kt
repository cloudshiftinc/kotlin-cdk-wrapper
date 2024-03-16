@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A configuration set event destination.
 */
public interface IConfigurationSetEventDestination : IResource {
  /**
   * The ID of the configuration set event destination.
   */
  public fun configurationSetEventDestinationId(): String

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.IConfigurationSetEventDestination):
        IConfigurationSetEventDestination = CdkObjectWrappers.wrap(cdkObject) as
        IConfigurationSetEventDestination

    internal fun unwrap(wrapped: IConfigurationSetEventDestination):
        software.amazon.awscdk.services.ses.IConfigurationSetEventDestination = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IConfigurationSetEventDestination
  }
}
