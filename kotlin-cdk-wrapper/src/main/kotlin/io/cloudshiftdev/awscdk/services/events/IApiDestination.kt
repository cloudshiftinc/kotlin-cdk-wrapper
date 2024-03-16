@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for API Destinations.
 */
public interface IApiDestination : IResource {
  /**
   * The ARN of the Api Destination created.
   */
  public fun apiDestinationArn(): String

  /**
   * The Name of the Api Destination created.
   */
  public fun apiDestinationName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IApiDestination):
        IApiDestination = CdkObjectWrappers.wrap(cdkObject) as IApiDestination

    internal fun unwrap(wrapped: IApiDestination):
        software.amazon.awscdk.services.events.IApiDestination = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.IApiDestination
  }
}
