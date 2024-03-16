@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface IRestApi : io.cloudshiftdev.awscdk.IResource {
  /**
   * Gets the "execute-api" ARN.
   *
   * Default: "*" returns the execute API ARN for all methods/resources in
   * this API.
   *
   * @return The "execute-api" ARN.
   * @param method The method (default `*`).
   * @param path The resource path.
   * @param stage The stage (default `*`).
   */
  public fun arnForExecuteApi(): String

  /**
   * Gets the "execute-api" ARN.
   *
   * Default: "*" returns the execute API ARN for all methods/resources in
   * this API.
   *
   * @return The "execute-api" ARN.
   * @param method The method (default `*`).
   * @param path The resource path.
   * @param stage The stage (default `*`).
   */
  public fun arnForExecuteApi(method: String): String

  /**
   * Gets the "execute-api" ARN.
   *
   * Default: "*" returns the execute API ARN for all methods/resources in
   * this API.
   *
   * @return The "execute-api" ARN.
   * @param method The method (default `*`).
   * @param path The resource path.
   * @param stage The stage (default `*`).
   */
  public fun arnForExecuteApi(method: String, path: String): String

  /**
   * Gets the "execute-api" ARN.
   *
   * Default: "*" returns the execute API ARN for all methods/resources in
   * this API.
   *
   * @return The "execute-api" ARN.
   * @param method The method (default `*`).
   * @param path The resource path.
   * @param stage The stage (default `*`).
   */
  public fun arnForExecuteApi(
    method: String,
    path: String,
    stage: String,
  ): String

  /**
   * API Gateway stage that points to the latest deployment (if defined).
   */
  public fun deploymentStage(): Stage

  /**
   * API Gateway stage that points to the latest deployment (if defined).
   */
  public fun deploymentStage(`value`: Stage)

  /**
   * API Gateway deployment that represents the latest changes of the API.
   *
   * This resource will be automatically updated every time the REST API model changes.
   * `undefined` when no deployment is configured.
   */
  public fun latestDeployment(): Deployment? =
      unwrap(this).getLatestDeployment()?.let(Deployment::wrap)

  /**
   * The ID of this API Gateway RestApi.
   */
  public fun restApiId(): String

  /**
   * The name of this API Gateway RestApi.
   */
  public fun restApiName(): String

  /**
   * The resource ID of the root resource.
   */
  public fun restApiRootResourceId(): String

  /**
   * Represents the root resource ("/") of this API. Use it to define the API model:.
   *
   * api.root.addMethod('ANY', redirectToHomePage); // "ANY /"
   * api.root.addResource('friends').addMethod('GET', getFriendsHandler); // "GET /friends"
   */
  public fun root(): IResource

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IRestApi): IRestApi =
        CdkObjectWrappers.wrap(cdkObject) as IRestApi

    internal fun unwrap(wrapped: IRestApi): software.amazon.awscdk.services.apigateway.IRestApi =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IRestApi
  }
}
