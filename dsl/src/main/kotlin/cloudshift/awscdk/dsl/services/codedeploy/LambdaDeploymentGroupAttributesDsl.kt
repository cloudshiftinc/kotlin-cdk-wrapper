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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.ILambdaApplication
import software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes

/**
 * Properties of a reference to a CodeDeploy Lambda Deployment Group.
 *
 * Example:
 * ```
 * LambdaApplication application;
 * ILambdaDeploymentGroup deploymentGroup =
 * LambdaDeploymentGroup.fromLambdaDeploymentGroupAttributes(this, "ExistingCodeDeployDeploymentGroup",
 * LambdaDeploymentGroupAttributes.builder()
 * .application(application)
 * .deploymentGroupName("MyExistingDeploymentGroup")
 * .build());
 * ```
 *
 * [Documentation](LambdaDeploymentGroup#fromLambdaDeploymentGroupAttributes)
 */
@CdkDslMarker
public class LambdaDeploymentGroupAttributesDsl {
    private val cdkBuilder: LambdaDeploymentGroupAttributes.Builder =
        LambdaDeploymentGroupAttributes.builder()

    /**
     * @param application The reference to the CodeDeploy Lambda Application that this Deployment
     *   Group belongs to.
     */
    public fun application(application: ILambdaApplication) {
        cdkBuilder.application(application)
    }

    /** @param deploymentConfig The Deployment Configuration this Deployment Group uses. */
    public fun deploymentConfig(deploymentConfig: ILambdaDeploymentConfig) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Lambda
     *   Deployment Group that we are referencing.
     */
    public fun deploymentGroupName(deploymentGroupName: String) {
        cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): LambdaDeploymentGroupAttributes = cdkBuilder.build()
}
