@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String

/**
 * Implemented by allowed extension event destinations.
 */
public interface IEventDestination {
  /**
   * The URI of the extension event destination.
   */
  public fun extensionUri(): String

  /**
   * The IAM policy document to invoke the event destination.
   */
  public fun policyDocument(): PolicyDocument? =
      unwrap(this).getPolicyDocument()?.let(PolicyDocument::wrap)

  /**
   * The type of the extension event destination.
   */
  public fun type(): SourceType

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IEventDestination):
        IEventDestination = CdkObjectWrappers.wrap(cdkObject) as IEventDestination

    internal fun unwrap(wrapped: IEventDestination):
        software.amazon.awscdk.services.appconfig.IEventDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IEventDestination
  }
}
