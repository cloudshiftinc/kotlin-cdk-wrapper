package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIntegrationResponse
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse,
) : CfnResource(cdkObject), IInspectable {
    /** The API identifier. */
    public open fun apiId(): String = unwrap(this).getApiId()

    /** The API identifier. */
    public open fun apiId(`value`: String) {
        unwrap(this).setApiId(`value`)
    }

    /** The integration response ID. */
    public open fun attrIntegrationResponseId(): String =
        unwrap(this).getAttrIntegrationResponseId()

    /** Supported only for WebSocket APIs. */
    public open fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

    /** Supported only for WebSocket APIs. */
    public open fun contentHandlingStrategy(`value`: String) {
        unwrap(this).setContentHandlingStrategy(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The integration ID. */
    public open fun integrationId(): String = unwrap(this).getIntegrationId()

    /** The integration ID. */
    public open fun integrationId(`value`: String) {
        unwrap(this).setIntegrationId(`value`)
    }

    /** The integration response key. */
    public open fun integrationResponseKey(): String = unwrap(this).getIntegrationResponseKey()

    /** The integration response key. */
    public open fun integrationResponseKey(`value`: String) {
        unwrap(this).setIntegrationResponseKey(`value`)
    }

    /**
     * A key-value map specifying response parameters that are passed to the method response from
     * the backend.
     */
    public open fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    /**
     * A key-value map specifying response parameters that are passed to the method response from
     * the backend.
     */
    public open fun responseParameters(`value`: Any) {
        unwrap(this).setResponseParameters(`value`)
    }

    /**
     * The collection of response templates for the integration response as a string-to-string map
     * of key-value pairs.
     */
    public open fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

    /**
     * The collection of response templates for the integration response as a string-to-string map
     * of key-value pairs.
     */
    public open fun responseTemplates(`value`: Any) {
        unwrap(this).setResponseTemplates(`value`)
    }

    /** The template selection expression for the integration response. */
    public open fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()

    /** The template selection expression for the integration response. */
    public open fun templateSelectionExpression(`value`: String) {
        unwrap(this).setTemplateSelectionExpression(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnIntegrationResponse].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The API identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-apiid)
         *
         * @param apiId The API identifier.
         */
        public fun apiId(apiId: String)

        /**
         * Supported only for WebSocket APIs.
         *
         * Specifies how to handle response payload content type conversions. Supported values are
         * `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following behaviors:
         *
         * `CONVERT_TO_BINARY` : Converts a response payload from a Base64-encoded string to the
         * corresponding binary blob.
         *
         * `CONVERT_TO_TEXT` : Converts a response payload from a binary blob to a Base64-encoded
         * string.
         *
         * If this property is not defined, the response payload will be passed through from the
         * integration response to the route response or method response without modification.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-contenthandlingstrategy)
         *
         * @param contentHandlingStrategy Supported only for WebSocket APIs.
         */
        public fun contentHandlingStrategy(contentHandlingStrategy: String)

        /**
         * The integration ID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationid)
         *
         * @param integrationId The integration ID.
         */
        public fun integrationId(integrationId: String)

        /**
         * The integration response key.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationresponsekey)
         *
         * @param integrationResponseKey The integration response key.
         */
        public fun integrationResponseKey(integrationResponseKey: String)

        /**
         * A key-value map specifying response parameters that are passed to the method response
         * from the backend.
         *
         * The key is a method response header parameter name and the mapped value is an integration
         * response header value, a static value enclosed within a pair of single quotes, or a JSON
         * expression from the integration response body. The mapping key must match the pattern of
         * `method.response.header. *{name}*` , where name is a valid and unique header name. The
         * mapped non-static value must match the pattern of `integration.response.header. *{name}*`
         * or `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and
         * unique response header name and `*{JSON-expression}*` is a valid JSON expression without
         * the `$` prefix.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responseparameters)
         *
         * @param responseParameters A key-value map specifying response parameters that are passed
         *   to the method response from the backend.
         */
        public fun responseParameters(responseParameters: Any)

        /**
         * The collection of response templates for the integration response as a string-to-string
         * map of key-value pairs.
         *
         * Response templates are represented as a key/value map, with a content-type as the key and
         * a template as the value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responsetemplates)
         *
         * @param responseTemplates The collection of response templates for the integration
         *   response as a string-to-string map of key-value pairs.
         */
        public fun responseTemplates(responseTemplates: Any)

        /**
         * The template selection expression for the integration response.
         *
         * Supported only for WebSocket APIs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-templateselectionexpression)
         *
         * @param templateSelectionExpression The template selection expression for the integration
         *   response.
         */
        public fun templateSelectionExpression(templateSelectionExpression: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse.Builder =
            software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse.Builder.create(
                scope,
                id
            )

        /**
         * The API identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-apiid)
         *
         * @param apiId The API identifier.
         */
        override fun apiId(apiId: String) {
            cdkBuilder.apiId(apiId)
        }

        /**
         * Supported only for WebSocket APIs.
         *
         * Specifies how to handle response payload content type conversions. Supported values are
         * `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following behaviors:
         *
         * `CONVERT_TO_BINARY` : Converts a response payload from a Base64-encoded string to the
         * corresponding binary blob.
         *
         * `CONVERT_TO_TEXT` : Converts a response payload from a binary blob to a Base64-encoded
         * string.
         *
         * If this property is not defined, the response payload will be passed through from the
         * integration response to the route response or method response without modification.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-contenthandlingstrategy)
         *
         * @param contentHandlingStrategy Supported only for WebSocket APIs.
         */
        override fun contentHandlingStrategy(contentHandlingStrategy: String) {
            cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
        }

        /**
         * The integration ID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationid)
         *
         * @param integrationId The integration ID.
         */
        override fun integrationId(integrationId: String) {
            cdkBuilder.integrationId(integrationId)
        }

        /**
         * The integration response key.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-integrationresponsekey)
         *
         * @param integrationResponseKey The integration response key.
         */
        override fun integrationResponseKey(integrationResponseKey: String) {
            cdkBuilder.integrationResponseKey(integrationResponseKey)
        }

        /**
         * A key-value map specifying response parameters that are passed to the method response
         * from the backend.
         *
         * The key is a method response header parameter name and the mapped value is an integration
         * response header value, a static value enclosed within a pair of single quotes, or a JSON
         * expression from the integration response body. The mapping key must match the pattern of
         * `method.response.header. *{name}*` , where name is a valid and unique header name. The
         * mapped non-static value must match the pattern of `integration.response.header. *{name}*`
         * or `integration.response.body. *{JSON-expression}*` , where `*{name}*` is a valid and
         * unique response header name and `*{JSON-expression}*` is a valid JSON expression without
         * the `$` prefix.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responseparameters)
         *
         * @param responseParameters A key-value map specifying response parameters that are passed
         *   to the method response from the backend.
         */
        override fun responseParameters(responseParameters: Any) {
            cdkBuilder.responseParameters(responseParameters)
        }

        /**
         * The collection of response templates for the integration response as a string-to-string
         * map of key-value pairs.
         *
         * Response templates are represented as a key/value map, with a content-type as the key and
         * a template as the value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-responsetemplates)
         *
         * @param responseTemplates The collection of response templates for the integration
         *   response as a string-to-string map of key-value pairs.
         */
        override fun responseTemplates(responseTemplates: Any) {
            cdkBuilder.responseTemplates(responseTemplates)
        }

        /**
         * The template selection expression for the integration response.
         *
         * Supported only for WebSocket APIs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html#cfn-apigatewayv2-integrationresponse-templateselectionexpression)
         *
         * @param templateSelectionExpression The template selection expression for the integration
         *   response.
         */
        override fun templateSelectionExpression(templateSelectionExpression: String) {
            cdkBuilder.templateSelectionExpression(templateSelectionExpression)
        }

        public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnIntegrationResponse {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnIntegrationResponse(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse
        ): CfnIntegrationResponse = CfnIntegrationResponse(cdkObject)

        internal fun unwrap(
            wrapped: CfnIntegrationResponse
        ): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse = wrapped.cdkObject
    }
}
