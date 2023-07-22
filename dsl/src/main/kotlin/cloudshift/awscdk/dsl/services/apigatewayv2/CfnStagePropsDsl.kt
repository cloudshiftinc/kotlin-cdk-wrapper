@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import software.amazon.awscdk.services.apigatewayv2.CfnStageProps

/**
 * Properties for defining a `CfnStage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object routeSettings;
 * Object stageVariables;
 * Object tags;
 * CfnStageProps cfnStageProps = CfnStageProps.builder()
 * .apiId("apiId")
 * .stageName("stageName")
 * // the properties below are optional
 * .accessLogSettings(AccessLogSettingsProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .accessPolicyId("accessPolicyId")
 * .autoDeploy(false)
 * .clientCertificateId("clientCertificateId")
 * .defaultRouteSettings(RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build())
 * .deploymentId("deploymentId")
 * .description("description")
 * .routeSettings(routeSettings)
 * .stageVariables(stageVariables)
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html)
 */
@CdkDslMarker
public class CfnStagePropsDsl {
  private val cdkBuilder: CfnStageProps.Builder = CfnStageProps.builder()

  /**
   * @param accessLogSettings Settings for logging access in this stage.
   */
  public fun accessLogSettings(accessLogSettings: IResolvable) {
    cdkBuilder.accessLogSettings(accessLogSettings)
  }

  /**
   * @param accessLogSettings Settings for logging access in this stage.
   */
  public fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty) {
    cdkBuilder.accessLogSettings(accessLogSettings)
  }

  /**
   * @param accessPolicyId This parameter is not currently supported.
   */
  public fun accessPolicyId(accessPolicyId: String) {
    cdkBuilder.accessPolicyId(accessPolicyId)
  }

  /**
   * @param apiId The API identifier. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
   * The default value is `false` .
   */
  public fun autoDeploy(autoDeploy: Boolean) {
    cdkBuilder.autoDeploy(autoDeploy)
  }

  /**
   * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
   * The default value is `false` .
   */
  public fun autoDeploy(autoDeploy: IResolvable) {
    cdkBuilder.autoDeploy(autoDeploy)
  }

  /**
   * @param clientCertificateId The identifier of a client certificate for a `Stage` .
   * Supported only for WebSocket APIs.
   */
  public fun clientCertificateId(clientCertificateId: String) {
    cdkBuilder.clientCertificateId(clientCertificateId)
  }

  /**
   * @param defaultRouteSettings The default route settings for the stage.
   */
  public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  /**
   * @param defaultRouteSettings The default route settings for the stage.
   */
  public fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  /**
   * @param deploymentId The deployment identifier for the API stage.
   * Can't be updated if `autoDeploy` is enabled.
   */
  public fun deploymentId(deploymentId: String) {
    cdkBuilder.deploymentId(deploymentId)
  }

  /**
   * @param description The description for the API stage.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param routeSettings Route settings for the stage.
   */
  public fun routeSettings(routeSettings: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(routeSettings)
    cdkBuilder.routeSettings(builder.map)
  }

  /**
   * @param routeSettings Route settings for the stage.
   */
  public fun routeSettings(routeSettings: Any) {
    cdkBuilder.routeSettings(routeSettings)
  }

  /**
   * @param stageName The stage name. 
   * Stage names can contain only alphanumeric characters, hyphens, and underscores, or be
   * `$default` . Maximum length is 128 characters.
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * @param stageVariables A map that defines the stage variables for a `Stage` .
   * Variable names can have alphanumeric and underscore characters, and the values must match
   * [A-Za-z0-9-._~:/?#&amp;=,]+.
   */
  public fun stageVariables(stageVariables: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(stageVariables)
    cdkBuilder.stageVariables(builder.map)
  }

  /**
   * @param stageVariables A map that defines the stage variables for a `Stage` .
   * Variable names can have alphanumeric and underscore characters, and the values must match
   * [A-Za-z0-9-._~:/?#&amp;=,]+.
   */
  public fun stageVariables(stageVariables: Any) {
    cdkBuilder.stageVariables(stageVariables)
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnStageProps = cdkBuilder.build()
}
