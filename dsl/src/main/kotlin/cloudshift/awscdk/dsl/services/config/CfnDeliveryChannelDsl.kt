@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.constructs.Construct

/**
 * Specifies a delivery channel object to deliver configuration information to an Amazon S3 bucket
 * and Amazon SNS topic.
 *
 * Before you can create a delivery channel, you must create a configuration recorder. You can use
 * this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery
 * channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the
 * changed values for the S3 bucket and the SNS topic. If you specify a different value for either
 * the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that
 * is not changed.
 *
 * In the China (Beijing) Region, when you call this action, the Amazon S3 bucket must also be in
 * the China (Beijing) Region. In all the other regions, AWS Config supports cross-region and
 * cross-account delivery channels.
 *
 * You can have only one delivery channel per region per AWS account, and the delivery channel is
 * required to use AWS Config .
 *
 * AWS Config does not support the delivery channel to an Amazon S3 bucket bucket where object lock
 * is enabled. For more information, see
 * [How S3 Object Lock works](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html)
 * .
 *
 * When you create the delivery channel, you can specify; how often AWS Config delivers
 * configuration snapshots to your Amazon S3 bucket (for example, 24 hours), the S3 bucket to which
 * AWS Config sends configuration snapshots and configuration history files, and the Amazon SNS
 * topic to which AWS Config sends notifications about configuration changes, such as updated
 * resources, AWS Config rule evaluations, and when AWS Config delivers the configuration snapshot
 * to your S3 bucket. For more information, see
 * [Deliver Configuration Items](https://docs.aws.amazon.com/config/latest/developerguide/how-does-config-work.html#delivery-channel)
 * in the AWS Config Developer Guide.
 *
 * To enable AWS Config , you must create a configuration recorder and a delivery channel. If you
 * want to create the resources separately, you must create a configuration recorder before you can
 * create a delivery channel. AWS Config uses the configuration recorder to capture configuration
 * changes to your resources. For more information, see
 * [AWS::Config::ConfigurationRecorder](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
 * .
 *
 * For more information, see
 * [Managing the Delivery Channel](https://docs.aws.amazon.com/config/latest/developerguide/manage-delivery-channel.html)
 * in the AWS Config Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnDeliveryChannel cfnDeliveryChannel = CfnDeliveryChannel.Builder.create(this,
 * "MyCfnDeliveryChannel")
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .configSnapshotDeliveryProperties(ConfigSnapshotDeliveryPropertiesProperty.builder()
 * .deliveryFrequency("deliveryFrequency")
 * .build())
 * .name("name")
 * .s3KeyPrefix("s3KeyPrefix")
 * .s3KmsKeyArn("s3KmsKeyArn")
 * .snsTopicArn("snsTopicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
 */
@CdkDslMarker
public class CfnDeliveryChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeliveryChannel.Builder =
        CfnDeliveryChannel.Builder.create(scope, id)

    /**
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
     *
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     *   configuration snapshots to the Amazon S3 bucket.
     */
    public fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable) {
        cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties)
    }

    /**
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
     *
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     *   configuration snapshots to the Amazon S3 bucket.
     */
    public fun configSnapshotDeliveryProperties(
        configSnapshotDeliveryProperties:
            CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty
    ) {
        cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties)
    }

    /**
     * A name for the delivery channel.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the delivery channel name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * Updates are not supported. To change the name, you must run two separate updates. In the
     * first update, delete this resource, and then recreate it with a new name in the second
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name)
     *
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
     * that grant access permissions to AWS Config . For more information, see
     * [Permissions for the Amazon S3 Bucket](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html)
     * in the *AWS Config Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname)
     *
     * @param s3BucketName The name of the Amazon S3 bucket to which AWS Config delivers
     *   configuration snapshots and configuration history files.
     */
    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    /**
     * The prefix for the specified Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
     *
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
     *
     * @param s3KmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS
     *   ) AWS KMS key (KMS key) used to encrypt objects delivered by AWS Config .
     */
    public fun s3KmsKeyArn(s3KmsKeyArn: String) {
        cdkBuilder.s3KmsKeyArn(s3KmsKeyArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends
     * notifications about configuration changes.
     *
     * If you choose a topic from another account, the topic must have policies that grant access
     * permissions to AWS Config . For more information, see
     * [Permissions for the Amazon SNS Topic](https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html)
     * in the *AWS Config Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn)
     *
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config
     *   sends notifications about configuration changes.
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnDeliveryChannel = cdkBuilder.build()
}
