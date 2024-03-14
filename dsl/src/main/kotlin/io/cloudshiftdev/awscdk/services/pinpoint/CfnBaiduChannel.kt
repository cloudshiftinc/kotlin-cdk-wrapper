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

public open class CfnBaiduChannel
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnBaiduChannel,
) : CfnResource(cdkObject), IInspectable {
    /**
     * The API key that you received from the Baidu Cloud Push service to communicate with the
     * service.
     */
    public open fun apiKey(): String = unwrap(this).getApiKey()

    /**
     * The API key that you received from the Baidu Cloud Push service to communicate with the
     * service.
     */
    public open fun apiKey(`value`: String) {
        unwrap(this).setApiKey(`value`)
    }

    /**
     * The unique identifier for the Amazon Pinpoint application that you're configuring the Baidu
     * channel for.
     */
    public open fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The unique identifier for the Amazon Pinpoint application that you're configuring the Baidu
     * channel for.
     */
    public open fun applicationId(`value`: String) {
        unwrap(this).setApplicationId(`value`)
    }

    /**
     * (Deprecated) An identifier for the Baidu channel.
     *
     * This property is retained only for backward compatibility.
     */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** Specifies whether to enable the Baidu channel for the application. */
    public open fun enabled(): Any? = unwrap(this).getEnabled()

    /** Specifies whether to enable the Baidu channel for the application. */
    public open fun enabled(`value`: Boolean) {
        unwrap(this).setEnabled(`value`)
    }

    /** Specifies whether to enable the Baidu channel for the application. */
    public open fun enabled(`value`: IResolvable) {
        unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
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
     * The secret key that you received from the Baidu Cloud Push service to communicate with the
     * service.
     */
    public open fun secretKey(): String = unwrap(this).getSecretKey()

    /**
     * The secret key that you received from the Baidu Cloud Push service to communicate with the
     * service.
     */
    public open fun secretKey(`value`: String) {
        unwrap(this).setSecretKey(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnBaiduChannel]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The API key that you received from the Baidu Cloud Push service to communicate with the
         * service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-apikey)
         *
         * @param apiKey The API key that you received from the Baidu Cloud Push service to
         *   communicate with the service.
         */
        public fun apiKey(apiKey: String)

        /**
         * The unique identifier for the Amazon Pinpoint application that you're configuring the
         * Baidu channel for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-applicationid)
         *
         * @param applicationId The unique identifier for the Amazon Pinpoint application that
         *   you're configuring the Baidu channel for.
         */
        public fun applicationId(applicationId: String)

        /**
         * Specifies whether to enable the Baidu channel for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
         *
         * @param enabled Specifies whether to enable the Baidu channel for the application.
         */
        public fun enabled(enabled: Boolean)

        /**
         * Specifies whether to enable the Baidu channel for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
         *
         * @param enabled Specifies whether to enable the Baidu channel for the application.
         */
        public fun enabled(enabled: IResolvable)

        /**
         * The secret key that you received from the Baidu Cloud Push service to communicate with
         * the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-secretkey)
         *
         * @param secretKey The secret key that you received from the Baidu Cloud Push service to
         *   communicate with the service.
         */
        public fun secretKey(secretKey: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnBaiduChannel.Builder =
            software.amazon.awscdk.services.pinpoint.CfnBaiduChannel.Builder.create(scope, id)

        /**
         * The API key that you received from the Baidu Cloud Push service to communicate with the
         * service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-apikey)
         *
         * @param apiKey The API key that you received from the Baidu Cloud Push service to
         *   communicate with the service.
         */
        override fun apiKey(apiKey: String) {
            cdkBuilder.apiKey(apiKey)
        }

        /**
         * The unique identifier for the Amazon Pinpoint application that you're configuring the
         * Baidu channel for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-applicationid)
         *
         * @param applicationId The unique identifier for the Amazon Pinpoint application that
         *   you're configuring the Baidu channel for.
         */
        override fun applicationId(applicationId: String) {
            cdkBuilder.applicationId(applicationId)
        }

        /**
         * Specifies whether to enable the Baidu channel for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
         *
         * @param enabled Specifies whether to enable the Baidu channel for the application.
         */
        override fun enabled(enabled: Boolean) {
            cdkBuilder.enabled(enabled)
        }

        /**
         * Specifies whether to enable the Baidu channel for the application.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
         *
         * @param enabled Specifies whether to enable the Baidu channel for the application.
         */
        override fun enabled(enabled: IResolvable) {
            cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
        }

        /**
         * The secret key that you received from the Baidu Cloud Push service to communicate with
         * the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-secretkey)
         *
         * @param secretKey The secret key that you received from the Baidu Cloud Push service to
         *   communicate with the service.
         */
        override fun secretKey(secretKey: String) {
            cdkBuilder.secretKey(secretKey)
        }

        public fun build(): software.amazon.awscdk.services.pinpoint.CfnBaiduChannel =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnBaiduChannel {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnBaiduChannel(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
        ): CfnBaiduChannel = CfnBaiduChannel(cdkObject)

        internal fun unwrap(
            wrapped: CfnBaiduChannel
        ): software.amazon.awscdk.services.pinpoint.CfnBaiduChannel = wrapped.cdkObject
    }
}
