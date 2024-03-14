package io.cloudshiftdev.awscdk.services.kinesisanalytics

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

public open class CfnApplicationCloudWatchLoggingOptionV2
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2,
) : CfnResource(cdkObject), IInspectable {
    /** The name of the application. */
    public open fun applicationName(): String = unwrap(this).getApplicationName()

    /** The name of the application. */
    public open fun applicationName(`value`: String) {
        unwrap(this).setApplicationName(`value`)
    }

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     */
    public open fun cloudWatchLoggingOption(): Any = unwrap(this).getCloudWatchLoggingOption()

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     */
    public open fun cloudWatchLoggingOption(`value`: IResolvable) {
        unwrap(this).setCloudWatchLoggingOption(`value`.let(IResolvable::unwrap))
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     */
    public open fun cloudWatchLoggingOption(`value`: CloudWatchLoggingOptionProperty) {
        unwrap(this)
            .setCloudWatchLoggingOption(`value`.let(CloudWatchLoggingOptionProperty::unwrap))
    }

    /**
     * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
     * Resource Name (ARN).
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1280b0197e04c126267b3a7ddef5bf3146db41870a6a927dcb6e368f38c0cb6")
    public open fun cloudWatchLoggingOption(
        `value`: CloudWatchLoggingOptionProperty.Builder.() -> Unit
    ): Unit = cloudWatchLoggingOption(CloudWatchLoggingOptionProperty(`value`))

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
     * [io.cloudshiftdev.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname)
         *
         * @param applicationName The name of the application.
         */
        public fun applicationName(applicationName: String)

        /**
         * Provides a description of Amazon CloudWatch logging options, including the log stream
         * Amazon Resource Name (ARN).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
         *
         * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging
         *   options, including the log stream Amazon Resource Name (ARN).
         */
        public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable)

        /**
         * Provides a description of Amazon CloudWatch logging options, including the log stream
         * Amazon Resource Name (ARN).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
         *
         * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging
         *   options, including the log stream Amazon Resource Name (ARN).
         */
        public fun cloudWatchLoggingOption(cloudWatchLoggingOption: CloudWatchLoggingOptionProperty)

        /**
         * Provides a description of Amazon CloudWatch logging options, including the log stream
         * Amazon Resource Name (ARN).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
         *
         * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging
         *   options, including the log stream Amazon Resource Name (ARN).
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("cceefcbc4f18947a4a912638e5b148ebafa6ffc046b692d4af604efad5c68be8")
        public fun cloudWatchLoggingOption(
            cloudWatchLoggingOption: CloudWatchLoggingOptionProperty.Builder.() -> Unit
        )
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.Builder =
            software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
                .Builder
                .create(scope, id)

        /**
         * The name of the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname)
         *
         * @param applicationName The name of the application.
         */
        override fun applicationName(applicationName: String) {
            cdkBuilder.applicationName(applicationName)
        }

        /**
         * Provides a description of Amazon CloudWatch logging options, including the log stream
         * Amazon Resource Name (ARN).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
         *
         * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging
         *   options, including the log stream Amazon Resource Name (ARN).
         */
        override fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
            cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption.let(IResolvable::unwrap))
        }

        /**
         * Provides a description of Amazon CloudWatch logging options, including the log stream
         * Amazon Resource Name (ARN).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
         *
         * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging
         *   options, including the log stream Amazon Resource Name (ARN).
         */
        override fun cloudWatchLoggingOption(
            cloudWatchLoggingOption: CloudWatchLoggingOptionProperty
        ) {
            cdkBuilder.cloudWatchLoggingOption(
                cloudWatchLoggingOption.let(CloudWatchLoggingOptionProperty::unwrap)
            )
        }

        /**
         * Provides a description of Amazon CloudWatch logging options, including the log stream
         * Amazon Resource Name (ARN).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption)
         *
         * @param cloudWatchLoggingOption Provides a description of Amazon CloudWatch logging
         *   options, including the log stream Amazon Resource Name (ARN).
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("cceefcbc4f18947a4a912638e5b148ebafa6ffc046b692d4af604efad5c68be8")
        override fun cloudWatchLoggingOption(
            cloudWatchLoggingOption: CloudWatchLoggingOptionProperty.Builder.() -> Unit
        ): Unit = cloudWatchLoggingOption(CloudWatchLoggingOptionProperty(cloudWatchLoggingOption))

        public fun build():
            software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnApplicationCloudWatchLoggingOptionV2 {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnApplicationCloudWatchLoggingOptionV2(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
        ): CfnApplicationCloudWatchLoggingOptionV2 =
            CfnApplicationCloudWatchLoggingOptionV2(cdkObject)

        internal fun unwrap(
            wrapped: CfnApplicationCloudWatchLoggingOptionV2
        ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 =
            wrapped.cdkObject
    }

    public interface CloudWatchLoggingOptionProperty {
        /**
         * The ARN of the CloudWatch log to receive application messages.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption-logstreamarn)
         */
        public fun logStreamArn(): String

        /** A builder for [CloudWatchLoggingOptionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param logStreamArn The ARN of the CloudWatch log to receive application messages.
             */
            public fun logStreamArn(logStreamArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty.Builder =
                software.amazon.awscdk.services.kinesisanalytics
                    .CfnApplicationCloudWatchLoggingOptionV2
                    .CloudWatchLoggingOptionProperty
                    .builder()

            /**
             * @param logStreamArn The ARN of the CloudWatch log to receive application messages.
             */
            override fun logStreamArn(logStreamArn: String) {
                cdkBuilder.logStreamArn(logStreamArn)
            }

            public fun build():
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty,
        ) : CloudWatchLoggingOptionProperty {
            /**
             * The ARN of the CloudWatch log to receive application messages.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption-logstreamarn)
             */
            override fun logStreamArn(): String = unwrap(this).getLogStreamArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CloudWatchLoggingOptionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty
            ): CloudWatchLoggingOptionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CloudWatchLoggingOptionProperty
            ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
