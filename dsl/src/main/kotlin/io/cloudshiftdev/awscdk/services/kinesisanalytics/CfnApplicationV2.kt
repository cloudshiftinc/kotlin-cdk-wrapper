package io.cloudshiftdev.awscdk.services.kinesisanalytics

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

public open class CfnApplicationV2 internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun applicationConfiguration(): Any? = unwrap(this).getApplicationConfiguration()

  public open fun applicationConfiguration(`value`: IResolvable) {
    unwrap(this).setApplicationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun applicationConfiguration(`value`: ApplicationConfigurationProperty) {
    unwrap(this).setApplicationConfiguration(`value`.let(ApplicationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4b5e11ba49e9164d8866a42e0693f67b97c4ed66de9086a82f6094e15d52e5c9")
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
  @JvmName("fdb94f1cebb358733aba10228ef4aa1abf1ca8ea84db3c5fc90e06ed008658fe")
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
  @JvmName("97125d14e64cf3cfe0110c9ed9e29c30322d724c4fd770bc6507c109daede9ea")
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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun applicationConfiguration(applicationConfiguration: IResolvable)

    public fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2461bc2b62111ee8d16bfb11e5471f0c864aee523ab14ff01e7868d9632ad11")
    public
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty.Builder.() -> Unit)

    public fun applicationDescription(applicationDescription: String)

    public fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable)

    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0917024c31d712ff0173d51f996e37b3b43030d06df00cd121122e235f8e60")
    public
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit)

    public fun applicationMode(applicationMode: String)

    public fun applicationName(applicationName: String)

    public fun runConfiguration(runConfiguration: IResolvable)

    public fun runConfiguration(runConfiguration: RunConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccfbb79cafb763a2efbd29aba4eb92d1fba1e794d7068802fc41131c81325ff3")
    public fun runConfiguration(runConfiguration: RunConfigurationProperty.Builder.() -> Unit)

    public fun runtimeEnvironment(runtimeEnvironment: String)

    public fun serviceExecutionRole(serviceExecutionRole: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.Builder.create(scope, id)

    override fun applicationConfiguration(applicationConfiguration: IResolvable) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty) {
      cdkBuilder.applicationConfiguration(applicationConfiguration.let(ApplicationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2461bc2b62111ee8d16bfb11e5471f0c864aee523ab14ff01e7868d9632ad11")
    override
        fun applicationConfiguration(applicationConfiguration: ApplicationConfigurationProperty.Builder.() -> Unit):
        Unit = applicationConfiguration(ApplicationConfigurationProperty(applicationConfiguration))

    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: IResolvable) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty) {
      cdkBuilder.applicationMaintenanceConfiguration(applicationMaintenanceConfiguration.let(ApplicationMaintenanceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0917024c31d712ff0173d51f996e37b3b43030d06df00cd121122e235f8e60")
    override
        fun applicationMaintenanceConfiguration(applicationMaintenanceConfiguration: ApplicationMaintenanceConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationMaintenanceConfiguration(ApplicationMaintenanceConfigurationProperty(applicationMaintenanceConfiguration))

    override fun applicationMode(applicationMode: String) {
      cdkBuilder.applicationMode(applicationMode)
    }

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun runConfiguration(runConfiguration: IResolvable) {
      cdkBuilder.runConfiguration(runConfiguration.let(IResolvable::unwrap))
    }

    override fun runConfiguration(runConfiguration: RunConfigurationProperty) {
      cdkBuilder.runConfiguration(runConfiguration.let(RunConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccfbb79cafb763a2efbd29aba4eb92d1fba1e794d7068802fc41131c81325ff3")
    override fun runConfiguration(runConfiguration: RunConfigurationProperty.Builder.() -> Unit):
        Unit = runConfiguration(RunConfigurationProperty(runConfiguration))

    override fun runtimeEnvironment(runtimeEnvironment: String) {
      cdkBuilder.runtimeEnvironment(runtimeEnvironment)
    }

    override fun serviceExecutionRole(serviceExecutionRole: String) {
      cdkBuilder.serviceExecutionRole(serviceExecutionRole)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2 =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2):
        CfnApplicationV2 = CfnApplicationV2(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationV2):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2 = wrapped.cdkObject
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
      public fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable)

      public
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5183db265e1aee172022265f5cfaccfeb5c83d87bd85388c41bb7878c858d108")
      public
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty.Builder.() -> Unit)

      public fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable)

      public
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f93f805f65fadc3b63cfb361bd2a49f4db63fc51fe1800d226c57963a17f2f24")
      public
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty.Builder.() -> Unit)

      public fun environmentProperties(environmentProperties: IResolvable)

      public fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51366589d5f670f05c811a953407812cf8a2373acca786d670e30637e4968f42")
      public
          fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty.Builder.() -> Unit)

      public fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable)

      public
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5113cb0b71cc6c88dd7ebe6cafe469183aabccff994515d9b052dd60df69fe1c")
      public
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty.Builder.() -> Unit)

      public fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable)

      public
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c5e8903b11230e80603cfcf6061ea65675f4ba6dca2394b69443e17adbf10f1")
      public
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty.Builder.() -> Unit)

      public fun vpcConfigurations(vpcConfigurations: IResolvable)

      public fun vpcConfigurations(vpcConfigurations: List<Any>)

      public fun vpcConfigurations(vararg vpcConfigurations: Any)

      public fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable)

      public
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5512345b33fc22457b322e874d621c752f1ca40bb263f439750cb5398ec9c8e6")
      public
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty.builder()

      override fun applicationCodeConfiguration(applicationCodeConfiguration: IResolvable) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration.let(IResolvable::unwrap))
      }

      override
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty) {
        cdkBuilder.applicationCodeConfiguration(applicationCodeConfiguration.let(ApplicationCodeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5183db265e1aee172022265f5cfaccfeb5c83d87bd85388c41bb7878c858d108")
      override
          fun applicationCodeConfiguration(applicationCodeConfiguration: ApplicationCodeConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationCodeConfiguration(ApplicationCodeConfigurationProperty(applicationCodeConfiguration))

      override fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: IResolvable) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration.let(IResolvable::unwrap))
      }

      override
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty) {
        cdkBuilder.applicationSnapshotConfiguration(applicationSnapshotConfiguration.let(ApplicationSnapshotConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f93f805f65fadc3b63cfb361bd2a49f4db63fc51fe1800d226c57963a17f2f24")
      override
          fun applicationSnapshotConfiguration(applicationSnapshotConfiguration: ApplicationSnapshotConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationSnapshotConfiguration(ApplicationSnapshotConfigurationProperty(applicationSnapshotConfiguration))

      override fun environmentProperties(environmentProperties: IResolvable) {
        cdkBuilder.environmentProperties(environmentProperties.let(IResolvable::unwrap))
      }

      override fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty) {
        cdkBuilder.environmentProperties(environmentProperties.let(EnvironmentPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51366589d5f670f05c811a953407812cf8a2373acca786d670e30637e4968f42")
      override
          fun environmentProperties(environmentProperties: EnvironmentPropertiesProperty.Builder.() -> Unit):
          Unit = environmentProperties(EnvironmentPropertiesProperty(environmentProperties))

      override fun flinkApplicationConfiguration(flinkApplicationConfiguration: IResolvable) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration.let(IResolvable::unwrap))
      }

      override
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty) {
        cdkBuilder.flinkApplicationConfiguration(flinkApplicationConfiguration.let(FlinkApplicationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5113cb0b71cc6c88dd7ebe6cafe469183aabccff994515d9b052dd60df69fe1c")
      override
          fun flinkApplicationConfiguration(flinkApplicationConfiguration: FlinkApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          flinkApplicationConfiguration(FlinkApplicationConfigurationProperty(flinkApplicationConfiguration))

      override fun sqlApplicationConfiguration(sqlApplicationConfiguration: IResolvable) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration.let(IResolvable::unwrap))
      }

      override
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty) {
        cdkBuilder.sqlApplicationConfiguration(sqlApplicationConfiguration.let(SqlApplicationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c5e8903b11230e80603cfcf6061ea65675f4ba6dca2394b69443e17adbf10f1")
      override
          fun sqlApplicationConfiguration(sqlApplicationConfiguration: SqlApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          sqlApplicationConfiguration(SqlApplicationConfigurationProperty(sqlApplicationConfiguration))

      override fun vpcConfigurations(vpcConfigurations: IResolvable) {
        cdkBuilder.vpcConfigurations(vpcConfigurations.let(IResolvable::unwrap))
      }

      override fun vpcConfigurations(vpcConfigurations: List<Any>) {
        cdkBuilder.vpcConfigurations(vpcConfigurations)
      }

      override fun vpcConfigurations(vararg vpcConfigurations: Any): Unit =
          vpcConfigurations(vpcConfigurations.toList())

      override fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: IResolvable) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration.let(IResolvable::unwrap))
      }

      override
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty) {
        cdkBuilder.zeppelinApplicationConfiguration(zeppelinApplicationConfiguration.let(ZeppelinApplicationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5512345b33fc22457b322e874d621c752f1ca40bb263f439750cb5398ec9c8e6")
      override
          fun zeppelinApplicationConfiguration(zeppelinApplicationConfiguration: ZeppelinApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          zeppelinApplicationConfiguration(ZeppelinApplicationConfigurationProperty(zeppelinApplicationConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty,
    ) : ApplicationConfigurationProperty {
      override fun applicationCodeConfiguration(): Any? =
          unwrap(this).getApplicationCodeConfiguration()

      override fun applicationSnapshotConfiguration(): Any? =
          unwrap(this).getApplicationSnapshotConfiguration()

      override fun environmentProperties(): Any? = unwrap(this).getEnvironmentProperties()

      override fun flinkApplicationConfiguration(): Any? =
          unwrap(this).getFlinkApplicationConfiguration()

      override fun sqlApplicationConfiguration(): Any? =
          unwrap(this).getSqlApplicationConfiguration()

      override fun vpcConfigurations(): Any? = unwrap(this).getVpcConfigurations()

      override fun zeppelinApplicationConfiguration(): Any? =
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty):
          ApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisStreamsInputProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty.builder()

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty,
    ) : KinesisStreamsInputProperty {
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamsInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty):
          KinesisStreamsInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsInputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisStreamsInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MappingParametersProperty {
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

    public interface Builder {
      public fun csvMappingParameters(csvMappingParameters: IResolvable)

      public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e03d667539e6d937f0d660ec33db8a3908c3a5028e9965220b600a57f69b002f")
      public
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit)

      public fun jsonMappingParameters(jsonMappingParameters: IResolvable)

      public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a687b0e095f8fc8bed12385c9c5405e169f32fc6bffaf1e990837e29501a83d1")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty.builder()

      override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable::unwrap))
      }

      override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e03d667539e6d937f0d660ec33db8a3908c3a5028e9965220b600a57f69b002f")
      override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable::unwrap))
      }

      override fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a687b0e095f8fc8bed12385c9c5405e169f32fc6bffaf1e990837e29501a83d1")
      override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit):
          Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty,
    ) : MappingParametersProperty {
      override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty):
          MappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordFormatProperty {
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    public fun recordFormatType(): String

    public interface Builder {
      public fun mappingParameters(mappingParameters: IResolvable)

      public fun mappingParameters(mappingParameters: MappingParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e4cb691a6553bc1a37ffc0ad89ccdf126254533b6fb37fcc41980962693619f")
      public fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit)

      public fun recordFormatType(recordFormatType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty.builder()

      override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable::unwrap))
      }

      override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e4cb691a6553bc1a37ffc0ad89ccdf126254533b6fb37fcc41980962693619f")
      override
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit):
          Unit = mappingParameters(MappingParametersProperty(mappingParameters))

      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty,
    ) : RecordFormatProperty {
      override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty):
          RecordFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordFormatProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordFormatProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CSVMappingParametersProperty {
    public fun recordColumnDelimiter(): String

    public fun recordRowDelimiter(): String

    public interface Builder {
      public fun recordColumnDelimiter(recordColumnDelimiter: String)

      public fun recordRowDelimiter(recordRowDelimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty.builder()

      override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      override fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty,
    ) : CSVMappingParametersProperty {
      override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CSVMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty):
          CSVMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CSVMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CSVMappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EnvironmentPropertiesProperty {
    public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    public interface Builder {
      public fun propertyGroups(propertyGroups: IResolvable)

      public fun propertyGroups(propertyGroups: List<Any>)

      public fun propertyGroups(vararg propertyGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty.builder()

      override fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
      }

      override fun propertyGroups(propertyGroups: List<Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
      }

      override fun propertyGroups(vararg propertyGroups: Any): Unit =
          propertyGroups(propertyGroups.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty,
    ) : EnvironmentPropertiesProperty {
      override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty):
          EnvironmentPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentPropertiesProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.EnvironmentPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SqlApplicationConfigurationProperty {
    public fun inputs(): Any? = unwrap(this).getInputs()

    public interface Builder {
      public fun inputs(inputs: IResolvable)

      public fun inputs(inputs: List<Any>)

      public fun inputs(vararg inputs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty.builder()

      override fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs.let(IResolvable::unwrap))
      }

      override fun inputs(inputs: List<Any>) {
        cdkBuilder.inputs(inputs)
      }

      override fun inputs(vararg inputs: Any): Unit = inputs(inputs.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty,
    ) : SqlApplicationConfigurationProperty {
      override fun inputs(): Any? = unwrap(this).getInputs()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty):
          SqlApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.SqlApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ContentBaseLocationProperty {
    public fun basePath(): String? = unwrap(this).getBasePath()

    public fun bucketArn(): String

    public interface Builder {
      public fun basePath(basePath: String)

      public fun bucketArn(bucketArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty.builder()

      override fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
      }

      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty,
    ) : S3ContentBaseLocationProperty {
      override fun basePath(): String? = unwrap(this).getBasePath()

      override fun bucketArn(): String = unwrap(this).getBucketArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ContentBaseLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty):
          S3ContentBaseLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ContentBaseLocationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface JSONMappingParametersProperty {
    public fun recordRowPath(): String

    public interface Builder {
      public fun recordRowPath(recordRowPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty.builder()

      override fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty,
    ) : JSONMappingParametersProperty {
      override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JSONMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty):
          JSONMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JSONMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.JSONMappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisFirehoseInputProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty.builder()

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty,
    ) : KinesisFirehoseInputProperty {
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty):
          KinesisFirehoseInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseInputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.KinesisFirehoseInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeployAsApplicationConfigurationProperty {
    public fun s3ContentLocation(): Any

    public interface Builder {
      public fun s3ContentLocation(s3ContentLocation: IResolvable)

      public fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58f0b29b06c8e43d8cfa3e56a43ad26504eb075104826e1262337355c0ade78")
      public
          fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty.builder()

      override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
      }

      override fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentBaseLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f58f0b29b06c8e43d8cfa3e56a43ad26504eb075104826e1262337355c0ade78")
      override
          fun s3ContentLocation(s3ContentLocation: S3ContentBaseLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentBaseLocationProperty(s3ContentLocation))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty,
    ) : DeployAsApplicationConfigurationProperty {
      override fun s3ContentLocation(): Any = unwrap(this).getS3ContentLocation()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty):
          DeployAsApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeployAsApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.DeployAsApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationMaintenanceConfigurationProperty {
    public fun applicationMaintenanceWindowStartTime(): String

    public interface Builder {
      public
          fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.builder()

      override
          fun applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime: String) {
        cdkBuilder.applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty,
    ) : ApplicationMaintenanceConfigurationProperty {
      override fun applicationMaintenanceWindowStartTime(): String =
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty):
          ApplicationMaintenanceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationMaintenanceConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationMaintenanceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MavenReferenceProperty {
    public fun artifactId(): String

    public fun groupId(): String

    public fun version(): String

    public interface Builder {
      public fun artifactId(artifactId: String)

      public fun groupId(groupId: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty.builder()

      override fun artifactId(artifactId: String) {
        cdkBuilder.artifactId(artifactId)
      }

      override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty,
    ) : MavenReferenceProperty {
      override fun artifactId(): String = unwrap(this).getArtifactId()

      override fun groupId(): String = unwrap(this).getGroupId()

      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MavenReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty):
          MavenReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MavenReferenceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputLambdaProcessorProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty.builder()

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty,
    ) : InputLambdaProcessorProperty {
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputLambdaProcessorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty):
          InputLambdaProcessorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLambdaProcessorProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputLambdaProcessorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FlinkRunConfigurationProperty {
    public fun allowNonRestoredState(): Any? = unwrap(this).getAllowNonRestoredState()

    public interface Builder {
      public fun allowNonRestoredState(allowNonRestoredState: Boolean)

      public fun allowNonRestoredState(allowNonRestoredState: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty.builder()

      override fun allowNonRestoredState(allowNonRestoredState: Boolean) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState)
      }

      override fun allowNonRestoredState(allowNonRestoredState: IResolvable) {
        cdkBuilder.allowNonRestoredState(allowNonRestoredState.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty,
    ) : FlinkRunConfigurationProperty {
      override fun allowNonRestoredState(): Any? = unwrap(this).getAllowNonRestoredState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FlinkRunConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty):
          FlinkRunConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlinkRunConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkRunConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ParallelismConfigurationProperty {
    public fun autoScalingEnabled(): Any? = unwrap(this).getAutoScalingEnabled()

    public fun configurationType(): String

    public fun parallelism(): Number? = unwrap(this).getParallelism()

    public fun parallelismPerKpu(): Number? = unwrap(this).getParallelismPerKpu()

    public interface Builder {
      public fun autoScalingEnabled(autoScalingEnabled: Boolean)

      public fun autoScalingEnabled(autoScalingEnabled: IResolvable)

      public fun configurationType(configurationType: String)

      public fun parallelism(parallelism: Number)

      public fun parallelismPerKpu(parallelismPerKpu: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.builder()

      override fun autoScalingEnabled(autoScalingEnabled: Boolean) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled)
      }

      override fun autoScalingEnabled(autoScalingEnabled: IResolvable) {
        cdkBuilder.autoScalingEnabled(autoScalingEnabled.let(IResolvable::unwrap))
      }

      override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      override fun parallelism(parallelism: Number) {
        cdkBuilder.parallelism(parallelism)
      }

      override fun parallelismPerKpu(parallelismPerKpu: Number) {
        cdkBuilder.parallelismPerKpu(parallelismPerKpu)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty,
    ) : ParallelismConfigurationProperty {
      override fun autoScalingEnabled(): Any? = unwrap(this).getAutoScalingEnabled()

      override fun configurationType(): String = unwrap(this).getConfigurationType()

      override fun parallelism(): Number? = unwrap(this).getParallelism()

      override fun parallelismPerKpu(): Number? = unwrap(this).getParallelismPerKpu()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParallelismConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty):
          ParallelismConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParallelismConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CodeContentProperty {
    public fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

    public fun textContent(): String? = unwrap(this).getTextContent()

    public fun zipFileContent(): String? = unwrap(this).getZipFileContent()

    public interface Builder {
      public fun s3ContentLocation(s3ContentLocation: IResolvable)

      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23b281f43c7fd367f282f61ea9ede9950239be7d96447744a63273c7d6068c0b")
      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit)

      public fun textContent(textContent: String)

      public fun zipFileContent(zipFileContent: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty.builder()

      override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
      }

      override fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23b281f43c7fd367f282f61ea9ede9950239be7d96447744a63273c7d6068c0b")
      override
          fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentLocationProperty(s3ContentLocation))

      override fun textContent(textContent: String) {
        cdkBuilder.textContent(textContent)
      }

      override fun zipFileContent(zipFileContent: String) {
        cdkBuilder.zipFileContent(zipFileContent)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty,
    ) : CodeContentProperty {
      override fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

      override fun textContent(): String? = unwrap(this).getTextContent()

      override fun zipFileContent(): String? = unwrap(this).getZipFileContent()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty):
          CodeContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeContentProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CodeContentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationCodeConfigurationProperty {
    public fun codeContent(): Any

    public fun codeContentType(): String

    public interface Builder {
      public fun codeContent(codeContent: IResolvable)

      public fun codeContent(codeContent: CodeContentProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ff44823ca2dc4cb3a41b23ae125f3f9fb3045d8197a8ce2f67a28c78eb90062")
      public fun codeContent(codeContent: CodeContentProperty.Builder.() -> Unit)

      public fun codeContentType(codeContentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty.builder()

      override fun codeContent(codeContent: IResolvable) {
        cdkBuilder.codeContent(codeContent.let(IResolvable::unwrap))
      }

      override fun codeContent(codeContent: CodeContentProperty) {
        cdkBuilder.codeContent(codeContent.let(CodeContentProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ff44823ca2dc4cb3a41b23ae125f3f9fb3045d8197a8ce2f67a28c78eb90062")
      override fun codeContent(codeContent: CodeContentProperty.Builder.() -> Unit): Unit =
          codeContent(CodeContentProperty(codeContent))

      override fun codeContentType(codeContentType: String) {
        cdkBuilder.codeContentType(codeContentType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty,
    ) : ApplicationCodeConfigurationProperty {
      override fun codeContent(): Any = unwrap(this).getCodeContent()

      override fun codeContentType(): String = unwrap(this).getCodeContentType()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty):
          ApplicationCodeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationCodeConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationCodeConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputParallelismProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public interface Builder {
      public fun count(count: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty.builder()

      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty,
    ) : InputParallelismProperty {
      override fun count(): Number? = unwrap(this).getCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputParallelismProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty):
          InputParallelismProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputParallelismProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputParallelismProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomArtifactConfigurationProperty {
    public fun artifactType(): String

    public fun mavenReference(): Any? = unwrap(this).getMavenReference()

    public fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()

    public interface Builder {
      public fun artifactType(artifactType: String)

      public fun mavenReference(mavenReference: IResolvable)

      public fun mavenReference(mavenReference: MavenReferenceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66d2abf3fb5448cb1c7c3954df2cf690c08718fe2474e503773a12e5b1dee20e")
      public fun mavenReference(mavenReference: MavenReferenceProperty.Builder.() -> Unit)

      public fun s3ContentLocation(s3ContentLocation: IResolvable)

      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac7877b1b4bd54d9592877b02d4c7823a5924cd8403d21b0b2fe2ab7d0c29a11")
      public fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty.builder()

      override fun artifactType(artifactType: String) {
        cdkBuilder.artifactType(artifactType)
      }

      override fun mavenReference(mavenReference: IResolvable) {
        cdkBuilder.mavenReference(mavenReference.let(IResolvable::unwrap))
      }

      override fun mavenReference(mavenReference: MavenReferenceProperty) {
        cdkBuilder.mavenReference(mavenReference.let(MavenReferenceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66d2abf3fb5448cb1c7c3954df2cf690c08718fe2474e503773a12e5b1dee20e")
      override fun mavenReference(mavenReference: MavenReferenceProperty.Builder.() -> Unit): Unit =
          mavenReference(MavenReferenceProperty(mavenReference))

      override fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(IResolvable::unwrap))
      }

      override fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation.let(S3ContentLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac7877b1b4bd54d9592877b02d4c7823a5924cd8403d21b0b2fe2ab7d0c29a11")
      override
          fun s3ContentLocation(s3ContentLocation: S3ContentLocationProperty.Builder.() -> Unit):
          Unit = s3ContentLocation(S3ContentLocationProperty(s3ContentLocation))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty,
    ) : CustomArtifactConfigurationProperty {
      override fun artifactType(): String = unwrap(this).getArtifactType()

      override fun mavenReference(): Any? = unwrap(this).getMavenReference()

      override fun s3ContentLocation(): Any? = unwrap(this).getS3ContentLocation()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty):
          CustomArtifactConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomArtifactConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputSchemaProperty {
    public fun recordColumns(): Any

    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    public fun recordFormat(): Any

    public interface Builder {
      public fun recordColumns(recordColumns: IResolvable)

      public fun recordColumns(recordColumns: List<Any>)

      public fun recordColumns(vararg recordColumns: Any)

      public fun recordEncoding(recordEncoding: String)

      public fun recordFormat(recordFormat: IResolvable)

      public fun recordFormat(recordFormat: RecordFormatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b6c5535c654ded1c710c9da214ce6fa617300a1362bb7176b9cfb28d195a212")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty.builder()

      override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable::unwrap))
      }

      override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns)
      }

      override fun recordColumns(vararg recordColumns: Any): Unit =
          recordColumns(recordColumns.toList())

      override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable::unwrap))
      }

      override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b6c5535c654ded1c710c9da214ce6fa617300a1362bb7176b9cfb28d195a212")
      override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit =
          recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty,
    ) : InputSchemaProperty {
      override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      override fun recordFormat(): Any = unwrap(this).getRecordFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty):
          InputSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputSchemaProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ContentLocationProperty {
    public fun bucketArn(): String

    public fun fileKey(): String

    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    public interface Builder {
      public fun bucketArn(bucketArn: String)

      public fun fileKey(fileKey: String)

      public fun objectVersion(objectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.builder()

      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      override fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
      }

      override fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty,
    ) : S3ContentLocationProperty {
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      override fun fileKey(): String = unwrap(this).getFileKey()

      override fun objectVersion(): String? = unwrap(this).getObjectVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ContentLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty):
          S3ContentLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ContentLocationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringConfigurationProperty {
    public fun configurationType(): String

    public fun logLevel(): String? = unwrap(this).getLogLevel()

    public fun metricsLevel(): String? = unwrap(this).getMetricsLevel()

    public interface Builder {
      public fun configurationType(configurationType: String)

      public fun logLevel(logLevel: String)

      public fun metricsLevel(metricsLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty.builder()

      override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      override fun metricsLevel(metricsLevel: String) {
        cdkBuilder.metricsLevel(metricsLevel)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty,
    ) : MonitoringConfigurationProperty {
      override fun configurationType(): String = unwrap(this).getConfigurationType()

      override fun logLevel(): String? = unwrap(this).getLogLevel()

      override fun metricsLevel(): String? = unwrap(this).getMetricsLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty):
          MonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PropertyGroupProperty {
    public fun propertyGroupId(): String? = unwrap(this).getPropertyGroupId()

    public fun propertyMap(): Any? = unwrap(this).getPropertyMap()

    public interface Builder {
      public fun propertyGroupId(propertyGroupId: String)

      public fun propertyMap(propertyMap: IResolvable)

      public fun propertyMap(propertyMap: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty.builder()

      override fun propertyGroupId(propertyGroupId: String) {
        cdkBuilder.propertyGroupId(propertyGroupId)
      }

      override fun propertyMap(propertyMap: IResolvable) {
        cdkBuilder.propertyMap(propertyMap.let(IResolvable::unwrap))
      }

      override fun propertyMap(propertyMap: Map<String, String>) {
        cdkBuilder.propertyMap(propertyMap)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty,
    ) : PropertyGroupProperty {
      override fun propertyGroupId(): String? = unwrap(this).getPropertyGroupId()

      override fun propertyMap(): Any? = unwrap(this).getPropertyMap()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty):
          PropertyGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyGroupProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.PropertyGroupProperty =
          (wrapped as Wrapper).cdkObject
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
      public fun inputParallelism(inputParallelism: IResolvable)

      public fun inputParallelism(inputParallelism: InputParallelismProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("239d3ca00e0b17514b8e33a37b72c01a4d7ad8ff5f906e7a89aa136289b19ddb")
      public fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit)

      public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable)

      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc36e4cc2f220aeb3d0abafeaabf7477615f0abe54ed34b756d10a97a3b035af")
      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit)

      public fun inputSchema(inputSchema: IResolvable)

      public fun inputSchema(inputSchema: InputSchemaProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("768cef96d1a3e3f2ddb3096f440217c0d28863040f387ce42683a47186ec3d39")
      public fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit)

      public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable)

      public fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8aa74df2aced7dae3e5757ab3e5585ccc2b2f0bbcb1d6b17222b187fee4ba174")
      public
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit)

      public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable)

      public fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c268deba05c2d4869cc7fd3c75c63f6a888cd41e450fb9f51b8c4a53ef23abd")
      public
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit)

      public fun namePrefix(namePrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.Builder =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty.builder()

      override fun inputParallelism(inputParallelism: IResolvable) {
        cdkBuilder.inputParallelism(inputParallelism.let(IResolvable::unwrap))
      }

      override fun inputParallelism(inputParallelism: InputParallelismProperty) {
        cdkBuilder.inputParallelism(inputParallelism.let(InputParallelismProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("239d3ca00e0b17514b8e33a37b72c01a4d7ad8ff5f906e7a89aa136289b19ddb")
      override fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit):
          Unit = inputParallelism(InputParallelismProperty(inputParallelism))

      override fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(IResolvable::unwrap))
      }

      override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(InputProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc36e4cc2f220aeb3d0abafeaabf7477615f0abe54ed34b756d10a97a3b035af")
      override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit):
          Unit =
          inputProcessingConfiguration(InputProcessingConfigurationProperty(inputProcessingConfiguration))

      override fun inputSchema(inputSchema: IResolvable) {
        cdkBuilder.inputSchema(inputSchema.let(IResolvable::unwrap))
      }

      override fun inputSchema(inputSchema: InputSchemaProperty) {
        cdkBuilder.inputSchema(inputSchema.let(InputSchemaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("768cef96d1a3e3f2ddb3096f440217c0d28863040f387ce42683a47186ec3d39")
      override fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit): Unit =
          inputSchema(InputSchemaProperty(inputSchema))

      override fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(IResolvable::unwrap))
      }

      override fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(KinesisFirehoseInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8aa74df2aced7dae3e5757ab3e5585ccc2b2f0bbcb1d6b17222b187fee4ba174")
      override
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseInput(KinesisFirehoseInputProperty(kinesisFirehoseInput))

      override fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(IResolvable::unwrap))
      }

      override fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(KinesisStreamsInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c268deba05c2d4869cc7fd3c75c63f6a888cd41e450fb9f51b8c4a53ef23abd")
      override
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsInput(KinesisStreamsInputProperty(kinesisStreamsInput))

      override fun namePrefix(namePrefix: String) {
        cdkBuilder.namePrefix(namePrefix)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty,
    ) : InputProperty {
      override fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

      override fun inputProcessingConfiguration(): Any? =
          unwrap(this).getInputProcessingConfiguration()

      override fun inputSchema(): Any = unwrap(this).getInputSchema()

      override fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

      override fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

      override fun namePrefix(): String = unwrap(this).getNamePrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty):
          InputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CatalogConfigurationProperty {
    public fun glueDataCatalogConfiguration(): Any? = unwrap(this).getGlueDataCatalogConfiguration()

    public interface Builder {
      public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable)

      public
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cae6ad8548b6c4eab778d0dc03188fb1040ff9730dc07755031d5d3a52943282")
      public
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty.builder()

      override fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration.let(IResolvable::unwrap))
      }

      override
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration.let(GlueDataCatalogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cae6ad8548b6c4eab778d0dc03188fb1040ff9730dc07755031d5d3a52943282")
      override
          fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: GlueDataCatalogConfigurationProperty.Builder.() -> Unit):
          Unit =
          glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty(glueDataCatalogConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty,
    ) : CatalogConfigurationProperty {
      override fun glueDataCatalogConfiguration(): Any? =
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty):
          CatalogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CatalogConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CatalogConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationRestoreConfigurationProperty {
    public fun applicationRestoreType(): String

    public fun snapshotName(): String? = unwrap(this).getSnapshotName()

    public interface Builder {
      public fun applicationRestoreType(applicationRestoreType: String)

      public fun snapshotName(snapshotName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty.builder()

      override fun applicationRestoreType(applicationRestoreType: String) {
        cdkBuilder.applicationRestoreType(applicationRestoreType)
      }

      override fun snapshotName(snapshotName: String) {
        cdkBuilder.snapshotName(snapshotName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty,
    ) : ApplicationRestoreConfigurationProperty {
      override fun applicationRestoreType(): String = unwrap(this).getApplicationRestoreType()

      override fun snapshotName(): String? = unwrap(this).getSnapshotName()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty):
          ApplicationRestoreConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationRestoreConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationRestoreConfigurationProperty
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
      public fun catalogConfiguration(catalogConfiguration: IResolvable)

      public fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56a92e306ea7a4f9cb64c6cca427d99f611a927cacb9f9a8819ef3dba5abcff5")
      public
          fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty.Builder.() -> Unit)

      public fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable)

      public fun customArtifactsConfiguration(customArtifactsConfiguration: List<Any>)

      public fun customArtifactsConfiguration(vararg customArtifactsConfiguration: Any)

      public fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: IResolvable)

      public
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("331c26ab38775b91c275d7b60ba0c7329cf10d5ba9e6445b91d788e4300663d4")
      public
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty.Builder.() -> Unit)

      public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

      public
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a804da367ff63dc8e34fdea68bbba326290ab09e415676ac438dafe1456a8974")
      public
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty.builder()

      override fun catalogConfiguration(catalogConfiguration: IResolvable) {
        cdkBuilder.catalogConfiguration(catalogConfiguration.let(IResolvable::unwrap))
      }

      override fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty) {
        cdkBuilder.catalogConfiguration(catalogConfiguration.let(CatalogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56a92e306ea7a4f9cb64c6cca427d99f611a927cacb9f9a8819ef3dba5abcff5")
      override
          fun catalogConfiguration(catalogConfiguration: CatalogConfigurationProperty.Builder.() -> Unit):
          Unit = catalogConfiguration(CatalogConfigurationProperty(catalogConfiguration))

      override fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable) {
        cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration.let(IResolvable::unwrap))
      }

      override fun customArtifactsConfiguration(customArtifactsConfiguration: List<Any>) {
        cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration)
      }

      override fun customArtifactsConfiguration(vararg customArtifactsConfiguration: Any): Unit =
          customArtifactsConfiguration(customArtifactsConfiguration.toList())

      override fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: IResolvable) {
        cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration.let(IResolvable::unwrap))
      }

      override
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty) {
        cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration.let(DeployAsApplicationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("331c26ab38775b91c275d7b60ba0c7329cf10d5ba9e6445b91d788e4300663d4")
      override
          fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: DeployAsApplicationConfigurationProperty.Builder.() -> Unit):
          Unit =
          deployAsApplicationConfiguration(DeployAsApplicationConfigurationProperty(deployAsApplicationConfiguration))

      override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
      }

      override
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(ZeppelinMonitoringConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a804da367ff63dc8e34fdea68bbba326290ab09e415676ac438dafe1456a8974")
      override
          fun monitoringConfiguration(monitoringConfiguration: ZeppelinMonitoringConfigurationProperty.Builder.() -> Unit):
          Unit =
          monitoringConfiguration(ZeppelinMonitoringConfigurationProperty(monitoringConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty,
    ) : ZeppelinApplicationConfigurationProperty {
      override fun catalogConfiguration(): Any? = unwrap(this).getCatalogConfiguration()

      override fun customArtifactsConfiguration(): Any? =
          unwrap(this).getCustomArtifactsConfiguration()

      override fun deployAsApplicationConfiguration(): Any? =
          unwrap(this).getDeployAsApplicationConfiguration()

      override fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty):
          ZeppelinApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZeppelinApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CheckpointConfigurationProperty {
    public fun checkpointInterval(): Number? = unwrap(this).getCheckpointInterval()

    public fun checkpointingEnabled(): Any? = unwrap(this).getCheckpointingEnabled()

    public fun configurationType(): String

    public fun minPauseBetweenCheckpoints(): Number? = unwrap(this).getMinPauseBetweenCheckpoints()

    public interface Builder {
      public fun checkpointInterval(checkpointInterval: Number)

      public fun checkpointingEnabled(checkpointingEnabled: Boolean)

      public fun checkpointingEnabled(checkpointingEnabled: IResolvable)

      public fun configurationType(configurationType: String)

      public fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty.builder()

      override fun checkpointInterval(checkpointInterval: Number) {
        cdkBuilder.checkpointInterval(checkpointInterval)
      }

      override fun checkpointingEnabled(checkpointingEnabled: Boolean) {
        cdkBuilder.checkpointingEnabled(checkpointingEnabled)
      }

      override fun checkpointingEnabled(checkpointingEnabled: IResolvable) {
        cdkBuilder.checkpointingEnabled(checkpointingEnabled.let(IResolvable::unwrap))
      }

      override fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
      }

      override fun minPauseBetweenCheckpoints(minPauseBetweenCheckpoints: Number) {
        cdkBuilder.minPauseBetweenCheckpoints(minPauseBetweenCheckpoints)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty,
    ) : CheckpointConfigurationProperty {
      override fun checkpointInterval(): Number? = unwrap(this).getCheckpointInterval()

      override fun checkpointingEnabled(): Any? = unwrap(this).getCheckpointingEnabled()

      override fun configurationType(): String = unwrap(this).getConfigurationType()

      override fun minPauseBetweenCheckpoints(): Number? =
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty):
          CheckpointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CheckpointConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RunConfigurationProperty {
    public fun applicationRestoreConfiguration(): Any? =
        unwrap(this).getApplicationRestoreConfiguration()

    public fun flinkRunConfiguration(): Any? = unwrap(this).getFlinkRunConfiguration()

    public interface Builder {
      public fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable)

      public
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84efb69bda14653cae67d9353fc0e242a5fbd1121ce722cb4077d6018882cb4a")
      public
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty.Builder.() -> Unit)

      public fun flinkRunConfiguration(flinkRunConfiguration: IResolvable)

      public fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5337cf5e1902aa9b86757abe03a52b34802c6138d52004325dce6405a9cf9f8d")
      public
          fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty.builder()

      override fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration.let(IResolvable::unwrap))
      }

      override
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration.let(ApplicationRestoreConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84efb69bda14653cae67d9353fc0e242a5fbd1121ce722cb4077d6018882cb4a")
      override
          fun applicationRestoreConfiguration(applicationRestoreConfiguration: ApplicationRestoreConfigurationProperty.Builder.() -> Unit):
          Unit =
          applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty(applicationRestoreConfiguration))

      override fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration.let(IResolvable::unwrap))
      }

      override fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration.let(FlinkRunConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5337cf5e1902aa9b86757abe03a52b34802c6138d52004325dce6405a9cf9f8d")
      override
          fun flinkRunConfiguration(flinkRunConfiguration: FlinkRunConfigurationProperty.Builder.() -> Unit):
          Unit = flinkRunConfiguration(FlinkRunConfigurationProperty(flinkRunConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty,
    ) : RunConfigurationProperty {
      override fun applicationRestoreConfiguration(): Any? =
          unwrap(this).getApplicationRestoreConfiguration()

      override fun flinkRunConfiguration(): Any? = unwrap(this).getFlinkRunConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RunConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty):
          RunConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RunConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigurationProperty {
    public fun securityGroupIds(): List<String>

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty,
    ) : VpcConfigurationProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.VpcConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordColumnProperty {
    public fun mapping(): String? = unwrap(this).getMapping()

    public fun name(): String

    public fun sqlType(): String

    public interface Builder {
      public fun mapping(mapping: String)

      public fun name(name: String)

      public fun sqlType(sqlType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty.builder()

      override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty,
    ) : RecordColumnProperty {
      override fun mapping(): String? = unwrap(this).getMapping()

      override fun name(): String = unwrap(this).getName()

      override fun sqlType(): String = unwrap(this).getSqlType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty):
          RecordColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordColumnProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.RecordColumnProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ZeppelinMonitoringConfigurationProperty {
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    public interface Builder {
      public fun logLevel(logLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty.builder()

      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty,
    ) : ZeppelinMonitoringConfigurationProperty {
      override fun logLevel(): String? = unwrap(this).getLogLevel()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty):
          ZeppelinMonitoringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZeppelinMonitoringConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ZeppelinMonitoringConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GlueDataCatalogConfigurationProperty {
    public fun databaseArn(): String? = unwrap(this).getDatabaseArn()

    public interface Builder {
      public fun databaseArn(databaseArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty.builder()

      override fun databaseArn(databaseArn: String) {
        cdkBuilder.databaseArn(databaseArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty,
    ) : GlueDataCatalogConfigurationProperty {
      override fun databaseArn(): String? = unwrap(this).getDatabaseArn()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty):
          GlueDataCatalogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueDataCatalogConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.GlueDataCatalogConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ApplicationSnapshotConfigurationProperty {
    public fun snapshotsEnabled(): Any

    public interface Builder {
      public fun snapshotsEnabled(snapshotsEnabled: Boolean)

      public fun snapshotsEnabled(snapshotsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty.builder()

      override fun snapshotsEnabled(snapshotsEnabled: Boolean) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled)
      }

      override fun snapshotsEnabled(snapshotsEnabled: IResolvable) {
        cdkBuilder.snapshotsEnabled(snapshotsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty,
    ) : ApplicationSnapshotConfigurationProperty {
      override fun snapshotsEnabled(): Any = unwrap(this).getSnapshotsEnabled()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty):
          ApplicationSnapshotConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSnapshotConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ApplicationSnapshotConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputProcessingConfigurationProperty {
    public fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()

    public interface Builder {
      public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable)

      public fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ac7a1ddc265772b8e655485937e0839e4b931a5fa731c9da007d2f57bc3007c")
      public
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty.builder()

      override fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(IResolvable::unwrap))
      }

      override fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(InputLambdaProcessorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ac7a1ddc265772b8e655485937e0839e4b931a5fa731c9da007d2f57bc3007c")
      override
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit):
          Unit = inputLambdaProcessor(InputLambdaProcessorProperty(inputLambdaProcessor))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty,
    ) : InputProcessingConfigurationProperty {
      override fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty):
          InputProcessingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProcessingConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.InputProcessingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FlinkApplicationConfigurationProperty {
    public fun checkpointConfiguration(): Any? = unwrap(this).getCheckpointConfiguration()

    public fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

    public fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

    public interface Builder {
      public fun checkpointConfiguration(checkpointConfiguration: IResolvable)

      public fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44389922c1668ab5939a60e0dd52171e0d91a7ec4724e49b72515f975748642b")
      public
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty.Builder.() -> Unit)

      public fun monitoringConfiguration(monitoringConfiguration: IResolvable)

      public fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a145583c3da8ac85deb1a97752d83a8592398a0694fa8bcee953fc5da08f96c7")
      public
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit)

      public fun parallelismConfiguration(parallelismConfiguration: IResolvable)

      public
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22789524881e7159d7ca0c1d82f5c48c6f9ff6a62e2ffc0b73bd2c0e3bee5883")
      public
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.builder()

      override fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration.let(IResolvable::unwrap))
      }

      override
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration.let(CheckpointConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44389922c1668ab5939a60e0dd52171e0d91a7ec4724e49b72515f975748642b")
      override
          fun checkpointConfiguration(checkpointConfiguration: CheckpointConfigurationProperty.Builder.() -> Unit):
          Unit = checkpointConfiguration(CheckpointConfigurationProperty(checkpointConfiguration))

      override fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(IResolvable::unwrap))
      }

      override
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration.let(MonitoringConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a145583c3da8ac85deb1a97752d83a8592398a0694fa8bcee953fc5da08f96c7")
      override
          fun monitoringConfiguration(monitoringConfiguration: MonitoringConfigurationProperty.Builder.() -> Unit):
          Unit = monitoringConfiguration(MonitoringConfigurationProperty(monitoringConfiguration))

      override fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration.let(IResolvable::unwrap))
      }

      override
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration.let(ParallelismConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22789524881e7159d7ca0c1d82f5c48c6f9ff6a62e2ffc0b73bd2c0e3bee5883")
      override
          fun parallelismConfiguration(parallelismConfiguration: ParallelismConfigurationProperty.Builder.() -> Unit):
          Unit =
          parallelismConfiguration(ParallelismConfigurationProperty(parallelismConfiguration))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty,
    ) : FlinkApplicationConfigurationProperty {
      override fun checkpointConfiguration(): Any? = unwrap(this).getCheckpointConfiguration()

      override fun monitoringConfiguration(): Any? = unwrap(this).getMonitoringConfiguration()

      override fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty):
          FlinkApplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlinkApplicationConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
