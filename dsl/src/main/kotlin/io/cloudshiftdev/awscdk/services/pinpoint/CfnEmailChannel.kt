package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEmailChannel
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailChannel,
) : CfnResource(cdkObject), IInspectable {
    /**
     * The unique identifier for the Amazon Pinpoint application that you're specifying the email
     * channel for.
     */
    public open fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The unique identifier for the Amazon Pinpoint application that you're specifying the email
     * channel for.
     */
    public open fun applicationId(`value`: String) {
        unwrap(this).setApplicationId(`value`)
    }

    /**
     * (Deprecated) An identifier for the email channel.
     *
     * This property is retained only for backward compatibility.
     */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * The
     * [Amazon SES configuration set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html)
     * that you want to apply to messages that you send through the channel.
     */
    public open fun configurationSet(): String? = unwrap(this).getConfigurationSet()

    /**
     * The
     * [Amazon SES configuration set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html)
     * that you want to apply to messages that you send through the channel.
     */
    public open fun configurationSet(`value`: String) {
        unwrap(this).setConfigurationSet(`value`)
    }

    /** Specifies whether to enable the email channel for the application. */
    public open fun enabled(): Any? = unwrap(this).getEnabled()

    /** Specifies whether to enable the email channel for the application. */
    public open fun enabled(`value`: Boolean) {
        unwrap(this).setEnabled(`value`)
    }

    /** Specifies whether to enable the email channel for the application. */
    public open fun enabled(`value`: IResolvable) {
        unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
    }

    /**
     * The verified email address that you want to send email from when you send email through the
     * channel.
     */
    public open fun fromAddress(): String = unwrap(this).getFromAddress()

    /**
     * The verified email address that you want to send email from when you send email through the
     * channel.
     */
    public open fun fromAddress(`value`: String) {
        unwrap(this).setFromAddress(`value`)
    }

    /**
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service
     * (Amazon SES), that you want to use when you send email through the channel.
     */
    public open fun identity(): String = unwrap(this).getIdentity()

    /**
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service
     * (Amazon SES), that you want to use when you send email through the channel.
     */
    public open fun identity(`value`: String) {
        unwrap(this).setIdentity(`value`)
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
     * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to
     * use when it submits email-related event data for the channel.
     */
    public open fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to
     * use when it submits email-related event data for the channel.
     */
    public open fun roleArn(`value`: String) {
        unwrap(this).setRoleArn(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnEmailChannel]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The unique identifier for the Amazon Pinpoint application that you're specifying the
         * email channel for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-applicationid)
         *
         * @param applicationId The unique identifier for the Amazon Pinpoint application that
         *   you're specifying the email channel for.
         */
        public fun applicationId(applicationId: String)

        /**
         * The
         * [Amazon SES configuration set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html)
         * that you want to apply to messages that you send through the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-configurationset)
         *
         * @param configurationSet The
         *   [Amazon SES configuration set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html)
         *   that you want to apply to messages that you send through the channel.
         */
        public fun configurationSet(configurationSet: String)

        /**
         * Specifies whether to enable the email channel for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-enabled)
         *
         * @param enabled Specifies whether to enable the email channel for the application.
         */
        public fun enabled(enabled: Boolean)

        /**
         * Specifies whether to enable the email channel for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-enabled)
         *
         * @param enabled Specifies whether to enable the email channel for the application.
         */
        public fun enabled(enabled: IResolvable)

        /**
         * The verified email address that you want to send email from when you send email through
         * the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-fromaddress)
         *
         * @param fromAddress The verified email address that you want to send email from when you
         *   send email through the channel.
         */
        public fun fromAddress(fromAddress: String)

        /**
         * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service
         * (Amazon SES), that you want to use when you send email through the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-identity)
         *
         * @param identity The Amazon Resource Name (ARN) of the identity, verified with Amazon
         *   Simple Email Service (Amazon SES), that you want to use when you send email through the
         *   channel.
         */
        public fun identity(identity: String)

        /**
         * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon
         * Pinpoint to use when it submits email-related event data for the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-rolearn)
         *
         * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that you want
         *   Amazon Pinpoint to use when it submits email-related event data for the channel.
         */
        public fun roleArn(roleArn: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEmailChannel.Builder =
            software.amazon.awscdk.services.pinpoint.CfnEmailChannel.Builder.create(scope, id)

        /**
         * The unique identifier for the Amazon Pinpoint application that you're specifying the
         * email channel for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-applicationid)
         *
         * @param applicationId The unique identifier for the Amazon Pinpoint application that
         *   you're specifying the email channel for.
         */
        override fun applicationId(applicationId: String) {
            cdkBuilder.applicationId(applicationId)
        }

        /**
         * The
         * [Amazon SES configuration set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html)
         * that you want to apply to messages that you send through the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-configurationset)
         *
         * @param configurationSet The
         *   [Amazon SES configuration set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html)
         *   that you want to apply to messages that you send through the channel.
         */
        override fun configurationSet(configurationSet: String) {
            cdkBuilder.configurationSet(configurationSet)
        }

        /**
         * Specifies whether to enable the email channel for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-enabled)
         *
         * @param enabled Specifies whether to enable the email channel for the application.
         */
        override fun enabled(enabled: Boolean) {
            cdkBuilder.enabled(enabled)
        }

        /**
         * Specifies whether to enable the email channel for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-enabled)
         *
         * @param enabled Specifies whether to enable the email channel for the application.
         */
        override fun enabled(enabled: IResolvable) {
            cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
        }

        /**
         * The verified email address that you want to send email from when you send email through
         * the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-fromaddress)
         *
         * @param fromAddress The verified email address that you want to send email from when you
         *   send email through the channel.
         */
        override fun fromAddress(fromAddress: String) {
            cdkBuilder.fromAddress(fromAddress)
        }

        /**
         * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service
         * (Amazon SES), that you want to use when you send email through the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-identity)
         *
         * @param identity The Amazon Resource Name (ARN) of the identity, verified with Amazon
         *   Simple Email Service (Amazon SES), that you want to use when you send email through the
         *   channel.
         */
        override fun identity(identity: String) {
            cdkBuilder.identity(identity)
        }

        /**
         * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon
         * Pinpoint to use when it submits email-related event data for the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-rolearn)
         *
         * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that you want
         *   Amazon Pinpoint to use when it submits email-related event data for the channel.
         */
        override fun roleArn(roleArn: String) {
            cdkBuilder.roleArn(roleArn)
        }

        public fun build(): software.amazon.awscdk.services.pinpoint.CfnEmailChannel =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnEmailChannel {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnEmailChannel(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailChannel
        ): CfnEmailChannel = CfnEmailChannel(cdkObject)

        internal fun unwrap(
            wrapped: CfnEmailChannel
        ): software.amazon.awscdk.services.pinpoint.CfnEmailChannel = wrapped.cdkObject
    }
}
