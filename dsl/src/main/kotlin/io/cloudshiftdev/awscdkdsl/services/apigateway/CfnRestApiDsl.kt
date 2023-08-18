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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::RestApi` resource creates a REST API.
 *
 * For more information, see
 * [restapi:create](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateRestApi.html) in the
 * *Amazon API Gateway REST API Reference* .
 *
 * On January 1, 2016, the Swagger Specification was donated to the
 * [OpenAPI initiative](https://docs.aws.amazon.com/https://www.openapis.org/) , becoming the
 * foundation of the OpenAPI Specification.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * Object body;
 * Object policy;
 * CfnRestApi cfnRestApi = CfnRestApi.Builder.create(this, "MyCfnRestApi")
 * .apiKeySourceType("apiKeySourceType")
 * .binaryMediaTypes(List.of("binaryMediaTypes"))
 * .body(body)
 * .bodyS3Location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .eTag("eTag")
 * .key("key")
 * .version("version")
 * .build())
 * .cloneFrom("cloneFrom")
 * .description("description")
 * .disableExecuteApiEndpoint(false)
 * .endpointConfiguration(EndpointConfigurationProperty.builder()
 * .types(List.of("types"))
 * .vpcEndpointIds(List.of("vpcEndpointIds"))
 * .build())
 * .failOnWarnings(false)
 * .minimumCompressionSize(123)
 * .mode("mode")
 * .name("name")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .policy(policy)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html)
 */
@CdkDslMarker
public class CfnRestApiDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRestApi.Builder = CfnRestApi.Builder.create(scope, id)

    private val _binaryMediaTypes: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Valid values are: `HEADER` to read the API key from the `X-API-Key` header of a request.
     * `AUTHORIZER` to read the API key from the `UsageIdentifierKey` from a custom authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype)
     *
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     *   plan.
     */
    public fun apiKeySourceType(apiKeySourceType: String) {
        cdkBuilder.apiKeySourceType(apiKeySourceType)
    }

    /**
     * The list of binary media types supported by the RestApi.
     *
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
     *
     * @param binaryMediaTypes The list of binary media types supported by the RestApi.
     */
    public fun binaryMediaTypes(vararg binaryMediaTypes: String) {
        _binaryMediaTypes.addAll(listOf(*binaryMediaTypes))
    }

    /**
     * The list of binary media types supported by the RestApi.
     *
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
     *
     * @param binaryMediaTypes The list of binary media types supported by the RestApi.
     */
    public fun binaryMediaTypes(binaryMediaTypes: Collection<String>) {
        _binaryMediaTypes.addAll(binaryMediaTypes)
    }

    /**
     * An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     *
     * For YAML templates, you can also provide the specification in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
     *
     * @param body An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     */
    public fun body(body: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(body)
        cdkBuilder.body(builder.map)
    }

    /**
     * An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     *
     * For YAML templates, you can also provide the specification in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
     *
     * @param body An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     */
    public fun body(body: Any) {
        cdkBuilder.body(body)
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     *
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     *   an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format.
     */
    public fun bodyS3Location(bodyS3Location: IResolvable) {
        cdkBuilder.bodyS3Location(bodyS3Location)
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     *
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     *   an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format.
     */
    public fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty) {
        cdkBuilder.bodyS3Location(bodyS3Location)
    }

    /**
     * The ID of the RestApi that you want to clone from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom)
     *
     * @param cloneFrom The ID of the RestApi that you want to clone from.
     */
    public fun cloneFrom(cloneFrom: String) {
        cdkBuilder.cloneFrom(cloneFrom)
    }

    /**
     * The description of the RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description)
     *
     * @param description The description of the RestApi.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-disableexecuteapiendpoint)
     *
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     *   default `execute-api` endpoint.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-disableexecuteapiendpoint)
     *
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     *   default `execute-api` endpoint.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     *
     * @param endpointConfiguration A list of the endpoint types of the API.
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     *
     * @param endpointConfiguration A list of the endpoint types of the API.
     */
    public fun endpointConfiguration(
        endpointConfiguration: CfnRestApi.EndpointConfigurationProperty
    ) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    /**
     * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false`
     * ) when a warning is encountered.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
     *
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     *   `true` ) or not ( `false` ) when a warning is encountered.
     */
    public fun failOnWarnings(failOnWarnings: Boolean) {
        cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false`
     * ) when a warning is encountered.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
     *
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     *   `true` ) or not ( `false` ) when a warning is encountered.
     */
    public fun failOnWarnings(failOnWarnings: IResolvable) {
        cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * A nullable integer that is used to enable compression (with non-negative between 0 and
     * 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API.
     *
     * When compression is enabled, compression or decompression is not applied on the payload if
     * the payload size is smaller than this value. Setting it to zero allows compression for any
     * payload size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize)
     *
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     *   non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a
     *   null value) on an API.
     */
    public fun minimumCompressionSize(minimumCompressionSize: Number) {
        cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    /**
     * This property applies only when you use OpenAPI to define your REST API.
     *
     * The `Mode` determines how API Gateway handles resource updates.
     *
     * Valid values are `overwrite` or `merge` .
     *
     * For `overwrite` , the new API definition replaces the existing one. The existing API
     * identifier remains unchanged.
     *
     * For `merge` , the new API definition is merged with the existing API.
     *
     * If you don't specify this property, a default value is chosen. For REST APIs created before
     * March 29, 2021, the default is `overwrite` . For REST APIs created after March 29, 2021, the
     * new API definition takes precedence, but any container types such as endpoint configurations
     * and binary media types are merged with the existing API.
     *
     * Use the default mode to define top-level `RestApi` properties in addition to using OpenAPI.
     * Generally, it's preferred to use API Gateway's OpenAPI extensions to model these properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-mode)
     *
     * @param mode This property applies only when you use OpenAPI to define your REST API.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * The name of the RestApi.
     *
     * A name is required if the REST API is not based on an OpenAPI specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name)
     *
     * @param name The name of the RestApi.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Custom header parameters as part of the request.
     *
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway import-rest-api
     * --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
     *
     * @param parameters Custom header parameters as part of the request.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * Custom header parameters as part of the request.
     *
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway import-rest-api
     * --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
     *
     * @param parameters Custom header parameters as part of the request.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * A policy document that contains the permissions for the `RestApi` resource.
     *
     * To set the ARN for the policy, use the `!Join` intrinsic function with `""` as delimiter and
     * values of `"execute-api:/"` and `"*"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
     *
     * @param policy A policy document that contains the permissions for the `RestApi` resource.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * A policy document that contains the permissions for the `RestApi` resource.
     *
     * To set the ARN for the policy, use the `!Join` intrinsic function with `""` as delimiter and
     * values of `"execute-api:/"` and `"*"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
     *
     * @param policy A policy document that contains the permissions for the `RestApi` resource.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-tags)
     *
     * @param tags The key-value map of strings.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-tags)
     *
     * @param tags The key-value map of strings.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRestApi {
        if (_binaryMediaTypes.isNotEmpty()) cdkBuilder.binaryMediaTypes(_binaryMediaTypes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
