package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTable internal constructor(
  private val cdkObject: software.amazon.awscdk.services.timestream.CfnTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun magneticStoreWriteProperties(): Any? =
      unwrap(this).getMagneticStoreWriteProperties()

  public open fun magneticStoreWriteProperties(`value`: Any) {
    unwrap(this).setMagneticStoreWriteProperties(`value`)
  }

  public open fun retentionProperties(): Any? = unwrap(this).getRetentionProperties()

  public open fun retentionProperties(`value`: Any) {
    unwrap(this).setRetentionProperties(`value`)
  }

  public open fun schema(): Any? = unwrap(this).getSchema()

  public open fun schema(`value`: IResolvable) {
    unwrap(this).setSchema(`value`.let(IResolvable::unwrap))
  }

  public open fun schema(`value`: SchemaProperty) {
    unwrap(this).setSchema(`value`.let(SchemaProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("898ec461486903bfb2f445f8579fd860b99ac9ac5c95b607446ed45b49d10513")
  public open fun schema(`value`: SchemaProperty.Builder.() -> Unit): Unit =
      schema(SchemaProperty(`value`))

  public open fun tableName(): String? = unwrap(this).getTableName()

  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun databaseName(databaseName: String) {
    }

    public fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any) {
    }

    public fun retentionProperties(retentionProperties: Any) {
    }

    public fun schema(schema: IResolvable) {
    }

    public fun schema(schema: SchemaProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21bcbf5f6346b7e1bf71608e43f5642d4324e83cf893c4df218d01acd50a40e9")
    public fun schema(schema: SchemaProperty.Builder.() -> Unit) {
    }

    public fun tableName(tableName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.timestream.CfnTable.Builder =
        software.amazon.awscdk.services.timestream.CfnTable.Builder.create(scope, id)

    public override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    public override fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any) {
      cdkBuilder.magneticStoreWriteProperties(magneticStoreWriteProperties)
    }

    public override fun retentionProperties(retentionProperties: Any) {
      cdkBuilder.retentionProperties(retentionProperties)
    }

    public override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    public override fun schema(schema: SchemaProperty) {
      cdkBuilder.schema(schema.let(SchemaProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21bcbf5f6346b7e1bf71608e43f5642d4324e83cf893c4df218d01acd50a40e9")
    public override fun schema(schema: SchemaProperty.Builder.() -> Unit): Unit =
        schema(SchemaProperty(schema))

    public override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.timestream.CfnTable = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.timestream.CfnTable =
        wrapped.cdkObject
  }

  public interface MagneticStoreWritePropertiesProperty {
    public fun enableMagneticStoreWrites(): Any

    public fun magneticStoreRejectedDataLocation(): Any? =
        unwrap(this).getMagneticStoreRejectedDataLocation()

    public interface Builder {
      public fun enableMagneticStoreWrites(enableMagneticStoreWrites: Boolean) {
      }

      public fun enableMagneticStoreWrites(enableMagneticStoreWrites: IResolvable) {
      }

      public fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: IResolvable) {
      }

      public
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: MagneticStoreRejectedDataLocationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c569486247805444394ade6f2fe0afbacaa1cd8b23b4f320fb2d85c552783ecb")
      public
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: MagneticStoreRejectedDataLocationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty.builder()

      public override fun enableMagneticStoreWrites(enableMagneticStoreWrites: Boolean) {
        cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites)
      }

      public override fun enableMagneticStoreWrites(enableMagneticStoreWrites: IResolvable) {
        cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites.let(IResolvable::unwrap))
      }

      public override
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: IResolvable) {
        cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation.let(IResolvable::unwrap))
      }

      public override
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: MagneticStoreRejectedDataLocationProperty) {
        cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation.let(MagneticStoreRejectedDataLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c569486247805444394ade6f2fe0afbacaa1cd8b23b4f320fb2d85c552783ecb")
      public override
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: MagneticStoreRejectedDataLocationProperty.Builder.() -> Unit):
          Unit =
          magneticStoreRejectedDataLocation(MagneticStoreRejectedDataLocationProperty(magneticStoreRejectedDataLocation))

      public fun build():
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty,
    ) : MagneticStoreWritePropertiesProperty {
      public override fun enableMagneticStoreWrites(): Any =
          unwrap(this).getEnableMagneticStoreWrites()

      public override fun magneticStoreRejectedDataLocation(): Any? =
          unwrap(this).getMagneticStoreRejectedDataLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MagneticStoreWritePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty):
          MagneticStoreWritePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MagneticStoreWritePropertiesProperty):
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ConfigurationProperty {
    public fun bucketName(): String

    public fun encryptionOption(): String

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }

      public fun encryptionOption(encryptionOption: String) {
      }

      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun objectKeyPrefix(objectKeyPrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty.Builder =
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public override fun encryptionOption(encryptionOption: String) {
        cdkBuilder.encryptionOption(encryptionOption)
      }

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty,
    ) : S3ConfigurationProperty {
      public override fun bucketName(): String = unwrap(this).getBucketName()

      public override fun encryptionOption(): String = unwrap(this).getEncryptionOption()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty):
          S3ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MagneticStoreRejectedDataLocationProperty {
    public fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

    public interface Builder {
      public fun s3Configuration(s3Configuration: IResolvable) {
      }

      public fun s3Configuration(s3Configuration: S3ConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10e1eb1148b8aba7ae6adac45f114bd752ea2d64d79ab505728e036970edb4c7")
      public fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty.builder()

      public override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      public override fun s3Configuration(s3Configuration: S3ConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3ConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10e1eb1148b8aba7ae6adac45f114bd752ea2d64d79ab505728e036970edb4c7")
      public override
          fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit): Unit =
          s3Configuration(S3ConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty,
    ) : MagneticStoreRejectedDataLocationProperty {
      public override fun s3Configuration(): Any? = unwrap(this).getS3Configuration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MagneticStoreRejectedDataLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty):
          MagneticStoreRejectedDataLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MagneticStoreRejectedDataLocationProperty):
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PartitionKeyProperty {
    public fun enforcementInRecord(): String? = unwrap(this).getEnforcementInRecord()

    public fun name(): String? = unwrap(this).getName()

    public fun type(): String

    public interface Builder {
      public fun enforcementInRecord(enforcementInRecord: String) {
      }

      public fun name(name: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty.Builder =
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty.builder()

      public override fun enforcementInRecord(enforcementInRecord: String) {
        cdkBuilder.enforcementInRecord(enforcementInRecord)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty,
    ) : PartitionKeyProperty {
      public override fun enforcementInRecord(): String? = unwrap(this).getEnforcementInRecord()

      public override fun name(): String? = unwrap(this).getName()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PartitionKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty):
          PartitionKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PartitionKeyProperty):
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SchemaProperty {
    public fun compositePartitionKey(): Any? = unwrap(this).getCompositePartitionKey()

    public interface Builder {
      public fun compositePartitionKey(compositePartitionKey: IResolvable) {
      }

      public fun compositePartitionKey(compositePartitionKey: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty.Builder =
          software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty.builder()

      public override fun compositePartitionKey(compositePartitionKey: IResolvable) {
        cdkBuilder.compositePartitionKey(compositePartitionKey.let(IResolvable::unwrap))
      }

      public override fun compositePartitionKey(compositePartitionKey: List<Any>) {
        cdkBuilder.compositePartitionKey(compositePartitionKey)
      }

      public fun build(): software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty,
    ) : SchemaProperty {
      public override fun compositePartitionKey(): Any? = unwrap(this).getCompositePartitionKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty):
          SchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaProperty):
          software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RetentionPropertiesProperty {
    public fun magneticStoreRetentionPeriodInDays(): String? =
        unwrap(this).getMagneticStoreRetentionPeriodInDays()

    public fun memoryStoreRetentionPeriodInHours(): String? =
        unwrap(this).getMemoryStoreRetentionPeriodInHours()

    public interface Builder {
      public fun magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays: String) {
      }

      public fun memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty.Builder =
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty.builder()

      public override
          fun magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays: String) {
        cdkBuilder.magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays)
      }

      public override
          fun memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours: String) {
        cdkBuilder.memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty,
    ) : RetentionPropertiesProperty {
      public override fun magneticStoreRetentionPeriodInDays(): String? =
          unwrap(this).getMagneticStoreRetentionPeriodInDays()

      public override fun memoryStoreRetentionPeriodInHours(): String? =
          unwrap(this).getMemoryStoreRetentionPeriodInHours()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty):
          RetentionPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPropertiesProperty):
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
