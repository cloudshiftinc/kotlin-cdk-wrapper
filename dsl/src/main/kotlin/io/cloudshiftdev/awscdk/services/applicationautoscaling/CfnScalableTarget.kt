package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScalableTarget internal constructor(
  private val cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  public open fun minCapacity(): Number = unwrap(this).getMinCapacity()

  public open fun minCapacity(`value`: Number) {
    unwrap(this).setMinCapacity(`value`)
  }

  public open fun resourceId(): String = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun scalableDimension(): String = unwrap(this).getScalableDimension()

  public open fun scalableDimension(`value`: String) {
    unwrap(this).setScalableDimension(`value`)
  }

  public open fun scheduledActions(): Any? = unwrap(this).getScheduledActions()

  public open fun scheduledActions(`value`: IResolvable) {
    unwrap(this).setScheduledActions(`value`.let(IResolvable::unwrap))
  }

  public open fun scheduledActions(__idx_ac66f0: List<Any>) {
    unwrap(this).setScheduledActions(__idx_ac66f0)
  }

  public open fun serviceNamespace(): String = unwrap(this).getServiceNamespace()

  public open fun serviceNamespace(`value`: String) {
    unwrap(this).setServiceNamespace(`value`)
  }

  public open fun suspendedState(): Any? = unwrap(this).getSuspendedState()

  public open fun suspendedState(`value`: IResolvable) {
    unwrap(this).setSuspendedState(`value`.let(IResolvable::unwrap))
  }

  public open fun suspendedState(`value`: SuspendedStateProperty) {
    unwrap(this).setSuspendedState(`value`.let(SuspendedStateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fc42a1409f1bffc5c5950c7b1e14738545b19870e2cc21058c79727ce913b3a8")
  public open fun suspendedState(`value`: SuspendedStateProperty.Builder.() -> Unit): Unit =
      suspendedState(SuspendedStateProperty(`value`))

  public interface Builder {
    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun resourceId(resourceId: String)

    public fun roleArn(roleArn: String)

    public fun scalableDimension(scalableDimension: String)

    public fun scheduledActions(scheduledActions: IResolvable)

    public fun scheduledActions(scheduledActions: List<Any>)

    public fun serviceNamespace(serviceNamespace: String)

    public fun suspendedState(suspendedState: IResolvable)

    public fun suspendedState(suspendedState: SuspendedStateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c92426d58a0bb3038e5237116a2c51832511f958c67e91a4530463faf342ae7")
    public fun suspendedState(suspendedState: SuspendedStateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.Builder.create(scope,
        id)

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

    override fun serviceNamespace(serviceNamespace: String) {
      cdkBuilder.serviceNamespace(serviceNamespace)
    }

    override fun suspendedState(suspendedState: IResolvable) {
      cdkBuilder.suspendedState(suspendedState.let(IResolvable::unwrap))
    }

    override fun suspendedState(suspendedState: SuspendedStateProperty) {
      cdkBuilder.suspendedState(suspendedState.let(SuspendedStateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c92426d58a0bb3038e5237116a2c51832511f958c67e91a4530463faf342ae7")
    override fun suspendedState(suspendedState: SuspendedStateProperty.Builder.() -> Unit): Unit =
        suspendedState(SuspendedStateProperty(suspendedState))

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScalableTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScalableTarget(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget):
        CfnScalableTarget = CfnScalableTarget(cdkObject)

    internal fun unwrap(wrapped: CfnScalableTarget):
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget = wrapped.cdkObject
  }

  public interface ScheduledActionProperty {
    public fun endTime(): Any? = unwrap(this).getEndTime()

    public fun scalableTargetAction(): Any? = unwrap(this).getScalableTargetAction()

    public fun schedule(): String

    public fun scheduledActionName(): String

    public fun startTime(): Any? = unwrap(this).getStartTime()

    public fun timezone(): String? = unwrap(this).getTimezone()

    public interface Builder {
      public fun endTime(endTime: IResolvable)

      public fun endTime(endTime: Instant)

      public fun scalableTargetAction(scalableTargetAction: IResolvable)

      public fun scalableTargetAction(scalableTargetAction: ScalableTargetActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c45c5e02e114c4c156e6b8b2796dcd8489a0ff765695bba8a8cf4a9185118fe9")
      public
          fun scalableTargetAction(scalableTargetAction: ScalableTargetActionProperty.Builder.() -> Unit)

      public fun schedule(schedule: String)

      public fun scheduledActionName(scheduledActionName: String)

      public fun startTime(startTime: IResolvable)

      public fun startTime(startTime: Instant)

      public fun timezone(timezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.builder()

      override fun endTime(endTime: IResolvable) {
        cdkBuilder.endTime(endTime.let(IResolvable::unwrap))
      }

      override fun endTime(endTime: Instant) {
        cdkBuilder.endTime(endTime)
      }

      override fun scalableTargetAction(scalableTargetAction: IResolvable) {
        cdkBuilder.scalableTargetAction(scalableTargetAction.let(IResolvable::unwrap))
      }

      override fun scalableTargetAction(scalableTargetAction: ScalableTargetActionProperty) {
        cdkBuilder.scalableTargetAction(scalableTargetAction.let(ScalableTargetActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c45c5e02e114c4c156e6b8b2796dcd8489a0ff765695bba8a8cf4a9185118fe9")
      override
          fun scalableTargetAction(scalableTargetAction: ScalableTargetActionProperty.Builder.() -> Unit):
          Unit = scalableTargetAction(ScalableTargetActionProperty(scalableTargetAction))

      override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      override fun scheduledActionName(scheduledActionName: String) {
        cdkBuilder.scheduledActionName(scheduledActionName)
      }

      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable::unwrap))
      }

      override fun startTime(startTime: Instant) {
        cdkBuilder.startTime(startTime)
      }

      override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty,
    ) : ScheduledActionProperty {
      override fun endTime(): Any? = unwrap(this).getEndTime()

      override fun scalableTargetAction(): Any? = unwrap(this).getScalableTargetAction()

      override fun schedule(): String = unwrap(this).getSchedule()

      override fun scheduledActionName(): String = unwrap(this).getScheduledActionName()

      override fun startTime(): Any? = unwrap(this).getStartTime()

      override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty):
          ScheduledActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduledActionProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SuspendedStateProperty {
    public fun dynamicScalingInSuspended(): Any? = unwrap(this).getDynamicScalingInSuspended()

    public fun dynamicScalingOutSuspended(): Any? = unwrap(this).getDynamicScalingOutSuspended()

    public fun scheduledScalingSuspended(): Any? = unwrap(this).getScheduledScalingSuspended()

    public interface Builder {
      public fun dynamicScalingInSuspended(dynamicScalingInSuspended: Boolean)

      public fun dynamicScalingInSuspended(dynamicScalingInSuspended: IResolvable)

      public fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: Boolean)

      public fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: IResolvable)

      public fun scheduledScalingSuspended(scheduledScalingSuspended: Boolean)

      public fun scheduledScalingSuspended(scheduledScalingSuspended: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty.builder()

      override fun dynamicScalingInSuspended(dynamicScalingInSuspended: Boolean) {
        cdkBuilder.dynamicScalingInSuspended(dynamicScalingInSuspended)
      }

      override fun dynamicScalingInSuspended(dynamicScalingInSuspended: IResolvable) {
        cdkBuilder.dynamicScalingInSuspended(dynamicScalingInSuspended.let(IResolvable::unwrap))
      }

      override fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: Boolean) {
        cdkBuilder.dynamicScalingOutSuspended(dynamicScalingOutSuspended)
      }

      override fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: IResolvable) {
        cdkBuilder.dynamicScalingOutSuspended(dynamicScalingOutSuspended.let(IResolvable::unwrap))
      }

      override fun scheduledScalingSuspended(scheduledScalingSuspended: Boolean) {
        cdkBuilder.scheduledScalingSuspended(scheduledScalingSuspended)
      }

      override fun scheduledScalingSuspended(scheduledScalingSuspended: IResolvable) {
        cdkBuilder.scheduledScalingSuspended(scheduledScalingSuspended.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty,
    ) : SuspendedStateProperty {
      override fun dynamicScalingInSuspended(): Any? = unwrap(this).getDynamicScalingInSuspended()

      override fun dynamicScalingOutSuspended(): Any? = unwrap(this).getDynamicScalingOutSuspended()

      override fun scheduledScalingSuspended(): Any? = unwrap(this).getScheduledScalingSuspended()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SuspendedStateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty):
          SuspendedStateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuspendedStateProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScalableTargetActionProperty {
    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    public interface Builder {
      public fun maxCapacity(maxCapacity: Number)

      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.builder()

      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty,
    ) : ScalableTargetActionProperty {
      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalableTargetActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty):
          ScalableTargetActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalableTargetActionProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
