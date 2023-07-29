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
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig
import software.amazon.awscdk.services.codedeploy.TrafficRouting
import software.constructs.Construct

/**
 * A custom Deployment Configuration for an ECS Deployment Group.
 *
 * Example:
 * ```
 * FargateService service;
 * ITargetGroup blueTargetGroup;
 * ITargetGroup greenTargetGroup;
 * IApplicationListener listener;
 * IApplicationListener testListener;
 * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
 * .autoRollback(AutoRollbackConfig.builder()
 * // CodeDeploy will automatically roll back if the 8-hour approval period times out and the
 * deployment stops
 * .stoppedDeployment(true)
 * .build())
 * .service(service)
 * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
 * // The deployment will wait for approval for up to 8 hours before stopping the deployment
 * .deploymentApprovalWaitTime(Duration.hours(8))
 * .blueTargetGroup(blueTargetGroup)
 * .greenTargetGroup(greenTargetGroup)
 * .listener(listener)
 * .testListener(testListener)
 * .build())
 * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
 * .build();
 * ```
 */
@CdkDslMarker
public class EcsDeploymentConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: EcsDeploymentConfig.Builder =
        EcsDeploymentConfig.Builder.create(scope, id)

    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     *
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     *   Configuration.
     */
    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * The configuration that specifies how traffic is shifted from the 'blue' target group to the
     * 'green' target group during a deployment.
     *
     * Default: AllAtOnce
     *
     * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
     *   target group to the 'green' target group during a deployment.
     */
    public fun trafficRouting(trafficRouting: TrafficRouting) {
        cdkBuilder.trafficRouting(trafficRouting)
    }

    public fun build(): EcsDeploymentConfig = cdkBuilder.build()
}
