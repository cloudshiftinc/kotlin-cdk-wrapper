package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDeliveryChannelProps {
  /**
   * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
   */
  public fun configSnapshotDeliveryProperties(): Any? =
      unwrap(this).getConfigSnapshotDeliveryProperties()

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
   */
  public fun name(): String? = unwrap(this).getName()

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
   */
  public fun s3BucketName(): String

  /**
   * The prefix for the specified Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
   */
  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  /**
   * The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS ) AWS KMS key (KMS
   * key) used to encrypt objects delivered by AWS Config .
   *
   * Must belong to the same Region as the destination S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3kmskeyarn)
   */
  public fun s3KmsKeyArn(): String? = unwrap(this).getS3KmsKeyArn()

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
   */
  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * A builder for [CfnDeliveryChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     * configuration snapshots to the Amazon S3 bucket.
     */
    public fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable)

    /**
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     * configuration snapshots to the Amazon S3 bucket.
     */
    public
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty)

    /**
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     * configuration snapshots to the Amazon S3 bucket.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9596114f0ba6633e96f0ffbe8717f015f3aa539c0157dc3d4d01e430aab64c0")
    public
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit)

    /**
     * @param name A name for the delivery channel.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the delivery channel name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * Updates are not supported. To change the name, you must run two separate updates. In the
     * first update, delete this resource, and then recreate it with a new name in the second update.
     */
    public fun name(name: String)

    /**
     * @param s3BucketName The name of the Amazon S3 bucket to which AWS Config delivers
     * configuration snapshots and configuration history files. 
     * If you specify a bucket that belongs to another AWS account , that bucket must have policies
     * that grant access permissions to AWS Config . For more information, see [Permissions for the
     * Amazon S3
     * Bucket](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html) in the
     * *AWS Config Developer Guide* .
     */
    public fun s3BucketName(s3BucketName: String)

    /**
     * @param s3KeyPrefix The prefix for the specified Amazon S3 bucket.
     */
    public fun s3KeyPrefix(s3KeyPrefix: String)

    /**
     * @param s3KmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS
     * ) AWS KMS key (KMS key) used to encrypt objects delivered by AWS Config .
     * Must belong to the same Region as the destination S3 bucket.
     */
    public fun s3KmsKeyArn(s3KmsKeyArn: String)

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config
     * sends notifications about configuration changes.
     * If you choose a topic from another account, the topic must have policies that grant access
     * permissions to AWS Config . For more information, see [Permissions for the Amazon SNS
     * Topic](https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html) in the
     * *AWS Config Developer Guide* .
     */
    public fun snsTopicArn(snsTopicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnDeliveryChannelProps.Builder =
        software.amazon.awscdk.services.config.CfnDeliveryChannelProps.builder()

    /**
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     * configuration snapshots to the Amazon S3 bucket.
     */
    override fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable) {
      cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.let(IResolvable::unwrap))
    }

    /**
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     * configuration snapshots to the Amazon S3 bucket.
     */
    override
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty) {
      cdkBuilder.configSnapshotDeliveryProperties(configSnapshotDeliveryProperties.let(CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty::unwrap))
    }

    /**
     * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
     * configuration snapshots to the Amazon S3 bucket.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9596114f0ba6633e96f0ffbe8717f015f3aa539c0157dc3d4d01e430aab64c0")
    override
        fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit):
        Unit =
        configSnapshotDeliveryProperties(CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty(configSnapshotDeliveryProperties))

    /**
     * @param name A name for the delivery channel.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the delivery channel name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * Updates are not supported. To change the name, you must run two separate updates. In the
     * first update, delete this resource, and then recreate it with a new name in the second update.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param s3BucketName The name of the Amazon S3 bucket to which AWS Config delivers
     * configuration snapshots and configuration history files. 
     * If you specify a bucket that belongs to another AWS account , that bucket must have policies
     * that grant access permissions to AWS Config . For more information, see [Permissions for the
     * Amazon S3
     * Bucket](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html) in the
     * *AWS Config Developer Guide* .
     */
    override fun s3BucketName(s3BucketName: String) {
      cdkBuilder.s3BucketName(s3BucketName)
    }

    /**
     * @param s3KeyPrefix The prefix for the specified Amazon S3 bucket.
     */
    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    /**
     * @param s3KmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS
     * ) AWS KMS key (KMS key) used to encrypt objects delivered by AWS Config .
     * Must belong to the same Region as the destination S3 bucket.
     */
    override fun s3KmsKeyArn(s3KmsKeyArn: String) {
      cdkBuilder.s3KmsKeyArn(s3KmsKeyArn)
    }

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config
     * sends notifications about configuration changes.
     * If you choose a topic from another account, the topic must have policies that grant access
     * permissions to AWS Config . For more information, see [Permissions for the Amazon SNS
     * Topic](https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html) in the
     * *AWS Config Developer Guide* .
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): software.amazon.awscdk.services.config.CfnDeliveryChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannelProps,
  ) : CdkObject(cdkObject), CfnDeliveryChannelProps {
    /**
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
     */
    override fun configSnapshotDeliveryProperties(): Any? =
        unwrap(this).getConfigSnapshotDeliveryProperties()

    /**
     * A name for the delivery channel.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the delivery channel name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * Updates are not supported. To change the name, you must run two separate updates. In the
     * first update, delete this resource, and then recreate it with a new name in the second update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and
     * configuration history files.
     *
     * If you specify a bucket that belongs to another AWS account , that bucket must have policies
     * that grant access permissions to AWS Config . For more information, see [Permissions for the
     * Amazon S3
     * Bucket](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html) in the
     * *AWS Config Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname)
     */
    override fun s3BucketName(): String = unwrap(this).getS3BucketName()

    /**
     * The prefix for the specified Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
     */
    override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS ) AWS KMS key (KMS
     * key) used to encrypt objects delivered by AWS Config .
     *
     * Must belong to the same Region as the destination S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3kmskeyarn)
     */
    override fun s3KmsKeyArn(): String? = unwrap(this).getS3KmsKeyArn()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends
     * notifications about configuration changes.
     *
     * If you choose a topic from another account, the topic must have policies that grant access
     * permissions to AWS Config . For more information, see [Permissions for the Amazon SNS
     * Topic](https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html) in the
     * *AWS Config Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn)
     */
    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliveryChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannelProps):
        CfnDeliveryChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryChannelProps):
        software.amazon.awscdk.services.config.CfnDeliveryChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.config.CfnDeliveryChannelProps
  }
}
