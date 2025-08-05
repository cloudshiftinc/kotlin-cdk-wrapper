@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ITargetGroup
import kotlin.Unit

/**
 * Specify how the deployment behaves and how traffic is routed to the ECS service during a
 * blue-green ECS deployment.
 *
 * Example:
 *
 * ```
 * EcsApplication myApplication;
 * Cluster cluster;
 * FargateTaskDefinition taskDefinition;
 * ITargetGroup blueTargetGroup;
 * ITargetGroup greenTargetGroup;
 * IApplicationListener listener;
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .deploymentController(DeploymentController.builder()
 * .type(DeploymentControllerType.CODE_DEPLOY)
 * .build())
 * .build();
 * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
 * .service(service)
 * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
 * .blueTargetGroup(blueTargetGroup)
 * .greenTargetGroup(greenTargetGroup)
 * .listener(listener)
 * .build())
 * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/reference-appspec-file-structure-hooks.html#appspec-hooks-ecs)
 */
public interface EcsBlueGreenDeploymentConfig {
  /**
   * The target group that will be associated with the 'blue' ECS task set during a blue-green
   * deployment.
   */
  public fun blueTargetGroup(): ITargetGroup

  /**
   * Specify how long CodeDeploy waits for approval to continue a blue-green deployment before it
   * stops the deployment.
   *
   * After provisioning the 'green' ECS task set and re-routing test traffic, CodeDeploy can wait
   * for approval before
   * continuing the deployment and re-routing production traffic.  During this wait time, validation
   * such as manual
   * testing or running integration tests can occur using the test traffic port, prior to exposing
   * the new 'green' task
   * set to production traffic.  To approve the deployment, validation steps use the CodeDeploy
   * [ContinueDeployment
   * API(https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html).
   * If the ContinueDeployment API is not called within the wait time period, CodeDeploy will stop
   * the deployment.
   *
   * By default, CodeDeploy will not wait for deployment approval.  After re-routing test traffic to
   * the 'green' ECS task set
   * and running any 'AfterAllowTestTraffic' and 'BeforeAllowTraffic' lifecycle hooks, the
   * deployment will immediately
   * re-route production traffic to the 'green' ECS task set.
   *
   * Default: 0
   */
  public fun deploymentApprovalWaitTime(): Duration? =
      unwrap(this).getDeploymentApprovalWaitTime()?.let(Duration::wrap)

  /**
   * The target group that will be associated with the 'green' ECS task set during a blue-green
   * deployment.
   */
  public fun greenTargetGroup(): ITargetGroup

  /**
   * The load balancer listener used to serve production traffic and to shift production traffic
   * from the 'blue' ECS task set to the 'green' ECS task set during a blue-green deployment.
   */
  public fun listener(): IListener

  /**
   * Specify how long CodeDeploy waits before it terminates the original 'blue' ECS task set when a
   * blue-green deployment is complete.
   *
   * During this wait time, CodeDeploy will continue to monitor any CloudWatch alarms specified for
   * the deployment group,
   * and the deployment group can be configured to automatically roll back if those alarms fire. 
   * Once CodeDeploy begins to
   * terminate the 'blue' ECS task set, the deployment can no longer be rolled back, manually or
   * automatically.
   *
   * By default, the deployment will immediately terminate the 'blue' ECS task set after production
   * traffic is successfully
   * routed to the 'green' ECS task set.
   *
   * Default: 0
   */
  public fun terminationWaitTime(): Duration? =
      unwrap(this).getTerminationWaitTime()?.let(Duration::wrap)

  /**
   * The load balancer listener used to route test traffic to the 'green' ECS task set during a
   * blue-green deployment.
   *
   * During a blue-green deployment, validation can occur after test traffic has been re-routed and
   * before production
   * traffic has been re-routed to the 'green' ECS task set.  You can specify one or more Lambda
   * functions in the
   * deployment's AppSpec file that run during the AfterAllowTestTraffic hook. The functions can run
   * validation tests.
   * If a validation test fails, a deployment rollback is triggered. If the validation tests
   * succeed, the next hook in
   * the deployment lifecycle, BeforeAllowTraffic, is triggered.
   *
   * If a test listener is not specified, the deployment will proceed to routing the production
   * listener to the 'green' ECS task set
   * and will skip the AfterAllowTestTraffic hook.
   *
   * Default: No test listener will be added
   */
  public fun testListener(): IListener? = unwrap(this).getTestListener()?.let(IListener::wrap)

  /**
   * A builder for [EcsBlueGreenDeploymentConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param blueTargetGroup The target group that will be associated with the 'blue' ECS task set
     * during a blue-green deployment. 
     */
    public fun blueTargetGroup(blueTargetGroup: ITargetGroup)

    /**
     * @param deploymentApprovalWaitTime Specify how long CodeDeploy waits for approval to continue
     * a blue-green deployment before it stops the deployment.
     * After provisioning the 'green' ECS task set and re-routing test traffic, CodeDeploy can wait
     * for approval before
     * continuing the deployment and re-routing production traffic.  During this wait time,
     * validation such as manual
     * testing or running integration tests can occur using the test traffic port, prior to exposing
     * the new 'green' task
     * set to production traffic.  To approve the deployment, validation steps use the CodeDeploy
     * [ContinueDeployment
     * API(https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html).
     * If the ContinueDeployment API is not called within the wait time period, CodeDeploy will stop
     * the deployment.
     *
     * By default, CodeDeploy will not wait for deployment approval.  After re-routing test traffic
     * to the 'green' ECS task set
     * and running any 'AfterAllowTestTraffic' and 'BeforeAllowTraffic' lifecycle hooks, the
     * deployment will immediately
     * re-route production traffic to the 'green' ECS task set.
     */
    public fun deploymentApprovalWaitTime(deploymentApprovalWaitTime: Duration)

    /**
     * @param greenTargetGroup The target group that will be associated with the 'green' ECS task
     * set during a blue-green deployment. 
     */
    public fun greenTargetGroup(greenTargetGroup: ITargetGroup)

    /**
     * @param listener The load balancer listener used to serve production traffic and to shift
     * production traffic from the 'blue' ECS task set to the 'green' ECS task set during a blue-green
     * deployment. 
     */
    public fun listener(listener: IListener)

    /**
     * @param terminationWaitTime Specify how long CodeDeploy waits before it terminates the
     * original 'blue' ECS task set when a blue-green deployment is complete.
     * During this wait time, CodeDeploy will continue to monitor any CloudWatch alarms specified
     * for the deployment group,
     * and the deployment group can be configured to automatically roll back if those alarms fire. 
     * Once CodeDeploy begins to
     * terminate the 'blue' ECS task set, the deployment can no longer be rolled back, manually or
     * automatically.
     *
     * By default, the deployment will immediately terminate the 'blue' ECS task set after
     * production traffic is successfully
     * routed to the 'green' ECS task set.
     */
    public fun terminationWaitTime(terminationWaitTime: Duration)

    /**
     * @param testListener The load balancer listener used to route test traffic to the 'green' ECS
     * task set during a blue-green deployment.
     * During a blue-green deployment, validation can occur after test traffic has been re-routed
     * and before production
     * traffic has been re-routed to the 'green' ECS task set.  You can specify one or more Lambda
     * functions in the
     * deployment's AppSpec file that run during the AfterAllowTestTraffic hook. The functions can
     * run validation tests.
     * If a validation test fails, a deployment rollback is triggered. If the validation tests
     * succeed, the next hook in
     * the deployment lifecycle, BeforeAllowTraffic, is triggered.
     *
     * If a test listener is not specified, the deployment will proceed to routing the production
     * listener to the 'green' ECS task set
     * and will skip the AfterAllowTestTraffic hook.
     */
    public fun testListener(testListener: IListener)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig.builder()

    /**
     * @param blueTargetGroup The target group that will be associated with the 'blue' ECS task set
     * during a blue-green deployment. 
     */
    override fun blueTargetGroup(blueTargetGroup: ITargetGroup) {
      cdkBuilder.blueTargetGroup(blueTargetGroup.let(ITargetGroup.Companion::unwrap))
    }

    /**
     * @param deploymentApprovalWaitTime Specify how long CodeDeploy waits for approval to continue
     * a blue-green deployment before it stops the deployment.
     * After provisioning the 'green' ECS task set and re-routing test traffic, CodeDeploy can wait
     * for approval before
     * continuing the deployment and re-routing production traffic.  During this wait time,
     * validation such as manual
     * testing or running integration tests can occur using the test traffic port, prior to exposing
     * the new 'green' task
     * set to production traffic.  To approve the deployment, validation steps use the CodeDeploy
     * [ContinueDeployment
     * API(https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html).
     * If the ContinueDeployment API is not called within the wait time period, CodeDeploy will stop
     * the deployment.
     *
     * By default, CodeDeploy will not wait for deployment approval.  After re-routing test traffic
     * to the 'green' ECS task set
     * and running any 'AfterAllowTestTraffic' and 'BeforeAllowTraffic' lifecycle hooks, the
     * deployment will immediately
     * re-route production traffic to the 'green' ECS task set.
     */
    override fun deploymentApprovalWaitTime(deploymentApprovalWaitTime: Duration) {
      cdkBuilder.deploymentApprovalWaitTime(deploymentApprovalWaitTime.let(Duration.Companion::unwrap))
    }

    /**
     * @param greenTargetGroup The target group that will be associated with the 'green' ECS task
     * set during a blue-green deployment. 
     */
    override fun greenTargetGroup(greenTargetGroup: ITargetGroup) {
      cdkBuilder.greenTargetGroup(greenTargetGroup.let(ITargetGroup.Companion::unwrap))
    }

    /**
     * @param listener The load balancer listener used to serve production traffic and to shift
     * production traffic from the 'blue' ECS task set to the 'green' ECS task set during a blue-green
     * deployment. 
     */
    override fun listener(listener: IListener) {
      cdkBuilder.listener(listener.let(IListener.Companion::unwrap))
    }

    /**
     * @param terminationWaitTime Specify how long CodeDeploy waits before it terminates the
     * original 'blue' ECS task set when a blue-green deployment is complete.
     * During this wait time, CodeDeploy will continue to monitor any CloudWatch alarms specified
     * for the deployment group,
     * and the deployment group can be configured to automatically roll back if those alarms fire. 
     * Once CodeDeploy begins to
     * terminate the 'blue' ECS task set, the deployment can no longer be rolled back, manually or
     * automatically.
     *
     * By default, the deployment will immediately terminate the 'blue' ECS task set after
     * production traffic is successfully
     * routed to the 'green' ECS task set.
     */
    override fun terminationWaitTime(terminationWaitTime: Duration) {
      cdkBuilder.terminationWaitTime(terminationWaitTime.let(Duration.Companion::unwrap))
    }

    /**
     * @param testListener The load balancer listener used to route test traffic to the 'green' ECS
     * task set during a blue-green deployment.
     * During a blue-green deployment, validation can occur after test traffic has been re-routed
     * and before production
     * traffic has been re-routed to the 'green' ECS task set.  You can specify one or more Lambda
     * functions in the
     * deployment's AppSpec file that run during the AfterAllowTestTraffic hook. The functions can
     * run validation tests.
     * If a validation test fails, a deployment rollback is triggered. If the validation tests
     * succeed, the next hook in
     * the deployment lifecycle, BeforeAllowTraffic, is triggered.
     *
     * If a test listener is not specified, the deployment will proceed to routing the production
     * listener to the 'green' ECS task set
     * and will skip the AfterAllowTestTraffic hook.
     */
    override fun testListener(testListener: IListener) {
      cdkBuilder.testListener(testListener.let(IListener.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig,
  ) : CdkObject(cdkObject),
      EcsBlueGreenDeploymentConfig {
    /**
     * The target group that will be associated with the 'blue' ECS task set during a blue-green
     * deployment.
     */
    override fun blueTargetGroup(): ITargetGroup =
        unwrap(this).getBlueTargetGroup().let(ITargetGroup::wrap)

    /**
     * Specify how long CodeDeploy waits for approval to continue a blue-green deployment before it
     * stops the deployment.
     *
     * After provisioning the 'green' ECS task set and re-routing test traffic, CodeDeploy can wait
     * for approval before
     * continuing the deployment and re-routing production traffic.  During this wait time,
     * validation such as manual
     * testing or running integration tests can occur using the test traffic port, prior to exposing
     * the new 'green' task
     * set to production traffic.  To approve the deployment, validation steps use the CodeDeploy
     * [ContinueDeployment
     * API(https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html).
     * If the ContinueDeployment API is not called within the wait time period, CodeDeploy will stop
     * the deployment.
     *
     * By default, CodeDeploy will not wait for deployment approval.  After re-routing test traffic
     * to the 'green' ECS task set
     * and running any 'AfterAllowTestTraffic' and 'BeforeAllowTraffic' lifecycle hooks, the
     * deployment will immediately
     * re-route production traffic to the 'green' ECS task set.
     *
     * Default: 0
     */
    override fun deploymentApprovalWaitTime(): Duration? =
        unwrap(this).getDeploymentApprovalWaitTime()?.let(Duration::wrap)

    /**
     * The target group that will be associated with the 'green' ECS task set during a blue-green
     * deployment.
     */
    override fun greenTargetGroup(): ITargetGroup =
        unwrap(this).getGreenTargetGroup().let(ITargetGroup::wrap)

    /**
     * The load balancer listener used to serve production traffic and to shift production traffic
     * from the 'blue' ECS task set to the 'green' ECS task set during a blue-green deployment.
     */
    override fun listener(): IListener = unwrap(this).getListener().let(IListener::wrap)

    /**
     * Specify how long CodeDeploy waits before it terminates the original 'blue' ECS task set when
     * a blue-green deployment is complete.
     *
     * During this wait time, CodeDeploy will continue to monitor any CloudWatch alarms specified
     * for the deployment group,
     * and the deployment group can be configured to automatically roll back if those alarms fire. 
     * Once CodeDeploy begins to
     * terminate the 'blue' ECS task set, the deployment can no longer be rolled back, manually or
     * automatically.
     *
     * By default, the deployment will immediately terminate the 'blue' ECS task set after
     * production traffic is successfully
     * routed to the 'green' ECS task set.
     *
     * Default: 0
     */
    override fun terminationWaitTime(): Duration? =
        unwrap(this).getTerminationWaitTime()?.let(Duration::wrap)

    /**
     * The load balancer listener used to route test traffic to the 'green' ECS task set during a
     * blue-green deployment.
     *
     * During a blue-green deployment, validation can occur after test traffic has been re-routed
     * and before production
     * traffic has been re-routed to the 'green' ECS task set.  You can specify one or more Lambda
     * functions in the
     * deployment's AppSpec file that run during the AfterAllowTestTraffic hook. The functions can
     * run validation tests.
     * If a validation test fails, a deployment rollback is triggered. If the validation tests
     * succeed, the next hook in
     * the deployment lifecycle, BeforeAllowTraffic, is triggered.
     *
     * If a test listener is not specified, the deployment will proceed to routing the production
     * listener to the 'green' ECS task set
     * and will skip the AfterAllowTestTraffic hook.
     *
     * Default: No test listener will be added
     */
    override fun testListener(): IListener? = unwrap(this).getTestListener()?.let(IListener::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsBlueGreenDeploymentConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig):
        EcsBlueGreenDeploymentConfig = CdkObjectWrappers.wrap(cdkObject) as?
        EcsBlueGreenDeploymentConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsBlueGreenDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig
  }
}
