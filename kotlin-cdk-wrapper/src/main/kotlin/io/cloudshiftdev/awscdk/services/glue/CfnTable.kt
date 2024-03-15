@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnTable,
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

  public open fun openTableFormatInput(): Any? = unwrap(this).getOpenTableFormatInput()

  public open fun openTableFormatInput(`value`: IResolvable) {
    unwrap(this).setOpenTableFormatInput(`value`.let(IResolvable::unwrap))
  }

  public open fun openTableFormatInput(`value`: OpenTableFormatInputProperty) {
    unwrap(this).setOpenTableFormatInput(`value`.let(OpenTableFormatInputProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11fe2e18d5fffdbe6cf5bc00b869ce67bcf18389a9143b5c0b0ba9f0e3e62676")
  public open fun openTableFormatInput(`value`: OpenTableFormatInputProperty.Builder.() -> Unit):
      Unit = openTableFormatInput(OpenTableFormatInputProperty(`value`))

  public open fun tableInput(): Any = unwrap(this).getTableInput()

  public open fun tableInput(`value`: IResolvable) {
    unwrap(this).setTableInput(`value`.let(IResolvable::unwrap))
  }

  public open fun tableInput(`value`: TableInputProperty) {
    unwrap(this).setTableInput(`value`.let(TableInputProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e638cb9c322af54329f162e9be8bb6388f3779d8aeb6a2d7a6a9645cf7822ab")
  public open fun tableInput(`value`: TableInputProperty.Builder.() -> Unit): Unit =
      tableInput(TableInputProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun databaseName(databaseName: String)

    public fun openTableFormatInput(openTableFormatInput: IResolvable)

    public fun openTableFormatInput(openTableFormatInput: OpenTableFormatInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8a1ce0206fa476f9741b875788859f70d5a35a996dc5005de444f861511e06d")
    public
        fun openTableFormatInput(openTableFormatInput: OpenTableFormatInputProperty.Builder.() -> Unit)

    public fun tableInput(tableInput: IResolvable)

    public fun tableInput(tableInput: TableInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e4d6f4a371dc83ceaf52f80f085408dbc5ced0bf91865c754ab74ee3ace17d1")
    public fun tableInput(tableInput: TableInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTable.Builder =
        software.amazon.awscdk.services.glue.CfnTable.Builder.create(scope, id)

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun openTableFormatInput(openTableFormatInput: IResolvable) {
      cdkBuilder.openTableFormatInput(openTableFormatInput.let(IResolvable::unwrap))
    }

    override fun openTableFormatInput(openTableFormatInput: OpenTableFormatInputProperty) {
      cdkBuilder.openTableFormatInput(openTableFormatInput.let(OpenTableFormatInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8a1ce0206fa476f9741b875788859f70d5a35a996dc5005de444f861511e06d")
    override
        fun openTableFormatInput(openTableFormatInput: OpenTableFormatInputProperty.Builder.() -> Unit):
        Unit = openTableFormatInput(OpenTableFormatInputProperty(openTableFormatInput))

    override fun tableInput(tableInput: IResolvable) {
      cdkBuilder.tableInput(tableInput.let(IResolvable::unwrap))
    }

    override fun tableInput(tableInput: TableInputProperty) {
      cdkBuilder.tableInput(tableInput.let(TableInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e4d6f4a371dc83ceaf52f80f085408dbc5ced0bf91865c754ab74ee3ace17d1")
    override fun tableInput(tableInput: TableInputProperty.Builder.() -> Unit): Unit =
        tableInput(TableInputProperty(tableInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.glue.CfnTable =
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

    @CdkDslMarker
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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da5e942beacf9cf335ff658999fff79422fdc7bf7cd4256314d18849988a9648")
      public fun schemaReference(schemaReference: SchemaReferenceProperty.Builder.() -> Unit)

      public fun serdeInfo(serdeInfo: IResolvable)

      public fun serdeInfo(serdeInfo: SerdeInfoProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11d04ede27877c042f8a31a30de79399591e90dd4a64a080f93acccbd4779395")
      public fun serdeInfo(serdeInfo: SerdeInfoProperty.Builder.() -> Unit)

      public fun skewedInfo(skewedInfo: IResolvable)

      public fun skewedInfo(skewedInfo: SkewedInfoProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2202e46e0497ddccdb231fcb92fd088f818c533569e70f9091b006a0c4b2b8eb")
      public fun skewedInfo(skewedInfo: SkewedInfoProperty.Builder.() -> Unit)

      public fun sortColumns(sortColumns: IResolvable)

      public fun sortColumns(sortColumns: List<Any>)

      public fun sortColumns(vararg sortColumns: Any)

      public fun storedAsSubDirectories(storedAsSubDirectories: Boolean)

      public fun storedAsSubDirectories(storedAsSubDirectories: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty.builder()

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

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da5e942beacf9cf335ff658999fff79422fdc7bf7cd4256314d18849988a9648")
      override fun schemaReference(schemaReference: SchemaReferenceProperty.Builder.() -> Unit):
          Unit = schemaReference(SchemaReferenceProperty(schemaReference))

      override fun serdeInfo(serdeInfo: IResolvable) {
        cdkBuilder.serdeInfo(serdeInfo.let(IResolvable::unwrap))
      }

      override fun serdeInfo(serdeInfo: SerdeInfoProperty) {
        cdkBuilder.serdeInfo(serdeInfo.let(SerdeInfoProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11d04ede27877c042f8a31a30de79399591e90dd4a64a080f93acccbd4779395")
      override fun serdeInfo(serdeInfo: SerdeInfoProperty.Builder.() -> Unit): Unit =
          serdeInfo(SerdeInfoProperty(serdeInfo))

      override fun skewedInfo(skewedInfo: IResolvable) {
        cdkBuilder.skewedInfo(skewedInfo.let(IResolvable::unwrap))
      }

      override fun skewedInfo(skewedInfo: SkewedInfoProperty) {
        cdkBuilder.skewedInfo(skewedInfo.let(SkewedInfoProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2202e46e0497ddccdb231fcb92fd088f818c533569e70f9091b006a0c4b2b8eb")
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

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty,
    ) : CdkObject(cdkObject), StorageDescriptorProperty {
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
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty):
          StorageDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageDescriptorProperty):
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty
    }
  }

  public interface OpenTableFormatInputProperty {
    public fun icebergInput(): Any? = unwrap(this).getIcebergInput()

    @CdkDslMarker
    public interface Builder {
      public fun icebergInput(icebergInput: IResolvable)

      public fun icebergInput(icebergInput: IcebergInputProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1dabdd8870b197acdacd5ca509199e8896ee45cc3920d4d67e7624b2f6cec6e2")
      public fun icebergInput(icebergInput: IcebergInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty.builder()

      override fun icebergInput(icebergInput: IResolvable) {
        cdkBuilder.icebergInput(icebergInput.let(IResolvable::unwrap))
      }

      override fun icebergInput(icebergInput: IcebergInputProperty) {
        cdkBuilder.icebergInput(icebergInput.let(IcebergInputProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1dabdd8870b197acdacd5ca509199e8896ee45cc3920d4d67e7624b2f6cec6e2")
      override fun icebergInput(icebergInput: IcebergInputProperty.Builder.() -> Unit): Unit =
          icebergInput(IcebergInputProperty(icebergInput))

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty,
    ) : CdkObject(cdkObject), OpenTableFormatInputProperty {
      override fun icebergInput(): Any? = unwrap(this).getIcebergInput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenTableFormatInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty):
          OpenTableFormatInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenTableFormatInputProperty):
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty
    }
  }

  public interface SchemaReferenceProperty {
    public fun schemaId(): Any? = unwrap(this).getSchemaId()

    public fun schemaVersionId(): String? = unwrap(this).getSchemaVersionId()

    public fun schemaVersionNumber(): Number? = unwrap(this).getSchemaVersionNumber()

    @CdkDslMarker
    public interface Builder {
      public fun schemaId(schemaId: IResolvable)

      public fun schemaId(schemaId: SchemaIdProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d16db282fc361cca1004a18f2a4b3646e53a680b0e48f5046406cea621d158b")
      public fun schemaId(schemaId: SchemaIdProperty.Builder.() -> Unit)

      public fun schemaVersionId(schemaVersionId: String)

      public fun schemaVersionNumber(schemaVersionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty.builder()

      override fun schemaId(schemaId: IResolvable) {
        cdkBuilder.schemaId(schemaId.let(IResolvable::unwrap))
      }

      override fun schemaId(schemaId: SchemaIdProperty) {
        cdkBuilder.schemaId(schemaId.let(SchemaIdProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d16db282fc361cca1004a18f2a4b3646e53a680b0e48f5046406cea621d158b")
      override fun schemaId(schemaId: SchemaIdProperty.Builder.() -> Unit): Unit =
          schemaId(SchemaIdProperty(schemaId))

      override fun schemaVersionId(schemaVersionId: String) {
        cdkBuilder.schemaVersionId(schemaVersionId)
      }

      override fun schemaVersionNumber(schemaVersionNumber: Number) {
        cdkBuilder.schemaVersionNumber(schemaVersionNumber)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty,
    ) : CdkObject(cdkObject), SchemaReferenceProperty {
      override fun schemaId(): Any? = unwrap(this).getSchemaId()

      override fun schemaVersionId(): String? = unwrap(this).getSchemaVersionId()

      override fun schemaVersionNumber(): Number? = unwrap(this).getSchemaVersionNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty):
          SchemaReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaReferenceProperty):
          software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty
    }
  }

  public interface TableInputProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String? = unwrap(this).getName()

    public fun owner(): String? = unwrap(this).getOwner()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun partitionKeys(): Any? = unwrap(this).getPartitionKeys()

    public fun retention(): Number? = unwrap(this).getRetention()

    public fun storageDescriptor(): Any? = unwrap(this).getStorageDescriptor()

    public fun tableType(): String? = unwrap(this).getTableType()

    public fun targetTable(): Any? = unwrap(this).getTargetTable()

    public fun viewExpandedText(): String? = unwrap(this).getViewExpandedText()

    public fun viewOriginalText(): String? = unwrap(this).getViewOriginalText()

    @CdkDslMarker
    public interface Builder {
      public fun description(description: String)

      public fun name(name: String)

      public fun owner(owner: String)

      public fun parameters(parameters: Any)

      public fun partitionKeys(partitionKeys: IResolvable)

      public fun partitionKeys(partitionKeys: List<Any>)

      public fun partitionKeys(vararg partitionKeys: Any)

      public fun retention(retention: Number)

      public fun storageDescriptor(storageDescriptor: IResolvable)

      public fun storageDescriptor(storageDescriptor: StorageDescriptorProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b6c9a4cc9b5aec52f3b2756da1f1dbf002620d455a76472b85570ded6b8c74a")
      public fun storageDescriptor(storageDescriptor: StorageDescriptorProperty.Builder.() -> Unit)

      public fun tableType(tableType: String)

      public fun targetTable(targetTable: IResolvable)

      public fun targetTable(targetTable: TableIdentifierProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e244fadecf32f732dd9674fd91e548f3b7dd67fa134be4457fe24a18c9e5c53c")
      public fun targetTable(targetTable: TableIdentifierProperty.Builder.() -> Unit)

      public fun viewExpandedText(viewExpandedText: String)

      public fun viewOriginalText(viewOriginalText: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.TableInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.TableInputProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun owner(owner: String) {
        cdkBuilder.owner(owner)
      }

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      override fun partitionKeys(partitionKeys: IResolvable) {
        cdkBuilder.partitionKeys(partitionKeys.let(IResolvable::unwrap))
      }

      override fun partitionKeys(partitionKeys: List<Any>) {
        cdkBuilder.partitionKeys(partitionKeys)
      }

      override fun partitionKeys(vararg partitionKeys: Any): Unit =
          partitionKeys(partitionKeys.toList())

      override fun retention(retention: Number) {
        cdkBuilder.retention(retention)
      }

      override fun storageDescriptor(storageDescriptor: IResolvable) {
        cdkBuilder.storageDescriptor(storageDescriptor.let(IResolvable::unwrap))
      }

      override fun storageDescriptor(storageDescriptor: StorageDescriptorProperty) {
        cdkBuilder.storageDescriptor(storageDescriptor.let(StorageDescriptorProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b6c9a4cc9b5aec52f3b2756da1f1dbf002620d455a76472b85570ded6b8c74a")
      override
          fun storageDescriptor(storageDescriptor: StorageDescriptorProperty.Builder.() -> Unit):
          Unit = storageDescriptor(StorageDescriptorProperty(storageDescriptor))

      override fun tableType(tableType: String) {
        cdkBuilder.tableType(tableType)
      }

      override fun targetTable(targetTable: IResolvable) {
        cdkBuilder.targetTable(targetTable.let(IResolvable::unwrap))
      }

      override fun targetTable(targetTable: TableIdentifierProperty) {
        cdkBuilder.targetTable(targetTable.let(TableIdentifierProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e244fadecf32f732dd9674fd91e548f3b7dd67fa134be4457fe24a18c9e5c53c")
      override fun targetTable(targetTable: TableIdentifierProperty.Builder.() -> Unit): Unit =
          targetTable(TableIdentifierProperty(targetTable))

      override fun viewExpandedText(viewExpandedText: String) {
        cdkBuilder.viewExpandedText(viewExpandedText)
      }

      override fun viewOriginalText(viewOriginalText: String) {
        cdkBuilder.viewOriginalText(viewOriginalText)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.TableInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.TableInputProperty,
    ) : CdkObject(cdkObject), TableInputProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun name(): String? = unwrap(this).getName()

      override fun owner(): String? = unwrap(this).getOwner()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun partitionKeys(): Any? = unwrap(this).getPartitionKeys()

      override fun retention(): Number? = unwrap(this).getRetention()

      override fun storageDescriptor(): Any? = unwrap(this).getStorageDescriptor()

      override fun tableType(): String? = unwrap(this).getTableType()

      override fun targetTable(): Any? = unwrap(this).getTargetTable()

      override fun viewExpandedText(): String? = unwrap(this).getViewExpandedText()

      override fun viewOriginalText(): String? = unwrap(this).getViewOriginalText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.TableInputProperty):
          TableInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableInputProperty):
          software.amazon.awscdk.services.glue.CfnTable.TableInputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.TableInputProperty
    }
  }

  public interface SkewedInfoProperty {
    public fun skewedColumnNames(): List<String> = unwrap(this).getSkewedColumnNames() ?:
        emptyList()

    public fun skewedColumnValueLocationMaps(): Any? =
        unwrap(this).getSkewedColumnValueLocationMaps()

    public fun skewedColumnValues(): List<String> = unwrap(this).getSkewedColumnValues() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun skewedColumnNames(skewedColumnNames: List<String>)

      public fun skewedColumnNames(vararg skewedColumnNames: String)

      public fun skewedColumnValueLocationMaps(skewedColumnValueLocationMaps: Any)

      public fun skewedColumnValues(skewedColumnValues: List<String>)

      public fun skewedColumnValues(vararg skewedColumnValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty,
    ) : CdkObject(cdkObject), SkewedInfoProperty {
      override fun skewedColumnNames(): List<String> = unwrap(this).getSkewedColumnNames() ?:
          emptyList()

      override fun skewedColumnValueLocationMaps(): Any? =
          unwrap(this).getSkewedColumnValueLocationMaps()

      override fun skewedColumnValues(): List<String> = unwrap(this).getSkewedColumnValues() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SkewedInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty):
          SkewedInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SkewedInfoProperty):
          software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty
    }
  }

  public interface SerdeInfoProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun serializationLibrary(): String? = unwrap(this).getSerializationLibrary()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun parameters(parameters: Any)

      public fun serializationLibrary(serializationLibrary: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      override fun serializationLibrary(serializationLibrary: String) {
        cdkBuilder.serializationLibrary(serializationLibrary)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty,
    ) : CdkObject(cdkObject), SerdeInfoProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun serializationLibrary(): String? = unwrap(this).getSerializationLibrary()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SerdeInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty):
          SerdeInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SerdeInfoProperty):
          software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty
    }
  }

  public interface TableIdentifierProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun name(): String? = unwrap(this).getName()

    public fun region(): String? = unwrap(this).getRegion()

    @CdkDslMarker
    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun databaseName(databaseName: String)

      public fun name(name: String)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty,
    ) : CdkObject(cdkObject), TableIdentifierProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun name(): String? = unwrap(this).getName()

      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty):
          TableIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableIdentifierProperty):
          software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty
    }
  }

  public interface OrderProperty {
    public fun column(): String

    public fun sortOrder(): Number

    @CdkDslMarker
    public interface Builder {
      public fun column(column: String)

      public fun sortOrder(sortOrder: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTable.OrderProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.OrderProperty.builder()

      override fun column(column: String) {
        cdkBuilder.column(column)
      }

      override fun sortOrder(sortOrder: Number) {
        cdkBuilder.sortOrder(sortOrder)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.OrderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.OrderProperty,
    ) : CdkObject(cdkObject), OrderProperty {
      override fun column(): String = unwrap(this).getColumn()

      override fun sortOrder(): Number = unwrap(this).getSortOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.OrderProperty):
          OrderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrderProperty):
          software.amazon.awscdk.services.glue.CfnTable.OrderProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.OrderProperty
    }
  }

  public interface SchemaIdProperty {
    public fun registryName(): String? = unwrap(this).getRegistryName()

    public fun schemaArn(): String? = unwrap(this).getSchemaArn()

    public fun schemaName(): String? = unwrap(this).getSchemaName()

    @CdkDslMarker
    public interface Builder {
      public fun registryName(registryName: String)

      public fun schemaArn(schemaArn: String)

      public fun schemaName(schemaName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty.Builder
          = software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty.builder()

      override fun registryName(registryName: String) {
        cdkBuilder.registryName(registryName)
      }

      override fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
      }

      override fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty,
    ) : CdkObject(cdkObject), SchemaIdProperty {
      override fun registryName(): String? = unwrap(this).getRegistryName()

      override fun schemaArn(): String? = unwrap(this).getSchemaArn()

      override fun schemaName(): String? = unwrap(this).getSchemaName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty):
          SchemaIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaIdProperty):
          software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty
    }
  }

  public interface IcebergInputProperty {
    public fun metadataOperation(): String? = unwrap(this).getMetadataOperation()

    public fun version(): String? = unwrap(this).getVersion()

    @CdkDslMarker
    public interface Builder {
      public fun metadataOperation(metadataOperation: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty.builder()

      override fun metadataOperation(metadataOperation: String) {
        cdkBuilder.metadataOperation(metadataOperation)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty,
    ) : CdkObject(cdkObject), IcebergInputProperty {
      override fun metadataOperation(): String? = unwrap(this).getMetadataOperation()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IcebergInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty):
          IcebergInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcebergInputProperty):
          software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty
    }
  }

  public interface ColumnProperty {
    public fun comment(): String? = unwrap(this).getComment()

    public fun name(): String

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun comment(comment: String)

      public fun name(name: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTable.ColumnProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.ColumnProperty.builder()

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.ColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.ColumnProperty,
    ) : CdkObject(cdkObject), ColumnProperty {
      override fun comment(): String? = unwrap(this).getComment()

      override fun name(): String = unwrap(this).getName()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.ColumnProperty):
          ColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnProperty):
          software.amazon.awscdk.services.glue.CfnTable.ColumnProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.ColumnProperty
    }
  }
}
