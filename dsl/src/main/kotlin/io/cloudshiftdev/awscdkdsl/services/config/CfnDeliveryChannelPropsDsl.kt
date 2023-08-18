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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnDeliveryChannelProps

/**
 * Properties for defining a `CfnDeliveryChannel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnDeliveryChannelProps cfnDeliveryChannelProps = CfnDeliveryChannelProps.builder()
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
public class CfnDeliveryChannelPropsDsl {
    private val cdkBuilder: CfnDeliveryChannelProps.Builder = CfnDeliveryChannelProps.builder()

    /**
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     *   configuration snapshots to the Amazon S3 bucket.
     */
    public fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable) {
        cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties)
    }

    /**
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
     * @param name A name for the delivery channel. If you don't specify a name, AWS CloudFormation
     *   generates a unique physical ID and uses that ID for the delivery channel name. For more
     *   information, see
     *   [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     *   .
     *
     * Updates are not supported. To change the name, you must run two separate updates. In the
     * first update, delete this resource, and then recreate it with a new name in the second
     * update.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param s3BucketName The name of the Amazon S3 bucket to which AWS Config delivers
     *   configuration snapshots and configuration history files. If you specify a bucket that
     *   belongs to another AWS account , that bucket must have policies that grant access
     *   permissions to AWS Config . For more information, see
     *   [Permissions for the Amazon S3 Bucket](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html)
     *   in the *AWS Config Developer Guide* .
     */
    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    /** @param s3KeyPrefix The prefix for the specified Amazon S3 bucket. */
    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    /**
     * @param s3KmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS
     *   ) AWS KMS key (KMS key) used to encrypt objects delivered by AWS Config . Must belong to
     *   the same Region as the destination S3 bucket.
     */
    public fun s3KmsKeyArn(s3KmsKeyArn: String) {
        cdkBuilder.s3KmsKeyArn(s3KmsKeyArn)
    }

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config
     *   sends notifications about configuration changes. If you choose a topic from another
     *   account, the topic must have policies that grant access permissions to AWS Config . For
     *   more information, see
     *   [Permissions for the Amazon SNS Topic](https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html)
     *   in the *AWS Config Developer Guide* .
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnDeliveryChannelProps = cdkBuilder.build()
}
