@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnScalableTargetProps {
  public fun maxCapacity(): Number

  public fun minCapacity(): Number

  public fun resourceId(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun scalableDimension(): String

  public fun scheduledActions(): Any? = unwrap(this).getScheduledActions()

  public fun serviceNamespace(): String

  public fun suspendedState(): Any? = unwrap(this).getSuspendedState()

  @CdkDslMarker
  public interface Builder {
    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun resourceId(resourceId: String)

    public fun roleArn(roleArn: String)

    public fun scalableDimension(scalableDimension: String)

    public fun scheduledActions(scheduledActions: IResolvable)

    public fun scheduledActions(scheduledActions: List<Any>)

    public fun scheduledActions(vararg scheduledActions: Any)

    public fun serviceNamespace(serviceNamespace: String)

    public fun suspendedState(suspendedState: IResolvable)

    public fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab2c3e04fe94bc2b4f933aed3a9f82b44a117cda5d66c8e959e1b4101b80c1f5")
    public
        fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.builder()

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

    override fun scheduledActions(scheduledActions: IResolvable) {
      cdkBuilder.scheduledActions(scheduledActions.let(IResolvable::unwrap))
    }

    override fun scheduledActions(scheduledActions: List<Any>) {
      cdkBuilder.scheduledActions(scheduledActions)
    }

    override fun scheduledActions(vararg scheduledActions: Any): Unit =
        scheduledActions(scheduledActions.toList())

    override fun serviceNamespace(serviceNamespace: String) {
      cdkBuilder.serviceNamespace(serviceNamespace)
    }

    override fun suspendedState(suspendedState: IResolvable) {
      cdkBuilder.suspendedState(suspendedState.let(IResolvable::unwrap))
    }

    override fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty) {
      cdkBuilder.suspendedState(suspendedState.let(CfnScalableTarget.SuspendedStateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab2c3e04fe94bc2b4f933aed3a9f82b44a117cda5d66c8e959e1b4101b80c1f5")
    override
        fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty.Builder.() -> Unit):
        Unit = suspendedState(CfnScalableTarget.SuspendedStateProperty(suspendedState))

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps,
  ) : CdkObject(cdkObject), CfnScalableTargetProps {
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    override fun minCapacity(): Number = unwrap(this).getMinCapacity()

    override fun resourceId(): String = unwrap(this).getResourceId()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun scalableDimension(): String = unwrap(this).getScalableDimension()

    override fun scheduledActions(): Any? = unwrap(this).getScheduledActions()

    override fun serviceNamespace(): String = unwrap(this).getServiceNamespace()

    override fun suspendedState(): Any? = unwrap(this).getSuspendedState()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScalableTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps):
        CfnScalableTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScalableTargetProps):
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps
  }
}
