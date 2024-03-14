package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScheduledQuery internal constructor(
  private val cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrSqErrorReportConfiguration(): String =
      unwrap(this).getAttrSqErrorReportConfiguration()

  public open fun attrSqKmsKeyId(): String = unwrap(this).getAttrSqKmsKeyId()

  public open fun attrSqName(): String = unwrap(this).getAttrSqName()

  public open fun attrSqNotificationConfiguration(): String =
      unwrap(this).getAttrSqNotificationConfiguration()

  public open fun attrSqQueryString(): String = unwrap(this).getAttrSqQueryString()

  public open fun attrSqScheduleConfiguration(): String =
      unwrap(this).getAttrSqScheduleConfiguration()

  public open fun attrSqScheduledQueryExecutionRoleArn(): String =
      unwrap(this).getAttrSqScheduledQueryExecutionRoleArn()

  public open fun attrSqTargetConfiguration(): String = unwrap(this).getAttrSqTargetConfiguration()

  public open fun clientToken(): String? = unwrap(this).getClientToken()

  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  public open fun errorReportConfiguration(): Any = unwrap(this).getErrorReportConfiguration()

  public open fun errorReportConfiguration(`value`: IResolvable) {
    unwrap(this).setErrorReportConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun errorReportConfiguration(`value`: ErrorReportConfigurationProperty) {
    unwrap(this).setErrorReportConfiguration(`value`.let(ErrorReportConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("010b3e38a64e759724e6812dc3dbea07a1cf3218555514124e83afd8babad7ef")
  public open
      fun errorReportConfiguration(`value`: ErrorReportConfigurationProperty.Builder.() -> Unit):
      Unit = errorReportConfiguration(ErrorReportConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun notificationConfiguration(): Any = unwrap(this).getNotificationConfiguration()

  public open fun notificationConfiguration(`value`: IResolvable) {
    unwrap(this).setNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
    unwrap(this).setNotificationConfiguration(`value`.let(NotificationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("56f183054324ff5ee3fc2a8d48a787c74d4cbea6a1e4249fc6d1dfc49db5d4f4")
  public open
      fun notificationConfiguration(`value`: NotificationConfigurationProperty.Builder.() -> Unit):
      Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

  public open fun queryString(): String = unwrap(this).getQueryString()

  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  public open fun scheduleConfiguration(): Any = unwrap(this).getScheduleConfiguration()

  public open fun scheduleConfiguration(`value`: IResolvable) {
    unwrap(this).setScheduleConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun scheduleConfiguration(`value`: ScheduleConfigurationProperty) {
    unwrap(this).setScheduleConfiguration(`value`.let(ScheduleConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("68108985027733be256a4fcfd6a2e917eed623f4800ebafe5117b0e1bddd14b0")
  public open fun scheduleConfiguration(`value`: ScheduleConfigurationProperty.Builder.() -> Unit):
      Unit = scheduleConfiguration(ScheduleConfigurationProperty(`value`))

  public open fun scheduledQueryExecutionRoleArn(): String =
      unwrap(this).getScheduledQueryExecutionRoleArn()

  public open fun scheduledQueryExecutionRoleArn(`value`: String) {
    unwrap(this).setScheduledQueryExecutionRoleArn(`value`)
  }

  public open fun scheduledQueryName(): String? = unwrap(this).getScheduledQueryName()

  public open fun scheduledQueryName(`value`: String) {
    unwrap(this).setScheduledQueryName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

  public open fun targetConfiguration(`value`: IResolvable) {
    unwrap(this).setTargetConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun targetConfiguration(`value`: TargetConfigurationProperty) {
    unwrap(this).setTargetConfiguration(`value`.let(TargetConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6254f0e7d28d1aba781cd8f1484da7065814f90869ba1f68f0899d6c8a2730a3")
  public open fun targetConfiguration(`value`: TargetConfigurationProperty.Builder.() -> Unit): Unit
      = targetConfiguration(TargetConfigurationProperty(`value`))

  public interface Builder {
    public fun clientToken(clientToken: String)

    public fun errorReportConfiguration(errorReportConfiguration: IResolvable)

    public fun errorReportConfiguration(errorReportConfiguration: ErrorReportConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bfe794776193612b5485c99f5ba93321fe0df4156921ed0dc1b035331c40d3e")
    public
        fun errorReportConfiguration(errorReportConfiguration: ErrorReportConfigurationProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0581f4d091c9b040397b06ada7726e666675f642d252b1bda9a21d664c96bd78")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit)

    public fun queryString(queryString: String)

    public fun scheduleConfiguration(scheduleConfiguration: IResolvable)

    public fun scheduleConfiguration(scheduleConfiguration: ScheduleConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac3e7fbea51588daf5501c3f5e4234a2843fee71ff735a1d567c3dabce05d27a")
    public
        fun scheduleConfiguration(scheduleConfiguration: ScheduleConfigurationProperty.Builder.() -> Unit)

    public fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String)

    public fun scheduledQueryName(scheduledQueryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun targetConfiguration(targetConfiguration: IResolvable)

    public fun targetConfiguration(targetConfiguration: TargetConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15214f67673f1b761dd057fb89e573b913589d1b0b19b4a46e90b5ff8afd6b90")
    public
        fun targetConfiguration(targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.timestream.CfnScheduledQuery.Builder =
        software.amazon.awscdk.services.timestream.CfnScheduledQuery.Builder.create(scope, id)

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun errorReportConfiguration(errorReportConfiguration: IResolvable) {
      cdkBuilder.errorReportConfiguration(errorReportConfiguration.let(IResolvable::unwrap))
    }

    override
        fun errorReportConfiguration(errorReportConfiguration: ErrorReportConfigurationProperty) {
      cdkBuilder.errorReportConfiguration(errorReportConfiguration.let(ErrorReportConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bfe794776193612b5485c99f5ba93321fe0df4156921ed0dc1b035331c40d3e")
    override
        fun errorReportConfiguration(errorReportConfiguration: ErrorReportConfigurationProperty.Builder.() -> Unit):
        Unit = errorReportConfiguration(ErrorReportConfigurationProperty(errorReportConfiguration))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(NotificationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0581f4d091c9b040397b06ada7726e666675f642d252b1bda9a21d664c96bd78")
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    override fun scheduleConfiguration(scheduleConfiguration: IResolvable) {
      cdkBuilder.scheduleConfiguration(scheduleConfiguration.let(IResolvable::unwrap))
    }

    override fun scheduleConfiguration(scheduleConfiguration: ScheduleConfigurationProperty) {
      cdkBuilder.scheduleConfiguration(scheduleConfiguration.let(ScheduleConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac3e7fbea51588daf5501c3f5e4234a2843fee71ff735a1d567c3dabce05d27a")
    override
        fun scheduleConfiguration(scheduleConfiguration: ScheduleConfigurationProperty.Builder.() -> Unit):
        Unit = scheduleConfiguration(ScheduleConfigurationProperty(scheduleConfiguration))

    override fun scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn: String) {
      cdkBuilder.scheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn)
    }

    override fun scheduledQueryName(scheduledQueryName: String) {
      cdkBuilder.scheduledQueryName(scheduledQueryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun targetConfiguration(targetConfiguration: IResolvable) {
      cdkBuilder.targetConfiguration(targetConfiguration.let(IResolvable::unwrap))
    }

    override fun targetConfiguration(targetConfiguration: TargetConfigurationProperty) {
      cdkBuilder.targetConfiguration(targetConfiguration.let(TargetConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15214f67673f1b761dd057fb89e573b913589d1b0b19b4a46e90b5ff8afd6b90")
    override
        fun targetConfiguration(targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit):
        Unit = targetConfiguration(TargetConfigurationProperty(targetConfiguration))

    public fun build(): software.amazon.awscdk.services.timestream.CfnScheduledQuery =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScheduledQuery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScheduledQuery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery):
        CfnScheduledQuery = CfnScheduledQuery(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledQuery):
        software.amazon.awscdk.services.timestream.CfnScheduledQuery = wrapped.cdkObject
  }

  public interface DimensionMappingProperty {
    public fun dimensionValueType(): String

    public fun name(): String

    public interface Builder {
      public fun dimensionValueType(dimensionValueType: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty.builder()

      override fun dimensionValueType(dimensionValueType: String) {
        cdkBuilder.dimensionValueType(dimensionValueType)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty,
    ) : DimensionMappingProperty {
      override fun dimensionValueType(): String = unwrap(this).getDimensionValueType()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty):
          DimensionMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionMappingProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.DimensionMappingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetConfigurationProperty {
    public fun timestreamConfiguration(): Any

    public interface Builder {
      public fun timestreamConfiguration(timestreamConfiguration: IResolvable)

      public fun timestreamConfiguration(timestreamConfiguration: TimestreamConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1ac9ecda4c2a7bc502ab841a078ca5ebdc294da4d1316e3d67027be3199eaef")
      public
          fun timestreamConfiguration(timestreamConfiguration: TimestreamConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty.builder()

      override fun timestreamConfiguration(timestreamConfiguration: IResolvable) {
        cdkBuilder.timestreamConfiguration(timestreamConfiguration.let(IResolvable::unwrap))
      }

      override
          fun timestreamConfiguration(timestreamConfiguration: TimestreamConfigurationProperty) {
        cdkBuilder.timestreamConfiguration(timestreamConfiguration.let(TimestreamConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1ac9ecda4c2a7bc502ab841a078ca5ebdc294da4d1316e3d67027be3199eaef")
      override
          fun timestreamConfiguration(timestreamConfiguration: TimestreamConfigurationProperty.Builder.() -> Unit):
          Unit = timestreamConfiguration(TimestreamConfigurationProperty(timestreamConfiguration))

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty,
    ) : TargetConfigurationProperty {
      override fun timestreamConfiguration(): Any = unwrap(this).getTimestreamConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty):
          TargetConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TargetConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimestreamConfigurationProperty {
    public fun databaseName(): String

    public fun dimensionMappings(): Any

    public fun measureNameColumn(): String? = unwrap(this).getMeasureNameColumn()

    public fun mixedMeasureMappings(): Any? = unwrap(this).getMixedMeasureMappings()

    public fun multiMeasureMappings(): Any? = unwrap(this).getMultiMeasureMappings()

    public fun tableName(): String

    public fun timeColumn(): String

    public interface Builder {
      public fun databaseName(databaseName: String)

      public fun dimensionMappings(dimensionMappings: IResolvable)

      public fun dimensionMappings(dimensionMappings: List<Any>)

      public fun measureNameColumn(measureNameColumn: String)

      public fun mixedMeasureMappings(mixedMeasureMappings: IResolvable)

      public fun mixedMeasureMappings(mixedMeasureMappings: List<Any>)

      public fun multiMeasureMappings(multiMeasureMappings: IResolvable)

      public fun multiMeasureMappings(multiMeasureMappings: MultiMeasureMappingsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87aeb44d2a317d991b450e74460067fbe99618c5d2ef7dfba8a64d43392b5601")
      public
          fun multiMeasureMappings(multiMeasureMappings: MultiMeasureMappingsProperty.Builder.() -> Unit)

      public fun tableName(tableName: String)

      public fun timeColumn(timeColumn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty.builder()

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun dimensionMappings(dimensionMappings: IResolvable) {
        cdkBuilder.dimensionMappings(dimensionMappings.let(IResolvable::unwrap))
      }

      override fun dimensionMappings(dimensionMappings: List<Any>) {
        cdkBuilder.dimensionMappings(dimensionMappings)
      }

      override fun measureNameColumn(measureNameColumn: String) {
        cdkBuilder.measureNameColumn(measureNameColumn)
      }

      override fun mixedMeasureMappings(mixedMeasureMappings: IResolvable) {
        cdkBuilder.mixedMeasureMappings(mixedMeasureMappings.let(IResolvable::unwrap))
      }

      override fun mixedMeasureMappings(mixedMeasureMappings: List<Any>) {
        cdkBuilder.mixedMeasureMappings(mixedMeasureMappings)
      }

      override fun multiMeasureMappings(multiMeasureMappings: IResolvable) {
        cdkBuilder.multiMeasureMappings(multiMeasureMappings.let(IResolvable::unwrap))
      }

      override fun multiMeasureMappings(multiMeasureMappings: MultiMeasureMappingsProperty) {
        cdkBuilder.multiMeasureMappings(multiMeasureMappings.let(MultiMeasureMappingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87aeb44d2a317d991b450e74460067fbe99618c5d2ef7dfba8a64d43392b5601")
      override
          fun multiMeasureMappings(multiMeasureMappings: MultiMeasureMappingsProperty.Builder.() -> Unit):
          Unit = multiMeasureMappings(MultiMeasureMappingsProperty(multiMeasureMappings))

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      override fun timeColumn(timeColumn: String) {
        cdkBuilder.timeColumn(timeColumn)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty,
    ) : TimestreamConfigurationProperty {
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun dimensionMappings(): Any = unwrap(this).getDimensionMappings()

      override fun measureNameColumn(): String? = unwrap(this).getMeasureNameColumn()

      override fun mixedMeasureMappings(): Any? = unwrap(this).getMixedMeasureMappings()

      override fun multiMeasureMappings(): Any? = unwrap(this).getMultiMeasureMappings()

      override fun tableName(): String = unwrap(this).getTableName()

      override fun timeColumn(): String = unwrap(this).getTimeColumn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty):
          TimestreamConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.TimestreamConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnsConfigurationProperty {
    public fun topicArn(): String

    public interface Builder {
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty.builder()

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty,
    ) : SnsConfigurationProperty {
      override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty):
          SnsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.SnsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiMeasureAttributeMappingProperty {
    public fun measureValueType(): String

    public fun sourceColumn(): String

    public fun targetMultiMeasureAttributeName(): String? =
        unwrap(this).getTargetMultiMeasureAttributeName()

    public interface Builder {
      public fun measureValueType(measureValueType: String)

      public fun sourceColumn(sourceColumn: String)

      public fun targetMultiMeasureAttributeName(targetMultiMeasureAttributeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty.builder()

      override fun measureValueType(measureValueType: String) {
        cdkBuilder.measureValueType(measureValueType)
      }

      override fun sourceColumn(sourceColumn: String) {
        cdkBuilder.sourceColumn(sourceColumn)
      }

      override fun targetMultiMeasureAttributeName(targetMultiMeasureAttributeName: String) {
        cdkBuilder.targetMultiMeasureAttributeName(targetMultiMeasureAttributeName)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty,
    ) : MultiMeasureAttributeMappingProperty {
      override fun measureValueType(): String = unwrap(this).getMeasureValueType()

      override fun sourceColumn(): String = unwrap(this).getSourceColumn()

      override fun targetMultiMeasureAttributeName(): String? =
          unwrap(this).getTargetMultiMeasureAttributeName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiMeasureAttributeMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty):
          MultiMeasureAttributeMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiMeasureAttributeMappingProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureAttributeMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScheduleConfigurationProperty {
    public fun scheduleExpression(): String

    public interface Builder {
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty.builder()

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty,
    ) : ScheduleConfigurationProperty {
      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty):
          ScheduleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ScheduleConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ConfigurationProperty {
    public fun bucketName(): String

    public fun encryptionOption(): String? = unwrap(this).getEncryptionOption()

    public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun encryptionOption(encryptionOption: String)

      public fun objectKeyPrefix(objectKeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun encryptionOption(encryptionOption: String) {
        cdkBuilder.encryptionOption(encryptionOption)
      }

      override fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty,
    ) : S3ConfigurationProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun encryptionOption(): String? = unwrap(this).getEncryptionOption()

      override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty):
          S3ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.S3ConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotificationConfigurationProperty {
    public fun snsConfiguration(): Any

    public interface Builder {
      public fun snsConfiguration(snsConfiguration: IResolvable)

      public fun snsConfiguration(snsConfiguration: SnsConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8247785498329ea3a738659a4497f5286a4da42d7f30083f3f27a84af446aeb9")
      public fun snsConfiguration(snsConfiguration: SnsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty.builder()

      override fun snsConfiguration(snsConfiguration: IResolvable) {
        cdkBuilder.snsConfiguration(snsConfiguration.let(IResolvable::unwrap))
      }

      override fun snsConfiguration(snsConfiguration: SnsConfigurationProperty) {
        cdkBuilder.snsConfiguration(snsConfiguration.let(SnsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8247785498329ea3a738659a4497f5286a4da42d7f30083f3f27a84af446aeb9")
      override fun snsConfiguration(snsConfiguration: SnsConfigurationProperty.Builder.() -> Unit):
          Unit = snsConfiguration(SnsConfigurationProperty(snsConfiguration))

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty,
    ) : NotificationConfigurationProperty {
      override fun snsConfiguration(): Any = unwrap(this).getSnsConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty):
          NotificationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.NotificationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MixedMeasureMappingProperty {
    public fun measureName(): String? = unwrap(this).getMeasureName()

    public fun measureValueType(): String

    public fun multiMeasureAttributeMappings(): Any? =
        unwrap(this).getMultiMeasureAttributeMappings()

    public fun sourceColumn(): String? = unwrap(this).getSourceColumn()

    public fun targetMeasureName(): String? = unwrap(this).getTargetMeasureName()

    public interface Builder {
      public fun measureName(measureName: String)

      public fun measureValueType(measureValueType: String)

      public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable)

      public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: List<Any>)

      public fun sourceColumn(sourceColumn: String)

      public fun targetMeasureName(targetMeasureName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty.builder()

      override fun measureName(measureName: String) {
        cdkBuilder.measureName(measureName)
      }

      override fun measureValueType(measureValueType: String) {
        cdkBuilder.measureValueType(measureValueType)
      }

      override fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable) {
        cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings.let(IResolvable::unwrap))
      }

      override fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: List<Any>) {
        cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings)
      }

      override fun sourceColumn(sourceColumn: String) {
        cdkBuilder.sourceColumn(sourceColumn)
      }

      override fun targetMeasureName(targetMeasureName: String) {
        cdkBuilder.targetMeasureName(targetMeasureName)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty,
    ) : MixedMeasureMappingProperty {
      override fun measureName(): String? = unwrap(this).getMeasureName()

      override fun measureValueType(): String = unwrap(this).getMeasureValueType()

      override fun multiMeasureAttributeMappings(): Any? =
          unwrap(this).getMultiMeasureAttributeMappings()

      override fun sourceColumn(): String? = unwrap(this).getSourceColumn()

      override fun targetMeasureName(): String? = unwrap(this).getTargetMeasureName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MixedMeasureMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty):
          MixedMeasureMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MixedMeasureMappingProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MixedMeasureMappingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiMeasureMappingsProperty {
    public fun multiMeasureAttributeMappings(): Any

    public fun targetMultiMeasureName(): String? = unwrap(this).getTargetMultiMeasureName()

    public interface Builder {
      public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable)

      public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: List<Any>)

      public fun targetMultiMeasureName(targetMultiMeasureName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty.builder()

      override fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable) {
        cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings.let(IResolvable::unwrap))
      }

      override fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: List<Any>) {
        cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings)
      }

      override fun targetMultiMeasureName(targetMultiMeasureName: String) {
        cdkBuilder.targetMultiMeasureName(targetMultiMeasureName)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty,
    ) : MultiMeasureMappingsProperty {
      override fun multiMeasureAttributeMappings(): Any =
          unwrap(this).getMultiMeasureAttributeMappings()

      override fun targetMultiMeasureName(): String? = unwrap(this).getTargetMultiMeasureName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultiMeasureMappingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty):
          MultiMeasureMappingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiMeasureMappingsProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.MultiMeasureMappingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ErrorReportConfigurationProperty {
    public fun s3Configuration(): Any

    public interface Builder {
      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3ConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b4d8f1b5c3437012e697fbcab384cbae30b7a7c335885984356212fa9d386e5")
      public fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty.builder()

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3ConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3ConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b4d8f1b5c3437012e697fbcab384cbae30b7a7c335885984356212fa9d386e5")
      override fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3ConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty,
    ) : ErrorReportConfigurationProperty {
      override fun s3Configuration(): Any = unwrap(this).getS3Configuration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorReportConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty):
          ErrorReportConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorReportConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnScheduledQuery.ErrorReportConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
