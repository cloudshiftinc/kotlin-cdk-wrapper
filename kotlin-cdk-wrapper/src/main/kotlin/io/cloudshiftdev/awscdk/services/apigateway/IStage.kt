@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents an APIGateway Stage.
 */
public interface IStage : IResource {
  /**
   * Add an ApiKey to this Stage.
   *
   * @param id 
   * @param options
   */
  public fun addApiKey(id: String): IApiKey

  /**
   * Add an ApiKey to this Stage.
   *
   * @param id 
   * @param options
   */
  public fun addApiKey(id: String, options: ApiKeyOptions): IApiKey

  /**
   * Add an ApiKey to this Stage.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2f7ef06bb21f3062b3d57e1e4464d4d9bce5c5321ad41fa8f19d3cd5e9443547")
  public fun addApiKey(id: String, options: ApiKeyOptions.Builder.() -> Unit): IApiKey

  /**
   * RestApi to which this stage is associated.
   */
  public fun restApi(): IRestApi

  /**
   * Name of this stage.
   */
  public fun stageName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IStage): IStage =
        CdkObjectWrappers.wrap(cdkObject) as IStage

    internal fun unwrap(wrapped: IStage): software.amazon.awscdk.services.apigateway.IStage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IStage
  }
}
