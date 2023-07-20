@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.refactorspaces.CfnApplication
import software.amazon.awscdk.services.refactorspaces.CfnApplicationProps
import software.amazon.awscdk.services.refactorspaces.CfnEnvironment
import software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps
import software.amazon.awscdk.services.refactorspaces.CfnRoute
import software.amazon.awscdk.services.refactorspaces.CfnRouteProps
import software.amazon.awscdk.services.refactorspaces.CfnService
import software.amazon.awscdk.services.refactorspaces.CfnServiceProps
import software.constructs.Construct

public object refactorspaces {
  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationApiGatewayProxyInputProperty(block: CfnApplicationApiGatewayProxyInputPropertyDsl.() -> Unit
      = {}): CfnApplication.ApiGatewayProxyInputProperty {
    val builder = CfnApplicationApiGatewayProxyInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnvironment(
    scope: Construct,
    id: String,
    block: CfnEnvironmentDsl.() -> Unit = {},
  ): CfnEnvironment {
    val builder = CfnEnvironmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnvironmentProps(block: CfnEnvironmentPropsDsl.() -> Unit = {}):
      CfnEnvironmentProps {
    val builder = CfnEnvironmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRoute(
    scope: Construct,
    id: String,
    block: CfnRouteDsl.() -> Unit = {},
  ): CfnRoute {
    val builder = CfnRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRouteDefaultRouteInputProperty(block: CfnRouteDefaultRouteInputPropertyDsl.() -> Unit =
      {}): CfnRoute.DefaultRouteInputProperty {
    val builder = CfnRouteDefaultRouteInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteProps(block: CfnRoutePropsDsl.() -> Unit = {}): CfnRouteProps {
    val builder = CfnRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRouteUriPathRouteInputProperty(block: CfnRouteUriPathRouteInputPropertyDsl.() -> Unit =
      {}): CfnRoute.UriPathRouteInputProperty {
    val builder = CfnRouteUriPathRouteInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnService(
    scope: Construct,
    id: String,
    block: CfnServiceDsl.() -> Unit = {},
  ): CfnService {
    val builder = CfnServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceLambdaEndpointInputProperty(block: CfnServiceLambdaEndpointInputPropertyDsl.() -> Unit
      = {}): CfnService.LambdaEndpointInputProperty {
    val builder = CfnServiceLambdaEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
    val builder = CfnServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceUrlEndpointInputProperty(block: CfnServiceUrlEndpointInputPropertyDsl.() -> Unit
      = {}): CfnService.UrlEndpointInputProperty {
    val builder = CfnServiceUrlEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
