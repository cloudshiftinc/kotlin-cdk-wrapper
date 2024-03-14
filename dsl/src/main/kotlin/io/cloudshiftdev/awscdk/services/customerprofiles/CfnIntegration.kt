package io.cloudshiftdev.awscdk.services.customerprofiles

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIntegration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun flowDefinition(): Any? = unwrap(this).getFlowDefinition()

  public open fun flowDefinition(`value`: IResolvable) {
    unwrap(this).setFlowDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun flowDefinition(`value`: FlowDefinitionProperty) {
    unwrap(this).setFlowDefinition(`value`.let(FlowDefinitionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("106c3101070cbd303606afbd389d3a31ef2932e5664f129873a5ca7e080f6e72")
  public open fun flowDefinition(`value`: FlowDefinitionProperty.Builder.() -> Unit): Unit =
      flowDefinition(FlowDefinitionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun objectTypeName(): String? = unwrap(this).getObjectTypeName()

  public open fun objectTypeName(`value`: String) {
    unwrap(this).setObjectTypeName(`value`)
  }

  public open fun objectTypeNames(): Any? = unwrap(this).getObjectTypeNames()

  public open fun objectTypeNames(`value`: IResolvable) {
    unwrap(this).setObjectTypeNames(`value`.let(IResolvable::unwrap))
  }

  public open fun objectTypeNames(__idx_ac66f0: List<Any>) {
    unwrap(this).setObjectTypeNames(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun uri(): String? = unwrap(this).getUri()

  public open fun uri(`value`: String) {
    unwrap(this).setUri(`value`)
  }

  public interface Builder {
    public fun domainName(domainName: String) {
    }

    public fun flowDefinition(flowDefinition: IResolvable) {
    }

    public fun flowDefinition(flowDefinition: FlowDefinitionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04a0855709d02451743499c02435d7192d2fd29a27f883fbe1c7332f6785d72c")
    public fun flowDefinition(flowDefinition: FlowDefinitionProperty.Builder.() -> Unit) {
    }

    public fun objectTypeName(objectTypeName: String) {
    }

    public fun objectTypeNames(objectTypeNames: IResolvable) {
    }

    public fun objectTypeNames(objectTypeNames: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun uri(uri: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnIntegration.Builder
        = software.amazon.awscdk.services.customerprofiles.CfnIntegration.Builder.create(scope, id)

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun flowDefinition(flowDefinition: IResolvable) {
      cdkBuilder.flowDefinition(flowDefinition.let(IResolvable::unwrap))
    }

    public override fun flowDefinition(flowDefinition: FlowDefinitionProperty) {
      cdkBuilder.flowDefinition(flowDefinition.let(FlowDefinitionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04a0855709d02451743499c02435d7192d2fd29a27f883fbe1c7332f6785d72c")
    public override fun flowDefinition(flowDefinition: FlowDefinitionProperty.Builder.() -> Unit):
        Unit = flowDefinition(FlowDefinitionProperty(flowDefinition))

    public override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    public override fun objectTypeNames(objectTypeNames: IResolvable) {
      cdkBuilder.objectTypeNames(objectTypeNames.let(IResolvable::unwrap))
    }

    public override fun objectTypeNames(objectTypeNames: List<Any>) {
      cdkBuilder.objectTypeNames(objectTypeNames)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnIntegration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration):
        CfnIntegration = CfnIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnIntegration):
        software.amazon.awscdk.services.customerprofiles.CfnIntegration = wrapped.cdkObject
  }

  public interface MarketoSourcePropertiesProperty {
    public fun `object`(): String

    public interface Builder {
      public fun `object`(`object`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty):
          MarketoSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoSourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectorOperatorProperty {
    public fun marketo(): String? = unwrap(this).getMarketo()

    public fun s3(): String? = unwrap(this).getS3()

    public fun salesforce(): String? = unwrap(this).getSalesforce()

    public fun serviceNow(): String? = unwrap(this).getServiceNow()

    public fun zendesk(): String? = unwrap(this).getZendesk()

    public interface Builder {
      public fun marketo(marketo: String) {
      }

      public fun s3(s3: String) {
      }

      public fun salesforce(salesforce: String) {
      }

      public fun serviceNow(serviceNow: String) {
      }

      public fun zendesk(zendesk: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty.builder()

      public override fun marketo(marketo: String) {
        cdkBuilder.marketo(marketo)
      }

      public override fun s3(s3: String) {
        cdkBuilder.s3(s3)
      }

      public override fun salesforce(salesforce: String) {
        cdkBuilder.salesforce(salesforce)
      }

      public override fun serviceNow(serviceNow: String) {
        cdkBuilder.serviceNow(serviceNow)
      }

      public override fun zendesk(zendesk: String) {
        cdkBuilder.zendesk(zendesk)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty,
    ) : ConnectorOperatorProperty {
      public override fun marketo(): String? = unwrap(this).getMarketo()

      public override fun s3(): String? = unwrap(this).getS3()

      public override fun salesforce(): String? = unwrap(this).getSalesforce()

      public override fun serviceNow(): String? = unwrap(this).getServiceNow()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty):
          ConnectorOperatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorOperatorProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ConnectorOperatorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TriggerConfigProperty {
    public fun triggerProperties(): Any? = unwrap(this).getTriggerProperties()

    public fun triggerType(): String

    public interface Builder {
      public fun triggerProperties(triggerProperties: IResolvable) {
      }

      public fun triggerProperties(triggerProperties: TriggerPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70f093d02bd5940e22cc195bebbe1fe645d686c826f8405fd3155cca76eb605b")
      public
          fun triggerProperties(triggerProperties: TriggerPropertiesProperty.Builder.() -> Unit) {
      }

      public fun triggerType(triggerType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty.builder()

      public override fun triggerProperties(triggerProperties: IResolvable) {
        cdkBuilder.triggerProperties(triggerProperties.let(IResolvable::unwrap))
      }

      public override fun triggerProperties(triggerProperties: TriggerPropertiesProperty) {
        cdkBuilder.triggerProperties(triggerProperties.let(TriggerPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70f093d02bd5940e22cc195bebbe1fe645d686c826f8405fd3155cca76eb605b")
      public override
          fun triggerProperties(triggerProperties: TriggerPropertiesProperty.Builder.() -> Unit):
          Unit = triggerProperties(TriggerPropertiesProperty(triggerProperties))

      public override fun triggerType(triggerType: String) {
        cdkBuilder.triggerType(triggerType)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty):
          TriggerConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FlowDefinitionProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun flowName(): String

    public fun kmsArn(): String

    public fun sourceFlowConfig(): Any

    public fun tasks(): Any

    public fun triggerConfig(): Any

    public interface Builder {
      public fun description(description: String) {
      }

      public fun flowName(flowName: String) {
      }

      public fun kmsArn(kmsArn: String) {
      }

      public fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
      }

      public fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee3bdfbece1c201014020183266f12b2ac387e18895d4f3eecd438dc7378d909")
      public fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty.Builder.() -> Unit) {
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
      @JvmName("f898f14bbd34b0d3ba64659ba12cddf6cf5c82aa1df7a7efb4e83003421c8bbc")
      public fun triggerConfig(triggerConfig: TriggerConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun flowName(flowName: String) {
        cdkBuilder.flowName(flowName)
      }

      public override fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
      }

      public override fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
        cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(IResolvable::unwrap))
      }

      public override fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty) {
        cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(SourceFlowConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee3bdfbece1c201014020183266f12b2ac387e18895d4f3eecd438dc7378d909")
      public override
          fun sourceFlowConfig(sourceFlowConfig: SourceFlowConfigProperty.Builder.() -> Unit): Unit
          = sourceFlowConfig(SourceFlowConfigProperty(sourceFlowConfig))

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
      @JvmName("f898f14bbd34b0d3ba64659ba12cddf6cf5c82aa1df7a7efb4e83003421c8bbc")
      public override fun triggerConfig(triggerConfig: TriggerConfigProperty.Builder.() -> Unit):
          Unit = triggerConfig(TriggerConfigProperty(triggerConfig))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty,
    ) : FlowDefinitionProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun flowName(): String = unwrap(this).getFlowName()

      public override fun kmsArn(): String = unwrap(this).getKmsArn()

      public override fun sourceFlowConfig(): Any = unwrap(this).getSourceFlowConfig()

      public override fun tasks(): Any = unwrap(this).getTasks()

      public override fun triggerConfig(): Any = unwrap(this).getTriggerConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FlowDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty):
          FlowDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FlowDefinitionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IncrementalPullConfigProperty {
    public fun datetimeTypeFieldName(): String? = unwrap(this).getDatetimeTypeFieldName()

    public interface Builder {
      public fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty.builder()

      public override fun datetimeTypeFieldName(datetimeTypeFieldName: String) {
        cdkBuilder.datetimeTypeFieldName(datetimeTypeFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty):
          IncrementalPullConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncrementalPullConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3SourcePropertiesProperty {
    public fun bucketName(): String

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun bucketPrefix(bucketPrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty,
    ) : S3SourcePropertiesProperty {
      public override fun bucketName(): String = unwrap(this).getBucketName()

      public override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3SourcePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty):
          S3SourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.S3SourcePropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ObjectTypeMappingProperty {
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
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty,
    ) : ObjectTypeMappingProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectTypeMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty):
          ObjectTypeMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectTypeMappingProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ObjectTypeMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScheduledTriggerPropertiesProperty {
    public fun dataPullMode(): String? = unwrap(this).getDataPullMode()

    public fun firstExecutionFrom(): Number? = unwrap(this).getFirstExecutionFrom()

    public fun scheduleEndTime(): Number? = unwrap(this).getScheduleEndTime()

    public fun scheduleExpression(): String

    public fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

    public fun scheduleStartTime(): Number? = unwrap(this).getScheduleStartTime()

    public fun timezone(): String? = unwrap(this).getTimezone()

    public interface Builder {
      public fun dataPullMode(dataPullMode: String) {
      }

      public fun firstExecutionFrom(firstExecutionFrom: Number) {
      }

      public fun scheduleEndTime(scheduleEndTime: Number) {
      }

      public fun scheduleExpression(scheduleExpression: String) {
      }

      public fun scheduleOffset(scheduleOffset: Number) {
      }

      public fun scheduleStartTime(scheduleStartTime: Number) {
      }

      public fun timezone(timezone: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty.builder()

      public override fun dataPullMode(dataPullMode: String) {
        cdkBuilder.dataPullMode(dataPullMode)
      }

      public override fun firstExecutionFrom(firstExecutionFrom: Number) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
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

      public override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty,
    ) : ScheduledTriggerPropertiesProperty {
      public override fun dataPullMode(): String? = unwrap(this).getDataPullMode()

      public override fun firstExecutionFrom(): Number? = unwrap(this).getFirstExecutionFrom()

      public override fun scheduleEndTime(): Number? = unwrap(this).getScheduleEndTime()

      public override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

      public override fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

      public override fun scheduleStartTime(): Number? = unwrap(this).getScheduleStartTime()

      public override fun timezone(): String? = unwrap(this).getTimezone()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty):
          ScheduledTriggerPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduledTriggerPropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty
          = (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty):
          ZendeskSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskSourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SalesforceSourcePropertiesProperty {
    public fun enableDynamicFieldUpdate(): Any? = unwrap(this).getEnableDynamicFieldUpdate()

    public fun includeDeletedRecords(): Any? = unwrap(this).getIncludeDeletedRecords()

    public fun `object`(): String

    public interface Builder {
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
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty.builder()

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
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty,
    ) : SalesforceSourcePropertiesProperty {
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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty):
          SalesforceSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceSourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SalesforceSourcePropertiesProperty
          = (wrapped as Wrapper).cdkObject
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
      @JvmName("55599f197600a497862a593877646b0451deb8dc2f9983c96e237ae06ce2d179")
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
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty.builder()

      public override fun connectorOperator(connectorOperator: IResolvable) {
        cdkBuilder.connectorOperator(connectorOperator.let(IResolvable::unwrap))
      }

      public override fun connectorOperator(connectorOperator: ConnectorOperatorProperty) {
        cdkBuilder.connectorOperator(connectorOperator.let(ConnectorOperatorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55599f197600a497862a593877646b0451deb8dc2f9983c96e237ae06ce2d179")
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

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty,
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

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty):
          TaskProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TriggerPropertiesProperty {
    public fun scheduled(): Any? = unwrap(this).getScheduled()

    public interface Builder {
      public fun scheduled(scheduled: IResolvable) {
      }

      public fun scheduled(scheduled: ScheduledTriggerPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f1e68d8358801e6d018d1420d012d7b5bc6d75899a8d943ed004542a60365ce")
      public fun scheduled(scheduled: ScheduledTriggerPropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty.builder()

      public override fun scheduled(scheduled: IResolvable) {
        cdkBuilder.scheduled(scheduled.let(IResolvable::unwrap))
      }

      public override fun scheduled(scheduled: ScheduledTriggerPropertiesProperty) {
        cdkBuilder.scheduled(scheduled.let(ScheduledTriggerPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f1e68d8358801e6d018d1420d012d7b5bc6d75899a8d943ed004542a60365ce")
      public override
          fun scheduled(scheduled: ScheduledTriggerPropertiesProperty.Builder.() -> Unit): Unit =
          scheduled(ScheduledTriggerPropertiesProperty(scheduled))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty,
    ) : TriggerPropertiesProperty {
      public override fun scheduled(): Any? = unwrap(this).getScheduled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty):
          TriggerPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerPropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TriggerPropertiesProperty
          = (wrapped as Wrapper).cdkObject
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
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty.builder()

      public override fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty):
          ServiceNowSourcePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowSourcePropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceFlowConfigProperty {
    public fun connectorProfileName(): String? = unwrap(this).getConnectorProfileName()

    public fun connectorType(): String

    public fun incrementalPullConfig(): Any? = unwrap(this).getIncrementalPullConfig()

    public fun sourceConnectorProperties(): Any

    public interface Builder {
      public fun connectorProfileName(connectorProfileName: String) {
      }

      public fun connectorType(connectorType: String) {
      }

      public fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
      }

      public fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48d51bd416d1ee7fc0fa038e2aa3e18540973a149bdc9c39fa032d2d6d13221b")
      public
          fun incrementalPullConfig(incrementalPullConfig: IncrementalPullConfigProperty.Builder.() -> Unit) {
      }

      public fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
      }

      public
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7804759ca70ed0353106d5bfcbc5cf6795677bfc643f6c53ae0e644e38de8309")
      public
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty.builder()

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
      @JvmName("48d51bd416d1ee7fc0fa038e2aa3e18540973a149bdc9c39fa032d2d6d13221b")
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
      @JvmName("7804759ca70ed0353106d5bfcbc5cf6795677bfc643f6c53ae0e644e38de8309")
      public override
          fun sourceConnectorProperties(sourceConnectorProperties: SourceConnectorPropertiesProperty.Builder.() -> Unit):
          Unit =
          sourceConnectorProperties(SourceConnectorPropertiesProperty(sourceConnectorProperties))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty,
    ) : SourceFlowConfigProperty {
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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty):
          SourceFlowConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceFlowConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceConnectorPropertiesProperty {
    public fun marketo(): Any? = unwrap(this).getMarketo()

    public fun s3(): Any? = unwrap(this).getS3()

    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    public fun serviceNow(): Any? = unwrap(this).getServiceNow()

    public fun zendesk(): Any? = unwrap(this).getZendesk()

    public interface Builder {
      public fun marketo(marketo: IResolvable) {
      }

      public fun marketo(marketo: MarketoSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f6166f42c06012d7c509d0d14485cf8e9bf859ff289f251a18ecd3153dd67ae")
      public fun marketo(marketo: MarketoSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun s3(s3: IResolvable) {
      }

      public fun s3(s3: S3SourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9431f26d4c9cb1700c9ec9acaae9162ca98c1a5a77111b84fcace6c88533b43b")
      public fun s3(s3: S3SourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun salesforce(salesforce: IResolvable) {
      }

      public fun salesforce(salesforce: SalesforceSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6358b33533849c833bc905c9ea8afad1d603bef87af3893289be70dc7d6343d")
      public fun salesforce(salesforce: SalesforceSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun serviceNow(serviceNow: IResolvable) {
      }

      public fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1943dc75d6102cd55841aeb85d4f44916396062eeae1b775b1f41b40c9dac715")
      public fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty.Builder.() -> Unit) {
      }

      public fun zendesk(zendesk: IResolvable) {
      }

      public fun zendesk(zendesk: ZendeskSourcePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec735fe5819d68f086ce99da421c1742af42cea8a3a0ad71523a809c701813fd")
      public fun zendesk(zendesk: ZendeskSourcePropertiesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty.builder()

      public override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      public override fun marketo(marketo: MarketoSourcePropertiesProperty) {
        cdkBuilder.marketo(marketo.let(MarketoSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f6166f42c06012d7c509d0d14485cf8e9bf859ff289f251a18ecd3153dd67ae")
      public override fun marketo(marketo: MarketoSourcePropertiesProperty.Builder.() -> Unit): Unit
          = marketo(MarketoSourcePropertiesProperty(marketo))

      public override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      public override fun s3(s3: S3SourcePropertiesProperty) {
        cdkBuilder.s3(s3.let(S3SourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9431f26d4c9cb1700c9ec9acaae9162ca98c1a5a77111b84fcace6c88533b43b")
      public override fun s3(s3: S3SourcePropertiesProperty.Builder.() -> Unit): Unit =
          s3(S3SourcePropertiesProperty(s3))

      public override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      public override fun salesforce(salesforce: SalesforceSourcePropertiesProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6358b33533849c833bc905c9ea8afad1d603bef87af3893289be70dc7d6343d")
      public override
          fun salesforce(salesforce: SalesforceSourcePropertiesProperty.Builder.() -> Unit): Unit =
          salesforce(SalesforceSourcePropertiesProperty(salesforce))

      public override fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow.let(IResolvable::unwrap))
      }

      public override fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow.let(ServiceNowSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1943dc75d6102cd55841aeb85d4f44916396062eeae1b775b1f41b40c9dac715")
      public override
          fun serviceNow(serviceNow: ServiceNowSourcePropertiesProperty.Builder.() -> Unit): Unit =
          serviceNow(ServiceNowSourcePropertiesProperty(serviceNow))

      public override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      public override fun zendesk(zendesk: ZendeskSourcePropertiesProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskSourcePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec735fe5819d68f086ce99da421c1742af42cea8a3a0ad71523a809c701813fd")
      public override fun zendesk(zendesk: ZendeskSourcePropertiesProperty.Builder.() -> Unit): Unit
          = zendesk(ZendeskSourcePropertiesProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty,
    ) : SourceConnectorPropertiesProperty {
      public override fun marketo(): Any? = unwrap(this).getMarketo()

      public override fun s3(): Any? = unwrap(this).getS3()

      public override fun salesforce(): Any? = unwrap(this).getSalesforce()

      public override fun serviceNow(): Any? = unwrap(this).getServiceNow()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty):
          SourceConnectorPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConnectorPropertiesProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TaskPropertiesMapProperty {
    public fun operatorPropertyKey(): String

    public fun `property`(): String

    public interface Builder {
      public fun operatorPropertyKey(operatorPropertyKey: String) {
      }

      public fun `property`(`property`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty.builder()

      public override fun operatorPropertyKey(operatorPropertyKey: String) {
        cdkBuilder.operatorPropertyKey(operatorPropertyKey)
      }

      public override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty,
    ) : TaskPropertiesMapProperty {
      public override fun operatorPropertyKey(): String = unwrap(this).getOperatorPropertyKey()

      public override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TaskPropertiesMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty):
          TaskPropertiesMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskPropertiesMapProperty):
          software.amazon.awscdk.services.customerprofiles.CfnIntegration.TaskPropertiesMapProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
