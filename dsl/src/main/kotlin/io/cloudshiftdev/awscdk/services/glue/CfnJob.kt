package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnJob internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnJob,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allocatedCapacity(): Number? = unwrap(this).getAllocatedCapacity()

  public open fun allocatedCapacity(`value`: Number) {
    unwrap(this).setAllocatedCapacity(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun command(): Any = unwrap(this).getCommand()

  public open fun command(`value`: IResolvable) {
    unwrap(this).setCommand(`value`.let(IResolvable::unwrap))
  }

  public open fun command(`value`: JobCommandProperty) {
    unwrap(this).setCommand(`value`.let(JobCommandProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ae45662fe203f8d20debc027cf2996f729ffdd320bc41613ae9baec02a5b454c")
  public open fun command(`value`: JobCommandProperty.Builder.() -> Unit): Unit =
      command(JobCommandProperty(`value`))

  public open fun connections(): Any? = unwrap(this).getConnections()

  public open fun connections(`value`: IResolvable) {
    unwrap(this).setConnections(`value`.let(IResolvable::unwrap))
  }

  public open fun connections(`value`: ConnectionsListProperty) {
    unwrap(this).setConnections(`value`.let(ConnectionsListProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1ead6d7223dff0d1b8b12d86e7ef81b4a77bbb9108e88dfedfd96cd25cee22d")
  public open fun connections(`value`: ConnectionsListProperty.Builder.() -> Unit): Unit =
      connections(ConnectionsListProperty(`value`))

  public open fun defaultArguments(): Any? = unwrap(this).getDefaultArguments()

  public open fun defaultArguments(`value`: Any) {
    unwrap(this).setDefaultArguments(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun executionClass(): String? = unwrap(this).getExecutionClass()

  public open fun executionClass(`value`: String) {
    unwrap(this).setExecutionClass(`value`)
  }

  public open fun executionProperty(): Any? = unwrap(this).getExecutionProperty()

  public open fun executionProperty(`value`: IResolvable) {
    unwrap(this).setExecutionProperty(`value`.let(IResolvable::unwrap))
  }

  public open fun executionProperty(`value`: ExecutionPropertyProperty) {
    unwrap(this).setExecutionProperty(`value`.let(ExecutionPropertyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8141148f7df66671798e0f5389a7ab4490f8468867cf7d49a9d890b987551652")
  public open fun executionProperty(`value`: ExecutionPropertyProperty.Builder.() -> Unit): Unit =
      executionProperty(ExecutionPropertyProperty(`value`))

  public open fun glueVersion(): String? = unwrap(this).getGlueVersion()

  public open fun glueVersion(`value`: String) {
    unwrap(this).setGlueVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logUri(): String? = unwrap(this).getLogUri()

  public open fun logUri(`value`: String) {
    unwrap(this).setLogUri(`value`)
  }

  public open fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  public open fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  public open fun maxRetries(`value`: Number) {
    unwrap(this).setMaxRetries(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun nonOverridableArguments(): Any? = unwrap(this).getNonOverridableArguments()

  public open fun nonOverridableArguments(`value`: Any) {
    unwrap(this).setNonOverridableArguments(`value`)
  }

  public open fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

  public open fun notificationProperty(`value`: IResolvable) {
    unwrap(this).setNotificationProperty(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationProperty(`value`: NotificationPropertyProperty) {
    unwrap(this).setNotificationProperty(`value`.let(NotificationPropertyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11241dabb83ebe4a1477e21bc321e41bc1cea344130d6c7936826a18c05f0d3a")
  public open fun notificationProperty(`value`: NotificationPropertyProperty.Builder.() -> Unit):
      Unit = notificationProperty(NotificationPropertyProperty(`value`))

  public open fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  public open fun numberOfWorkers(`value`: Number) {
    unwrap(this).setNumberOfWorkers(`value`)
  }

  public open fun role(): String = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public open fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

  public open fun securityConfiguration(`value`: String) {
    unwrap(this).setSecurityConfiguration(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun timeout(): Number? = unwrap(this).getTimeout()

  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  public open fun workerType(): String? = unwrap(this).getWorkerType()

  public open fun workerType(`value`: String) {
    unwrap(this).setWorkerType(`value`)
  }

  public interface Builder {
    public fun allocatedCapacity(allocatedCapacity: Number)

    public fun command(command: IResolvable)

    public fun command(command: JobCommandProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3678fc0b0b2ff7ca4b7a27cb9d2c4abb2f9ab703df21a2aa4b93849930e9b6dc")
    public fun command(command: JobCommandProperty.Builder.() -> Unit)

    public fun connections(connections: IResolvable)

    public fun connections(connections: ConnectionsListProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d47c635c872c9a0a3cb04b547de56e3034016eb0a24eaf876dc00d1ef06bd6c")
    public fun connections(connections: ConnectionsListProperty.Builder.() -> Unit)

    public fun defaultArguments(defaultArguments: Any)

    public fun description(description: String)

    public fun executionClass(executionClass: String)

    public fun executionProperty(executionProperty: IResolvable)

    public fun executionProperty(executionProperty: ExecutionPropertyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e22c4a94debded832b280e207ccfc3ce7e6b7f0459e606245076f3a7f950172f")
    public fun executionProperty(executionProperty: ExecutionPropertyProperty.Builder.() -> Unit)

    public fun glueVersion(glueVersion: String)

    public fun logUri(logUri: String)

    public fun maxCapacity(maxCapacity: Number)

    public fun maxRetries(maxRetries: Number)

    public fun name(name: String)

    public fun nonOverridableArguments(nonOverridableArguments: Any)

    public fun notificationProperty(notificationProperty: IResolvable)

    public fun notificationProperty(notificationProperty: NotificationPropertyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0569ffc070d3bb79ae05f6c91224faed3b0be3d4a2867dccefea5eac85dd1c96")
    public
        fun notificationProperty(notificationProperty: NotificationPropertyProperty.Builder.() -> Unit)

    public fun numberOfWorkers(numberOfWorkers: Number)

    public fun role(role: String)

    public fun securityConfiguration(securityConfiguration: String)

    public fun tags(tags: Any)

    public fun timeout(timeout: Number)

    public fun workerType(workerType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnJob.Builder =
        software.amazon.awscdk.services.glue.CfnJob.Builder.create(scope, id)

    override fun allocatedCapacity(allocatedCapacity: Number) {
      cdkBuilder.allocatedCapacity(allocatedCapacity)
    }

    override fun command(command: IResolvable) {
      cdkBuilder.command(command.let(IResolvable::unwrap))
    }

    override fun command(command: JobCommandProperty) {
      cdkBuilder.command(command.let(JobCommandProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3678fc0b0b2ff7ca4b7a27cb9d2c4abb2f9ab703df21a2aa4b93849930e9b6dc")
    override fun command(command: JobCommandProperty.Builder.() -> Unit): Unit =
        command(JobCommandProperty(command))

    override fun connections(connections: IResolvable) {
      cdkBuilder.connections(connections.let(IResolvable::unwrap))
    }

    override fun connections(connections: ConnectionsListProperty) {
      cdkBuilder.connections(connections.let(ConnectionsListProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d47c635c872c9a0a3cb04b547de56e3034016eb0a24eaf876dc00d1ef06bd6c")
    override fun connections(connections: ConnectionsListProperty.Builder.() -> Unit): Unit =
        connections(ConnectionsListProperty(connections))

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

    override fun executionProperty(executionProperty: ExecutionPropertyProperty) {
      cdkBuilder.executionProperty(executionProperty.let(ExecutionPropertyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e22c4a94debded832b280e207ccfc3ce7e6b7f0459e606245076f3a7f950172f")
    override fun executionProperty(executionProperty: ExecutionPropertyProperty.Builder.() -> Unit):
        Unit = executionProperty(ExecutionPropertyProperty(executionProperty))

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

    override fun notificationProperty(notificationProperty: NotificationPropertyProperty) {
      cdkBuilder.notificationProperty(notificationProperty.let(NotificationPropertyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0569ffc070d3bb79ae05f6c91224faed3b0be3d4a2867dccefea5eac85dd1c96")
    override
        fun notificationProperty(notificationProperty: NotificationPropertyProperty.Builder.() -> Unit):
        Unit = notificationProperty(NotificationPropertyProperty(notificationProperty))

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

    public fun build(): software.amazon.awscdk.services.glue.CfnJob = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJob(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob): CfnJob =
        CfnJob(cdkObject)

    internal fun unwrap(wrapped: CfnJob): software.amazon.awscdk.services.glue.CfnJob =
        wrapped.cdkObject
  }

  public interface NotificationPropertyProperty {
    public fun notifyDelayAfter(): Number? = unwrap(this).getNotifyDelayAfter()

    public interface Builder {
      public fun notifyDelayAfter(notifyDelayAfter: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty.builder()

      override fun notifyDelayAfter(notifyDelayAfter: Number) {
        cdkBuilder.notifyDelayAfter(notifyDelayAfter)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty,
    ) : NotificationPropertyProperty {
      override fun notifyDelayAfter(): Number? = unwrap(this).getNotifyDelayAfter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty):
          NotificationPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationPropertyProperty):
          software.amazon.awscdk.services.glue.CfnJob.NotificationPropertyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JobCommandProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun pythonVersion(): String? = unwrap(this).getPythonVersion()

    public fun runtime(): String? = unwrap(this).getRuntime()

    public fun scriptLocation(): String? = unwrap(this).getScriptLocation()

    public interface Builder {
      public fun name(name: String)

      public fun pythonVersion(pythonVersion: String)

      public fun runtime(runtime: String)

      public fun scriptLocation(scriptLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty.Builder
          = software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun pythonVersion(pythonVersion: String) {
        cdkBuilder.pythonVersion(pythonVersion)
      }

      override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      override fun scriptLocation(scriptLocation: String) {
        cdkBuilder.scriptLocation(scriptLocation)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty,
    ) : JobCommandProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun pythonVersion(): String? = unwrap(this).getPythonVersion()

      override fun runtime(): String? = unwrap(this).getRuntime()

      override fun scriptLocation(): String? = unwrap(this).getScriptLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JobCommandProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty):
          JobCommandProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobCommandProperty):
          software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConnectionsListProperty {
    public fun connections(): List<String> = unwrap(this).getConnections() ?: emptyList()

    public interface Builder {
      public fun connections(connections: List<String>)

      public fun connections(vararg connections: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty.Builder =
          software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty.builder()

      override fun connections(connections: List<String>) {
        cdkBuilder.connections(connections)
      }

      override fun connections(vararg connections: String): Unit = connections(connections.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty,
    ) : ConnectionsListProperty {
      override fun connections(): List<String> = unwrap(this).getConnections() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionsListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty):
          ConnectionsListProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionsListProperty):
          software.amazon.awscdk.services.glue.CfnJob.ConnectionsListProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ExecutionPropertyProperty {
    public fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()

    public interface Builder {
      public fun maxConcurrentRuns(maxConcurrentRuns: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty.builder()

      override fun maxConcurrentRuns(maxConcurrentRuns: Number) {
        cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty,
    ) : ExecutionPropertyProperty {
      override fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExecutionPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty):
          ExecutionPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecutionPropertyProperty):
          software.amazon.awscdk.services.glue.CfnJob.ExecutionPropertyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
