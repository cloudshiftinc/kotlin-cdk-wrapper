@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps

@CdkDslMarker
public class CfnDeliveryStreamPropsDsl {
  private val cdkBuilder: CfnDeliveryStreamProps.Builder = CfnDeliveryStreamProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public
      fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: IResolvable) {
    cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration)
  }

  public
      fun amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration: CfnDeliveryStream.AmazonOpenSearchServerlessDestinationConfigurationProperty) {
    cdkBuilder.amazonOpenSearchServerlessDestinationConfiguration(amazonOpenSearchServerlessDestinationConfiguration)
  }

  public
      fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: IResolvable) {
    cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration)
  }

  public
      fun amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration: CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty) {
    cdkBuilder.amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration)
  }

  public
      fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: IResolvable) {
    cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput)
  }

  public
      fun deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput: CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty) {
    cdkBuilder.deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput)
  }

  public fun deliveryStreamName(deliveryStreamName: String) {
    cdkBuilder.deliveryStreamName(deliveryStreamName)
  }

  public fun deliveryStreamType(deliveryStreamType: String) {
    cdkBuilder.deliveryStreamType(deliveryStreamType)
  }

  public
      fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: IResolvable) {
    cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration)
  }

  public
      fun elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty) {
    cdkBuilder.elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration)
  }

  public fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: IResolvable) {
    cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration)
  }

  public
      fun extendedS3DestinationConfiguration(extendedS3DestinationConfiguration: CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty) {
    cdkBuilder.extendedS3DestinationConfiguration(extendedS3DestinationConfiguration)
  }

  public
      fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: IResolvable) {
    cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration)
  }

  public
      fun httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty) {
    cdkBuilder.httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration)
  }

  public fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: IResolvable) {
    cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration)
  }

  public
      fun kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty) {
    cdkBuilder.kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration)
  }

  public fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: IResolvable) {
    cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration)
  }

  public
      fun redshiftDestinationConfiguration(redshiftDestinationConfiguration: CfnDeliveryStream.RedshiftDestinationConfigurationProperty) {
    cdkBuilder.redshiftDestinationConfiguration(redshiftDestinationConfiguration)
  }

  public fun s3DestinationConfiguration(s3DestinationConfiguration: IResolvable) {
    cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
  }

  public
      fun s3DestinationConfiguration(s3DestinationConfiguration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
    cdkBuilder.s3DestinationConfiguration(s3DestinationConfiguration)
  }

  public fun splunkDestinationConfiguration(splunkDestinationConfiguration: IResolvable) {
    cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration)
  }

  public
      fun splunkDestinationConfiguration(splunkDestinationConfiguration: CfnDeliveryStream.SplunkDestinationConfigurationProperty) {
    cdkBuilder.splunkDestinationConfiguration(splunkDestinationConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDeliveryStreamProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
