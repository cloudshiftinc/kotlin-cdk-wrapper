package io.cloudshiftdev.awscdk.services.mwaa

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun airflowConfigurationOptions(): Any? =
      unwrap(this).getAirflowConfigurationOptions()

  public open fun airflowConfigurationOptions(`value`: Any) {
    unwrap(this).setAirflowConfigurationOptions(`value`)
  }

  public open fun airflowVersion(): String? = unwrap(this).getAirflowVersion()

  public open fun airflowVersion(`value`: String) {
    unwrap(this).setAirflowVersion(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCeleryExecutorQueue(): String = unwrap(this).getAttrCeleryExecutorQueue()

  public open fun attrDatabaseVpcEndpointService(): String =
      unwrap(this).getAttrDatabaseVpcEndpointService()

  public open fun attrLoggingConfigurationDagProcessingLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationDagProcessingLogsCloudWatchLogGroupArn()

  public open fun attrLoggingConfigurationSchedulerLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationSchedulerLogsCloudWatchLogGroupArn()

  public open fun attrLoggingConfigurationTaskLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationTaskLogsCloudWatchLogGroupArn()

  public open fun attrLoggingConfigurationWebserverLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationWebserverLogsCloudWatchLogGroupArn()

  public open fun attrLoggingConfigurationWorkerLogsCloudWatchLogGroupArn(): String =
      unwrap(this).getAttrLoggingConfigurationWorkerLogsCloudWatchLogGroupArn()

  public open fun attrWebserverUrl(): String = unwrap(this).getAttrWebserverUrl()

  public open fun attrWebserverVpcEndpointService(): String =
      unwrap(this).getAttrWebserverVpcEndpointService()

  public open fun dagS3Path(): String? = unwrap(this).getDagS3Path()

  public open fun dagS3Path(`value`: String) {
    unwrap(this).setDagS3Path(`value`)
  }

  public open fun endpointManagement(): String? = unwrap(this).getEndpointManagement()

  public open fun endpointManagement(`value`: String) {
    unwrap(this).setEndpointManagement(`value`)
  }

  public open fun environmentClass(): String? = unwrap(this).getEnvironmentClass()

  public open fun environmentClass(`value`: String) {
    unwrap(this).setEnvironmentClass(`value`)
  }

  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKey(): String? = unwrap(this).getKmsKey()

  public open fun kmsKey(`value`: String) {
    unwrap(this).setKmsKey(`value`)
  }

  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c53ce76ce84dacbfe710798e97d1fe79d10a52578c0f857ee12682c21f3c7ba5")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  public open fun maxWorkers(): Number? = unwrap(this).getMaxWorkers()

  public open fun maxWorkers(`value`: Number) {
    unwrap(this).setMaxWorkers(`value`)
  }

  public open fun minWorkers(): Number? = unwrap(this).getMinWorkers()

  public open fun minWorkers(`value`: Number) {
    unwrap(this).setMinWorkers(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b3ae14ceb6a878b3b97ddef8f2ad4276af50090f453873897804dd5990ccc17c")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  public open fun pluginsS3ObjectVersion(): String? = unwrap(this).getPluginsS3ObjectVersion()

  public open fun pluginsS3ObjectVersion(`value`: String) {
    unwrap(this).setPluginsS3ObjectVersion(`value`)
  }

  public open fun pluginsS3Path(): String? = unwrap(this).getPluginsS3Path()

  public open fun pluginsS3Path(`value`: String) {
    unwrap(this).setPluginsS3Path(`value`)
  }

  public open fun requirementsS3ObjectVersion(): String? =
      unwrap(this).getRequirementsS3ObjectVersion()

  public open fun requirementsS3ObjectVersion(`value`: String) {
    unwrap(this).setRequirementsS3ObjectVersion(`value`)
  }

  public open fun requirementsS3Path(): String? = unwrap(this).getRequirementsS3Path()

  public open fun requirementsS3Path(`value`: String) {
    unwrap(this).setRequirementsS3Path(`value`)
  }

  public open fun schedulers(): Number? = unwrap(this).getSchedulers()

  public open fun schedulers(`value`: Number) {
    unwrap(this).setSchedulers(`value`)
  }

  public open fun sourceBucketArn(): String? = unwrap(this).getSourceBucketArn()

  public open fun sourceBucketArn(`value`: String) {
    unwrap(this).setSourceBucketArn(`value`)
  }

  public open fun startupScriptS3ObjectVersion(): String? =
      unwrap(this).getStartupScriptS3ObjectVersion()

  public open fun startupScriptS3ObjectVersion(`value`: String) {
    unwrap(this).setStartupScriptS3ObjectVersion(`value`)
  }

  public open fun startupScriptS3Path(): String? = unwrap(this).getStartupScriptS3Path()

  public open fun startupScriptS3Path(`value`: String) {
    unwrap(this).setStartupScriptS3Path(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun webserverAccessMode(): String? = unwrap(this).getWebserverAccessMode()

  public open fun webserverAccessMode(`value`: String) {
    unwrap(this).setWebserverAccessMode(`value`)
  }

  public open fun weeklyMaintenanceWindowStart(): String? =
      unwrap(this).getWeeklyMaintenanceWindowStart()

  public open fun weeklyMaintenanceWindowStart(`value`: String) {
    unwrap(this).setWeeklyMaintenanceWindowStart(`value`)
  }

  public interface Builder {
    public fun airflowConfigurationOptions(airflowConfigurationOptions: Any) {
    }

    public fun airflowVersion(airflowVersion: String) {
    }

    public fun dagS3Path(dagS3Path: String) {
    }

    public fun endpointManagement(endpointManagement: String) {
    }

    public fun environmentClass(environmentClass: String) {
    }

    public fun executionRoleArn(executionRoleArn: String) {
    }

    public fun kmsKey(kmsKey: String) {
    }

    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    }

    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99a7a60d5549be3670ca52741505fe0a1ca11f802c63b27b9c2738515d4155df")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit) {
    }

    public fun maxWorkers(maxWorkers: Number) {
    }

    public fun minWorkers(minWorkers: Number) {
    }

    public fun name(name: String) {
    }

    public fun networkConfiguration(networkConfiguration: IResolvable) {
    }

    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea4dc89fc98a15a9806bff385274d0b15b175cd8a5bbf0fe46cadc5429b92588")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit) {
    }

    public fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String) {
    }

    public fun pluginsS3Path(pluginsS3Path: String) {
    }

    public fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String) {
    }

    public fun requirementsS3Path(requirementsS3Path: String) {
    }

    public fun schedulers(schedulers: Number) {
    }

    public fun sourceBucketArn(sourceBucketArn: String) {
    }

    public fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String) {
    }

    public fun startupScriptS3Path(startupScriptS3Path: String) {
    }

    public fun tags(tags: Any) {
    }

    public fun webserverAccessMode(webserverAccessMode: String) {
    }

    public fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mwaa.CfnEnvironment.Builder =
        software.amazon.awscdk.services.mwaa.CfnEnvironment.Builder.create(scope, id)

    public override fun airflowConfigurationOptions(airflowConfigurationOptions: Any) {
      cdkBuilder.airflowConfigurationOptions(airflowConfigurationOptions)
    }

    public override fun airflowVersion(airflowVersion: String) {
      cdkBuilder.airflowVersion(airflowVersion)
    }

    public override fun dagS3Path(dagS3Path: String) {
      cdkBuilder.dagS3Path(dagS3Path)
    }

    public override fun endpointManagement(endpointManagement: String) {
      cdkBuilder.endpointManagement(endpointManagement)
    }

    public override fun environmentClass(environmentClass: String) {
      cdkBuilder.environmentClass(environmentClass)
    }

    public override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    public override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    public override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99a7a60d5549be3670ca52741505fe0a1ca11f802c63b27b9c2738515d4155df")
    public override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    public override fun maxWorkers(maxWorkers: Number) {
      cdkBuilder.maxWorkers(maxWorkers)
    }

    public override fun minWorkers(minWorkers: Number) {
      cdkBuilder.minWorkers(minWorkers)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    public override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea4dc89fc98a15a9806bff385274d0b15b175cd8a5bbf0fe46cadc5429b92588")
    public override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    public override fun pluginsS3ObjectVersion(pluginsS3ObjectVersion: String) {
      cdkBuilder.pluginsS3ObjectVersion(pluginsS3ObjectVersion)
    }

    public override fun pluginsS3Path(pluginsS3Path: String) {
      cdkBuilder.pluginsS3Path(pluginsS3Path)
    }

    public override fun requirementsS3ObjectVersion(requirementsS3ObjectVersion: String) {
      cdkBuilder.requirementsS3ObjectVersion(requirementsS3ObjectVersion)
    }

    public override fun requirementsS3Path(requirementsS3Path: String) {
      cdkBuilder.requirementsS3Path(requirementsS3Path)
    }

    public override fun schedulers(schedulers: Number) {
      cdkBuilder.schedulers(schedulers)
    }

    public override fun sourceBucketArn(sourceBucketArn: String) {
      cdkBuilder.sourceBucketArn(sourceBucketArn)
    }

    public override fun startupScriptS3ObjectVersion(startupScriptS3ObjectVersion: String) {
      cdkBuilder.startupScriptS3ObjectVersion(startupScriptS3ObjectVersion)
    }

    public override fun startupScriptS3Path(startupScriptS3Path: String) {
      cdkBuilder.startupScriptS3Path(startupScriptS3Path)
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public override fun webserverAccessMode(webserverAccessMode: String) {
      cdkBuilder.webserverAccessMode(webserverAccessMode)
    }

    public override fun weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart: String) {
      cdkBuilder.weeklyMaintenanceWindowStart(weeklyMaintenanceWindowStart)
    }

    public fun build(): software.amazon.awscdk.services.mwaa.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.mwaa.CfnEnvironment = wrapped.cdkObject
  }

  public interface LoggingConfigurationProperty {
    public fun dagProcessingLogs(): Any? = unwrap(this).getDagProcessingLogs()

    public fun schedulerLogs(): Any? = unwrap(this).getSchedulerLogs()

    public fun taskLogs(): Any? = unwrap(this).getTaskLogs()

    public fun webserverLogs(): Any? = unwrap(this).getWebserverLogs()

    public fun workerLogs(): Any? = unwrap(this).getWorkerLogs()

    public interface Builder {
      public fun dagProcessingLogs(dagProcessingLogs: IResolvable) {
      }

      public fun dagProcessingLogs(dagProcessingLogs: ModuleLoggingConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1330f7c2b8e957ece7d3f6d63b8e92b8bd0cb2f4e727176b706cd8a77c679735")
      public
          fun dagProcessingLogs(dagProcessingLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit) {
      }

      public fun schedulerLogs(schedulerLogs: IResolvable) {
      }

      public fun schedulerLogs(schedulerLogs: ModuleLoggingConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73e3e873b4c948aba5941ca638f6ee43fe683de1dfd86839ffdbcd9dc98fe3f6")
      public
          fun schedulerLogs(schedulerLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit) {
      }

      public fun taskLogs(taskLogs: IResolvable) {
      }

      public fun taskLogs(taskLogs: ModuleLoggingConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a283a4f04f2890bdc485fdb461988647ae261ca78d3d9463cd916a5f9d3da19")
      public fun taskLogs(taskLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit) {
      }

      public fun webserverLogs(webserverLogs: IResolvable) {
      }

      public fun webserverLogs(webserverLogs: ModuleLoggingConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3042a5be32bb2f4a801c944e3ddc5345a36678e5820c0655a3e5bbf5df7f8a71")
      public
          fun webserverLogs(webserverLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit) {
      }

      public fun workerLogs(workerLogs: IResolvable) {
      }

      public fun workerLogs(workerLogs: ModuleLoggingConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("663473f1a66947d758bb986bca1649a2c63d636a684bb8ae0cda9440fb485e36")
      public fun workerLogs(workerLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty.Builder =
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty.builder()

      public override fun dagProcessingLogs(dagProcessingLogs: IResolvable) {
        cdkBuilder.dagProcessingLogs(dagProcessingLogs.let(IResolvable::unwrap))
      }

      public override fun dagProcessingLogs(dagProcessingLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.dagProcessingLogs(dagProcessingLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1330f7c2b8e957ece7d3f6d63b8e92b8bd0cb2f4e727176b706cd8a77c679735")
      public override
          fun dagProcessingLogs(dagProcessingLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit):
          Unit = dagProcessingLogs(ModuleLoggingConfigurationProperty(dagProcessingLogs))

      public override fun schedulerLogs(schedulerLogs: IResolvable) {
        cdkBuilder.schedulerLogs(schedulerLogs.let(IResolvable::unwrap))
      }

      public override fun schedulerLogs(schedulerLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.schedulerLogs(schedulerLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73e3e873b4c948aba5941ca638f6ee43fe683de1dfd86839ffdbcd9dc98fe3f6")
      public override
          fun schedulerLogs(schedulerLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit):
          Unit = schedulerLogs(ModuleLoggingConfigurationProperty(schedulerLogs))

      public override fun taskLogs(taskLogs: IResolvable) {
        cdkBuilder.taskLogs(taskLogs.let(IResolvable::unwrap))
      }

      public override fun taskLogs(taskLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.taskLogs(taskLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a283a4f04f2890bdc485fdb461988647ae261ca78d3d9463cd916a5f9d3da19")
      public override fun taskLogs(taskLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit):
          Unit = taskLogs(ModuleLoggingConfigurationProperty(taskLogs))

      public override fun webserverLogs(webserverLogs: IResolvable) {
        cdkBuilder.webserverLogs(webserverLogs.let(IResolvable::unwrap))
      }

      public override fun webserverLogs(webserverLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.webserverLogs(webserverLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3042a5be32bb2f4a801c944e3ddc5345a36678e5820c0655a3e5bbf5df7f8a71")
      public override
          fun webserverLogs(webserverLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit):
          Unit = webserverLogs(ModuleLoggingConfigurationProperty(webserverLogs))

      public override fun workerLogs(workerLogs: IResolvable) {
        cdkBuilder.workerLogs(workerLogs.let(IResolvable::unwrap))
      }

      public override fun workerLogs(workerLogs: ModuleLoggingConfigurationProperty) {
        cdkBuilder.workerLogs(workerLogs.let(ModuleLoggingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("663473f1a66947d758bb986bca1649a2c63d636a684bb8ae0cda9440fb485e36")
      public override
          fun workerLogs(workerLogs: ModuleLoggingConfigurationProperty.Builder.() -> Unit): Unit =
          workerLogs(ModuleLoggingConfigurationProperty(workerLogs))

      public fun build():
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty,
    ) : LoggingConfigurationProperty {
      public override fun dagProcessingLogs(): Any? = unwrap(this).getDagProcessingLogs()

      public override fun schedulerLogs(): Any? = unwrap(this).getSchedulerLogs()

      public override fun taskLogs(): Any? = unwrap(this).getTaskLogs()

      public override fun webserverLogs(): Any? = unwrap(this).getWebserverLogs()

      public override fun workerLogs(): Any? = unwrap(this).getWorkerLogs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty):
          LoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.mwaa.CfnEnvironment.LoggingConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkConfigurationProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty,
    ) : NetworkConfigurationProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModuleLoggingConfigurationProperty {
    public fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun logLevel(): String? = unwrap(this).getLogLevel()

    public interface Builder {
      public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun logLevel(logLevel: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty.builder()

      public override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public fun build():
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty,
    ) : ModuleLoggingConfigurationProperty {
      public override fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun logLevel(): String? = unwrap(this).getLogLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModuleLoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty):
          ModuleLoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModuleLoggingConfigurationProperty):
          software.amazon.awscdk.services.mwaa.CfnEnvironment.ModuleLoggingConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
