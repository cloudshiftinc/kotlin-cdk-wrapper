@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lookoutmetrics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAnomalyDetector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lookoutmetrics.*;
 * CfnAnomalyDetectorProps cfnAnomalyDetectorProps = CfnAnomalyDetectorProps.builder()
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
public interface CfnAnomalyDetectorProps {
  /**
   * Contains information about the configuration of the anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
   */
  public fun anomalyDetectorConfig(): Any

  /**
   * A description of the detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectordescription)
   */
  public fun anomalyDetectorDescription(): String? = unwrap(this).getAnomalyDetectorDescription()

  /**
   * The name of the detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorname)
   */
  public fun anomalyDetectorName(): String? = unwrap(this).getAnomalyDetectorName()

  /**
   * The ARN of the KMS key to use to encrypt your data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The detector's dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
   */
  public fun metricSetList(): Any

  /**
   * A builder for [CfnAnomalyDetectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable)

    /**
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    public
        fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty)

    /**
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aabe6e985ec554bb797ab61e903b9fb3011ba807e2ca7ef3ab2efe1fca07d7a3")
    public
        fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder.() -> Unit)

    /**
     * @param anomalyDetectorDescription A description of the detector.
     */
    public fun anomalyDetectorDescription(anomalyDetectorDescription: String)

    /**
     * @param anomalyDetectorName The name of the detector.
     */
    public fun anomalyDetectorName(anomalyDetectorName: String)

    /**
     * @param kmsKeyArn The ARN of the KMS key to use to encrypt your data.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param metricSetList The detector's dataset. 
     */
    public fun metricSetList(metricSetList: IResolvable)

    /**
     * @param metricSetList The detector's dataset. 
     */
    public fun metricSetList(metricSetList: List<Any>)

    /**
     * @param metricSetList The detector's dataset. 
     */
    public fun metricSetList(vararg metricSetList: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps.Builder =
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps.builder()

    /**
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    override fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
      cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig.let(IResolvable::unwrap))
    }

    /**
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    override
        fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty) {
      cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig.let(CfnAnomalyDetector.AnomalyDetectorConfigProperty::unwrap))
    }

    /**
     * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
     * detector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aabe6e985ec554bb797ab61e903b9fb3011ba807e2ca7ef3ab2efe1fca07d7a3")
    override
        fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder.() -> Unit):
        Unit =
        anomalyDetectorConfig(CfnAnomalyDetector.AnomalyDetectorConfigProperty(anomalyDetectorConfig))

    /**
     * @param anomalyDetectorDescription A description of the detector.
     */
    override fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
      cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
    }

    /**
     * @param anomalyDetectorName The name of the detector.
     */
    override fun anomalyDetectorName(anomalyDetectorName: String) {
      cdkBuilder.anomalyDetectorName(anomalyDetectorName)
    }

    /**
     * @param kmsKeyArn The ARN of the KMS key to use to encrypt your data.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param metricSetList The detector's dataset. 
     */
    override fun metricSetList(metricSetList: IResolvable) {
      cdkBuilder.metricSetList(metricSetList.let(IResolvable::unwrap))
    }

    /**
     * @param metricSetList The detector's dataset. 
     */
    override fun metricSetList(metricSetList: List<Any>) {
      cdkBuilder.metricSetList(metricSetList.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param metricSetList The detector's dataset. 
     */
    override fun metricSetList(vararg metricSetList: Any): Unit =
        metricSetList(metricSetList.toList())

    public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps,
  ) : CdkObject(cdkObject), CfnAnomalyDetectorProps {
    /**
     * Contains information about the configuration of the anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
     */
    override fun anomalyDetectorConfig(): Any = unwrap(this).getAnomalyDetectorConfig()

    /**
     * A description of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectordescription)
     */
    override fun anomalyDetectorDescription(): String? =
        unwrap(this).getAnomalyDetectorDescription()

    /**
     * The name of the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorname)
     */
    override fun anomalyDetectorName(): String? = unwrap(this).getAnomalyDetectorName()

    /**
     * The ARN of the KMS key to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The detector's dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
     */
    override fun metricSetList(): Any = unwrap(this).getMetricSetList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnomalyDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps):
        CfnAnomalyDetectorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAnomalyDetectorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyDetectorProps):
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps
  }
}
