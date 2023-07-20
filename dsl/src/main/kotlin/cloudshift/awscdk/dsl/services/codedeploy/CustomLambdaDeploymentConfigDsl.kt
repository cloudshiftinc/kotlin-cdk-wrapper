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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigType
import software.constructs.Construct
import kotlin.Deprecated
import kotlin.Number
import kotlin.String

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CustomLambdaDeploymentConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CustomLambdaDeploymentConfig.Builder =
        CustomLambdaDeploymentConfig.Builder.create(scope, id)

    @Deprecated(message = "deprecated in CDK")
    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun percentage(percentage: Number) {
        cdkBuilder.percentage(percentage)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun type(type: CustomLambdaDeploymentConfigType) {
        cdkBuilder.type(type)
    }

    public fun build(): CustomLambdaDeploymentConfig = cdkBuilder.build()
}
