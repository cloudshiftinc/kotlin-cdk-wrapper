@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public inline fun CfnDeliveryStream.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDeliveryStream.setAmazonOpenSearchServerlessDestinationConfiguration(block: CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamAmazonOpenSearchServerlessDestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setAmazonOpenSearchServerlessDestinationConfiguration(builder.build())
}

public inline
    fun CfnDeliveryStream.setAmazonopensearchserviceDestinationConfiguration(block: CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamAmazonopensearchserviceDestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setAmazonopensearchserviceDestinationConfiguration(builder.build())
}

public inline
    fun CfnDeliveryStream.setDeliveryStreamEncryptionConfigurationInput(block: CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamDeliveryStreamEncryptionConfigurationInputPropertyDsl()
  builder.apply(block)
  return setDeliveryStreamEncryptionConfigurationInput(builder.build())
}

public inline
    fun CfnDeliveryStream.setElasticsearchDestinationConfiguration(block: CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setElasticsearchDestinationConfiguration(builder.build())
}

public inline
    fun CfnDeliveryStream.setExtendedS3DestinationConfiguration(block: CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamExtendedS3DestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setExtendedS3DestinationConfiguration(builder.build())
}

public inline
    fun CfnDeliveryStream.setHttpEndpointDestinationConfiguration(block: CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamHttpEndpointDestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setHttpEndpointDestinationConfiguration(builder.build())
}

public inline
    fun CfnDeliveryStream.setKinesisStreamSourceConfiguration(block: CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl()
  builder.apply(block)
  return setKinesisStreamSourceConfiguration(builder.build())
}

public inline
    fun CfnDeliveryStream.setRedshiftDestinationConfiguration(block: CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamRedshiftDestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setRedshiftDestinationConfiguration(builder.build())
}

public inline
    fun CfnDeliveryStream.setS3DestinationConfiguration(block: CfnDeliveryStreamS3DestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamS3DestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setS3DestinationConfiguration(builder.build())
}

public inline
    fun CfnDeliveryStream.setSplunkDestinationConfiguration(block: CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryStreamSplunkDestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setSplunkDestinationConfiguration(builder.build())
}
