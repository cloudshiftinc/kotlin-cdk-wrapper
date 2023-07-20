@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import software.amazon.awscdk.services.apigatewayv2.CfnStageProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnStagePropsDsl {
    private val cdkBuilder: CfnStageProps.Builder = CfnStageProps.builder()

    public fun accessLogSettings(accessLogSettings: IResolvable) {
        cdkBuilder.accessLogSettings(accessLogSettings)
    }

    public fun accessLogSettings(accessLogSettings: CfnStage.AccessLogSettingsProperty) {
        cdkBuilder.accessLogSettings(accessLogSettings)
    }

    public fun accessPolicyId(accessPolicyId: String) {
        cdkBuilder.accessPolicyId(accessPolicyId)
    }

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun autoDeploy(autoDeploy: Boolean) {
        cdkBuilder.autoDeploy(autoDeploy)
    }

    public fun autoDeploy(autoDeploy: IResolvable) {
        cdkBuilder.autoDeploy(autoDeploy)
    }

    public fun clientCertificateId(clientCertificateId: String) {
        cdkBuilder.clientCertificateId(clientCertificateId)
    }

    public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
        cdkBuilder.defaultRouteSettings(defaultRouteSettings)
    }

    public fun defaultRouteSettings(defaultRouteSettings: CfnStage.RouteSettingsProperty) {
        cdkBuilder.defaultRouteSettings(defaultRouteSettings)
    }

    public fun deploymentId(deploymentId: String) {
        cdkBuilder.deploymentId(deploymentId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun routeSettings(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.routeSettings(builder.map)
    }

    public fun routeSettings(routeSettings: Any) {
        cdkBuilder.routeSettings(routeSettings)
    }

    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun stageVariables(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.stageVariables(builder.map)
    }

    public fun stageVariables(stageVariables: Any) {
        cdkBuilder.stageVariables(stageVariables)
    }

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnStageProps = cdkBuilder.build()
}
