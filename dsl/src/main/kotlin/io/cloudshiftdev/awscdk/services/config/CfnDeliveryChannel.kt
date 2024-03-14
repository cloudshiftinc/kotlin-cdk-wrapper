package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeliveryChannel
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannel,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
     * bucket.
     */
    public open fun configSnapshotDeliveryProperties(): Any? =
        unwrap(this).getConfigSnapshotDeliveryProperties()

    /**
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
     * bucket.
     */
    public open fun configSnapshotDeliveryProperties(`value`: IResolvable) {
        unwrap(this).setConfigSnapshotDeliveryProperties(`value`.let(IResolvable::unwrap))
    }

    /**
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
     * bucket.
     */
    public open fun configSnapshotDeliveryProperties(
        `value`: ConfigSnapshotDeliveryPropertiesProperty
    ) {
        unwrap(this)
            .setConfigSnapshotDeliveryProperties(
                `value`.let(ConfigSnapshotDeliveryPropertiesProperty::unwrap)
            )
    }

    /**
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
     * bucket.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f058971d24c9256517585ee6875022db27101276d4eb66209d4f1077ba37ba")
    public open fun configSnapshotDeliveryProperties(
        `value`: ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit
    ): Unit = configSnapshotDeliveryProperties(ConfigSnapshotDeliveryPropertiesProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** A name for the delivery channel. */
    public open fun name(): String? = unwrap(this).getName()

    /** A name for the delivery channel. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /**
     * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and
     * configuration history files.
     */
    public open fun s3BucketName(): String = unwrap(this).getS3BucketName()

    /**
     * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and
     * configuration history files.
     */
    public open fun s3BucketName(`value`: String) {
        unwrap(this).setS3BucketName(`value`)
    }

    /** The prefix for the specified Amazon S3 bucket. */
    public open fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /** The prefix for the specified Amazon S3 bucket. */
    public open fun s3KeyPrefix(`value`: String) {
        unwrap(this).setS3KeyPrefix(`value`)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS ) AWS KMS key (KMS
     * key) used to encrypt objects delivered by AWS Config .
     */
    public open fun s3KmsKeyArn(): String? = unwrap(this).getS3KmsKeyArn()

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS ) AWS KMS key (KMS
     * key) used to encrypt objects delivered by AWS Config .
     */
    public open fun s3KmsKeyArn(`value`: String) {
        unwrap(this).setS3KmsKeyArn(`value`)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends
     * notifications about configuration changes.
     */
    public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends
     * notifications about configuration changes.
     */
    public open fun snsTopicArn(`value`: String) {
        unwrap(this).setSnsTopicArn(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnDeliveryChannel]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
         * bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
         *
         * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
         *   configuration snapshots to the Amazon S3 bucket.
         */
        public fun configSnapshotDeliveryProperties(configSnapshotDeliveryProperties: IResolvable)

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
            configSnapshotDeliveryProperties: ConfigSnapshotDeliveryPropertiesProperty
        )

        /**
         * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
         * bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
         *
         * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
         *   configuration snapshots to the Amazon S3 bucket.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("bfb4bf1ae0c01b5dff6b36efd667367546cb7272c7922473fbf7054028e9e546")
        public fun configSnapshotDeliveryProperties(
            configSnapshotDeliveryProperties:
                ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit
        )

        /**
         * A name for the delivery channel.
         *
         * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses
         * that ID for the delivery channel name. For more information, see
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
        public fun name(name: String)

        /**
         * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and
         * configuration history files.
         *
         * If you specify a bucket that belongs to another AWS account , that bucket must have
         * policies that grant access permissions to AWS Config . For more information, see
         * [Permissions for the Amazon S3 Bucket](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html)
         * in the *AWS Config Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname)
         *
         * @param s3BucketName The name of the Amazon S3 bucket to which AWS Config delivers
         *   configuration snapshots and configuration history files.
         */
        public fun s3BucketName(s3BucketName: String)

        /**
         * The prefix for the specified Amazon S3 bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
         *
         * @param s3KeyPrefix The prefix for the specified Amazon S3 bucket.
         */
        public fun s3KeyPrefix(s3KeyPrefix: String)

        /**
         * The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS ) AWS KMS key
         * (KMS key) used to encrypt objects delivered by AWS Config .
         *
         * Must belong to the same Region as the destination S3 bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3kmskeyarn)
         *
         * @param s3KmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS
         *   KMS ) AWS KMS key (KMS key) used to encrypt objects delivered by AWS Config .
         */
        public fun s3KmsKeyArn(s3KmsKeyArn: String)

        /**
         * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends
         * notifications about configuration changes.
         *
         * If you choose a topic from another account, the topic must have policies that grant
         * access permissions to AWS Config . For more information, see
         * [Permissions for the Amazon SNS Topic](https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html)
         * in the *AWS Config Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn)
         *
         * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS
         *   Config sends notifications about configuration changes.
         */
        public fun snsTopicArn(snsTopicArn: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.config.CfnDeliveryChannel.Builder =
            software.amazon.awscdk.services.config.CfnDeliveryChannel.Builder.create(scope, id)

        /**
         * The options for how often AWS Config delivers configuration snapshots to the Amazon S3
         * bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties)
         *
         * @param configSnapshotDeliveryProperties The options for how often AWS Config delivers
         *   configuration snapshots to the Amazon S3 bucket.
         */
        override fun configSnapshotDeliveryProperties(
            configSnapshotDeliveryProperties: IResolvable
        ) {
            cdkBuilder.configSnapshotDeliveryProperties(
                configSnapshotDeliveryProperties.let(IResolvable::unwrap)
            )
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
        override fun configSnapshotDeliveryProperties(
            configSnapshotDeliveryProperties: ConfigSnapshotDeliveryPropertiesProperty
        ) {
            cdkBuilder.configSnapshotDeliveryProperties(
                configSnapshotDeliveryProperties.let(
                    ConfigSnapshotDeliveryPropertiesProperty::unwrap
                )
            )
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("bfb4bf1ae0c01b5dff6b36efd667367546cb7272c7922473fbf7054028e9e546")
        override fun configSnapshotDeliveryProperties(
            configSnapshotDeliveryProperties:
                ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit
        ): Unit =
            configSnapshotDeliveryProperties(
                ConfigSnapshotDeliveryPropertiesProperty(configSnapshotDeliveryProperties)
            )

        /**
         * A name for the delivery channel.
         *
         * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses
         * that ID for the delivery channel name. For more information, see
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
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and
         * configuration history files.
         *
         * If you specify a bucket that belongs to another AWS account , that bucket must have
         * policies that grant access permissions to AWS Config . For more information, see
         * [Permissions for the Amazon S3 Bucket](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html)
         * in the *AWS Config Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3bucketname)
         *
         * @param s3BucketName The name of the Amazon S3 bucket to which AWS Config delivers
         *   configuration snapshots and configuration history files.
         */
        override fun s3BucketName(s3BucketName: String) {
            cdkBuilder.s3BucketName(s3BucketName)
        }

        /**
         * The prefix for the specified Amazon S3 bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3keyprefix)
         *
         * @param s3KeyPrefix The prefix for the specified Amazon S3 bucket.
         */
        override fun s3KeyPrefix(s3KeyPrefix: String) {
            cdkBuilder.s3KeyPrefix(s3KeyPrefix)
        }

        /**
         * The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS KMS ) AWS KMS key
         * (KMS key) used to encrypt objects delivered by AWS Config .
         *
         * Must belong to the same Region as the destination S3 bucket.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-s3kmskeyarn)
         *
         * @param s3KmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service ( AWS
         *   KMS ) AWS KMS key (KMS key) used to encrypt objects delivered by AWS Config .
         */
        override fun s3KmsKeyArn(s3KmsKeyArn: String) {
            cdkBuilder.s3KmsKeyArn(s3KmsKeyArn)
        }

        /**
         * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends
         * notifications about configuration changes.
         *
         * If you choose a topic from another account, the topic must have policies that grant
         * access permissions to AWS Config . For more information, see
         * [Permissions for the Amazon SNS Topic](https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html)
         * in the *AWS Config Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html#cfn-config-deliverychannel-snstopicarn)
         *
         * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS
         *   Config sends notifications about configuration changes.
         */
        override fun snsTopicArn(snsTopicArn: String) {
            cdkBuilder.snsTopicArn(snsTopicArn)
        }

        public fun build(): software.amazon.awscdk.services.config.CfnDeliveryChannel =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDeliveryChannel {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDeliveryChannel(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.config.CfnDeliveryChannel
        ): CfnDeliveryChannel = CfnDeliveryChannel(cdkObject)

        internal fun unwrap(
            wrapped: CfnDeliveryChannel
        ): software.amazon.awscdk.services.config.CfnDeliveryChannel = wrapped.cdkObject
    }

    public interface ConfigSnapshotDeliveryPropertiesProperty {
        /**
         * The frequency with which AWS Config delivers configuration snapshots.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency)
         */
        public fun deliveryFrequency(): String? = unwrap(this).getDeliveryFrequency()

        /** A builder for [ConfigSnapshotDeliveryPropertiesProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param deliveryFrequency The frequency with which AWS Config delivers configuration
             *   snapshots.
             */
            public fun deliveryFrequency(deliveryFrequency: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder =
                software.amazon.awscdk.services.config.CfnDeliveryChannel
                    .ConfigSnapshotDeliveryPropertiesProperty
                    .builder()

            /**
             * @param deliveryFrequency The frequency with which AWS Config delivers configuration
             *   snapshots.
             */
            override fun deliveryFrequency(deliveryFrequency: String) {
                cdkBuilder.deliveryFrequency(deliveryFrequency)
            }

            public fun build():
                software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty,
        ) : ConfigSnapshotDeliveryPropertiesProperty {
            /**
             * The frequency with which AWS Config delivers configuration snapshots.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency)
             */
            override fun deliveryFrequency(): String? = unwrap(this).getDeliveryFrequency()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ConfigSnapshotDeliveryPropertiesProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty
            ): ConfigSnapshotDeliveryPropertiesProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ConfigSnapshotDeliveryPropertiesProperty
            ): software.amazon.awscdk.services.config.CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
