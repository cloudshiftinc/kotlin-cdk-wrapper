@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IHttpRoute):
        IHttpRoute = CdkObjectWrappers.wrap(cdkObject) as IHttpRoute

    internal fun unwrap(wrapped: IHttpRoute):
        software.amazon.awscdk.services.apigatewayv2.IHttpRoute = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.IHttpRoute
  }
}
