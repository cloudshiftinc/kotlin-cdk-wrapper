package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ITargetGroup
import kotlin.Unit

public interface EcsBlueGreenDeploymentConfig {
  public fun blueTargetGroup(): ITargetGroup

  public fun deploymentApprovalWaitTime(): Duration? =
      unwrap(this).getDeploymentApprovalWaitTime()?.let(Duration::wrap)

  public fun greenTargetGroup(): ITargetGroup

  public fun listener(): IListener

  public fun terminationWaitTime(): Duration? =
      unwrap(this).getTerminationWaitTime()?.let(Duration::wrap)

  public fun testListener(): IListener? = unwrap(this).getTestListener()?.let(IListener::wrap)

  public interface Builder {
    public fun blueTargetGroup(blueTargetGroup: ITargetGroup)

    public fun deploymentApprovalWaitTime(deploymentApprovalWaitTime: Duration)

    public fun greenTargetGroup(greenTargetGroup: ITargetGroup)

    public fun listener(listener: IListener)

    public fun terminationWaitTime(terminationWaitTime: Duration)

    public fun testListener(testListener: IListener)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig.builder()

    override fun blueTargetGroup(blueTargetGroup: ITargetGroup) {
      cdkBuilder.blueTargetGroup(blueTargetGroup.let(ITargetGroup::unwrap))
    }

    override fun deploymentApprovalWaitTime(deploymentApprovalWaitTime: Duration) {
      cdkBuilder.deploymentApprovalWaitTime(deploymentApprovalWaitTime.let(Duration::unwrap))
    }

    override fun greenTargetGroup(greenTargetGroup: ITargetGroup) {
      cdkBuilder.greenTargetGroup(greenTargetGroup.let(ITargetGroup::unwrap))
    }

    override fun listener(listener: IListener) {
      cdkBuilder.listener(listener.let(IListener::unwrap))
    }

    override fun terminationWaitTime(terminationWaitTime: Duration) {
      cdkBuilder.terminationWaitTime(terminationWaitTime.let(Duration::unwrap))
    }

    override fun testListener(testListener: IListener) {
      cdkBuilder.testListener(testListener.let(IListener::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig,
  ) : EcsBlueGreenDeploymentConfig {
    override fun blueTargetGroup(): ITargetGroup =
        unwrap(this).getBlueTargetGroup().let(ITargetGroup::wrap)

    override fun deploymentApprovalWaitTime(): Duration? =
        unwrap(this).getDeploymentApprovalWaitTime()?.let(Duration::wrap)

    override fun greenTargetGroup(): ITargetGroup =
        unwrap(this).getGreenTargetGroup().let(ITargetGroup::wrap)

    override fun listener(): IListener = unwrap(this).getListener().let(IListener::wrap)

    override fun terminationWaitTime(): Duration? =
        unwrap(this).getTerminationWaitTime()?.let(Duration::wrap)

    override fun testListener(): IListener? = unwrap(this).getTestListener()?.let(IListener::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EcsBlueGreenDeploymentConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig):
        EcsBlueGreenDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsBlueGreenDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig = (wrapped as
        Wrapper).cdkObject
  }
}
