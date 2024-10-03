@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRestApi`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * Object body;
 * Object policy;
 * CfnRestApiProps cfnRestApiProps = CfnRestApiProps.builder()
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
public interface CfnRestApiProps {
  /**
   * The source of the API key for metering requests according to a usage plan.
   *
   * Valid values are: `HEADER` to read the API key from the `X-API-Key` header of a request.
   * `AUTHORIZER` to read the API key from the `UsageIdentifierKey` from a custom authorizer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype)
   */
  public fun apiKeySourceType(): String? = unwrap(this).getApiKeySourceType()

  /**
   * The list of binary media types supported by the RestApi.
   *
   * By default, the RestApi supports only UTF-8-encoded text payloads.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
   */
  public fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?: emptyList()

  /**
   * An OpenAPI specification that defines a set of RESTful APIs in JSON format.
   *
   * For YAML templates, you can also provide the specification in YAML format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
   */
  public fun body(): Any? = unwrap(this).getBody()

  /**
   * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
   * defines a set of RESTful APIs in JSON or YAML format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
   */
  public fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

  /**
   * The ID of the RestApi that you want to clone from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom)
   */
  public fun cloneFrom(): String? = unwrap(this).getCloneFrom()

  /**
   * The description of the RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   *
   * By default, clients can invoke your API with the default
   * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
   * custom domain name to invoke your API, disable the default endpoint
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-disableexecuteapiendpoint)
   */
  public fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * A list of the endpoint types of the API.
   *
   * Use this property when creating an API. When importing an existing API, specify the endpoint
   * configuration types using the `Parameters` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
   */
  public fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  /**
   * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false` )
   * when a warning is encountered.
   *
   * The default value is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
   */
  public fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  /**
   * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760
   * (10M) bytes, inclusive) or disable compression (with a null value) on an API.
   *
   * When compression is enabled, compression or decompression is not applied on the payload if the
   * payload size is smaller than this value. Setting it to zero allows compression for any payload
   * size.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize)
   */
  public fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  /**
   * This property applies only when you use OpenAPI to define your REST API.
   *
   * The `Mode` determines how API Gateway handles resource updates.
   *
   * Valid values are `overwrite` or `merge` .
   *
   * For `overwrite` , the new API definition replaces the existing one. The existing API identifier
   * remains unchanged.
   *
   * For `merge` , the new API definition is merged with the existing API.
   *
   * If you don't specify this property, a default value is chosen. For REST APIs created before
   * March 29, 2021, the default is `overwrite` . For REST APIs created after March 29, 2021, the new
   * API definition takes precedence, but any container types such as endpoint configurations and
   * binary media types are merged with the existing API.
   *
   * Use the default mode to define top-level `RestApi` properties in addition to using OpenAPI.
   * Generally, it's preferred to use API Gateway's OpenAPI extensions to model these properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-mode)
   */
  public fun mode(): String? = unwrap(this).getMode()

  /**
   * The name of the RestApi.
   *
   * A name is required if the REST API is not based on an OpenAPI specification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Custom header parameters as part of the request.
   *
   * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation` as
   * a `parameters` value, as in the AWS CLI command of `aws apigateway import-rest-api --parameters
   * ignore=documentation --body 'file:///path/to/imported-api-body.json'` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * A policy document that contains the permissions for the `RestApi` resource.
   *
   * To set the ARN for the policy, use the `!Join` intrinsic function with `""` as delimiter and
   * values of `"execute-api:/"` and `"*"` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
   */
  public fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * The key-value map of strings.
   *
   * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
   * not start with `aws:` . The tag value can be up to 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRestApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan.
     * Valid values are: `HEADER` to read the API key from the `X-API-Key` header of a request.
     * `AUTHORIZER` to read the API key from the `UsageIdentifierKey` from a custom authorizer.
     */
    public fun apiKeySourceType(apiKeySourceType: String)

    /**
     * @param binaryMediaTypes The list of binary media types supported by the RestApi.
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     */
    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    /**
     * @param binaryMediaTypes The list of binary media types supported by the RestApi.
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     */
    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    /**
     * @param body An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     * For YAML templates, you can also provide the specification in YAML format.
     */
    public fun body(body: Any)

    /**
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format.
     */
    public fun bodyS3Location(bodyS3Location: IResolvable)

    /**
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format.
     */
    public fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty)

    /**
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a8263dd88d28eb60a198223d77321eae4d5fc4f96def26f35362c5e65ed4b1b")
    public fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param cloneFrom The ID of the RestApi that you want to clone from.
     */
    public fun cloneFrom(cloneFrom: String)

    /**
     * @param description The description of the RestApi.
     */
    public fun description(description: String)

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint.
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint.
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    /**
     * @param endpointConfiguration A list of the endpoint types of the API.
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    /**
     * @param endpointConfiguration A list of the endpoint types of the API.
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     */
    public
        fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty)

    /**
     * @param endpointConfiguration A list of the endpoint types of the API.
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00adf3cad9b409f91bdee38d4f666be552ca9838cbdc179ef66c4ad481401e4d")
    public
        fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty.Builder.() -> Unit)

    /**
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     * `true` ) or not ( `false` ) when a warning is encountered.
     * The default value is `false` .
     */
    public fun failOnWarnings(failOnWarnings: Boolean)

    /**
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     * `true` ) or not ( `false` ) when a warning is encountered.
     * The default value is `false` .
     */
    public fun failOnWarnings(failOnWarnings: IResolvable)

    /**
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null
     * value) on an API.
     * When compression is enabled, compression or decompression is not applied on the payload if
     * the payload size is smaller than this value. Setting it to zero allows compression for any
     * payload size.
     */
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    /**
     * @param mode This property applies only when you use OpenAPI to define your REST API.
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
     * March 29, 2021, the default is `overwrite` . For REST APIs created after March 29, 2021, the new
     * API definition takes precedence, but any container types such as endpoint configurations and
     * binary media types are merged with the existing API.
     *
     * Use the default mode to define top-level `RestApi` properties in addition to using OpenAPI.
     * Generally, it's preferred to use API Gateway's OpenAPI extensions to model these properties.
     */
    public fun mode(mode: String)

    /**
     * @param name The name of the RestApi.
     * A name is required if the REST API is not based on an OpenAPI specification.
     */
    public fun name(name: String)

    /**
     * @param parameters Custom header parameters as part of the request.
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters Custom header parameters as part of the request.
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param policy A policy document that contains the permissions for the `RestApi` resource.
     * To set the ARN for the policy, use the `!Join` intrinsic function with `""` as delimiter and
     * values of `"execute-api:/"` and `"*"` .
     */
    public fun policy(policy: Any)

    /**
     * @param tags The key-value map of strings.
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The key-value map of strings.
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnRestApiProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnRestApiProps.builder()

    /**
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan.
     * Valid values are: `HEADER` to read the API key from the `X-API-Key` header of a request.
     * `AUTHORIZER` to read the API key from the `UsageIdentifierKey` from a custom authorizer.
     */
    override fun apiKeySourceType(apiKeySourceType: String) {
      cdkBuilder.apiKeySourceType(apiKeySourceType)
    }

    /**
     * @param binaryMediaTypes The list of binary media types supported by the RestApi.
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     */
    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    /**
     * @param binaryMediaTypes The list of binary media types supported by the RestApi.
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     */
    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    /**
     * @param body An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     * For YAML templates, you can also provide the specification in YAML format.
     */
    override fun body(body: Any) {
      cdkBuilder.body(body)
    }

    /**
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format.
     */
    override fun bodyS3Location(bodyS3Location: IResolvable) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format.
     */
    override fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(CfnRestApi.S3LocationProperty.Companion::unwrap))
    }

    /**
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a8263dd88d28eb60a198223d77321eae4d5fc4f96def26f35362c5e65ed4b1b")
    override fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty.Builder.() -> Unit):
        Unit = bodyS3Location(CfnRestApi.S3LocationProperty(bodyS3Location))

    /**
     * @param cloneFrom The ID of the RestApi that you want to clone from.
     */
    override fun cloneFrom(cloneFrom: String) {
      cdkBuilder.cloneFrom(cloneFrom)
    }

    /**
     * @param description The description of the RestApi.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint.
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint.
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param endpointConfiguration A list of the endpoint types of the API.
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     */
    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param endpointConfiguration A list of the endpoint types of the API.
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     */
    override
        fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(CfnRestApi.EndpointConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param endpointConfiguration A list of the endpoint types of the API.
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00adf3cad9b409f91bdee38d4f666be552ca9838cbdc179ef66c4ad481401e4d")
    override
        fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty.Builder.() -> Unit):
        Unit =
        endpointConfiguration(CfnRestApi.EndpointConfigurationProperty(endpointConfiguration))

    /**
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     * `true` ) or not ( `false` ) when a warning is encountered.
     * The default value is `false` .
     */
    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     * `true` ) or not ( `false` ) when a warning is encountered.
     * The default value is `false` .
     */
    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null
     * value) on an API.
     * When compression is enabled, compression or decompression is not applied on the payload if
     * the payload size is smaller than this value. Setting it to zero allows compression for any
     * payload size.
     */
    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    /**
     * @param mode This property applies only when you use OpenAPI to define your REST API.
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
     * March 29, 2021, the default is `overwrite` . For REST APIs created after March 29, 2021, the new
     * API definition takes precedence, but any container types such as endpoint configurations and
     * binary media types are merged with the existing API.
     *
     * Use the default mode to define top-level `RestApi` properties in addition to using OpenAPI.
     * Generally, it's preferred to use API Gateway's OpenAPI extensions to model these properties.
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * @param name The name of the RestApi.
     * A name is required if the REST API is not based on an OpenAPI specification.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters Custom header parameters as part of the request.
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameters Custom header parameters as part of the request.
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param policy A policy document that contains the permissions for the `RestApi` resource.
     * To set the ARN for the policy, use the `!Join` intrinsic function with `""` as delimiter and
     * values of `"execute-api:/"` and `"*"` .
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param tags The key-value map of strings.
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The key-value map of strings.
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnRestApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApiProps,
  ) : CdkObject(cdkObject),
      CfnRestApiProps {
    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Valid values are: `HEADER` to read the API key from the `X-API-Key` header of a request.
     * `AUTHORIZER` to read the API key from the `UsageIdentifierKey` from a custom authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype)
     */
    override fun apiKeySourceType(): String? = unwrap(this).getApiKeySourceType()

    /**
     * The list of binary media types supported by the RestApi.
     *
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
     */
    override fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
        emptyList()

    /**
     * An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     *
     * For YAML templates, you can also provide the specification in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
     */
    override fun body(): Any? = unwrap(this).getBody()

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     */
    override fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

    /**
     * The ID of the RestApi that you want to clone from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom)
     */
    override fun cloneFrom(): String? = unwrap(this).getCloneFrom()

    /**
     * The description of the RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-disableexecuteapiendpoint)
     */
    override fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     */
    override fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

    /**
     * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false`
     * ) when a warning is encountered.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
     */
    override fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

    /**
     * A nullable integer that is used to enable compression (with non-negative between 0 and
     * 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API.
     *
     * When compression is enabled, compression or decompression is not applied on the payload if
     * the payload size is smaller than this value. Setting it to zero allows compression for any
     * payload size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize)
     */
    override fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

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
     * March 29, 2021, the default is `overwrite` . For REST APIs created after March 29, 2021, the new
     * API definition takes precedence, but any container types such as endpoint configurations and
     * binary media types are merged with the existing API.
     *
     * Use the default mode to define top-level `RestApi` properties in addition to using OpenAPI.
     * Generally, it's preferred to use API Gateway's OpenAPI extensions to model these properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-mode)
     */
    override fun mode(): String? = unwrap(this).getMode()

    /**
     * The name of the RestApi.
     *
     * A name is required if the REST API is not based on an OpenAPI specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Custom header parameters as part of the request.
     *
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A policy document that contains the permissions for the `RestApi` resource.
     *
     * To set the ARN for the policy, use the `!Join` intrinsic function with `""` as delimiter and
     * values of `"execute-api:/"` and `"*"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRestApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApiProps):
        CfnRestApiProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRestApiProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRestApiProps):
        software.amazon.awscdk.services.apigateway.CfnRestApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnRestApiProps
  }
}
