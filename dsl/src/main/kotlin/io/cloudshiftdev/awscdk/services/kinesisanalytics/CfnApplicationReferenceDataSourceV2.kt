package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationReferenceDataSourceV2 internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun referenceDataSource(): Any = unwrap(this).getReferenceDataSource()

  public open fun referenceDataSource(`value`: IResolvable) {
    unwrap(this).setReferenceDataSource(`value`.let(IResolvable::unwrap))
  }

  public open fun referenceDataSource(`value`: ReferenceDataSourceProperty) {
    unwrap(this).setReferenceDataSource(`value`.let(ReferenceDataSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1c998c97750f5e2de757179b682d329c914a5f64e2ec0e381647a2841cc6c25")
  public open fun referenceDataSource(`value`: ReferenceDataSourceProperty.Builder.() -> Unit): Unit
      = referenceDataSource(ReferenceDataSourceProperty(`value`))

  public interface Builder {
    public fun applicationName(applicationName: String) {
    }

    public fun referenceDataSource(referenceDataSource: IResolvable) {
    }

    public fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d3cd708ed3508a9898619a52e0df1b1ae1c31cb02154951c4c82ed6a11e562")
    public
        fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.Builder
        =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.Builder.create(scope,
        id)

    public override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public override fun referenceDataSource(referenceDataSource: IResolvable) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(IResolvable::unwrap))
    }

    public override fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(ReferenceDataSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d3cd708ed3508a9898619a52e0df1b1ae1c31cb02154951c4c82ed6a11e562")
    public override
        fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty.Builder.() -> Unit):
        Unit = referenceDataSource(ReferenceDataSourceProperty(referenceDataSource))

    public fun build():
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationReferenceDataSourceV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationReferenceDataSourceV2(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2):
        CfnApplicationReferenceDataSourceV2 = CfnApplicationReferenceDataSourceV2(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationReferenceDataSourceV2):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 =
        wrapped.cdkObject
  }

  public interface ReferenceSchemaProperty {
    public fun recordColumns(): Any

    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    public fun recordFormat(): Any

    public interface Builder {
      public fun recordColumns(recordColumns: IResolvable) {
      }

      public fun recordColumns(recordColumns: List<Any>) {
      }

      public fun recordEncoding(recordEncoding: String) {
      }

      public fun recordFormat(recordFormat: IResolvable) {
      }

      public fun recordFormat(recordFormat: RecordFormatProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde604734a23a49df990e10c9bee2231c25e647050edeb6e8abcb6f6b01b38c0")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.builder()

      public override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable::unwrap))
      }

      public override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns)
      }

      public override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      public override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable::unwrap))
      }

      public override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde604734a23a49df990e10c9bee2231c25e647050edeb6e8abcb6f6b01b38c0")
      public override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit
          = recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty,
    ) : ReferenceSchemaProperty {
      public override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      public override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      public override fun recordFormat(): Any = unwrap(this).getRecordFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty):
          ReferenceSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CSVMappingParametersProperty {
    public fun recordColumnDelimiter(): String

    public fun recordRowDelimiter(): String

    public interface Builder {
      public fun recordColumnDelimiter(recordColumnDelimiter: String) {
      }

      public fun recordRowDelimiter(recordRowDelimiter: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.builder()

      public override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      public override fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty,
    ) : CSVMappingParametersProperty {
      public override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      public override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CSVMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty):
          CSVMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CSVMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface JSONMappingParametersProperty {
    public fun recordRowPath(): String

    public interface Builder {
      public fun recordRowPath(recordRowPath: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.builder()

      public override fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty,
    ) : JSONMappingParametersProperty {
      public override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JSONMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty):
          JSONMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JSONMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ReferenceDataSourceProperty {
    public fun bucketArn(): String

    public fun fileKey(): String

    public interface Builder {
      public fun bucketArn(bucketArn: String) {
      }

      public fun fileKey(fileKey: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.builder()

      public override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      public override fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty,
    ) : S3ReferenceDataSourceProperty {
      public override fun bucketArn(): String = unwrap(this).getBucketArn()

      public override fun fileKey(): String = unwrap(this).getFileKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ReferenceDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty):
          S3ReferenceDataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ReferenceDataSourceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordFormatProperty {
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    public fun recordFormatType(): String

    public interface Builder {
      public fun mappingParameters(mappingParameters: IResolvable) {
      }

      public fun mappingParameters(mappingParameters: MappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9355f01168aa04c8b14aaddc97622ba12495bb03768ec9fc390df24b14aef14a")
      public
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit) {
      }

      public fun recordFormatType(recordFormatType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.builder()

      public override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable::unwrap))
      }

      public override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9355f01168aa04c8b14aaddc97622ba12495bb03768ec9fc390df24b14aef14a")
      public override
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit):
          Unit = mappingParameters(MappingParametersProperty(mappingParameters))

      public override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty,
    ) : RecordFormatProperty {
      public override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      public override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty):
          RecordFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordFormatProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MappingParametersProperty {
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

    public interface Builder {
      public fun csvMappingParameters(csvMappingParameters: IResolvable) {
      }

      public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("925d695c2fe01427163b2c300c24fcc668c27e71a5c3f6d287630e5fb1477594")
      public
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit) {
      }

      public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
      }

      public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d4fdf5c4a50f602ccf3d8f3d812889594e2d6b1fa5f37e30afb96e6876f2016")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.builder()

      public override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable::unwrap))
      }

      public override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("925d695c2fe01427163b2c300c24fcc668c27e71a5c3f6d287630e5fb1477594")
      public override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      public override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable::unwrap))
      }

      public override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d4fdf5c4a50f602ccf3d8f3d812889594e2d6b1fa5f37e30afb96e6876f2016")
      public override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit):
          Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty,
    ) : MappingParametersProperty {
      public override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      public override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty):
          MappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordColumnProperty {
    public fun mapping(): String? = unwrap(this).getMapping()

    public fun name(): String

    public fun sqlType(): String

    public interface Builder {
      public fun mapping(mapping: String) {
      }

      public fun name(name: String) {
      }

      public fun sqlType(sqlType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.builder()

      public override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty,
    ) : RecordColumnProperty {
      public override fun mapping(): String? = unwrap(this).getMapping()

      public override fun name(): String = unwrap(this).getName()

      public override fun sqlType(): String = unwrap(this).getSqlType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty):
          RecordColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordColumnProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReferenceDataSourceProperty {
    public fun referenceSchema(): Any

    public fun s3ReferenceDataSource(): Any? = unwrap(this).getS3ReferenceDataSource()

    public fun tableName(): String? = unwrap(this).getTableName()

    public interface Builder {
      public fun referenceSchema(referenceSchema: IResolvable) {
      }

      public fun referenceSchema(referenceSchema: ReferenceSchemaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e005b0c8ced29c3853d670709c7e4289adc0ca163eb47ca8a50835e6cfef344")
      public fun referenceSchema(referenceSchema: ReferenceSchemaProperty.Builder.() -> Unit) {
      }

      public fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
      }

      public fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67c2f5ac9cbcd62e0a00fdeaecc7ac564b1438977587ec098dd438aef8293556")
      public
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty.Builder.() -> Unit) {
      }

      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.builder()

      public override fun referenceSchema(referenceSchema: IResolvable) {
        cdkBuilder.referenceSchema(referenceSchema.let(IResolvable::unwrap))
      }

      public override fun referenceSchema(referenceSchema: ReferenceSchemaProperty) {
        cdkBuilder.referenceSchema(referenceSchema.let(ReferenceSchemaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e005b0c8ced29c3853d670709c7e4289adc0ca163eb47ca8a50835e6cfef344")
      public override
          fun referenceSchema(referenceSchema: ReferenceSchemaProperty.Builder.() -> Unit): Unit =
          referenceSchema(ReferenceSchemaProperty(referenceSchema))

      public override fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource.let(IResolvable::unwrap))
      }

      public override
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource.let(S3ReferenceDataSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67c2f5ac9cbcd62e0a00fdeaecc7ac564b1438977587ec098dd438aef8293556")
      public override
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty.Builder.() -> Unit):
          Unit = s3ReferenceDataSource(S3ReferenceDataSourceProperty(s3ReferenceDataSource))

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty,
    ) : ReferenceDataSourceProperty {
      public override fun referenceSchema(): Any = unwrap(this).getReferenceSchema()

      public override fun s3ReferenceDataSource(): Any? = unwrap(this).getS3ReferenceDataSource()

      public override fun tableName(): String? = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty):
          ReferenceDataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceDataSourceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
