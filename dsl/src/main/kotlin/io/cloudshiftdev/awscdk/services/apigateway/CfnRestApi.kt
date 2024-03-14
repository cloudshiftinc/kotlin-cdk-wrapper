package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRestApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The source of the API key for metering requests according to a usage plan.
   */
  public open fun apiKeySourceType(): String? = unwrap(this).getApiKeySourceType()

  /**
   * The source of the API key for metering requests according to a usage plan.
   */
  public open fun apiKeySourceType(`value`: String) {
    unwrap(this).setApiKeySourceType(`value`)
  }

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun attrRestApiId(): String = unwrap(this).getAttrRestApiId()

  /**
   * The root resource ID for a `RestApi` resource, such as `a0bc123d4e` .
   */
  public open fun attrRootResourceId(): String = unwrap(this).getAttrRootResourceId()

  /**
   * The list of binary media types supported by the RestApi.
   */
  public open fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
      emptyList()

  /**
   * The list of binary media types supported by the RestApi.
   */
  public open fun binaryMediaTypes(`value`: List<String>) {
    unwrap(this).setBinaryMediaTypes(`value`)
  }

  /**
   * The list of binary media types supported by the RestApi.
   */
  public open fun binaryMediaTypes(vararg `value`: String): Unit =
      binaryMediaTypes(`value`.toList())

  /**
   * An OpenAPI specification that defines a set of RESTful APIs in JSON format.
   */
  public open fun body(): Any? = unwrap(this).getBody()

  /**
   * An OpenAPI specification that defines a set of RESTful APIs in JSON format.
   */
  public open fun body(`value`: Any) {
    unwrap(this).setBody(`value`)
  }

  /**
   * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
   * defines a set of RESTful APIs in JSON or YAML format.
   */
  public open fun bodyS3Location(): Any? = unwrap(this).getBodyS3Location()

  /**
   * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
   * defines a set of RESTful APIs in JSON or YAML format.
   */
  public open fun bodyS3Location(`value`: IResolvable) {
    unwrap(this).setBodyS3Location(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
   * defines a set of RESTful APIs in JSON or YAML format.
   */
  public open fun bodyS3Location(`value`: S3LocationProperty) {
    unwrap(this).setBodyS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
   * defines a set of RESTful APIs in JSON or YAML format.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa2ebf7a3aed3c721bf1a8f32e5fc541cf91225fbb8829e78c2bf72b1f09437e")
  public open fun bodyS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      bodyS3Location(S3LocationProperty(`value`))

  /**
   * The ID of the RestApi that you want to clone from.
   */
  public open fun cloneFrom(): String? = unwrap(this).getCloneFrom()

  /**
   * The ID of the RestApi that you want to clone from.
   */
  public open fun cloneFrom(`value`: String) {
    unwrap(this).setCloneFrom(`value`)
  }

  /**
   * The description of the RestApi.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the RestApi.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   */
  public open fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   */
  public open fun disableExecuteApiEndpoint(`value`: Boolean) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`)
  }

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   */
  public open fun disableExecuteApiEndpoint(`value`: IResolvable) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the endpoint types of the API.
   */
  public open fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  /**
   * A list of the endpoint types of the API.
   */
  public open fun endpointConfiguration(`value`: IResolvable) {
    unwrap(this).setEndpointConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the endpoint types of the API.
   */
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty) {
    unwrap(this).setEndpointConfiguration(`value`.let(EndpointConfigurationProperty::unwrap))
  }

  /**
   * A list of the endpoint types of the API.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96464e0753a5a8f1d671a4b9b2c059840d9694ece3a10e89fd4bbaf933a87cc5")
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty.Builder.() -> Unit):
      Unit = endpointConfiguration(EndpointConfigurationProperty(`value`))

  /**
   * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false` )
   * when a warning is encountered.
   */
  public open fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  /**
   * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false` )
   * when a warning is encountered.
   */
  public open fun failOnWarnings(`value`: Boolean) {
    unwrap(this).setFailOnWarnings(`value`)
  }

  /**
   * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false` )
   * when a warning is encountered.
   */
  public open fun failOnWarnings(`value`: IResolvable) {
    unwrap(this).setFailOnWarnings(`value`.let(IResolvable::unwrap))
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
   * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760
   * (10M) bytes, inclusive) or disable compression (with a null value) on an API.
   */
  public open fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  /**
   * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760
   * (10M) bytes, inclusive) or disable compression (with a null value) on an API.
   */
  public open fun minimumCompressionSize(`value`: Number) {
    unwrap(this).setMinimumCompressionSize(`value`)
  }

  /**
   * This property applies only when you use OpenAPI to define your REST API.
   */
  public open fun mode(): String? = unwrap(this).getMode()

  /**
   * This property applies only when you use OpenAPI to define your REST API.
   */
  public open fun mode(`value`: String) {
    unwrap(this).setMode(`value`)
  }

  /**
   * The name of the RestApi.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the RestApi.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Custom header parameters as part of the request.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Custom header parameters as part of the request.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * Custom header parameters as part of the request.
   */
  public open fun parameters(`value`: Map<String, String>) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * A policy document that contains the permissions for the `RestApi` resource.
   */
  public open fun policy(): Any? = unwrap(this).getPolicy()

  /**
   * A policy document that contains the permissions for the `RestApi` resource.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The key-value map of strings.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The key-value map of strings.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The key-value map of strings.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnRestApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Valid values are: `HEADER` to read the API key from the `X-API-Key` header of a request.
     * `AUTHORIZER` to read the API key from the `UsageIdentifierKey` from a custom authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype)
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan. 
     */
    public fun apiKeySourceType(apiKeySourceType: String)

    /**
     * The list of binary media types supported by the RestApi.
     *
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
     * @param binaryMediaTypes The list of binary media types supported by the RestApi. 
     */
    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    /**
     * The list of binary media types supported by the RestApi.
     *
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
     * @param binaryMediaTypes The list of binary media types supported by the RestApi. 
     */
    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    /**
     * An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     *
     * For YAML templates, you can also provide the specification in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
     * @param body An OpenAPI specification that defines a set of RESTful APIs in JSON format. 
     */
    public fun body(body: Any)

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format. 
     */
    public fun bodyS3Location(bodyS3Location: IResolvable)

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format. 
     */
    public fun bodyS3Location(bodyS3Location: S3LocationProperty)

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d35ffb3ff0b84ebe66af9cf1925819130283ff8be57b7629af7c56d91932bd31")
    public fun bodyS3Location(bodyS3Location: S3LocationProperty.Builder.() -> Unit)

    /**
     * The ID of the RestApi that you want to clone from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom)
     * @param cloneFrom The ID of the RestApi that you want to clone from. 
     */
    public fun cloneFrom(cloneFrom: String)

    /**
     * The description of the RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description)
     * @param description The description of the RestApi. 
     */
    public fun description(description: String)

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint. 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. To require that clients use a
     * custom domain name to invoke your API, disable the default endpoint
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint. 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     * @param endpointConfiguration A list of the endpoint types of the API. 
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     * @param endpointConfiguration A list of the endpoint types of the API. 
     */
    public fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty)

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     * @param endpointConfiguration A list of the endpoint types of the API. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("111e703782ee9ff24896853eb6d31839e80c2f1b678f7a83c77fc256a7b2d65a")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit)

    /**
     * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false`
     * ) when a warning is encountered.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     * `true` ) or not ( `false` ) when a warning is encountered. 
     */
    public fun failOnWarnings(failOnWarnings: Boolean)

    /**
     * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false`
     * ) when a warning is encountered.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     * `true` ) or not ( `false` ) when a warning is encountered. 
     */
    public fun failOnWarnings(failOnWarnings: IResolvable)

    /**
     * A nullable integer that is used to enable compression (with non-negative between 0 and
     * 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API.
     *
     * When compression is enabled, compression or decompression is not applied on the payload if
     * the payload size is smaller than this value. Setting it to zero allows compression for any
     * payload size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-minimumcompressionsize)
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null
     * value) on an API. 
     */
    public fun minimumCompressionSize(minimumCompressionSize: Number)

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
     * @param mode This property applies only when you use OpenAPI to define your REST API. 
     */
    public fun mode(mode: String)

    /**
     * The name of the RestApi.
     *
     * A name is required if the REST API is not based on an OpenAPI specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name)
     * @param name The name of the RestApi. 
     */
    public fun name(name: String)

    /**
     * Custom header parameters as part of the request.
     *
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
     * @param parameters Custom header parameters as part of the request. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * Custom header parameters as part of the request.
     *
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
     * @param parameters Custom header parameters as part of the request. 
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * A policy document that contains the permissions for the `RestApi` resource.
     *
     * To set the ARN for the policy, use the `!Join` intrinsic function with `""` as delimiter and
     * values of `"execute-api:/"` and `"*"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
     * @param policy A policy document that contains the permissions for the `RestApi` resource. 
     */
    public fun policy(policy: Any)

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-tags)
     * @param tags The key-value map of strings. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-tags)
     * @param tags The key-value map of strings. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnRestApi.Builder =
        software.amazon.awscdk.services.apigateway.CfnRestApi.Builder.create(scope, id)

    /**
     * The source of the API key for metering requests according to a usage plan.
     *
     * Valid values are: `HEADER` to read the API key from the `X-API-Key` header of a request.
     * `AUTHORIZER` to read the API key from the `UsageIdentifierKey` from a custom authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-apikeysourcetype)
     * @param apiKeySourceType The source of the API key for metering requests according to a usage
     * plan. 
     */
    override fun apiKeySourceType(apiKeySourceType: String) {
      cdkBuilder.apiKeySourceType(apiKeySourceType)
    }

    /**
     * The list of binary media types supported by the RestApi.
     *
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
     * @param binaryMediaTypes The list of binary media types supported by the RestApi. 
     */
    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    /**
     * The list of binary media types supported by the RestApi.
     *
     * By default, the RestApi supports only UTF-8-encoded text payloads.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-binarymediatypes)
     * @param binaryMediaTypes The list of binary media types supported by the RestApi. 
     */
    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    /**
     * An OpenAPI specification that defines a set of RESTful APIs in JSON format.
     *
     * For YAML templates, you can also provide the specification in YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-body)
     * @param body An OpenAPI specification that defines a set of RESTful APIs in JSON format. 
     */
    override fun body(body: Any) {
      cdkBuilder.body(body)
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format. 
     */
    override fun bodyS3Location(bodyS3Location: IResolvable) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(IResolvable::unwrap))
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format. 
     */
    override fun bodyS3Location(bodyS3Location: S3LocationProperty) {
      cdkBuilder.bodyS3Location(bodyS3Location.let(S3LocationProperty::unwrap))
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which
     * defines a set of RESTful APIs in JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-bodys3location)
     * @param bodyS3Location The Amazon Simple Storage Service (Amazon S3) location that points to
     * an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d35ffb3ff0b84ebe66af9cf1925819130283ff8be57b7629af7c56d91932bd31")
    override fun bodyS3Location(bodyS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
        bodyS3Location(S3LocationProperty(bodyS3Location))

    /**
     * The ID of the RestApi that you want to clone from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-clonefrom)
     * @param cloneFrom The ID of the RestApi that you want to clone from. 
     */
    override fun cloneFrom(cloneFrom: String) {
      cdkBuilder.cloneFrom(cloneFrom)
    }

    /**
     * The description of the RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-description)
     * @param description The description of the RestApi. 
     */
    override fun description(description: String) {
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
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint. 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
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
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
     * default `execute-api` endpoint. 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     * @param endpointConfiguration A list of the endpoint types of the API. 
     */
    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     * @param endpointConfiguration A list of the endpoint types of the API. 
     */
    override fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfigurationProperty::unwrap))
    }

    /**
     * A list of the endpoint types of the API.
     *
     * Use this property when creating an API. When importing an existing API, specify the endpoint
     * configuration types using the `Parameters` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-endpointconfiguration)
     * @param endpointConfiguration A list of the endpoint types of the API. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("111e703782ee9ff24896853eb6d31839e80c2f1b678f7a83c77fc256a7b2d65a")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfigurationProperty(endpointConfiguration))

    /**
     * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false`
     * ) when a warning is encountered.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     * `true` ) or not ( `false` ) when a warning is encountered. 
     */
    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * A query parameter to indicate whether to rollback the API update ( `true` ) or not ( `false`
     * ) when a warning is encountered.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-failonwarnings)
     * @param failOnWarnings A query parameter to indicate whether to rollback the API update (
     * `true` ) or not ( `false` ) when a warning is encountered. 
     */
    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
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
     * @param minimumCompressionSize A nullable integer that is used to enable compression (with
     * non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null
     * value) on an API. 
     */
    override fun minimumCompressionSize(minimumCompressionSize: Number) {
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
     * March 29, 2021, the default is `overwrite` . For REST APIs created after March 29, 2021, the new
     * API definition takes precedence, but any container types such as endpoint configurations and
     * binary media types are merged with the existing API.
     *
     * Use the default mode to define top-level `RestApi` properties in addition to using OpenAPI.
     * Generally, it's preferred to use API Gateway's OpenAPI extensions to model these properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-mode)
     * @param mode This property applies only when you use OpenAPI to define your REST API. 
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * The name of the RestApi.
     *
     * A name is required if the REST API is not based on an OpenAPI specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-name)
     * @param name The name of the RestApi. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Custom header parameters as part of the request.
     *
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
     * @param parameters Custom header parameters as part of the request. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * Custom header parameters as part of the request.
     *
     * For example, to exclude DocumentationParts from an imported API, set `ignore=documentation`
     * as a `parameters` value, as in the AWS CLI command of `aws apigateway
     * import-rest-api --parameters ignore=documentation --body
     * 'file:///path/to/imported-api-body.json'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-parameters)
     * @param parameters Custom header parameters as part of the request. 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * A policy document that contains the permissions for the `RestApi` resource.
     *
     * To set the ARN for the policy, use the `!Join` intrinsic function with `""` as delimiter and
     * values of `"execute-api:/"` and `"*"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-policy)
     * @param policy A policy document that contains the permissions for the `RestApi` resource. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-tags)
     * @param tags The key-value map of strings. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-restapi.html#cfn-apigateway-restapi-tags)
     * @param tags The key-value map of strings. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.CfnRestApi = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRestApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRestApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApi): CfnRestApi
        = CfnRestApi(cdkObject)

    internal fun unwrap(wrapped: CfnRestApi): software.amazon.awscdk.services.apigateway.CfnRestApi
        = wrapped.cdkObject
  }

  public interface S3LocationProperty {
    /**
     * The name of the S3 bucket where the OpenAPI file is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-bucket)
     */
    public fun bucket(): String? = unwrap(this).getBucket()

    /**
     * The Amazon S3 ETag (a file checksum) of the OpenAPI file.
     *
     * If you don't specify a value, API Gateway skips ETag validation of your OpenAPI file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-etag)
     */
    public fun eTag(): String? = unwrap(this).getETag()

    /**
     * The file name of the OpenAPI file (Amazon S3 object name).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * For versioning-enabled buckets, a specific version of the OpenAPI file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket where the OpenAPI file is stored.
       */
      public fun bucket(bucket: String)

      /**
       * @param eTag The Amazon S3 ETag (a file checksum) of the OpenAPI file.
       * If you don't specify a value, API Gateway skips ETag validation of your OpenAPI file.
       */
      public fun eTag(eTag: String)

      /**
       * @param key The file name of the OpenAPI file (Amazon S3 object name).
       */
      public fun key(key: String)

      /**
       * @param version For versioning-enabled buckets, a specific version of the OpenAPI file.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty.builder()

      /**
       * @param bucket The name of the S3 bucket where the OpenAPI file is stored.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param eTag The Amazon S3 ETag (a file checksum) of the OpenAPI file.
       * If you don't specify a value, API Gateway skips ETag validation of your OpenAPI file.
       */
      override fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
      }

      /**
       * @param key The file name of the OpenAPI file (Amazon S3 object name).
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version For versioning-enabled buckets, a specific version of the OpenAPI file.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The name of the S3 bucket where the OpenAPI file is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-bucket)
       */
      override fun bucket(): String? = unwrap(this).getBucket()

      /**
       * The Amazon S3 ETag (a file checksum) of the OpenAPI file.
       *
       * If you don't specify a value, API Gateway skips ETag validation of your OpenAPI file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-etag)
       */
      override fun eTag(): String? = unwrap(this).getETag()

      /**
       * The file name of the OpenAPI file (Amazon S3 object name).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * For versioning-enabled buckets, a specific version of the OpenAPI file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-s3location.html#cfn-apigateway-restapi-s3location-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty
    }
  }

  public interface EndpointConfigurationProperty {
    /**
     * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName).
     *
     * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
     * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
     * the endpoint type is `PRIVATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types)
     */
    public fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

    /**
     * A list of VpcEndpointIds of an API (RestApi) against which to create Route53 ALIASes.
     *
     * It is only supported for `PRIVATE` endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-vpcendpointids)
     */
    public fun vpcEndpointIds(): List<String> = unwrap(this).getVpcEndpointIds() ?: emptyList()

    /**
     * A builder for [EndpointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      public fun types(types: List<String>)

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      public fun types(vararg types: String)

      /**
       * @param vpcEndpointIds A list of VpcEndpointIds of an API (RestApi) against which to create
       * Route53 ALIASes.
       * It is only supported for `PRIVATE` endpoint type.
       */
      public fun vpcEndpointIds(vpcEndpointIds: List<String>)

      /**
       * @param vpcEndpointIds A list of VpcEndpointIds of an API (RestApi) against which to create
       * Route53 ALIASes.
       * It is only supported for `PRIVATE` endpoint type.
       */
      public fun vpcEndpointIds(vararg vpcEndpointIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty.builder()

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      override fun types(types: List<String>) {
        cdkBuilder.types(types)
      }

      /**
       * @param types A list of endpoint types of an API (RestApi) or its custom domain name
       * (DomainName).
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       */
      override fun types(vararg types: String): Unit = types(types.toList())

      /**
       * @param vpcEndpointIds A list of VpcEndpointIds of an API (RestApi) against which to create
       * Route53 ALIASes.
       * It is only supported for `PRIVATE` endpoint type.
       */
      override fun vpcEndpointIds(vpcEndpointIds: List<String>) {
        cdkBuilder.vpcEndpointIds(vpcEndpointIds)
      }

      /**
       * @param vpcEndpointIds A list of VpcEndpointIds of an API (RestApi) against which to create
       * Route53 ALIASes.
       * It is only supported for `PRIVATE` endpoint type.
       */
      override fun vpcEndpointIds(vararg vpcEndpointIds: String): Unit =
          vpcEndpointIds(vpcEndpointIds.toList())

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty,
    ) : CdkObject(cdkObject), EndpointConfigurationProperty {
      /**
       * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName).
       *
       * For an edge-optimized API and its custom domain name, the endpoint type is `"EDGE"` . For a
       * regional API and its custom domain name, the endpoint type is `REGIONAL` . For a private API,
       * the endpoint type is `PRIVATE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types)
       */
      override fun types(): List<String> = unwrap(this).getTypes() ?: emptyList()

      /**
       * A list of VpcEndpointIds of an API (RestApi) against which to create Route53 ALIASes.
       *
       * It is only supported for `PRIVATE` endpoint type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-vpcendpointids)
       */
      override fun vpcEndpointIds(): List<String> = unwrap(this).getVpcEndpointIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty):
          EndpointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty
    }
  }
}
