@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * API keys are alphanumeric string values that you distribute to app developer customers to grant
 * access to your API.
 */
public interface IApiKey : IResource {
  /**
   * The API key ARN.
   */
  public fun keyArn(): String

  /**
   * The API key ID.
   */
  public fun keyId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IApiKey): IApiKey =
        CdkObjectWrappers.wrap(cdkObject) as IApiKey

    internal fun unwrap(wrapped: IApiKey): software.amazon.awscdk.services.apigateway.IApiKey =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IApiKey
  }
}
