package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
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

public open class CfnMaintenanceWindowTask internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cutoffBehavior(): String? = unwrap(this).getCutoffBehavior()

  public open fun cutoffBehavior(`value`: String) {
    unwrap(this).setCutoffBehavior(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingInfo(): Any? = unwrap(this).getLoggingInfo()

  public open fun loggingInfo(`value`: IResolvable) {
    unwrap(this).setLoggingInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingInfo(`value`: LoggingInfoProperty) {
    unwrap(this).setLoggingInfo(`value`.let(LoggingInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cbba0f3c66e7a2938dee48fc664fc6682760e4935297faa77eeff3c4469f1157")
  public open fun loggingInfo(`value`: LoggingInfoProperty.Builder.() -> Unit): Unit =
      loggingInfo(LoggingInfoProperty(`value`))

  public open fun maxConcurrency(): String? = unwrap(this).getMaxConcurrency()

  public open fun maxConcurrency(`value`: String) {
    unwrap(this).setMaxConcurrency(`value`)
  }

  public open fun maxErrors(): String? = unwrap(this).getMaxErrors()

  public open fun maxErrors(`value`: String) {
    unwrap(this).setMaxErrors(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun priority(): Number = unwrap(this).getPriority()

  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  public open fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  public open fun targets(): Any? = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  public open fun targets(vararg __idx_ac66f0: Any): Unit = targets(__idx_ac66f0.toList())

  public open fun taskArn(): String = unwrap(this).getTaskArn()

  public open fun taskArn(`value`: String) {
    unwrap(this).setTaskArn(`value`)
  }

  public open fun taskInvocationParameters(): Any? = unwrap(this).getTaskInvocationParameters()

  public open fun taskInvocationParameters(`value`: IResolvable) {
    unwrap(this).setTaskInvocationParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun taskInvocationParameters(`value`: TaskInvocationParametersProperty) {
    unwrap(this).setTaskInvocationParameters(`value`.let(TaskInvocationParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e81404d3ee8fccf29e12a8734c109e64151389d0deeef605b473627741989f3")
  public open
      fun taskInvocationParameters(`value`: TaskInvocationParametersProperty.Builder.() -> Unit):
      Unit = taskInvocationParameters(TaskInvocationParametersProperty(`value`))

  public open fun taskParameters(): Any? = unwrap(this).getTaskParameters()

  public open fun taskParameters(`value`: Any) {
    unwrap(this).setTaskParameters(`value`)
  }

  public open fun taskType(): String = unwrap(this).getTaskType()

  public open fun taskType(`value`: String) {
    unwrap(this).setTaskType(`value`)
  }

  public open fun windowId(): String = unwrap(this).getWindowId()

  public open fun windowId(`value`: String) {
    unwrap(this).setWindowId(`value`)
  }

  public interface Builder {
    public fun cutoffBehavior(cutoffBehavior: String)

    public fun description(description: String)

    public fun loggingInfo(loggingInfo: IResolvable)

    public fun loggingInfo(loggingInfo: LoggingInfoProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdbf17c449fb922feebcb1dff803691433d401a752d8933a05ec06cdd103c753")
    public fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit)

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

    public fun taskInvocationParameters(taskInvocationParameters: TaskInvocationParametersProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40a4651a882485982b5967f6dffd4aeed8c26aa0d3d45a180658ff849c2b80f2")
    public
        fun taskInvocationParameters(taskInvocationParameters: TaskInvocationParametersProperty.Builder.() -> Unit)

    public fun taskParameters(taskParameters: Any)

    public fun taskType(taskType: String)

    public fun windowId(windowId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.Builder.create(scope, id)

    override fun cutoffBehavior(cutoffBehavior: String) {
      cdkBuilder.cutoffBehavior(cutoffBehavior)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun loggingInfo(loggingInfo: IResolvable) {
      cdkBuilder.loggingInfo(loggingInfo.let(IResolvable::unwrap))
    }

    override fun loggingInfo(loggingInfo: LoggingInfoProperty) {
      cdkBuilder.loggingInfo(loggingInfo.let(LoggingInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdbf17c449fb922feebcb1dff803691433d401a752d8933a05ec06cdd103c753")
    override fun loggingInfo(loggingInfo: LoggingInfoProperty.Builder.() -> Unit): Unit =
        loggingInfo(LoggingInfoProperty(loggingInfo))

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
        fun taskInvocationParameters(taskInvocationParameters: TaskInvocationParametersProperty) {
      cdkBuilder.taskInvocationParameters(taskInvocationParameters.let(TaskInvocationParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40a4651a882485982b5967f6dffd4aeed8c26aa0d3d45a180658ff849c2b80f2")
    override
        fun taskInvocationParameters(taskInvocationParameters: TaskInvocationParametersProperty.Builder.() -> Unit):
        Unit = taskInvocationParameters(TaskInvocationParametersProperty(taskInvocationParameters))

    override fun taskParameters(taskParameters: Any) {
      cdkBuilder.taskParameters(taskParameters)
    }

    override fun taskType(taskType: String) {
      cdkBuilder.taskType(taskType)
    }

    override fun windowId(windowId: String) {
      cdkBuilder.windowId(windowId)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMaintenanceWindowTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMaintenanceWindowTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask):
        CfnMaintenanceWindowTask = CfnMaintenanceWindowTask(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowTask):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask = wrapped.cdkObject
  }

  public interface MaintenanceWindowLambdaParametersProperty {
    public fun clientContext(): String? = unwrap(this).getClientContext()

    public fun payload(): String? = unwrap(this).getPayload()

    public fun qualifier(): String? = unwrap(this).getQualifier()

    public interface Builder {
      public fun clientContext(clientContext: String)

      public fun payload(payload: String)

      public fun qualifier(qualifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty.builder()

      override fun clientContext(clientContext: String) {
        cdkBuilder.clientContext(clientContext)
      }

      override fun payload(payload: String) {
        cdkBuilder.payload(payload)
      }

      override fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty,
    ) : MaintenanceWindowLambdaParametersProperty {
      override fun clientContext(): String? = unwrap(this).getClientContext()

      override fun payload(): String? = unwrap(this).getPayload()

      override fun qualifier(): String? = unwrap(this).getQualifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceWindowLambdaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty):
          MaintenanceWindowLambdaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowLambdaParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowLambdaParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MaintenanceWindowRunCommandParametersProperty {
    public fun cloudWatchOutputConfig(): Any? = unwrap(this).getCloudWatchOutputConfig()

    public fun comment(): String? = unwrap(this).getComment()

    public fun documentHash(): String? = unwrap(this).getDocumentHash()

    public fun documentHashType(): String? = unwrap(this).getDocumentHashType()

    public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    public fun notificationConfig(): Any? = unwrap(this).getNotificationConfig()

    public fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

    public fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

    public fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()

    public interface Builder {
      public fun cloudWatchOutputConfig(cloudWatchOutputConfig: IResolvable)

      public fun cloudWatchOutputConfig(cloudWatchOutputConfig: CloudWatchOutputConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("102c967a4cf9341fe42734454c5ad0413f929090f11efe28c173537a2eef95f6")
      public
          fun cloudWatchOutputConfig(cloudWatchOutputConfig: CloudWatchOutputConfigProperty.Builder.() -> Unit)

      public fun comment(comment: String)

      public fun documentHash(documentHash: String)

      public fun documentHashType(documentHashType: String)

      public fun documentVersion(documentVersion: String)

      public fun notificationConfig(notificationConfig: IResolvable)

      public fun notificationConfig(notificationConfig: NotificationConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b25b2c11086aec5ffa4631dd76b650010e51c85ba07b52e2ab287d52404837b4")
      public
          fun notificationConfig(notificationConfig: NotificationConfigProperty.Builder.() -> Unit)

      public fun outputS3BucketName(outputS3BucketName: String)

      public fun outputS3KeyPrefix(outputS3KeyPrefix: String)

      public fun parameters(parameters: Any)

      public fun serviceRoleArn(serviceRoleArn: String)

      public fun timeoutSeconds(timeoutSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty.builder()

      override fun cloudWatchOutputConfig(cloudWatchOutputConfig: IResolvable) {
        cdkBuilder.cloudWatchOutputConfig(cloudWatchOutputConfig.let(IResolvable::unwrap))
      }

      override fun cloudWatchOutputConfig(cloudWatchOutputConfig: CloudWatchOutputConfigProperty) {
        cdkBuilder.cloudWatchOutputConfig(cloudWatchOutputConfig.let(CloudWatchOutputConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("102c967a4cf9341fe42734454c5ad0413f929090f11efe28c173537a2eef95f6")
      override
          fun cloudWatchOutputConfig(cloudWatchOutputConfig: CloudWatchOutputConfigProperty.Builder.() -> Unit):
          Unit = cloudWatchOutputConfig(CloudWatchOutputConfigProperty(cloudWatchOutputConfig))

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun documentHash(documentHash: String) {
        cdkBuilder.documentHash(documentHash)
      }

      override fun documentHashType(documentHashType: String) {
        cdkBuilder.documentHashType(documentHashType)
      }

      override fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
      }

      override fun notificationConfig(notificationConfig: IResolvable) {
        cdkBuilder.notificationConfig(notificationConfig.let(IResolvable::unwrap))
      }

      override fun notificationConfig(notificationConfig: NotificationConfigProperty) {
        cdkBuilder.notificationConfig(notificationConfig.let(NotificationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b25b2c11086aec5ffa4631dd76b650010e51c85ba07b52e2ab287d52404837b4")
      override
          fun notificationConfig(notificationConfig: NotificationConfigProperty.Builder.() -> Unit):
          Unit = notificationConfig(NotificationConfigProperty(notificationConfig))

      override fun outputS3BucketName(outputS3BucketName: String) {
        cdkBuilder.outputS3BucketName(outputS3BucketName)
      }

      override fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
        cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
      }

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      override fun serviceRoleArn(serviceRoleArn: String) {
        cdkBuilder.serviceRoleArn(serviceRoleArn)
      }

      override fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty,
    ) : MaintenanceWindowRunCommandParametersProperty {
      override fun cloudWatchOutputConfig(): Any? = unwrap(this).getCloudWatchOutputConfig()

      override fun comment(): String? = unwrap(this).getComment()

      override fun documentHash(): String? = unwrap(this).getDocumentHash()

      override fun documentHashType(): String? = unwrap(this).getDocumentHashType()

      override fun documentVersion(): String? = unwrap(this).getDocumentVersion()

      override fun notificationConfig(): Any? = unwrap(this).getNotificationConfig()

      override fun outputS3BucketName(): String? = unwrap(this).getOutputS3BucketName()

      override fun outputS3KeyPrefix(): String? = unwrap(this).getOutputS3KeyPrefix()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

      override fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceWindowRunCommandParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty):
          MaintenanceWindowRunCommandParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowRunCommandParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowRunCommandParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotificationConfigProperty {
    public fun notificationArn(): String

    public fun notificationEvents(): List<String> = unwrap(this).getNotificationEvents() ?:
        emptyList()

    public fun notificationType(): String? = unwrap(this).getNotificationType()

    public interface Builder {
      public fun notificationArn(notificationArn: String)

      public fun notificationEvents(notificationEvents: List<String>)

      public fun notificationEvents(vararg notificationEvents: String)

      public fun notificationType(notificationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty.builder()

      override fun notificationArn(notificationArn: String) {
        cdkBuilder.notificationArn(notificationArn)
      }

      override fun notificationEvents(notificationEvents: List<String>) {
        cdkBuilder.notificationEvents(notificationEvents)
      }

      override fun notificationEvents(vararg notificationEvents: String): Unit =
          notificationEvents(notificationEvents.toList())

      override fun notificationType(notificationType: String) {
        cdkBuilder.notificationType(notificationType)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty,
    ) : NotificationConfigProperty {
      override fun notificationArn(): String = unwrap(this).getNotificationArn()

      override fun notificationEvents(): List<String> = unwrap(this).getNotificationEvents() ?:
          emptyList()

      override fun notificationType(): String? = unwrap(this).getNotificationType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty):
          NotificationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationConfigProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.NotificationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetProperty {
    public fun key(): String

    public fun values(): List<String>

    public interface Builder {
      public fun key(key: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty,
    ) : TargetProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MaintenanceWindowAutomationParametersProperty {
    public fun documentVersion(): String? = unwrap(this).getDocumentVersion()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public interface Builder {
      public fun documentVersion(documentVersion: String)

      public fun parameters(parameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.builder()

      override fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
      }

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty,
    ) : MaintenanceWindowAutomationParametersProperty {
      override fun documentVersion(): String? = unwrap(this).getDocumentVersion()

      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceWindowAutomationParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty):
          MaintenanceWindowAutomationParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowAutomationParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MaintenanceWindowStepFunctionsParametersProperty {
    public fun input(): String? = unwrap(this).getInput()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun input(input: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.builder()

      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty,
    ) : MaintenanceWindowStepFunctionsParametersProperty {
      override fun input(): String? = unwrap(this).getInput()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MaintenanceWindowStepFunctionsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty):
          MaintenanceWindowStepFunctionsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowStepFunctionsParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchOutputConfigProperty {
    public fun cloudWatchLogGroupName(): String? = unwrap(this).getCloudWatchLogGroupName()

    public fun cloudWatchOutputEnabled(): Any? = unwrap(this).getCloudWatchOutputEnabled()

    public interface Builder {
      public fun cloudWatchLogGroupName(cloudWatchLogGroupName: String)

      public fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: Boolean)

      public fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty.builder()

      override fun cloudWatchLogGroupName(cloudWatchLogGroupName: String) {
        cdkBuilder.cloudWatchLogGroupName(cloudWatchLogGroupName)
      }

      override fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: Boolean) {
        cdkBuilder.cloudWatchOutputEnabled(cloudWatchOutputEnabled)
      }

      override fun cloudWatchOutputEnabled(cloudWatchOutputEnabled: IResolvable) {
        cdkBuilder.cloudWatchOutputEnabled(cloudWatchOutputEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty,
    ) : CloudWatchOutputConfigProperty {
      override fun cloudWatchLogGroupName(): String? = unwrap(this).getCloudWatchLogGroupName()

      override fun cloudWatchOutputEnabled(): Any? = unwrap(this).getCloudWatchOutputEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty):
          CloudWatchOutputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchOutputConfigProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.CloudWatchOutputConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TaskInvocationParametersProperty {
    public fun maintenanceWindowAutomationParameters(): Any? =
        unwrap(this).getMaintenanceWindowAutomationParameters()

    public fun maintenanceWindowLambdaParameters(): Any? =
        unwrap(this).getMaintenanceWindowLambdaParameters()

    public fun maintenanceWindowRunCommandParameters(): Any? =
        unwrap(this).getMaintenanceWindowRunCommandParameters()

    public fun maintenanceWindowStepFunctionsParameters(): Any? =
        unwrap(this).getMaintenanceWindowStepFunctionsParameters()

    public interface Builder {
      public
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: IResolvable)

      public
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63593ae3b7f0d928a6578272ca63cc51e4a876c21628cca9194a24ee8afe3897")
      public
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParametersProperty.Builder.() -> Unit)

      public fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: IResolvable)

      public
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3956ce734b93da1442936537185d5795eb29e05ce35a9cad4b851c72c11ee1f6")
      public
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParametersProperty.Builder.() -> Unit)

      public
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: IResolvable)

      public
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5afbfb626ae13685f0b01adfd1badbb701d9f85722c765f966389636f0e69da")
      public
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParametersProperty.Builder.() -> Unit)

      public
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: IResolvable)

      public
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("270f735065e23fe71e6ef7b5b5b4093761bcdfe7c6309ec8c843a2193d1b4ee3")
      public
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty.builder()

      override
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: IResolvable) {
        cdkBuilder.maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters.let(IResolvable::unwrap))
      }

      override
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParametersProperty) {
        cdkBuilder.maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters.let(MaintenanceWindowAutomationParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63593ae3b7f0d928a6578272ca63cc51e4a876c21628cca9194a24ee8afe3897")
      override
          fun maintenanceWindowAutomationParameters(maintenanceWindowAutomationParameters: MaintenanceWindowAutomationParametersProperty.Builder.() -> Unit):
          Unit =
          maintenanceWindowAutomationParameters(MaintenanceWindowAutomationParametersProperty(maintenanceWindowAutomationParameters))

      override
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: IResolvable) {
        cdkBuilder.maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters.let(IResolvable::unwrap))
      }

      override
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParametersProperty) {
        cdkBuilder.maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters.let(MaintenanceWindowLambdaParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3956ce734b93da1442936537185d5795eb29e05ce35a9cad4b851c72c11ee1f6")
      override
          fun maintenanceWindowLambdaParameters(maintenanceWindowLambdaParameters: MaintenanceWindowLambdaParametersProperty.Builder.() -> Unit):
          Unit =
          maintenanceWindowLambdaParameters(MaintenanceWindowLambdaParametersProperty(maintenanceWindowLambdaParameters))

      override
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: IResolvable) {
        cdkBuilder.maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters.let(IResolvable::unwrap))
      }

      override
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParametersProperty) {
        cdkBuilder.maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters.let(MaintenanceWindowRunCommandParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5afbfb626ae13685f0b01adfd1badbb701d9f85722c765f966389636f0e69da")
      override
          fun maintenanceWindowRunCommandParameters(maintenanceWindowRunCommandParameters: MaintenanceWindowRunCommandParametersProperty.Builder.() -> Unit):
          Unit =
          maintenanceWindowRunCommandParameters(MaintenanceWindowRunCommandParametersProperty(maintenanceWindowRunCommandParameters))

      override
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: IResolvable) {
        cdkBuilder.maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters.let(IResolvable::unwrap))
      }

      override
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParametersProperty) {
        cdkBuilder.maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters.let(MaintenanceWindowStepFunctionsParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("270f735065e23fe71e6ef7b5b5b4093761bcdfe7c6309ec8c843a2193d1b4ee3")
      override
          fun maintenanceWindowStepFunctionsParameters(maintenanceWindowStepFunctionsParameters: MaintenanceWindowStepFunctionsParametersProperty.Builder.() -> Unit):
          Unit =
          maintenanceWindowStepFunctionsParameters(MaintenanceWindowStepFunctionsParametersProperty(maintenanceWindowStepFunctionsParameters))

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty,
    ) : TaskInvocationParametersProperty {
      override fun maintenanceWindowAutomationParameters(): Any? =
          unwrap(this).getMaintenanceWindowAutomationParameters()

      override fun maintenanceWindowLambdaParameters(): Any? =
          unwrap(this).getMaintenanceWindowLambdaParameters()

      override fun maintenanceWindowRunCommandParameters(): Any? =
          unwrap(this).getMaintenanceWindowRunCommandParameters()

      override fun maintenanceWindowStepFunctionsParameters(): Any? =
          unwrap(this).getMaintenanceWindowStepFunctionsParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TaskInvocationParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty):
          TaskInvocationParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskInvocationParametersProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoggingInfoProperty {
    public fun region(): String

    public fun s3Bucket(): String

    public fun s3Prefix(): String? = unwrap(this).getS3Prefix()

    public interface Builder {
      public fun region(region: String)

      public fun s3Bucket(s3Bucket: String)

      public fun s3Prefix(s3Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty.builder()

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty,
    ) : LoggingInfoProperty {
      override fun region(): String = unwrap(this).getRegion()

      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3Prefix(): String? = unwrap(this).getS3Prefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty):
          LoggingInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingInfoProperty):
          software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
