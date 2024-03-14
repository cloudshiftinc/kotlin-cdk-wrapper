package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationSetEventDestination
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * The name of the configuration set that contains the event destination that you want to
     * modify.
     */
    public open fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

    /**
     * The name of the configuration set that contains the event destination that you want to
     * modify.
     */
    public open fun configurationSetName(`value`: String) {
        unwrap(this).setConfigurationSetName(`value`)
    }

    /** An object that defines the event destination. */
    public open fun eventDestination(): Any? = unwrap(this).getEventDestination()

    /** An object that defines the event destination. */
    public open fun eventDestination(`value`: IResolvable) {
        unwrap(this).setEventDestination(`value`.let(IResolvable::unwrap))
    }

    /** An object that defines the event destination. */
    public open fun eventDestination(`value`: EventDestinationProperty) {
        unwrap(this).setEventDestination(`value`.let(EventDestinationProperty::unwrap))
    }

    /** An object that defines the event destination. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cdf24b4abed1fae2c37d8faccc9d158910bc3ba0adac1b8090f4913c3b00cca")
    public open fun eventDestination(`value`: EventDestinationProperty.Builder.() -> Unit): Unit =
        eventDestination(EventDestinationProperty(`value`))

    /** The name of the event destination that you want to modify. */
    public open fun eventDestinationName(): String = unwrap(this).getEventDestinationName()

    /** The name of the event destination that you want to modify. */
    public open fun eventDestinationName(`value`: String) {
        unwrap(this).setEventDestinationName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the configuration set that contains the event destination that you want to
         * modify.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname)
         *
         * @param configurationSetName The name of the configuration set that contains the event
         *   destination that you want to modify.
         */
        public fun configurationSetName(configurationSetName: String)

        /**
         * An object that defines the event destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
         *
         * @param eventDestination An object that defines the event destination.
         */
        public fun eventDestination(eventDestination: IResolvable)

        /**
         * An object that defines the event destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
         *
         * @param eventDestination An object that defines the event destination.
         */
        public fun eventDestination(eventDestination: EventDestinationProperty)

        /**
         * An object that defines the event destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
         *
         * @param eventDestination An object that defines the event destination.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("12b9bd9bdcdedc7ddffaa2a46d5a0f738c4129004755fec0f000269d00741256")
        public fun eventDestination(eventDestination: EventDestinationProperty.Builder.() -> Unit)

        /**
         * The name of the event destination that you want to modify.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname)
         *
         * @param eventDestinationName The name of the event destination that you want to modify.
         */
        public fun eventDestinationName(eventDestinationName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.Builder =
            software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
                .Builder
                .create(scope, id)

        /**
         * The name of the configuration set that contains the event destination that you want to
         * modify.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname)
         *
         * @param configurationSetName The name of the configuration set that contains the event
         *   destination that you want to modify.
         */
        override fun configurationSetName(configurationSetName: String) {
            cdkBuilder.configurationSetName(configurationSetName)
        }

        /**
         * An object that defines the event destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
         *
         * @param eventDestination An object that defines the event destination.
         */
        override fun eventDestination(eventDestination: IResolvable) {
            cdkBuilder.eventDestination(eventDestination.let(IResolvable::unwrap))
        }

        /**
         * An object that defines the event destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
         *
         * @param eventDestination An object that defines the event destination.
         */
        override fun eventDestination(eventDestination: EventDestinationProperty) {
            cdkBuilder.eventDestination(eventDestination.let(EventDestinationProperty::unwrap))
        }

        /**
         * An object that defines the event destination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
         *
         * @param eventDestination An object that defines the event destination.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("12b9bd9bdcdedc7ddffaa2a46d5a0f738c4129004755fec0f000269d00741256")
        override fun eventDestination(
            eventDestination: EventDestinationProperty.Builder.() -> Unit
        ): Unit = eventDestination(EventDestinationProperty(eventDestination))

        /**
         * The name of the event destination that you want to modify.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname)
         *
         * @param eventDestinationName The name of the event destination that you want to modify.
         */
        override fun eventDestinationName(eventDestinationName: String) {
            cdkBuilder.eventDestinationName(eventDestinationName)
        }

        public fun build():
            software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnConfigurationSetEventDestination {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnConfigurationSetEventDestination(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
        ): CfnConfigurationSetEventDestination = CfnConfigurationSetEventDestination(cdkObject)

        internal fun unwrap(
            wrapped: CfnConfigurationSetEventDestination
        ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination =
            wrapped.cdkObject
    }

    public interface KinesisFirehoseDestinationProperty {
        /**
         * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon
         * Pinpoint sends email events to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
         */
        public fun deliveryStreamArn(): String

        /**
         * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending
         * email events to the Amazon Kinesis Data Firehose stream.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-iamrolearn)
         */
        public fun iamRoleArn(): String

        /** A builder for [KinesisFirehoseDestinationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data
             *   Firehose stream that Amazon Pinpoint sends email events to.
             */
            public fun deliveryStreamArn(deliveryStreamArn: String)

            /**
             * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint
             *   uses when sending email events to the Amazon Kinesis Data Firehose stream.
             */
            public fun iamRoleArn(iamRoleArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder =
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
                    .KinesisFirehoseDestinationProperty
                    .builder()

            /**
             * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data
             *   Firehose stream that Amazon Pinpoint sends email events to.
             */
            override fun deliveryStreamArn(deliveryStreamArn: String) {
                cdkBuilder.deliveryStreamArn(deliveryStreamArn)
            }

            /**
             * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint
             *   uses when sending email events to the Amazon Kinesis Data Firehose stream.
             */
            override fun iamRoleArn(iamRoleArn: String) {
                cdkBuilder.iamRoleArn(iamRoleArn)
            }

            public fun build():
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty,
        ) : KinesisFirehoseDestinationProperty {
            /**
             * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon
             * Pinpoint sends email events to.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn)
             */
            override fun deliveryStreamArn(): String = unwrap(this).getDeliveryStreamArn()

            /**
             * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending
             * email events to the Amazon Kinesis Data Firehose stream.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-iamrolearn)
             */
            override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): KinesisFirehoseDestinationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
            ): KinesisFirehoseDestinationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: KinesisFirehoseDestinationProperty
            ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DimensionConfigurationProperty {
        /**
         * The default value of the dimension that is published to Amazon CloudWatch if you don't
         * provide the value of the dimension when you send an email.
         *
         * This value has to meet the following criteria:
         * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes
         *   (-).
         * * It can contain no more than 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-dimensionconfiguration.html#cfn-pinpointemail-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
         */
        public fun defaultDimensionValue(): String

        /**
         * The name of an Amazon CloudWatch dimension associated with an email sending metric.
         *
         * The name has to meet the following criteria:
         * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes
         *   (-).
         * * It can contain no more than 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-dimensionconfiguration.html#cfn-pinpointemail-configurationseteventdestination-dimensionconfiguration-dimensionname)
         */
        public fun dimensionName(): String

        /**
         * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon
         * CloudWatch.
         *
         * Acceptable values: `MESSAGE_TAG` , `EMAIL_HEADER` , and `LINK_TAG` .
         *
         * If you want Amazon Pinpoint to use the message tags that you specify using an
         * `X-SES-MESSAGE-TAGS` header or a parameter to the `SendEmail` API, choose `MESSAGE_TAG` .
         * If you want Amazon Pinpoint to use your own email headers, choose `EMAIL_HEADER` . If you
         * want Amazon Pinpoint to use tags that are specified in your links, choose `LINK_TAG` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-dimensionconfiguration.html#cfn-pinpointemail-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource)
         */
        public fun dimensionValueSource(): String

        /** A builder for [DimensionConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param defaultDimensionValue The default value of the dimension that is published to
             *   Amazon CloudWatch if you don't provide the value of the dimension when you send an
             *   email. This value has to meet the following criteria:
             * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or
             *   dashes (-).
             * * It can contain no more than 256 characters.
             */
            public fun defaultDimensionValue(defaultDimensionValue: String)

            /**
             * @param dimensionName The name of an Amazon CloudWatch dimension associated with an
             *   email sending metric. The name has to meet the following criteria:
             * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or
             *   dashes (-).
             * * It can contain no more than 256 characters.
             */
            public fun dimensionName(dimensionName: String)

            /**
             * @param dimensionValueSource The location where Amazon Pinpoint finds the value of a
             *   dimension to publish to Amazon CloudWatch. Acceptable values: `MESSAGE_TAG` ,
             *   `EMAIL_HEADER` , and `LINK_TAG` .
             *
             * If you want Amazon Pinpoint to use the message tags that you specify using an
             * `X-SES-MESSAGE-TAGS` header or a parameter to the `SendEmail` API, choose
             * `MESSAGE_TAG` . If you want Amazon Pinpoint to use your own email headers, choose
             * `EMAIL_HEADER` . If you want Amazon Pinpoint to use tags that are specified in your
             * links, choose `LINK_TAG` .
             */
            public fun dimensionValueSource(dimensionValueSource: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder =
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
                    .DimensionConfigurationProperty
                    .builder()

            /**
             * @param defaultDimensionValue The default value of the dimension that is published to
             *   Amazon CloudWatch if you don't provide the value of the dimension when you send an
             *   email. This value has to meet the following criteria:
             * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or
             *   dashes (-).
             * * It can contain no more than 256 characters.
             */
            override fun defaultDimensionValue(defaultDimensionValue: String) {
                cdkBuilder.defaultDimensionValue(defaultDimensionValue)
            }

            /**
             * @param dimensionName The name of an Amazon CloudWatch dimension associated with an
             *   email sending metric. The name has to meet the following criteria:
             * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or
             *   dashes (-).
             * * It can contain no more than 256 characters.
             */
            override fun dimensionName(dimensionName: String) {
                cdkBuilder.dimensionName(dimensionName)
            }

            /**
             * @param dimensionValueSource The location where Amazon Pinpoint finds the value of a
             *   dimension to publish to Amazon CloudWatch. Acceptable values: `MESSAGE_TAG` ,
             *   `EMAIL_HEADER` , and `LINK_TAG` .
             *
             * If you want Amazon Pinpoint to use the message tags that you specify using an
             * `X-SES-MESSAGE-TAGS` header or a parameter to the `SendEmail` API, choose
             * `MESSAGE_TAG` . If you want Amazon Pinpoint to use your own email headers, choose
             * `EMAIL_HEADER` . If you want Amazon Pinpoint to use tags that are specified in your
             * links, choose `LINK_TAG` .
             */
            override fun dimensionValueSource(dimensionValueSource: String) {
                cdkBuilder.dimensionValueSource(dimensionValueSource)
            }

            public fun build():
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty,
        ) : DimensionConfigurationProperty {
            /**
             * The default value of the dimension that is published to Amazon CloudWatch if you
             * don't provide the value of the dimension when you send an email.
             *
             * This value has to meet the following criteria:
             * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or
             *   dashes (-).
             * * It can contain no more than 256 characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-dimensionconfiguration.html#cfn-pinpointemail-configurationseteventdestination-dimensionconfiguration-defaultdimensionvalue)
             */
            override fun defaultDimensionValue(): String = unwrap(this).getDefaultDimensionValue()

            /**
             * The name of an Amazon CloudWatch dimension associated with an email sending metric.
             *
             * The name has to meet the following criteria:
             * * It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or
             *   dashes (-).
             * * It can contain no more than 256 characters.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-dimensionconfiguration.html#cfn-pinpointemail-configurationseteventdestination-dimensionconfiguration-dimensionname)
             */
            override fun dimensionName(): String = unwrap(this).getDimensionName()

            /**
             * The location where Amazon Pinpoint finds the value of a dimension to publish to
             * Amazon CloudWatch.
             *
             * Acceptable values: `MESSAGE_TAG` , `EMAIL_HEADER` , and `LINK_TAG` .
             *
             * If you want Amazon Pinpoint to use the message tags that you specify using an
             * `X-SES-MESSAGE-TAGS` header or a parameter to the `SendEmail` API, choose
             * `MESSAGE_TAG` . If you want Amazon Pinpoint to use your own email headers, choose
             * `EMAIL_HEADER` . If you want Amazon Pinpoint to use tags that are specified in your
             * links, choose `LINK_TAG` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-dimensionconfiguration.html#cfn-pinpointemail-configurationseteventdestination-dimensionconfiguration-dimensionvaluesource)
             */
            override fun dimensionValueSource(): String = unwrap(this).getDimensionValueSource()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): DimensionConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
            ): DimensionConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DimensionConfigurationProperty
            ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EventDestinationProperty {
        /**
         * An object that defines an Amazon CloudWatch destination for email events.
         *
         * You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-cloudwatchdestination)
         */
        public fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

        /**
         * If `true` , the event destination is enabled.
         *
         * When the event destination is enabled, the specified event types are sent to the
         * destinations in this `EventDestinationDefinition` .
         *
         * If `false` , the event destination is disabled. When the event destination is disabled,
         * events aren't sent to the specified destinations.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-enabled)
         */
        public fun enabled(): Any? = unwrap(this).getEnabled()

        /**
         * An object that defines an Amazon Kinesis Data Firehose destination for email events.
         *
         * You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon
         * S3 and Amazon Redshift.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
         */
        public fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

        /**
         * The types of events that Amazon Pinpoint sends to the specified event destinations.
         *
         * Acceptable values: `SEND` , `REJECT` , `BOUNCE` , `COMPLAINT` , `DELIVERY` , `OPEN` ,
         * `CLICK` , and `RENDERING_FAILURE` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-matchingeventtypes)
         */
        public fun matchingEventTypes(): List<String>

        /**
         * An object that defines a Amazon Pinpoint destination for email events.
         *
         * You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects. You
         * can use these attributes to create segments for your campaigns.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-pinpointdestination)
         */
        public fun pinpointDestination(): Any? = unwrap(this).getPinpointDestination()

        /**
         * An object that defines an Amazon SNS destination for email events.
         *
         * You can use Amazon SNS to send notification when certain email events occur.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-snsdestination)
         */
        public fun snsDestination(): Any? = unwrap(this).getSnsDestination()

        /** A builder for [EventDestinationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination
             *   for email events. You can use Amazon CloudWatch to monitor and gain insights on
             *   your email sending metrics.
             */
            public fun cloudWatchDestination(cloudWatchDestination: IResolvable)

            /**
             * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination
             *   for email events. You can use Amazon CloudWatch to monitor and gain insights on
             *   your email sending metrics.
             */
            public fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty)

            /**
             * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination
             *   for email events. You can use Amazon CloudWatch to monitor and gain insights on
             *   your email sending metrics.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0e9fc2a34e118e7b4387173c6059c80dd9fb77059a5287b9f9174bd77a7a6e72")
            public fun cloudWatchDestination(
                cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit
            )

            /**
             * @param enabled If `true` , the event destination is enabled. When the event
             *   destination is enabled, the specified event types are sent to the destinations in
             *   this `EventDestinationDefinition` .
             *
             * If `false` , the event destination is disabled. When the event destination is
             * disabled, events aren't sent to the specified destinations.
             */
            public fun enabled(enabled: Boolean)

            /**
             * @param enabled If `true` , the event destination is enabled. When the event
             *   destination is enabled, the specified event types are sent to the destinations in
             *   this `EventDestinationDefinition` .
             *
             * If `false` , the event destination is disabled. When the event destination is
             * disabled, events aren't sent to the specified destinations.
             */
            public fun enabled(enabled: IResolvable)

            /**
             * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data
             *   Firehose destination for email events. You can use Amazon Kinesis Data Firehose to
             *   stream data to other services, such as Amazon S3 and Amazon Redshift.
             */
            public fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable)

            /**
             * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data
             *   Firehose destination for email events. You can use Amazon Kinesis Data Firehose to
             *   stream data to other services, such as Amazon S3 and Amazon Redshift.
             */
            public fun kinesisFirehoseDestination(
                kinesisFirehoseDestination: KinesisFirehoseDestinationProperty
            )

            /**
             * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data
             *   Firehose destination for email events. You can use Amazon Kinesis Data Firehose to
             *   stream data to other services, such as Amazon S3 and Amazon Redshift.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("31ea93ea3e5b1474b2865d44f5c8a2b0672a0899216443643af185207ddb80ef")
            public fun kinesisFirehoseDestination(
                kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit
            )

            /**
             * @param matchingEventTypes The types of events that Amazon Pinpoint sends to the
             *   specified event destinations. Acceptable values: `SEND` , `REJECT` , `BOUNCE` ,
             *   `COMPLAINT` , `DELIVERY` , `OPEN` , `CLICK` , and `RENDERING_FAILURE` .
             */
            public fun matchingEventTypes(matchingEventTypes: List<String>)

            /**
             * @param matchingEventTypes The types of events that Amazon Pinpoint sends to the
             *   specified event destinations. Acceptable values: `SEND` , `REJECT` , `BOUNCE` ,
             *   `COMPLAINT` , `DELIVERY` , `OPEN` , `CLICK` , and `RENDERING_FAILURE` .
             */
            public fun matchingEventTypes(vararg matchingEventTypes: String)

            /**
             * @param pinpointDestination An object that defines a Amazon Pinpoint destination for
             *   email events. You can use Amazon Pinpoint events to create attributes in Amazon
             *   Pinpoint projects. You can use these attributes to create segments for your
             *   campaigns.
             */
            public fun pinpointDestination(pinpointDestination: IResolvable)

            /**
             * @param pinpointDestination An object that defines a Amazon Pinpoint destination for
             *   email events. You can use Amazon Pinpoint events to create attributes in Amazon
             *   Pinpoint projects. You can use these attributes to create segments for your
             *   campaigns.
             */
            public fun pinpointDestination(pinpointDestination: PinpointDestinationProperty)

            /**
             * @param pinpointDestination An object that defines a Amazon Pinpoint destination for
             *   email events. You can use Amazon Pinpoint events to create attributes in Amazon
             *   Pinpoint projects. You can use these attributes to create segments for your
             *   campaigns.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c0e72b2083e48efdc99a6df8973025d6ff6e04afe354e4fa32a0d061f585d422")
            public fun pinpointDestination(
                pinpointDestination: PinpointDestinationProperty.Builder.() -> Unit
            )

            /**
             * @param snsDestination An object that defines an Amazon SNS destination for email
             *   events. You can use Amazon SNS to send notification when certain email events
             *   occur.
             */
            public fun snsDestination(snsDestination: IResolvable)

            /**
             * @param snsDestination An object that defines an Amazon SNS destination for email
             *   events. You can use Amazon SNS to send notification when certain email events
             *   occur.
             */
            public fun snsDestination(snsDestination: SnsDestinationProperty)

            /**
             * @param snsDestination An object that defines an Amazon SNS destination for email
             *   events. You can use Amazon SNS to send notification when certain email events
             *   occur.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("591097f644de94cf4d32d59ec2837b23622eeaafd8f0508a639a95b27fc6effd")
            public fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder =
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
                    .EventDestinationProperty
                    .builder()

            /**
             * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination
             *   for email events. You can use Amazon CloudWatch to monitor and gain insights on
             *   your email sending metrics.
             */
            override fun cloudWatchDestination(cloudWatchDestination: IResolvable) {
                cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(IResolvable::unwrap))
            }

            /**
             * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination
             *   for email events. You can use Amazon CloudWatch to monitor and gain insights on
             *   your email sending metrics.
             */
            override fun cloudWatchDestination(
                cloudWatchDestination: CloudWatchDestinationProperty
            ) {
                cdkBuilder.cloudWatchDestination(
                    cloudWatchDestination.let(CloudWatchDestinationProperty::unwrap)
                )
            }

            /**
             * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination
             *   for email events. You can use Amazon CloudWatch to monitor and gain insights on
             *   your email sending metrics.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0e9fc2a34e118e7b4387173c6059c80dd9fb77059a5287b9f9174bd77a7a6e72")
            override fun cloudWatchDestination(
                cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit
            ): Unit = cloudWatchDestination(CloudWatchDestinationProperty(cloudWatchDestination))

            /**
             * @param enabled If `true` , the event destination is enabled. When the event
             *   destination is enabled, the specified event types are sent to the destinations in
             *   this `EventDestinationDefinition` .
             *
             * If `false` , the event destination is disabled. When the event destination is
             * disabled, events aren't sent to the specified destinations.
             */
            override fun enabled(enabled: Boolean) {
                cdkBuilder.enabled(enabled)
            }

            /**
             * @param enabled If `true` , the event destination is enabled. When the event
             *   destination is enabled, the specified event types are sent to the destinations in
             *   this `EventDestinationDefinition` .
             *
             * If `false` , the event destination is disabled. When the event destination is
             * disabled, events aren't sent to the specified destinations.
             */
            override fun enabled(enabled: IResolvable) {
                cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
            }

            /**
             * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data
             *   Firehose destination for email events. You can use Amazon Kinesis Data Firehose to
             *   stream data to other services, such as Amazon S3 and Amazon Redshift.
             */
            override fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable) {
                cdkBuilder.kinesisFirehoseDestination(
                    kinesisFirehoseDestination.let(IResolvable::unwrap)
                )
            }

            /**
             * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data
             *   Firehose destination for email events. You can use Amazon Kinesis Data Firehose to
             *   stream data to other services, such as Amazon S3 and Amazon Redshift.
             */
            override fun kinesisFirehoseDestination(
                kinesisFirehoseDestination: KinesisFirehoseDestinationProperty
            ) {
                cdkBuilder.kinesisFirehoseDestination(
                    kinesisFirehoseDestination.let(KinesisFirehoseDestinationProperty::unwrap)
                )
            }

            /**
             * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data
             *   Firehose destination for email events. You can use Amazon Kinesis Data Firehose to
             *   stream data to other services, such as Amazon S3 and Amazon Redshift.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("31ea93ea3e5b1474b2865d44f5c8a2b0672a0899216443643af185207ddb80ef")
            override fun kinesisFirehoseDestination(
                kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit
            ): Unit =
                kinesisFirehoseDestination(
                    KinesisFirehoseDestinationProperty(kinesisFirehoseDestination)
                )

            /**
             * @param matchingEventTypes The types of events that Amazon Pinpoint sends to the
             *   specified event destinations. Acceptable values: `SEND` , `REJECT` , `BOUNCE` ,
             *   `COMPLAINT` , `DELIVERY` , `OPEN` , `CLICK` , and `RENDERING_FAILURE` .
             */
            override fun matchingEventTypes(matchingEventTypes: List<String>) {
                cdkBuilder.matchingEventTypes(matchingEventTypes)
            }

            /**
             * @param matchingEventTypes The types of events that Amazon Pinpoint sends to the
             *   specified event destinations. Acceptable values: `SEND` , `REJECT` , `BOUNCE` ,
             *   `COMPLAINT` , `DELIVERY` , `OPEN` , `CLICK` , and `RENDERING_FAILURE` .
             */
            override fun matchingEventTypes(vararg matchingEventTypes: String): Unit =
                matchingEventTypes(matchingEventTypes.toList())

            /**
             * @param pinpointDestination An object that defines a Amazon Pinpoint destination for
             *   email events. You can use Amazon Pinpoint events to create attributes in Amazon
             *   Pinpoint projects. You can use these attributes to create segments for your
             *   campaigns.
             */
            override fun pinpointDestination(pinpointDestination: IResolvable) {
                cdkBuilder.pinpointDestination(pinpointDestination.let(IResolvable::unwrap))
            }

            /**
             * @param pinpointDestination An object that defines a Amazon Pinpoint destination for
             *   email events. You can use Amazon Pinpoint events to create attributes in Amazon
             *   Pinpoint projects. You can use these attributes to create segments for your
             *   campaigns.
             */
            override fun pinpointDestination(pinpointDestination: PinpointDestinationProperty) {
                cdkBuilder.pinpointDestination(
                    pinpointDestination.let(PinpointDestinationProperty::unwrap)
                )
            }

            /**
             * @param pinpointDestination An object that defines a Amazon Pinpoint destination for
             *   email events. You can use Amazon Pinpoint events to create attributes in Amazon
             *   Pinpoint projects. You can use these attributes to create segments for your
             *   campaigns.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c0e72b2083e48efdc99a6df8973025d6ff6e04afe354e4fa32a0d061f585d422")
            override fun pinpointDestination(
                pinpointDestination: PinpointDestinationProperty.Builder.() -> Unit
            ): Unit = pinpointDestination(PinpointDestinationProperty(pinpointDestination))

            /**
             * @param snsDestination An object that defines an Amazon SNS destination for email
             *   events. You can use Amazon SNS to send notification when certain email events
             *   occur.
             */
            override fun snsDestination(snsDestination: IResolvable) {
                cdkBuilder.snsDestination(snsDestination.let(IResolvable::unwrap))
            }

            /**
             * @param snsDestination An object that defines an Amazon SNS destination for email
             *   events. You can use Amazon SNS to send notification when certain email events
             *   occur.
             */
            override fun snsDestination(snsDestination: SnsDestinationProperty) {
                cdkBuilder.snsDestination(snsDestination.let(SnsDestinationProperty::unwrap))
            }

            /**
             * @param snsDestination An object that defines an Amazon SNS destination for email
             *   events. You can use Amazon SNS to send notification when certain email events
             *   occur.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("591097f644de94cf4d32d59ec2837b23622eeaafd8f0508a639a95b27fc6effd")
            override fun snsDestination(
                snsDestination: SnsDestinationProperty.Builder.() -> Unit
            ): Unit = snsDestination(SnsDestinationProperty(snsDestination))

            public fun build():
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty,
        ) : EventDestinationProperty {
            /**
             * An object that defines an Amazon CloudWatch destination for email events.
             *
             * You can use Amazon CloudWatch to monitor and gain insights on your email sending
             * metrics.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-cloudwatchdestination)
             */
            override fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

            /**
             * If `true` , the event destination is enabled.
             *
             * When the event destination is enabled, the specified event types are sent to the
             * destinations in this `EventDestinationDefinition` .
             *
             * If `false` , the event destination is disabled. When the event destination is
             * disabled, events aren't sent to the specified destinations.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-enabled)
             */
            override fun enabled(): Any? = unwrap(this).getEnabled()

            /**
             * An object that defines an Amazon Kinesis Data Firehose destination for email events.
             *
             * You can use Amazon Kinesis Data Firehose to stream data to other services, such as
             * Amazon S3 and Amazon Redshift.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-kinesisfirehosedestination)
             */
            override fun kinesisFirehoseDestination(): Any? =
                unwrap(this).getKinesisFirehoseDestination()

            /**
             * The types of events that Amazon Pinpoint sends to the specified event destinations.
             *
             * Acceptable values: `SEND` , `REJECT` , `BOUNCE` , `COMPLAINT` , `DELIVERY` , `OPEN` ,
             * `CLICK` , and `RENDERING_FAILURE` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-matchingeventtypes)
             */
            override fun matchingEventTypes(): List<String> = unwrap(this).getMatchingEventTypes()

            /**
             * An object that defines a Amazon Pinpoint destination for email events.
             *
             * You can use Amazon Pinpoint events to create attributes in Amazon Pinpoint projects.
             * You can use these attributes to create segments for your campaigns.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-pinpointdestination)
             */
            override fun pinpointDestination(): Any? = unwrap(this).getPinpointDestination()

            /**
             * An object that defines an Amazon SNS destination for email events.
             *
             * You can use Amazon SNS to send notification when certain email events occur.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-snsdestination)
             */
            override fun snsDestination(): Any? = unwrap(this).getSnsDestination()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EventDestinationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty
            ): EventDestinationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EventDestinationProperty
            ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SnsDestinationProperty {
        /**
         * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish email
         * events to.
         *
         * For more information about Amazon SNS topics, see the
         * [Amazon SNS Developer Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html#cfn-pinpointemail-configurationseteventdestination-snsdestination-topicarn)
         */
        public fun topicArn(): String

        /** A builder for [SnsDestinationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic that you want
             *   to publish email events to. For more information about Amazon SNS topics, see the
             *   [Amazon SNS Developer Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html)
             *   .
             */
            public fun topicArn(topicArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder =
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
                    .SnsDestinationProperty
                    .builder()

            /**
             * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic that you want
             *   to publish email events to. For more information about Amazon SNS topics, see the
             *   [Amazon SNS Developer Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html)
             *   .
             */
            override fun topicArn(topicArn: String) {
                cdkBuilder.topicArn(topicArn)
            }

            public fun build():
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty,
        ) : SnsDestinationProperty {
            /**
             * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish email
             * events to.
             *
             * For more information about Amazon SNS topics, see the
             * [Amazon SNS Developer Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html#cfn-pinpointemail-configurationseteventdestination-snsdestination-topicarn)
             */
            override fun topicArn(): String = unwrap(this).getTopicArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SnsDestinationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty
            ): SnsDestinationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SnsDestinationProperty
            ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PinpointDestinationProperty {
        /**
         * The Amazon Resource Name (ARN) of the Amazon Pinpoint project that you want to send email
         * events to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html#cfn-pinpointemail-configurationseteventdestination-pinpointdestination-applicationarn)
         */
        public fun applicationArn(): String? = unwrap(this).getApplicationArn()

        /** A builder for [PinpointDestinationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param applicationArn The Amazon Resource Name (ARN) of the Amazon Pinpoint project
             *   that you want to send email events to.
             */
            public fun applicationArn(applicationArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty.Builder =
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
                    .PinpointDestinationProperty
                    .builder()

            /**
             * @param applicationArn The Amazon Resource Name (ARN) of the Amazon Pinpoint project
             *   that you want to send email events to.
             */
            override fun applicationArn(applicationArn: String) {
                cdkBuilder.applicationArn(applicationArn)
            }

            public fun build():
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty,
        ) : PinpointDestinationProperty {
            /**
             * The Amazon Resource Name (ARN) of the Amazon Pinpoint project that you want to send
             * email events to.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html#cfn-pinpointemail-configurationseteventdestination-pinpointdestination-applicationarn)
             */
            override fun applicationArn(): String? = unwrap(this).getApplicationArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): PinpointDestinationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty
            ): PinpointDestinationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PinpointDestinationProperty
            ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CloudWatchDestinationProperty {
        /**
         * An array of objects that define the dimensions to use when you send email events to
         * Amazon CloudWatch.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-cloudwatchdestination.html#cfn-pinpointemail-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations)
         */
        public fun dimensionConfigurations(): Any? = unwrap(this).getDimensionConfigurations()

        /** A builder for [CloudWatchDestinationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param dimensionConfigurations An array of objects that define the dimensions to use
             *   when you send email events to Amazon CloudWatch.
             */
            public fun dimensionConfigurations(dimensionConfigurations: IResolvable)

            /**
             * @param dimensionConfigurations An array of objects that define the dimensions to use
             *   when you send email events to Amazon CloudWatch.
             */
            public fun dimensionConfigurations(dimensionConfigurations: List<Any>)

            /**
             * @param dimensionConfigurations An array of objects that define the dimensions to use
             *   when you send email events to Amazon CloudWatch.
             */
            public fun dimensionConfigurations(vararg dimensionConfigurations: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder =
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
                    .CloudWatchDestinationProperty
                    .builder()

            /**
             * @param dimensionConfigurations An array of objects that define the dimensions to use
             *   when you send email events to Amazon CloudWatch.
             */
            override fun dimensionConfigurations(dimensionConfigurations: IResolvable) {
                cdkBuilder.dimensionConfigurations(dimensionConfigurations.let(IResolvable::unwrap))
            }

            /**
             * @param dimensionConfigurations An array of objects that define the dimensions to use
             *   when you send email events to Amazon CloudWatch.
             */
            override fun dimensionConfigurations(dimensionConfigurations: List<Any>) {
                cdkBuilder.dimensionConfigurations(dimensionConfigurations)
            }

            /**
             * @param dimensionConfigurations An array of objects that define the dimensions to use
             *   when you send email events to Amazon CloudWatch.
             */
            override fun dimensionConfigurations(vararg dimensionConfigurations: Any): Unit =
                dimensionConfigurations(dimensionConfigurations.toList())

            public fun build():
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty,
        ) : CloudWatchDestinationProperty {
            /**
             * An array of objects that define the dimensions to use when you send email events to
             * Amazon CloudWatch.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-cloudwatchdestination.html#cfn-pinpointemail-configurationseteventdestination-cloudwatchdestination-dimensionconfigurations)
             */
            override fun dimensionConfigurations(): Any? = unwrap(this).getDimensionConfigurations()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CloudWatchDestinationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
            ): CloudWatchDestinationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CloudWatchDestinationProperty
            ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
