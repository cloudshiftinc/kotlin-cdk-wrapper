@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnJobProps {
  public fun allocatedCapacity(): Number? = unwrap(this).getAllocatedCapacity()

  public fun command(): Any

  public fun connections(): Any? = unwrap(this).getConnections()

  public fun defaultArguments(): Any? = unwrap(this).getDefaultArguments()

  public fun description(): String? = unwrap(this).getDescription()

  public fun executionClass(): String? = unwrap(this).getExecutionClass()

  public fun executionProperty(): Any? = unwrap(this).getExecutionProperty()

  public fun glueVersion(): String? = unwrap(this).getGlueVersion()

  public fun logUri(): String? = unwrap(this).getLogUri()

  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  public fun name(): String? = unwrap(this).getName()

  public fun nonOverridableArguments(): Any? = unwrap(this).getNonOverridableArguments()

  public fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

  public fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  public fun role(): String

  public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun timeout(): Number? = unwrap(this).getTimeout()

  public fun workerType(): String? = unwrap(this).getWorkerType()

  @CdkDslMarker
  public interface Builder {
    public fun allocatedCapacity(allocatedCapacity: Number)

    public fun command(command: IResolvable)

    public fun command(command: CfnJob.JobCommandProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da4b8ddfd931e2258ae33892b3856f3af8e9a12abfea18b04e500130cbfb461b")
    public fun command(command: CfnJob.JobCommandProperty.Builder.() -> Unit)

    public fun connections(connections: IResolvable)

    public fun connections(connections: CfnJob.ConnectionsListProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d004dac2e399a9b5b13d11a74ca3d6d386e4d9f85058f43e671c75dc44dfc4d")
    public fun connections(connections: CfnJob.ConnectionsListProperty.Builder.() -> Unit)

    public fun defaultArguments(defaultArguments: Any)

    public fun description(description: String)

    public fun executionClass(executionClass: String)

    public fun executionProperty(executionProperty: IResolvable)

    public fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c6bf33591925bccc0b1b107899ab75f47a4f5ef4f10f4feb8b97fb37a9f5629")
    public
        fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty.Builder.() -> Unit)

    public fun glueVersion(glueVersion: String)

    public fun logUri(logUri: String)

    public fun maxCapacity(maxCapacity: Number)

    public fun maxRetries(maxRetries: Number)

    public fun name(name: String)

    public fun nonOverridableArguments(nonOverridableArguments: Any)

    public fun notificationProperty(notificationProperty: IResolvable)

    public fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6aec0fe135a85e56aea229fcf808f3fa7c8bf2bf853e52a3787c6052a213058f")
    public
        fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty.Builder.() -> Unit)

    public fun numberOfWorkers(numberOfWorkers: Number)

    public fun role(role: String)

    public fun securityConfiguration(securityConfiguration: String)

    public fun tags(tags: Any)

    public fun timeout(timeout: Number)

    public fun workerType(workerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnJobProps.Builder =
        software.amazon.awscdk.services.glue.CfnJobProps.builder()

    override fun allocatedCapacity(allocatedCapacity: Number) {
      cdkBuilder.allocatedCapacity(allocatedCapacity)
    }

    override fun command(command: IResolvable) {
      cdkBuilder.command(command.let(IResolvable::unwrap))
    }

    override fun command(command: CfnJob.JobCommandProperty) {
      cdkBuilder.command(command.let(CfnJob.JobCommandProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da4b8ddfd931e2258ae33892b3856f3af8e9a12abfea18b04e500130cbfb461b")
    override fun command(command: CfnJob.JobCommandProperty.Builder.() -> Unit): Unit =
        command(CfnJob.JobCommandProperty(command))

    override fun connections(connections: IResolvable) {
      cdkBuilder.connections(connections.let(IResolvable::unwrap))
    }

    override fun connections(connections: CfnJob.ConnectionsListProperty) {
      cdkBuilder.connections(connections.let(CfnJob.ConnectionsListProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d004dac2e399a9b5b13d11a74ca3d6d386e4d9f85058f43e671c75dc44dfc4d")
    override fun connections(connections: CfnJob.ConnectionsListProperty.Builder.() -> Unit): Unit =
        connections(CfnJob.ConnectionsListProperty(connections))

    override fun defaultArguments(defaultArguments: Any) {
      cdkBuilder.defaultArguments(defaultArguments)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun executionClass(executionClass: String) {
      cdkBuilder.executionClass(executionClass)
    }

    override fun executionProperty(executionProperty: IResolvable) {
      cdkBuilder.executionProperty(executionProperty.let(IResolvable::unwrap))
    }

    override fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty) {
      cdkBuilder.executionProperty(executionProperty.let(CfnJob.ExecutionPropertyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c6bf33591925bccc0b1b107899ab75f47a4f5ef4f10f4feb8b97fb37a9f5629")
    override
        fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty.Builder.() -> Unit):
        Unit = executionProperty(CfnJob.ExecutionPropertyProperty(executionProperty))

    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun nonOverridableArguments(nonOverridableArguments: Any) {
      cdkBuilder.nonOverridableArguments(nonOverridableArguments)
    }

    override fun notificationProperty(notificationProperty: IResolvable) {
      cdkBuilder.notificationProperty(notificationProperty.let(IResolvable::unwrap))
    }

    override fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty) {
      cdkBuilder.notificationProperty(notificationProperty.let(CfnJob.NotificationPropertyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6aec0fe135a85e56aea229fcf808f3fa7c8bf2bf853e52a3787c6052a213058f")
    override
        fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty.Builder.() -> Unit):
        Unit = notificationProperty(CfnJob.NotificationPropertyProperty(notificationProperty))

    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnJobProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnJobProps,
  ) : CdkObject(cdkObject), CfnJobProps {
    override fun allocatedCapacity(): Number? = unwrap(this).getAllocatedCapacity()

    override fun command(): Any = unwrap(this).getCommand()

    override fun connections(): Any? = unwrap(this).getConnections()

    override fun defaultArguments(): Any? = unwrap(this).getDefaultArguments()

    override fun description(): String? = unwrap(this).getDescription()

    override fun executionClass(): String? = unwrap(this).getExecutionClass()

    override fun executionProperty(): Any? = unwrap(this).getExecutionProperty()

    override fun glueVersion(): String? = unwrap(this).getGlueVersion()

    override fun logUri(): String? = unwrap(this).getLogUri()

    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()

    override fun name(): String? = unwrap(this).getName()

    override fun nonOverridableArguments(): Any? = unwrap(this).getNonOverridableArguments()

    override fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

    override fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

    override fun role(): String = unwrap(this).getRole()

    override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun timeout(): Number? = unwrap(this).getTimeout()

    override fun workerType(): String? = unwrap(this).getWorkerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJobProps): CfnJobProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobProps): software.amazon.awscdk.services.glue.CfnJobProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnJobProps
  }
}
