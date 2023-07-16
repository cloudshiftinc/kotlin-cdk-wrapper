@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamElasticsearchDestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder =
      CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.builder()

  public fun bufferingHints(bufferingHints: IResolvable) {
    cdkBuilder.bufferingHints(bufferingHints)
  }

  public fun bufferingHints(bufferingHints: CfnDeliveryStream.ElasticsearchBufferingHintsProperty) {
    cdkBuilder.bufferingHints(bufferingHints)
  }

  public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  public
      fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  public fun clusterEndpoint(clusterEndpoint: String) {
    cdkBuilder.clusterEndpoint(clusterEndpoint)
  }

  public fun documentIdOptions(documentIdOptions: IResolvable) {
    cdkBuilder.documentIdOptions(documentIdOptions)
  }

  public fun documentIdOptions(documentIdOptions: CfnDeliveryStream.DocumentIdOptionsProperty) {
    cdkBuilder.documentIdOptions(documentIdOptions)
  }

  public fun domainArn(domainArn: String) {
    cdkBuilder.domainArn(domainArn)
  }

  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  public fun indexRotationPeriod(indexRotationPeriod: String) {
    cdkBuilder.indexRotationPeriod(indexRotationPeriod)
  }

  public fun processingConfiguration(processingConfiguration: IResolvable) {
    cdkBuilder.processingConfiguration(processingConfiguration)
  }

  public
      fun processingConfiguration(processingConfiguration: CfnDeliveryStream.ProcessingConfigurationProperty) {
    cdkBuilder.processingConfiguration(processingConfiguration)
  }

  public fun retryOptions(retryOptions: IResolvable) {
    cdkBuilder.retryOptions(retryOptions)
  }

  public fun retryOptions(retryOptions: CfnDeliveryStream.ElasticsearchRetryOptionsProperty) {
    cdkBuilder.retryOptions(retryOptions)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun s3BackupMode(s3BackupMode: String) {
    cdkBuilder.s3BackupMode(s3BackupMode)
  }

  public fun s3Configuration(s3Configuration: IResolvable) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public
      fun s3Configuration(s3Configuration: CfnDeliveryStream.S3DestinationConfigurationProperty) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun vpcConfiguration(vpcConfiguration: CfnDeliveryStream.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty =
      cdkBuilder.build()
}
