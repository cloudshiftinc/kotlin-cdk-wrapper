@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * When included in a receipt rule, this action saves the received message to an Amazon Simple
 * Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon Simple
 * Notification Service (Amazon SNS).
 *
 * To enable Amazon SES to write emails to your Amazon S3 bucket, use an AWS KMS key to encrypt your
 * emails, or publish to an Amazon SNS topic of another account, Amazon SES must have permission to
 * access those resources. For information about granting permissions, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html) .
 *
 *
 * When you save your emails to an Amazon S3 bucket, the maximum email size (including headers) is
 * 40 MB. Emails larger than that bounces.
 *
 *
 * For information about specifying Amazon S3 actions in receipt rules, see the [Amazon SES
 * Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-s3.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * S3ActionProperty s3ActionProperty = S3ActionProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .objectKeyPrefix("objectKeyPrefix")
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html)
 */
@CdkDslMarker
public class CfnReceiptRuleS3ActionPropertyDsl {
  private val cdkBuilder: CfnReceiptRule.S3ActionProperty.Builder =
      CfnReceiptRule.S3ActionProperty.builder()

  /**
   * @param bucketName The name of the Amazon S3 bucket for incoming email. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param kmsKeyArn The customer master key that Amazon SES should use to encrypt your emails
   * before saving them to the Amazon S3 bucket.
   * You can use the default master key or a custom master key that you created in AWS KMS as
   * follows:
   *
   * * To use the default master key, provide an ARN in the form of
   * `arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses` . For example, if your AWS account
   * ID is 123456789012 and you want to use the default master key in the US West (Oregon) Region, the
   * ARN of the default master key would be `arn:aws:kms:us-west-2:123456789012:alias/aws/ses` . If you
   * use the default master key, you don't need to perform any extra steps to give Amazon SES
   * permission to use the key.
   * * To use a custom master key that you created in AWS KMS, provide the ARN of the master key and
   * ensure that you add a statement to your key's policy to give Amazon SES permission to use it. For
   * more information about giving permissions, see the [Amazon SES Developer
   * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html) .
   *
   * For more information about key policies, see the [AWS KMS Developer
   * Guide](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html) . If you do not
   * specify a master key, Amazon SES does not encrypt your emails.
   *
   *
   * Your mail is encrypted by Amazon SES using the Amazon S3 encryption client before the mail is
   * submitted to Amazon S3 for storage. It is not encrypted using Amazon S3 server-side encryption.
   * This means that you must use the Amazon S3 encryption client to decrypt the email after retrieving
   * it from Amazon S3, as the service has no access to use your AWS KMS keys for decryption. This
   * encryption client is currently available with the [AWS SDK for
   * Java](https://docs.aws.amazon.com/sdk-for-java/) and [AWS SDK for
   * Ruby](https://docs.aws.amazon.com/sdk-for-ruby/) only. For more information about client-side
   * encryption using AWS KMS master keys, see the [Amazon S3 Developer
   * Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html) .
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param objectKeyPrefix The key prefix of the Amazon S3 bucket.
   * The key prefix is similar to a directory name that enables you to store similar data under the
   * same directory in a bucket.
   */
  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  /**
   * @param topicArn The ARN of the Amazon SNS topic to notify when the message is saved to the
   * Amazon S3 bucket.
   * You can find the ARN of a topic by using the
   * [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in Amazon
   * SNS.
   *
   * For more information about Amazon SNS topics, see the [Amazon SNS Developer
   * Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
   */
  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): CfnReceiptRule.S3ActionProperty = cdkBuilder.build()
}
