package io.cloudshiftdev.awscdk.services.appflow

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

public open class CfnFlow internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appflow.CfnFlow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrFlowArn(): String = unwrap(this).getAttrFlowArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun destinationFlowConfigList(): Any = unwrap(this).getDestinationFlowConfigList()

  public open fun destinationFlowConfigList(`value`: IResolvable) {
    unwrap(this).setDestinationFlowConfigList(`value`.let(IResolvable::unwrap))
  }

  public open fun destinationFlowConfigList(__idx_ac66f0: List<Any>) {
    unwrap(this).setDestinationFlowConfigList(__idx_ac66f0)
  }

  public open fun flowName(): String = unwrap(this).getFlowName()

  public open fun flowName(`value`: String) {
    unwrap(this).setFlowName(`value`)
  }

  public open fun flowStatus(): String? = unwrap(this).getFlowStatus()

  public open fun flowStatus(`value`: String) {
    unwrap(this).setFlowStatus(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsArn(): String? = unwrap(this).getKmsArn()

  public open fun kmsArn(`value`: String) {
    unwrap(this).setKmsArn(`value`)
  }

  public open fun metadataCatalogConfig(): Any? = unwrap(this).getMetadataCatalogConfig()

  public open fun metadataCatalogConfig(`value`: IResolvable) {
    unwrap(this).setMetadataCatalogConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun metadataCatalogConfig(`value`: MetadataCatalogConfigProperty) {
    unwrap(this).setMetadataCatalogConfig(`value`.let(MetadataCatalogConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57f29c90a28e4ec5f1581790f2cabbcad44954f0c850b0c1295ec22628faa2c")
  public open fun metadataCatalogConfig(`value`: MetadataCatalogConfigProperty.Builder.() -> Unit):
      Unit = metadataCatalogConfig(MetadataCatalogConfigProperty(`value`))

  public open fun sourceFlowConfig(): Any = unwrap(this).getSourceFlowConfig()

  public open fun sourceFlowConfig(`value`: IResolvable) {
    unwrap(this).setSourceFlowConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceFlowConfig(`value`: SourceFlowConfigProperty) {
    unwrap(this).setSourceFlowConfig(`value`.let(SourceFlowConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63a8e6b5619154fa252d3ec11a37ebdb2251e880f242b1521505d0907a3a5738")
  public open fun sourceFlowConfig(`value`: SourceFlowConfigProperty.Builder.() -> Unit): Unit =
      sourceFlowConfig(SourceFlowConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tasks(): Any = unwrap(this).getTasks()

  public open fun tasks(`value`: IResolvable) {
    unwrap(this).setTasks(`value`.let(IResolvable::unwrap))
  }

  public open fun tasks(__idx_ac66f0: List<Any>) {
    unwrap(this).setTasks(__idx_ac66f0)
  }

  public open fun triggerConfig(): Any = unwrap(this).getTriggerConfig()

  public open fun triggerConfig(`value`: IResolvable) {
    unwrap(this).setTriggerConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun triggerConfig(`value`: TriggerConfigProperty) {
    unwrap(this).setTriggerConfig(`value`.let(TriggerConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45320e4e4f9c0d6b49ee956c40a4f4f81d97065249f3759f3e6b9de48818b3a9")
  public open fun triggerConfig(`value`: TriggerConfigProperty.Builder.() -> Unit): Unit =
      triggerConfig(TriggerConfigProperty(`value`))

  public interface Builder {
    public fun description(description: String) {
    }

    public fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
    }

    public fun destinationFlowConfigList(destinationFlowConfigList: List<Any>) {
    }

    public fun flowName(flowName: String) {
    }

    public fun flowStatus(flowStatus: String) {
    }

    public fun kmsArn(kmsArn: String) {
    }

    public fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
    }

    public fun metadataCatalogConfig(metadataCatalogConfig: MetadataCatalogConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e720d9b9cc18741b25ccf2fd1461e54daea95b322bba21d71f7f0465ed70c5a")
    public
        fun metadataCatalogConfig(metadataCatalogConfig: MetadataCatalogConfigProperty.Builder.() -> Unit) {
    }

    public fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
    }

    public fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ce8f9686103aed30f45bf4fabc3a9f02ab3fb16971b7e673b19195615c083fd")
    public fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun tasks(tasks: IResolvable) {
    }

    public fun tasks(tasks: List<Any>) {
    }

    public fun triggerConfig(triggerConfig: IResolvable) {
    }

    public fun triggerConfig(triggerConfig: TriggerConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab5c67ee89287b77802dc81859788a31a2bfc74a7e56c61dc4e14f6089b4abdf")
    public fun triggerConfig(triggerConfig: TriggerConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnFlow.Builder =
        software.amazon.awscdk.services.appflow.CfnFlow.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList.let(IResolvable::unwrap))
    }

    public override fun destinationFlowConfigList(destinationFlowConfigList: List<Any>) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList)
    }

    public override fun flowName(flowName: String) {
      cdkBuilder.flowName(flowName)
    }

    public override fun flowStatus(flowStatus: String) {
      cdkBuilder.flowStatus(flowStatus)
    }

    public override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    public override fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(IResolvable::unwrap))
    }

    public override
        fun metadataCatalogConfig(metadataCatalogConfig: MetadataCatalogConfigProperty) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(MetadataCatalogConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e720d9b9cc18741b25ccf2fd1461e54daea95b322bba21d71f7f0465ed70c5a")
    public override
        fun metadataCatalogConfig(metadataCatalogConfig: MetadataCatalogConfigProperty.Builder.() -> Unit):
        Unit = metadataCatalogConfig(MetadataCatalogConfigProperty(metadataCatalogConfig))

    public override fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(IResolvable::unwrap))
    }

    public override fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(SourceFlowConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ce8f9686103aed30f45bf4fabc3a9f02ab3fb16971b7e673b19195615c083fd")
    public override
        fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty.Builder.() -> Unit): Unit =
        sourceFlowConfig(SourceFlowConfigProperty(sourceFlowConfig))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun tasks(tasks: IResolvable) {
      cdkBuilder.tasks(tasks.let(IResolvable::unwrap))
    }

    public override fun tasks(tasks: List<Any>) {
      cdkBuilder.tasks(tasks)
    }

    public override fun triggerConfig(triggerConfig: IResolvable) {
      cdkBuilder.triggerConfig(triggerConfig.let(IResolvable::unwrap))
    }

    public override fun triggerConfig(triggerConfig: TriggerConfigProperty) {
      cdkBuilder.triggerConfig(triggerConfig.let(TriggerConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab5c67ee89287b77802dc81859788a31a2bfc74a7e56c61dc4e14f6089b4abdf")
    public override fun triggerConfig(triggerConfig: TriggerConfigProperty.Builder.() -> Unit): Unit
        = triggerConfig(TriggerConfigProperty(triggerConfig))

    public fun build(): software.amazon.awscdk.services.appflow.CfnFlow = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow): CfnFlow =
        CfnFlow(cdkObject)

    internal fun unwrap(wrapped: CfnFlow): software.amazon.awscdk.services.appflow.CfnFlow =
        wrapped.cdkObject
  }

  public interface IncrementalPullConfigProperty {
    public fun datetimeTypeFieldName(): String? = unwrap(this).getDatetimeTypeFieldName()

    public interface Builder {
      public fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty.builder()

      public override fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
        cdkBuilder.datetimeTypeFieldName(datetimeTypeFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty,
    ) : IncrementalPullConfigProperty {
      public override fun datetimeTypeFieldName(): String? = unwrap(this).getDatetimeTypeFieldName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IncrementalPullConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty):
          IncrementalPullConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncrementalPullConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LookoutMetricsDestinationPropertiesProperty {
    public fun `object`(): String? = unwrap(this).getObject()

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty,
    ) : LookoutMetricsDestinationPropertiesProperty {
      public override fun `object`(): String? = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LookoutMetricsDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty):
          LookoutMetricsDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LookoutMetricsDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.LookoutMetricsDestinationPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SAPODataSourcePropertiesProperty {
    public fun objectPath(): String

    public fun paginationConfig(): Any? = unwrap(this).getPaginationConfig()

    public fun parallelismConfig(): Any? = unwrap(this).getParallelismConfig()

    public interface Builder {
      public fun objectPath(objectPath: String) {
      }

      public fun paginationConfig(paginationConfig: IResolvable) {
      }

      public fun paginationConfig(paginationConfig: SAPODataPaginationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7195c68fb720e8cea66422e83f2b9dfdfd911194562c6ea948f3df6e046ba92")
      public
          fun paginationConfig(paginationConfig: SAPODataPaginationConfigProperty.Builder.() -> Unit) {
      }

      public fun parallelismConfig(parallelismConfig: IResolvable) {
      }

      public fun parallelismConfig(parallelismConfig: SAPODataParallelismConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f95371b951a28de06e5a099899d0ae58f7cd8fba9b9bbf1bd458d803c371c14")
      public
          fun parallelismConfig(parallelismConfig: SAPODataParallelismConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty.builder()

      public override fun objectPath(objectPath: String) {
        cdkBuilder.objectPath(objectPath)
      }

      public override fun paginationConfig(paginationConfig: IResolvable) {
        cdkBuilder.paginationConfig(paginationConfig.let(IResolvable::unwrap))
      }

      public override fun paginationConfig(paginationConfig: SAPODataPaginationConfigProperty) {
        cdkBuilder.paginationConfig(paginationConfig.let(SAPODataPaginationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7195c68fb720e8cea66422e83f2b9dfdfd911194562c6ea948f3df6e046ba92")
      public override
          fun paginationConfig(paginationConfig: SAPODataPaginationConfigProperty.Builder.() -> Unit):
          Unit = paginationConfig(SAPODataPaginationConfigProperty(paginationConfig))

      public override fun parallelismConfig(parallelismConfig: IResolvable) {
        cdkBuilder.parallelismConfig(parallelismConfig.let(IResolvable::unwrap))
      }

      public override fun parallelismConfig(parallelismConfig: SAPODataParallelismConfigProperty) {
        cdkBuilder.parallelismConfig(parallelismConfig.let(SAPODataParallelismConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f95371b951a28de06e5a099899d0ae58f7cd8fba9b9bbf1bd458d803c371c14")
      public override
          fun parallelismConfig(parallelismConfig: SAPODataParallelismConfigProperty.Builder.() -> Unit):
          Unit = parallelismConfig(SAPODataParallelismConfigProperty(parallelismConfig))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty,
    ) : SAPODataSourcePropertiesProperty {
      public override fun objectPath(): String = unwrap(this).getObjectPath()

      public override fun paginationConfig(): Any? = unwrap(this).getPaginationConfig()

      public override fun parallelismConfig(): Any? = unwrap(this).getParallelismConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SAPODataSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty):
          SAPODataSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrendmicroSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty,
    ) : TrendmicroSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TrendmicroSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty):
          TrendmicroSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrendmicroSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServiceNowSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty,
    ) : ServiceNowSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty):
          ServiceNowSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TaskProperty {
    public fun connectorOperator(): Any? = unwrap(this).getConnectorOperator()

    public fun destinationField(): String? = unwrap(this).getDestinationField()

    public fun sourceFields(): List<String>

    public fun taskProperties(): Any? = unwrap(this).getTaskProperties()

    public fun taskType(): String

    public interface Builder {
      public fun connectorOperator(connectorOperator: IResolvable) {
      }

      public fun connectorOperator(connectorOperator: ConnectorOperatorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9eee05d1d2ad0e27526018cda419a9577c90e2716d3d3dbf25a6f2deacb3c813")
      public
          fun connectorOperator(connectorOperator: ConnectorOperatorProperty.Builder.() -> Unit) {
      }

      public fun destinationField(destinationField: String) {
      }

      public fun sourceFields(sourceFields: List<String>) {
      }

      public fun taskProperties(taskProperties: IResolvable) {
      }

      public fun taskProperties(taskProperties: List<Any>) {
      }

      public fun taskType(taskType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty.builder()

      public override fun connectorOperator(connectorOperator: IResolvable) {
        cdkBuilder.connectorOperator(connectorOperator.let(IResolvable::unwrap))
      }

      public override fun connectorOperator(connectorOperator: ConnectorOperatorProperty) {
        cdkBuilder.connectorOperator(connectorOperator.let(ConnectorOperatorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9eee05d1d2ad0e27526018cda419a9577c90e2716d3d3dbf25a6f2deacb3c813")
      public override
          fun connectorOperator(connectorOperator: ConnectorOperatorProperty.Builder.() -> Unit):
          Unit = connectorOperator(ConnectorOperatorProperty(connectorOperator))

      public override fun destinationField(destinationField: String) {
        cdkBuilder.destinationField(destinationField)
      }

      public override fun sourceFields(sourceFields: List<String>) {
        cdkBuilder.sourceFields(sourceFields)
      }

      public override fun taskProperties(taskProperties: IResolvable) {
        cdkBuilder.taskProperties(taskProperties.let(IResolvable::unwrap))
      }

      public override fun taskProperties(taskProperties: List<Any>) {
        cdkBuilder.taskProperties(taskProperties)
      }

      public override fun taskType(taskType: String) {
        cdkBuilder.taskType(taskType)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty,
    ) : TaskProperty {
      public override fun connectorOperator(): Any? = unwrap(this).getConnectorOperator()

      public override fun destinationField(): String? = unwrap(this).getDestinationField()

      public override fun sourceFields(): List<String> = unwrap(this).getSourceFields() ?:
          emptyList()

      public override fun taskProperties(): Any? = unwrap(this).getTaskProperties()

      public override fun taskType(): String = unwrap(this).getTaskType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TaskProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty):
          TaskProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.TaskProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VeevaSourcePropertiesProperty {
    public fun documentType(): String? = unwrap(this).getDocumentType()

    public fun includeAllVersions(): Any? = unwrap(this).getIncludeAllVersions()

    public fun includeRenditions(): Any? = unwrap(this).getIncludeRenditions()

    public fun includeSourceFiles(): Any? = unwrap(this).getIncludeSourceFiles()

    public fun `object`(): String

    public interface Builder {
      public fun documentType(documentType: String) {
      }

      public fun includeAllVersions(includeAllVersions: Boolean) {
      }

      public fun includeAllVersions(includeAllVersions: IResolvable) {
      }

      public fun includeRenditions(includeRenditions: Boolean) {
      }

      public fun includeRenditions(includeRenditions: IResolvable) {
      }

      public fun includeSourceFiles(includeSourceFiles: Boolean) {
      }

      public fun includeSourceFiles(includeSourceFiles: IResolvable) {
      }

      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty.builder()

      public override fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
      }

      public override fun includeAllVersions(includeAllVersions: Boolean) {
        cdkBuilder.includeAllVersions(includeAllVersions)
      }

      public override fun includeAllVersions(includeAllVersions: IResolvable) {
        cdkBuilder.includeAllVersions(includeAllVersions.let(IResolvable::unwrap))
      }

      public override fun includeRenditions(includeRenditions: Boolean) {
        cdkBuilder.includeRenditions(includeRenditions)
      }

      public override fun includeRenditions(includeRenditions: IResolvable) {
        cdkBuilder.includeRenditions(includeRenditions.let(IResolvable::unwrap))
      }

      public override fun includeSourceFiles(includeSourceFiles: Boolean) {
        cdkBuilder.includeSourceFiles(includeSourceFiles)
      }

      public override fun includeSourceFiles(includeSourceFiles: IResolvable) {
        cdkBuilder.includeSourceFiles(includeSourceFiles.let(IResolvable::unwrap))
      }

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty,
    ) : VeevaSourcePropertiesProperty {
      public override fun documentType(): String? = unwrap(this).getDocumentType()

      public override fun includeAllVersions(): Any? = unwrap(this).getIncludeAllVersions()

      public override fun includeRenditions(): Any? = unwrap(this).getIncludeRenditions()

      public override fun includeSourceFiles(): Any? = unwrap(this).getIncludeSourceFiles()

      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VeevaSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty):
          VeevaSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VeevaSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MarketoSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty,
    ) : MarketoSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MarketoSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty):
          MarketoSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SAPODataParallelismConfigProperty {
    public fun maxParallelism(): Number

    public interface Builder {
      public fun maxParallelism(maxParallelism: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty.builder()

      public override fun maxParallelism(maxParallelism: Number) {
        cdkBuilder.maxParallelism(maxParallelism)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty,
    ) : SAPODataParallelismConfigProperty {
      public override fun maxParallelism(): Number = unwrap(this).getMaxParallelism()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SAPODataParallelismConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty):
          SAPODataParallelismConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataParallelismConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataParallelismConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmplitudeSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty,
    ) : AmplitudeSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmplitudeSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty):
          AmplitudeSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmplitudeSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrefixConfigProperty {
    public fun pathPrefixHierarchy(): List<String> = unwrap(this).getPathPrefixHierarchy() ?:
        emptyList()

    public fun prefixFormat(): String? = unwrap(this).getPrefixFormat()

    public fun prefixType(): String? = unwrap(this).getPrefixType()

    public interface Builder {
      public fun pathPrefixHierarchy(pathPrefixHierarchy: List<String>) {
      }

      public fun prefixFormat(prefixFormat: String) {
      }

      public fun prefixType(prefixType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty.builder()

      public override fun pathPrefixHierarchy(pathPrefixHierarchy: List<String>) {
        cdkBuilder.pathPrefixHierarchy(pathPrefixHierarchy)
      }

      public override fun prefixFormat(prefixFormat: String) {
        cdkBuilder.prefixFormat(prefixFormat)
      }

      public override fun prefixType(prefixType: String) {
        cdkBuilder.prefixType(prefixType)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty,
    ) : PrefixConfigProperty {
      public override fun pathPrefixHierarchy(): List<String> =
          unwrap(this).getPathPrefixHierarchy() ?: emptyList()

      public override fun prefixFormat(): String? = unwrap(this).getPrefixFormat()

      public override fun prefixType(): String? = unwrap(this).getPrefixType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrefixConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty):
          PrefixConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrefixConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ZendeskSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty,
    ) : ZendeskSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ZendeskSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty):
          ZendeskSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SnowflakeDestinationPropertiesProperty {
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    public fun intermediateBucketName(): String

    public fun `object`(): String

    public interface Builder {
      public fun bucketPrefix(bucketPrefix: String) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646ce6c201ad615973cb0fb40476ff65e117a9cce859f39a0a75ffc640ead1e2")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun intermediateBucketName(intermediateBucketName: String) {
      }

      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty.builder()

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      public override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646ce6c201ad615973cb0fb40476ff65e117a9cce859f39a0a75ffc640ead1e2")
      public override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      public override fun intermediateBucketName(intermediateBucketName: String) {
        cdkBuilder.intermediateBucketName(intermediateBucketName)
      }

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty,
    ) : SnowflakeDestinationPropertiesProperty {
      public override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      public override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      public override fun intermediateBucketName(): String =
          unwrap(this).getIntermediateBucketName()

      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty):
          SnowflakeDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EventBridgeDestinationPropertiesProperty {
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    public fun `object`(): String

    public interface Builder {
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c980cf0619d47543c453f74a7025f668f5960b470348d6a863e07c13d827a6a")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty.builder()

      public override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      public override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c980cf0619d47543c453f74a7025f668f5960b470348d6a863e07c13d827a6a")
      public override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty,
    ) : EventBridgeDestinationPropertiesProperty {
      public override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EventBridgeDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty):
          EventBridgeDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.EventBridgeDestinationPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DynatraceSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty,
    ) : DynatraceSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynatraceSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty):
          DynatraceSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynatraceSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DynatraceSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomConnectorSourcePropertiesProperty {
    public fun customProperties(): Any? = unwrap(this).getCustomProperties()

    public fun dataTransferApi(): Any? = unwrap(this).getDataTransferApi()

    public fun entityName(): String

    public interface Builder {
      public fun customProperties(customProperties: IResolvable) {
      }

      public fun customProperties(customProperties: Map<String, String>) {
      }

      public fun dataTransferApi(dataTransferApi: IResolvable) {
      }

      public fun dataTransferApi(dataTransferApi: DataTransferApiProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ac4e51b048b3a753fce4e0cbfa032f54fa15f574236c63e35c626ad5c4dbc97")
      public fun dataTransferApi(dataTransferApi: DataTransferApiProperty.Builder.() -> Unit) {
      }

      public fun entityName(entityName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty.builder()

      public override fun customProperties(customProperties: IResolvable) {
        cdkBuilder.customProperties(customProperties.let(IResolvable::unwrap))
      }

      public override fun customProperties(customProperties: Map<String, String>) {
        cdkBuilder.customProperties(customProperties)
      }

      public override fun dataTransferApi(dataTransferApi: IResolvable) {
        cdkBuilder.dataTransferApi(dataTransferApi.let(IResolvable::unwrap))
      }

      public override fun dataTransferApi(dataTransferApi: DataTransferApiProperty) {
        cdkBuilder.dataTransferApi(dataTransferApi.let(DataTransferApiProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ac4e51b048b3a753fce4e0cbfa032f54fa15f574236c63e35c626ad5c4dbc97")
      public override
          fun dataTransferApi(dataTransferApi: DataTransferApiProperty.Builder.() -> Unit): Unit =
          dataTransferApi(DataTransferApiProperty(dataTransferApi))

      public override fun entityName(entityName: String) {
        cdkBuilder.entityName(entityName)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty,
    ) : CustomConnectorSourcePropertiesProperty {
      public override fun customProperties(): Any? = unwrap(this).getCustomProperties()

      public override fun dataTransferApi(): Any? = unwrap(this).getDataTransferApi()

      public override fun entityName(): String = unwrap(this).getEntityName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomConnectorSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty):
          CustomConnectorSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomConnectorSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomConnectorDestinationPropertiesProperty {
    public fun customProperties(): Any? = unwrap(this).getCustomProperties()

    public fun entityName(): String

    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    public fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

    public fun writeOperationType(): String? = unwrap(this).getWriteOperationType()

    public interface Builder {
      public fun customProperties(customProperties: IResolvable) {
      }

      public fun customProperties(customProperties: Map<String, String>) {
      }

      public fun entityName(entityName: String) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1987b9fda54644ce31894cf27282a859746ec5079d56bf57d51404c701df3f3")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun idFieldNames(idFieldNames: List<String>) {
      }

      public fun writeOperationType(writeOperationType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty.builder()

      public override fun customProperties(customProperties: IResolvable) {
        cdkBuilder.customProperties(customProperties.let(IResolvable::unwrap))
      }

      public override fun customProperties(customProperties: Map<String, String>) {
        cdkBuilder.customProperties(customProperties)
      }

      public override fun entityName(entityName: String) {
        cdkBuilder.entityName(entityName)
      }

      public override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      public override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1987b9fda54644ce31894cf27282a859746ec5079d56bf57d51404c701df3f3")
      public override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      public override fun idFieldNames(idFieldNames: List<String>) {
        cdkBuilder.idFieldNames(idFieldNames)
      }

      public override fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty,
    ) : CustomConnectorDestinationPropertiesProperty {
      public override fun customProperties(): Any? = unwrap(this).getCustomProperties()

      public override fun entityName(): String = unwrap(this).getEntityName()

      public override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      public override fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?:
          emptyList()

      public override fun writeOperationType(): String? = unwrap(this).getWriteOperationType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomConnectorDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty):
          CustomConnectorDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomConnectorDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.CustomConnectorDestinationPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MarketoDestinationPropertiesProperty {
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    public fun `object`(): String

    public interface Builder {
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a6696ce19e484c0477313a9b62162fd31f77a19eb504cba2440a196a77f3a0c")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty.builder()

      public override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      public override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a6696ce19e484c0477313a9b62162fd31f77a19eb504cba2440a196a77f3a0c")
      public override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty,
    ) : MarketoDestinationPropertiesProperty {
      public override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MarketoDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty):
          MarketoDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.MarketoDestinationPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScheduledTriggerPropertiesProperty {
    public fun dataPullMode(): String? = unwrap(this).getDataPullMode()

    public fun firstExecutionFrom(): Number? = unwrap(this).getFirstExecutionFrom()

    public fun flowErrorDeactivationThreshold(): Number? =
        unwrap(this).getFlowErrorDeactivationThreshold()

    public fun scheduleEndTime(): Number? = unwrap(this).getScheduleEndTime()

    public fun scheduleExpression(): String

    public fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

    public fun scheduleStartTime(): Number? = unwrap(this).getScheduleStartTime()

    public fun timeZone(): String? = unwrap(this).getTimeZone()

    public interface Builder {
      public fun dataPullMode(dataPullMode: String) {
      }

      public fun firstExecutionFrom(firstExecutionFrom: Number) {
      }

      public fun flowErrorDeactivationThreshold(flowErrorDeactivationThreshold: Number) {
      }

      public fun scheduleEndTime(scheduleEndTime: Number) {
      }

      public fun scheduleExpression(scheduleExpression: String) {
      }

      public fun scheduleOffset(scheduleOffset: Number) {
      }

      public fun scheduleStartTime(scheduleStartTime: Number) {
      }

      public fun timeZone(timeZone: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty.builder()

      public override fun dataPullMode(dataPullMode: String) {
        cdkBuilder.dataPullMode(dataPullMode)
      }

      public override fun firstExecutionFrom(firstExecutionFrom: Number) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
      }

      public override fun flowErrorDeactivationThreshold(flowErrorDeactivationThreshold: Number) {
        cdkBuilder.flowErrorDeactivationThreshold(flowErrorDeactivationThreshold)
      }

      public override fun scheduleEndTime(scheduleEndTime: Number) {
        cdkBuilder.scheduleEndTime(scheduleEndTime)
      }

      public override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public override fun scheduleOffset(scheduleOffset: Number) {
        cdkBuilder.scheduleOffset(scheduleOffset)
      }

      public override fun scheduleStartTime(scheduleStartTime: Number) {
        cdkBuilder.scheduleStartTime(scheduleStartTime)
      }

      public override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty,
    ) : ScheduledTriggerPropertiesProperty {
      public override fun dataPullMode(): String? = unwrap(this).getDataPullMode()

      public override fun firstExecutionFrom(): Number? = unwrap(this).getFirstExecutionFrom()

      public override fun flowErrorDeactivationThreshold(): Number? =
          unwrap(this).getFlowErrorDeactivationThreshold()

      public override fun scheduleEndTime(): Number? = unwrap(this).getScheduleEndTime()

      public override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

      public override fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

      public override fun scheduleStartTime(): Number? = unwrap(this).getScheduleStartTime()

      public override fun timeZone(): String? = unwrap(this).getTimeZone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ScheduledTriggerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty):
          ScheduledTriggerPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduledTriggerPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PardotSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty,
    ) : PardotSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PardotSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty):
          PardotSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PardotSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.PardotSourcePropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RedshiftDestinationPropertiesProperty {
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    public fun intermediateBucketName(): String

    public fun `object`(): String

    public interface Builder {
      public fun bucketPrefix(bucketPrefix: String) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69c476c8ac7606907a7e8c037410c0a13397d78d8bce9464038e21cadffab4aa")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun intermediateBucketName(intermediateBucketName: String) {
      }

      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty.builder()

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      public override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69c476c8ac7606907a7e8c037410c0a13397d78d8bce9464038e21cadffab4aa")
      public override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      public override fun intermediateBucketName(intermediateBucketName: String) {
        cdkBuilder.intermediateBucketName(intermediateBucketName)
      }

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty,
    ) : RedshiftDestinationPropertiesProperty {
      public override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      public override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      public override fun intermediateBucketName(): String =
          unwrap(this).getIntermediateBucketName()

      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty):
          RedshiftDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataTransferApiProperty {
    public fun name(): String

    public fun type(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty,
    ) : DataTransferApiProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataTransferApiProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty):
          DataTransferApiProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataTransferApiProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DataTransferApiProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AggregationConfigProperty {
    public fun aggregationType(): String? = unwrap(this).getAggregationType()

    public fun targetFileSize(): Number? = unwrap(this).getTargetFileSize()

    public interface Builder {
      public fun aggregationType(aggregationType: String) {
      }

      public fun targetFileSize(targetFileSize: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty.builder()

      public override fun aggregationType(aggregationType: String) {
        cdkBuilder.aggregationType(aggregationType)
      }

      public override fun targetFileSize(targetFileSize: Number) {
        cdkBuilder.targetFileSize(targetFileSize)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty,
    ) : AggregationConfigProperty {
      public override fun aggregationType(): String? = unwrap(this).getAggregationType()

      public override fun targetFileSize(): Number? = unwrap(this).getTargetFileSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AggregationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty):
          AggregationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregationConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DestinationConnectorPropertiesProperty {
    public fun customConnector(): Any? = unwrap(this).getCustomConnector()

    public fun eventBridge(): Any? = unwrap(this).getEventBridge()

    public fun lookoutMetrics(): Any? = unwrap(this).getLookoutMetrics()

    public fun marketo(): Any? = unwrap(this).getMarketo()

    public fun redshift(): Any? = unwrap(this).getRedshift()

    public fun s3(): Any? = unwrap(this).getS3()

    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    public fun sapoData(): Any? = unwrap(this).getSapoData()

    public fun snowflake(): Any? = unwrap(this).getSnowflake()

    public fun upsolver(): Any? = unwrap(this).getUpsolver()

    public fun zendesk(): Any? = unwrap(this).getZendesk()

    public interface Builder {
      public fun customConnector(customConnector: IResolvable) {
      }

      public fun customConnector(customConnector: CustomConnectorDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9d8312d795c92509bd1aa700111bbbeeb817244ec892c1d02ed54ea1abfb5d1")
      public
          fun customConnector(customConnector: CustomConnectorDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun eventBridge(eventBridge: IResolvable) {
      }

      public fun eventBridge(eventBridge: EventBridgeDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b34e938e94893dfb40c4c1efd0446115a8a121034e79d9f7a9d2a16122bd7fe5")
      public
          fun eventBridge(eventBridge: EventBridgeDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun lookoutMetrics(lookoutMetrics: IResolvable) {
      }

      public fun lookoutMetrics(lookoutMetrics: LookoutMetricsDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("232479932c4bd48b25f9e02510c369f574ed498e3257e8d35de6675d5b72c546")
      public
          fun lookoutMetrics(lookoutMetrics: LookoutMetricsDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun marketo(marketo: IResolvable) {
      }

      public fun marketo(marketo: MarketoDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb7f960e42c6343202933471ed9ab5339c32b041122e0dfbc29fe225a7e6749")
      public fun marketo(marketo: MarketoDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun redshift(redshift: IResolvable) {
      }

      public fun redshift(redshift: RedshiftDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33d66fe5ccb9f40788193c3a72e5c940bb03a9acb942bd6be1b0d2bcc2441cff")
      public fun redshift(redshift: RedshiftDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun s3(s3: IResolvable) {
      }

      public fun s3(s3: S3DestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d3461c5843a7280522435f9b17300a23f84c436a8d1455b25515501481d7477")
      public fun s3(s3: S3DestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun salesforce(salesforce: IResolvable) {
      }

      public fun salesforce(salesforce: SalesforceDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1efffefbef04c5cbf8b7d5443f2372bbec023053961bc222210a30364e79b376")
      public
          fun salesforce(salesforce: SalesforceDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun sapoData(sapoData: IResolvable) {
      }

      public fun sapoData(sapoData: SAPODataDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de7b5f9dbccba5f14b09ab028d85497fcd4ecf9714f59b00b55f144158a3b128")
      public fun sapoData(sapoData: SAPODataDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun snowflake(snowflake: IResolvable) {
      }

      public fun snowflake(snowflake: SnowflakeDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f42c1df62dbcd8eb347b0039213a7db9f4d264e01510c15ed58b993e90b2687")
      public fun snowflake(snowflake: SnowflakeDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun upsolver(upsolver: IResolvable) {
      }

      public fun upsolver(upsolver: UpsolverDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcca6f0fd0c4540433e2a7534845fc07f1c5285b6dcc8c3082832b40867bc5f2")
      public fun upsolver(upsolver: UpsolverDestinationPropertiesProperty.Builder.() -> Unit) {
      }

      public fun zendesk(zendesk: IResolvable) {
      }

      public fun zendesk(zendesk: ZendeskDestinationPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61a864d1bce6c80745238d1669d34ee7acc33e4e2e833641ee44aed229a9d6fd")
      public fun zendesk(zendesk: ZendeskDestinationPropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty.builder()

      public override fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector.let(IResolvable::unwrap))
      }

      public override
          fun customConnector(customConnector: CustomConnectorDestinationPropertiesProperty) {
        cdkBuilder.customConnector(customConnector.let(CustomConnectorDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9d8312d795c92509bd1aa700111bbbeeb817244ec892c1d02ed54ea1abfb5d1")
      public override
          fun customConnector(customConnector: CustomConnectorDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = customConnector(CustomConnectorDestinationPropertiesProperty(customConnector))

      public override fun eventBridge(eventBridge: IResolvable) {
        cdkBuilder.eventBridge(eventBridge.let(IResolvable::unwrap))
      }

      public override fun eventBridge(eventBridge: EventBridgeDestinationPropertiesProperty) {
        cdkBuilder.eventBridge(eventBridge.let(EventBridgeDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b34e938e94893dfb40c4c1efd0446115a8a121034e79d9f7a9d2a16122bd7fe5")
      public override
          fun eventBridge(eventBridge: EventBridgeDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = eventBridge(EventBridgeDestinationPropertiesProperty(eventBridge))

      public override fun lookoutMetrics(lookoutMetrics: IResolvable) {
        cdkBuilder.lookoutMetrics(lookoutMetrics.let(IResolvable::unwrap))
      }

      public override
          fun lookoutMetrics(lookoutMetrics: LookoutMetricsDestinationPropertiesProperty) {
        cdkBuilder.lookoutMetrics(lookoutMetrics.let(LookoutMetricsDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("232479932c4bd48b25f9e02510c369f574ed498e3257e8d35de6675d5b72c546")
      public override
          fun lookoutMetrics(lookoutMetrics: LookoutMetricsDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = lookoutMetrics(LookoutMetricsDestinationPropertiesProperty(lookoutMetrics))

      public override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      public override fun marketo(marketo: MarketoDestinationPropertiesProperty) {
        cdkBuilder.marketo(marketo.let(MarketoDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb7f960e42c6343202933471ed9ab5339c32b041122e0dfbc29fe225a7e6749")
      public override fun marketo(marketo: MarketoDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = marketo(MarketoDestinationPropertiesProperty(marketo))

      public override fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift.let(IResolvable::unwrap))
      }

      public override fun redshift(redshift: RedshiftDestinationPropertiesProperty) {
        cdkBuilder.redshift(redshift.let(RedshiftDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33d66fe5ccb9f40788193c3a72e5c940bb03a9acb942bd6be1b0d2bcc2441cff")
      public override
          fun redshift(redshift: RedshiftDestinationPropertiesProperty.Builder.() -> Unit): Unit =
          redshift(RedshiftDestinationPropertiesProperty(redshift))

      public override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      public override fun s3(s3: S3DestinationPropertiesProperty) {
        cdkBuilder.s3(s3.let(S3DestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d3461c5843a7280522435f9b17300a23f84c436a8d1455b25515501481d7477")
      public override fun s3(s3: S3DestinationPropertiesProperty.Builder.() -> Unit): Unit =
          s3(S3DestinationPropertiesProperty(s3))

      public override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      public override fun salesforce(salesforce: SalesforceDestinationPropertiesProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1efffefbef04c5cbf8b7d5443f2372bbec023053961bc222210a30364e79b376")
      public override
          fun salesforce(salesforce: SalesforceDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = salesforce(SalesforceDestinationPropertiesProperty(salesforce))

      public override fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData.let(IResolvable::unwrap))
      }

      public override fun sapoData(sapoData: SAPODataDestinationPropertiesProperty) {
        cdkBuilder.sapoData(sapoData.let(SAPODataDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de7b5f9dbccba5f14b09ab028d85497fcd4ecf9714f59b00b55f144158a3b128")
      public override
          fun sapoData(sapoData: SAPODataDestinationPropertiesProperty.Builder.() -> Unit): Unit =
          sapoData(SAPODataDestinationPropertiesProperty(sapoData))

      public override fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake.let(IResolvable::unwrap))
      }

      public override fun snowflake(snowflake: SnowflakeDestinationPropertiesProperty) {
        cdkBuilder.snowflake(snowflake.let(SnowflakeDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f42c1df62dbcd8eb347b0039213a7db9f4d264e01510c15ed58b993e90b2687")
      public override
          fun snowflake(snowflake: SnowflakeDestinationPropertiesProperty.Builder.() -> Unit): Unit
          = snowflake(SnowflakeDestinationPropertiesProperty(snowflake))

      public override fun upsolver(upsolver: IResolvable) {
        cdkBuilder.upsolver(upsolver.let(IResolvable::unwrap))
      }

      public override fun upsolver(upsolver: UpsolverDestinationPropertiesProperty) {
        cdkBuilder.upsolver(upsolver.let(UpsolverDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcca6f0fd0c4540433e2a7534845fc07f1c5285b6dcc8c3082832b40867bc5f2")
      public override
          fun upsolver(upsolver: UpsolverDestinationPropertiesProperty.Builder.() -> Unit): Unit =
          upsolver(UpsolverDestinationPropertiesProperty(upsolver))

      public override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      public override fun zendesk(zendesk: ZendeskDestinationPropertiesProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskDestinationPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61a864d1bce6c80745238d1669d34ee7acc33e4e2e833641ee44aed229a9d6fd")
      public override fun zendesk(zendesk: ZendeskDestinationPropertiesProperty.Builder.() -> Unit):
          Unit = zendesk(ZendeskDestinationPropertiesProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty,
    ) : DestinationConnectorPropertiesProperty {
      public override fun customConnector(): Any? = unwrap(this).getCustomConnector()

      public override fun eventBridge(): Any? = unwrap(this).getEventBridge()

      public override fun lookoutMetrics(): Any? = unwrap(this).getLookoutMetrics()

      public override fun marketo(): Any? = unwrap(this).getMarketo()

      public override fun redshift(): Any? = unwrap(this).getRedshift()

      public override fun s3(): Any? = unwrap(this).getS3()

      public override fun salesforce(): Any? = unwrap(this).getSalesforce()

      public override fun sapoData(): Any? = unwrap(this).getSapoData()

      public override fun snowflake(): Any? = unwrap(this).getSnowflake()

      public override fun upsolver(): Any? = unwrap(this).getUpsolver()

      public override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DestinationConnectorPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty):
          DestinationConnectorPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConnectorPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SalesforceDestinationPropertiesProperty {
    public fun dataTransferApi(): String? = unwrap(this).getDataTransferApi()

    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    public fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

    public fun `object`(): String

    public fun writeOperationType(): String? = unwrap(this).getWriteOperationType()

    public interface Builder {
      public fun dataTransferApi(dataTransferApi: String) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7263d88d867b8b622c56e4577709b678489a18eaa640833a1d434943b3e542")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun idFieldNames(idFieldNames: List<String>) {
      }

      public fun `object`(`object`: String) {
      }

      public fun writeOperationType(writeOperationType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty.builder()

      public override fun dataTransferApi(dataTransferApi: String) {
        cdkBuilder.dataTransferApi(dataTransferApi)
      }

      public override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      public override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7263d88d867b8b622c56e4577709b678489a18eaa640833a1d434943b3e542")
      public override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      public override fun idFieldNames(idFieldNames: List<String>) {
        cdkBuilder.idFieldNames(idFieldNames)
      }

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public override fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty,
    ) : SalesforceDestinationPropertiesProperty {
      public override fun dataTransferApi(): String? = unwrap(this).getDataTransferApi()

      public override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      public override fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?:
          emptyList()

      public override fun `object`(): String = unwrap(this).getObject()

      public override fun writeOperationType(): String? = unwrap(this).getWriteOperationType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty):
          SalesforceDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface GoogleAnalyticsSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty,
    ) : GoogleAnalyticsSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          GoogleAnalyticsSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty):
          GoogleAnalyticsSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GoogleAnalyticsSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.GoogleAnalyticsSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceFlowConfigProperty {
    public fun apiVersion(): String? = unwrap(this).getApiVersion()

    public fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

    public fun connectorType(): String

    public fun incrementalPullConfig(): Any? = unwrap(this).getIncrementalPullConfig()

    public fun sourceConnectorProperties(): Any

    public interface Builder {
      public fun apiVersion(apiVersion: String) {
      }

      public fun connectorProfileName(connectorProfileName: String) {
      }

      public fun connectorType(connectorType: String) {
      }

      public fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
      }

      public fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7425cac1d5558f115d9fc3eeeacd87f8d513adb94f5094b221205eaae961401d")
      public
          fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty.Builder.() -> Unit) {
      }

      public fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
      }

      public
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9cbcc2ec69f36b65cb3ccc5bd0e8539fc977a4da0de1424d3bc85aad98ab7589")
      public
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty.builder()

      public override fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
      }

      public override fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
      }

      public override fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
      }

      public override fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig.let(IResolvable::unwrap))
      }

      public override
          fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig.let(IncrementalPullConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7425cac1d5558f115d9fc3eeeacd87f8d513adb94f5094b221205eaae961401d")
      public override
          fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty.Builder.() -> Unit):
          Unit = incrementalPullConfig(IncrementalPullConfigProperty(incrementalPullConfig))

      public override fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties.let(IResolvable::unwrap))
      }

      public override
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties.let(SourceConnectorPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9cbcc2ec69f36b65cb3ccc5bd0e8539fc977a4da0de1424d3bc85aad98ab7589")
      public override
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty.Builder.() -> Unit):
          Unit =
          sourceConnectorProperties(SourceConnectorPropertiesProperty(sourceConnectorProperties))

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty,
    ) : SourceFlowConfigProperty {
      public override fun apiVersion(): String? = unwrap(this).getApiVersion()

      public override fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

      public override fun connectorType(): String = unwrap(this).getConnectorType()

      public override fun incrementalPullConfig(): Any? = unwrap(this).getIncrementalPullConfig()

      public override fun sourceConnectorProperties(): Any =
          unwrap(this).getSourceConnectorProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceFlowConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty):
          SourceFlowConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceFlowConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SalesforceSourcePropertiesProperty {
    public fun dataTransferApi(): String? = unwrap(this).getDataTransferApi()

    public fun enableDynamicFieldUpdate(): Any? = unwrap(this).getEnableDynamicFieldUpdate()

    public fun includeDeletedRecords(): Any? = unwrap(this).getIncludeDeletedRecords()

    public fun `object`(): String

    public interface Builder {
      public fun dataTransferApi(dataTransferApi: String) {
      }

      public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean) {
      }

      public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable) {
      }

      public fun includeDeletedRecords(includeDeletedRecords: Boolean) {
      }

      public fun includeDeletedRecords(includeDeletedRecords: IResolvable) {
      }

      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty.builder()

      public override fun dataTransferApi(dataTransferApi: String) {
        cdkBuilder.dataTransferApi(dataTransferApi)
      }

      public override fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
      }

      public override fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable) {
        cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate.let(IResolvable::unwrap))
      }

      public override fun includeDeletedRecords(includeDeletedRecords: Boolean) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords)
      }

      public override fun includeDeletedRecords(includeDeletedRecords: IResolvable) {
        cdkBuilder.includeDeletedRecords(includeDeletedRecords.let(IResolvable::unwrap))
      }

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty,
    ) : SalesforceSourcePropertiesProperty {
      public override fun dataTransferApi(): String? = unwrap(this).getDataTransferApi()

      public override fun enableDynamicFieldUpdate(): Any? =
          unwrap(this).getEnableDynamicFieldUpdate()

      public override fun includeDeletedRecords(): Any? = unwrap(this).getIncludeDeletedRecords()

      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty):
          SalesforceSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SalesforceSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TriggerConfigProperty {
    public fun triggerProperties(): Any? = unwrap(this).getTriggerProperties()

    public fun triggerType(): String

    public interface Builder {
      public fun triggerProperties(triggerProperties: IResolvable) {
      }

      public fun triggerProperties(triggerProperties: ScheduledTriggerPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c76fa0bed44d3944999469fd8cd418aabb485e72ca02b7e619160a121612d55c")
      public
          fun triggerProperties(triggerProperties: ScheduledTriggerPropertiesProperty.Builder.() -> Unit) {
      }

      public fun triggerType(triggerType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty.builder()

      public override fun triggerProperties(triggerProperties: IResolvable) {
        cdkBuilder.triggerProperties(triggerProperties.let(IResolvable::unwrap))
      }

      public override fun triggerProperties(triggerProperties: ScheduledTriggerPropertiesProperty) {
        cdkBuilder.triggerProperties(triggerProperties.let(ScheduledTriggerPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c76fa0bed44d3944999469fd8cd418aabb485e72ca02b7e619160a121612d55c")
      public override
          fun triggerProperties(triggerProperties: ScheduledTriggerPropertiesProperty.Builder.() -> Unit):
          Unit = triggerProperties(ScheduledTriggerPropertiesProperty(triggerProperties))

      public override fun triggerType(triggerType: String) {
        cdkBuilder.triggerType(triggerType)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty,
    ) : TriggerConfigProperty {
      public override fun triggerProperties(): Any? = unwrap(this).getTriggerProperties()

      public override fun triggerType(): String = unwrap(this).getTriggerType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty):
          TriggerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.TriggerConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SuccessResponseHandlingConfigProperty {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketPrefix(bucketPrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty,
    ) : SuccessResponseHandlingConfigProperty {
      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SuccessResponseHandlingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty):
          SuccessResponseHandlingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuccessResponseHandlingConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SuccessResponseHandlingConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectorOperatorProperty {
    public fun amplitude(): String? = unwrap(this).getAmplitude()

    public fun customConnector(): String? = unwrap(this).getCustomConnector()

    public fun datadog(): String? = unwrap(this).getDatadog()

    public fun dynatrace(): String? = unwrap(this).getDynatrace()

    public fun googleAnalytics(): String? = unwrap(this).getGoogleAnalytics()

    public fun inforNexus(): String? = unwrap(this).getInforNexus()

    public fun marketo(): String? = unwrap(this).getMarketo()

    public fun pardot(): String? = unwrap(this).getPardot()

    public fun s3(): String? = unwrap(this).getS3()

    public fun salesforce(): String? = unwrap(this).getSalesforce()

    public fun sapoData(): String? = unwrap(this).getSapoData()

    public fun serviceNow(): String? = unwrap(this).getServiceNow()

    public fun singular(): String? = unwrap(this).getSingular()

    public fun slack(): String? = unwrap(this).getSlack()

    public fun trendmicro(): String? = unwrap(this).getTrendmicro()

    public fun veeva(): String? = unwrap(this).getVeeva()

    public fun zendesk(): String? = unwrap(this).getZendesk()

    public interface Builder {
      public fun amplitude(amplitude: String) {
      }

      public fun customConnector(customConnector: String) {
      }

      public fun datadog(datadog: String) {
      }

      public fun dynatrace(dynatrace: String) {
      }

      public fun googleAnalytics(googleAnalytics: String) {
      }

      public fun inforNexus(inforNexus: String) {
      }

      public fun marketo(marketo: String) {
      }

      public fun pardot(pardot: String) {
      }

      public fun s3(s3: String) {
      }

      public fun salesforce(salesforce: String) {
      }

      public fun sapoData(sapoData: String) {
      }

      public fun serviceNow(serviceNow: String) {
      }

      public fun singular(singular: String) {
      }

      public fun slack(slack: String) {
      }

      public fun trendmicro(trendmicro: String) {
      }

      public fun veeva(veeva: String) {
      }

      public fun zendesk(zendesk: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty.builder()

      public override fun amplitude(amplitude: String) {
        cdkBuilder.amplitude(amplitude)
      }

      public override fun customConnector(customConnector: String) {
        cdkBuilder.customConnector(customConnector)
      }

      public override fun datadog(datadog: String) {
        cdkBuilder.datadog(datadog)
      }

      public override fun dynatrace(dynatrace: String) {
        cdkBuilder.dynatrace(dynatrace)
      }

      public override fun googleAnalytics(googleAnalytics: String) {
        cdkBuilder.googleAnalytics(googleAnalytics)
      }

      public override fun inforNexus(inforNexus: String) {
        cdkBuilder.inforNexus(inforNexus)
      }

      public override fun marketo(marketo: String) {
        cdkBuilder.marketo(marketo)
      }

      public override fun pardot(pardot: String) {
        cdkBuilder.pardot(pardot)
      }

      public override fun s3(s3: String) {
        cdkBuilder.s3(s3)
      }

      public override fun salesforce(salesforce: String) {
        cdkBuilder.salesforce(salesforce)
      }

      public override fun sapoData(sapoData: String) {
        cdkBuilder.sapoData(sapoData)
      }

      public override fun serviceNow(serviceNow: String) {
        cdkBuilder.serviceNow(serviceNow)
      }

      public override fun singular(singular: String) {
        cdkBuilder.singular(singular)
      }

      public override fun slack(slack: String) {
        cdkBuilder.slack(slack)
      }

      public override fun trendmicro(trendmicro: String) {
        cdkBuilder.trendmicro(trendmicro)
      }

      public override fun veeva(veeva: String) {
        cdkBuilder.veeva(veeva)
      }

      public override fun zendesk(zendesk: String) {
        cdkBuilder.zendesk(zendesk)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty,
    ) : ConnectorOperatorProperty {
      public override fun amplitude(): String? = unwrap(this).getAmplitude()

      public override fun customConnector(): String? = unwrap(this).getCustomConnector()

      public override fun datadog(): String? = unwrap(this).getDatadog()

      public override fun dynatrace(): String? = unwrap(this).getDynatrace()

      public override fun googleAnalytics(): String? = unwrap(this).getGoogleAnalytics()

      public override fun inforNexus(): String? = unwrap(this).getInforNexus()

      public override fun marketo(): String? = unwrap(this).getMarketo()

      public override fun pardot(): String? = unwrap(this).getPardot()

      public override fun s3(): String? = unwrap(this).getS3()

      public override fun salesforce(): String? = unwrap(this).getSalesforce()

      public override fun sapoData(): String? = unwrap(this).getSapoData()

      public override fun serviceNow(): String? = unwrap(this).getServiceNow()

      public override fun singular(): String? = unwrap(this).getSingular()

      public override fun slack(): String? = unwrap(this).getSlack()

      public override fun trendmicro(): String? = unwrap(this).getTrendmicro()

      public override fun veeva(): String? = unwrap(this).getVeeva()

      public override fun zendesk(): String? = unwrap(this).getZendesk()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorOperatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty):
          ConnectorOperatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorOperatorProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ConnectorOperatorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SourceConnectorPropertiesProperty {
    public fun amplitude(): Any? = unwrap(this).getAmplitude()

    public fun customConnector(): Any? = unwrap(this).getCustomConnector()

    public fun datadog(): Any? = unwrap(this).getDatadog()

    public fun dynatrace(): Any? = unwrap(this).getDynatrace()

    public fun googleAnalytics(): Any? = unwrap(this).getGoogleAnalytics()

    public fun inforNexus(): Any? = unwrap(this).getInforNexus()

    public fun marketo(): Any? = unwrap(this).getMarketo()

    public fun pardot(): Any? = unwrap(this).getPardot()

    public fun s3(): Any? = unwrap(this).getS3()

    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    public fun sapoData(): Any? = unwrap(this).getSapoData()

    public fun serviceNow(): Any? = unwrap(this).getServiceNow()

    public fun singular(): Any? = unwrap(this).getSingular()

    public fun slack(): Any? = unwrap(this).getSlack()

    public fun trendmicro(): Any? = unwrap(this).getTrendmicro()

    public fun veeva(): Any? = unwrap(this).getVeeva()

    public fun zendesk(): Any? = unwrap(this).getZendesk()

    public interface Builder {
      public fun amplitude(amplitude: IResolvable) {
      }

      public fun amplitude(amplitude: AmplitudeSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb35f6b9258846219cd95dafd31c938237d36e4ce3a1556c95a1d6aecd0e685d")
      public fun amplitude(amplitude: AmplitudeSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun customConnector(customConnector: IResolvable) {
      }

      public fun customConnector(customConnector: CustomConnectorSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892af92fbdf6bc58ec0347a2a82efb97c7554f89ec0313e8decd22eeca6a8347")
      public
          fun customConnector(customConnector: CustomConnectorSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun datadog(datadog: IResolvable) {
      }

      public fun datadog(datadog: DatadogSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76208df19bab6e17a6e8a02e32038b136a2a9b7a69c47685c80a73e5c6425241")
      public fun datadog(datadog: DatadogSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun dynatrace(dynatrace: IResolvable) {
      }

      public fun dynatrace(dynatrace: DynatraceSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1445c43826d94c7ef49bb243f14573a49dcff09184d1efdeda0b496c44189aa")
      public fun dynatrace(dynatrace: DynatraceSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun googleAnalytics(googleAnalytics: IResolvable) {
      }

      public fun googleAnalytics(googleAnalytics: GoogleAnalyticsSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5188ec0577ffd946c7ef76fbbe4f2e23ad8a539bc7a32ecfc9b4e91bcfbba003")
      public
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun inforNexus(inforNexus: IResolvable) {
      }

      public fun inforNexus(inforNexus: InforNexusSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84905cc9ed238b015f19c3f2d8cfa80479df95f8d3c59443545e1ab0361bc716")
      public fun inforNexus(inforNexus: InforNexusSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun marketo(marketo: IResolvable) {
      }

      public fun marketo(marketo: MarketoSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eac2e3a380aeb37be1d0995732bab83aa975dc082f8bc73343b5b65fd09261d0")
      public fun marketo(marketo: MarketoSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun pardot(pardot: IResolvable) {
      }

      public fun pardot(pardot: PardotSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ab87924ab88f72615053e95eb607abb84ac3c261242a3f125f529982e3dd5b")
      public fun pardot(pardot: PardotSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun s3(s3: IResolvable) {
      }

      public fun s3(s3: S3SourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16b7a1f4c984c583213c54000d598d8f8380fc3c6d89a43bdb8c55b6b2ffc76f")
      public fun s3(s3: S3SourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun salesforce(salesforce: IResolvable) {
      }

      public fun salesforce(salesforce: SalesforceSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84e751dbcc66ddddff42ae7200a0ed44711f742d4dfe05bf70c561b8114859ad")
      public fun salesforce(salesforce: SalesforceSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun sapoData(sapoData: IResolvable) {
      }

      public fun sapoData(sapoData: SAPODataSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a91720667417ba79f50c8a6a05f832fc8455bdcf61489a13ee475a30fde1898b")
      public fun sapoData(sapoData: SAPODataSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun serviceNow(serviceNow: IResolvable) {
      }

      public fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12b7a21810002ad5992a3ab65c20388543a23a79848ae6db912cb4035142695f")
      public fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun singular(singular: IResolvable) {
      }

      public fun singular(singular: SingularSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64c9d9db11035899e00f8dfeb0ccd08f8dc0169446816393aef91944bb0ca885")
      public fun singular(singular: SingularSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun slack(slack: IResolvable) {
      }

      public fun slack(slack: SlackSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("076829098515df6edb64e0f5c9236f65e86ee4970592d3b082bf5e2197cfbbbc")
      public fun slack(slack: SlackSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun trendmicro(trendmicro: IResolvable) {
      }

      public fun trendmicro(trendmicro: TrendmicroSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1af1b3f8977ca1403cdaea86cbe2044fdc85d748515000d7070bb0dc50d878da")
      public fun trendmicro(trendmicro: TrendmicroSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun veeva(veeva: IResolvable) {
      }

      public fun veeva(veeva: VeevaSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646d9699b47c49c070682ffdb3e12c7342a1999f206204935b8cd2d430eb854b")
      public fun veeva(veeva: VeevaSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun zendesk(zendesk: IResolvable) {
      }

      public fun zendesk(zendesk: ZendeskSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95326e224b4f1217bf7962e047c13e31d49b9488908b39bd4918c5743554e103")
      public fun zendesk(zendesk: ZendeskSourcePropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty.builder()

      public override fun amplitude(amplitude: IResolvable) {
        cdkBuilder.amplitude(amplitude.let(IResolvable::unwrap))
      }

      public override fun amplitude(amplitude: AmplitudeSourcePropertiesProperty) {
        cdkBuilder.amplitude(amplitude.let(AmplitudeSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb35f6b9258846219cd95dafd31c938237d36e4ce3a1556c95a1d6aecd0e685d")
      public override
          fun amplitude(amplitude: AmplitudeSourcePropertiesProperty.Builder.() -> Unit): Unit =
          amplitude(AmplitudeSourcePropertiesProperty(amplitude))

      public override fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector.let(IResolvable::unwrap))
      }

      public override
          fun customConnector(customConnector: CustomConnectorSourcePropertiesProperty) {
        cdkBuilder.customConnector(customConnector.let(CustomConnectorSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("892af92fbdf6bc58ec0347a2a82efb97c7554f89ec0313e8decd22eeca6a8347")
      public override
          fun customConnector(customConnector: CustomConnectorSourcePropertiesProperty.Builder.() -> Unit):
          Unit = customConnector(CustomConnectorSourcePropertiesProperty(customConnector))

      public override fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog.let(IResolvable::unwrap))
      }

      public override fun datadog(datadog: DatadogSourcePropertiesProperty) {
        cdkBuilder.datadog(datadog.let(DatadogSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76208df19bab6e17a6e8a02e32038b136a2a9b7a69c47685c80a73e5c6425241")
      public override fun datadog(datadog: DatadogSourcePropertiesProperty.Builder.() -> Unit): Unit
          = datadog(DatadogSourcePropertiesProperty(datadog))

      public override fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace.let(IResolvable::unwrap))
      }

      public override fun dynatrace(dynatrace: DynatraceSourcePropertiesProperty) {
        cdkBuilder.dynatrace(dynatrace.let(DynatraceSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b1445c43826d94c7ef49bb243f14573a49dcff09184d1efdeda0b496c44189aa")
      public override
          fun dynatrace(dynatrace: DynatraceSourcePropertiesProperty.Builder.() -> Unit): Unit =
          dynatrace(DynatraceSourcePropertiesProperty(dynatrace))

      public override fun googleAnalytics(googleAnalytics: IResolvable) {
        cdkBuilder.googleAnalytics(googleAnalytics.let(IResolvable::unwrap))
      }

      public override
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsSourcePropertiesProperty) {
        cdkBuilder.googleAnalytics(googleAnalytics.let(GoogleAnalyticsSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5188ec0577ffd946c7ef76fbbe4f2e23ad8a539bc7a32ecfc9b4e91bcfbba003")
      public override
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsSourcePropertiesProperty.Builder.() -> Unit):
          Unit = googleAnalytics(GoogleAnalyticsSourcePropertiesProperty(googleAnalytics))

      public override fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus.let(IResolvable::unwrap))
      }

      public override fun inforNexus(inforNexus: InforNexusSourcePropertiesProperty) {
        cdkBuilder.inforNexus(inforNexus.let(InforNexusSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84905cc9ed238b015f19c3f2d8cfa80479df95f8d3c59443545e1ab0361bc716")
      public override
          fun inforNexus(inforNexus: InforNexusSourcePropertiesProperty.Builder.() -> Unit): Unit =
          inforNexus(InforNexusSourcePropertiesProperty(inforNexus))

      public override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      public override fun marketo(marketo: MarketoSourcePropertiesProperty) {
        cdkBuilder.marketo(marketo.let(MarketoSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eac2e3a380aeb37be1d0995732bab83aa975dc082f8bc73343b5b65fd09261d0")
      public override fun marketo(marketo: MarketoSourcePropertiesProperty.Builder.() -> Unit): Unit
          = marketo(MarketoSourcePropertiesProperty(marketo))

      public override fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot.let(IResolvable::unwrap))
      }

      public override fun pardot(pardot: PardotSourcePropertiesProperty) {
        cdkBuilder.pardot(pardot.let(PardotSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24ab87924ab88f72615053e95eb607abb84ac3c261242a3f125f529982e3dd5b")
      public override fun pardot(pardot: PardotSourcePropertiesProperty.Builder.() -> Unit): Unit =
          pardot(PardotSourcePropertiesProperty(pardot))

      public override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      public override fun s3(s3: S3SourcePropertiesProperty) {
        cdkBuilder.s3(s3.let(S3SourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16b7a1f4c984c583213c54000d598d8f8380fc3c6d89a43bdb8c55b6b2ffc76f")
      public override fun s3(s3: S3SourcePropertiesProperty.Builder.() -> Unit): Unit =
          s3(S3SourcePropertiesProperty(s3))

      public override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      public override fun salesforce(salesforce: SalesforceSourcePropertiesProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84e751dbcc66ddddff42ae7200a0ed44711f742d4dfe05bf70c561b8114859ad")
      public override
          fun salesforce(salesforce: SalesforceSourcePropertiesProperty.Builder.() -> Unit): Unit =
          salesforce(SalesforceSourcePropertiesProperty(salesforce))

      public override fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData.let(IResolvable::unwrap))
      }

      public override fun sapoData(sapoData: SAPODataSourcePropertiesProperty) {
        cdkBuilder.sapoData(sapoData.let(SAPODataSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a91720667417ba79f50c8a6a05f832fc8455bdcf61489a13ee475a30fde1898b")
      public override fun sapoData(sapoData: SAPODataSourcePropertiesProperty.Builder.() -> Unit):
          Unit = sapoData(SAPODataSourcePropertiesProperty(sapoData))

      public override fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow.let(IResolvable::unwrap))
      }

      public override fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow.let(ServiceNowSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12b7a21810002ad5992a3ab65c20388543a23a79848ae6db912cb4035142695f")
      public override
          fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty.Builder.() -> Unit): Unit =
          serviceNow(ServiceNowSourcePropertiesProperty(serviceNow))

      public override fun singular(singular: IResolvable) {
        cdkBuilder.singular(singular.let(IResolvable::unwrap))
      }

      public override fun singular(singular: SingularSourcePropertiesProperty) {
        cdkBuilder.singular(singular.let(SingularSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64c9d9db11035899e00f8dfeb0ccd08f8dc0169446816393aef91944bb0ca885")
      public override fun singular(singular: SingularSourcePropertiesProperty.Builder.() -> Unit):
          Unit = singular(SingularSourcePropertiesProperty(singular))

      public override fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack.let(IResolvable::unwrap))
      }

      public override fun slack(slack: SlackSourcePropertiesProperty) {
        cdkBuilder.slack(slack.let(SlackSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("076829098515df6edb64e0f5c9236f65e86ee4970592d3b082bf5e2197cfbbbc")
      public override fun slack(slack: SlackSourcePropertiesProperty.Builder.() -> Unit): Unit =
          slack(SlackSourcePropertiesProperty(slack))

      public override fun trendmicro(trendmicro: IResolvable) {
        cdkBuilder.trendmicro(trendmicro.let(IResolvable::unwrap))
      }

      public override fun trendmicro(trendmicro: TrendmicroSourcePropertiesProperty) {
        cdkBuilder.trendmicro(trendmicro.let(TrendmicroSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1af1b3f8977ca1403cdaea86cbe2044fdc85d748515000d7070bb0dc50d878da")
      public override
          fun trendmicro(trendmicro: TrendmicroSourcePropertiesProperty.Builder.() -> Unit): Unit =
          trendmicro(TrendmicroSourcePropertiesProperty(trendmicro))

      public override fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva.let(IResolvable::unwrap))
      }

      public override fun veeva(veeva: VeevaSourcePropertiesProperty) {
        cdkBuilder.veeva(veeva.let(VeevaSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("646d9699b47c49c070682ffdb3e12c7342a1999f206204935b8cd2d430eb854b")
      public override fun veeva(veeva: VeevaSourcePropertiesProperty.Builder.() -> Unit): Unit =
          veeva(VeevaSourcePropertiesProperty(veeva))

      public override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      public override fun zendesk(zendesk: ZendeskSourcePropertiesProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95326e224b4f1217bf7962e047c13e31d49b9488908b39bd4918c5743554e103")
      public override fun zendesk(zendesk: ZendeskSourcePropertiesProperty.Builder.() -> Unit): Unit
          = zendesk(ZendeskSourcePropertiesProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty,
    ) : SourceConnectorPropertiesProperty {
      public override fun amplitude(): Any? = unwrap(this).getAmplitude()

      public override fun customConnector(): Any? = unwrap(this).getCustomConnector()

      public override fun datadog(): Any? = unwrap(this).getDatadog()

      public override fun dynatrace(): Any? = unwrap(this).getDynatrace()

      public override fun googleAnalytics(): Any? = unwrap(this).getGoogleAnalytics()

      public override fun inforNexus(): Any? = unwrap(this).getInforNexus()

      public override fun marketo(): Any? = unwrap(this).getMarketo()

      public override fun pardot(): Any? = unwrap(this).getPardot()

      public override fun s3(): Any? = unwrap(this).getS3()

      public override fun salesforce(): Any? = unwrap(this).getSalesforce()

      public override fun sapoData(): Any? = unwrap(this).getSapoData()

      public override fun serviceNow(): Any? = unwrap(this).getServiceNow()

      public override fun singular(): Any? = unwrap(this).getSingular()

      public override fun slack(): Any? = unwrap(this).getSlack()

      public override fun trendmicro(): Any? = unwrap(this).getTrendmicro()

      public override fun veeva(): Any? = unwrap(this).getVeeva()

      public override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SourceConnectorPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty):
          SourceConnectorPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConnectorPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UpsolverDestinationPropertiesProperty {
    public fun bucketName(): String

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun s3OutputFormatConfig(): Any

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketPrefix(bucketPrefix: String) {
      }

      public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
      }

      public fun s3OutputFormatConfig(s3OutputFormatConfig: UpsolverS3OutputFormatConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78dc8df17f3259b10b67973a50f45ac02be70e3fe12a4b021c6f6142acad43fb")
      public
          fun s3OutputFormatConfig(s3OutputFormatConfig: UpsolverS3OutputFormatConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public override fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig.let(IResolvable::unwrap))
      }

      public override
          fun s3OutputFormatConfig(s3OutputFormatConfig: UpsolverS3OutputFormatConfigProperty) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig.let(UpsolverS3OutputFormatConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78dc8df17f3259b10b67973a50f45ac02be70e3fe12a4b021c6f6142acad43fb")
      public override
          fun s3OutputFormatConfig(s3OutputFormatConfig: UpsolverS3OutputFormatConfigProperty.Builder.() -> Unit):
          Unit = s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty(s3OutputFormatConfig))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty,
    ) : UpsolverDestinationPropertiesProperty {
      public override fun bucketName(): String = unwrap(this).getBucketName()

      public override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      public override fun s3OutputFormatConfig(): Any = unwrap(this).getS3OutputFormatConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpsolverDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty):
          UpsolverDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpsolverDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SAPODataPaginationConfigProperty {
    public fun maxPageSize(): Number

    public interface Builder {
      public fun maxPageSize(maxPageSize: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty.builder()

      public override fun maxPageSize(maxPageSize: Number) {
        cdkBuilder.maxPageSize(maxPageSize)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty,
    ) : SAPODataPaginationConfigProperty {
      public override fun maxPageSize(): Number = unwrap(this).getMaxPageSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SAPODataPaginationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty):
          SAPODataPaginationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataPaginationConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataPaginationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetadataCatalogConfigProperty {
    public fun glueDataCatalog(): Any? = unwrap(this).getGlueDataCatalog()

    public interface Builder {
      public fun glueDataCatalog(glueDataCatalog: IResolvable) {
      }

      public fun glueDataCatalog(glueDataCatalog: GlueDataCatalogProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d03272fda4f639d1966ee835a77c0951c3b8ecd7142f46054faa44cc8f1f5ee")
      public fun glueDataCatalog(glueDataCatalog: GlueDataCatalogProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty.builder()

      public override fun glueDataCatalog(glueDataCatalog: IResolvable) {
        cdkBuilder.glueDataCatalog(glueDataCatalog.let(IResolvable::unwrap))
      }

      public override fun glueDataCatalog(glueDataCatalog: GlueDataCatalogProperty) {
        cdkBuilder.glueDataCatalog(glueDataCatalog.let(GlueDataCatalogProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d03272fda4f639d1966ee835a77c0951c3b8ecd7142f46054faa44cc8f1f5ee")
      public override
          fun glueDataCatalog(glueDataCatalog: GlueDataCatalogProperty.Builder.() -> Unit): Unit =
          glueDataCatalog(GlueDataCatalogProperty(glueDataCatalog))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty,
    ) : MetadataCatalogConfigProperty {
      public override fun glueDataCatalog(): Any? = unwrap(this).getGlueDataCatalog()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataCatalogConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty):
          MetadataCatalogConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataCatalogConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.MetadataCatalogConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ZendeskDestinationPropertiesProperty {
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    public fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

    public fun `object`(): String

    public fun writeOperationType(): String? = unwrap(this).getWriteOperationType()

    public interface Builder {
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19658d5aec2c4972f43d129840676abb1a24cc44fe7dcf88f439dedd406604a6")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun idFieldNames(idFieldNames: List<String>) {
      }

      public fun `object`(`object`: String) {
      }

      public fun writeOperationType(writeOperationType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty.builder()

      public override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      public override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("19658d5aec2c4972f43d129840676abb1a24cc44fe7dcf88f439dedd406604a6")
      public override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      public override fun idFieldNames(idFieldNames: List<String>) {
        cdkBuilder.idFieldNames(idFieldNames)
      }

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public override fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty,
    ) : ZendeskDestinationPropertiesProperty {
      public override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      public override fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?:
          emptyList()

      public override fun `object`(): String = unwrap(this).getObject()

      public override fun writeOperationType(): String? = unwrap(this).getWriteOperationType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZendeskDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty):
          ZendeskDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3SourcePropertiesProperty {
    public fun bucketName(): String

    public fun bucketPrefix(): String

    public fun s3InputFormatConfig(): Any? = unwrap(this).getS3InputFormatConfig()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketPrefix(bucketPrefix: String) {
      }

      public fun s3InputFormatConfig(s3InputFormatConfig: IResolvable) {
      }

      public fun s3InputFormatConfig(s3InputFormatConfig: S3InputFormatConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb960761c4562e4c834f462f61e54872b320143be2d33df8bdfde92e5f0a21e4")
      public
          fun s3InputFormatConfig(s3InputFormatConfig: S3InputFormatConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public override fun s3InputFormatConfig(s3InputFormatConfig: IResolvable) {
        cdkBuilder.s3InputFormatConfig(s3InputFormatConfig.let(IResolvable::unwrap))
      }

      public override fun s3InputFormatConfig(s3InputFormatConfig: S3InputFormatConfigProperty) {
        cdkBuilder.s3InputFormatConfig(s3InputFormatConfig.let(S3InputFormatConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb960761c4562e4c834f462f61e54872b320143be2d33df8bdfde92e5f0a21e4")
      public override
          fun s3InputFormatConfig(s3InputFormatConfig: S3InputFormatConfigProperty.Builder.() -> Unit):
          Unit = s3InputFormatConfig(S3InputFormatConfigProperty(s3InputFormatConfig))

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty,
    ) : S3SourcePropertiesProperty {
      public override fun bucketName(): String = unwrap(this).getBucketName()

      public override fun bucketPrefix(): String = unwrap(this).getBucketPrefix()

      public override fun s3InputFormatConfig(): Any? = unwrap(this).getS3InputFormatConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3SourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty):
          S3SourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SAPODataDestinationPropertiesProperty {
    public fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

    public fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?: emptyList()

    public fun objectPath(): String

    public fun successResponseHandlingConfig(): Any? =
        unwrap(this).getSuccessResponseHandlingConfig()

    public fun writeOperationType(): String? = unwrap(this).getWriteOperationType()

    public interface Builder {
      public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
      }

      public fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b1ebf97a8755f2bbd6a3b4610cbd0742c3888da56891f8c467483acb9af9d93")
      public
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun idFieldNames(idFieldNames: List<String>) {
      }

      public fun objectPath(objectPath: String) {
      }

      public fun successResponseHandlingConfig(successResponseHandlingConfig: IResolvable) {
      }

      public
          fun successResponseHandlingConfig(successResponseHandlingConfig: SuccessResponseHandlingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c586ef71d6492fd06ce2f139e53052625bdb41f61e404731befee55737bf4c9")
      public
          fun successResponseHandlingConfig(successResponseHandlingConfig: SuccessResponseHandlingConfigProperty.Builder.() -> Unit) {
      }

      public fun writeOperationType(writeOperationType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty.builder()

      public override fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(IResolvable::unwrap))
      }

      public override fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig.let(ErrorHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b1ebf97a8755f2bbd6a3b4610cbd0742c3888da56891f8c467483acb9af9d93")
      public override
          fun errorHandlingConfig(errorHandlingConfig: ErrorHandlingConfigProperty.Builder.() -> Unit):
          Unit = errorHandlingConfig(ErrorHandlingConfigProperty(errorHandlingConfig))

      public override fun idFieldNames(idFieldNames: List<String>) {
        cdkBuilder.idFieldNames(idFieldNames)
      }

      public override fun objectPath(objectPath: String) {
        cdkBuilder.objectPath(objectPath)
      }

      public override
          fun successResponseHandlingConfig(successResponseHandlingConfig: IResolvable) {
        cdkBuilder.successResponseHandlingConfig(successResponseHandlingConfig.let(IResolvable::unwrap))
      }

      public override
          fun successResponseHandlingConfig(successResponseHandlingConfig: SuccessResponseHandlingConfigProperty) {
        cdkBuilder.successResponseHandlingConfig(successResponseHandlingConfig.let(SuccessResponseHandlingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c586ef71d6492fd06ce2f139e53052625bdb41f61e404731befee55737bf4c9")
      public override
          fun successResponseHandlingConfig(successResponseHandlingConfig: SuccessResponseHandlingConfigProperty.Builder.() -> Unit):
          Unit =
          successResponseHandlingConfig(SuccessResponseHandlingConfigProperty(successResponseHandlingConfig))

      public override fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty,
    ) : SAPODataDestinationPropertiesProperty {
      public override fun errorHandlingConfig(): Any? = unwrap(this).getErrorHandlingConfig()

      public override fun idFieldNames(): List<String> = unwrap(this).getIdFieldNames() ?:
          emptyList()

      public override fun objectPath(): String = unwrap(this).getObjectPath()

      public override fun successResponseHandlingConfig(): Any? =
          unwrap(this).getSuccessResponseHandlingConfig()

      public override fun writeOperationType(): String? = unwrap(this).getWriteOperationType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SAPODataDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty):
          SAPODataDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataDestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SAPODataDestinationPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ErrorHandlingConfigProperty {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun failOnFirstError(): Any? = unwrap(this).getFailOnFirstError()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketPrefix(bucketPrefix: String) {
      }

      public fun failOnFirstError(failOnFirstError: Boolean) {
      }

      public fun failOnFirstError(failOnFirstError: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public override fun failOnFirstError(failOnFirstError: Boolean) {
        cdkBuilder.failOnFirstError(failOnFirstError)
      }

      public override fun failOnFirstError(failOnFirstError: IResolvable) {
        cdkBuilder.failOnFirstError(failOnFirstError.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty,
    ) : ErrorHandlingConfigProperty {
      public override fun bucketName(): String? = unwrap(this).getBucketName()

      public override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      public override fun failOnFirstError(): Any? = unwrap(this).getFailOnFirstError()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorHandlingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty):
          ErrorHandlingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorHandlingConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SlackSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty,
    ) : SlackSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlackSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty):
          SlackSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlackSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SlackSourcePropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InforNexusSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty,
    ) : InforNexusSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InforNexusSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty):
          InforNexusSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InforNexusSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.InforNexusSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3OutputFormatConfigProperty {
    public fun aggregationConfig(): Any? = unwrap(this).getAggregationConfig()

    public fun fileType(): String? = unwrap(this).getFileType()

    public fun prefixConfig(): Any? = unwrap(this).getPrefixConfig()

    public fun preserveSourceDataTyping(): Any? = unwrap(this).getPreserveSourceDataTyping()

    public interface Builder {
      public fun aggregationConfig(aggregationConfig: IResolvable) {
      }

      public fun aggregationConfig(aggregationConfig: AggregationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0564152b3d063bbba319273050c642c0f297b19c27a6cb573d3880d14d33aae5")
      public
          fun aggregationConfig(aggregationConfig: AggregationConfigProperty.Builder.() -> Unit) {
      }

      public fun fileType(fileType: String) {
      }

      public fun prefixConfig(prefixConfig: IResolvable) {
      }

      public fun prefixConfig(prefixConfig: PrefixConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f347e5ed4eeadb54c204588b312704de5a215c7508d94fd4ce909a24a303385")
      public fun prefixConfig(prefixConfig: PrefixConfigProperty.Builder.() -> Unit) {
      }

      public fun preserveSourceDataTyping(preserveSourceDataTyping: Boolean) {
      }

      public fun preserveSourceDataTyping(preserveSourceDataTyping: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty.builder()

      public override fun aggregationConfig(aggregationConfig: IResolvable) {
        cdkBuilder.aggregationConfig(aggregationConfig.let(IResolvable::unwrap))
      }

      public override fun aggregationConfig(aggregationConfig: AggregationConfigProperty) {
        cdkBuilder.aggregationConfig(aggregationConfig.let(AggregationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0564152b3d063bbba319273050c642c0f297b19c27a6cb573d3880d14d33aae5")
      public override
          fun aggregationConfig(aggregationConfig: AggregationConfigProperty.Builder.() -> Unit):
          Unit = aggregationConfig(AggregationConfigProperty(aggregationConfig))

      public override fun fileType(fileType: String) {
        cdkBuilder.fileType(fileType)
      }

      public override fun prefixConfig(prefixConfig: IResolvable) {
        cdkBuilder.prefixConfig(prefixConfig.let(IResolvable::unwrap))
      }

      public override fun prefixConfig(prefixConfig: PrefixConfigProperty) {
        cdkBuilder.prefixConfig(prefixConfig.let(PrefixConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f347e5ed4eeadb54c204588b312704de5a215c7508d94fd4ce909a24a303385")
      public override fun prefixConfig(prefixConfig: PrefixConfigProperty.Builder.() -> Unit): Unit
          = prefixConfig(PrefixConfigProperty(prefixConfig))

      public override fun preserveSourceDataTyping(preserveSourceDataTyping: Boolean) {
        cdkBuilder.preserveSourceDataTyping(preserveSourceDataTyping)
      }

      public override fun preserveSourceDataTyping(preserveSourceDataTyping: IResolvable) {
        cdkBuilder.preserveSourceDataTyping(preserveSourceDataTyping.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty,
    ) : S3OutputFormatConfigProperty {
      public override fun aggregationConfig(): Any? = unwrap(this).getAggregationConfig()

      public override fun fileType(): String? = unwrap(this).getFileType()

      public override fun prefixConfig(): Any? = unwrap(this).getPrefixConfig()

      public override fun preserveSourceDataTyping(): Any? =
          unwrap(this).getPreserveSourceDataTyping()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputFormatConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty):
          S3OutputFormatConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputFormatConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UpsolverS3OutputFormatConfigProperty {
    public fun aggregationConfig(): Any? = unwrap(this).getAggregationConfig()

    public fun fileType(): String? = unwrap(this).getFileType()

    public fun prefixConfig(): Any

    public interface Builder {
      public fun aggregationConfig(aggregationConfig: IResolvable) {
      }

      public fun aggregationConfig(aggregationConfig: AggregationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23d5a936b77c2c68051ee0245817734701542e0e5e64b93a04f589c69eab692b")
      public
          fun aggregationConfig(aggregationConfig: AggregationConfigProperty.Builder.() -> Unit) {
      }

      public fun fileType(fileType: String) {
      }

      public fun prefixConfig(prefixConfig: IResolvable) {
      }

      public fun prefixConfig(prefixConfig: PrefixConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c56c14d42601c94f7643e795d8d09183f78e8f1f186683dff7f884a89d7dc7")
      public fun prefixConfig(prefixConfig: PrefixConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty.builder()

      public override fun aggregationConfig(aggregationConfig: IResolvable) {
        cdkBuilder.aggregationConfig(aggregationConfig.let(IResolvable::unwrap))
      }

      public override fun aggregationConfig(aggregationConfig: AggregationConfigProperty) {
        cdkBuilder.aggregationConfig(aggregationConfig.let(AggregationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23d5a936b77c2c68051ee0245817734701542e0e5e64b93a04f589c69eab692b")
      public override
          fun aggregationConfig(aggregationConfig: AggregationConfigProperty.Builder.() -> Unit):
          Unit = aggregationConfig(AggregationConfigProperty(aggregationConfig))

      public override fun fileType(fileType: String) {
        cdkBuilder.fileType(fileType)
      }

      public override fun prefixConfig(prefixConfig: IResolvable) {
        cdkBuilder.prefixConfig(prefixConfig.let(IResolvable::unwrap))
      }

      public override fun prefixConfig(prefixConfig: PrefixConfigProperty) {
        cdkBuilder.prefixConfig(prefixConfig.let(PrefixConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c56c14d42601c94f7643e795d8d09183f78e8f1f186683dff7f884a89d7dc7")
      public override fun prefixConfig(prefixConfig: PrefixConfigProperty.Builder.() -> Unit): Unit
          = prefixConfig(PrefixConfigProperty(prefixConfig))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty,
    ) : UpsolverS3OutputFormatConfigProperty {
      public override fun aggregationConfig(): Any? = unwrap(this).getAggregationConfig()

      public override fun fileType(): String? = unwrap(this).getFileType()

      public override fun prefixConfig(): Any = unwrap(this).getPrefixConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpsolverS3OutputFormatConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty):
          UpsolverS3OutputFormatConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpsolverS3OutputFormatConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3InputFormatConfigProperty {
    public fun s3InputFileType(): String? = unwrap(this).getS3InputFileType()

    public interface Builder {
      public fun s3InputFileType(s3InputFileType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty.builder()

      public override fun s3InputFileType(s3InputFileType: String) {
        cdkBuilder.s3InputFileType(s3InputFileType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty,
    ) : S3InputFormatConfigProperty {
      public override fun s3InputFileType(): String? = unwrap(this).getS3InputFileType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3InputFormatConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty):
          S3InputFormatConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3InputFormatConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatadogSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty,
    ) : DatadogSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatadogSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty):
          DatadogSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatadogSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DatadogSourcePropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SingularSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty,
    ) : SingularSourcePropertiesProperty {
      public override fun `object`(): String = unwrap(this).getObject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingularSourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty):
          SingularSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingularSourcePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DestinationFlowConfigProperty {
    public fun apiVersion(): String? = unwrap(this).getApiVersion()

    public fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

    public fun connectorType(): String

    public fun destinationConnectorProperties(): Any

    public interface Builder {
      public fun apiVersion(apiVersion: String) {
      }

      public fun connectorProfileName(connectorProfileName: String) {
      }

      public fun connectorType(connectorType: String) {
      }

      public fun destinationConnectorProperties(destinationConnectorProperties: IResolvable) {
      }

      public
          fun destinationConnectorProperties(destinationConnectorProperties: DestinationConnectorPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd4b52ab5ab53c73295d9dd2339d2db7f38f4f5ac3a1a8fe9d1bda08a63962d7")
      public
          fun destinationConnectorProperties(destinationConnectorProperties: DestinationConnectorPropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty.builder()

      public override fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
      }

      public override fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
      }

      public override fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
      }

      public override
          fun destinationConnectorProperties(destinationConnectorProperties: IResolvable) {
        cdkBuilder.destinationConnectorProperties(destinationConnectorProperties.let(IResolvable::unwrap))
      }

      public override
          fun destinationConnectorProperties(destinationConnectorProperties: DestinationConnectorPropertiesProperty) {
        cdkBuilder.destinationConnectorProperties(destinationConnectorProperties.let(DestinationConnectorPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd4b52ab5ab53c73295d9dd2339d2db7f38f4f5ac3a1a8fe9d1bda08a63962d7")
      public override
          fun destinationConnectorProperties(destinationConnectorProperties: DestinationConnectorPropertiesProperty.Builder.() -> Unit):
          Unit =
          destinationConnectorProperties(DestinationConnectorPropertiesProperty(destinationConnectorProperties))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty,
    ) : DestinationFlowConfigProperty {
      public override fun apiVersion(): String? = unwrap(this).getApiVersion()

      public override fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

      public override fun connectorType(): String = unwrap(this).getConnectorType()

      public override fun destinationConnectorProperties(): Any =
          unwrap(this).getDestinationConnectorProperties()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationFlowConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty):
          DestinationFlowConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationFlowConfigProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface GlueDataCatalogProperty {
    public fun databaseName(): String

    public fun roleArn(): String

    public fun tablePrefix(): String

    public interface Builder {
      public fun databaseName(databaseName: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun tablePrefix(tablePrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty.builder()

      public override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun tablePrefix(tablePrefix: String) {
        cdkBuilder.tablePrefix(tablePrefix)
      }

      public fun build(): software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty,
    ) : GlueDataCatalogProperty {
      public override fun databaseName(): String = unwrap(this).getDatabaseName()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun tablePrefix(): String = unwrap(this).getTablePrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GlueDataCatalogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty):
          GlueDataCatalogProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueDataCatalogProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.GlueDataCatalogProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3DestinationPropertiesProperty {
    public fun bucketName(): String

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun s3OutputFormatConfig(): Any? = unwrap(this).getS3OutputFormatConfig()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketPrefix(bucketPrefix: String) {
      }

      public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
      }

      public fun s3OutputFormatConfig(s3OutputFormatConfig: S3OutputFormatConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5cc17b820b49eb5ffb2e6c56a3bcf1dc7de87f453496dc2344fa326b8e50800")
      public
          fun s3OutputFormatConfig(s3OutputFormatConfig: S3OutputFormatConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public override fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig.let(IResolvable::unwrap))
      }

      public override fun s3OutputFormatConfig(s3OutputFormatConfig: S3OutputFormatConfigProperty) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig.let(S3OutputFormatConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c5cc17b820b49eb5ffb2e6c56a3bcf1dc7de87f453496dc2344fa326b8e50800")
      public override
          fun s3OutputFormatConfig(s3OutputFormatConfig: S3OutputFormatConfigProperty.Builder.() -> Unit):
          Unit = s3OutputFormatConfig(S3OutputFormatConfigProperty(s3OutputFormatConfig))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty,
    ) : S3DestinationPropertiesProperty {
      public override fun bucketName(): String = unwrap(this).getBucketName()

      public override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      public override fun s3OutputFormatConfig(): Any? = unwrap(this).getS3OutputFormatConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty):
          S3DestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TaskPropertiesObjectProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty.Builder =
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty,
    ) : TaskPropertiesObjectProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TaskPropertiesObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty):
          TaskPropertiesObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskPropertiesObjectProperty):
          software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
