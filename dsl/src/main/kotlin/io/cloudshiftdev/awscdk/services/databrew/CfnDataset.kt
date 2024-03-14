package io.cloudshiftdev.awscdk.services.databrew

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
  private val cdkObject: software.amazon.awscdk.services.databrew.CfnDataset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun format(): String? = unwrap(this).getFormat()

  public open fun format(`value`: String) {
    unwrap(this).setFormat(`value`)
  }

  public open fun formatOptions(): Any? = unwrap(this).getFormatOptions()

  public open fun formatOptions(`value`: IResolvable) {
    unwrap(this).setFormatOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun formatOptions(`value`: FormatOptionsProperty) {
    unwrap(this).setFormatOptions(`value`.let(FormatOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9856ead397ebcfc0daf8e83b03cfdbabebfe9591d1266ef8b00d0b5edb523426")
  public open fun formatOptions(`value`: FormatOptionsProperty.Builder.() -> Unit): Unit =
      formatOptions(FormatOptionsProperty(`value`))

  public open fun input(): Any = unwrap(this).getInput()

  public open fun input(`value`: IResolvable) {
    unwrap(this).setInput(`value`.let(IResolvable::unwrap))
  }

  public open fun input(`value`: InputProperty) {
    unwrap(this).setInput(`value`.let(InputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c30da00069ffc60c74e203893a6eebdc5bfc21690ef51ebd8970470d2c9464b")
  public open fun input(`value`: InputProperty.Builder.() -> Unit): Unit =
      input(InputProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun pathOptions(): Any? = unwrap(this).getPathOptions()

  public open fun pathOptions(`value`: IResolvable) {
    unwrap(this).setPathOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun pathOptions(`value`: PathOptionsProperty) {
    unwrap(this).setPathOptions(`value`.let(PathOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a3356374cd5e60b3bc81c4b2bf08f3dded5b927e1f8137ec654c0bee90b88b55")
  public open fun pathOptions(`value`: PathOptionsProperty.Builder.() -> Unit): Unit =
      pathOptions(PathOptionsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun format(format: String)

    public fun formatOptions(formatOptions: IResolvable)

    public fun formatOptions(formatOptions: FormatOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("874cb260c136b29df923454625d2ac47f83ded0a0beb8f9a1850b1e04aa32710")
    public fun formatOptions(formatOptions: FormatOptionsProperty.Builder.() -> Unit)

    public fun input(input: IResolvable)

    public fun input(input: InputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("108d2365f7c1682fc89f15b96a6c32ce2fc142101de56356163530b012e3dfcc")
    public fun input(input: InputProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun pathOptions(pathOptions: IResolvable)

    public fun pathOptions(pathOptions: PathOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ee845b91bbaf56745c111be9c1c7fc34dd4099fd53d16d1a5ed80e500402178")
    public fun pathOptions(pathOptions: PathOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnDataset.Builder =
        software.amazon.awscdk.services.databrew.CfnDataset.Builder.create(scope, id)

    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    override fun formatOptions(formatOptions: IResolvable) {
      cdkBuilder.formatOptions(formatOptions.let(IResolvable::unwrap))
    }

    override fun formatOptions(formatOptions: FormatOptionsProperty) {
      cdkBuilder.formatOptions(formatOptions.let(FormatOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("874cb260c136b29df923454625d2ac47f83ded0a0beb8f9a1850b1e04aa32710")
    override fun formatOptions(formatOptions: FormatOptionsProperty.Builder.() -> Unit): Unit =
        formatOptions(FormatOptionsProperty(formatOptions))

    override fun input(input: IResolvable) {
      cdkBuilder.input(input.let(IResolvable::unwrap))
    }

    override fun input(input: InputProperty) {
      cdkBuilder.input(input.let(InputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("108d2365f7c1682fc89f15b96a6c32ce2fc142101de56356163530b012e3dfcc")
    override fun input(input: InputProperty.Builder.() -> Unit): Unit = input(InputProperty(input))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun pathOptions(pathOptions: IResolvable) {
      cdkBuilder.pathOptions(pathOptions.let(IResolvable::unwrap))
    }

    override fun pathOptions(pathOptions: PathOptionsProperty) {
      cdkBuilder.pathOptions(pathOptions.let(PathOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ee845b91bbaf56745c111be9c1c7fc34dd4099fd53d16d1a5ed80e500402178")
    override fun pathOptions(pathOptions: PathOptionsProperty.Builder.() -> Unit): Unit =
        pathOptions(PathOptionsProperty(pathOptions))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnDataset = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset): CfnDataset =
        CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset): software.amazon.awscdk.services.databrew.CfnDataset =
        wrapped.cdkObject
  }

  public interface DataCatalogInputDefinitionProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun tableName(): String? = unwrap(this).getTableName()

    public fun tempDirectory(): Any? = unwrap(this).getTempDirectory()

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun databaseName(databaseName: String)

      public fun tableName(tableName: String)

      public fun tempDirectory(tempDirectory: IResolvable)

      public fun tempDirectory(tempDirectory: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7db5116f34f01063a17d9e354c340b74563e60bf4041273549ecb5f743554a02")
      public fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      override fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory.let(IResolvable::unwrap))
      }

      override fun tempDirectory(tempDirectory: S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7db5116f34f01063a17d9e354c340b74563e60bf4041273549ecb5f743554a02")
      override fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit): Unit =
          tempDirectory(S3LocationProperty(tempDirectory))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty,
    ) : DataCatalogInputDefinitionProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun tableName(): String? = unwrap(this).getTableName()

      override fun tempDirectory(): Any? = unwrap(this).getTempDirectory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataCatalogInputDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty):
          DataCatalogInputDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogInputDefinitionProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatabaseInputDefinitionProperty {
    public fun databaseTableName(): String? = unwrap(this).getDatabaseTableName()

    public fun glueConnectionName(): String

    public fun queryString(): String? = unwrap(this).getQueryString()

    public fun tempDirectory(): Any? = unwrap(this).getTempDirectory()

    public interface Builder {
      public fun databaseTableName(databaseTableName: String)

      public fun glueConnectionName(glueConnectionName: String)

      public fun queryString(queryString: String)

      public fun tempDirectory(tempDirectory: IResolvable)

      public fun tempDirectory(tempDirectory: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d380b9aa4c10bb6f287271ebf8c3dd1d2ab5523fbe21bf543e78c7f770fd5ec6")
      public fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty.builder()

      override fun databaseTableName(databaseTableName: String) {
        cdkBuilder.databaseTableName(databaseTableName)
      }

      override fun glueConnectionName(glueConnectionName: String) {
        cdkBuilder.glueConnectionName(glueConnectionName)
      }

      override fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
      }

      override fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory.let(IResolvable::unwrap))
      }

      override fun tempDirectory(tempDirectory: S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d380b9aa4c10bb6f287271ebf8c3dd1d2ab5523fbe21bf543e78c7f770fd5ec6")
      override fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit): Unit =
          tempDirectory(S3LocationProperty(tempDirectory))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty,
    ) : DatabaseInputDefinitionProperty {
      override fun databaseTableName(): String? = unwrap(this).getDatabaseTableName()

      override fun glueConnectionName(): String = unwrap(this).getGlueConnectionName()

      override fun queryString(): String? = unwrap(this).getQueryString()

      override fun tempDirectory(): Any? = unwrap(this).getTempDirectory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInputDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty):
          DatabaseInputDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseInputDefinitionProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputProperty {
    public fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

    public fun databaseInputDefinition(): Any? = unwrap(this).getDatabaseInputDefinition()

    public fun metadata(): Any? = unwrap(this).getMetadata()

    public fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()

    public interface Builder {
      public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable)

      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8566d49d0da6d5e3c7dae41867fa0417df919b5a9a9cbe8fb3e02dd69f77448")
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit)

      public fun databaseInputDefinition(databaseInputDefinition: IResolvable)

      public fun databaseInputDefinition(databaseInputDefinition: DatabaseInputDefinitionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20cc6c2cb67cf12e5153173813edf5a1f135894874e3ec92e723e02fa5999d7b")
      public
          fun databaseInputDefinition(databaseInputDefinition: DatabaseInputDefinitionProperty.Builder.() -> Unit)

      public fun metadata(metadata: IResolvable)

      public fun metadata(metadata: MetadataProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc2eecbbafc42972874374b2ff846e2fdf8dc1e0ebd9e1fa459c63dc026f334")
      public fun metadata(metadata: MetadataProperty.Builder.() -> Unit)

      public fun s3InputDefinition(s3InputDefinition: IResolvable)

      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("941083a48d82f5dc84d462af94aa87336a198a841d72148455b37296db306422")
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.InputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.InputProperty.builder()

      override fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(IResolvable::unwrap))
      }

      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(DataCatalogInputDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8566d49d0da6d5e3c7dae41867fa0417df919b5a9a9cbe8fb3e02dd69f77448")
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit):
          Unit =
          dataCatalogInputDefinition(DataCatalogInputDefinitionProperty(dataCatalogInputDefinition))

      override fun databaseInputDefinition(databaseInputDefinition: IResolvable) {
        cdkBuilder.databaseInputDefinition(databaseInputDefinition.let(IResolvable::unwrap))
      }

      override
          fun databaseInputDefinition(databaseInputDefinition: DatabaseInputDefinitionProperty) {
        cdkBuilder.databaseInputDefinition(databaseInputDefinition.let(DatabaseInputDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20cc6c2cb67cf12e5153173813edf5a1f135894874e3ec92e723e02fa5999d7b")
      override
          fun databaseInputDefinition(databaseInputDefinition: DatabaseInputDefinitionProperty.Builder.() -> Unit):
          Unit = databaseInputDefinition(DatabaseInputDefinitionProperty(databaseInputDefinition))

      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable::unwrap))
      }

      override fun metadata(metadata: MetadataProperty) {
        cdkBuilder.metadata(metadata.let(MetadataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc2eecbbafc42972874374b2ff846e2fdf8dc1e0ebd9e1fa459c63dc026f334")
      override fun metadata(metadata: MetadataProperty.Builder.() -> Unit): Unit =
          metadata(MetadataProperty(metadata))

      override fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(IResolvable::unwrap))
      }

      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("941083a48d82f5dc84d462af94aa87336a198a841d72148455b37296db306422")
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit): Unit
          = s3InputDefinition(S3LocationProperty(s3InputDefinition))

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.InputProperty,
    ) : InputProperty {
      override fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

      override fun databaseInputDefinition(): Any? = unwrap(this).getDatabaseInputDefinition()

      override fun metadata(): Any? = unwrap(this).getMetadata()

      override fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.InputProperty):
          InputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.InputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatetimeOptionsProperty {
    public fun format(): String

    public fun localeCode(): String? = unwrap(this).getLocaleCode()

    public fun timezoneOffset(): String? = unwrap(this).getTimezoneOffset()

    public interface Builder {
      public fun format(format: String)

      public fun localeCode(localeCode: String)

      public fun timezoneOffset(timezoneOffset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty.builder()

      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      override fun localeCode(localeCode: String) {
        cdkBuilder.localeCode(localeCode)
      }

      override fun timezoneOffset(timezoneOffset: String) {
        cdkBuilder.timezoneOffset(timezoneOffset)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty,
    ) : DatetimeOptionsProperty {
      override fun format(): String = unwrap(this).getFormat()

      override fun localeCode(): String? = unwrap(this).getLocaleCode()

      override fun timezoneOffset(): String? = unwrap(this).getTimezoneOffset()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatetimeOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty):
          DatetimeOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatetimeOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ExcelOptionsProperty {
    public fun headerRow(): Any? = unwrap(this).getHeaderRow()

    public fun sheetIndexes(): Any? = unwrap(this).getSheetIndexes()

    public fun sheetNames(): List<String> = unwrap(this).getSheetNames() ?: emptyList()

    public interface Builder {
      public fun headerRow(headerRow: Boolean)

      public fun headerRow(headerRow: IResolvable)

      public fun sheetIndexes(sheetIndexes: IResolvable)

      public fun sheetIndexes(sheetIndexes: List<Number>)

      public fun sheetNames(sheetNames: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty.builder()

      override fun headerRow(headerRow: Boolean) {
        cdkBuilder.headerRow(headerRow)
      }

      override fun headerRow(headerRow: IResolvable) {
        cdkBuilder.headerRow(headerRow.let(IResolvable::unwrap))
      }

      override fun sheetIndexes(sheetIndexes: IResolvable) {
        cdkBuilder.sheetIndexes(sheetIndexes.let(IResolvable::unwrap))
      }

      override fun sheetIndexes(sheetIndexes: List<Number>) {
        cdkBuilder.sheetIndexes(sheetIndexes)
      }

      override fun sheetNames(sheetNames: List<String>) {
        cdkBuilder.sheetNames(sheetNames)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty,
    ) : ExcelOptionsProperty {
      override fun headerRow(): Any? = unwrap(this).getHeaderRow()

      override fun sheetIndexes(): Any? = unwrap(this).getSheetIndexes()

      override fun sheetNames(): List<String> = unwrap(this).getSheetNames() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExcelOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty):
          ExcelOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExcelOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JsonOptionsProperty {
    public fun multiLine(): Any? = unwrap(this).getMultiLine()

    public interface Builder {
      public fun multiLine(multiLine: Boolean)

      public fun multiLine(multiLine: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty.builder()

      override fun multiLine(multiLine: Boolean) {
        cdkBuilder.multiLine(multiLine)
      }

      override fun multiLine(multiLine: IResolvable) {
        cdkBuilder.multiLine(multiLine.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty,
    ) : JsonOptionsProperty {
      override fun multiLine(): Any? = unwrap(this).getMultiLine()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty):
          JsonOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun key(): String? = unwrap(this).getKey()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty,
    ) : S3LocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FormatOptionsProperty {
    public fun csv(): Any? = unwrap(this).getCsv()

    public fun excel(): Any? = unwrap(this).getExcel()

    public fun json(): Any? = unwrap(this).getJson()

    public interface Builder {
      public fun csv(csv: IResolvable)

      public fun csv(csv: CsvOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72b3633abe2138ad63e36be41f14b939d47953e017b72e053a3b74b20d72ca92")
      public fun csv(csv: CsvOptionsProperty.Builder.() -> Unit)

      public fun excel(excel: IResolvable)

      public fun excel(excel: ExcelOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb615763391f8fb8cae4015adbeda24c1f2cf9f35c8f2ac4125a7b27823d3e8")
      public fun excel(excel: ExcelOptionsProperty.Builder.() -> Unit)

      public fun json(json: IResolvable)

      public fun json(json: JsonOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cef95b3f0a6f8caccf791e87fb75cb078b786aca315950647c7fea8ca0e1b0e9")
      public fun json(json: JsonOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty.builder()

      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      override fun csv(csv: CsvOptionsProperty) {
        cdkBuilder.csv(csv.let(CsvOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72b3633abe2138ad63e36be41f14b939d47953e017b72e053a3b74b20d72ca92")
      override fun csv(csv: CsvOptionsProperty.Builder.() -> Unit): Unit =
          csv(CsvOptionsProperty(csv))

      override fun excel(excel: IResolvable) {
        cdkBuilder.excel(excel.let(IResolvable::unwrap))
      }

      override fun excel(excel: ExcelOptionsProperty) {
        cdkBuilder.excel(excel.let(ExcelOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb615763391f8fb8cae4015adbeda24c1f2cf9f35c8f2ac4125a7b27823d3e8")
      override fun excel(excel: ExcelOptionsProperty.Builder.() -> Unit): Unit =
          excel(ExcelOptionsProperty(excel))

      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable::unwrap))
      }

      override fun json(json: JsonOptionsProperty) {
        cdkBuilder.json(json.let(JsonOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cef95b3f0a6f8caccf791e87fb75cb078b786aca315950647c7fea8ca0e1b0e9")
      override fun json(json: JsonOptionsProperty.Builder.() -> Unit): Unit =
          json(JsonOptionsProperty(json))

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty,
    ) : FormatOptionsProperty {
      override fun csv(): Any? = unwrap(this).getCsv()

      override fun excel(): Any? = unwrap(this).getExcel()

      override fun json(): Any? = unwrap(this).getJson()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty):
          FormatOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormatOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MetadataProperty {
    public fun sourceArn(): String? = unwrap(this).getSourceArn()

    public interface Builder {
      public fun sourceArn(sourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty.builder()

      override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty,
    ) : MetadataProperty {
      override fun sourceArn(): String? = unwrap(this).getSourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty):
          MetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatasetParameterProperty {
    public fun createColumn(): Any? = unwrap(this).getCreateColumn()

    public fun datetimeOptions(): Any? = unwrap(this).getDatetimeOptions()

    public fun filter(): Any? = unwrap(this).getFilter()

    public fun name(): String

    public fun type(): String

    public interface Builder {
      public fun createColumn(createColumn: Boolean)

      public fun createColumn(createColumn: IResolvable)

      public fun datetimeOptions(datetimeOptions: IResolvable)

      public fun datetimeOptions(datetimeOptions: DatetimeOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65a6693a7649a5bea13eff57488531548e480e904d0e34b14bccc2e10bfe22a1")
      public fun datetimeOptions(datetimeOptions: DatetimeOptionsProperty.Builder.() -> Unit)

      public fun filter(filter: IResolvable)

      public fun filter(filter: FilterExpressionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("060097b92684df8d43ad40538370f633df18b34aab4452e06dbe5e5f69c7955f")
      public fun filter(filter: FilterExpressionProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty.builder()

      override fun createColumn(createColumn: Boolean) {
        cdkBuilder.createColumn(createColumn)
      }

      override fun createColumn(createColumn: IResolvable) {
        cdkBuilder.createColumn(createColumn.let(IResolvable::unwrap))
      }

      override fun datetimeOptions(datetimeOptions: IResolvable) {
        cdkBuilder.datetimeOptions(datetimeOptions.let(IResolvable::unwrap))
      }

      override fun datetimeOptions(datetimeOptions: DatetimeOptionsProperty) {
        cdkBuilder.datetimeOptions(datetimeOptions.let(DatetimeOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65a6693a7649a5bea13eff57488531548e480e904d0e34b14bccc2e10bfe22a1")
      override fun datetimeOptions(datetimeOptions: DatetimeOptionsProperty.Builder.() -> Unit):
          Unit = datetimeOptions(DatetimeOptionsProperty(datetimeOptions))

      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      override fun filter(filter: FilterExpressionProperty) {
        cdkBuilder.filter(filter.let(FilterExpressionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("060097b92684df8d43ad40538370f633df18b34aab4452e06dbe5e5f69c7955f")
      override fun filter(filter: FilterExpressionProperty.Builder.() -> Unit): Unit =
          filter(FilterExpressionProperty(filter))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty,
    ) : DatasetParameterProperty {
      override fun createColumn(): Any? = unwrap(this).getCreateColumn()

      override fun datetimeOptions(): Any? = unwrap(this).getDatetimeOptions()

      override fun filter(): Any? = unwrap(this).getFilter()

      override fun name(): String = unwrap(this).getName()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty):
          DatasetParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetParameterProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PathOptionsProperty {
    public fun filesLimit(): Any? = unwrap(this).getFilesLimit()

    public fun lastModifiedDateCondition(): Any? = unwrap(this).getLastModifiedDateCondition()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public interface Builder {
      public fun filesLimit(filesLimit: IResolvable)

      public fun filesLimit(filesLimit: FilesLimitProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4786e8c86d4e79328ebc2fc4d2d315293199a3eebf60b0b821010811952d269")
      public fun filesLimit(filesLimit: FilesLimitProperty.Builder.() -> Unit)

      public fun lastModifiedDateCondition(lastModifiedDateCondition: IResolvable)

      public fun lastModifiedDateCondition(lastModifiedDateCondition: FilterExpressionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("def082e8c0d710e215ee5d01b6afe8a975bcffa87410f4de1ae5b32e1813922b")
      public
          fun lastModifiedDateCondition(lastModifiedDateCondition: FilterExpressionProperty.Builder.() -> Unit)

      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty.builder()

      override fun filesLimit(filesLimit: IResolvable) {
        cdkBuilder.filesLimit(filesLimit.let(IResolvable::unwrap))
      }

      override fun filesLimit(filesLimit: FilesLimitProperty) {
        cdkBuilder.filesLimit(filesLimit.let(FilesLimitProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4786e8c86d4e79328ebc2fc4d2d315293199a3eebf60b0b821010811952d269")
      override fun filesLimit(filesLimit: FilesLimitProperty.Builder.() -> Unit): Unit =
          filesLimit(FilesLimitProperty(filesLimit))

      override fun lastModifiedDateCondition(lastModifiedDateCondition: IResolvable) {
        cdkBuilder.lastModifiedDateCondition(lastModifiedDateCondition.let(IResolvable::unwrap))
      }

      override fun lastModifiedDateCondition(lastModifiedDateCondition: FilterExpressionProperty) {
        cdkBuilder.lastModifiedDateCondition(lastModifiedDateCondition.let(FilterExpressionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("def082e8c0d710e215ee5d01b6afe8a975bcffa87410f4de1ae5b32e1813922b")
      override
          fun lastModifiedDateCondition(lastModifiedDateCondition: FilterExpressionProperty.Builder.() -> Unit):
          Unit = lastModifiedDateCondition(FilterExpressionProperty(lastModifiedDateCondition))

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty,
    ) : PathOptionsProperty {
      override fun filesLimit(): Any? = unwrap(this).getFilesLimit()

      override fun lastModifiedDateCondition(): Any? = unwrap(this).getLastModifiedDateCondition()

      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PathOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty):
          PathOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FilesLimitProperty {
    public fun maxFiles(): Number

    public fun order(): String? = unwrap(this).getOrder()

    public fun orderedBy(): String? = unwrap(this).getOrderedBy()

    public interface Builder {
      public fun maxFiles(maxFiles: Number)

      public fun order(order: String)

      public fun orderedBy(orderedBy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty.builder()

      override fun maxFiles(maxFiles: Number) {
        cdkBuilder.maxFiles(maxFiles)
      }

      override fun order(order: String) {
        cdkBuilder.order(order)
      }

      override fun orderedBy(orderedBy: String) {
        cdkBuilder.orderedBy(orderedBy)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty,
    ) : FilesLimitProperty {
      override fun maxFiles(): Number = unwrap(this).getMaxFiles()

      override fun order(): String? = unwrap(this).getOrder()

      override fun orderedBy(): String? = unwrap(this).getOrderedBy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilesLimitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty):
          FilesLimitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilesLimitProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PathParameterProperty {
    public fun datasetParameter(): Any

    public fun pathParameterName(): String

    public interface Builder {
      public fun datasetParameter(datasetParameter: IResolvable)

      public fun datasetParameter(datasetParameter: DatasetParameterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdfac5b4cc586d6a7701f0d1802143d360bccc8f10a61da5e4922fb28f109a1a")
      public fun datasetParameter(datasetParameter: DatasetParameterProperty.Builder.() -> Unit)

      public fun pathParameterName(pathParameterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty.builder()

      override fun datasetParameter(datasetParameter: IResolvable) {
        cdkBuilder.datasetParameter(datasetParameter.let(IResolvable::unwrap))
      }

      override fun datasetParameter(datasetParameter: DatasetParameterProperty) {
        cdkBuilder.datasetParameter(datasetParameter.let(DatasetParameterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdfac5b4cc586d6a7701f0d1802143d360bccc8f10a61da5e4922fb28f109a1a")
      override fun datasetParameter(datasetParameter: DatasetParameterProperty.Builder.() -> Unit):
          Unit = datasetParameter(DatasetParameterProperty(datasetParameter))

      override fun pathParameterName(pathParameterName: String) {
        cdkBuilder.pathParameterName(pathParameterName)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty,
    ) : PathParameterProperty {
      override fun datasetParameter(): Any = unwrap(this).getDatasetParameter()

      override fun pathParameterName(): String = unwrap(this).getPathParameterName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PathParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty):
          PathParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathParameterProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FilterExpressionProperty {
    public fun expression(): String

    public fun valuesMap(): Any

    public interface Builder {
      public fun expression(expression: String)

      public fun valuesMap(valuesMap: IResolvable)

      public fun valuesMap(valuesMap: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun valuesMap(valuesMap: IResolvable) {
        cdkBuilder.valuesMap(valuesMap.let(IResolvable::unwrap))
      }

      override fun valuesMap(valuesMap: List<Any>) {
        cdkBuilder.valuesMap(valuesMap)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty,
    ) : FilterExpressionProperty {
      override fun expression(): String = unwrap(this).getExpression()

      override fun valuesMap(): Any = unwrap(this).getValuesMap()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty):
          FilterExpressionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterExpressionProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CsvOptionsProperty {
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    public fun headerRow(): Any? = unwrap(this).getHeaderRow()

    public interface Builder {
      public fun delimiter(delimiter: String)

      public fun headerRow(headerRow: Boolean)

      public fun headerRow(headerRow: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty.builder()

      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      override fun headerRow(headerRow: Boolean) {
        cdkBuilder.headerRow(headerRow)
      }

      override fun headerRow(headerRow: IResolvable) {
        cdkBuilder.headerRow(headerRow.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty,
    ) : CsvOptionsProperty {
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      override fun headerRow(): Any? = unwrap(this).getHeaderRow()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CsvOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty):
          CsvOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FilterValueProperty {
    public fun `value`(): String

    public fun valueReference(): String

    public interface Builder {
      public fun `value`(`value`: String)

      public fun valueReference(valueReference: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty.builder()

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      override fun valueReference(valueReference: String) {
        cdkBuilder.valueReference(valueReference)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty,
    ) : FilterValueProperty {
      override fun `value`(): String = unwrap(this).getValue()

      override fun valueReference(): String = unwrap(this).getValueReference()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty):
          FilterValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterValueProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
