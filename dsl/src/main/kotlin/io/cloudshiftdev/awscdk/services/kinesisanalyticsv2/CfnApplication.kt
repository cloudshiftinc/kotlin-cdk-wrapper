package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationConfiguration(): Any? = unwrap(this).getApplicationConfiguration()

  public open fun applicationConfiguration(`value`: IResolvable) {
    unwrap(this).setApplicationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun applicationConfiguration(`value`: ApplicationConfigurationProperty) {
    unwrap(this).setApplicationConfiguration(`value`.let(ApplicationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf38b1c68a149f8b996562584d7478f727c22a2fa9f57b29a27968e117594d36")
  public open
      fun applicationConfiguration(`value`: ApplicationConfigurationProperty.Builder.() -> Unit):
      Unit = applicationConfiguration(ApplicationConfigurationProperty(`value`))

  public open fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  public open fun applicationDescription(`value`: String) {
    unwrap(this).setApplicationDescription(`value`)
  }

  public open fun applicationMaintenanceConfiguration(): Any? =
      unwrap(this).getApplicationMaintenanceConfiguration()

  public open fun applicationMaintenanceConfiguration(`value`: IResolvable) {
    unwrap(this).setApplicationMaintenanceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun applicationMaintenanceConfiguration(`value`: ApplicationMaintenanceConfigurationProperty) {
    unwrap(this).setApplicationMaintenanceConfiguration(`value`.let(ApplicationMaintenanceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e69e8eb43d6a1bde05c189122a8f2752de26d99718107069a969f41f25136794")
  public open
      fun applicationMaintenanceConfiguration(`value`: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
      Unit =
      applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty(`value`))

  public open fun applicationMode(): String? = unwrap(this).getApplicationMode()

  public open fun applicationMode(`value`: String) {
    unwrap(this).setApplicationMode(`value`)
  }

  public open fun applicationName(): String? = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun runConfiguration(): Any? = unwrap(this).getRunConfiguration()

  public open fun runConfiguration(`value`: IResolvable) {
    unwrap(this).setRunConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun runConfiguration(`value`: RunConfigurationProperty) {
    unwrap(this).setRunConfiguration(`value`.let(RunConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("57bb5fe3cf9cb0a79aa09d2374de1ed6c30feeaa93bc17b94c7d350140907f23")
  public open fun runConfiguration(`value`: RunConfigurationProperty.Builder.() -> Unit): Unit =
      runConfiguration(RunConfigurationProperty(`value`))

  public open fun runtimeEnvironment(): String = unwrap(this).getRuntimeEnvironment()

  public open fun runtimeEnvironment(`value`: String) {
    unwrap(this).setRuntimeEnvironment(`value`)
  }

  public open fun serviceExecutionRole(): String = unwrap(this).getServiceExecutionRole()

  public open fun serviceExecutionRole(`value`: String) {
    unwrap(this).setServiceExecutionRole(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun applicationConfiguration(applicationConfiguration: IResolvable) {
    }

    public
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f924dbfa45b89be4d341c3cb2e03f5125b1f4e304dbad637c1b36750b8a03b")
    public
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty.Builder.() -> Unit) {
    }

    public fun applicationDescription(applicationDescription: String) {
    }

    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
    }

    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87f70f8e91c7c91340fc3fb505bf1fb12a937ef7e2b6bfeba9e31465fe1a872d")
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit) {
    }

    public fun applicationMode(applicationMode: String) {
    }

    public fun applicationName(applicationName: String) {
    }

    public fun runConfiguration(runConfiguration: IResolvable) {
    }

    public fun runConfiguration(runConfiguration: RunConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce34f73b60cb5d1d88415697e0cb762020d25f84a270c4f48813f79656d924af")
    public fun runConfiguration(runConfiguration: RunConfigurationProperty.Builder.() -> Unit) {
    }

    public fun runtimeEnvironment(runtimeEnvironment: String) {
    }

    public fun serviceExecutionRole(serviceExecutionRole: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.Builder =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.Builder.create(scope, id)

    public override fun applicationConfiguration(applicationConfiguration: IResolvable) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(ApplicationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f924dbfa45b89be4d341c3cb2e03f5125b1f4e304dbad637c1b36750b8a03b")
    public override
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty.Builder.() -> Unit):
        Unit = applicationConfiguration(ApplicationConfigurationProperty(applicationConfiguration))

    public override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    public override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(ApplicationMaintenanceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87f70f8e91c7c91340fc3fb505bf1fb12a937ef7e2b6bfeba9e31465fe1a872d")
    public override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty(applicationMaintenanceConfiguration))

    public override fun applicationMode(applicationMode: String) {
      cdkBuilder.applicationMode(applicationMode)
    }

    public override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public override fun runConfiguration(runConfiguration: IResolvable) {
      cdkBuilder.runConfiguration(runConfiguration.let(IResolvable::unwrap))
    }

    public override fun runConfiguration(runConfiguration: RunConfigurationProperty) {
      cdkBuilder.runConfiguration(runConfiguration.let(RunConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce34f73b60cb5d1d88415697e0cb762020d25f84a270c4f48813f79656d924af")
    public override
        fun runConfiguration(runConfiguration: RunConfigurationProperty.Builder.() -> Unit): Unit =
        runConfiguration(RunConfigurationProperty(runConfiguration))

    public override fun runtimeEnvironment(runtimeEnvironment: String) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment)
    }

    public override fun serviceExecutionRole(serviceExecutionRole: String) {
      cdkBuilder.serviceExecutionRole(serviceExecutionRole)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication = wrapped.cdkObject
  }

  public interface MonitoringConfigurationProperty {
    public fun configurationType(): String

    public fun logLevel(): String? = unwrap(this).getLogLevel()

    public fun metricsLevel(): String? = unwrap(this).getMetricsLevel()

    public interface Builder {
      public fun configurationType(configurationType: String) {
      }

      public fun logLevel(logLevel: String) {
      }

      public fun metricsLevel(metricsLevel: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty.builder()

      public override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      public override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public override fun metricsLevel(metricsLevel: String) {
        cdkBuilder.metricsLevel(metricsLevel)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty,
    ) : MonitoringConfigurationProperty {
      public override fun configurationType(): String = unwrap(this).getConfigurationType()

      public override fun logLevel(): String? = unwrap(this).getLogLevel()

      public override fun metricsLevel(): String? = unwrap(this).getMetricsLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty):
          MonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MonitoringConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationSnapshotConfigurationProperty {
    public fun snapshotsEnabled(): Any

    public interface Builder {
      public fun snapshotsEnabled(snapshotsEnabled: Boolean) {
      }

      public fun snapshotsEnabled(snapshotsEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty.builder()

      public override fun snapshotsEnabled(snapshotsEnabled: Boolean) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled)
      }

      public override fun snapshotsEnabled(snapshotsEnabled: IResolvable) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty,
    ) : ApplicationSnapshotConfigurationProperty {
      public override fun snapshotsEnabled(): Any = unwrap(this).getSnapshotsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationSnapshotConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty):
          ApplicationSnapshotConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSnapshotConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationSnapshotConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MappingParametersProperty {
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

    public interface Builder {
      public fun csvMappingParameters(csvMappingParameters: IResolvable) {
      }

      public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06dc982ddf45b0ed881b41b491fe398268ae0efb1fa0c934e05fee437ae3864c")
      public
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit) {
      }

      public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
      }

      public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50204536ef00d6390153a15741f4f89590b33a86e1ca38ab8e86557b0da64f9b")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty.builder()

      public override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable::unwrap))
      }

      public override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06dc982ddf45b0ed881b41b491fe398268ae0efb1fa0c934e05fee437ae3864c")
      public override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      public override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable::unwrap))
      }

      public override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50204536ef00d6390153a15741f4f89590b33a86e1ca38ab8e86557b0da64f9b")
      public override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit):
          Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty,
    ) : MappingParametersProperty {
      public override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      public override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty):
          MappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputParallelismProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public interface Builder {
      public fun count(count: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty.builder()

      public override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty,
    ) : InputParallelismProperty {
      public override fun count(): Number? = unwrap(this).getCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputParallelismProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty):
          InputParallelismProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputParallelismProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputParallelismProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GlueDataCatalogConfigurationProperty {
    public fun databaseArn(): String? = unwrap(this).getDatabaseArn()

    public interface Builder {
      public fun databaseArn(databaseArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty.builder()

      public override fun databaseArn(databaseArn: String) {
        cdkBuilder.databaseArn(databaseArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty,
    ) : GlueDataCatalogConfigurationProperty {
      public override fun databaseArn(): String? = unwrap(this).getDatabaseArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          GlueDataCatalogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty):
          GlueDataCatalogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueDataCatalogConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.GlueDataCatalogConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigurationProperty {
    public fun securityGroupIds(): List<String>

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty,
    ) : VpcConfigurationProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.VpcConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FlinkApplicationConfigurationProperty {
    public fun checkpointConfiguration(): Any? = unwrap(this).getCheckpointConfiguration()

    public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

    public fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

    public interface Builder {
      public fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
      }

      public fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a2a331f6619f8069b9084e069664e896b4b59ab2b93336622236d8405197e17")
      public
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty.Builder.() -> Unit) {
      }

      public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
      }

      public fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e532f8a5880c5916c3384f733593ac86b69511c491c166e839f781f3dedf2a7")
      public
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit) {
      }

      public fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
      }

      public
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eb9e32491e86e72d1101a6d854f2cb99f5e11c95c7415199ba3dec7e059c106")
      public
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty.builder()

      public override fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration.let(CheckpointConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a2a331f6619f8069b9084e069664e896b4b59ab2b93336622236d8405197e17")
      public override
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty.Builder.() -> Unit):
          Unit = checkpointConfiguration(CheckpointConfigurationProperty(checkpointConfiguration))

      public override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(MonitoringConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e532f8a5880c5916c3384f733593ac86b69511c491c166e839f781f3dedf2a7")
      public override
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit):
          Unit = monitoringConfiguration(MonitoringConfigurationProperty(monitoringConfiguration))

      public override fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration.let(ParallelismConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eb9e32491e86e72d1101a6d854f2cb99f5e11c95c7415199ba3dec7e059c106")
      public override
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty.Builder.() -> Unit):
          Unit =
          parallelismConfiguration(ParallelismConfigurationProperty(parallelismConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty,
    ) : FlinkApplicationConfigurationProperty {
      public override fun checkpointConfiguration(): Any? =
          unwrap(this).getCheckpointConfiguration()

      public override fun monitoringConfiguration(): Any? =
          unwrap(this).getMonitoringConfiguration()

      public override fun parallelismConfiguration(): Any? =
          unwrap(this).getParallelismConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FlinkApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty):
          FlinkApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlinkApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputSchemaProperty {
    public fun recordColumns(): Any

    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    public fun recordFormat(): Any

    public interface Builder {
      public fun recordColumns(recordColumns: IResolvable) {
      }

      public fun recordColumns(recordColumns: List<Any>) {
      }

      public fun recordEncoding(recordEncoding: String) {
      }

      public fun recordFormat(recordFormat: IResolvable) {
      }

      public fun recordFormat(recordFormat: RecordFormatProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64ed657f2df6f0e64c7bd7a4fbe51d08c3695dd141047541bbcf001ef84df8ce")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty.builder()

      public override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable::unwrap))
      }

      public override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns)
      }

      public override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      public override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable::unwrap))
      }

      public override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64ed657f2df6f0e64c7bd7a4fbe51d08c3695dd141047541bbcf001ef84df8ce")
      public override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit
          = recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty,
    ) : InputSchemaProperty {
      public override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      public override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      public override fun recordFormat(): Any = unwrap(this).getRecordFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty):
          InputSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSchemaProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputSchemaProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface JSONMappingParametersProperty {
    public fun recordRowPath(): String

    public interface Builder {
      public fun recordRowPath(recordRowPath: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty.builder()

      public override fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty,
    ) : JSONMappingParametersProperty {
      public override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JSONMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty):
          JSONMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JSONMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.JSONMappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ContentLocationProperty {
    public fun bucketArn(): String

    public fun fileKey(): String

    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    public interface Builder {
      public fun bucketArn(bucketArn: String) {
      }

      public fun fileKey(fileKey: String) {
      }

      public fun objectVersion(objectVersion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty.builder()

      public override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      public override fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
      }

      public override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty,
    ) : S3ContentLocationProperty {
      public override fun bucketArn(): String = unwrap(this).getBucketArn()

      public override fun fileKey(): String = unwrap(this).getFileKey()

      public override fun objectVersion(): String? = unwrap(this).getObjectVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ContentLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty):
          S3ContentLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ContentLocationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentLocationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CheckpointConfigurationProperty {
    public fun checkpointInterval(): Number? = unwrap(this).getCheckpointInterval()

    public fun checkpointingEnabled(): Any? = unwrap(this).getCheckpointingEnabled()

    public fun configurationType(): String

    public fun minPauseBetweenCheckpoints(): Number? = unwrap(this).getMinPauseBetweenCheckpoints()

    public interface Builder {
      public fun checkpointInterval(checkpointInterval: Number) {
      }

      public fun checkpointingEnabled(checkpointingEnabled: Boolean) {
      }

      public fun checkpointingEnabled(checkpointingEnabled: IResolvable) {
      }

      public fun configurationType(configurationType: String) {
      }

      public fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty.builder()

      public override fun checkpointInterval(checkpointInterval: Number) {
        cdkBuilder.checkpointInterval(checkpointInterval)
      }

      public override fun checkpointingEnabled(checkpointingEnabled: Boolean) {
        cdkBuilder.checkpointingEnabled(checkpointingEnabled)
      }

      public override fun checkpointingEnabled(checkpointingEnabled: IResolvable) {
        cdkBuilder.checkpointingEnabled(checkpointingEnabled.let(IResolvable::unwrap))
      }

      public override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      public override fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number) {
        cdkBuilder.minPauseBetweenCheckpoints(minPauseBetweenCheckpoints)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty,
    ) : CheckpointConfigurationProperty {
      public override fun checkpointInterval(): Number? = unwrap(this).getCheckpointInterval()

      public override fun checkpointingEnabled(): Any? = unwrap(this).getCheckpointingEnabled()

      public override fun configurationType(): String = unwrap(this).getConfigurationType()

      public override fun minPauseBetweenCheckpoints(): Number? =
          unwrap(this).getMinPauseBetweenCheckpoints()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CheckpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty):
          CheckpointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CheckpointConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CheckpointConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationCodeConfigurationProperty {
    public fun codeContent(): Any

    public fun codeContentType(): String

    public interface Builder {
      public fun codeContent(codeContent: IResolvable) {
      }

      public fun codeContent(codeContent: CodeContentProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a3fb91dbc21e3cc6ce19b0168de4b380d08d871bb4e71f1b7139a456dff68c61")
      public fun codeContent(codeContent: CodeContentProperty.Builder.() -> Unit) {
      }

      public fun codeContentType(codeContentType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty.builder()

      public override fun codeContent(codeContent: IResolvable) {
        cdkBuilder.codeContent(codeContent.let(IResolvable::unwrap))
      }

      public override fun codeContent(codeContent: CodeContentProperty) {
        cdkBuilder.codeContent(codeContent.let(CodeContentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a3fb91dbc21e3cc6ce19b0168de4b380d08d871bb4e71f1b7139a456dff68c61")
      public override fun codeContent(codeContent: CodeContentProperty.Builder.() -> Unit): Unit =
          codeContent(CodeContentProperty(codeContent))

      public override fun codeContentType(codeContentType: String) {
        cdkBuilder.codeContentType(codeContentType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty,
    ) : ApplicationCodeConfigurationProperty {
      public override fun codeContent(): Any = unwrap(this).getCodeContent()

      public override fun codeContentType(): String = unwrap(this).getCodeContentType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationCodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty):
          ApplicationCodeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationCodeConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationCodeConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomArtifactConfigurationProperty {
    public fun artifactType(): String

    public fun mavenReference(): Any? = unwrap(this).getMavenReference()

    public fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

    public interface Builder {
      public fun artifactType(artifactType: String) {
      }

      public fun mavenReference(mavenReference: IResolvable) {
      }

      public fun mavenReference(mavenReference: MavenReferenceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e096744746960911110c857c18c37af8ae7430914754fef46175e251e5b2a4d7")
      public fun mavenReference(mavenReference: MavenReferenceProperty.Builder.() -> Unit) {
      }

      public fun s3ContentLocation(s3ContentLocation: IResolvable) {
      }

      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cd77deb408ba4de3bb61f74cdd1eb47c1893b5d3ab123634ab65c01db6564fe")
      public
          fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty.builder()

      public override fun artifactType(artifactType: String) {
        cdkBuilder.artifactType(artifactType)
      }

      public override fun mavenReference(mavenReference: IResolvable) {
        cdkBuilder.mavenReference(mavenReference.let(IResolvable::unwrap))
      }

      public override fun mavenReference(mavenReference: MavenReferenceProperty) {
        cdkBuilder.mavenReference(mavenReference.let(MavenReferenceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e096744746960911110c857c18c37af8ae7430914754fef46175e251e5b2a4d7")
      public override fun mavenReference(mavenReference: MavenReferenceProperty.Builder.() -> Unit):
          Unit = mavenReference(MavenReferenceProperty(mavenReference))

      public override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
      }

      public override fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cd77deb408ba4de3bb61f74cdd1eb47c1893b5d3ab123634ab65c01db6564fe")
      public override
          fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentLocationProperty(s3ContentLocation))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty,
    ) : CustomArtifactConfigurationProperty {
      public override fun artifactType(): String = unwrap(this).getArtifactType()

      public override fun mavenReference(): Any? = unwrap(this).getMavenReference()

      public override fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomArtifactConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty):
          CustomArtifactConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomArtifactConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CustomArtifactConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ContentBaseLocationProperty {
    public fun basePath(): String? = unwrap(this).getBasePath()

    public fun bucketArn(): String

    public interface Builder {
      public fun basePath(basePath: String) {
      }

      public fun bucketArn(bucketArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty.builder()

      public override fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
      }

      public override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty,
    ) : S3ContentBaseLocationProperty {
      public override fun basePath(): String? = unwrap(this).getBasePath()

      public override fun bucketArn(): String = unwrap(this).getBucketArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ContentBaseLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty):
          S3ContentBaseLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ContentBaseLocationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.S3ContentBaseLocationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ZeppelinApplicationConfigurationProperty {
    public fun catalogConfiguration(): Any? = unwrap(this).getCatalogConfiguration()

    public fun customArtifactsConfiguration(): Any? = unwrap(this).getCustomArtifactsConfiguration()

    public fun deployAsApplicationConfiguration(): Any? =
        unwrap(this).getDeployAsApplicationConfiguration()

    public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

    public interface Builder {
      public fun catalogConfiguration(catalogConfiguration: IResolvable) {
      }

      public fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a406bfd3e8053c07a462ec7468245bbddb1fa3ae179fb0485f855c8505624ff5")
      public
          fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty.Builder.() -> Unit) {
      }

      public fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable) {
      }

      public fun customArtifactsConfiguration(customArtifactsConfiguration: List<Any>) {
      }

      public fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: IResolvable) {
      }

      public
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9734947c6d04cb8ce747f61b9050d89a184a8d97a4950f8c49ede2bb1b258120")
      public
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty.Builder.() -> Unit) {
      }

      public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
      }

      public
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("478c5fb34e0581806a21c8449fa45f9af1304548502762c92f91e8db29d054d4")
      public
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty.builder()

      public override fun catalogConfiguration(catalogConfiguration: IResolvable) {
        cdkBuilder.catalogConfiguration(catalogConfiguration.let(IResolvable::unwrap))
      }

      public override fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty) {
        cdkBuilder.catalogConfiguration(catalogConfiguration.let(CatalogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a406bfd3e8053c07a462ec7468245bbddb1fa3ae179fb0485f855c8505624ff5")
      public override
          fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty.Builder.() -> Unit):
          Unit = catalogConfiguration(CatalogConfigurationProperty(catalogConfiguration))

      public override fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable) {
        cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration.let(IResolvable::unwrap))
      }

      public override fun customArtifactsConfiguration(customArtifactsConfiguration: List<Any>) {
        cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration)
      }

      public override
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: IResolvable) {
        cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty) {
        cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration.let(DeployAsApplicationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9734947c6d04cb8ce747f61b9050d89a184a8d97a4950f8c49ede2bb1b258120")
      public override
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty(deployAsApplicationConfiguration))

      public override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(ZeppelinMonitoringConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("478c5fb34e0581806a21c8449fa45f9af1304548502762c92f91e8db29d054d4")
      public override
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty.Builder.() -> Unit):
          Unit =
          monitoringConfiguration(ZeppelinMonitoringConfigurationProperty(monitoringConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty,
    ) : ZeppelinApplicationConfigurationProperty {
      public override fun catalogConfiguration(): Any? = unwrap(this).getCatalogConfiguration()

      public override fun customArtifactsConfiguration(): Any? =
          unwrap(this).getCustomArtifactsConfiguration()

      public override fun deployAsApplicationConfiguration(): Any? =
          unwrap(this).getDeployAsApplicationConfiguration()

      public override fun monitoringConfiguration(): Any? =
          unwrap(this).getMonitoringConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZeppelinApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty):
          ZeppelinApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZeppelinApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisStreamsInputProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty,
    ) : KinesisStreamsInputProperty {
      public override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamsInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty):
          KinesisStreamsInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsInputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisStreamsInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EnvironmentPropertiesProperty {
    public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    public interface Builder {
      public fun propertyGroups(propertyGroups: IResolvable) {
      }

      public fun propertyGroups(propertyGroups: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty.builder()

      public override fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
      }

      public override fun propertyGroups(propertyGroups: List<Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty,
    ) : EnvironmentPropertiesProperty {
      public override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty):
          EnvironmentPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentPropertiesProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.EnvironmentPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputProcessingConfigurationProperty {
    public fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()

    public interface Builder {
      public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
      }

      public fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c155289a722c0e860cf6d56ec1447fb77b92e3fa10a1a0ac2de2e0e3d7a0c92")
      public
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty.builder()

      public override fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(IResolvable::unwrap))
      }

      public override fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(InputLambdaProcessorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c155289a722c0e860cf6d56ec1447fb77b92e3fa10a1a0ac2de2e0e3d7a0c92")
      public override
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit):
          Unit = inputLambdaProcessor(InputLambdaProcessorProperty(inputLambdaProcessor))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty,
    ) : InputProcessingConfigurationProperty {
      public override fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InputProcessingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty):
          InputProcessingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProcessingConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProcessingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationRestoreConfigurationProperty {
    public fun applicationRestoreType(): String

    public fun snapshotName(): String? = unwrap(this).getSnapshotName()

    public interface Builder {
      public fun applicationRestoreType(applicationRestoreType: String) {
      }

      public fun snapshotName(snapshotName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty.builder()

      public override fun applicationRestoreType(applicationRestoreType: String) {
        cdkBuilder.applicationRestoreType(applicationRestoreType)
      }

      public override fun snapshotName(snapshotName: String) {
        cdkBuilder.snapshotName(snapshotName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty,
    ) : ApplicationRestoreConfigurationProperty {
      public override fun applicationRestoreType(): String =
          unwrap(this).getApplicationRestoreType()

      public override fun snapshotName(): String? = unwrap(this).getSnapshotName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationRestoreConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty):
          ApplicationRestoreConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationRestoreConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationRestoreConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MavenReferenceProperty {
    public fun artifactId(): String

    public fun groupId(): String

    public fun version(): String

    public interface Builder {
      public fun artifactId(artifactId: String) {
      }

      public fun groupId(groupId: String) {
      }

      public fun version(version: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty.builder()

      public override fun artifactId(artifactId: String) {
        cdkBuilder.artifactId(artifactId)
      }

      public override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      public override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty,
    ) : MavenReferenceProperty {
      public override fun artifactId(): String = unwrap(this).getArtifactId()

      public override fun groupId(): String = unwrap(this).getGroupId()

      public override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MavenReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty):
          MavenReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MavenReferenceProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.MavenReferenceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationMaintenanceConfigurationProperty {
    public fun applicationMaintenanceWindowStartTime(): String

    public interface Builder {
      public
          fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty.builder()

      public override
          fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String) {
        cdkBuilder.applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty,
    ) : ApplicationMaintenanceConfigurationProperty {
      public override fun applicationMaintenanceWindowStartTime(): String =
          unwrap(this).getApplicationMaintenanceWindowStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationMaintenanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty):
          ApplicationMaintenanceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationMaintenanceConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationMaintenanceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SqlApplicationConfigurationProperty {
    public fun inputs(): Any? = unwrap(this).getInputs()

    public interface Builder {
      public fun inputs(inputs: IResolvable) {
      }

      public fun inputs(inputs: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty.builder()

      public override fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs.let(IResolvable::unwrap))
      }

      public override fun inputs(inputs: List<Any>) {
        cdkBuilder.inputs(inputs)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty,
    ) : SqlApplicationConfigurationProperty {
      public override fun inputs(): Any? = unwrap(this).getInputs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SqlApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty):
          SqlApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.SqlApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ZeppelinMonitoringConfigurationProperty {
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    public interface Builder {
      public fun logLevel(logLevel: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty.builder()

      public override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty,
    ) : ZeppelinMonitoringConfigurationProperty {
      public override fun logLevel(): String? = unwrap(this).getLogLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZeppelinMonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty):
          ZeppelinMonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZeppelinMonitoringConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ZeppelinMonitoringConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisFirehoseInputProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty,
    ) : KinesisFirehoseInputProperty {
      public override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty):
          KinesisFirehoseInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseInputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.KinesisFirehoseInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationConfigurationProperty {
    public fun applicationCodeConfiguration(): Any? = unwrap(this).getApplicationCodeConfiguration()

    public fun applicationSnapshotConfiguration(): Any? =
        unwrap(this).getApplicationSnapshotConfiguration()

    public fun environmentProperties(): Any? = unwrap(this).getEnvironmentProperties()

    public fun flinkApplicationConfiguration(): Any? =
        unwrap(this).getFlinkApplicationConfiguration()

    public fun sqlApplicationConfiguration(): Any? = unwrap(this).getSqlApplicationConfiguration()

    public fun vpcConfigurations(): Any? = unwrap(this).getVpcConfigurations()

    public fun zeppelinApplicationConfiguration(): Any? =
        unwrap(this).getZeppelinApplicationConfiguration()

    public interface Builder {
      public fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
      }

      public
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7877605fae94fba496f67774d5d0c87b057f5ae11416a71bdaa1fe79869842d")
      public
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty.Builder.() -> Unit) {
      }

      public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable) {
      }

      public
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c493a91d69b8dc48f8c1ad0ebc0e1b74f07722c317dc8997c11b2c34afac13")
      public
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty.Builder.() -> Unit) {
      }

      public fun environmentProperties(environmentProperties: IResolvable) {
      }

      public fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("705a63a4a7f4fbb572532c29eea797caa1d0c8a1cbba17fdf4e7e0b5c6f54d8c")
      public
          fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty.Builder.() -> Unit) {
      }

      public fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
      }

      public
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("492f8c55c68e53f189bb6f6c90483e42a3e09abeabbe7f54bd0ea1b7f1aa5148")
      public
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty.Builder.() -> Unit) {
      }

      public fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
      }

      public
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("739a9d42cdc613f937634ee485e7018d1f8244cb03e497d08ddcbafa23ee4cd0")
      public
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty.Builder.() -> Unit) {
      }

      public fun vpcConfigurations(vpcConfigurations: IResolvable) {
      }

      public fun vpcConfigurations(vpcConfigurations: List<Any>) {
      }

      public fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable) {
      }

      public
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71a50890c438f318a456fa31701c47d511cfa429d6fe6cd84ddaa94fc1d40f6")
      public
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty.builder()

      public override fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration.let(ApplicationCodeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d7877605fae94fba496f67774d5d0c87b057f5ae11416a71bdaa1fe79869842d")
      public override
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationCodeConfiguration(ApplicationCodeConfigurationProperty(applicationCodeConfiguration))

      public override
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration.let(ApplicationSnapshotConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30c493a91d69b8dc48f8c1ad0ebc0e1b74f07722c317dc8997c11b2c34afac13")
      public override
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty(applicationSnapshotConfiguration))

      public override fun environmentProperties(environmentProperties: IResolvable) {
        cdkBuilder.environmentProperties(environmentProperties.let(IResolvable::unwrap))
      }

      public override
          fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty) {
        cdkBuilder.environmentProperties(environmentProperties.let(EnvironmentPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("705a63a4a7f4fbb572532c29eea797caa1d0c8a1cbba17fdf4e7e0b5c6f54d8c")
      public override
          fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty.Builder.() -> Unit):
          Unit = environmentProperties(EnvironmentPropertiesProperty(environmentProperties))

      public override
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration.let(FlinkApplicationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("492f8c55c68e53f189bb6f6c90483e42a3e09abeabbe7f54bd0ea1b7f1aa5148")
      public override
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          flinkApplicationConfiguration(FlinkApplicationConfigurationProperty(flinkApplicationConfiguration))

      public override fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration.let(SqlApplicationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("739a9d42cdc613f937634ee485e7018d1f8244cb03e497d08ddcbafa23ee4cd0")
      public override
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          sqlApplicationConfiguration(SqlApplicationConfigurationProperty(sqlApplicationConfiguration))

      public override fun vpcConfigurations(vpcConfigurations: IResolvable) {
        cdkBuilder.vpcConfigurations(vpcConfigurations.let(IResolvable::unwrap))
      }

      public override fun vpcConfigurations(vpcConfigurations: List<Any>) {
        cdkBuilder.vpcConfigurations(vpcConfigurations)
      }

      public override
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration.let(ZeppelinApplicationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b71a50890c438f318a456fa31701c47d511cfa429d6fe6cd84ddaa94fc1d40f6")
      public override
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty(zeppelinApplicationConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty,
    ) : ApplicationConfigurationProperty {
      public override fun applicationCodeConfiguration(): Any? =
          unwrap(this).getApplicationCodeConfiguration()

      public override fun applicationSnapshotConfiguration(): Any? =
          unwrap(this).getApplicationSnapshotConfiguration()

      public override fun environmentProperties(): Any? = unwrap(this).getEnvironmentProperties()

      public override fun flinkApplicationConfiguration(): Any? =
          unwrap(this).getFlinkApplicationConfiguration()

      public override fun sqlApplicationConfiguration(): Any? =
          unwrap(this).getSqlApplicationConfiguration()

      public override fun vpcConfigurations(): Any? = unwrap(this).getVpcConfigurations()

      public override fun zeppelinApplicationConfiguration(): Any? =
          unwrap(this).getZeppelinApplicationConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty):
          ApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeployAsApplicationConfigurationProperty {
    public fun s3ContentLocation(): Any

    public interface Builder {
      public fun s3ContentLocation(s3ContentLocation: IResolvable) {
      }

      public fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580179c7b904c42fc61bfac3acd429505e7efd35244cc4edf50e5602a91223c6")
      public
          fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty.builder()

      public override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
      }

      public override fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentBaseLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580179c7b904c42fc61bfac3acd429505e7efd35244cc4edf50e5602a91223c6")
      public override
          fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentBaseLocationProperty(s3ContentLocation))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty,
    ) : DeployAsApplicationConfigurationProperty {
      public override fun s3ContentLocation(): Any = unwrap(this).getS3ContentLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeployAsApplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty):
          DeployAsApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeployAsApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.DeployAsApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PropertyGroupProperty {
    public fun propertyGroupId(): String? = unwrap(this).getPropertyGroupId()

    public fun propertyMap(): Any? = unwrap(this).getPropertyMap()

    public interface Builder {
      public fun propertyGroupId(propertyGroupId: String) {
      }

      public fun propertyMap(propertyMap: IResolvable) {
      }

      public fun propertyMap(propertyMap: Map<String, String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty.builder()

      public override fun propertyGroupId(propertyGroupId: String) {
        cdkBuilder.propertyGroupId(propertyGroupId)
      }

      public override fun propertyMap(propertyMap: IResolvable) {
        cdkBuilder.propertyMap(propertyMap.let(IResolvable::unwrap))
      }

      public override fun propertyMap(propertyMap: Map<String, String>) {
        cdkBuilder.propertyMap(propertyMap)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty,
    ) : PropertyGroupProperty {
      public override fun propertyGroupId(): String? = unwrap(this).getPropertyGroupId()

      public override fun propertyMap(): Any? = unwrap(this).getPropertyMap()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty):
          PropertyGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyGroupProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.PropertyGroupProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FlinkRunConfigurationProperty {
    public fun allowNonRestoredState(): Any? = unwrap(this).getAllowNonRestoredState()

    public interface Builder {
      public fun allowNonRestoredState(allowNonRestoredState: Boolean) {
      }

      public fun allowNonRestoredState(allowNonRestoredState: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty.builder()

      public override fun allowNonRestoredState(allowNonRestoredState: Boolean) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState)
      }

      public override fun allowNonRestoredState(allowNonRestoredState: IResolvable) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty,
    ) : FlinkRunConfigurationProperty {
      public override fun allowNonRestoredState(): Any? = unwrap(this).getAllowNonRestoredState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FlinkRunConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty):
          FlinkRunConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlinkRunConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.FlinkRunConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputProperty {
    public fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

    public fun inputProcessingConfiguration(): Any? = unwrap(this).getInputProcessingConfiguration()

    public fun inputSchema(): Any

    public fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

    public fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

    public fun namePrefix(): String

    public interface Builder {
      public fun inputParallelism(inputParallelism: IResolvable) {
      }

      public fun inputParallelism(inputParallelism: InputParallelismProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d358a4757b53b52c0a56de1610bfe3f2518772e204dbdbc284f429f33846e7a")
      public fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit) {
      }

      public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
      }

      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e819e00e49bbb2bdc99afd71d723e214ebf1b85326cff1bb84c74f99f14d60e")
      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit) {
      }

      public fun inputSchema(inputSchema: IResolvable) {
      }

      public fun inputSchema(inputSchema: InputSchemaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21d2f3230c8f83ad2f05a35f7220f3b5108af69c7115b09a7e84cf8bccaa588b")
      public fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit) {
      }

      public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
      }

      public fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("714df90655acbc368ff411c8a1ec1bf75d1e22c1241a110189319829987a3de6")
      public
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit) {
      }

      public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
      }

      public fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3036a9164b1a21b787b267d25c78ce94751d7a52985705e8b7199a63daef428")
      public
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit) {
      }

      public fun namePrefix(namePrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty.Builder =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty.builder()

      public override fun inputParallelism(inputParallelism: IResolvable) {
        cdkBuilder.inputParallelism(inputParallelism.let(IResolvable::unwrap))
      }

      public override fun inputParallelism(inputParallelism: InputParallelismProperty) {
        cdkBuilder.inputParallelism(inputParallelism.let(InputParallelismProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d358a4757b53b52c0a56de1610bfe3f2518772e204dbdbc284f429f33846e7a")
      public override
          fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit): Unit
          = inputParallelism(InputParallelismProperty(inputParallelism))

      public override fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(InputProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e819e00e49bbb2bdc99afd71d723e214ebf1b85326cff1bb84c74f99f14d60e")
      public override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit):
          Unit =
          inputProcessingConfiguration(InputProcessingConfigurationProperty(inputProcessingConfiguration))

      public override fun inputSchema(inputSchema: IResolvable) {
        cdkBuilder.inputSchema(inputSchema.let(IResolvable::unwrap))
      }

      public override fun inputSchema(inputSchema: InputSchemaProperty) {
        cdkBuilder.inputSchema(inputSchema.let(InputSchemaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21d2f3230c8f83ad2f05a35f7220f3b5108af69c7115b09a7e84cf8bccaa588b")
      public override fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit): Unit =
          inputSchema(InputSchemaProperty(inputSchema))

      public override fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(IResolvable::unwrap))
      }

      public override fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(KinesisFirehoseInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("714df90655acbc368ff411c8a1ec1bf75d1e22c1241a110189319829987a3de6")
      public override
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseInput(KinesisFirehoseInputProperty(kinesisFirehoseInput))

      public override fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(IResolvable::unwrap))
      }

      public override fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(KinesisStreamsInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3036a9164b1a21b787b267d25c78ce94751d7a52985705e8b7199a63daef428")
      public override
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsInput(KinesisStreamsInputProperty(kinesisStreamsInput))

      public override fun namePrefix(namePrefix: String) {
        cdkBuilder.namePrefix(namePrefix)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty,
    ) : InputProperty {
      public override fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

      public override fun inputProcessingConfiguration(): Any? =
          unwrap(this).getInputProcessingConfiguration()

      public override fun inputSchema(): Any = unwrap(this).getInputSchema()

      public override fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

      public override fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

      public override fun namePrefix(): String = unwrap(this).getNamePrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty):
          InputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CodeContentProperty {
    public fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

    public fun textContent(): String? = unwrap(this).getTextContent()

    public fun zipFileContent(): String? = unwrap(this).getZipFileContent()

    public interface Builder {
      public fun s3ContentLocation(s3ContentLocation: IResolvable) {
      }

      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e31dd285444d0e1a125e82c148ade00d1df2f0ec7159b1b49f03f585f5f5183a")
      public
          fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit) {
      }

      public fun textContent(textContent: String) {
      }

      public fun zipFileContent(zipFileContent: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty.builder()

      public override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
      }

      public override fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e31dd285444d0e1a125e82c148ade00d1df2f0ec7159b1b49f03f585f5f5183a")
      public override
          fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentLocationProperty(s3ContentLocation))

      public override fun textContent(textContent: String) {
        cdkBuilder.textContent(textContent)
      }

      public override fun zipFileContent(zipFileContent: String) {
        cdkBuilder.zipFileContent(zipFileContent)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty,
    ) : CodeContentProperty {
      public override fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

      public override fun textContent(): String? = unwrap(this).getTextContent()

      public override fun zipFileContent(): String? = unwrap(this).getZipFileContent()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty):
          CodeContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeContentProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CodeContentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordColumnProperty {
    public fun mapping(): String? = unwrap(this).getMapping()

    public fun name(): String

    public fun sqlType(): String

    public interface Builder {
      public fun mapping(mapping: String) {
      }

      public fun name(name: String) {
      }

      public fun sqlType(sqlType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty.builder()

      public override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty,
    ) : RecordColumnProperty {
      public override fun mapping(): String? = unwrap(this).getMapping()

      public override fun name(): String = unwrap(this).getName()

      public override fun sqlType(): String = unwrap(this).getSqlType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty):
          RecordColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordColumnProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordColumnProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CatalogConfigurationProperty {
    public fun glueDataCatalogConfiguration(): Any? = unwrap(this).getGlueDataCatalogConfiguration()

    public interface Builder {
      public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
      }

      public
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f62b16cd7f274a8d7a905a434ec38b4e1ac7edaf883d3f91aecad961cb58008")
      public
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty.builder()

      public override fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration.let(GlueDataCatalogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f62b16cd7f274a8d7a905a434ec38b4e1ac7edaf883d3f91aecad961cb58008")
      public override
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty.Builder.() -> Unit):
          Unit =
          glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty(glueDataCatalogConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty,
    ) : CatalogConfigurationProperty {
      public override fun glueDataCatalogConfiguration(): Any? =
          unwrap(this).getGlueDataCatalogConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CatalogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty):
          CatalogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CatalogConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CatalogConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CSVMappingParametersProperty {
    public fun recordColumnDelimiter(): String

    public fun recordRowDelimiter(): String

    public interface Builder {
      public fun recordColumnDelimiter(recordColumnDelimiter: String) {
      }

      public fun recordRowDelimiter(recordRowDelimiter: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty.builder()

      public override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      public override fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty,
    ) : CSVMappingParametersProperty {
      public override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      public override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CSVMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty):
          CSVMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CSVMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.CSVMappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordFormatProperty {
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    public fun recordFormatType(): String

    public interface Builder {
      public fun mappingParameters(mappingParameters: IResolvable) {
      }

      public fun mappingParameters(mappingParameters: MappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ecd3fdb498eb8bf2feb547186492adc0e784e47e8a01c2832653953230ea7c5")
      public
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit) {
      }

      public fun recordFormatType(recordFormatType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty.builder()

      public override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable::unwrap))
      }

      public override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ecd3fdb498eb8bf2feb547186492adc0e784e47e8a01c2832653953230ea7c5")
      public override
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit):
          Unit = mappingParameters(MappingParametersProperty(mappingParameters))

      public override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty,
    ) : RecordFormatProperty {
      public override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      public override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty):
          RecordFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordFormatProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RecordFormatProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputLambdaProcessorProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty,
    ) : InputLambdaProcessorProperty {
      public override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputLambdaProcessorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty):
          InputLambdaProcessorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLambdaProcessorProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.InputLambdaProcessorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ParallelismConfigurationProperty {
    public fun autoScalingEnabled(): Any? = unwrap(this).getAutoScalingEnabled()

    public fun configurationType(): String

    public fun parallelism(): Number? = unwrap(this).getParallelism()

    public fun parallelismPerKpu(): Number? = unwrap(this).getParallelismPerKpu()

    public interface Builder {
      public fun autoScalingEnabled(autoScalingEnabled: Boolean) {
      }

      public fun autoScalingEnabled(autoScalingEnabled: IResolvable) {
      }

      public fun configurationType(configurationType: String) {
      }

      public fun parallelism(parallelism: Number) {
      }

      public fun parallelismPerKpu(parallelismPerKpu: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty.builder()

      public override fun autoScalingEnabled(autoScalingEnabled: Boolean) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled)
      }

      public override fun autoScalingEnabled(autoScalingEnabled: IResolvable) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled.let(IResolvable::unwrap))
      }

      public override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      public override fun parallelism(parallelism: Number) {
        cdkBuilder.parallelism(parallelism)
      }

      public override fun parallelismPerKpu(parallelismPerKpu: Number) {
        cdkBuilder.parallelismPerKpu(parallelismPerKpu)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty,
    ) : ParallelismConfigurationProperty {
      public override fun autoScalingEnabled(): Any? = unwrap(this).getAutoScalingEnabled()

      public override fun configurationType(): String = unwrap(this).getConfigurationType()

      public override fun parallelism(): Number? = unwrap(this).getParallelism()

      public override fun parallelismPerKpu(): Number? = unwrap(this).getParallelismPerKpu()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParallelismConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty):
          ParallelismConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParallelismConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.ParallelismConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RunConfigurationProperty {
    public fun applicationRestoreConfiguration(): Any? =
        unwrap(this).getApplicationRestoreConfiguration()

    public fun flinkRunConfiguration(): Any? = unwrap(this).getFlinkRunConfiguration()

    public interface Builder {
      public fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable) {
      }

      public
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efc332ff3262127040a2c64e17e89c17dad48d5e3c70d84a6c089c7a91480d72")
      public
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty.Builder.() -> Unit) {
      }

      public fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
      }

      public fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a17668293e15c33da2c8cb7c874cb87cff2921c78d503506efab10959b7cdc8a")
      public
          fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty.builder()

      public override
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration.let(ApplicationRestoreConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("efc332ff3262127040a2c64e17e89c17dad48d5e3c70d84a6c089c7a91480d72")
      public override
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty(applicationRestoreConfiguration))

      public override fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration.let(FlinkRunConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a17668293e15c33da2c8cb7c874cb87cff2921c78d503506efab10959b7cdc8a")
      public override
          fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty.Builder.() -> Unit):
          Unit = flinkRunConfiguration(FlinkRunConfigurationProperty(flinkRunConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty,
    ) : RunConfigurationProperty {
      public override fun applicationRestoreConfiguration(): Any? =
          unwrap(this).getApplicationRestoreConfiguration()

      public override fun flinkRunConfiguration(): Any? = unwrap(this).getFlinkRunConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RunConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty):
          RunConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication.RunConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
