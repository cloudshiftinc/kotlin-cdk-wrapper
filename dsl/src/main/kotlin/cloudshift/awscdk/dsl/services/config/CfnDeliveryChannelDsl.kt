@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnDeliveryChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDeliveryChannel.Builder = CfnDeliveryChannel.Builder.create(scope, id)

  /**
   * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
   * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
   * configuration snapshots to the Amazon S3 bucket. 
   */
  public fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable) {
    cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties)
  }

  /**
   * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
   * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
   * configuration snapshots to the Amazon S3 bucket. 
   */
  public
      fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty) {
    cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties)
  }

  /**
   * A name for the delivery channel.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the delivery channel name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * Updates are not supported. To change the name, you must run two separate updates. In the first
   * update, delete this resource, and then recreate it with a new name in the second update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name)
   * @param name A name for the delivery channel. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and
   * configuration history files.
   *
   * If you specify a bucket that belongs to another AWS account , that bucket must have policies
   * that grant access permissions to AWS Config . For more information, see [Permissions for the
   * Amazon S3 Bucket](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html)
   * in the *AWS Config Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname)
   * @param s3BucketName The name of the Amazon S3 bucket to which AWS Config delivers configuration
   * snapshots and configuration history files. 
   */
  public fun s3BucketName(s3BucketName: String) {
    cdkBuilder.s3BucketName(s3BucketName)
  }

  /**
   * The prefix for the specified Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
   * @param s3KeyPrefix The prefix for the specified Amazon S3 bucket. 
   */
  public fun s3KeyPrefix(s3KeyPrefix: String) {
    cdkBuilder.s3KeyPrefix(s3KeyPrefix)
  }

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS ) AWS KMS key (KMS
   * key) used to encrypt objects delivered by AWS Config .
   *
   * Must belong to the same Region as the destination S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3kmskeyarn)
   * @param s3KmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS )
   * AWS KMS key (KMS key) used to encrypt objects delivered by AWS Config . 
   */
  public fun s3KmsKeyArn(s3KmsKeyArn: String) {
    cdkBuilder.s3KmsKeyArn(s3KmsKeyArn)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications
   * about configuration changes.
   *
   * If you choose a topic from another account, the topic must have policies that grant access
   * permissions to AWS Config . For more information, see [Permissions for the Amazon SNS
   * Topic](https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html) in the *AWS
   * Config Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn)
   * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config
   * sends notifications about configuration changes. 
   */
  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  public fun build(): CfnDeliveryChannel = cdkBuilder.build()
}
