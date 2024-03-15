@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lookoutmetrics

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

/**
 * The `AWS::LookoutMetrics::AnomalyDetector` type creates an anomaly detector.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
 * CfnAnomalyDetector cfnAnomalyDetector = CfnAnomalyDetector.Builder.create(this,
 * "MyCfnAnomalyDetector")
 * .anomalyDetectorConfig(AnomalyDetectorConfigProperty.builder()
 * .anomalyDetectorFrequency("anomalyDetectorFrequency")
 * .build())
 * .metricSetList(List.of(MetricSetProperty.builder()
 * .metricList(List.of(MetricProperty.builder()
 * .aggregationFunction("aggregationFunction")
 * .metricName("metricName")
 * // the properties below are optional
 * .namespace("namespace")
 * .build()))
 * .metricSetName("metricSetName")
 * .metricSource(MetricSourceProperty.builder()
 * .appFlowConfig(AppFlowConfigProperty.builder()
 * .flowName("flowName")
 * .roleArn("roleArn")
 * .build())
 * .cloudwatchConfig(CloudwatchConfigProperty.builder()
 * .roleArn("roleArn")
 * .build())
 * .rdsSourceConfig(RDSSourceConfigProperty.builder()
 * .databaseHost("databaseHost")
 * .databaseName("databaseName")
 * .databasePort(123)
 * .dbInstanceIdentifier("dbInstanceIdentifier")
 * .roleArn("roleArn")
 * .secretManagerArn("secretManagerArn")
 * .tableName("tableName")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetIdList(List.of("subnetIdList"))
 * .build())
 * .build())
 * .redshiftSourceConfig(RedshiftSourceConfigProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .databaseHost("databaseHost")
 * .databaseName("databaseName")
 * .databasePort(123)
 * .roleArn("roleArn")
 * .secretManagerArn("secretManagerArn")
 * .tableName("tableName")
 * .vpcConfiguration(VpcConfigurationProperty.builder()
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetIdList(List.of("subnetIdList"))
 * .build())
 * .build())
 * .s3SourceConfig(S3SourceConfigProperty.builder()
 * .fileFormatDescriptor(FileFormatDescriptorProperty.builder()
 * .csvFormatDescriptor(CsvFormatDescriptorProperty.builder()
 * .charset("charset")
 * .containsHeader(false)
 * .delimiter("delimiter")
 * .fileCompression("fileCompression")
 * .headerList(List.of("headerList"))
 * .quoteSymbol("quoteSymbol")
 * .build())
 * .jsonFormatDescriptor(JsonFormatDescriptorProperty.builder()
 * .charset("charset")
 * .fileCompression("fileCompression")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .historicalDataPathList(List.of("historicalDataPathList"))
 * .templatedPathList(List.of("templatedPathList"))
 * .build())
 * .build())
 * // the properties below are optional
 * .dimensionList(List.of("dimensionList"))
 * .metricSetDescription("metricSetDescription")
 * .metricSetFrequency("metricSetFrequency")
 * .offset(123)
 * .timestampColumn(TimestampColumnProperty.builder()
 * .columnFormat("columnFormat")
 * .columnName("columnName")
 * .build())
 * .timezone("timezone")
 * .build()))
 * // the properties below are optional
 * .anomalyDetectorDescription("anomalyDetectorDescription")
 * .anomalyDetectorName("anomalyDetectorName")
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html)
 */
public open class CfnAnomalyDetector internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Contains information about the configuration of the anomaly detector.
   */
  public open fun anomalyDetectorConfig(): Any = unwrap(this).getAnomalyDetectorConfig()

  /**
   * Contains information about the configuration of the anomaly detector.
   */
  public open fun anomalyDetectorConfig(`value`: IResolvable) {
    unwrap(this).setAnomalyDetectorConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains information about the configuration of the anomaly detector.
   */
  public open fun anomalyDetectorConfig(`value`: AnomalyDetectorConfigProperty) {
    unwrap(this).setAnomalyDetectorConfig(`value`.let(AnomalyDetectorConfigProperty::unwrap))
  }

  /**
   * Contains information about the configuration of the anomaly detector.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29e0a47152ab720c4821d939928092d63dc814ecdd7963dd46de9833f92d60b7")
  public open fun anomalyDetectorConfig(`value`: AnomalyDetectorConfigProperty.Builder.() -> Unit):
      Unit = anomalyDetectorConfig(AnomalyDetectorConfigProperty(`value`))

  /**
   * A description of the detector.
   */
  public open fun anomalyDetectorDescription(): String? =
      unwrap(this).getAnomalyDetectorDescription()

  /**
   * A description of the detector.
   */
  public open fun anomalyDetectorDescription(`value`: String) {
    unwrap(this).setAnomalyDetectorDescription(`value`)
  }

  /**
   * The name of the detector.
   */
  public open fun anomalyDetectorName(): String? = unwrap(this).getAnomalyDetectorName()

  /**
   * The name of the detector.
   */
  public open fun anomalyDetectorName(`value`: String) {
    unwrap(this).setAnomalyDetectorName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the detector.
   *
   * For example, `arn:aws:lookoutmetrics:us-east-2:123456789012:AnomalyDetector:my-detector`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ARN of the KMS key to use to encrypt your data.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The ARN of the KMS key to use to encrypt your data.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The detector's dataset.
   */
  public open fun metricSetList(): Any = unwrap(this).getMetricSetList()

  /**
   * The detector's dataset.
   */
  public open fun metricSetList(`value`: IResolvable) {
    unwrap(this).setMetricSetList(`value`.let(IResolvable::unwrap))
  }

  /**
   * The detector's dataset.
   */
  public open fun metricSetList(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricSetList(__idx_ac66f0)
  }

  /**
   * The detector's dataset.
   */
  public open fun metricSetList(vararg __idx_ac66f0: Any): Unit =
      metricSetList(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lookoutmetrics.CfnAnomalyDetector].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable)

    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    public fun anomalyDetectorConfig(anomalyDetectorConfig: AnomalyDetectorConfigProperty)

    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("310e2d7a912eed67e8df0081c73bbc4f7d42cfe951261ffc109dad5b646aeb91")
    public
        fun anomalyDetectorConfig(anomalyDetectorConfig: AnomalyDetectorConfigProperty.Builder.() -> Unit)

    /**
     * A description of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectordescription)
     * @param anomalyDetectorDescription A description of the detector. 
     */
    public fun anomalyDetectorDescription(anomalyDetectorDescription: String)

    /**
     * The name of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorname)
     * @param anomalyDetectorName The name of the detector. 
     */
    public fun anomalyDetectorName(anomalyDetectorName: String)

    /**
     * The ARN of the KMS key to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-kmskeyarn)
     * @param kmsKeyArn The ARN of the KMS key to use to encrypt your data. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     * @param metricSetList The detector's dataset. 
     */
    public fun metricSetList(metricSetList: IResolvable)

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     * @param metricSetList The detector's dataset. 
     */
    public fun metricSetList(metricSetList: List<Any>)

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     * @param metricSetList The detector's dataset. 
     */
    public fun metricSetList(vararg metricSetList: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.Builder =
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.Builder.create(scope, id)

    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    override fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
      cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig.let(IResolvable::unwrap))
    }

    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    override fun anomalyDetectorConfig(anomalyDetectorConfig: AnomalyDetectorConfigProperty) {
      cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig.let(AnomalyDetectorConfigProperty::unwrap))
    }

    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("310e2d7a912eed67e8df0081c73bbc4f7d42cfe951261ffc109dad5b646aeb91")
    override
        fun anomalyDetectorConfig(anomalyDetectorConfig: AnomalyDetectorConfigProperty.Builder.() -> Unit):
        Unit = anomalyDetectorConfig(AnomalyDetectorConfigProperty(anomalyDetectorConfig))

    /**
     * A description of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectordescription)
     * @param anomalyDetectorDescription A description of the detector. 
     */
    override fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
      cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
    }

    /**
     * The name of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorname)
     * @param anomalyDetectorName The name of the detector. 
     */
    override fun anomalyDetectorName(anomalyDetectorName: String) {
      cdkBuilder.anomalyDetectorName(anomalyDetectorName)
    }

    /**
     * The ARN of the KMS key to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-kmskeyarn)
     * @param kmsKeyArn The ARN of the KMS key to use to encrypt your data. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     * @param metricSetList The detector's dataset. 
     */
    override fun metricSetList(metricSetList: IResolvable) {
      cdkBuilder.metricSetList(metricSetList.let(IResolvable::unwrap))
    }

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     * @param metricSetList The detector's dataset. 
     */
    override fun metricSetList(metricSetList: List<Any>) {
      cdkBuilder.metricSetList(metricSetList)
    }

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     * @param metricSetList The detector's dataset. 
     */
    override fun metricSetList(vararg metricSetList: Any): Unit =
        metricSetList(metricSetList.toList())

    public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CFN_RESOURCE_TYPE_NAME

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

  /**
   * Contains information about how a source CSV data file should be analyzed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * CsvFormatDescriptorProperty csvFormatDescriptorProperty = CsvFormatDescriptorProperty.builder()
   * .charset("charset")
   * .containsHeader(false)
   * .delimiter("delimiter")
   * .fileCompression("fileCompression")
   * .headerList(List.of("headerList"))
   * .quoteSymbol("quoteSymbol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html)
   */
  public interface CsvFormatDescriptorProperty {
    /**
     * The character set in which the source CSV file is written.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-charset)
     */
    public fun charset(): String? = unwrap(this).getCharset()

    /**
     * Whether or not the source CSV file contains a header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-containsheader)
     */
    public fun containsHeader(): Any? = unwrap(this).getContainsHeader()

    /**
     * The character used to delimit the source CSV file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-delimiter)
     */
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * The level of compression of the source CSV file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-filecompression)
     */
    public fun fileCompression(): String? = unwrap(this).getFileCompression()

    /**
     * A list of the source CSV file's headers, if any.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-headerlist)
     */
    public fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()

    /**
     * The character used as a quote character.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-quotesymbol)
     */
    public fun quoteSymbol(): String? = unwrap(this).getQuoteSymbol()

    /**
     * A builder for [CsvFormatDescriptorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param charset The character set in which the source CSV file is written.
       */
      public fun charset(charset: String)

      /**
       * @param containsHeader Whether or not the source CSV file contains a header.
       */
      public fun containsHeader(containsHeader: Boolean)

      /**
       * @param containsHeader Whether or not the source CSV file contains a header.
       */
      public fun containsHeader(containsHeader: IResolvable)

      /**
       * @param delimiter The character used to delimit the source CSV file.
       */
      public fun delimiter(delimiter: String)

      /**
       * @param fileCompression The level of compression of the source CSV file.
       */
      public fun fileCompression(fileCompression: String)

      /**
       * @param headerList A list of the source CSV file's headers, if any.
       */
      public fun headerList(headerList: List<String>)

      /**
       * @param headerList A list of the source CSV file's headers, if any.
       */
      public fun headerList(vararg headerList: String)

      /**
       * @param quoteSymbol The character used as a quote character.
       */
      public fun quoteSymbol(quoteSymbol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty.builder()

      /**
       * @param charset The character set in which the source CSV file is written.
       */
      override fun charset(charset: String) {
        cdkBuilder.charset(charset)
      }

      /**
       * @param containsHeader Whether or not the source CSV file contains a header.
       */
      override fun containsHeader(containsHeader: Boolean) {
        cdkBuilder.containsHeader(containsHeader)
      }

      /**
       * @param containsHeader Whether or not the source CSV file contains a header.
       */
      override fun containsHeader(containsHeader: IResolvable) {
        cdkBuilder.containsHeader(containsHeader.let(IResolvable::unwrap))
      }

      /**
       * @param delimiter The character used to delimit the source CSV file.
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      /**
       * @param fileCompression The level of compression of the source CSV file.
       */
      override fun fileCompression(fileCompression: String) {
        cdkBuilder.fileCompression(fileCompression)
      }

      /**
       * @param headerList A list of the source CSV file's headers, if any.
       */
      override fun headerList(headerList: List<String>) {
        cdkBuilder.headerList(headerList)
      }

      /**
       * @param headerList A list of the source CSV file's headers, if any.
       */
      override fun headerList(vararg headerList: String): Unit = headerList(headerList.toList())

      /**
       * @param quoteSymbol The character used as a quote character.
       */
      override fun quoteSymbol(quoteSymbol: String) {
        cdkBuilder.quoteSymbol(quoteSymbol)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty,
    ) : CdkObject(cdkObject), CsvFormatDescriptorProperty {
      /**
       * The character set in which the source CSV file is written.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-charset)
       */
      override fun charset(): String? = unwrap(this).getCharset()

      /**
       * Whether or not the source CSV file contains a header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-containsheader)
       */
      override fun containsHeader(): Any? = unwrap(this).getContainsHeader()

      /**
       * The character used to delimit the source CSV file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-delimiter)
       */
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      /**
       * The level of compression of the source CSV file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-filecompression)
       */
      override fun fileCompression(): String? = unwrap(this).getFileCompression()

      /**
       * A list of the source CSV file's headers, if any.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-headerlist)
       */
      override fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()

      /**
       * The character used as a quote character.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-csvformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-csvformatdescriptor-quotesymbol)
       */
      override fun quoteSymbol(): String? = unwrap(this).getQuoteSymbol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvFormatDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty):
          CsvFormatDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvFormatDescriptorProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty
    }
  }

  /**
   * Details about an Amazon AppFlow flow datasource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * AppFlowConfigProperty appFlowConfigProperty = AppFlowConfigProperty.builder()
   * .flowName("flowName")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-appflowconfig.html)
   */
  public interface AppFlowConfigProperty {
    /**
     * name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-appflowconfig.html#cfn-lookoutmetrics-anomalydetector-appflowconfig-flowname)
     */
    public fun flowName(): String

    /**
     * An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-appflowconfig.html#cfn-lookoutmetrics-anomalydetector-appflowconfig-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [AppFlowConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param flowName name of the flow. 
       */
      public fun flowName(flowName: String)

      /**
       * @param roleArn An IAM role that gives Amazon Lookout for Metrics permission to access the
       * flow. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty.builder()

      /**
       * @param flowName name of the flow. 
       */
      override fun flowName(flowName: String) {
        cdkBuilder.flowName(flowName)
      }

      /**
       * @param roleArn An IAM role that gives Amazon Lookout for Metrics permission to access the
       * flow. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty,
    ) : CdkObject(cdkObject), AppFlowConfigProperty {
      /**
       * name of the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-appflowconfig.html#cfn-lookoutmetrics-anomalydetector-appflowconfig-flowname)
       */
      override fun flowName(): String = unwrap(this).getFlowName()

      /**
       * An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-appflowconfig.html#cfn-lookoutmetrics-anomalydetector-appflowconfig-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AppFlowConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty):
          AppFlowConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppFlowConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty
    }
  }

  /**
   * Contains information about how the source data should be interpreted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * MetricSourceProperty metricSourceProperty = MetricSourceProperty.builder()
   * .appFlowConfig(AppFlowConfigProperty.builder()
   * .flowName("flowName")
   * .roleArn("roleArn")
   * .build())
   * .cloudwatchConfig(CloudwatchConfigProperty.builder()
   * .roleArn("roleArn")
   * .build())
   * .rdsSourceConfig(RDSSourceConfigProperty.builder()
   * .databaseHost("databaseHost")
   * .databaseName("databaseName")
   * .databasePort(123)
   * .dbInstanceIdentifier("dbInstanceIdentifier")
   * .roleArn("roleArn")
   * .secretManagerArn("secretManagerArn")
   * .tableName("tableName")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetIdList(List.of("subnetIdList"))
   * .build())
   * .build())
   * .redshiftSourceConfig(RedshiftSourceConfigProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .databaseHost("databaseHost")
   * .databaseName("databaseName")
   * .databasePort(123)
   * .roleArn("roleArn")
   * .secretManagerArn("secretManagerArn")
   * .tableName("tableName")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetIdList(List.of("subnetIdList"))
   * .build())
   * .build())
   * .s3SourceConfig(S3SourceConfigProperty.builder()
   * .fileFormatDescriptor(FileFormatDescriptorProperty.builder()
   * .csvFormatDescriptor(CsvFormatDescriptorProperty.builder()
   * .charset("charset")
   * .containsHeader(false)
   * .delimiter("delimiter")
   * .fileCompression("fileCompression")
   * .headerList(List.of("headerList"))
   * .quoteSymbol("quoteSymbol")
   * .build())
   * .jsonFormatDescriptor(JsonFormatDescriptorProperty.builder()
   * .charset("charset")
   * .fileCompression("fileCompression")
   * .build())
   * .build())
   * .roleArn("roleArn")
   * // the properties below are optional
   * .historicalDataPathList(List.of("historicalDataPathList"))
   * .templatedPathList(List.of("templatedPathList"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html)
   */
  public interface MetricSourceProperty {
    /**
     * Details about an AppFlow datasource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-appflowconfig)
     */
    public fun appFlowConfig(): Any? = unwrap(this).getAppFlowConfig()

    /**
     * Details about an Amazon CloudWatch monitoring datasource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-cloudwatchconfig)
     */
    public fun cloudwatchConfig(): Any? = unwrap(this).getCloudwatchConfig()

    /**
     * Details about an Amazon Relational Database Service (RDS) datasource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-rdssourceconfig)
     */
    public fun rdsSourceConfig(): Any? = unwrap(this).getRdsSourceConfig()

    /**
     * Details about an Amazon Redshift database datasource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-redshiftsourceconfig)
     */
    public fun redshiftSourceConfig(): Any? = unwrap(this).getRedshiftSourceConfig()

    /**
     * Contains information about the configuration of the S3 bucket that contains source files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-s3sourceconfig)
     */
    public fun s3SourceConfig(): Any? = unwrap(this).getS3SourceConfig()

    /**
     * A builder for [MetricSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appFlowConfig Details about an AppFlow datasource.
       */
      public fun appFlowConfig(appFlowConfig: IResolvable)

      /**
       * @param appFlowConfig Details about an AppFlow datasource.
       */
      public fun appFlowConfig(appFlowConfig: AppFlowConfigProperty)

      /**
       * @param appFlowConfig Details about an AppFlow datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea8d21be0c2ad107af1f41887dd7e8345d2a5dda7178b97d3abdd5bf9ccc18d1")
      public fun appFlowConfig(appFlowConfig: AppFlowConfigProperty.Builder.() -> Unit)

      /**
       * @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource.
       */
      public fun cloudwatchConfig(cloudwatchConfig: IResolvable)

      /**
       * @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource.
       */
      public fun cloudwatchConfig(cloudwatchConfig: CloudwatchConfigProperty)

      /**
       * @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba449479948db1f3e0406a8c80d061834a90bd959d06da7abb335cddc774620")
      public fun cloudwatchConfig(cloudwatchConfig: CloudwatchConfigProperty.Builder.() -> Unit)

      /**
       * @param rdsSourceConfig Details about an Amazon Relational Database Service (RDS)
       * datasource.
       */
      public fun rdsSourceConfig(rdsSourceConfig: IResolvable)

      /**
       * @param rdsSourceConfig Details about an Amazon Relational Database Service (RDS)
       * datasource.
       */
      public fun rdsSourceConfig(rdsSourceConfig: RDSSourceConfigProperty)

      /**
       * @param rdsSourceConfig Details about an Amazon Relational Database Service (RDS)
       * datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03b7b30fa25db9c078c76f04634ca1138d812b994d9f4d4a7790044122dd91ab")
      public fun rdsSourceConfig(rdsSourceConfig: RDSSourceConfigProperty.Builder.() -> Unit)

      /**
       * @param redshiftSourceConfig Details about an Amazon Redshift database datasource.
       */
      public fun redshiftSourceConfig(redshiftSourceConfig: IResolvable)

      /**
       * @param redshiftSourceConfig Details about an Amazon Redshift database datasource.
       */
      public fun redshiftSourceConfig(redshiftSourceConfig: RedshiftSourceConfigProperty)

      /**
       * @param redshiftSourceConfig Details about an Amazon Redshift database datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("379a1d562b38a714df9d39f2593f3aad945eaf47b297797cef8ef0c9553ca0b1")
      public
          fun redshiftSourceConfig(redshiftSourceConfig: RedshiftSourceConfigProperty.Builder.() -> Unit)

      /**
       * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
       * contains source files.
       */
      public fun s3SourceConfig(s3SourceConfig: IResolvable)

      /**
       * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
       * contains source files.
       */
      public fun s3SourceConfig(s3SourceConfig: S3SourceConfigProperty)

      /**
       * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
       * contains source files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0b33241d20356d8787deaf8c1da473cafac9c091a911b11f26d5e47441bdc4")
      public fun s3SourceConfig(s3SourceConfig: S3SourceConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty.builder()

      /**
       * @param appFlowConfig Details about an AppFlow datasource.
       */
      override fun appFlowConfig(appFlowConfig: IResolvable) {
        cdkBuilder.appFlowConfig(appFlowConfig.let(IResolvable::unwrap))
      }

      /**
       * @param appFlowConfig Details about an AppFlow datasource.
       */
      override fun appFlowConfig(appFlowConfig: AppFlowConfigProperty) {
        cdkBuilder.appFlowConfig(appFlowConfig.let(AppFlowConfigProperty::unwrap))
      }

      /**
       * @param appFlowConfig Details about an AppFlow datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea8d21be0c2ad107af1f41887dd7e8345d2a5dda7178b97d3abdd5bf9ccc18d1")
      override fun appFlowConfig(appFlowConfig: AppFlowConfigProperty.Builder.() -> Unit): Unit =
          appFlowConfig(AppFlowConfigProperty(appFlowConfig))

      /**
       * @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource.
       */
      override fun cloudwatchConfig(cloudwatchConfig: IResolvable) {
        cdkBuilder.cloudwatchConfig(cloudwatchConfig.let(IResolvable::unwrap))
      }

      /**
       * @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource.
       */
      override fun cloudwatchConfig(cloudwatchConfig: CloudwatchConfigProperty) {
        cdkBuilder.cloudwatchConfig(cloudwatchConfig.let(CloudwatchConfigProperty::unwrap))
      }

      /**
       * @param cloudwatchConfig Details about an Amazon CloudWatch monitoring datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ba449479948db1f3e0406a8c80d061834a90bd959d06da7abb335cddc774620")
      override fun cloudwatchConfig(cloudwatchConfig: CloudwatchConfigProperty.Builder.() -> Unit):
          Unit = cloudwatchConfig(CloudwatchConfigProperty(cloudwatchConfig))

      /**
       * @param rdsSourceConfig Details about an Amazon Relational Database Service (RDS)
       * datasource.
       */
      override fun rdsSourceConfig(rdsSourceConfig: IResolvable) {
        cdkBuilder.rdsSourceConfig(rdsSourceConfig.let(IResolvable::unwrap))
      }

      /**
       * @param rdsSourceConfig Details about an Amazon Relational Database Service (RDS)
       * datasource.
       */
      override fun rdsSourceConfig(rdsSourceConfig: RDSSourceConfigProperty) {
        cdkBuilder.rdsSourceConfig(rdsSourceConfig.let(RDSSourceConfigProperty::unwrap))
      }

      /**
       * @param rdsSourceConfig Details about an Amazon Relational Database Service (RDS)
       * datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03b7b30fa25db9c078c76f04634ca1138d812b994d9f4d4a7790044122dd91ab")
      override fun rdsSourceConfig(rdsSourceConfig: RDSSourceConfigProperty.Builder.() -> Unit):
          Unit = rdsSourceConfig(RDSSourceConfigProperty(rdsSourceConfig))

      /**
       * @param redshiftSourceConfig Details about an Amazon Redshift database datasource.
       */
      override fun redshiftSourceConfig(redshiftSourceConfig: IResolvable) {
        cdkBuilder.redshiftSourceConfig(redshiftSourceConfig.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftSourceConfig Details about an Amazon Redshift database datasource.
       */
      override fun redshiftSourceConfig(redshiftSourceConfig: RedshiftSourceConfigProperty) {
        cdkBuilder.redshiftSourceConfig(redshiftSourceConfig.let(RedshiftSourceConfigProperty::unwrap))
      }

      /**
       * @param redshiftSourceConfig Details about an Amazon Redshift database datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("379a1d562b38a714df9d39f2593f3aad945eaf47b297797cef8ef0c9553ca0b1")
      override
          fun redshiftSourceConfig(redshiftSourceConfig: RedshiftSourceConfigProperty.Builder.() -> Unit):
          Unit = redshiftSourceConfig(RedshiftSourceConfigProperty(redshiftSourceConfig))

      /**
       * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
       * contains source files.
       */
      override fun s3SourceConfig(s3SourceConfig: IResolvable) {
        cdkBuilder.s3SourceConfig(s3SourceConfig.let(IResolvable::unwrap))
      }

      /**
       * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
       * contains source files.
       */
      override fun s3SourceConfig(s3SourceConfig: S3SourceConfigProperty) {
        cdkBuilder.s3SourceConfig(s3SourceConfig.let(S3SourceConfigProperty::unwrap))
      }

      /**
       * @param s3SourceConfig Contains information about the configuration of the S3 bucket that
       * contains source files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa0b33241d20356d8787deaf8c1da473cafac9c091a911b11f26d5e47441bdc4")
      override fun s3SourceConfig(s3SourceConfig: S3SourceConfigProperty.Builder.() -> Unit): Unit =
          s3SourceConfig(S3SourceConfigProperty(s3SourceConfig))

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty,
    ) : CdkObject(cdkObject), MetricSourceProperty {
      /**
       * Details about an AppFlow datasource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-appflowconfig)
       */
      override fun appFlowConfig(): Any? = unwrap(this).getAppFlowConfig()

      /**
       * Details about an Amazon CloudWatch monitoring datasource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-cloudwatchconfig)
       */
      override fun cloudwatchConfig(): Any? = unwrap(this).getCloudwatchConfig()

      /**
       * Details about an Amazon Relational Database Service (RDS) datasource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-rdssourceconfig)
       */
      override fun rdsSourceConfig(): Any? = unwrap(this).getRdsSourceConfig()

      /**
       * Details about an Amazon Redshift database datasource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-redshiftsourceconfig)
       */
      override fun redshiftSourceConfig(): Any? = unwrap(this).getRedshiftSourceConfig()

      /**
       * Contains information about the configuration of the S3 bucket that contains source files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricsource.html#cfn-lookoutmetrics-anomalydetector-metricsource-s3sourceconfig)
       */
      override fun s3SourceConfig(): Any? = unwrap(this).getS3SourceConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty):
          MetricSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricSourceProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty
    }
  }

  /**
   * Contains information about a source file's formatting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * FileFormatDescriptorProperty fileFormatDescriptorProperty =
   * FileFormatDescriptorProperty.builder()
   * .csvFormatDescriptor(CsvFormatDescriptorProperty.builder()
   * .charset("charset")
   * .containsHeader(false)
   * .delimiter("delimiter")
   * .fileCompression("fileCompression")
   * .headerList(List.of("headerList"))
   * .quoteSymbol("quoteSymbol")
   * .build())
   * .jsonFormatDescriptor(JsonFormatDescriptorProperty.builder()
   * .charset("charset")
   * .fileCompression("fileCompression")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-fileformatdescriptor.html)
   */
  public interface FileFormatDescriptorProperty {
    /**
     * Contains information about how a source CSV data file should be analyzed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-fileformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-fileformatdescriptor-csvformatdescriptor)
     */
    public fun csvFormatDescriptor(): Any? = unwrap(this).getCsvFormatDescriptor()

    /**
     * Contains information about how a source JSON data file should be analyzed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-fileformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-fileformatdescriptor-jsonformatdescriptor)
     */
    public fun jsonFormatDescriptor(): Any? = unwrap(this).getJsonFormatDescriptor()

    /**
     * A builder for [FileFormatDescriptorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csvFormatDescriptor Contains information about how a source CSV data file should be
       * analyzed.
       */
      public fun csvFormatDescriptor(csvFormatDescriptor: IResolvable)

      /**
       * @param csvFormatDescriptor Contains information about how a source CSV data file should be
       * analyzed.
       */
      public fun csvFormatDescriptor(csvFormatDescriptor: CsvFormatDescriptorProperty)

      /**
       * @param csvFormatDescriptor Contains information about how a source CSV data file should be
       * analyzed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30d6418ff59aaf89b781b0c583a0eb6b9303fa8ef376df16e9f445c4c4aef2c0")
      public
          fun csvFormatDescriptor(csvFormatDescriptor: CsvFormatDescriptorProperty.Builder.() -> Unit)

      /**
       * @param jsonFormatDescriptor Contains information about how a source JSON data file should
       * be analyzed.
       */
      public fun jsonFormatDescriptor(jsonFormatDescriptor: IResolvable)

      /**
       * @param jsonFormatDescriptor Contains information about how a source JSON data file should
       * be analyzed.
       */
      public fun jsonFormatDescriptor(jsonFormatDescriptor: JsonFormatDescriptorProperty)

      /**
       * @param jsonFormatDescriptor Contains information about how a source JSON data file should
       * be analyzed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c86ece7f584b864cf6c69e6c3bc75a7a3a79938f6d5e16faf4d4b0b8c3432593")
      public
          fun jsonFormatDescriptor(jsonFormatDescriptor: JsonFormatDescriptorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty.builder()

      /**
       * @param csvFormatDescriptor Contains information about how a source CSV data file should be
       * analyzed.
       */
      override fun csvFormatDescriptor(csvFormatDescriptor: IResolvable) {
        cdkBuilder.csvFormatDescriptor(csvFormatDescriptor.let(IResolvable::unwrap))
      }

      /**
       * @param csvFormatDescriptor Contains information about how a source CSV data file should be
       * analyzed.
       */
      override fun csvFormatDescriptor(csvFormatDescriptor: CsvFormatDescriptorProperty) {
        cdkBuilder.csvFormatDescriptor(csvFormatDescriptor.let(CsvFormatDescriptorProperty::unwrap))
      }

      /**
       * @param csvFormatDescriptor Contains information about how a source CSV data file should be
       * analyzed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30d6418ff59aaf89b781b0c583a0eb6b9303fa8ef376df16e9f445c4c4aef2c0")
      override
          fun csvFormatDescriptor(csvFormatDescriptor: CsvFormatDescriptorProperty.Builder.() -> Unit):
          Unit = csvFormatDescriptor(CsvFormatDescriptorProperty(csvFormatDescriptor))

      /**
       * @param jsonFormatDescriptor Contains information about how a source JSON data file should
       * be analyzed.
       */
      override fun jsonFormatDescriptor(jsonFormatDescriptor: IResolvable) {
        cdkBuilder.jsonFormatDescriptor(jsonFormatDescriptor.let(IResolvable::unwrap))
      }

      /**
       * @param jsonFormatDescriptor Contains information about how a source JSON data file should
       * be analyzed.
       */
      override fun jsonFormatDescriptor(jsonFormatDescriptor: JsonFormatDescriptorProperty) {
        cdkBuilder.jsonFormatDescriptor(jsonFormatDescriptor.let(JsonFormatDescriptorProperty::unwrap))
      }

      /**
       * @param jsonFormatDescriptor Contains information about how a source JSON data file should
       * be analyzed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c86ece7f584b864cf6c69e6c3bc75a7a3a79938f6d5e16faf4d4b0b8c3432593")
      override
          fun jsonFormatDescriptor(jsonFormatDescriptor: JsonFormatDescriptorProperty.Builder.() -> Unit):
          Unit = jsonFormatDescriptor(JsonFormatDescriptorProperty(jsonFormatDescriptor))

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty,
    ) : CdkObject(cdkObject), FileFormatDescriptorProperty {
      /**
       * Contains information about how a source CSV data file should be analyzed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-fileformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-fileformatdescriptor-csvformatdescriptor)
       */
      override fun csvFormatDescriptor(): Any? = unwrap(this).getCsvFormatDescriptor()

      /**
       * Contains information about how a source JSON data file should be analyzed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-fileformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-fileformatdescriptor-jsonformatdescriptor)
       */
      override fun jsonFormatDescriptor(): Any? = unwrap(this).getJsonFormatDescriptor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileFormatDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty):
          FileFormatDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileFormatDescriptorProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty
    }
  }

  /**
   * Contains information about the configuration of the S3 bucket that contains source files.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * S3SourceConfigProperty s3SourceConfigProperty = S3SourceConfigProperty.builder()
   * .fileFormatDescriptor(FileFormatDescriptorProperty.builder()
   * .csvFormatDescriptor(CsvFormatDescriptorProperty.builder()
   * .charset("charset")
   * .containsHeader(false)
   * .delimiter("delimiter")
   * .fileCompression("fileCompression")
   * .headerList(List.of("headerList"))
   * .quoteSymbol("quoteSymbol")
   * .build())
   * .jsonFormatDescriptor(JsonFormatDescriptorProperty.builder()
   * .charset("charset")
   * .fileCompression("fileCompression")
   * .build())
   * .build())
   * .roleArn("roleArn")
   * // the properties below are optional
   * .historicalDataPathList(List.of("historicalDataPathList"))
   * .templatedPathList(List.of("templatedPathList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html)
   */
  public interface S3SourceConfigProperty {
    /**
     * Contains information about a source file's formatting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html#cfn-lookoutmetrics-anomalydetector-s3sourceconfig-fileformatdescriptor)
     */
    public fun fileFormatDescriptor(): Any

    /**
     * A list of paths to the historical data files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html#cfn-lookoutmetrics-anomalydetector-s3sourceconfig-historicaldatapathlist)
     */
    public fun historicalDataPathList(): List<String> = unwrap(this).getHistoricalDataPathList() ?:
        emptyList()

    /**
     * The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html#cfn-lookoutmetrics-anomalydetector-s3sourceconfig-rolearn)
     */
    public fun roleArn(): String

    /**
     * A list of templated paths to the source files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html#cfn-lookoutmetrics-anomalydetector-s3sourceconfig-templatedpathlist)
     */
    public fun templatedPathList(): List<String> = unwrap(this).getTemplatedPathList() ?:
        emptyList()

    /**
     * A builder for [S3SourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileFormatDescriptor Contains information about a source file's formatting. 
       */
      public fun fileFormatDescriptor(fileFormatDescriptor: IResolvable)

      /**
       * @param fileFormatDescriptor Contains information about a source file's formatting. 
       */
      public fun fileFormatDescriptor(fileFormatDescriptor: FileFormatDescriptorProperty)

      /**
       * @param fileFormatDescriptor Contains information about a source file's formatting. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ccd65d2ef4bea3cf3665b6f21068e34ba6e5a644796dd8008eb039ae6c39257")
      public
          fun fileFormatDescriptor(fileFormatDescriptor: FileFormatDescriptorProperty.Builder.() -> Unit)

      /**
       * @param historicalDataPathList A list of paths to the historical data files.
       */
      public fun historicalDataPathList(historicalDataPathList: List<String>)

      /**
       * @param historicalDataPathList A list of paths to the historical data files.
       */
      public fun historicalDataPathList(vararg historicalDataPathList: String)

      /**
       * @param roleArn The ARN of an IAM role that has read and write access permissions to the
       * source S3 bucket. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param templatedPathList A list of templated paths to the source files.
       */
      public fun templatedPathList(templatedPathList: List<String>)

      /**
       * @param templatedPathList A list of templated paths to the source files.
       */
      public fun templatedPathList(vararg templatedPathList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty.builder()

      /**
       * @param fileFormatDescriptor Contains information about a source file's formatting. 
       */
      override fun fileFormatDescriptor(fileFormatDescriptor: IResolvable) {
        cdkBuilder.fileFormatDescriptor(fileFormatDescriptor.let(IResolvable::unwrap))
      }

      /**
       * @param fileFormatDescriptor Contains information about a source file's formatting. 
       */
      override fun fileFormatDescriptor(fileFormatDescriptor: FileFormatDescriptorProperty) {
        cdkBuilder.fileFormatDescriptor(fileFormatDescriptor.let(FileFormatDescriptorProperty::unwrap))
      }

      /**
       * @param fileFormatDescriptor Contains information about a source file's formatting. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ccd65d2ef4bea3cf3665b6f21068e34ba6e5a644796dd8008eb039ae6c39257")
      override
          fun fileFormatDescriptor(fileFormatDescriptor: FileFormatDescriptorProperty.Builder.() -> Unit):
          Unit = fileFormatDescriptor(FileFormatDescriptorProperty(fileFormatDescriptor))

      /**
       * @param historicalDataPathList A list of paths to the historical data files.
       */
      override fun historicalDataPathList(historicalDataPathList: List<String>) {
        cdkBuilder.historicalDataPathList(historicalDataPathList)
      }

      /**
       * @param historicalDataPathList A list of paths to the historical data files.
       */
      override fun historicalDataPathList(vararg historicalDataPathList: String): Unit =
          historicalDataPathList(historicalDataPathList.toList())

      /**
       * @param roleArn The ARN of an IAM role that has read and write access permissions to the
       * source S3 bucket. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param templatedPathList A list of templated paths to the source files.
       */
      override fun templatedPathList(templatedPathList: List<String>) {
        cdkBuilder.templatedPathList(templatedPathList)
      }

      /**
       * @param templatedPathList A list of templated paths to the source files.
       */
      override fun templatedPathList(vararg templatedPathList: String): Unit =
          templatedPathList(templatedPathList.toList())

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty,
    ) : CdkObject(cdkObject), S3SourceConfigProperty {
      /**
       * Contains information about a source file's formatting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html#cfn-lookoutmetrics-anomalydetector-s3sourceconfig-fileformatdescriptor)
       */
      override fun fileFormatDescriptor(): Any = unwrap(this).getFileFormatDescriptor()

      /**
       * A list of paths to the historical data files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html#cfn-lookoutmetrics-anomalydetector-s3sourceconfig-historicaldatapathlist)
       */
      override fun historicalDataPathList(): List<String> = unwrap(this).getHistoricalDataPathList()
          ?: emptyList()

      /**
       * The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html#cfn-lookoutmetrics-anomalydetector-s3sourceconfig-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * A list of templated paths to the source files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html#cfn-lookoutmetrics-anomalydetector-s3sourceconfig-templatedpathlist)
       */
      override fun templatedPathList(): List<String> = unwrap(this).getTemplatedPathList() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty):
          S3SourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3SourceConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty
    }
  }

  /**
   * Contains information about the Amazon Relational Database Service (RDS) configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * RDSSourceConfigProperty rDSSourceConfigProperty = RDSSourceConfigProperty.builder()
   * .databaseHost("databaseHost")
   * .databaseName("databaseName")
   * .databasePort(123)
   * .dbInstanceIdentifier("dbInstanceIdentifier")
   * .roleArn("roleArn")
   * .secretManagerArn("secretManagerArn")
   * .tableName("tableName")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetIdList(List.of("subnetIdList"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html)
   */
  public interface RDSSourceConfigProperty {
    /**
     * The host name of the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-databasehost)
     */
    public fun databaseHost(): String

    /**
     * The name of the RDS database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-databasename)
     */
    public fun databaseName(): String

    /**
     * The port number where the database can be accessed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-databaseport)
     */
    public fun databasePort(): Number

    /**
     * A string identifying the database instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-dbinstanceidentifier)
     */
    public fun dbInstanceIdentifier(): String

    /**
     * The Amazon Resource Name (ARN) of the role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-rolearn)
     */
    public fun roleArn(): String

    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-secretmanagerarn)
     */
    public fun secretManagerArn(): String

    /**
     * The name of the table in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-tablename)
     */
    public fun tableName(): String

    /**
     * An object containing information about the Amazon Virtual Private Cloud (VPC) configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any

    /**
     * A builder for [RDSSourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseHost The host name of the database. 
       */
      public fun databaseHost(databaseHost: String)

      /**
       * @param databaseName The name of the RDS database. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param databasePort The port number where the database can be accessed. 
       */
      public fun databasePort(databasePort: Number)

      /**
       * @param dbInstanceIdentifier A string identifying the database instance. 
       */
      public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param secretManagerArn The Amazon Resource Name (ARN) of the AWS Secrets Manager role. 
       */
      public fun secretManagerArn(secretManagerArn: String)

      /**
       * @param tableName The name of the table in the database. 
       */
      public fun tableName(tableName: String)

      /**
       * @param vpcConfiguration An object containing information about the Amazon Virtual Private
       * Cloud (VPC) configuration. 
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration An object containing information about the Amazon Virtual Private
       * Cloud (VPC) configuration. 
       */
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      /**
       * @param vpcConfiguration An object containing information about the Amazon Virtual Private
       * Cloud (VPC) configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc30b7b55065b625817ede33b84528c2c54d50cf3659231e470da1c9c74ae061")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty.builder()

      /**
       * @param databaseHost The host name of the database. 
       */
      override fun databaseHost(databaseHost: String) {
        cdkBuilder.databaseHost(databaseHost)
      }

      /**
       * @param databaseName The name of the RDS database. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param databasePort The port number where the database can be accessed. 
       */
      override fun databasePort(databasePort: Number) {
        cdkBuilder.databasePort(databasePort)
      }

      /**
       * @param dbInstanceIdentifier A string identifying the database instance. 
       */
      override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
        cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param secretManagerArn The Amazon Resource Name (ARN) of the AWS Secrets Manager role. 
       */
      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      /**
       * @param tableName The name of the table in the database. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      /**
       * @param vpcConfiguration An object containing information about the Amazon Virtual Private
       * Cloud (VPC) configuration. 
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration An object containing information about the Amazon Virtual Private
       * Cloud (VPC) configuration. 
       */
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      /**
       * @param vpcConfiguration An object containing information about the Amazon Virtual Private
       * Cloud (VPC) configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc30b7b55065b625817ede33b84528c2c54d50cf3659231e470da1c9c74ae061")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty,
    ) : CdkObject(cdkObject), RDSSourceConfigProperty {
      /**
       * The host name of the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-databasehost)
       */
      override fun databaseHost(): String = unwrap(this).getDatabaseHost()

      /**
       * The name of the RDS database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The port number where the database can be accessed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-databaseport)
       */
      override fun databasePort(): Number = unwrap(this).getDatabasePort()

      /**
       * A string identifying the database instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-dbinstanceidentifier)
       */
      override fun dbInstanceIdentifier(): String = unwrap(this).getDbInstanceIdentifier()

      /**
       * The Amazon Resource Name (ARN) of the role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-secretmanagerarn)
       */
      override fun secretManagerArn(): String = unwrap(this).getSecretManagerArn()

      /**
       * The name of the table in the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()

      /**
       * An object containing information about the Amazon Virtual Private Cloud (VPC)
       * configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-rdssourceconfig.html#cfn-lookoutmetrics-anomalydetector-rdssourceconfig-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RDSSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty):
          RDSSourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RDSSourceConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty
    }
  }

  /**
   * Provides information about the Amazon Redshift database configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * RedshiftSourceConfigProperty redshiftSourceConfigProperty =
   * RedshiftSourceConfigProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .databaseHost("databaseHost")
   * .databaseName("databaseName")
   * .databasePort(123)
   * .roleArn("roleArn")
   * .secretManagerArn("secretManagerArn")
   * .tableName("tableName")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetIdList(List.of("subnetIdList"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html)
   */
  public interface RedshiftSourceConfigProperty {
    /**
     * A string identifying the Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-clusteridentifier)
     */
    public fun clusterIdentifier(): String

    /**
     * The name of the database host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-databasehost)
     */
    public fun databaseHost(): String

    /**
     * The Redshift database name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-databasename)
     */
    public fun databaseName(): String

    /**
     * The port number where the database can be accessed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-databaseport)
     */
    public fun databasePort(): Number

    /**
     * The Amazon Resource Name (ARN) of the role providing access to the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-rolearn)
     */
    public fun roleArn(): String

    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-secretmanagerarn)
     */
    public fun secretManagerArn(): String

    /**
     * The table name of the Redshift database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-tablename)
     */
    public fun tableName(): String

    /**
     * Contains information about the Amazon Virtual Private Cloud (VPC) configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-vpcconfiguration)
     */
    public fun vpcConfiguration(): Any

    /**
     * A builder for [RedshiftSourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterIdentifier A string identifying the Redshift cluster. 
       */
      public fun clusterIdentifier(clusterIdentifier: String)

      /**
       * @param databaseHost The name of the database host. 
       */
      public fun databaseHost(databaseHost: String)

      /**
       * @param databaseName The Redshift database name. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param databasePort The port number where the database can be accessed. 
       */
      public fun databasePort(databasePort: Number)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role providing access to the database.
       * 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param secretManagerArn The Amazon Resource Name (ARN) of the AWS Secrets Manager role. 
       */
      public fun secretManagerArn(secretManagerArn: String)

      /**
       * @param tableName The table name of the Redshift database. 
       */
      public fun tableName(tableName: String)

      /**
       * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
       * configuration. 
       */
      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      /**
       * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
       * configuration. 
       */
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty)

      /**
       * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
       * configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b8e19f2c89d9df5d9f6c2afeee75106625f4daa9ebfb1bcf2c6bfe473e39d4b")
      public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty.builder()

      /**
       * @param clusterIdentifier A string identifying the Redshift cluster. 
       */
      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      /**
       * @param databaseHost The name of the database host. 
       */
      override fun databaseHost(databaseHost: String) {
        cdkBuilder.databaseHost(databaseHost)
      }

      /**
       * @param databaseName The Redshift database name. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param databasePort The port number where the database can be accessed. 
       */
      override fun databasePort(databasePort: Number) {
        cdkBuilder.databasePort(databasePort)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role providing access to the database.
       * 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param secretManagerArn The Amazon Resource Name (ARN) of the AWS Secrets Manager role. 
       */
      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      /**
       * @param tableName The table name of the Redshift database. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      /**
       * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
       * configuration. 
       */
      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
       * configuration. 
       */
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
      }

      /**
       * @param vpcConfiguration Contains information about the Amazon Virtual Private Cloud (VPC)
       * configuration. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b8e19f2c89d9df5d9f6c2afeee75106625f4daa9ebfb1bcf2c6bfe473e39d4b")
      override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty,
    ) : CdkObject(cdkObject), RedshiftSourceConfigProperty {
      /**
       * A string identifying the Redshift cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-clusteridentifier)
       */
      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

      /**
       * The name of the database host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-databasehost)
       */
      override fun databaseHost(): String = unwrap(this).getDatabaseHost()

      /**
       * The Redshift database name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The port number where the database can be accessed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-databaseport)
       */
      override fun databasePort(): Number = unwrap(this).getDatabasePort()

      /**
       * The Amazon Resource Name (ARN) of the role providing access to the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The Amazon Resource Name (ARN) of the AWS Secrets Manager role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-secretmanagerarn)
       */
      override fun secretManagerArn(): String = unwrap(this).getSecretManagerArn()

      /**
       * The table name of the Redshift database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()

      /**
       * Contains information about the Amazon Virtual Private Cloud (VPC) configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-redshiftsourceconfig.html#cfn-lookoutmetrics-anomalydetector-redshiftsourceconfig-vpcconfiguration)
       */
      override fun vpcConfiguration(): Any = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty):
          RedshiftSourceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftSourceConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty
    }
  }

  /**
   * Contains information about the column used to track time in a source data file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * TimestampColumnProperty timestampColumnProperty = TimestampColumnProperty.builder()
   * .columnFormat("columnFormat")
   * .columnName("columnName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-timestampcolumn.html)
   */
  public interface TimestampColumnProperty {
    /**
     * The format of the timestamp column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-timestampcolumn.html#cfn-lookoutmetrics-anomalydetector-timestampcolumn-columnformat)
     */
    public fun columnFormat(): String? = unwrap(this).getColumnFormat()

    /**
     * The name of the timestamp column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-timestampcolumn.html#cfn-lookoutmetrics-anomalydetector-timestampcolumn-columnname)
     */
    public fun columnName(): String? = unwrap(this).getColumnName()

    /**
     * A builder for [TimestampColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnFormat The format of the timestamp column.
       */
      public fun columnFormat(columnFormat: String)

      /**
       * @param columnName The name of the timestamp column.
       */
      public fun columnName(columnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty.builder()

      /**
       * @param columnFormat The format of the timestamp column.
       */
      override fun columnFormat(columnFormat: String) {
        cdkBuilder.columnFormat(columnFormat)
      }

      /**
       * @param columnName The name of the timestamp column.
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty,
    ) : CdkObject(cdkObject), TimestampColumnProperty {
      /**
       * The format of the timestamp column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-timestampcolumn.html#cfn-lookoutmetrics-anomalydetector-timestampcolumn-columnformat)
       */
      override fun columnFormat(): String? = unwrap(this).getColumnFormat()

      /**
       * The name of the timestamp column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-timestampcolumn.html#cfn-lookoutmetrics-anomalydetector-timestampcolumn-columnname)
       */
      override fun columnName(): String? = unwrap(this).getColumnName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestampColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty):
          TimestampColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestampColumnProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty
    }
  }

  /**
   * Contains information about a detector's configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * AnomalyDetectorConfigProperty anomalyDetectorConfigProperty =
   * AnomalyDetectorConfigProperty.builder()
   * .anomalyDetectorFrequency("anomalyDetectorFrequency")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-anomalydetectorconfig.html)
   */
  public interface AnomalyDetectorConfigProperty {
    /**
     * The frequency at which the detector analyzes its source data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-anomalydetectorconfig.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig-anomalydetectorfrequency)
     */
    public fun anomalyDetectorFrequency(): String

    /**
     * A builder for [AnomalyDetectorConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param anomalyDetectorFrequency The frequency at which the detector analyzes its source
       * data. 
       */
      public fun anomalyDetectorFrequency(anomalyDetectorFrequency: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty.builder()

      /**
       * @param anomalyDetectorFrequency The frequency at which the detector analyzes its source
       * data. 
       */
      override fun anomalyDetectorFrequency(anomalyDetectorFrequency: String) {
        cdkBuilder.anomalyDetectorFrequency(anomalyDetectorFrequency)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty,
    ) : CdkObject(cdkObject), AnomalyDetectorConfigProperty {
      /**
       * The frequency at which the detector analyzes its source data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-anomalydetectorconfig.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig-anomalydetectorfrequency)
       */
      override fun anomalyDetectorFrequency(): String = unwrap(this).getAnomalyDetectorFrequency()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnomalyDetectorConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty):
          AnomalyDetectorConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnomalyDetectorConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty
    }
  }

  /**
   * Contains information about how a source JSON data file should be analyzed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * JsonFormatDescriptorProperty jsonFormatDescriptorProperty =
   * JsonFormatDescriptorProperty.builder()
   * .charset("charset")
   * .fileCompression("fileCompression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-jsonformatdescriptor.html)
   */
  public interface JsonFormatDescriptorProperty {
    /**
     * The character set in which the source JSON file is written.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-jsonformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-jsonformatdescriptor-charset)
     */
    public fun charset(): String? = unwrap(this).getCharset()

    /**
     * The level of compression of the source CSV file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-jsonformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-jsonformatdescriptor-filecompression)
     */
    public fun fileCompression(): String? = unwrap(this).getFileCompression()

    /**
     * A builder for [JsonFormatDescriptorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param charset The character set in which the source JSON file is written.
       */
      public fun charset(charset: String)

      /**
       * @param fileCompression The level of compression of the source CSV file.
       */
      public fun fileCompression(fileCompression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty.builder()

      /**
       * @param charset The character set in which the source JSON file is written.
       */
      override fun charset(charset: String) {
        cdkBuilder.charset(charset)
      }

      /**
       * @param fileCompression The level of compression of the source CSV file.
       */
      override fun fileCompression(fileCompression: String) {
        cdkBuilder.fileCompression(fileCompression)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty,
    ) : CdkObject(cdkObject), JsonFormatDescriptorProperty {
      /**
       * The character set in which the source JSON file is written.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-jsonformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-jsonformatdescriptor-charset)
       */
      override fun charset(): String? = unwrap(this).getCharset()

      /**
       * The level of compression of the source CSV file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-jsonformatdescriptor.html#cfn-lookoutmetrics-anomalydetector-jsonformatdescriptor-filecompression)
       */
      override fun fileCompression(): String? = unwrap(this).getFileCompression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonFormatDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty):
          JsonFormatDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonFormatDescriptorProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.JsonFormatDescriptorProperty
    }
  }

  /**
   * Details about an Amazon CloudWatch datasource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * CloudwatchConfigProperty cloudwatchConfigProperty = CloudwatchConfigProperty.builder()
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-cloudwatchconfig.html)
   */
  public interface CloudwatchConfigProperty {
    /**
     * An IAM role that gives Amazon Lookout for Metrics permission to access data in Amazon
     * CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-cloudwatchconfig.html#cfn-lookoutmetrics-anomalydetector-cloudwatchconfig-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [CloudwatchConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn An IAM role that gives Amazon Lookout for Metrics permission to access data
       * in Amazon CloudWatch. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty.builder()

      /**
       * @param roleArn An IAM role that gives Amazon Lookout for Metrics permission to access data
       * in Amazon CloudWatch. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty,
    ) : CdkObject(cdkObject), CloudwatchConfigProperty {
      /**
       * An IAM role that gives Amazon Lookout for Metrics permission to access data in Amazon
       * CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-cloudwatchconfig.html#cfn-lookoutmetrics-anomalydetector-cloudwatchconfig-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty):
          CloudwatchConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchConfigProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty
    }
  }

  /**
   * A calculation made by contrasting a measure and a dimension from your source data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * MetricProperty metricProperty = MetricProperty.builder()
   * .aggregationFunction("aggregationFunction")
   * .metricName("metricName")
   * // the properties below are optional
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html)
   */
  public interface MetricProperty {
    /**
     * The function with which the metric is calculated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html#cfn-lookoutmetrics-anomalydetector-metric-aggregationfunction)
     */
    public fun aggregationFunction(): String

    /**
     * The name of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html#cfn-lookoutmetrics-anomalydetector-metric-metricname)
     */
    public fun metricName(): String

    /**
     * The namespace for the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html#cfn-lookoutmetrics-anomalydetector-metric-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * A builder for [MetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregationFunction The function with which the metric is calculated. 
       */
      public fun aggregationFunction(aggregationFunction: String)

      /**
       * @param metricName The name of the metric. 
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace for the metric.
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty.Builder =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty.builder()

      /**
       * @param aggregationFunction The function with which the metric is calculated. 
       */
      override fun aggregationFunction(aggregationFunction: String) {
        cdkBuilder.aggregationFunction(aggregationFunction)
      }

      /**
       * @param metricName The name of the metric. 
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace for the metric.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty,
    ) : CdkObject(cdkObject), MetricProperty {
      /**
       * The function with which the metric is calculated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html#cfn-lookoutmetrics-anomalydetector-metric-aggregationfunction)
       */
      override fun aggregationFunction(): String = unwrap(this).getAggregationFunction()

      /**
       * The name of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html#cfn-lookoutmetrics-anomalydetector-metric-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * The namespace for the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html#cfn-lookoutmetrics-anomalydetector-metric-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty):
          MetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricProperty
    }
  }

  /**
   * Contains information about a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * MetricSetProperty metricSetProperty = MetricSetProperty.builder()
   * .metricList(List.of(MetricProperty.builder()
   * .aggregationFunction("aggregationFunction")
   * .metricName("metricName")
   * // the properties below are optional
   * .namespace("namespace")
   * .build()))
   * .metricSetName("metricSetName")
   * .metricSource(MetricSourceProperty.builder()
   * .appFlowConfig(AppFlowConfigProperty.builder()
   * .flowName("flowName")
   * .roleArn("roleArn")
   * .build())
   * .cloudwatchConfig(CloudwatchConfigProperty.builder()
   * .roleArn("roleArn")
   * .build())
   * .rdsSourceConfig(RDSSourceConfigProperty.builder()
   * .databaseHost("databaseHost")
   * .databaseName("databaseName")
   * .databasePort(123)
   * .dbInstanceIdentifier("dbInstanceIdentifier")
   * .roleArn("roleArn")
   * .secretManagerArn("secretManagerArn")
   * .tableName("tableName")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetIdList(List.of("subnetIdList"))
   * .build())
   * .build())
   * .redshiftSourceConfig(RedshiftSourceConfigProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .databaseHost("databaseHost")
   * .databaseName("databaseName")
   * .databasePort(123)
   * .roleArn("roleArn")
   * .secretManagerArn("secretManagerArn")
   * .tableName("tableName")
   * .vpcConfiguration(VpcConfigurationProperty.builder()
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetIdList(List.of("subnetIdList"))
   * .build())
   * .build())
   * .s3SourceConfig(S3SourceConfigProperty.builder()
   * .fileFormatDescriptor(FileFormatDescriptorProperty.builder()
   * .csvFormatDescriptor(CsvFormatDescriptorProperty.builder()
   * .charset("charset")
   * .containsHeader(false)
   * .delimiter("delimiter")
   * .fileCompression("fileCompression")
   * .headerList(List.of("headerList"))
   * .quoteSymbol("quoteSymbol")
   * .build())
   * .jsonFormatDescriptor(JsonFormatDescriptorProperty.builder()
   * .charset("charset")
   * .fileCompression("fileCompression")
   * .build())
   * .build())
   * .roleArn("roleArn")
   * // the properties below are optional
   * .historicalDataPathList(List.of("historicalDataPathList"))
   * .templatedPathList(List.of("templatedPathList"))
   * .build())
   * .build())
   * // the properties below are optional
   * .dimensionList(List.of("dimensionList"))
   * .metricSetDescription("metricSetDescription")
   * .metricSetFrequency("metricSetFrequency")
   * .offset(123)
   * .timestampColumn(TimestampColumnProperty.builder()
   * .columnFormat("columnFormat")
   * .columnName("columnName")
   * .build())
   * .timezone("timezone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html)
   */
  public interface MetricSetProperty {
    /**
     * A list of the fields you want to treat as dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-dimensionlist)
     */
    public fun dimensionList(): List<String> = unwrap(this).getDimensionList() ?: emptyList()

    /**
     * A list of metrics that the dataset will contain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metriclist)
     */
    public fun metricList(): Any

    /**
     * A description of the dataset you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metricsetdescription)
     */
    public fun metricSetDescription(): String? = unwrap(this).getMetricSetDescription()

    /**
     * The frequency with which the source data will be analyzed for anomalies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metricsetfrequency)
     */
    public fun metricSetFrequency(): String? = unwrap(this).getMetricSetFrequency()

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metricsetname)
     */
    public fun metricSetName(): String

    /**
     * Contains information about how the source data should be interpreted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metricsource)
     */
    public fun metricSource(): Any

    /**
     * After an interval ends, the amount of seconds that the detector waits before importing data.
     *
     * Offset is only supported for S3, Redshift, Athena and datasources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-offset)
     */
    public fun offset(): Number? = unwrap(this).getOffset()

    /**
     * Contains information about the column used for tracking time in your source data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-timestampcolumn)
     */
    public fun timestampColumn(): Any? = unwrap(this).getTimestampColumn()

    /**
     * The time zone in which your source data was recorded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-timezone)
     */
    public fun timezone(): String? = unwrap(this).getTimezone()

    /**
     * A builder for [MetricSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionList A list of the fields you want to treat as dimensions.
       */
      public fun dimensionList(dimensionList: List<String>)

      /**
       * @param dimensionList A list of the fields you want to treat as dimensions.
       */
      public fun dimensionList(vararg dimensionList: String)

      /**
       * @param metricList A list of metrics that the dataset will contain. 
       */
      public fun metricList(metricList: IResolvable)

      /**
       * @param metricList A list of metrics that the dataset will contain. 
       */
      public fun metricList(metricList: List<Any>)

      /**
       * @param metricList A list of metrics that the dataset will contain. 
       */
      public fun metricList(vararg metricList: Any)

      /**
       * @param metricSetDescription A description of the dataset you are creating.
       */
      public fun metricSetDescription(metricSetDescription: String)

      /**
       * @param metricSetFrequency The frequency with which the source data will be analyzed for
       * anomalies.
       */
      public fun metricSetFrequency(metricSetFrequency: String)

      /**
       * @param metricSetName The name of the dataset. 
       */
      public fun metricSetName(metricSetName: String)

      /**
       * @param metricSource Contains information about how the source data should be interpreted. 
       */
      public fun metricSource(metricSource: IResolvable)

      /**
       * @param metricSource Contains information about how the source data should be interpreted. 
       */
      public fun metricSource(metricSource: MetricSourceProperty)

      /**
       * @param metricSource Contains information about how the source data should be interpreted. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8edd65da7b26df550b3da384529252571ec6d3445a5ecedfa8342c9a5d560f00")
      public fun metricSource(metricSource: MetricSourceProperty.Builder.() -> Unit)

      /**
       * @param offset After an interval ends, the amount of seconds that the detector waits before
       * importing data.
       * Offset is only supported for S3, Redshift, Athena and datasources.
       */
      public fun offset(offset: Number)

      /**
       * @param timestampColumn Contains information about the column used for tracking time in your
       * source data.
       */
      public fun timestampColumn(timestampColumn: IResolvable)

      /**
       * @param timestampColumn Contains information about the column used for tracking time in your
       * source data.
       */
      public fun timestampColumn(timestampColumn: TimestampColumnProperty)

      /**
       * @param timestampColumn Contains information about the column used for tracking time in your
       * source data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("941baba079da8b0622ec9475d1c7eb325edeed95624265d9c0087beb9442dd16")
      public fun timestampColumn(timestampColumn: TimestampColumnProperty.Builder.() -> Unit)

      /**
       * @param timezone The time zone in which your source data was recorded.
       */
      public fun timezone(timezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty.builder()

      /**
       * @param dimensionList A list of the fields you want to treat as dimensions.
       */
      override fun dimensionList(dimensionList: List<String>) {
        cdkBuilder.dimensionList(dimensionList)
      }

      /**
       * @param dimensionList A list of the fields you want to treat as dimensions.
       */
      override fun dimensionList(vararg dimensionList: String): Unit =
          dimensionList(dimensionList.toList())

      /**
       * @param metricList A list of metrics that the dataset will contain. 
       */
      override fun metricList(metricList: IResolvable) {
        cdkBuilder.metricList(metricList.let(IResolvable::unwrap))
      }

      /**
       * @param metricList A list of metrics that the dataset will contain. 
       */
      override fun metricList(metricList: List<Any>) {
        cdkBuilder.metricList(metricList)
      }

      /**
       * @param metricList A list of metrics that the dataset will contain. 
       */
      override fun metricList(vararg metricList: Any): Unit = metricList(metricList.toList())

      /**
       * @param metricSetDescription A description of the dataset you are creating.
       */
      override fun metricSetDescription(metricSetDescription: String) {
        cdkBuilder.metricSetDescription(metricSetDescription)
      }

      /**
       * @param metricSetFrequency The frequency with which the source data will be analyzed for
       * anomalies.
       */
      override fun metricSetFrequency(metricSetFrequency: String) {
        cdkBuilder.metricSetFrequency(metricSetFrequency)
      }

      /**
       * @param metricSetName The name of the dataset. 
       */
      override fun metricSetName(metricSetName: String) {
        cdkBuilder.metricSetName(metricSetName)
      }

      /**
       * @param metricSource Contains information about how the source data should be interpreted. 
       */
      override fun metricSource(metricSource: IResolvable) {
        cdkBuilder.metricSource(metricSource.let(IResolvable::unwrap))
      }

      /**
       * @param metricSource Contains information about how the source data should be interpreted. 
       */
      override fun metricSource(metricSource: MetricSourceProperty) {
        cdkBuilder.metricSource(metricSource.let(MetricSourceProperty::unwrap))
      }

      /**
       * @param metricSource Contains information about how the source data should be interpreted. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8edd65da7b26df550b3da384529252571ec6d3445a5ecedfa8342c9a5d560f00")
      override fun metricSource(metricSource: MetricSourceProperty.Builder.() -> Unit): Unit =
          metricSource(MetricSourceProperty(metricSource))

      /**
       * @param offset After an interval ends, the amount of seconds that the detector waits before
       * importing data.
       * Offset is only supported for S3, Redshift, Athena and datasources.
       */
      override fun offset(offset: Number) {
        cdkBuilder.offset(offset)
      }

      /**
       * @param timestampColumn Contains information about the column used for tracking time in your
       * source data.
       */
      override fun timestampColumn(timestampColumn: IResolvable) {
        cdkBuilder.timestampColumn(timestampColumn.let(IResolvable::unwrap))
      }

      /**
       * @param timestampColumn Contains information about the column used for tracking time in your
       * source data.
       */
      override fun timestampColumn(timestampColumn: TimestampColumnProperty) {
        cdkBuilder.timestampColumn(timestampColumn.let(TimestampColumnProperty::unwrap))
      }

      /**
       * @param timestampColumn Contains information about the column used for tracking time in your
       * source data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("941baba079da8b0622ec9475d1c7eb325edeed95624265d9c0087beb9442dd16")
      override fun timestampColumn(timestampColumn: TimestampColumnProperty.Builder.() -> Unit):
          Unit = timestampColumn(TimestampColumnProperty(timestampColumn))

      /**
       * @param timezone The time zone in which your source data was recorded.
       */
      override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty,
    ) : CdkObject(cdkObject), MetricSetProperty {
      /**
       * A list of the fields you want to treat as dimensions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-dimensionlist)
       */
      override fun dimensionList(): List<String> = unwrap(this).getDimensionList() ?: emptyList()

      /**
       * A list of metrics that the dataset will contain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metriclist)
       */
      override fun metricList(): Any = unwrap(this).getMetricList()

      /**
       * A description of the dataset you are creating.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metricsetdescription)
       */
      override fun metricSetDescription(): String? = unwrap(this).getMetricSetDescription()

      /**
       * The frequency with which the source data will be analyzed for anomalies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metricsetfrequency)
       */
      override fun metricSetFrequency(): String? = unwrap(this).getMetricSetFrequency()

      /**
       * The name of the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metricsetname)
       */
      override fun metricSetName(): String = unwrap(this).getMetricSetName()

      /**
       * Contains information about how the source data should be interpreted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-metricsource)
       */
      override fun metricSource(): Any = unwrap(this).getMetricSource()

      /**
       * After an interval ends, the amount of seconds that the detector waits before importing
       * data.
       *
       * Offset is only supported for S3, Redshift, Athena and datasources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-offset)
       */
      override fun offset(): Number? = unwrap(this).getOffset()

      /**
       * Contains information about the column used for tracking time in your source data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-timestampcolumn)
       */
      override fun timestampColumn(): Any? = unwrap(this).getTimestampColumn()

      /**
       * The time zone in which your source data was recorded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metricset.html#cfn-lookoutmetrics-anomalydetector-metricset-timezone)
       */
      override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty):
          MetricSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricSetProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty
    }
  }

  /**
   * Contains configuration information about the Amazon Virtual Private Cloud (VPC).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
   * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetIdList(List.of("subnetIdList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-vpcconfiguration.html)
   */
  public interface VpcConfigurationProperty {
    /**
     * An array of strings containing the list of security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-vpcconfiguration.html#cfn-lookoutmetrics-anomalydetector-vpcconfiguration-securitygroupidlist)
     */
    public fun securityGroupIdList(): List<String>

    /**
     * An array of strings containing the Amazon VPC subnet IDs (e.g., `subnet-0bb1c79de3EXAMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-vpcconfiguration.html#cfn-lookoutmetrics-anomalydetector-vpcconfiguration-subnetidlist)
     */
    public fun subnetIdList(): List<String>

    /**
     * A builder for [VpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIdList An array of strings containing the list of security groups. 
       */
      public fun securityGroupIdList(securityGroupIdList: List<String>)

      /**
       * @param securityGroupIdList An array of strings containing the list of security groups. 
       */
      public fun securityGroupIdList(vararg securityGroupIdList: String)

      /**
       * @param subnetIdList An array of strings containing the Amazon VPC subnet IDs (e.g.,
       * `subnet-0bb1c79de3EXAMPLE` . 
       */
      public fun subnetIdList(subnetIdList: List<String>)

      /**
       * @param subnetIdList An array of strings containing the Amazon VPC subnet IDs (e.g.,
       * `subnet-0bb1c79de3EXAMPLE` . 
       */
      public fun subnetIdList(vararg subnetIdList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty.builder()

      /**
       * @param securityGroupIdList An array of strings containing the list of security groups. 
       */
      override fun securityGroupIdList(securityGroupIdList: List<String>) {
        cdkBuilder.securityGroupIdList(securityGroupIdList)
      }

      /**
       * @param securityGroupIdList An array of strings containing the list of security groups. 
       */
      override fun securityGroupIdList(vararg securityGroupIdList: String): Unit =
          securityGroupIdList(securityGroupIdList.toList())

      /**
       * @param subnetIdList An array of strings containing the Amazon VPC subnet IDs (e.g.,
       * `subnet-0bb1c79de3EXAMPLE` . 
       */
      override fun subnetIdList(subnetIdList: List<String>) {
        cdkBuilder.subnetIdList(subnetIdList)
      }

      /**
       * @param subnetIdList An array of strings containing the Amazon VPC subnet IDs (e.g.,
       * `subnet-0bb1c79de3EXAMPLE` . 
       */
      override fun subnetIdList(vararg subnetIdList: String): Unit =
          subnetIdList(subnetIdList.toList())

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty,
    ) : CdkObject(cdkObject), VpcConfigurationProperty {
      /**
       * An array of strings containing the list of security groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-vpcconfiguration.html#cfn-lookoutmetrics-anomalydetector-vpcconfiguration-securitygroupidlist)
       */
      override fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList()

      /**
       * An array of strings containing the Amazon VPC subnet IDs (e.g., `subnet-0bb1c79de3EXAMPLE`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-vpcconfiguration.html#cfn-lookoutmetrics-anomalydetector-vpcconfiguration-subnetidlist)
       */
      override fun subnetIdList(): List<String> = unwrap(this).getSubnetIdList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.VpcConfigurationProperty
    }
  }
}
