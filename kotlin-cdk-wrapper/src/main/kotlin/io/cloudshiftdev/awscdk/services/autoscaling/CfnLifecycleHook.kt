@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLifecycleHook internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnLifecycleHook,
) : CfnResource(cdkObject), IInspectable {
  public open fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  public open fun defaultResult(): String? = unwrap(this).getDefaultResult()

  public open fun defaultResult(`value`: String) {
    unwrap(this).setDefaultResult(`value`)
  }

  public open fun heartbeatTimeout(): Number? = unwrap(this).getHeartbeatTimeout()

  public open fun heartbeatTimeout(`value`: Number) {
    unwrap(this).setHeartbeatTimeout(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lifecycleHookName(): String? = unwrap(this).getLifecycleHookName()

  public open fun lifecycleHookName(`value`: String) {
    unwrap(this).setLifecycleHookName(`value`)
  }

  public open fun lifecycleTransition(): String = unwrap(this).getLifecycleTransition()

  public open fun lifecycleTransition(`value`: String) {
    unwrap(this).setLifecycleTransition(`value`)
  }

  public open fun notificationMetadata(): String? = unwrap(this).getNotificationMetadata()

  public open fun notificationMetadata(`value`: String) {
    unwrap(this).setNotificationMetadata(`value`)
  }

  public open fun notificationTargetArn(): String? = unwrap(this).getNotificationTargetArn()

  public open fun notificationTargetArn(`value`: String) {
    unwrap(this).setNotificationTargetArn(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.Builder =
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnLifecycleHook =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLifecycleHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLifecycleHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLifecycleHook):
        CfnLifecycleHook = CfnLifecycleHook(cdkObject)

    internal fun unwrap(wrapped: CfnLifecycleHook):
        software.amazon.awscdk.services.autoscaling.CfnLifecycleHook = wrapped.cdkObject
  }
}
