package io.cloudshiftdev.awscdk.services.sagemaker

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

public open class CfnFeatureGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrFeatureGroupStatus(): String = unwrap(this).getAttrFeatureGroupStatus()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun eventTimeFeatureName(): String = unwrap(this).getEventTimeFeatureName()

  public open fun eventTimeFeatureName(`value`: String) {
    unwrap(this).setEventTimeFeatureName(`value`)
  }

  public open fun featureDefinitions(): Any = unwrap(this).getFeatureDefinitions()

  public open fun featureDefinitions(`value`: IResolvable) {
    unwrap(this).setFeatureDefinitions(`value`.let(IResolvable::unwrap))
  }

  public open fun featureDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setFeatureDefinitions(__idx_ac66f0)
  }

  public open fun featureDefinitions(vararg __idx_ac66f0: Any): Unit =
      featureDefinitions(__idx_ac66f0.toList())

  public open fun featureGroupName(): String = unwrap(this).getFeatureGroupName()

  public open fun featureGroupName(`value`: String) {
    unwrap(this).setFeatureGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun offlineStoreConfig(): Any? = unwrap(this).getOfflineStoreConfig()

  public open fun offlineStoreConfig(`value`: Any) {
    unwrap(this).setOfflineStoreConfig(`value`)
  }

  public open fun onlineStoreConfig(): Any? = unwrap(this).getOnlineStoreConfig()

  public open fun onlineStoreConfig(`value`: Any) {
    unwrap(this).setOnlineStoreConfig(`value`)
  }

  public open fun recordIdentifierFeatureName(): String =
      unwrap(this).getRecordIdentifierFeatureName()

  public open fun recordIdentifierFeatureName(`value`: String) {
    unwrap(this).setRecordIdentifierFeatureName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun throughputConfig(): Any? = unwrap(this).getThroughputConfig()

  public open fun throughputConfig(`value`: IResolvable) {
    unwrap(this).setThroughputConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun throughputConfig(`value`: ThroughputConfigProperty) {
    unwrap(this).setThroughputConfig(`value`.let(ThroughputConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64edcb02ed5518c1af88b15c8d7b65a4d3e4fe2f9493d258b3a597a665d0aafa")
  public open fun throughputConfig(`value`: ThroughputConfigProperty.Builder.() -> Unit): Unit =
      throughputConfig(ThroughputConfigProperty(`value`))

  public interface Builder {
    public fun description(description: String)

    public fun eventTimeFeatureName(eventTimeFeatureName: String)

    public fun featureDefinitions(featureDefinitions: IResolvable)

    public fun featureDefinitions(featureDefinitions: List<Any>)

    public fun featureDefinitions(vararg featureDefinitions: Any)

    public fun featureGroupName(featureGroupName: String)

    public fun offlineStoreConfig(offlineStoreConfig: Any)

    public fun onlineStoreConfig(onlineStoreConfig: Any)

    public fun recordIdentifierFeatureName(recordIdentifierFeatureName: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun throughputConfig(throughputConfig: IResolvable)

    public fun throughputConfig(throughputConfig: ThroughputConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feeb221954c6f330aee919a38c50d43bdb2806eba422525d9ff849dd44995890")
    public fun throughputConfig(throughputConfig: ThroughputConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.Builder =
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventTimeFeatureName(eventTimeFeatureName: String) {
      cdkBuilder.eventTimeFeatureName(eventTimeFeatureName)
    }

    override fun featureDefinitions(featureDefinitions: IResolvable) {
      cdkBuilder.featureDefinitions(featureDefinitions.let(IResolvable::unwrap))
    }

    override fun featureDefinitions(featureDefinitions: List<Any>) {
      cdkBuilder.featureDefinitions(featureDefinitions)
    }

    override fun featureDefinitions(vararg featureDefinitions: Any): Unit =
        featureDefinitions(featureDefinitions.toList())

    override fun featureGroupName(featureGroupName: String) {
      cdkBuilder.featureGroupName(featureGroupName)
    }

    override fun offlineStoreConfig(offlineStoreConfig: Any) {
      cdkBuilder.offlineStoreConfig(offlineStoreConfig)
    }

    override fun onlineStoreConfig(onlineStoreConfig: Any) {
      cdkBuilder.onlineStoreConfig(onlineStoreConfig)
    }

    override fun recordIdentifierFeatureName(recordIdentifierFeatureName: String) {
      cdkBuilder.recordIdentifierFeatureName(recordIdentifierFeatureName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun throughputConfig(throughputConfig: IResolvable) {
      cdkBuilder.throughputConfig(throughputConfig.let(IResolvable::unwrap))
    }

    override fun throughputConfig(throughputConfig: ThroughputConfigProperty) {
      cdkBuilder.throughputConfig(throughputConfig.let(ThroughputConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feeb221954c6f330aee919a38c50d43bdb2806eba422525d9ff849dd44995890")
    override fun throughputConfig(throughputConfig: ThroughputConfigProperty.Builder.() -> Unit):
        Unit = throughputConfig(ThroughputConfigProperty(throughputConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnFeatureGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFeatureGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFeatureGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup):
        CfnFeatureGroup = CfnFeatureGroup(cdkObject)

    internal fun unwrap(wrapped: CfnFeatureGroup):
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroup = wrapped.cdkObject
  }

  public interface OfflineStoreConfigProperty {
    public fun dataCatalogConfig(): Any? = unwrap(this).getDataCatalogConfig()

    public fun disableGlueTableCreation(): Any? = unwrap(this).getDisableGlueTableCreation()

    public fun s3StorageConfig(): Any

    public fun tableFormat(): String? = unwrap(this).getTableFormat()

    public interface Builder {
      public fun dataCatalogConfig(dataCatalogConfig: IResolvable)

      public fun dataCatalogConfig(dataCatalogConfig: DataCatalogConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e047b0fe9e5caed0af2f193bd89b57a611aa498fc2d1fb1eae59793dc052a66")
      public fun dataCatalogConfig(dataCatalogConfig: DataCatalogConfigProperty.Builder.() -> Unit)

      public fun disableGlueTableCreation(disableGlueTableCreation: Boolean)

      public fun disableGlueTableCreation(disableGlueTableCreation: IResolvable)

      public fun s3StorageConfig(s3StorageConfig: IResolvable)

      public fun s3StorageConfig(s3StorageConfig: S3StorageConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b930ec4e1b421a35978668af54bfe7fe10be792f7c06729aaead85ddd0ee8bab")
      public fun s3StorageConfig(s3StorageConfig: S3StorageConfigProperty.Builder.() -> Unit)

      public fun tableFormat(tableFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty.builder()

      override fun dataCatalogConfig(dataCatalogConfig: IResolvable) {
        cdkBuilder.dataCatalogConfig(dataCatalogConfig.let(IResolvable::unwrap))
      }

      override fun dataCatalogConfig(dataCatalogConfig: DataCatalogConfigProperty) {
        cdkBuilder.dataCatalogConfig(dataCatalogConfig.let(DataCatalogConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e047b0fe9e5caed0af2f193bd89b57a611aa498fc2d1fb1eae59793dc052a66")
      override
          fun dataCatalogConfig(dataCatalogConfig: DataCatalogConfigProperty.Builder.() -> Unit):
          Unit = dataCatalogConfig(DataCatalogConfigProperty(dataCatalogConfig))

      override fun disableGlueTableCreation(disableGlueTableCreation: Boolean) {
        cdkBuilder.disableGlueTableCreation(disableGlueTableCreation)
      }

      override fun disableGlueTableCreation(disableGlueTableCreation: IResolvable) {
        cdkBuilder.disableGlueTableCreation(disableGlueTableCreation.let(IResolvable::unwrap))
      }

      override fun s3StorageConfig(s3StorageConfig: IResolvable) {
        cdkBuilder.s3StorageConfig(s3StorageConfig.let(IResolvable::unwrap))
      }

      override fun s3StorageConfig(s3StorageConfig: S3StorageConfigProperty) {
        cdkBuilder.s3StorageConfig(s3StorageConfig.let(S3StorageConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b930ec4e1b421a35978668af54bfe7fe10be792f7c06729aaead85ddd0ee8bab")
      override fun s3StorageConfig(s3StorageConfig: S3StorageConfigProperty.Builder.() -> Unit):
          Unit = s3StorageConfig(S3StorageConfigProperty(s3StorageConfig))

      override fun tableFormat(tableFormat: String) {
        cdkBuilder.tableFormat(tableFormat)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty,
    ) : OfflineStoreConfigProperty {
      override fun dataCatalogConfig(): Any? = unwrap(this).getDataCatalogConfig()

      override fun disableGlueTableCreation(): Any? = unwrap(this).getDisableGlueTableCreation()

      override fun s3StorageConfig(): Any = unwrap(this).getS3StorageConfig()

      override fun tableFormat(): String? = unwrap(this).getTableFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OfflineStoreConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty):
          OfflineStoreConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OfflineStoreConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OfflineStoreConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ThroughputConfigProperty {
    public fun provisionedReadCapacityUnits(): Number? =
        unwrap(this).getProvisionedReadCapacityUnits()

    public fun provisionedWriteCapacityUnits(): Number? =
        unwrap(this).getProvisionedWriteCapacityUnits()

    public fun throughputMode(): String

    public interface Builder {
      public fun provisionedReadCapacityUnits(provisionedReadCapacityUnits: Number)

      public fun provisionedWriteCapacityUnits(provisionedWriteCapacityUnits: Number)

      public fun throughputMode(throughputMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty.builder()

      override fun provisionedReadCapacityUnits(provisionedReadCapacityUnits: Number) {
        cdkBuilder.provisionedReadCapacityUnits(provisionedReadCapacityUnits)
      }

      override fun provisionedWriteCapacityUnits(provisionedWriteCapacityUnits: Number) {
        cdkBuilder.provisionedWriteCapacityUnits(provisionedWriteCapacityUnits)
      }

      override fun throughputMode(throughputMode: String) {
        cdkBuilder.throughputMode(throughputMode)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty,
    ) : ThroughputConfigProperty {
      override fun provisionedReadCapacityUnits(): Number? =
          unwrap(this).getProvisionedReadCapacityUnits()

      override fun provisionedWriteCapacityUnits(): Number? =
          unwrap(this).getProvisionedWriteCapacityUnits()

      override fun throughputMode(): String = unwrap(this).getThroughputMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThroughputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty):
          ThroughputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThroughputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.ThroughputConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OnlineStoreSecurityConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty,
    ) : OnlineStoreSecurityConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnlineStoreSecurityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty):
          OnlineStoreSecurityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnlineStoreSecurityConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreSecurityConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FeatureDefinitionProperty {
    public fun featureName(): String

    public fun featureType(): String

    public interface Builder {
      public fun featureName(featureName: String)

      public fun featureType(featureType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty.builder()

      override fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
      }

      override fun featureType(featureType: String) {
        cdkBuilder.featureType(featureType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty,
    ) : FeatureDefinitionProperty {
      override fun featureName(): String = unwrap(this).getFeatureName()

      override fun featureType(): String = unwrap(this).getFeatureType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FeatureDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty):
          FeatureDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FeatureDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.FeatureDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataCatalogConfigProperty {
    public fun catalog(): String

    public fun database(): String

    public fun tableName(): String

    public interface Builder {
      public fun catalog(catalog: String)

      public fun database(database: String)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty.builder()

      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty,
    ) : DataCatalogConfigProperty {
      override fun catalog(): String = unwrap(this).getCatalog()

      override fun database(): String = unwrap(this).getDatabase()

      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataCatalogConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty):
          DataCatalogConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.DataCatalogConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TtlDurationProperty {
    public fun unit(): String? = unwrap(this).getUnit()

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun unit(unit: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty.builder()

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty,
    ) : TtlDurationProperty {
      override fun unit(): String? = unwrap(this).getUnit()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TtlDurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty):
          TtlDurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TtlDurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.TtlDurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OnlineStoreConfigProperty {
    public fun enableOnlineStore(): Any? = unwrap(this).getEnableOnlineStore()

    public fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

    public fun storageType(): String? = unwrap(this).getStorageType()

    public fun ttlDuration(): Any? = unwrap(this).getTtlDuration()

    public interface Builder {
      public fun enableOnlineStore(enableOnlineStore: Boolean)

      public fun enableOnlineStore(enableOnlineStore: IResolvable)

      public fun securityConfig(securityConfig: IResolvable)

      public fun securityConfig(securityConfig: OnlineStoreSecurityConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73f873d31d41619f0d72a0f13cfd0f2e7d0de00346b39a50ebd5118695396812")
      public
          fun securityConfig(securityConfig: OnlineStoreSecurityConfigProperty.Builder.() -> Unit)

      public fun storageType(storageType: String)

      public fun ttlDuration(ttlDuration: IResolvable)

      public fun ttlDuration(ttlDuration: TtlDurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb1b501373f2a46a285536f1241140627190292598e965d8a4636541a81400e7")
      public fun ttlDuration(ttlDuration: TtlDurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty.builder()

      override fun enableOnlineStore(enableOnlineStore: Boolean) {
        cdkBuilder.enableOnlineStore(enableOnlineStore)
      }

      override fun enableOnlineStore(enableOnlineStore: IResolvable) {
        cdkBuilder.enableOnlineStore(enableOnlineStore.let(IResolvable::unwrap))
      }

      override fun securityConfig(securityConfig: IResolvable) {
        cdkBuilder.securityConfig(securityConfig.let(IResolvable::unwrap))
      }

      override fun securityConfig(securityConfig: OnlineStoreSecurityConfigProperty) {
        cdkBuilder.securityConfig(securityConfig.let(OnlineStoreSecurityConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73f873d31d41619f0d72a0f13cfd0f2e7d0de00346b39a50ebd5118695396812")
      override
          fun securityConfig(securityConfig: OnlineStoreSecurityConfigProperty.Builder.() -> Unit):
          Unit = securityConfig(OnlineStoreSecurityConfigProperty(securityConfig))

      override fun storageType(storageType: String) {
        cdkBuilder.storageType(storageType)
      }

      override fun ttlDuration(ttlDuration: IResolvable) {
        cdkBuilder.ttlDuration(ttlDuration.let(IResolvable::unwrap))
      }

      override fun ttlDuration(ttlDuration: TtlDurationProperty) {
        cdkBuilder.ttlDuration(ttlDuration.let(TtlDurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb1b501373f2a46a285536f1241140627190292598e965d8a4636541a81400e7")
      override fun ttlDuration(ttlDuration: TtlDurationProperty.Builder.() -> Unit): Unit =
          ttlDuration(TtlDurationProperty(ttlDuration))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty,
    ) : OnlineStoreConfigProperty {
      override fun enableOnlineStore(): Any? = unwrap(this).getEnableOnlineStore()

      override fun securityConfig(): Any? = unwrap(this).getSecurityConfig()

      override fun storageType(): String? = unwrap(this).getStorageType()

      override fun ttlDuration(): Any? = unwrap(this).getTtlDuration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnlineStoreConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty):
          OnlineStoreConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnlineStoreConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.OnlineStoreConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3StorageConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun s3Uri(): String

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty,
    ) : S3StorageConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3StorageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty):
          S3StorageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3StorageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnFeatureGroup.S3StorageConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
