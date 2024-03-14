package io.cloudshiftdev.awscdk.services.lookoutmetrics

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

public open class CfnAnomalyDetector internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector,
) : CfnResource(cdkObject), IInspectable {
  public open fun anomalyDetectorConfig(): Any = unwrap(this).getAnomalyDetectorConfig()

  public open fun anomalyDetectorConfig(`value`: IResolvable) {
    unwrap(this).setAnomalyDetectorConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun anomalyDetectorConfig(`value`: AnomalyDetectorConfigProperty) {
    unwrap(this).setAnomalyDetectorConfig(`value`.let(AnomalyDetectorConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29e0a47152ab720c4821d939928092d63dc814ecdd7963dd46de9833f92d60b7")
  public open fun anomalyDetectorConfig(`value`: AnomalyDetectorConfigProperty.Builder.() -> Unit):
      Unit = anomalyDetectorConfig(AnomalyDetectorConfigProperty(`value`))

  public open fun anomalyDetectorDescription(): String? =
      unwrap(this).getAnomalyDetectorDescription()

  public open fun anomalyDetectorDescription(`value`: String) {
    unwrap(this).setAnomalyDetectorDescription(`value`)
  }

  public open fun anomalyDetectorName(): String? = unwrap(this).getAnomalyDetectorName()

  public open fun anomalyDetectorName(`value`: String) {
    unwrap(this).setAnomalyDetectorName(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun metricSetList(): Any = unwrap(this).getMetricSetList()

  public open fun metricSetList(`value`: IResolvable) {
    unwrap(this).setMetricSetList(`value`.let(IResolvable::unwrap))
  }

  public open fun metricSetList(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricSetList(__idx_ac66f0)
  }

  public open fun metricSetList(vararg __idx_ac66f0: Any): Unit =
      metricSetList(__idx_ac66f0.toList())

  public interface Builder {
    public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable)

    public fun anomalyDetectorConfig(anomalyDetectorConfig: AnomalyDetectorConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("310e2d7a912eed67e8df0081c73bbc4f7d42cfe951261ffc109dad5b646aeb91")
    public
        fun anomalyDetectorConfig(anomalyDetectorConfig: AnomalyDetectorConfigProperty.Builder.() -> Unit)

    public fun anomalyDetectorDescription(anomalyDetectorDescription: String)

    public fun anomalyDetectorName(anomalyDetectorName: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun metricSetList(metricSetList: IResolvable)

    public fun metricSetList(metricSetList: List<Any>)

    public fun metricSetList(vararg metricSetList: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.Builder =
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.Builder.create(scope, id)

    override fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
      cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig.let(IResolvable::unwrap))
    }

    override fun anomalyDetectorConfig(anomalyDetectorConfig: AnomalyDetectorConfigProperty) {
      cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig.let(AnomalyDetectorConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("310e2d7a912eed67e8df0081c73bbc4f7d42cfe951261ffc109dad5b646aeb91")
    override
        fun anomalyDetectorConfig(anomalyDetectorConfig: AnomalyDetectorConfigProperty.Builder.() -> Unit):
        Unit = anomalyDetectorConfig(AnomalyDetectorConfigProperty(anomalyDetectorConfig))

    override fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
      cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
    }

    override fun anomalyDetectorName(anomalyDetectorName: String) {
      cdkBuilder.anomalyDetectorName(anomalyDetectorName)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun metricSetList(metricSetList: IResolvable) {
      cdkBuilder.metricSetList(metricSetList.let(IResolvable::unwrap))
    }

    override fun metricSetList(metricSetList: List<Any>) {
      cdkBuilder.metricSetList(metricSetList)
    }

    override fun metricSetList(vararg metricSetList: Any): Unit =
        metricSetList(metricSetList.toList())

    public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnomalyDetector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnomalyDetector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector):
        CfnAnomalyDetector = CfnAnomalyDetector(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyDetector):
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector = wrapped.cdkObject
  }

  public interface CsvFormatDescriptorProperty {
    public fun charset(): String? = unwrap(this).getCharset()

    public fun containsHeader(): Any? = unwrap(this).getContainsHeader()

    public fun delimiter(): String? = unwrap(this).getDelimiter()

    public fun fileCompression(): String? = unwrap(this).getFileCompression()

    public fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()

    public fun quoteSymbol(): String? = unwrap(this).getQuoteSymbol()

    public interface Builder {
      public fun charset(charset: String)

      public fun containsHeader(containsHeader: Boolean)

      public fun containsHeader(containsHeader: IResolvable)

      public fun delimiter(delimiter: String)

      public fun fileCompression(fileCompression: String)

      public fun headerList(headerList: List<String>)

      public fun headerList(vararg headerList: String)

      public fun quoteSymbol(quoteSymbol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty.builder()

      override fun charset(charset: String) {
        cdkBuilder.charset(charset)
      }

      override fun containsHeader(containsHeader: Boolean) {
        cdkBuilder.containsHeader(containsHeader)
      }

      override fun containsHeader(containsHeader: IResolvable) {
        cdkBuilder.containsHeader(containsHeader.let(IResolvable::unwrap))
      }

      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      override fun fileCompression(fileCompression: String) {
        cdkBuilder.fileCompression(fileCompression)
      }

      override fun headerList(headerList: List<String>) {
        cdkBuilder.headerList(headerList)
      }

      override fun headerList(vararg headerList: String): Unit = headerList(headerList.toList())

      override fun quoteSymbol(quoteSymbol: String) {
        cdkBuilder.quoteSymbol(quoteSymbol)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty,
    ) : CsvFormatDescriptorProperty {
      override fun charset(): String? = unwrap(this).getCharset()

      override fun containsHeader(): Any? = unwrap(this).getContainsHeader()

      override fun delimiter(): String? = unwrap(this).getDelimiter()

      override fun fileCompression(): String? = unwrap(this).getFileCompression()

      override fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()

      override fun quoteSymbol(): String? = unwrap(this).getQuoteSymbol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CsvFormatDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty):
          CsvFormatDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvFormatDescriptorProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AppFlowConfigProperty {
    public fun flowName(): String

    public fun roleArn(): String

    public interface Builder {
      public fun flowName(flowName: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty.builder()

      override fun flowName(flowName: String) {
        cdkBuilder.flowName(flowName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty,
    ) : AppFlowConfigProperty {
      override fun flowName(): String = unwrap(this).getFlowName()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AppFlowConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty):
          AppFlowConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppFlowConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricSourceProperty {
    public fun appFlowConfig(): Any? = unwrap(this).getAppFlowConfig()

    public fun cloudwatchConfig(): Any? = unwrap(this).getCloudwatchConfig()

    public fun rdsSourceConfig(): Any? = unwrap(this).getRdsSourceConfig()

    public fun redshiftSourceConfig(): Any? = unwrap(this).getRedshiftSourceConfig()

    public fun s3SourceConfig(): Any? = unwrap(this).getS3SourceConfig()

    public interface Builder {
      public fun appFlowConfig(appFlowConfig: IResolvable)

      public fun appFlowConfig(appFlowConfig: AppFlowConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea8d21be0c2ad107af1f41887dd7e8345d2a5dda7178b97d3abdd5bf9ccc18d1")
      public fun appFlowConfig(appFlowConfig: AppFlowConfigProperty.Builder.() -> Unit)

      public fun cloudwatchConfig(cloudwatchConfig: IResolvable)

      public fun cloudwatchConfig(cloudwatchConfig: CloudwatchConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba449479948db1f3e0406a8c80d061834a90bd959d06da7abb335cddc774620")
      public fun cloudwatchConfig(cloudwatchConfig: CloudwatchConfigProperty.Builder.() -> Unit)

      public fun rdsSourceConfig(rdsSourceConfig: IResolvable)

      public fun rdsSourceConfig(rdsSourceConfig: RDSSourceConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03b7b30fa25db9c078c76f04634ca1138d812b994d9f4d4a7790044122dd91ab")
      public fun rdsSourceConfig(rdsSourceConfig: RDSSourceConfigProperty.Builder.() -> Unit)

      public fun redshiftSourceConfig(redshiftSourceConfig: IResolvable)

      public fun redshiftSourceConfig(redshiftSourceConfig: RedshiftSourceConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("379a1d562b38a714df9d39f2593f3aad945eaf47b297797cef8ef0c9553ca0b1")
      public
          fun redshiftSourceConfig(redshiftSourceConfig: RedshiftSourceConfigProperty.Builder.() -> Unit)

      public fun s3SourceConfig(s3SourceConfig: IResolvable)

      public fun s3SourceConfig(s3SourceConfig: S3SourceConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0b33241d20356d8787deaf8c1da473cafac9c091a911b11f26d5e47441bdc4")
      public fun s3SourceConfig(s3SourceConfig: S3SourceConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty.builder()

      override fun appFlowConfig(appFlowConfig: IResolvable) {
        cdkBuilder.appFlowConfig(appFlowConfig.let(IResolvable::unwrap))
      }

      override fun appFlowConfig(appFlowConfig: AppFlowConfigProperty) {
        cdkBuilder.appFlowConfig(appFlowConfig.let(AppFlowConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea8d21be0c2ad107af1f41887dd7e8345d2a5dda7178b97d3abdd5bf9ccc18d1")
      override fun appFlowConfig(appFlowConfig: AppFlowConfigProperty.Builder.() -> Unit): Unit =
          appFlowConfig(AppFlowConfigProperty(appFlowConfig))

      override fun cloudwatchConfig(cloudwatchConfig: IResolvable) {
        cdkBuilder.cloudwatchConfig(cloudwatchConfig.let(IResolvable::unwrap))
      }

      override fun cloudwatchConfig(cloudwatchConfig: CloudwatchConfigProperty) {
        cdkBuilder.cloudwatchConfig(cloudwatchConfig.let(CloudwatchConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba449479948db1f3e0406a8c80d061834a90bd959d06da7abb335cddc774620")
      override fun cloudwatchConfig(cloudwatchConfig: CloudwatchConfigProperty.Builder.() -> Unit):
          Unit = cloudwatchConfig(CloudwatchConfigProperty(cloudwatchConfig))

      override fun rdsSourceConfig(rdsSourceConfig: IResolvable) {
        cdkBuilder.rdsSourceConfig(rdsSourceConfig.let(IResolvable::unwrap))
      }

      override fun rdsSourceConfig(rdsSourceConfig: RDSSourceConfigProperty) {
        cdkBuilder.rdsSourceConfig(rdsSourceConfig.let(RDSSourceConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03b7b30fa25db9c078c76f04634ca1138d812b994d9f4d4a7790044122dd91ab")
      override fun rdsSourceConfig(rdsSourceConfig: RDSSourceConfigProperty.Builder.() -> Unit):
          Unit = rdsSourceConfig(RDSSourceConfigProperty(rdsSourceConfig))

      override fun redshiftSourceConfig(redshiftSourceConfig: IResolvable) {
        cdkBuilder.redshiftSourceConfig(redshiftSourceConfig.let(IResolvable::unwrap))
      }

      override fun redshiftSourceConfig(redshiftSourceConfig: RedshiftSourceConfigProperty) {
        cdkBuilder.redshiftSourceConfig(redshiftSourceConfig.let(RedshiftSourceConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("379a1d562b38a714df9d39f2593f3aad945eaf47b297797cef8ef0c9553ca0b1")
      override
          fun redshiftSourceConfig(redshiftSourceConfig: RedshiftSourceConfigProperty.Builder.() -> Unit):
          Unit = redshiftSourceConfig(RedshiftSourceConfigProperty(redshiftSourceConfig))

      override fun s3SourceConfig(s3SourceConfig: IResolvable) {
        cdkBuilder.s3SourceConfig(s3SourceConfig.let(IResolvable::unwrap))
      }

      override fun s3SourceConfig(s3SourceConfig: S3SourceConfigProperty) {
        cdkBuilder.s3SourceConfig(s3SourceConfig.let(S3SourceConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0b33241d20356d8787deaf8c1da473cafac9c091a911b11f26d5e47441bdc4")
      override fun s3SourceConfig(s3SourceConfig: S3SourceConfigProperty.Builder.() -> Unit): Unit =
          s3SourceConfig(S3SourceConfigProperty(s3SourceConfig))

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty,
    ) : MetricSourceProperty {
      override fun appFlowConfig(): Any? = unwrap(this).getAppFlowConfig()

      override fun cloudwatchConfig(): Any? = unwrap(this).getCloudwatchConfig()

      override fun rdsSourceConfig(): Any? = unwrap(this).getRdsSourceConfig()

      override fun redshiftSourceConfig(): Any? = unwrap(this).getRedshiftSourceConfig()

      override fun s3SourceConfig(): Any? = unwrap(this).getS3SourceConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty):
          MetricSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricSourceProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FileFormatDescriptorProperty {
    public fun csvFormatDescriptor(): Any? = unwrap(this).getCsvFormatDescriptor()

    public fun jsonFormatDescriptor(): Any? = unwrap(this).getJsonFormatDescriptor()

    public interface Builder {
      public fun csvFormatDescriptor(csvFormatDescriptor: IResolvable)

      public fun csvFormatDescriptor(csvFormatDescriptor: CsvFormatDescriptorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30d6418ff59aaf89b781b0c583a0eb6b9303fa8ef376df16e9f445c4c4aef2c0")
      public
          fun csvFormatDescriptor(csvFormatDescriptor: CsvFormatDescriptorProperty.Builder.() -> Unit)

      public fun jsonFormatDescriptor(jsonFormatDescriptor: IResolvable)

      public fun jsonFormatDescriptor(jsonFormatDescriptor: JsonFormatDescriptorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c86ece7f584b864cf6c69e6c3bc75a7a3a79938f6d5e16faf4d4b0b8c3432593")
      public
          fun jsonFormatDescriptor(jsonFormatDescriptor: JsonFormatDescriptorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty.builder()

      override fun csvFormatDescriptor(csvFormatDescriptor: IResolvable) {
        cdkBuilder.csvFormatDescriptor(csvFormatDescriptor.let(IResolvable::unwrap))
      }

      override fun csvFormatDescriptor(csvFormatDescriptor: CsvFormatDescriptorProperty) {
        cdkBuilder.csvFormatDescriptor(csvFormatDescriptor.let(CsvFormatDescriptorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30d6418ff59aaf89b781b0c583a0eb6b9303fa8ef376df16e9f445c4c4aef2c0")
      override
          fun csvFormatDescriptor(csvFormatDescriptor: CsvFormatDescriptorProperty.Builder.() -> Unit):
          Unit = csvFormatDescriptor(CsvFormatDescriptorProperty(csvFormatDescriptor))

      override fun jsonFormatDescriptor(jsonFormatDescriptor: IResolvable) {
        cdkBuilder.jsonFormatDescriptor(jsonFormatDescriptor.let(IResolvable::unwrap))
      }

      override fun jsonFormatDescriptor(jsonFormatDescriptor: JsonFormatDescriptorProperty) {
        cdkBuilder.jsonFormatDescriptor(jsonFormatDescriptor.let(JsonFormatDescriptorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c86ece7f584b864cf6c69e6c3bc75a7a3a79938f6d5e16faf4d4b0b8c3432593")
      override
          fun jsonFormatDescriptor(jsonFormatDescriptor: JsonFormatDescriptorProperty.Builder.() -> Unit):
          Unit = jsonFormatDescriptor(JsonFormatDescriptorProperty(jsonFormatDescriptor))

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty,
    ) : FileFormatDescriptorProperty {
      override fun csvFormatDescriptor(): Any? = unwrap(this).getCsvFormatDescriptor()

      override fun jsonFormatDescriptor(): Any? = unwrap(this).getJsonFormatDescriptor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileFormatDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty):
          FileFormatDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileFormatDescriptorProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3SourceConfigProperty {
    public fun fileFormatDescriptor(): Any

    public fun historicalDataPathList(): List<String> = unwrap(this).getHistoricalDataPathList() ?:
        emptyList()

    public fun roleArn(): String

    public fun templatedPathList(): List<String> = unwrap(this).getTemplatedPathList() ?:
        emptyList()

    public interface Builder {
      public fun fileFormatDescriptor(fileFormatDescriptor: IResolvable)

      public fun fileFormatDescriptor(fileFormatDescriptor: FileFormatDescriptorProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ccd65d2ef4bea3cf3665b6f21068e34ba6e5a644796dd8008eb039ae6c39257")
      public
          fun fileFormatDescriptor(fileFormatDescriptor: FileFormatDescriptorProperty.Builder.() -> Unit)

      public fun historicalDataPathList(historicalDataPathList: List<String>)

      public fun historicalDataPathList(vararg historicalDataPathList: String)

      public fun roleArn(roleArn: String)

      public fun templatedPathList(templatedPathList: List<String>)

      public fun templatedPathList(vararg templatedPathList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty.builder()

      override fun fileFormatDescriptor(fileFormatDescriptor: IResolvable) {
        cdkBuilder.fileFormatDescriptor(fileFormatDescriptor.let(IResolvable::unwrap))
      }

      override fun fileFormatDescriptor(fileFormatDescriptor: FileFormatDescriptorProperty) {
        cdkBuilder.fileFormatDescriptor(fileFormatDescriptor.let(FileFormatDescriptorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ccd65d2ef4bea3cf3665b6f21068e34ba6e5a644796dd8008eb039ae6c39257")
      override
          fun fileFormatDescriptor(fileFormatDescriptor: FileFormatDescriptorProperty.Builder.() -> Unit):
          Unit = fileFormatDescriptor(FileFormatDescriptorProperty(fileFormatDescriptor))

      override fun historicalDataPathList(historicalDataPathList: List<String>) {
        cdkBuilder.historicalDataPathList(historicalDataPathList)
      }

      override fun historicalDataPathList(vararg historicalDataPathList: String): Unit =
          historicalDataPathList(historicalDataPathList.toList())

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun templatedPathList(templatedPathList: List<String>) {
        cdkBuilder.templatedPathList(templatedPathList)
      }

      override fun templatedPathList(vararg templatedPathList: String): Unit =
          templatedPathList(templatedPathList.toList())

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty,
    ) : S3SourceConfigProperty {
      override fun fileFormatDescriptor(): Any = unwrap(this).getFileFormatDescriptor()

      override fun historicalDataPathList(): List<String> = unwrap(this).getHistoricalDataPathList()
          ?: emptyList()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun templatedPathList(): List<String> = unwrap(this).getTemplatedPathList() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty):
          S3SourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SourceConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RDSSourceConfigProperty {
    public fun databaseHost(): String

    public fun databaseName(): String

    public fun databasePort(): Number

    public fun dbInstanceIdentifier(): String

    public fun roleArn(): String

    public fun secretManagerArn(): String

    public fun tableName(): String

    public fun vpcConfiguration(): Any

    public interface Builder {
      public fun databaseHost(databaseHost: String)

      public fun databaseName(databaseName: String)

      public fun databasePort(databasePort: Number)

      public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

      public fun roleArn(roleArn: String)

      public fun secretManagerArn(secretManagerArn: String)

      public fun tableName(tableName: String)

      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc30b7b55065b625817ede33b84528c2c54d50cf3659231e470da1c9c74ae061")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty.builder()

      override fun databaseHost(databaseHost: String) {
        cdkBuilder.databaseHost(databaseHost)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun databasePort(databasePort: Number) {
        cdkBuilder.databasePort(databasePort)
      }

      override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
        cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc30b7b55065b625817ede33b84528c2c54d50cf3659231e470da1c9c74ae061")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty,
    ) : RDSSourceConfigProperty {
      override fun databaseHost(): String = unwrap(this).getDatabaseHost()

      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun databasePort(): Number = unwrap(this).getDatabasePort()

      override fun dbInstanceIdentifier(): String = unwrap(this).getDbInstanceIdentifier()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun secretManagerArn(): String = unwrap(this).getSecretManagerArn()

      override fun tableName(): String = unwrap(this).getTableName()

      override fun vpcConfiguration(): Any = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RDSSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty):
          RDSSourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RDSSourceConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedshiftSourceConfigProperty {
    public fun clusterIdentifier(): String

    public fun databaseHost(): String

    public fun databaseName(): String

    public fun databasePort(): Number

    public fun roleArn(): String

    public fun secretManagerArn(): String

    public fun tableName(): String

    public fun vpcConfiguration(): Any

    public interface Builder {
      public fun clusterIdentifier(clusterIdentifier: String)

      public fun databaseHost(databaseHost: String)

      public fun databaseName(databaseName: String)

      public fun databasePort(databasePort: Number)

      public fun roleArn(roleArn: String)

      public fun secretManagerArn(secretManagerArn: String)

      public fun tableName(tableName: String)

      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b8e19f2c89d9df5d9f6c2afeee75106625f4daa9ebfb1bcf2c6bfe473e39d4b")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty.builder()

      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      override fun databaseHost(databaseHost: String) {
        cdkBuilder.databaseHost(databaseHost)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun databasePort(databasePort: Number) {
        cdkBuilder.databasePort(databasePort)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b8e19f2c89d9df5d9f6c2afeee75106625f4daa9ebfb1bcf2c6bfe473e39d4b")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty,
    ) : RedshiftSourceConfigProperty {
      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

      override fun databaseHost(): String = unwrap(this).getDatabaseHost()

      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun databasePort(): Number = unwrap(this).getDatabasePort()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun secretManagerArn(): String = unwrap(this).getSecretManagerArn()

      override fun tableName(): String = unwrap(this).getTableName()

      override fun vpcConfiguration(): Any = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty):
          RedshiftSourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftSourceConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimestampColumnProperty {
    public fun columnFormat(): String? = unwrap(this).getColumnFormat()

    public fun columnName(): String? = unwrap(this).getColumnName()

    public interface Builder {
      public fun columnFormat(columnFormat: String)

      public fun columnName(columnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty.builder()

      override fun columnFormat(columnFormat: String) {
        cdkBuilder.columnFormat(columnFormat)
      }

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty,
    ) : TimestampColumnProperty {
      override fun columnFormat(): String? = unwrap(this).getColumnFormat()

      override fun columnName(): String? = unwrap(this).getColumnName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimestampColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty):
          TimestampColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestampColumnProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnomalyDetectorConfigProperty {
    public fun anomalyDetectorFrequency(): String

    public interface Builder {
      public fun anomalyDetectorFrequency(anomalyDetectorFrequency: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty.builder()

      override fun anomalyDetectorFrequency(anomalyDetectorFrequency: String) {
        cdkBuilder.anomalyDetectorFrequency(anomalyDetectorFrequency)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty,
    ) : AnomalyDetectorConfigProperty {
      override fun anomalyDetectorFrequency(): String = unwrap(this).getAnomalyDetectorFrequency()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnomalyDetectorConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty):
          AnomalyDetectorConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnomalyDetectorConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface JsonFormatDescriptorProperty {
    public fun charset(): String? = unwrap(this).getCharset()

    public fun fileCompression(): String? = unwrap(this).getFileCompression()

    public interface Builder {
      public fun charset(charset: String)

      public fun fileCompression(fileCompression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty.builder()

      override fun charset(charset: String) {
        cdkBuilder.charset(charset)
      }

      override fun fileCompression(fileCompression: String) {
        cdkBuilder.fileCompression(fileCompression)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty,
    ) : JsonFormatDescriptorProperty {
      override fun charset(): String? = unwrap(this).getCharset()

      override fun fileCompression(): String? = unwrap(this).getFileCompression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonFormatDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty):
          JsonFormatDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonFormatDescriptorProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudwatchConfigProperty {
    public fun roleArn(): String

    public interface Builder {
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty,
    ) : CloudwatchConfigProperty {
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty):
          CloudwatchConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricProperty {
    public fun aggregationFunction(): String

    public fun metricName(): String

    public fun namespace(): String? = unwrap(this).getNamespace()

    public interface Builder {
      public fun aggregationFunction(aggregationFunction: String)

      public fun metricName(metricName: String)

      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty.Builder =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty.builder()

      override fun aggregationFunction(aggregationFunction: String) {
        cdkBuilder.aggregationFunction(aggregationFunction)
      }

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty,
    ) : MetricProperty {
      override fun aggregationFunction(): String = unwrap(this).getAggregationFunction()

      override fun metricName(): String = unwrap(this).getMetricName()

      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty):
          MetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricSetProperty {
    public fun dimensionList(): List<String> = unwrap(this).getDimensionList() ?: emptyList()

    public fun metricList(): Any

    public fun metricSetDescription(): String? = unwrap(this).getMetricSetDescription()

    public fun metricSetFrequency(): String? = unwrap(this).getMetricSetFrequency()

    public fun metricSetName(): String

    public fun metricSource(): Any

    public fun offset(): Number? = unwrap(this).getOffset()

    public fun timestampColumn(): Any? = unwrap(this).getTimestampColumn()

    public fun timezone(): String? = unwrap(this).getTimezone()

    public interface Builder {
      public fun dimensionList(dimensionList: List<String>)

      public fun dimensionList(vararg dimensionList: String)

      public fun metricList(metricList: IResolvable)

      public fun metricList(metricList: List<Any>)

      public fun metricList(vararg metricList: Any)

      public fun metricSetDescription(metricSetDescription: String)

      public fun metricSetFrequency(metricSetFrequency: String)

      public fun metricSetName(metricSetName: String)

      public fun metricSource(metricSource: IResolvable)

      public fun metricSource(metricSource: MetricSourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8edd65da7b26df550b3da384529252571ec6d3445a5ecedfa8342c9a5d560f00")
      public fun metricSource(metricSource: MetricSourceProperty.Builder.() -> Unit)

      public fun offset(offset: Number)

      public fun timestampColumn(timestampColumn: IResolvable)

      public fun timestampColumn(timestampColumn: TimestampColumnProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("941baba079da8b0622ec9475d1c7eb325edeed95624265d9c0087beb9442dd16")
      public fun timestampColumn(timestampColumn: TimestampColumnProperty.Builder.() -> Unit)

      public fun timezone(timezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty.builder()

      override fun dimensionList(dimensionList: List<String>) {
        cdkBuilder.dimensionList(dimensionList)
      }

      override fun dimensionList(vararg dimensionList: String): Unit =
          dimensionList(dimensionList.toList())

      override fun metricList(metricList: IResolvable) {
        cdkBuilder.metricList(metricList.let(IResolvable::unwrap))
      }

      override fun metricList(metricList: List<Any>) {
        cdkBuilder.metricList(metricList)
      }

      override fun metricList(vararg metricList: Any): Unit = metricList(metricList.toList())

      override fun metricSetDescription(metricSetDescription: String) {
        cdkBuilder.metricSetDescription(metricSetDescription)
      }

      override fun metricSetFrequency(metricSetFrequency: String) {
        cdkBuilder.metricSetFrequency(metricSetFrequency)
      }

      override fun metricSetName(metricSetName: String) {
        cdkBuilder.metricSetName(metricSetName)
      }

      override fun metricSource(metricSource: IResolvable) {
        cdkBuilder.metricSource(metricSource.let(IResolvable::unwrap))
      }

      override fun metricSource(metricSource: MetricSourceProperty) {
        cdkBuilder.metricSource(metricSource.let(MetricSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8edd65da7b26df550b3da384529252571ec6d3445a5ecedfa8342c9a5d560f00")
      override fun metricSource(metricSource: MetricSourceProperty.Builder.() -> Unit): Unit =
          metricSource(MetricSourceProperty(metricSource))

      override fun offset(offset: Number) {
        cdkBuilder.offset(offset)
      }

      override fun timestampColumn(timestampColumn: IResolvable) {
        cdkBuilder.timestampColumn(timestampColumn.let(IResolvable::unwrap))
      }

      override fun timestampColumn(timestampColumn: TimestampColumnProperty) {
        cdkBuilder.timestampColumn(timestampColumn.let(TimestampColumnProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("941baba079da8b0622ec9475d1c7eb325edeed95624265d9c0087beb9442dd16")
      override fun timestampColumn(timestampColumn: TimestampColumnProperty.Builder.() -> Unit):
          Unit = timestampColumn(TimestampColumnProperty(timestampColumn))

      override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty,
    ) : MetricSetProperty {
      override fun dimensionList(): List<String> = unwrap(this).getDimensionList() ?: emptyList()

      override fun metricList(): Any = unwrap(this).getMetricList()

      override fun metricSetDescription(): String? = unwrap(this).getMetricSetDescription()

      override fun metricSetFrequency(): String? = unwrap(this).getMetricSetFrequency()

      override fun metricSetName(): String = unwrap(this).getMetricSetName()

      override fun metricSource(): Any = unwrap(this).getMetricSource()

      override fun offset(): Number? = unwrap(this).getOffset()

      override fun timestampColumn(): Any? = unwrap(this).getTimestampColumn()

      override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty):
          MetricSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricSetProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigurationProperty {
    public fun securityGroupIdList(): List<String>

    public fun subnetIdList(): List<String>

    public interface Builder {
      public fun securityGroupIdList(securityGroupIdList: List<String>)

      public fun securityGroupIdList(vararg securityGroupIdList: String)

      public fun subnetIdList(subnetIdList: List<String>)

      public fun subnetIdList(vararg subnetIdList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty.builder()

      override fun securityGroupIdList(securityGroupIdList: List<String>) {
        cdkBuilder.securityGroupIdList(securityGroupIdList)
      }

      override fun securityGroupIdList(vararg securityGroupIdList: String): Unit =
          securityGroupIdList(securityGroupIdList.toList())

      override fun subnetIdList(subnetIdList: List<String>) {
        cdkBuilder.subnetIdList(subnetIdList)
      }

      override fun subnetIdList(vararg subnetIdList: String): Unit =
          subnetIdList(subnetIdList.toList())

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty,
    ) : VpcConfigurationProperty {
      override fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList()

      override fun subnetIdList(): List<String> = unwrap(this).getSubnetIdList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
