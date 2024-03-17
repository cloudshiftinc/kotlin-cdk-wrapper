@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IRestApi,
  ) : CdkObject(cdkObject), IRestApi {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

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
    override fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

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
    override fun arnForExecuteApi(method: String): String = unwrap(this).arnForExecuteApi(method)

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
    override fun arnForExecuteApi(method: String, path: String): String =
        unwrap(this).arnForExecuteApi(method, path)

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
    override fun arnForExecuteApi(
      method: String,
      path: String,
      stage: String,
    ): String = unwrap(this).arnForExecuteApi(method, path, stage)

    /**
     * API Gateway stage that points to the latest deployment (if defined).
     */
    override fun deploymentStage(): Stage = unwrap(this).getDeploymentStage().let(Stage::wrap)

    /**
     * API Gateway stage that points to the latest deployment (if defined).
     */
    override fun deploymentStage(`value`: Stage) {
      unwrap(this).setDeploymentStage(`value`.let(Stage::unwrap))
    }

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * API Gateway deployment that represents the latest changes of the API.
     *
     * This resource will be automatically updated every time the REST API model changes.
     * `undefined` when no deployment is configured.
     */
    override fun latestDeployment(): Deployment? =
        unwrap(this).getLatestDeployment()?.let(Deployment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The ID of this API Gateway RestApi.
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * The name of this API Gateway RestApi.
     */
    override fun restApiName(): String = unwrap(this).getRestApiName()

    /**
     * The resource ID of the root resource.
     */
    override fun restApiRootResourceId(): String = unwrap(this).getRestApiRootResourceId()

    /**
     * Represents the root resource ("/") of this API. Use it to define the API model:.
     *
     * api.root.addMethod('ANY', redirectToHomePage); // "ANY /"
     * api.root.addResource('friends').addMethod('GET', getFriendsHandler); // "GET /friends"
     */
    override fun root(): IResource = unwrap(this).getRoot().let(IResource::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IRestApi): IRestApi =
        CdkObjectWrappers.wrap(cdkObject) as? IRestApi ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRestApi): software.amazon.awscdk.services.apigateway.IRestApi =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IRestApi
  }
}
