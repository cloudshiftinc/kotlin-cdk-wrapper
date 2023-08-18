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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService

/**
 * The `DeploymentConfiguration` property specifies optional deployment parameters that control how
 * many tasks run during the deployment and the ordering of stopping and starting tasks.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * DeploymentConfigurationProperty deploymentConfigurationProperty =
 * DeploymentConfigurationProperty.builder()
 * .alarms(DeploymentAlarmsProperty.builder()
 * .alarmNames(List.of("alarmNames"))
 * .enable(false)
 * .rollback(false)
 * .build())
 * .deploymentCircuitBreaker(DeploymentCircuitBreakerProperty.builder()
 * .enable(false)
 * .rollback(false)
 * .build())
 * .maximumPercent(123)
 * .minimumHealthyPercent(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceDeploymentConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.DeploymentConfigurationProperty.Builder =
        CfnService.DeploymentConfigurationProperty.builder()

    /** @param alarms Information about the CloudWatch alarms. */
    public fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms)
    }

    /** @param alarms Information about the CloudWatch alarms. */
    public fun alarms(alarms: CfnService.DeploymentAlarmsProperty) {
        cdkBuilder.alarms(alarms)
    }

    /**
     * @param deploymentCircuitBreaker The deployment circuit breaker can only be used for services
     *   using the rolling update ( `ECS` ) deployment type. The *deployment circuit breaker*
     *   determines whether a service deployment will fail if the service can't reach a steady
     *   state. If you use the deployment circuit breaker, a service deployment will transition to a
     *   failed state and stop launching new tasks. If you use the rollback option, when a service
     *   deployment fails, the service is rolled back to the last deployment that completed
     *   successfully. For more information, see
     *   [Rolling update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
     *   in the *Amazon Elastic Container Service Developer Guide*
     */
    public fun deploymentCircuitBreaker(deploymentCircuitBreaker: IResolvable) {
        cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker)
    }

    /**
     * @param deploymentCircuitBreaker The deployment circuit breaker can only be used for services
     *   using the rolling update ( `ECS` ) deployment type. The *deployment circuit breaker*
     *   determines whether a service deployment will fail if the service can't reach a steady
     *   state. If you use the deployment circuit breaker, a service deployment will transition to a
     *   failed state and stop launching new tasks. If you use the rollback option, when a service
     *   deployment fails, the service is rolled back to the last deployment that completed
     *   successfully. For more information, see
     *   [Rolling update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
     *   in the *Amazon Elastic Container Service Developer Guide*
     */
    public fun deploymentCircuitBreaker(
        deploymentCircuitBreaker: CfnService.DeploymentCircuitBreakerProperty
    ) {
        cdkBuilder.deploymentCircuitBreaker(deploymentCircuitBreaker)
    }

    /**
     * @param maximumPercent If a service is using the rolling update ( `ECS` ) deployment type, the
     *   `maximumPercent` parameter represents an upper limit on the number of your service's tasks
     *   that are allowed in the `RUNNING` or `PENDING` state during a deployment, as a percentage
     *   of the `desiredCount` (rounded down to the nearest integer). This parameter enables you to
     *   define the deployment batch size. For example, if your service is using the `REPLICA`
     *   service scheduler and has a `desiredCount` of four tasks and a `maximumPercent` value of
     *   200%, the scheduler may start four new tasks before stopping the four older tasks (provided
     *   that the cluster resources required to do this are available). The default `maximumPercent`
     *   value for a service using the `REPLICA` service scheduler is 200%.
     *
     * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types
     * and tasks that use the EC2 launch type, the *maximum percent* value is set to the default
     * value and is used to define the upper limit on the number of the tasks in the service that
     * remain in the `RUNNING` state while the container instances are in the `DRAINING` state. If
     * the tasks in the service use the Fargate launch type, the maximum percent value is not used,
     * although it is returned when describing your service.
     */
    public fun maximumPercent(maximumPercent: Number) {
        cdkBuilder.maximumPercent(maximumPercent)
    }

    /**
     * @param minimumHealthyPercent If a service is using the rolling update ( `ECS` ) deployment
     *   type, the `minimumHealthyPercent` represents a lower limit on the number of your service's
     *   tasks that must remain in the `RUNNING` state during a deployment, as a percentage of the
     *   `desiredCount` (rounded up to the nearest integer). This parameter enables you to deploy
     *   without using additional cluster capacity. For example, if your service has a
     *   `desiredCount` of four tasks and a `minimumHealthyPercent` of 50%, the service scheduler
     *   may stop two existing tasks to free up cluster capacity before starting two new tasks.
     *
     * For services that *do not* use a load balancer, the following should be noted:
     * * A service is considered healthy if all essential containers within the tasks in the service
     *   pass their health checks.
     * * If a task has no essential containers with a health check defined, the service scheduler
     *   will wait for 40 seconds after a task reaches a `RUNNING` state before the task is counted
     *   towards the minimum healthy percent total.
     * * If a task has one or more essential containers with a health check defined, the service
     *   scheduler will wait for the task to reach a healthy status before counting it towards the
     *   minimum healthy percent total. A task is considered healthy when all essential containers
     *   within the task have passed their health checks. The amount of time the service scheduler
     *   can wait for is determined by the container health check settings.
     *
     * For services are that *do* use a load balancer, the following should be noted:
     * * If a task has no essential containers with a health check defined, the service scheduler
     *   will wait for the load balancer target group health check to return a healthy status before
     *   counting the task towards the minimum healthy percent total.
     * * If a task has an essential container with a health check defined, the service scheduler
     *   will wait for both the task to reach a healthy status and the load balancer target group
     *   health check to return a healthy status before counting the task towards the minimum
     *   healthy percent total.
     *
     * If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL` deployment types
     * and is running tasks that use the EC2 launch type, the *minimum healthy percent* value is set
     * to the default value and is used to define the lower limit on the number of the tasks in the
     * service that remain in the `RUNNING` state while the container instances are in the
     * `DRAINING` state. If a service is using either the blue/green ( `CODE_DEPLOY` ) or `EXTERNAL`
     * deployment types and is running tasks that use the Fargate launch type, the minimum healthy
     * percent value is not used, although it is returned when describing your service.
     */
    public fun minimumHealthyPercent(minimumHealthyPercent: Number) {
        cdkBuilder.minimumHealthyPercent(minimumHealthyPercent)
    }

    public fun build(): CfnService.DeploymentConfigurationProperty = cdkBuilder.build()
}