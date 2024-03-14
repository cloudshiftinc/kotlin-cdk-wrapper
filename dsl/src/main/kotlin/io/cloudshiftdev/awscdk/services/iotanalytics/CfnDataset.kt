package io.cloudshiftdev.awscdk.services.iotanalytics

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

public open class CfnDataset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun actions(): Any = unwrap(this).getActions()

  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  public open fun actions(__idx_ac66f0: List<Any>) {
    unwrap(this).setActions(__idx_ac66f0)
  }

  public open fun actions(vararg __idx_ac66f0: Any): Unit = actions(__idx_ac66f0.toList())

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun contentDeliveryRules(): Any? = unwrap(this).getContentDeliveryRules()

  public open fun contentDeliveryRules(`value`: IResolvable) {
    unwrap(this).setContentDeliveryRules(`value`.let(IResolvable::unwrap))
  }

  public open fun contentDeliveryRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setContentDeliveryRules(__idx_ac66f0)
  }

  public open fun contentDeliveryRules(vararg __idx_ac66f0: Any): Unit =
      contentDeliveryRules(__idx_ac66f0.toList())

  public open fun datasetName(): String? = unwrap(this).getDatasetName()

  public open fun datasetName(`value`: String) {
    unwrap(this).setDatasetName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lateDataRules(): Any? = unwrap(this).getLateDataRules()

  public open fun lateDataRules(`value`: IResolvable) {
    unwrap(this).setLateDataRules(`value`.let(IResolvable::unwrap))
  }

  public open fun lateDataRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setLateDataRules(__idx_ac66f0)
  }

  public open fun lateDataRules(vararg __idx_ac66f0: Any): Unit =
      lateDataRules(__idx_ac66f0.toList())

  public open fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  public open fun retentionPeriod(`value`: IResolvable) {
    unwrap(this).setRetentionPeriod(`value`.let(IResolvable::unwrap))
  }

  public open fun retentionPeriod(`value`: RetentionPeriodProperty) {
    unwrap(this).setRetentionPeriod(`value`.let(RetentionPeriodProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f3d2b827472134f7d6e0faf747de7bf4dbe18db2d25da79fbd1ba10c038f907")
  public open fun retentionPeriod(`value`: RetentionPeriodProperty.Builder.() -> Unit): Unit =
      retentionPeriod(RetentionPeriodProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun triggers(): Any? = unwrap(this).getTriggers()

  public open fun triggers(`value`: IResolvable) {
    unwrap(this).setTriggers(`value`.let(IResolvable::unwrap))
  }

  public open fun triggers(__idx_ac66f0: List<Any>) {
    unwrap(this).setTriggers(__idx_ac66f0)
  }

  public open fun triggers(vararg __idx_ac66f0: Any): Unit = triggers(__idx_ac66f0.toList())

  public open fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

  public open fun versioningConfiguration(`value`: IResolvable) {
    unwrap(this).setVersioningConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun versioningConfiguration(`value`: VersioningConfigurationProperty) {
    unwrap(this).setVersioningConfiguration(`value`.let(VersioningConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("69ecd0ecda0a8c45a4cca5d4893e6f8e86b4b799c6f76005f236e0d0ad6a9ee6")
  public open
      fun versioningConfiguration(`value`: VersioningConfigurationProperty.Builder.() -> Unit): Unit
      = versioningConfiguration(VersioningConfigurationProperty(`value`))

  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun actions(vararg actions: Any)

    public fun contentDeliveryRules(contentDeliveryRules: IResolvable)

    public fun contentDeliveryRules(contentDeliveryRules: List<Any>)

    public fun contentDeliveryRules(vararg contentDeliveryRules: Any)

    public fun datasetName(datasetName: String)

    public fun lateDataRules(lateDataRules: IResolvable)

    public fun lateDataRules(lateDataRules: List<Any>)

    public fun lateDataRules(vararg lateDataRules: Any)

    public fun retentionPeriod(retentionPeriod: IResolvable)

    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed4b1a6c499b1aab7253c220d7bea5f6b604f2bae56e1a41fc8a151531e688b6")
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun triggers(triggers: IResolvable)

    public fun triggers(triggers: List<Any>)

    public fun triggers(vararg triggers: Any)

    public fun versioningConfiguration(versioningConfiguration: IResolvable)

    public fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdff7b61aeda49e270b8e34c4421b701bf69a337e52852300e910e8de7f64610")
    public
        fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnDataset.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnDataset.Builder.create(scope, id)

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    override fun contentDeliveryRules(contentDeliveryRules: IResolvable) {
      cdkBuilder.contentDeliveryRules(contentDeliveryRules.let(IResolvable::unwrap))
    }

    override fun contentDeliveryRules(contentDeliveryRules: List<Any>) {
      cdkBuilder.contentDeliveryRules(contentDeliveryRules)
    }

    override fun contentDeliveryRules(vararg contentDeliveryRules: Any): Unit =
        contentDeliveryRules(contentDeliveryRules.toList())

    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    override fun lateDataRules(lateDataRules: IResolvable) {
      cdkBuilder.lateDataRules(lateDataRules.let(IResolvable::unwrap))
    }

    override fun lateDataRules(lateDataRules: List<Any>) {
      cdkBuilder.lateDataRules(lateDataRules)
    }

    override fun lateDataRules(vararg lateDataRules: Any): Unit =
        lateDataRules(lateDataRules.toList())

    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(RetentionPeriodProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed4b1a6c499b1aab7253c220d7bea5f6b604f2bae56e1a41fc8a151531e688b6")
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit): Unit
        = retentionPeriod(RetentionPeriodProperty(retentionPeriod))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    override fun versioningConfiguration(versioningConfiguration: IResolvable) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(IResolvable::unwrap))
    }

    override fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(VersioningConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cdff7b61aeda49e270b8e34c4421b701bf69a337e52852300e910e8de7f64610")
    override
        fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty.Builder.() -> Unit):
        Unit = versioningConfiguration(VersioningConfigurationProperty(versioningConfiguration))

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset):
        CfnDataset = CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset):
        software.amazon.awscdk.services.iotanalytics.CfnDataset = wrapped.cdkObject
  }

  public interface GlueConfigurationProperty {
    public fun databaseName(): String

    public fun tableName(): String

    public interface Builder {
      public fun databaseName(databaseName: String)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty.builder()

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty,
    ) : GlueConfigurationProperty {
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GlueConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty):
          GlueConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeltaTimeProperty {
    public fun offsetSeconds(): Number

    public fun timeExpression(): String

    public interface Builder {
      public fun offsetSeconds(offsetSeconds: Number)

      public fun timeExpression(timeExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.builder()

      override fun offsetSeconds(offsetSeconds: Number) {
        cdkBuilder.offsetSeconds(offsetSeconds)
      }

      override fun timeExpression(timeExpression: String) {
        cdkBuilder.timeExpression(timeExpression)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty,
    ) : DeltaTimeProperty {
      override fun offsetSeconds(): Number = unwrap(this).getOffsetSeconds()

      override fun timeExpression(): String = unwrap(this).getTimeExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeltaTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty):
          DeltaTimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeltaTimeProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3DestinationConfigurationProperty {
    public fun bucket(): String

    public fun glueConfiguration(): Any? = unwrap(this).getGlueConfiguration()

    public fun key(): String

    public fun roleArn(): String

    public interface Builder {
      public fun bucket(bucket: String)

      public fun glueConfiguration(glueConfiguration: IResolvable)

      public fun glueConfiguration(glueConfiguration: GlueConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d986fc3b747807a579f2262617d81f0c53cbf1ab91bc6b0b387b4db40f60623")
      public fun glueConfiguration(glueConfiguration: GlueConfigurationProperty.Builder.() -> Unit)

      public fun key(key: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun glueConfiguration(glueConfiguration: IResolvable) {
        cdkBuilder.glueConfiguration(glueConfiguration.let(IResolvable::unwrap))
      }

      override fun glueConfiguration(glueConfiguration: GlueConfigurationProperty) {
        cdkBuilder.glueConfiguration(glueConfiguration.let(GlueConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d986fc3b747807a579f2262617d81f0c53cbf1ab91bc6b0b387b4db40f60623")
      override
          fun glueConfiguration(glueConfiguration: GlueConfigurationProperty.Builder.() -> Unit):
          Unit = glueConfiguration(GlueConfigurationProperty(glueConfiguration))

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty,
    ) : S3DestinationConfigurationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun glueConfiguration(): Any? = unwrap(this).getGlueConfiguration()

      override fun key(): String = unwrap(this).getKey()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty):
          S3DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputFileUriValueProperty {
    public fun fileName(): String

    public interface Builder {
      public fun fileName(fileName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.builder()

      override fun fileName(fileName: String) {
        cdkBuilder.fileName(fileName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty,
    ) : OutputFileUriValueProperty {
      override fun fileName(): String = unwrap(this).getFileName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputFileUriValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty):
          OutputFileUriValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputFileUriValueProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ContainerActionProperty {
    public fun executionRoleArn(): String

    public fun image(): String

    public fun resourceConfiguration(): Any

    public fun variables(): Any? = unwrap(this).getVariables()

    public interface Builder {
      public fun executionRoleArn(executionRoleArn: String)

      public fun image(image: String)

      public fun resourceConfiguration(resourceConfiguration: IResolvable)

      public fun resourceConfiguration(resourceConfiguration: ResourceConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f94ac89e4da5cf7280e11af6d60fab30c7a8ca77c06c00fbaff39e36613543b3")
      public
          fun resourceConfiguration(resourceConfiguration: ResourceConfigurationProperty.Builder.() -> Unit)

      public fun variables(variables: IResolvable)

      public fun variables(variables: List<Any>)

      public fun variables(vararg variables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty.builder()

      override fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
      }

      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      override fun resourceConfiguration(resourceConfiguration: IResolvable) {
        cdkBuilder.resourceConfiguration(resourceConfiguration.let(IResolvable::unwrap))
      }

      override fun resourceConfiguration(resourceConfiguration: ResourceConfigurationProperty) {
        cdkBuilder.resourceConfiguration(resourceConfiguration.let(ResourceConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f94ac89e4da5cf7280e11af6d60fab30c7a8ca77c06c00fbaff39e36613543b3")
      override
          fun resourceConfiguration(resourceConfiguration: ResourceConfigurationProperty.Builder.() -> Unit):
          Unit = resourceConfiguration(ResourceConfigurationProperty(resourceConfiguration))

      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      override fun variables(variables: List<Any>) {
        cdkBuilder.variables(variables)
      }

      override fun variables(vararg variables: Any): Unit = variables(variables.toList())

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty,
    ) : ContainerActionProperty {
      override fun executionRoleArn(): String = unwrap(this).getExecutionRoleArn()

      override fun image(): String = unwrap(this).getImage()

      override fun resourceConfiguration(): Any = unwrap(this).getResourceConfiguration()

      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty):
          ContainerActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerActionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ContainerActionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DatasetContentVersionValueProperty {
    public fun datasetName(): String

    public interface Builder {
      public fun datasetName(datasetName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty.builder()

      override fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty,
    ) : DatasetContentVersionValueProperty {
      override fun datasetName(): String = unwrap(this).getDatasetName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatasetContentVersionValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty):
          DatasetContentVersionValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetContentVersionValueProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentVersionValueProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterProperty {
    public fun deltaTime(): Any? = unwrap(this).getDeltaTime()

    public interface Builder {
      public fun deltaTime(deltaTime: IResolvable)

      public fun deltaTime(deltaTime: DeltaTimeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("292b1a57aa57aee4937f19c951a48b9710aa5a181672b7d5d6d32846b1e2af24")
      public fun deltaTime(deltaTime: DeltaTimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty.builder()

      override fun deltaTime(deltaTime: IResolvable) {
        cdkBuilder.deltaTime(deltaTime.let(IResolvable::unwrap))
      }

      override fun deltaTime(deltaTime: DeltaTimeProperty) {
        cdkBuilder.deltaTime(deltaTime.let(DeltaTimeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("292b1a57aa57aee4937f19c951a48b9710aa5a181672b7d5d6d32846b1e2af24")
      override fun deltaTime(deltaTime: DeltaTimeProperty.Builder.() -> Unit): Unit =
          deltaTime(DeltaTimeProperty(deltaTime))

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty,
    ) : FilterProperty {
      override fun deltaTime(): Any? = unwrap(this).getDeltaTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeltaTimeSessionWindowConfigurationProperty {
    public fun timeoutInMinutes(): Number

    public interface Builder {
      public fun timeoutInMinutes(timeoutInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty.builder()

      override fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty,
    ) : DeltaTimeSessionWindowConfigurationProperty {
      override fun timeoutInMinutes(): Number = unwrap(this).getTimeoutInMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeltaTimeSessionWindowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty):
          DeltaTimeSessionWindowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeltaTimeSessionWindowConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatasetContentDeliveryRuleDestinationProperty {
    public fun iotEventsDestinationConfiguration(): Any? =
        unwrap(this).getIotEventsDestinationConfiguration()

    public fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()

    public interface Builder {
      public fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IResolvable)

      public
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IotEventsDestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a18c9c3ed206c1322a375f674aebf05dc3a1a936a9a9e2543dea8eb19a30fed1")
      public
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IotEventsDestinationConfigurationProperty.Builder.() -> Unit)

      public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable)

      public
          fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4deed4a0e02afd5fc0a753305e969501d27a4a93446b9b8f63aed29f905facd6")
      public
          fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty.builder()

      override
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IResolvable) {
        cdkBuilder.iotEventsDestinationConfiguration(iotEventsDestinationConfiguration.let(IResolvable::unwrap))
      }

      override
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IotEventsDestinationConfigurationProperty) {
        cdkBuilder.iotEventsDestinationConfiguration(iotEventsDestinationConfiguration.let(IotEventsDestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a18c9c3ed206c1322a375f674aebf05dc3a1a936a9a9e2543dea8eb19a30fed1")
      override
          fun iotEventsDestinationConfiguration(iotEventsDestinationConfiguration: IotEventsDestinationConfigurationProperty.Builder.() -> Unit):
          Unit =
          iotEventsDestinationConfiguration(IotEventsDestinationConfigurationProperty(iotEventsDestinationConfiguration))

      override fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(IResolvable::unwrap))
      }

      override
          fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty) {
        cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration.let(S3DestinationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4deed4a0e02afd5fc0a753305e969501d27a4a93446b9b8f63aed29f905facd6")
      override
          fun s3DestinationConfiguration(s3DestinationConfiguration: S3DestinationConfigurationProperty.Builder.() -> Unit):
          Unit =
          s3DestinationConfiguration(S3DestinationConfigurationProperty(s3DestinationConfiguration))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty,
    ) : DatasetContentDeliveryRuleDestinationProperty {
      override fun iotEventsDestinationConfiguration(): Any? =
          unwrap(this).getIotEventsDestinationConfiguration()

      override fun s3DestinationConfiguration(): Any? = unwrap(this).getS3DestinationConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatasetContentDeliveryRuleDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty):
          DatasetContentDeliveryRuleDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetContentDeliveryRuleDestinationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourceConfigurationProperty {
    public fun computeType(): String

    public fun volumeSizeInGb(): Number

    public interface Builder {
      public fun computeType(computeType: String)

      public fun volumeSizeInGb(volumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.builder()

      override fun computeType(computeType: String) {
        cdkBuilder.computeType(computeType)
      }

      override fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty,
    ) : ResourceConfigurationProperty {
      override fun computeType(): String = unwrap(this).getComputeType()

      override fun volumeSizeInGb(): Number = unwrap(this).getVolumeSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty):
          ResourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LateDataRuleProperty {
    public fun ruleConfiguration(): Any

    public fun ruleName(): String? = unwrap(this).getRuleName()

    public interface Builder {
      public fun ruleConfiguration(ruleConfiguration: IResolvable)

      public fun ruleConfiguration(ruleConfiguration: LateDataRuleConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("463e70cb7b75495f7fc174c3f8820d790710441ef27883c96a823c3a9562ddde")
      public
          fun ruleConfiguration(ruleConfiguration: LateDataRuleConfigurationProperty.Builder.() -> Unit)

      public fun ruleName(ruleName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty.builder()

      override fun ruleConfiguration(ruleConfiguration: IResolvable) {
        cdkBuilder.ruleConfiguration(ruleConfiguration.let(IResolvable::unwrap))
      }

      override fun ruleConfiguration(ruleConfiguration: LateDataRuleConfigurationProperty) {
        cdkBuilder.ruleConfiguration(ruleConfiguration.let(LateDataRuleConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("463e70cb7b75495f7fc174c3f8820d790710441ef27883c96a823c3a9562ddde")
      override
          fun ruleConfiguration(ruleConfiguration: LateDataRuleConfigurationProperty.Builder.() -> Unit):
          Unit = ruleConfiguration(LateDataRuleConfigurationProperty(ruleConfiguration))

      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty,
    ) : LateDataRuleProperty {
      override fun ruleConfiguration(): Any = unwrap(this).getRuleConfiguration()

      override fun ruleName(): String? = unwrap(this).getRuleName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LateDataRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty):
          LateDataRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LateDataRuleProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TriggerProperty {
    public fun schedule(): Any? = unwrap(this).getSchedule()

    public fun triggeringDataset(): Any? = unwrap(this).getTriggeringDataset()

    public interface Builder {
      public fun schedule(schedule: IResolvable)

      public fun schedule(schedule: ScheduleProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0282a88062b57f5491e350a63ffc7c391ab9e243980fdc18451e57d3916020d8")
      public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

      public fun triggeringDataset(triggeringDataset: IResolvable)

      public fun triggeringDataset(triggeringDataset: TriggeringDatasetProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51aea310296e38b3b60aeb893a2a47e782046054bf5e23a5360066b529afdf0d")
      public fun triggeringDataset(triggeringDataset: TriggeringDatasetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty.builder()

      override fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
      }

      override fun schedule(schedule: ScheduleProperty) {
        cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0282a88062b57f5491e350a63ffc7c391ab9e243980fdc18451e57d3916020d8")
      override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
          schedule(ScheduleProperty(schedule))

      override fun triggeringDataset(triggeringDataset: IResolvable) {
        cdkBuilder.triggeringDataset(triggeringDataset.let(IResolvable::unwrap))
      }

      override fun triggeringDataset(triggeringDataset: TriggeringDatasetProperty) {
        cdkBuilder.triggeringDataset(triggeringDataset.let(TriggeringDatasetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51aea310296e38b3b60aeb893a2a47e782046054bf5e23a5360066b529afdf0d")
      override
          fun triggeringDataset(triggeringDataset: TriggeringDatasetProperty.Builder.() -> Unit):
          Unit = triggeringDataset(TriggeringDatasetProperty(triggeringDataset))

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty,
    ) : TriggerProperty {
      override fun schedule(): Any? = unwrap(this).getSchedule()

      override fun triggeringDataset(): Any? = unwrap(this).getTriggeringDataset()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty):
          TriggerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggerProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatasetContentDeliveryRuleProperty {
    public fun destination(): Any

    public fun entryName(): String? = unwrap(this).getEntryName()

    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: DatasetContentDeliveryRuleDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7002a69a78fa0a8d9c60b7eaf42ecee41d1f3761d56ad36c4cd9b8976df45abc")
      public
          fun destination(destination: DatasetContentDeliveryRuleDestinationProperty.Builder.() -> Unit)

      public fun entryName(entryName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: DatasetContentDeliveryRuleDestinationProperty) {
        cdkBuilder.destination(destination.let(DatasetContentDeliveryRuleDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7002a69a78fa0a8d9c60b7eaf42ecee41d1f3761d56ad36c4cd9b8976df45abc")
      override
          fun destination(destination: DatasetContentDeliveryRuleDestinationProperty.Builder.() -> Unit):
          Unit = destination(DatasetContentDeliveryRuleDestinationProperty(destination))

      override fun entryName(entryName: String) {
        cdkBuilder.entryName(entryName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty,
    ) : DatasetContentDeliveryRuleProperty {
      override fun destination(): Any = unwrap(this).getDestination()

      override fun entryName(): String? = unwrap(this).getEntryName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatasetContentDeliveryRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty):
          DatasetContentDeliveryRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetContentDeliveryRuleProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun actionName(): String

    public fun containerAction(): Any? = unwrap(this).getContainerAction()

    public fun queryAction(): Any? = unwrap(this).getQueryAction()

    public interface Builder {
      public fun actionName(actionName: String)

      public fun containerAction(containerAction: IResolvable)

      public fun containerAction(containerAction: ContainerActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fb0b2b4600952a7a3c76e021204da23616aea133683262928c645a6b64097d5")
      public fun containerAction(containerAction: ContainerActionProperty.Builder.() -> Unit)

      public fun queryAction(queryAction: IResolvable)

      public fun queryAction(queryAction: QueryActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("209643db6aef748be34590f8f172d702dfc98b6d584c2242f0f32d2150c0bf0e")
      public fun queryAction(queryAction: QueryActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty.builder()

      override fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
      }

      override fun containerAction(containerAction: IResolvable) {
        cdkBuilder.containerAction(containerAction.let(IResolvable::unwrap))
      }

      override fun containerAction(containerAction: ContainerActionProperty) {
        cdkBuilder.containerAction(containerAction.let(ContainerActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fb0b2b4600952a7a3c76e021204da23616aea133683262928c645a6b64097d5")
      override fun containerAction(containerAction: ContainerActionProperty.Builder.() -> Unit):
          Unit = containerAction(ContainerActionProperty(containerAction))

      override fun queryAction(queryAction: IResolvable) {
        cdkBuilder.queryAction(queryAction.let(IResolvable::unwrap))
      }

      override fun queryAction(queryAction: QueryActionProperty) {
        cdkBuilder.queryAction(queryAction.let(QueryActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("209643db6aef748be34590f8f172d702dfc98b6d584c2242f0f32d2150c0bf0e")
      override fun queryAction(queryAction: QueryActionProperty.Builder.() -> Unit): Unit =
          queryAction(QueryActionProperty(queryAction))

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty,
    ) : ActionProperty {
      override fun actionName(): String = unwrap(this).getActionName()

      override fun containerAction(): Any? = unwrap(this).getContainerAction()

      override fun queryAction(): Any? = unwrap(this).getQueryAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface QueryActionProperty {
    public fun filters(): Any? = unwrap(this).getFilters()

    public fun sqlQuery(): String

    public interface Builder {
      public fun filters(filters: IResolvable)

      public fun filters(filters: List<Any>)

      public fun filters(vararg filters: Any)

      public fun sqlQuery(sqlQuery: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty.builder()

      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      override fun sqlQuery(sqlQuery: String) {
        cdkBuilder.sqlQuery(sqlQuery)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty,
    ) : QueryActionProperty {
      override fun filters(): Any? = unwrap(this).getFilters()

      override fun sqlQuery(): String = unwrap(this).getSqlQuery()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QueryActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty):
          QueryActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryActionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.QueryActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScheduleProperty {
    public fun scheduleExpression(): String

    public interface Builder {
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty.builder()

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty,
    ) : ScheduleProperty {
      override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.ScheduleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VariableProperty {
    public fun datasetContentVersionValue(): Any? = unwrap(this).getDatasetContentVersionValue()

    public fun doubleValue(): Number? = unwrap(this).getDoubleValue()

    public fun outputFileUriValue(): Any? = unwrap(this).getOutputFileUriValue()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public fun variableName(): String

    public interface Builder {
      public fun datasetContentVersionValue(datasetContentVersionValue: IResolvable)

      public
          fun datasetContentVersionValue(datasetContentVersionValue: DatasetContentVersionValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("319789726cadd953937be8d1bb9555c02edebefaaaf31aa32a55cc7e68537fc2")
      public
          fun datasetContentVersionValue(datasetContentVersionValue: DatasetContentVersionValueProperty.Builder.() -> Unit)

      public fun doubleValue(doubleValue: Number)

      public fun outputFileUriValue(outputFileUriValue: IResolvable)

      public fun outputFileUriValue(outputFileUriValue: OutputFileUriValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dff49335f37131756e75020f0f7bc73ce35f07617897f614befcd7d8205a3e1a")
      public
          fun outputFileUriValue(outputFileUriValue: OutputFileUriValueProperty.Builder.() -> Unit)

      public fun stringValue(stringValue: String)

      public fun variableName(variableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty.builder()

      override fun datasetContentVersionValue(datasetContentVersionValue: IResolvable) {
        cdkBuilder.datasetContentVersionValue(datasetContentVersionValue.let(IResolvable::unwrap))
      }

      override
          fun datasetContentVersionValue(datasetContentVersionValue: DatasetContentVersionValueProperty) {
        cdkBuilder.datasetContentVersionValue(datasetContentVersionValue.let(DatasetContentVersionValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("319789726cadd953937be8d1bb9555c02edebefaaaf31aa32a55cc7e68537fc2")
      override
          fun datasetContentVersionValue(datasetContentVersionValue: DatasetContentVersionValueProperty.Builder.() -> Unit):
          Unit =
          datasetContentVersionValue(DatasetContentVersionValueProperty(datasetContentVersionValue))

      override fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
      }

      override fun outputFileUriValue(outputFileUriValue: IResolvable) {
        cdkBuilder.outputFileUriValue(outputFileUriValue.let(IResolvable::unwrap))
      }

      override fun outputFileUriValue(outputFileUriValue: OutputFileUriValueProperty) {
        cdkBuilder.outputFileUriValue(outputFileUriValue.let(OutputFileUriValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dff49335f37131756e75020f0f7bc73ce35f07617897f614befcd7d8205a3e1a")
      override
          fun outputFileUriValue(outputFileUriValue: OutputFileUriValueProperty.Builder.() -> Unit):
          Unit = outputFileUriValue(OutputFileUriValueProperty(outputFileUriValue))

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      override fun variableName(variableName: String) {
        cdkBuilder.variableName(variableName)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty,
    ) : VariableProperty {
      override fun datasetContentVersionValue(): Any? = unwrap(this).getDatasetContentVersionValue()

      override fun doubleValue(): Number? = unwrap(this).getDoubleValue()

      override fun outputFileUriValue(): Any? = unwrap(this).getOutputFileUriValue()

      override fun stringValue(): String? = unwrap(this).getStringValue()

      override fun variableName(): String = unwrap(this).getVariableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty):
          VariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariableProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VariableProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LateDataRuleConfigurationProperty {
    public fun deltaTimeSessionWindowConfiguration(): Any? =
        unwrap(this).getDeltaTimeSessionWindowConfiguration()

    public interface Builder {
      public
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: IResolvable)

      public
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: DeltaTimeSessionWindowConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9d87bc4aa9b49a152d09288df1a27a69707702fb08a386436e141051109adc4")
      public
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: DeltaTimeSessionWindowConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty.builder()

      override
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: IResolvable) {
        cdkBuilder.deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration.let(IResolvable::unwrap))
      }

      override
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: DeltaTimeSessionWindowConfigurationProperty) {
        cdkBuilder.deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration.let(DeltaTimeSessionWindowConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9d87bc4aa9b49a152d09288df1a27a69707702fb08a386436e141051109adc4")
      override
          fun deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration: DeltaTimeSessionWindowConfigurationProperty.Builder.() -> Unit):
          Unit =
          deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty(deltaTimeSessionWindowConfiguration))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty,
    ) : LateDataRuleConfigurationProperty {
      override fun deltaTimeSessionWindowConfiguration(): Any? =
          unwrap(this).getDeltaTimeSessionWindowConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LateDataRuleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty):
          LateDataRuleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LateDataRuleConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RetentionPeriodProperty {
    public fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

    public fun unlimited(): Any? = unwrap(this).getUnlimited()

    public interface Builder {
      public fun numberOfDays(numberOfDays: Number)

      public fun unlimited(unlimited: Boolean)

      public fun unlimited(unlimited: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.builder()

      override fun numberOfDays(numberOfDays: Number) {
        cdkBuilder.numberOfDays(numberOfDays)
      }

      override fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
      }

      override fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty,
    ) : RetentionPeriodProperty {
      override fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

      override fun unlimited(): Any? = unwrap(this).getUnlimited()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty):
          RetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VersioningConfigurationProperty {
    public fun maxVersions(): Number? = unwrap(this).getMaxVersions()

    public fun unlimited(): Any? = unwrap(this).getUnlimited()

    public interface Builder {
      public fun maxVersions(maxVersions: Number)

      public fun unlimited(unlimited: Boolean)

      public fun unlimited(unlimited: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty.builder()

      override fun maxVersions(maxVersions: Number) {
        cdkBuilder.maxVersions(maxVersions)
      }

      override fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
      }

      override fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty,
    ) : VersioningConfigurationProperty {
      override fun maxVersions(): Number? = unwrap(this).getMaxVersions()

      override fun unlimited(): Any? = unwrap(this).getUnlimited()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VersioningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty):
          VersioningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VersioningConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.VersioningConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IotEventsDestinationConfigurationProperty {
    public fun inputName(): String

    public fun roleArn(): String

    public interface Builder {
      public fun inputName(inputName: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty.builder()

      override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty,
    ) : IotEventsDestinationConfigurationProperty {
      override fun inputName(): String = unwrap(this).getInputName()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IotEventsDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty):
          IotEventsDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotEventsDestinationConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TriggeringDatasetProperty {
    public fun datasetName(): String

    public interface Builder {
      public fun datasetName(datasetName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty.builder()

      override fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty,
    ) : TriggeringDatasetProperty {
      override fun datasetName(): String = unwrap(this).getDatasetName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TriggeringDatasetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty):
          TriggeringDatasetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TriggeringDatasetProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDataset.TriggeringDatasetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
