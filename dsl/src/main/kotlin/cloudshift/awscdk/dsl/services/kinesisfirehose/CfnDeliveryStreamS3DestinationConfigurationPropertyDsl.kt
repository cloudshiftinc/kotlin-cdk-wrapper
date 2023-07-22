@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `S3DestinationConfiguration` property type specifies an Amazon Simple Storage Service (Amazon
 * S3) destination to which Amazon Kinesis Data Firehose (Kinesis Data Firehose) delivers data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
 * S3DestinationConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .bufferingHints(BufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build())
 * .cloudWatchLoggingOptions(CloudWatchLoggingOptionsProperty.builder()
 * .enabled(false)
 * .logGroupName("logGroupName")
 * .logStreamName("logStreamName")
 * .build())
 * .compressionFormat("compressionFormat")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsEncryptionConfig(KMSEncryptionConfigProperty.builder()
 * .awskmsKeyArn("awskmsKeyArn")
 * .build())
 * .noEncryptionConfig("noEncryptionConfig")
 * .build())
 * .errorOutputPrefix("errorOutputPrefix")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamS3DestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.S3DestinationConfigurationProperty.Builder =
      CfnDeliveryStream.S3DestinationConfigurationProperty.builder()

  /**
   * @param bucketArn The Amazon Resource Name (ARN) of the Amazon S3 bucket to send data to. 
   */
  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  /**
   * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
   * delivering it to the Amazon S3 bucket.
   */
  public fun bufferingHints(bufferingHints: IResolvable) {
    cdkBuilder.bufferingHints(bufferingHints)
  }

  /**
   * @param bufferingHints Configures how Kinesis Data Firehose buffers incoming data while
   * delivering it to the Amazon S3 bucket.
   */
  public fun bufferingHints(bufferingHints: CfnDeliveryStream.BufferingHintsProperty) {
    cdkBuilder.bufferingHints(bufferingHints)
  }

  /**
   * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
   */
  public fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: IResolvable) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  /**
   * @param cloudWatchLoggingOptions The CloudWatch logging options for your delivery stream.
   */
  public
      fun cloudWatchLoggingOptions(cloudWatchLoggingOptions: CfnDeliveryStream.CloudWatchLoggingOptionsProperty) {
    cdkBuilder.cloudWatchLoggingOptions(cloudWatchLoggingOptions)
  }

  /**
   * @param compressionFormat The type of compression that Kinesis Data Firehose uses to compress
   * the data that it delivers to the Amazon S3 bucket.
   * For valid values, see the `CompressionFormat` content for the
   * [S3DestinationConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_S3DestinationConfiguration.html)
   * data type in the *Amazon Kinesis Data Firehose API Reference* .
   */
  public fun compressionFormat(compressionFormat: String) {
    cdkBuilder.compressionFormat(compressionFormat)
  }

  /**
   * @param encryptionConfiguration Configures Amazon Simple Storage Service (Amazon S3) server-side
   * encryption.
   * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that it
   * delivers to your Amazon S3 bucket.
   */
  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param encryptionConfiguration Configures Amazon Simple Storage Service (Amazon S3) server-side
   * encryption.
   * Kinesis Data Firehose uses AWS Key Management Service ( AWS KMS) to encrypt the data that it
   * delivers to your Amazon S3 bucket.
   */
  public
      fun encryptionConfiguration(encryptionConfiguration: CfnDeliveryStream.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * @param errorOutputPrefix A prefix that Kinesis Data Firehose evaluates and adds to failed
   * records before writing them to S3.
   * This prefix appears immediately following the bucket name. For information about how to specify
   * this prefix, see [Custom Prefixes for Amazon S3
   * Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html) .
   */
  public fun errorOutputPrefix(errorOutputPrefix: String) {
    cdkBuilder.errorOutputPrefix(errorOutputPrefix)
  }

  /**
   * @param prefix A prefix that Kinesis Data Firehose adds to the files that it delivers to the
   * Amazon S3 bucket.
   * The prefix helps you identify the files that Kinesis Data Firehose delivered.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param roleArn The ARN of an AWS Identity and Access Management (IAM) role that grants Kinesis
   * Data Firehose access to your Amazon S3 bucket and AWS KMS (if you enable data encryption). 
   * For more information, see [Grant Kinesis Data Firehose Access to an Amazon S3
   * Destination](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3)
   * in the *Amazon Kinesis Data Firehose Developer Guide* .
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDeliveryStream.S3DestinationConfigurationProperty = cdkBuilder.build()
}
