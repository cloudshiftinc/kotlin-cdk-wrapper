@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a Route for an HTTP API.
 */
public interface IHttpRoute : IRoute {
  /**
   * Grant access to invoke the route.
   *
   * This method requires that the authorizer of the route is undefined or is
   * an `HttpIamAuthorizer`.
   *
   * @param grantee 
   * @param options
   */
  public fun grantInvoke(grantee: IGrantable): Grant

  /**
   * Grant access to invoke the route.
   *
   * This method requires that the authorizer of the route is undefined or is
   * an `HttpIamAuthorizer`.
   *
   * @param grantee 
   * @param options
   */
  public fun grantInvoke(grantee: IGrantable, options: GrantInvokeOptions): Grant

  /**
   * Grant access to invoke the route.
   *
   * This method requires that the authorizer of the route is undefined or is
   * an `HttpIamAuthorizer`.
   *
   * @param grantee 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("412779fe515aba89b3c88de8dca006d0a8d413686405d41ff168250ac6c8b73c")
  public fun grantInvoke(grantee: IGrantable, options: GrantInvokeOptions.Builder.() -> Unit): Grant

  /**
   * The HTTP API associated with this route.
   */
  public fun httpApi(): IHttpApi

  /**
   * Returns the path component of this HTTP route, `undefined` if the path is the catch-all route.
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * Returns the arn of the route.
   */
  public fun routeArn(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRoute,
  ) : CdkObject(cdkObject),
      IHttpRoute {
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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
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
     * Grant access to invoke the route.
     *
     * This method requires that the authorizer of the route is undefined or is
     * an `HttpIamAuthorizer`.
     *
     * @param grantee 
     * @param options
     */
    override fun grantInvoke(grantee: IGrantable): Grant =
        unwrap(this).grantInvoke(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant access to invoke the route.
     *
     * This method requires that the authorizer of the route is undefined or is
     * an `HttpIamAuthorizer`.
     *
     * @param grantee 
     * @param options
     */
    override fun grantInvoke(grantee: IGrantable, options: GrantInvokeOptions): Grant =
        unwrap(this).grantInvoke(grantee.let(IGrantable.Companion::unwrap),
        options.let(GrantInvokeOptions.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant access to invoke the route.
     *
     * This method requires that the authorizer of the route is undefined or is
     * an `HttpIamAuthorizer`.
     *
     * @param grantee 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("412779fe515aba89b3c88de8dca006d0a8d413686405d41ff168250ac6c8b73c")
    override fun grantInvoke(grantee: IGrantable, options: GrantInvokeOptions.Builder.() -> Unit):
        Grant = grantInvoke(grantee, GrantInvokeOptions(options))

    /**
     * The HTTP API associated with this route.
     */
    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Returns the path component of this HTTP route, `undefined` if the path is the catch-all
     * route.
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * Returns the arn of the route.
     */
    override fun routeArn(): String = unwrap(this).getRouteArn()

    /**
     * Id of the Route.
     */
    override fun routeId(): String = unwrap(this).getRouteId()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRoute):
        IHttpRoute = CdkObjectWrappers.wrap(cdkObject) as? IHttpRoute ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IHttpRoute):
        software.amazon.awscdk.services.apigatewayv2.IHttpRoute = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IHttpRoute
  }
}
