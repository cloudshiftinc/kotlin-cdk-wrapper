@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Cognito user pool resource server.
 */
public interface IUserPoolResourceServer : IResource {
  /**
   * Resource server id.
   */
  public fun userPoolResourceServerId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPoolResourceServer):
        IUserPoolResourceServer = CdkObjectWrappers.wrap(cdkObject) as IUserPoolResourceServer

    internal fun unwrap(wrapped: IUserPoolResourceServer):
        software.amazon.awscdk.services.cognito.IUserPoolResourceServer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.IUserPoolResourceServer
  }
}
