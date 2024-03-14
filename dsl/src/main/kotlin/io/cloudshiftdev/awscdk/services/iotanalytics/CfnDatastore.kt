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

public open class CfnDatastore internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun datastoreName(): String? = unwrap(this).getDatastoreName()

  public open fun datastoreName(`value`: String) {
    unwrap(this).setDatastoreName(`value`)
  }

  public open fun datastorePartitions(): Any? = unwrap(this).getDatastorePartitions()

  public open fun datastorePartitions(`value`: IResolvable) {
    unwrap(this).setDatastorePartitions(`value`.let(IResolvable::unwrap))
  }

  public open fun datastorePartitions(`value`: DatastorePartitionsProperty) {
    unwrap(this).setDatastorePartitions(`value`.let(DatastorePartitionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e911e57e9c60a55a021ebfb100e79165d58e541fce4cc91b448dfe0abe030be")
  public open fun datastorePartitions(`value`: DatastorePartitionsProperty.Builder.() -> Unit): Unit
      = datastorePartitions(DatastorePartitionsProperty(`value`))

  public open fun datastoreStorage(): Any? = unwrap(this).getDatastoreStorage()

  public open fun datastoreStorage(`value`: IResolvable) {
    unwrap(this).setDatastoreStorage(`value`.let(IResolvable::unwrap))
  }

  public open fun datastoreStorage(`value`: DatastoreStorageProperty) {
    unwrap(this).setDatastoreStorage(`value`.let(DatastoreStorageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfd94dd7d10cc8488debe966f6b1d1b15d506abd59321dce52327e1b3df1ae5f")
  public open fun datastoreStorage(`value`: DatastoreStorageProperty.Builder.() -> Unit): Unit =
      datastoreStorage(DatastoreStorageProperty(`value`))

  public open fun fileFormatConfiguration(): Any? = unwrap(this).getFileFormatConfiguration()

  public open fun fileFormatConfiguration(`value`: IResolvable) {
    unwrap(this).setFileFormatConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun fileFormatConfiguration(`value`: FileFormatConfigurationProperty) {
    unwrap(this).setFileFormatConfiguration(`value`.let(FileFormatConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("502cf3017f6f0380bcdd7f72d65be2351f36101115c19646417d099e63bbfe39")
  public open
      fun fileFormatConfiguration(`value`: FileFormatConfigurationProperty.Builder.() -> Unit): Unit
      = fileFormatConfiguration(FileFormatConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  public open fun retentionPeriod(`value`: IResolvable) {
    unwrap(this).setRetentionPeriod(`value`.let(IResolvable::unwrap))
  }

  public open fun retentionPeriod(`value`: RetentionPeriodProperty) {
    unwrap(this).setRetentionPeriod(`value`.let(RetentionPeriodProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ea9cb497dff2740d5a5bcf2ca94646fef8d139cf3602802084ac68170a37c24")
  public open fun retentionPeriod(`value`: RetentionPeriodProperty.Builder.() -> Unit): Unit =
      retentionPeriod(RetentionPeriodProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun datastoreName(datastoreName: String)

    public fun datastorePartitions(datastorePartitions: IResolvable)

    public fun datastorePartitions(datastorePartitions: DatastorePartitionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35d75580ada733c689a04ca35419661cb84e009843e7f386a19fcfcc775f4ea4")
    public
        fun datastorePartitions(datastorePartitions: DatastorePartitionsProperty.Builder.() -> Unit)

    public fun datastoreStorage(datastoreStorage: IResolvable)

    public fun datastoreStorage(datastoreStorage: DatastoreStorageProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d74173f897723d0dbb0c52095b8dd1bc4397a08f4a5283a8da5be0e5812552e6")
    public fun datastoreStorage(datastoreStorage: DatastoreStorageProperty.Builder.() -> Unit)

    public fun fileFormatConfiguration(fileFormatConfiguration: IResolvable)

    public fun fileFormatConfiguration(fileFormatConfiguration: FileFormatConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea346d9f6f29b6918210b47f5498d9879180f41ae5d75079a352471b1d5b27f2")
    public
        fun fileFormatConfiguration(fileFormatConfiguration: FileFormatConfigurationProperty.Builder.() -> Unit)

    public fun retentionPeriod(retentionPeriod: IResolvable)

    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3879f84a0ef25cb591320f2a5bf8b1583a0f73d5d5409c1928435a8f04683d9")
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnDatastore.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnDatastore.Builder.create(scope, id)

    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    override fun datastorePartitions(datastorePartitions: IResolvable) {
      cdkBuilder.datastorePartitions(datastorePartitions.let(IResolvable::unwrap))
    }

    override fun datastorePartitions(datastorePartitions: DatastorePartitionsProperty) {
      cdkBuilder.datastorePartitions(datastorePartitions.let(DatastorePartitionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35d75580ada733c689a04ca35419661cb84e009843e7f386a19fcfcc775f4ea4")
    override
        fun datastorePartitions(datastorePartitions: DatastorePartitionsProperty.Builder.() -> Unit):
        Unit = datastorePartitions(DatastorePartitionsProperty(datastorePartitions))

    override fun datastoreStorage(datastoreStorage: IResolvable) {
      cdkBuilder.datastoreStorage(datastoreStorage.let(IResolvable::unwrap))
    }

    override fun datastoreStorage(datastoreStorage: DatastoreStorageProperty) {
      cdkBuilder.datastoreStorage(datastoreStorage.let(DatastoreStorageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d74173f897723d0dbb0c52095b8dd1bc4397a08f4a5283a8da5be0e5812552e6")
    override fun datastoreStorage(datastoreStorage: DatastoreStorageProperty.Builder.() -> Unit):
        Unit = datastoreStorage(DatastoreStorageProperty(datastoreStorage))

    override fun fileFormatConfiguration(fileFormatConfiguration: IResolvable) {
      cdkBuilder.fileFormatConfiguration(fileFormatConfiguration.let(IResolvable::unwrap))
    }

    override fun fileFormatConfiguration(fileFormatConfiguration: FileFormatConfigurationProperty) {
      cdkBuilder.fileFormatConfiguration(fileFormatConfiguration.let(FileFormatConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea346d9f6f29b6918210b47f5498d9879180f41ae5d75079a352471b1d5b27f2")
    override
        fun fileFormatConfiguration(fileFormatConfiguration: FileFormatConfigurationProperty.Builder.() -> Unit):
        Unit = fileFormatConfiguration(FileFormatConfigurationProperty(fileFormatConfiguration))

    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(RetentionPeriodProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3879f84a0ef25cb591320f2a5bf8b1583a0f73d5d5409c1928435a8f04683d9")
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit): Unit
        = retentionPeriod(RetentionPeriodProperty(retentionPeriod))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDatastore =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatastore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatastore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore):
        CfnDatastore = CfnDatastore(cdkObject)

    internal fun unwrap(wrapped: CfnDatastore):
        software.amazon.awscdk.services.iotanalytics.CfnDatastore = wrapped.cdkObject
  }

  public interface DatastorePartitionsProperty {
    public fun partitions(): Any? = unwrap(this).getPartitions()

    public interface Builder {
      public fun partitions(partitions: IResolvable)

      public fun partitions(partitions: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty.builder()

      override fun partitions(partitions: IResolvable) {
        cdkBuilder.partitions(partitions.let(IResolvable::unwrap))
      }

      override fun partitions(partitions: List<Any>) {
        cdkBuilder.partitions(partitions)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty,
    ) : DatastorePartitionsProperty {
      override fun partitions(): Any? = unwrap(this).getPartitions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatastorePartitionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty):
          DatastorePartitionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatastorePartitionsProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ColumnProperty {
    public fun name(): String

    public fun type(): String

    public interface Builder {
      public fun name(name: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty,
    ) : ColumnProperty {
      override fun name(): String = unwrap(this).getName()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty):
          ColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IotSiteWiseMultiLayerStorageProperty {
    public fun customerManagedS3Storage(): Any? = unwrap(this).getCustomerManagedS3Storage()

    public interface Builder {
      public fun customerManagedS3Storage(customerManagedS3Storage: IResolvable)

      public
          fun customerManagedS3Storage(customerManagedS3Storage: CustomerManagedS3StorageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a22945323d518fe4f389f03e55fe2e3851e104f380a566bfe61d268c55c8026")
      public
          fun customerManagedS3Storage(customerManagedS3Storage: CustomerManagedS3StorageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty.builder()

      override fun customerManagedS3Storage(customerManagedS3Storage: IResolvable) {
        cdkBuilder.customerManagedS3Storage(customerManagedS3Storage.let(IResolvable::unwrap))
      }

      override
          fun customerManagedS3Storage(customerManagedS3Storage: CustomerManagedS3StorageProperty) {
        cdkBuilder.customerManagedS3Storage(customerManagedS3Storage.let(CustomerManagedS3StorageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a22945323d518fe4f389f03e55fe2e3851e104f380a566bfe61d268c55c8026")
      override
          fun customerManagedS3Storage(customerManagedS3Storage: CustomerManagedS3StorageProperty.Builder.() -> Unit):
          Unit =
          customerManagedS3Storage(CustomerManagedS3StorageProperty(customerManagedS3Storage))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty,
    ) : IotSiteWiseMultiLayerStorageProperty {
      override fun customerManagedS3Storage(): Any? = unwrap(this).getCustomerManagedS3Storage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IotSiteWiseMultiLayerStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty):
          IotSiteWiseMultiLayerStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotSiteWiseMultiLayerStorageProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty
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
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.builder()

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
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty):
          RetentionPeriodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomerManagedS3Property {
    public fun bucket(): String

    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    public fun roleArn(): String

    public interface Builder {
      public fun bucket(bucket: String)

      public fun keyPrefix(keyPrefix: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property,
    ) : CustomerManagedS3Property {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomerManagedS3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property):
          CustomerManagedS3Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedS3Property):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ParquetConfigurationProperty {
    public fun schemaDefinition(): Any? = unwrap(this).getSchemaDefinition()

    public interface Builder {
      public fun schemaDefinition(schemaDefinition: IResolvable)

      public fun schemaDefinition(schemaDefinition: SchemaDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d666703f2b9cf5d1c319939feb1f61fca98f5e4f0c4178bc8b6999d3cae2876")
      public fun schemaDefinition(schemaDefinition: SchemaDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty.builder()

      override fun schemaDefinition(schemaDefinition: IResolvable) {
        cdkBuilder.schemaDefinition(schemaDefinition.let(IResolvable::unwrap))
      }

      override fun schemaDefinition(schemaDefinition: SchemaDefinitionProperty) {
        cdkBuilder.schemaDefinition(schemaDefinition.let(SchemaDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d666703f2b9cf5d1c319939feb1f61fca98f5e4f0c4178bc8b6999d3cae2876")
      override fun schemaDefinition(schemaDefinition: SchemaDefinitionProperty.Builder.() -> Unit):
          Unit = schemaDefinition(SchemaDefinitionProperty(schemaDefinition))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty,
    ) : ParquetConfigurationProperty {
      override fun schemaDefinition(): Any? = unwrap(this).getSchemaDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParquetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty):
          ParquetConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParquetConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatastorePartitionProperty {
    public fun partition(): Any? = unwrap(this).getPartition()

    public fun timestampPartition(): Any? = unwrap(this).getTimestampPartition()

    public interface Builder {
      public fun partition(partition: IResolvable)

      public fun partition(partition: PartitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8439126f746cf3a8f4362b58981ce9aebbb8f7615e87f87b29ffd402c6be64c3")
      public fun partition(partition: PartitionProperty.Builder.() -> Unit)

      public fun timestampPartition(timestampPartition: IResolvable)

      public fun timestampPartition(timestampPartition: TimestampPartitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3037a51e44c948d3294c744b1a9422a51f76756a00534f969ea9fa88f52d1b4d")
      public
          fun timestampPartition(timestampPartition: TimestampPartitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty.builder()

      override fun partition(partition: IResolvable) {
        cdkBuilder.partition(partition.let(IResolvable::unwrap))
      }

      override fun partition(partition: PartitionProperty) {
        cdkBuilder.partition(partition.let(PartitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8439126f746cf3a8f4362b58981ce9aebbb8f7615e87f87b29ffd402c6be64c3")
      override fun partition(partition: PartitionProperty.Builder.() -> Unit): Unit =
          partition(PartitionProperty(partition))

      override fun timestampPartition(timestampPartition: IResolvable) {
        cdkBuilder.timestampPartition(timestampPartition.let(IResolvable::unwrap))
      }

      override fun timestampPartition(timestampPartition: TimestampPartitionProperty) {
        cdkBuilder.timestampPartition(timestampPartition.let(TimestampPartitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3037a51e44c948d3294c744b1a9422a51f76756a00534f969ea9fa88f52d1b4d")
      override
          fun timestampPartition(timestampPartition: TimestampPartitionProperty.Builder.() -> Unit):
          Unit = timestampPartition(TimestampPartitionProperty(timestampPartition))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty,
    ) : DatastorePartitionProperty {
      override fun partition(): Any? = unwrap(this).getPartition()

      override fun timestampPartition(): Any? = unwrap(this).getTimestampPartition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatastorePartitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty):
          DatastorePartitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatastorePartitionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SchemaDefinitionProperty {
    public fun columns(): Any? = unwrap(this).getColumns()

    public interface Builder {
      public fun columns(columns: IResolvable)

      public fun columns(columns: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty.builder()

      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty,
    ) : SchemaDefinitionProperty {
      override fun columns(): Any? = unwrap(this).getColumns()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty):
          SchemaDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaDefinitionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimestampPartitionProperty {
    public fun attributeName(): String

    public fun timestampFormat(): String? = unwrap(this).getTimestampFormat()

    public interface Builder {
      public fun attributeName(attributeName: String)

      public fun timestampFormat(timestampFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      override fun timestampFormat(timestampFormat: String) {
        cdkBuilder.timestampFormat(timestampFormat)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty,
    ) : TimestampPartitionProperty {
      override fun attributeName(): String = unwrap(this).getAttributeName()

      override fun timestampFormat(): String? = unwrap(this).getTimestampFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimestampPartitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty):
          TimestampPartitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestampPartitionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatastoreStorageProperty {
    public fun customerManagedS3(): Any? = unwrap(this).getCustomerManagedS3()

    public fun iotSiteWiseMultiLayerStorage(): Any? = unwrap(this).getIotSiteWiseMultiLayerStorage()

    public fun serviceManagedS3(): Any? = unwrap(this).getServiceManagedS3()

    public interface Builder {
      public fun customerManagedS3(customerManagedS3: IResolvable)

      public fun customerManagedS3(customerManagedS3: CustomerManagedS3Property)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db93fa23691d2a76a837e35b909edd252cd2570b4e702239fdcf1282f5fe39b0")
      public fun customerManagedS3(customerManagedS3: CustomerManagedS3Property.Builder.() -> Unit)

      public fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IResolvable)

      public
          fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IotSiteWiseMultiLayerStorageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a771d51564caa9fb338a8d40e41ca0feda16c9d5bad70e093add4c89fe4a3df")
      public
          fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IotSiteWiseMultiLayerStorageProperty.Builder.() -> Unit)

      public fun serviceManagedS3(serviceManagedS3: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty.builder()

      override fun customerManagedS3(customerManagedS3: IResolvable) {
        cdkBuilder.customerManagedS3(customerManagedS3.let(IResolvable::unwrap))
      }

      override fun customerManagedS3(customerManagedS3: CustomerManagedS3Property) {
        cdkBuilder.customerManagedS3(customerManagedS3.let(CustomerManagedS3Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db93fa23691d2a76a837e35b909edd252cd2570b4e702239fdcf1282f5fe39b0")
      override
          fun customerManagedS3(customerManagedS3: CustomerManagedS3Property.Builder.() -> Unit):
          Unit = customerManagedS3(CustomerManagedS3Property(customerManagedS3))

      override fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IResolvable) {
        cdkBuilder.iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage.let(IResolvable::unwrap))
      }

      override
          fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IotSiteWiseMultiLayerStorageProperty) {
        cdkBuilder.iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage.let(IotSiteWiseMultiLayerStorageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a771d51564caa9fb338a8d40e41ca0feda16c9d5bad70e093add4c89fe4a3df")
      override
          fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IotSiteWiseMultiLayerStorageProperty.Builder.() -> Unit):
          Unit =
          iotSiteWiseMultiLayerStorage(IotSiteWiseMultiLayerStorageProperty(iotSiteWiseMultiLayerStorage))

      override fun serviceManagedS3(serviceManagedS3: Any) {
        cdkBuilder.serviceManagedS3(serviceManagedS3)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty,
    ) : DatastoreStorageProperty {
      override fun customerManagedS3(): Any? = unwrap(this).getCustomerManagedS3()

      override fun iotSiteWiseMultiLayerStorage(): Any? =
          unwrap(this).getIotSiteWiseMultiLayerStorage()

      override fun serviceManagedS3(): Any? = unwrap(this).getServiceManagedS3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatastoreStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty):
          DatastoreStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatastoreStorageProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FileFormatConfigurationProperty {
    public fun jsonConfiguration(): Any? = unwrap(this).getJsonConfiguration()

    public fun parquetConfiguration(): Any? = unwrap(this).getParquetConfiguration()

    public interface Builder {
      public fun jsonConfiguration(jsonConfiguration: Any)

      public fun parquetConfiguration(parquetConfiguration: IResolvable)

      public fun parquetConfiguration(parquetConfiguration: ParquetConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc6d886e893ece820e20999d82437c32b2c12dff2ff41a2321a5f17eb1ef449")
      public
          fun parquetConfiguration(parquetConfiguration: ParquetConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty.builder()

      override fun jsonConfiguration(jsonConfiguration: Any) {
        cdkBuilder.jsonConfiguration(jsonConfiguration)
      }

      override fun parquetConfiguration(parquetConfiguration: IResolvable) {
        cdkBuilder.parquetConfiguration(parquetConfiguration.let(IResolvable::unwrap))
      }

      override fun parquetConfiguration(parquetConfiguration: ParquetConfigurationProperty) {
        cdkBuilder.parquetConfiguration(parquetConfiguration.let(ParquetConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc6d886e893ece820e20999d82437c32b2c12dff2ff41a2321a5f17eb1ef449")
      override
          fun parquetConfiguration(parquetConfiguration: ParquetConfigurationProperty.Builder.() -> Unit):
          Unit = parquetConfiguration(ParquetConfigurationProperty(parquetConfiguration))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty,
    ) : FileFormatConfigurationProperty {
      override fun jsonConfiguration(): Any? = unwrap(this).getJsonConfiguration()

      override fun parquetConfiguration(): Any? = unwrap(this).getParquetConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileFormatConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty):
          FileFormatConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileFormatConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PartitionProperty {
    public fun attributeName(): String

    public interface Builder {
      public fun attributeName(attributeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty.builder()

      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty,
    ) : PartitionProperty {
      override fun attributeName(): String = unwrap(this).getAttributeName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PartitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty):
          PartitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PartitionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomerManagedS3StorageProperty {
    public fun bucket(): String

    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun keyPrefix(keyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty,
    ) : CustomerManagedS3StorageProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomerManagedS3StorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty):
          CustomerManagedS3StorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedS3StorageProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
