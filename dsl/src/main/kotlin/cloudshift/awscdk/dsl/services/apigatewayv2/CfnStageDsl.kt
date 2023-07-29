@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import software.constructs.Construct

/**
 * The `AWS::ApiGatewayV2::Stage` resource specifies a stage for an API.
 *
 * Each stage is a named reference to a deployment of the API and is made available for client
 * applications to call. To learn more, see
 * [Working with stages for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-stages.html)
 * and
 * [Deploy a WebSocket API in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-set-up-websocket-deployment.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object routeSettings;
 * Object stageVariables;
 * Object tags;
 * CfnStage cfnStage = CfnStage.Builder.create(this, "MyCfnStage")
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
public class CfnStageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStage.Builder = CfnStage.Builder.create(scope, id)

    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     *
     * @param accessLogSettings Settings for logging access in this stage.
     */
    public fun accessLogSettings(accessLogSettings: IResolvable) {
        cdkBuilder.accessLogSettings(accessLogSettings)
    }

    /**
     * Settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesslogsettings)
     *
     * @param accessLogSettings Settings for logging access in this stage.
     */
    public fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty) {
        cdkBuilder.accessLogSettings(accessLogSettings)
    }

    /**
     * This parameter is not currently supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-accesspolicyid)
     *
     * @param accessPolicyId This parameter is not currently supported.
     */
    public fun accessPolicyId(accessPolicyId: String) {
        cdkBuilder.accessPolicyId(accessPolicyId)
    }

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-apiid)
     *
     * @param apiId The API identifier.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * Specifies whether updates to an API automatically trigger a new deployment.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy)
     *
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     */
    public fun autoDeploy(autoDeploy: Boolean) {
        cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * Specifies whether updates to an API automatically trigger a new deployment.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-autodeploy)
     *
     * @param autoDeploy Specifies whether updates to an API automatically trigger a new deployment.
     */
    public fun autoDeploy(autoDeploy: IResolvable) {
        cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * The identifier of a client certificate for a `Stage` .
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-clientcertificateid)
     *
     * @param clientCertificateId The identifier of a client certificate for a `Stage` .
     */
    public fun clientCertificateId(clientCertificateId: String) {
        cdkBuilder.clientCertificateId(clientCertificateId)
    }

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     *
     * @param defaultRouteSettings The default route settings for the stage.
     */
    public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
        cdkBuilder.defaultRouteSettings(defaultRouteSettings)
    }

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-defaultroutesettings)
     *
     * @param defaultRouteSettings The default route settings for the stage.
     */
    public fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty) {
        cdkBuilder.defaultRouteSettings(defaultRouteSettings)
    }

    /**
     * The deployment identifier for the API stage.
     *
     * Can't be updated if `autoDeploy` is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-deploymentid)
     *
     * @param deploymentId The deployment identifier for the API stage.
     */
    public fun deploymentId(deploymentId: String) {
        cdkBuilder.deploymentId(deploymentId)
    }

    /**
     * The description for the API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-description)
     *
     * @param description The description for the API stage.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings)
     *
     * @param routeSettings Route settings for the stage.
     */
    public fun routeSettings(routeSettings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(routeSettings)
        cdkBuilder.routeSettings(builder.map)
    }

    /**
     * Route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-routesettings)
     *
     * @param routeSettings Route settings for the stage.
     */
    public fun routeSettings(routeSettings: Any) {
        cdkBuilder.routeSettings(routeSettings)
    }

    /**
     * The stage name.
     *
     * Stage names can contain only alphanumeric characters, hyphens, and underscores, or be
     * `$default` . Maximum length is 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagename)
     *
     * @param stageName The stage name.
     */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    /**
     * A map that defines the stage variables for a `Stage` .
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables)
     *
     * @param stageVariables A map that defines the stage variables for a `Stage` .
     */
    public fun stageVariables(stageVariables: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(stageVariables)
        cdkBuilder.stageVariables(builder.map)
    }

    /**
     * A map that defines the stage variables for a `Stage` .
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-stagevariables)
     *
     * @param stageVariables A map that defines the stage variables for a `Stage` .
     */
    public fun stageVariables(stageVariables: Any) {
        cdkBuilder.stageVariables(stageVariables)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags)
     *
     * @param tags The collection of tags.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html#cfn-apigatewayv2-stage-tags)
     *
     * @param tags The collection of tags.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnStage = cdkBuilder.build()
}
