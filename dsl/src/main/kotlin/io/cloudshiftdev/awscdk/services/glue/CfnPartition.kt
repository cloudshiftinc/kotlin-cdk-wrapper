package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnPartition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnPartition,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun catalogId(): String = unwrap(this).getCatalogId()

  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun partitionInput(): Any = unwrap(this).getPartitionInput()

  public open fun partitionInput(`value`: IResolvable) {
    unwrap(this).setPartitionInput(`value`.let(IResolvable::unwrap))
  }

  public open fun partitionInput(`value`: PartitionInputProperty) {
    unwrap(this).setPartitionInput(`value`.let(PartitionInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c8b7d437210edad061772e588456f864d5cbcef2396715fd8ba0547b1a28f51")
  public open fun partitionInput(`value`: PartitionInputProperty.Builder.() -> Unit): Unit =
      partitionInput(PartitionInputProperty(`value`))

  public open fun tableName(): String = unwrap(this).getTableName()

  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun databaseName(databaseName: String)

    public fun partitionInput(partitionInput: IResolvable)

    public fun partitionInput(partitionInput: PartitionInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13310d4b97ab5623df3f0de1f1e4731127a740a13dc005d8ef2bae156d6b2973")
    public fun partitionInput(partitionInput: PartitionInputProperty.Builder.() -> Unit)

    public fun tableName(tableName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnPartition.Builder =
        software.amazon.awscdk.services.glue.CfnPartition.Builder.create(scope, id)

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun partitionInput(partitionInput: IResolvable) {
      cdkBuilder.partitionInput(partitionInput.let(IResolvable::unwrap))
    }

    override fun partitionInput(partitionInput: PartitionInputProperty) {
      cdkBuilder.partitionInput(partitionInput.let(PartitionInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13310d4b97ab5623df3f0de1f1e4731127a740a13dc005d8ef2bae156d6b2973")
    override fun partitionInput(partitionInput: PartitionInputProperty.Builder.() -> Unit): Unit =
        partitionInput(PartitionInputProperty(partitionInput))

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnPartition = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPartition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPartition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition): CfnPartition =
        CfnPartition(cdkObject)

    internal fun unwrap(wrapped: CfnPartition): software.amazon.awscdk.services.glue.CfnPartition =
        wrapped.cdkObject
  }

  public interface StorageDescriptorProperty {
    public fun bucketColumns(): List<String> = unwrap(this).getBucketColumns() ?: emptyList()

    public fun columns(): Any? = unwrap(this).getColumns()

    public fun compressed(): Any? = unwrap(this).getCompressed()

    public fun inputFormat(): String? = unwrap(this).getInputFormat()

    public fun location(): String? = unwrap(this).getLocation()

    public fun numberOfBuckets(): Number? = unwrap(this).getNumberOfBuckets()

    public fun outputFormat(): String? = unwrap(this).getOutputFormat()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun schemaReference(): Any? = unwrap(this).getSchemaReference()

    public fun serdeInfo(): Any? = unwrap(this).getSerdeInfo()

    public fun skewedInfo(): Any? = unwrap(this).getSkewedInfo()

    public fun sortColumns(): Any? = unwrap(this).getSortColumns()

    public fun storedAsSubDirectories(): Any? = unwrap(this).getStoredAsSubDirectories()

    public interface Builder {
      public fun bucketColumns(bucketColumns: List<String>)

      public fun bucketColumns(vararg bucketColumns: String)

      public fun columns(columns: IResolvable)

      public fun columns(columns: List<Any>)

      public fun columns(vararg columns: Any)

      public fun compressed(compressed: Boolean)

      public fun compressed(compressed: IResolvable)

      public fun inputFormat(inputFormat: String)

      public fun location(location: String)

      public fun numberOfBuckets(numberOfBuckets: Number)

      public fun outputFormat(outputFormat: String)

      public fun parameters(parameters: Any)

      public fun schemaReference(schemaReference: IResolvable)

      public fun schemaReference(schemaReference: SchemaReferenceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9c3efe0adf91e48ecefaa9660eab15f934953dd0f18001f7d18c407fddf154b")
      public fun schemaReference(schemaReference: SchemaReferenceProperty.Builder.() -> Unit)

      public fun serdeInfo(serdeInfo: IResolvable)

      public fun serdeInfo(serdeInfo: SerdeInfoProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85c29376465bc74bcec0b7af8368bb60b1c26650f328b4ec2ec02f9246c9802c")
      public fun serdeInfo(serdeInfo: SerdeInfoProperty.Builder.() -> Unit)

      public fun skewedInfo(skewedInfo: IResolvable)

      public fun skewedInfo(skewedInfo: SkewedInfoProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec641bc1fd863bb5524801e42a8d83f6d4af25f62d31ac79f4aae85a2b277a89")
      public fun skewedInfo(skewedInfo: SkewedInfoProperty.Builder.() -> Unit)

      public fun sortColumns(sortColumns: IResolvable)

      public fun sortColumns(sortColumns: List<Any>)

      public fun sortColumns(vararg sortColumns: Any)

      public fun storedAsSubDirectories(storedAsSubDirectories: Boolean)

      public fun storedAsSubDirectories(storedAsSubDirectories: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty.builder()

      override fun bucketColumns(bucketColumns: List<String>) {
        cdkBuilder.bucketColumns(bucketColumns)
      }

      override fun bucketColumns(vararg bucketColumns: String): Unit =
          bucketColumns(bucketColumns.toList())

      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      override fun compressed(compressed: Boolean) {
        cdkBuilder.compressed(compressed)
      }

      override fun compressed(compressed: IResolvable) {
        cdkBuilder.compressed(compressed.let(IResolvable::unwrap))
      }

      override fun inputFormat(inputFormat: String) {
        cdkBuilder.inputFormat(inputFormat)
      }

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun numberOfBuckets(numberOfBuckets: Number) {
        cdkBuilder.numberOfBuckets(numberOfBuckets)
      }

      override fun outputFormat(outputFormat: String) {
        cdkBuilder.outputFormat(outputFormat)
      }

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      override fun schemaReference(schemaReference: IResolvable) {
        cdkBuilder.schemaReference(schemaReference.let(IResolvable::unwrap))
      }

      override fun schemaReference(schemaReference: SchemaReferenceProperty) {
        cdkBuilder.schemaReference(schemaReference.let(SchemaReferenceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9c3efe0adf91e48ecefaa9660eab15f934953dd0f18001f7d18c407fddf154b")
      override fun schemaReference(schemaReference: SchemaReferenceProperty.Builder.() -> Unit):
          Unit = schemaReference(SchemaReferenceProperty(schemaReference))

      override fun serdeInfo(serdeInfo: IResolvable) {
        cdkBuilder.serdeInfo(serdeInfo.let(IResolvable::unwrap))
      }

      override fun serdeInfo(serdeInfo: SerdeInfoProperty) {
        cdkBuilder.serdeInfo(serdeInfo.let(SerdeInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85c29376465bc74bcec0b7af8368bb60b1c26650f328b4ec2ec02f9246c9802c")
      override fun serdeInfo(serdeInfo: SerdeInfoProperty.Builder.() -> Unit): Unit =
          serdeInfo(SerdeInfoProperty(serdeInfo))

      override fun skewedInfo(skewedInfo: IResolvable) {
        cdkBuilder.skewedInfo(skewedInfo.let(IResolvable::unwrap))
      }

      override fun skewedInfo(skewedInfo: SkewedInfoProperty) {
        cdkBuilder.skewedInfo(skewedInfo.let(SkewedInfoProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec641bc1fd863bb5524801e42a8d83f6d4af25f62d31ac79f4aae85a2b277a89")
      override fun skewedInfo(skewedInfo: SkewedInfoProperty.Builder.() -> Unit): Unit =
          skewedInfo(SkewedInfoProperty(skewedInfo))

      override fun sortColumns(sortColumns: IResolvable) {
        cdkBuilder.sortColumns(sortColumns.let(IResolvable::unwrap))
      }

      override fun sortColumns(sortColumns: List<Any>) {
        cdkBuilder.sortColumns(sortColumns)
      }

      override fun sortColumns(vararg sortColumns: Any): Unit = sortColumns(sortColumns.toList())

      override fun storedAsSubDirectories(storedAsSubDirectories: Boolean) {
        cdkBuilder.storedAsSubDirectories(storedAsSubDirectories)
      }

      override fun storedAsSubDirectories(storedAsSubDirectories: IResolvable) {
        cdkBuilder.storedAsSubDirectories(storedAsSubDirectories.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty,
    ) : StorageDescriptorProperty {
      override fun bucketColumns(): List<String> = unwrap(this).getBucketColumns() ?: emptyList()

      override fun columns(): Any? = unwrap(this).getColumns()

      override fun compressed(): Any? = unwrap(this).getCompressed()

      override fun inputFormat(): String? = unwrap(this).getInputFormat()

      override fun location(): String? = unwrap(this).getLocation()

      override fun numberOfBuckets(): Number? = unwrap(this).getNumberOfBuckets()

      override fun outputFormat(): String? = unwrap(this).getOutputFormat()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun schemaReference(): Any? = unwrap(this).getSchemaReference()

      override fun serdeInfo(): Any? = unwrap(this).getSerdeInfo()

      override fun skewedInfo(): Any? = unwrap(this).getSkewedInfo()

      override fun sortColumns(): Any? = unwrap(this).getSortColumns()

      override fun storedAsSubDirectories(): Any? = unwrap(this).getStoredAsSubDirectories()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StorageDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty):
          StorageDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageDescriptorProperty):
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SchemaIdProperty {
    public fun registryName(): String? = unwrap(this).getRegistryName()

    public fun schemaArn(): String? = unwrap(this).getSchemaArn()

    public fun schemaName(): String? = unwrap(this).getSchemaName()

    public interface Builder {
      public fun registryName(registryName: String)

      public fun schemaArn(schemaArn: String)

      public fun schemaName(schemaName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty.builder()

      override fun registryName(registryName: String) {
        cdkBuilder.registryName(registryName)
      }

      override fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
      }

      override fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty,
    ) : SchemaIdProperty {
      override fun registryName(): String? = unwrap(this).getRegistryName()

      override fun schemaArn(): String? = unwrap(this).getSchemaArn()

      override fun schemaName(): String? = unwrap(this).getSchemaName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty):
          SchemaIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaIdProperty):
          software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ColumnProperty {
    public fun comment(): String? = unwrap(this).getComment()

    public fun name(): String

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun comment(comment: String)

      public fun name(name: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty.builder()

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty,
    ) : ColumnProperty {
      override fun comment(): String? = unwrap(this).getComment()

      override fun name(): String = unwrap(this).getName()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty):
          ColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnProperty):
          software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SchemaReferenceProperty {
    public fun schemaId(): Any? = unwrap(this).getSchemaId()

    public fun schemaVersionId(): String? = unwrap(this).getSchemaVersionId()

    public fun schemaVersionNumber(): Number? = unwrap(this).getSchemaVersionNumber()

    public interface Builder {
      public fun schemaId(schemaId: IResolvable)

      public fun schemaId(schemaId: SchemaIdProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03ff2e1c9acdac33995fc8caefb6c46f55c96b6dc41840e421c805500d5d7e12")
      public fun schemaId(schemaId: SchemaIdProperty.Builder.() -> Unit)

      public fun schemaVersionId(schemaVersionId: String)

      public fun schemaVersionNumber(schemaVersionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty.builder()

      override fun schemaId(schemaId: IResolvable) {
        cdkBuilder.schemaId(schemaId.let(IResolvable::unwrap))
      }

      override fun schemaId(schemaId: SchemaIdProperty) {
        cdkBuilder.schemaId(schemaId.let(SchemaIdProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03ff2e1c9acdac33995fc8caefb6c46f55c96b6dc41840e421c805500d5d7e12")
      override fun schemaId(schemaId: SchemaIdProperty.Builder.() -> Unit): Unit =
          schemaId(SchemaIdProperty(schemaId))

      override fun schemaVersionId(schemaVersionId: String) {
        cdkBuilder.schemaVersionId(schemaVersionId)
      }

      override fun schemaVersionNumber(schemaVersionNumber: Number) {
        cdkBuilder.schemaVersionNumber(schemaVersionNumber)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty,
    ) : SchemaReferenceProperty {
      override fun schemaId(): Any? = unwrap(this).getSchemaId()

      override fun schemaVersionId(): String? = unwrap(this).getSchemaVersionId()

      override fun schemaVersionNumber(): Number? = unwrap(this).getSchemaVersionNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty):
          SchemaReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaReferenceProperty):
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PartitionInputProperty {
    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun storageDescriptor(): Any? = unwrap(this).getStorageDescriptor()

    public fun values(): List<String>

    public interface Builder {
      public fun parameters(parameters: Any)

      public fun storageDescriptor(storageDescriptor: IResolvable)

      public fun storageDescriptor(storageDescriptor: StorageDescriptorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("949cf435c9353952c473055192374a4c38ddaf89d8f8a3a99d4aab181a8518a1")
      public fun storageDescriptor(storageDescriptor: StorageDescriptorProperty.Builder.() -> Unit)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty.builder()

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      override fun storageDescriptor(storageDescriptor: IResolvable) {
        cdkBuilder.storageDescriptor(storageDescriptor.let(IResolvable::unwrap))
      }

      override fun storageDescriptor(storageDescriptor: StorageDescriptorProperty) {
        cdkBuilder.storageDescriptor(storageDescriptor.let(StorageDescriptorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("949cf435c9353952c473055192374a4c38ddaf89d8f8a3a99d4aab181a8518a1")
      override
          fun storageDescriptor(storageDescriptor: StorageDescriptorProperty.Builder.() -> Unit):
          Unit = storageDescriptor(StorageDescriptorProperty(storageDescriptor))

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty,
    ) : PartitionInputProperty {
      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun storageDescriptor(): Any? = unwrap(this).getStorageDescriptor()

      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PartitionInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty):
          PartitionInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PartitionInputProperty):
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SkewedInfoProperty {
    public fun skewedColumnNames(): List<String> = unwrap(this).getSkewedColumnNames() ?:
        emptyList()

    public fun skewedColumnValueLocationMaps(): Any? =
        unwrap(this).getSkewedColumnValueLocationMaps()

    public fun skewedColumnValues(): List<String> = unwrap(this).getSkewedColumnValues() ?:
        emptyList()

    public interface Builder {
      public fun skewedColumnNames(skewedColumnNames: List<String>)

      public fun skewedColumnNames(vararg skewedColumnNames: String)

      public fun skewedColumnValueLocationMaps(skewedColumnValueLocationMaps: Any)

      public fun skewedColumnValues(skewedColumnValues: List<String>)

      public fun skewedColumnValues(vararg skewedColumnValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty.builder()

      override fun skewedColumnNames(skewedColumnNames: List<String>) {
        cdkBuilder.skewedColumnNames(skewedColumnNames)
      }

      override fun skewedColumnNames(vararg skewedColumnNames: String): Unit =
          skewedColumnNames(skewedColumnNames.toList())

      override fun skewedColumnValueLocationMaps(skewedColumnValueLocationMaps: Any) {
        cdkBuilder.skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
      }

      override fun skewedColumnValues(skewedColumnValues: List<String>) {
        cdkBuilder.skewedColumnValues(skewedColumnValues)
      }

      override fun skewedColumnValues(vararg skewedColumnValues: String): Unit =
          skewedColumnValues(skewedColumnValues.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty,
    ) : SkewedInfoProperty {
      override fun skewedColumnNames(): List<String> = unwrap(this).getSkewedColumnNames() ?:
          emptyList()

      override fun skewedColumnValueLocationMaps(): Any? =
          unwrap(this).getSkewedColumnValueLocationMaps()

      override fun skewedColumnValues(): List<String> = unwrap(this).getSkewedColumnValues() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SkewedInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty):
          SkewedInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SkewedInfoProperty):
          software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SerdeInfoProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun serializationLibrary(): String? = unwrap(this).getSerializationLibrary()

    public interface Builder {
      public fun name(name: String)

      public fun parameters(parameters: Any)

      public fun serializationLibrary(serializationLibrary: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      override fun serializationLibrary(serializationLibrary: String) {
        cdkBuilder.serializationLibrary(serializationLibrary)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty,
    ) : SerdeInfoProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun serializationLibrary(): String? = unwrap(this).getSerializationLibrary()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SerdeInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty):
          SerdeInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SerdeInfoProperty):
          software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OrderProperty {
    public fun column(): String

    public fun sortOrder(): Number? = unwrap(this).getSortOrder()

    public interface Builder {
      public fun column(column: String)

      public fun sortOrder(sortOrder: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.OrderProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.OrderProperty.builder()

      override fun column(column: String) {
        cdkBuilder.column(column)
      }

      override fun sortOrder(sortOrder: Number) {
        cdkBuilder.sortOrder(sortOrder)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.OrderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.OrderProperty,
    ) : OrderProperty {
      override fun column(): String = unwrap(this).getColumn()

      override fun sortOrder(): Number? = unwrap(this).getSortOrder()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OrderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.OrderProperty):
          OrderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrderProperty):
          software.amazon.awscdk.services.glue.CfnPartition.OrderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
