@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps
import software.constructs.Construct

public object kinesisfirehose {
  public inline fun cfnDeliveryStream(
    scope: Construct,
    id: String,
    block: CfnDeliveryStreamDsl.() -> Unit = {},
  ): CfnDeliveryStream {
    val builder = CfnDeliveryStreamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamAmazonOpenSearchServerlessBufferingHintsProperty(block: CfnDeliveryStreamAmazonOpenSearchServerlessBufferingHintsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty {
    val builder = CfnDeliveryStreamAmazonOpenSearchServerlessBufferingHintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationProperty(block: CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty {
    val builder = CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsProperty(block: CfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty {
    val builder = CfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamAmazonopensearchserviceBufferingHintsProperty(block: CfnDeliveryStreamAmazonopensearchserviceBufferingHintsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty {
    val builder = CfnDeliveryStreamAmazonopensearchserviceBufferingHintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationProperty(block: CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty {
    val builder = CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamAmazonopensearchserviceRetryOptionsProperty(block: CfnDeliveryStreamAmazonopensearchserviceRetryOptionsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty {
    val builder = CfnDeliveryStreamAmazonopensearchserviceRetryOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamBufferingHintsProperty(block: CfnDeliveryStreamBufferingHintsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.BufferingHintsProperty {
    val builder = CfnDeliveryStreamBufferingHintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamCloudWatchLoggingOptionsProperty(block: CfnDeliveryStreamCloudWatchLoggingOptionsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.CloudWatchLoggingOptionsProperty {
    val builder = CfnDeliveryStreamCloudWatchLoggingOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamCopyCommandProperty(block: CfnDeliveryStreamCopyCommandPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.CopyCommandProperty {
    val builder = CfnDeliveryStreamCopyCommandPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamDataFormatConversionConfigurationProperty(block: CfnDeliveryStreamDataFormatConversionConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.DataFormatConversionConfigurationProperty {
    val builder = CfnDeliveryStreamDataFormatConversionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputProperty(block: CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty {
    val builder = CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamDeserializerProperty(block: CfnDeliveryStreamDeserializerPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.DeserializerProperty {
    val builder = CfnDeliveryStreamDeserializerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamDocumentIdOptionsProperty(block: CfnDeliveryStreamDocumentIdOptionsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.DocumentIdOptionsProperty {
    val builder = CfnDeliveryStreamDocumentIdOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamDynamicPartitioningConfigurationProperty(block: CfnDeliveryStreamDynamicPartitioningConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.DynamicPartitioningConfigurationProperty {
    val builder = CfnDeliveryStreamDynamicPartitioningConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamElasticsearchBufferingHintsProperty(block: CfnDeliveryStreamElasticsearchBufferingHintsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.ElasticsearchBufferingHintsProperty {
    val builder = CfnDeliveryStreamElasticsearchBufferingHintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamElasticsearchDestinationConfigurationProperty(block: CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty {
    val builder = CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamElasticsearchRetryOptionsProperty(block: CfnDeliveryStreamElasticsearchRetryOptionsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.ElasticsearchRetryOptionsProperty {
    val builder = CfnDeliveryStreamElasticsearchRetryOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamEncryptionConfigurationProperty(block: CfnDeliveryStreamEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.EncryptionConfigurationProperty {
    val builder = CfnDeliveryStreamEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamExtendedS3DestinationConfigurationProperty(block: CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty {
    val builder = CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamHiveJsonSerDeProperty(block: CfnDeliveryStreamHiveJsonSerDePropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.HiveJsonSerDeProperty {
    val builder = CfnDeliveryStreamHiveJsonSerDePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamHttpEndpointCommonAttributeProperty(block: CfnDeliveryStreamHttpEndpointCommonAttributePropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.HttpEndpointCommonAttributeProperty {
    val builder = CfnDeliveryStreamHttpEndpointCommonAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamHttpEndpointConfigurationProperty(block: CfnDeliveryStreamHttpEndpointConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.HttpEndpointConfigurationProperty {
    val builder = CfnDeliveryStreamHttpEndpointConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamHttpEndpointDestinationConfigurationProperty(block: CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty {
    val builder = CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamHttpEndpointRequestConfigurationProperty(block: CfnDeliveryStreamHttpEndpointRequestConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.HttpEndpointRequestConfigurationProperty {
    val builder = CfnDeliveryStreamHttpEndpointRequestConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamInputFormatConfigurationProperty(block: CfnDeliveryStreamInputFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.InputFormatConfigurationProperty {
    val builder = CfnDeliveryStreamInputFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamKMSEncryptionConfigProperty(block: CfnDeliveryStreamKMSEncryptionConfigPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.KMSEncryptionConfigProperty {
    val builder = CfnDeliveryStreamKMSEncryptionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamKinesisStreamSourceConfigurationProperty(block: CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.KinesisStreamSourceConfigurationProperty {
    val builder = CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamOpenXJsonSerDeProperty(block: CfnDeliveryStreamOpenXJsonSerDePropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.OpenXJsonSerDeProperty {
    val builder = CfnDeliveryStreamOpenXJsonSerDePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamOrcSerDeProperty(block: CfnDeliveryStreamOrcSerDePropertyDsl.() -> Unit =
      {}): CfnDeliveryStream.OrcSerDeProperty {
    val builder = CfnDeliveryStreamOrcSerDePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamOutputFormatConfigurationProperty(block: CfnDeliveryStreamOutputFormatConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.OutputFormatConfigurationProperty {
    val builder = CfnDeliveryStreamOutputFormatConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamParquetSerDeProperty(block: CfnDeliveryStreamParquetSerDePropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.ParquetSerDeProperty {
    val builder = CfnDeliveryStreamParquetSerDePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamProcessingConfigurationProperty(block: CfnDeliveryStreamProcessingConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.ProcessingConfigurationProperty {
    val builder = CfnDeliveryStreamProcessingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamProcessorParameterProperty(block: CfnDeliveryStreamProcessorParameterPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.ProcessorParameterProperty {
    val builder = CfnDeliveryStreamProcessorParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamProcessorProperty(block: CfnDeliveryStreamProcessorPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.ProcessorProperty {
    val builder = CfnDeliveryStreamProcessorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeliveryStreamProps(block: CfnDeliveryStreamPropsDsl.() -> Unit = {}):
      CfnDeliveryStreamProps {
    val builder = CfnDeliveryStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamRedshiftDestinationConfigurationProperty(block: CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.RedshiftDestinationConfigurationProperty {
    val builder = CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamRedshiftRetryOptionsProperty(block: CfnDeliveryStreamRedshiftRetryOptionsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.RedshiftRetryOptionsProperty {
    val builder = CfnDeliveryStreamRedshiftRetryOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamRetryOptionsProperty(block: CfnDeliveryStreamRetryOptionsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.RetryOptionsProperty {
    val builder = CfnDeliveryStreamRetryOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamS3DestinationConfigurationProperty(block: CfnDeliveryStreamS3DestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.S3DestinationConfigurationProperty {
    val builder = CfnDeliveryStreamS3DestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamSchemaConfigurationProperty(block: CfnDeliveryStreamSchemaConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.SchemaConfigurationProperty {
    val builder = CfnDeliveryStreamSchemaConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamSerializerProperty(block: CfnDeliveryStreamSerializerPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.SerializerProperty {
    val builder = CfnDeliveryStreamSerializerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamSplunkDestinationConfigurationProperty(block: CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.SplunkDestinationConfigurationProperty {
    val builder = CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamSplunkRetryOptionsProperty(block: CfnDeliveryStreamSplunkRetryOptionsPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.SplunkRetryOptionsProperty {
    val builder = CfnDeliveryStreamSplunkRetryOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryStreamVpcConfigurationProperty(block: CfnDeliveryStreamVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnDeliveryStream.VpcConfigurationProperty {
    val builder = CfnDeliveryStreamVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
