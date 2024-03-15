@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnLifecycleHookProps {
  public fun autoScalingGroupName(): String

  public fun defaultResult(): String? = unwrap(this).getDefaultResult()

  public fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

  public fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

  public fun lifecycleTransition(): String

  public fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

  public fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroupName(autoScalingGroupName: String)

    public fun defaultResult(defaultResult: String)

    public fun heartbeatTimeout(heartbeatTimeout: Number)

    public fun lifecycleHookName(lifecycleHookName: String)

    public fun lifecycleTransition(lifecycleTransition: String)

    public fun notificationMetadata(notificationMetadata: String)

    public fun notificationTargetArn(notificationTargetArn: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.builder()

    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    override fun defaultResult(defaultResult: String) {
      cdkBuilder.defaultResult(defaultResult)
    }

    override fun heartbeatTimeout(heartbeatTimeout: Number) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    override fun lifecycleHookName(lifecycleHookName: String) {
      cdkBuilder.lifecycleHookName(lifecycleHookName)
    }

    override fun lifecycleTransition(lifecycleTransition: String) {
      cdkBuilder.lifecycleTransition(lifecycleTransition)
    }

    override fun notificationMetadata(notificationMetadata: String) {
      cdkBuilder.notificationMetadata(notificationMetadata)
    }

    override fun notificationTargetArn(notificationTargetArn: String) {
      cdkBuilder.notificationTargetArn(notificationTargetArn)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps,
  ) : CdkObject(cdkObject), CfnLifecycleHookProps {
    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    override fun defaultResult(): String? = unwrap(this).getDefaultResult()

    override fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

    override fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

    override fun lifecycleTransition(): String = unwrap(this).getLifecycleTransition()

    override fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

    override fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLifecycleHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps):
        CfnLifecycleHookProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLifecycleHookProps):
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps
  }
}
