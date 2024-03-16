@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A UsagePlan, either managed by this CDK app, or imported.
 */
public interface IUsagePlan : IResource {
  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  public fun addApiKey(apiKey: IApiKey)

  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  public fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions)

  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f5ef86a87be3209ae0cbdb48ee812520d7927d679407f259483e5c3856b59ac")
  public fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions.Builder.() -> Unit)

  /**
   * Id of the usage plan.
   */
  public fun usagePlanId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IUsagePlan): IUsagePlan
        = CdkObjectWrappers.wrap(cdkObject) as IUsagePlan

    internal fun unwrap(wrapped: IUsagePlan): software.amazon.awscdk.services.apigateway.IUsagePlan
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IUsagePlan
  }
}
