@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Cognito user pool client.
 */
public interface IUserPoolClient : IResource {
  /**
   * Name of the application client.
   */
  public fun userPoolClientId(): String

  /**
   * The generated client secret.
   *
   * Only available if the "generateSecret" props is set to true
   */
  public fun userPoolClientSecret(): SecretValue

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPoolClient):
        IUserPoolClient = CdkObjectWrappers.wrap(cdkObject) as IUserPoolClient

    internal fun unwrap(wrapped: IUserPoolClient):
        software.amazon.awscdk.services.cognito.IUserPoolClient = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.IUserPoolClient
  }
}
