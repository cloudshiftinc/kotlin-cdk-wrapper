package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApiMapping
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiMapping,
) : CfnResource(cdkObject), IInspectable {
    /** The API identifier. */
    public open fun apiId(): String = unwrap(this).getApiId()

    /** The API identifier. */
    public open fun apiId(`value`: String) {
        unwrap(this).setApiId(`value`)
    }

    /** The API mapping key. */
    public open fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

    /** The API mapping key. */
    public open fun apiMappingKey(`value`: String) {
        unwrap(this).setApiMappingKey(`value`)
    }

    /** The API mapping resource ID. */
    public open fun attrApiMappingId(): String = unwrap(this).getAttrApiMappingId()

    /** The domain name. */
    public open fun domainName(): String = unwrap(this).getDomainName()

    /** The domain name. */
    public open fun domainName(`value`: String) {
        unwrap(this).setDomainName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The API stage. */
    public open fun stage(): String = unwrap(this).getStage()

    /** The API stage. */
    public open fun stage(`value`: String) {
        unwrap(this).setStage(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnApiMapping]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The API identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apiid)
         *
         * @param apiId The API identifier.
         */
        public fun apiId(apiId: String)

        /**
         * The API mapping key.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apimappingkey)
         *
         * @param apiMappingKey The API mapping key.
         */
        public fun apiMappingKey(apiMappingKey: String)

        /**
         * The domain name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-domainname)
         *
         * @param domainName The domain name.
         */
        public fun domainName(domainName: String)

        /**
         * The API stage.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-stage)
         *
         * @param stage The API stage.
         */
        public fun stage(stage: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnApiMapping.Builder =
            software.amazon.awscdk.services.apigatewayv2.CfnApiMapping.Builder.create(scope, id)

        /**
         * The API identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apiid)
         *
         * @param apiId The API identifier.
         */
        override fun apiId(apiId: String) {
            cdkBuilder.apiId(apiId)
        }

        /**
         * The API mapping key.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apimappingkey)
         *
         * @param apiMappingKey The API mapping key.
         */
        override fun apiMappingKey(apiMappingKey: String) {
            cdkBuilder.apiMappingKey(apiMappingKey)
        }

        /**
         * The domain name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-domainname)
         *
         * @param domainName The domain name.
         */
        override fun domainName(domainName: String) {
            cdkBuilder.domainName(domainName)
        }

        /**
         * The API stage.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-stage)
         *
         * @param stage The API stage.
         */
        override fun stage(stage: String) {
            cdkBuilder.stage(stage)
        }

        public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApiMapping =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnApiMapping {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnApiMapping(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiMapping
        ): CfnApiMapping = CfnApiMapping(cdkObject)

        internal fun unwrap(
            wrapped: CfnApiMapping
        ): software.amazon.awscdk.services.apigatewayv2.CfnApiMapping = wrapped.cdkObject
    }
}
