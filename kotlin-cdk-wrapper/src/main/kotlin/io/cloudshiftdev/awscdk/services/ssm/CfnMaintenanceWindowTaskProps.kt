@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMaintenanceWindowTaskProps {
  public fun cutoffBehavior(): String? = unwrap(this).getCutoffBehavior()

  public fun description(): String? = unwrap(this).getDescription()

  public fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  public fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

  public fun maxErrors(): String? = unwrap(this).getMaxErrors()

  public fun name(): String? = unwrap(this).getName()

  public fun priority(): Number

  public fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

  public fun targets(): Any? = unwrap(this).getTargets()

  public fun taskArn(): String

  public fun taskInvocationParameters(): Any? = unwrap(this).getTaskInvocationParameters()

  public fun taskParameters(): Any? = unwrap(this).getTaskParameters()

  public fun taskType(): String

  public fun windowId(): String

  @CdkDslMarker
  public interface Builder {
    public fun cutoffBehavior(cutoffBehavior: String)

    public fun description(description: String)

    public fun loggingInfo(loggingInfo: IResolvable)

    public fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6424ecd79378f2fde91ccb9bffd09db2b58f9b0c80c60e41d8046c2f89557a1f")
    public
        fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder.() -> Unit)

    public fun maxConcurrency(maxConcurrency: String)

    public fun maxErrors(maxErrors: String)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun serviceRoleArn(serviceRoleArn: String)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)

    public fun taskArn(taskArn: String)

    public fun taskInvocationParameters(taskInvocationParameters: IResolvable)

    public
        fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f55a86697eb847f753bbaae871485464d341d9dcb1a3d62946e081092c8ac14e")
    public
        fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder.() -> Unit)

    public fun taskParameters(taskParameters: Any)

    public fun taskType(taskType: String)

    public fun windowId(windowId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps.builder()

    override fun cutoffBehavior(cutoffBehavior: String) {
      cdkBuilder.cutoffBehavior(cutoffBehavior)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable::unwrap))
    }

    override fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(CfnMaintenanceWindowTask.LoggingInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6424ecd79378f2fde91ccb9bffd09db2b58f9b0c80c60e41d8046c2f89557a1f")
    override
        fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder.() -> Unit):
        Unit = loggingInfo(CfnMaintenanceWindowTask.LoggingInfoProperty(loggingInfo))

    override fun maxConcurrency(maxConcurrency: String) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    override fun maxErrors(maxErrors: String) {
      cdkBuilder.maxErrors(maxErrors)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    override fun taskArn(taskArn: String) {
      cdkBuilder.taskArn(taskArn)
    }

    override fun taskInvocationParameters(taskInvocationParameters: IResolvable) {
      cdkBuilder.taskInvocationParameters(taskInvocationParameters.let(IResolvable::unwrap))
    }

    override
        fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty) {
      cdkBuilder.taskInvocationParameters(taskInvocationParameters.let(CfnMaintenanceWindowTask.TaskInvocationParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f55a86697eb847f753bbaae871485464d341d9dcb1a3d62946e081092c8ac14e")
    override
        fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder.() -> Unit):
        Unit =
        taskInvocationParameters(CfnMaintenanceWindowTask.TaskInvocationParametersProperty(taskInvocationParameters))

    override fun taskParameters(taskParameters: Any) {
      cdkBuilder.taskParameters(taskParameters)
    }

    override fun taskType(taskType: String) {
      cdkBuilder.taskType(taskType)
    }

    override fun windowId(windowId: String) {
      cdkBuilder.windowId(windowId)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps,
  ) : CdkObject(cdkObject), CfnMaintenanceWindowTaskProps {
    override fun cutoffBehavior(): String? = unwrap(this).getCutoffBehavior()

    override fun description(): String? = unwrap(this).getDescription()

    override fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

    override fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

    override fun maxErrors(): String? = unwrap(this).getMaxErrors()

    override fun name(): String? = unwrap(this).getName()

    override fun priority(): Number = unwrap(this).getPriority()

    override fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

    override fun targets(): Any? = unwrap(this).getTargets()

    override fun taskArn(): String = unwrap(this).getTaskArn()

    override fun taskInvocationParameters(): Any? = unwrap(this).getTaskInvocationParameters()

    override fun taskParameters(): Any? = unwrap(this).getTaskParameters()

    override fun taskType(): String = unwrap(this).getTaskType()

    override fun windowId(): String = unwrap(this).getWindowId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMaintenanceWindowTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps):
        CfnMaintenanceWindowTaskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowTaskProps):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps
  }
}
