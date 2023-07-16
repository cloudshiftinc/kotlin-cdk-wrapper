@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.refactorspaces.CfnApplication
import software.amazon.awscdk.services.refactorspaces.CfnEnvironment
import software.amazon.awscdk.services.refactorspaces.CfnRoute
import software.amazon.awscdk.services.refactorspaces.CfnService

public inline fun CfnApplication.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnApplication.setApiGatewayProxy(block: CfnApplicationApiGatewayProxyInputPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationApiGatewayProxyInputPropertyDsl()
  builder.apply(block)
  return setApiGatewayProxy(builder.build())
}

public inline fun CfnEnvironment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRoute.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRoute.setDefaultRoute(block: CfnRouteDefaultRouteInputPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRouteDefaultRouteInputPropertyDsl()
  builder.apply(block)
  return setDefaultRoute(builder.build())
}

public inline fun CfnRoute.setUriPathRoute(block: CfnRouteUriPathRouteInputPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRouteUriPathRouteInputPropertyDsl()
  builder.apply(block)
  return setUriPathRoute(builder.build())
}

public inline fun CfnService.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnService.setLambdaEndpoint(block: CfnServiceLambdaEndpointInputPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnServiceLambdaEndpointInputPropertyDsl()
  builder.apply(block)
  return setLambdaEndpoint(builder.build())
}

public inline fun CfnService.setUrlEndpoint(block: CfnServiceUrlEndpointInputPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceUrlEndpointInputPropertyDsl()
  builder.apply(block)
  return setUrlEndpoint(builder.build())
}
