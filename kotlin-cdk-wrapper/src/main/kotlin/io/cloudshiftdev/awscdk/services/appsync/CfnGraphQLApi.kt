@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppSync::GraphQLApi` resource creates a new AWS AppSync GraphQL API.
 *
 * This is the top-level construct for your application. For more information, see [Quick
 * Start](https://docs.aws.amazon.com/appsync/latest/devguide/quickstart.html) in the *AWS AppSync
 * Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * Object environmentVariables;
 * CfnGraphQLApi cfnGraphQLApi = CfnGraphQLApi.Builder.create(this, "MyCfnGraphQLApi")
 * .authenticationType("authenticationType")
 * .name("name")
 * // the properties below are optional
 * .additionalAuthenticationProviders(List.of(AdditionalAuthenticationProviderProperty.builder()
 * .authenticationType("authenticationType")
 * // the properties below are optional
 * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
 * .authorizerResultTtlInSeconds(123)
 * .authorizerUri("authorizerUri")
 * .identityValidationExpression("identityValidationExpression")
 * .build())
 * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
 * .authTtl(123)
 * .clientId("clientId")
 * .iatTtl(123)
 * .issuer("issuer")
 * .build())
 * .userPoolConfig(CognitoUserPoolConfigProperty.builder()
 * .appIdClientRegex("appIdClientRegex")
 * .awsRegion("awsRegion")
 * .userPoolId("userPoolId")
 * .build())
 * .build()))
 * .apiType("apiType")
 * .enhancedMetricsConfig(EnhancedMetricsConfigProperty.builder()
 * .dataSourceLevelMetricsBehavior("dataSourceLevelMetricsBehavior")
 * .operationLevelMetricsConfig("operationLevelMetricsConfig")
 * .resolverLevelMetricsBehavior("resolverLevelMetricsBehavior")
 * .build())
 * .environmentVariables(environmentVariables)
 * .introspectionConfig("introspectionConfig")
 * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
 * .authorizerResultTtlInSeconds(123)
 * .authorizerUri("authorizerUri")
 * .identityValidationExpression("identityValidationExpression")
 * .build())
 * .logConfig(LogConfigProperty.builder()
 * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
 * .excludeVerboseContent(false)
 * .fieldLogLevel("fieldLogLevel")
 * .build())
 * .mergedApiExecutionRoleArn("mergedApiExecutionRoleArn")
 * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
 * .authTtl(123)
 * .clientId("clientId")
 * .iatTtl(123)
 * .issuer("issuer")
 * .build())
 * .ownerContact("ownerContact")
 * .queryDepthLimit(123)
 * .resolverCountLimit(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userPoolConfig(UserPoolConfigProperty.builder()
 * .appIdClientRegex("appIdClientRegex")
 * .awsRegion("awsRegion")
 * .defaultAction("defaultAction")
 * .userPoolId("userPoolId")
 * .build())
 * .visibility("visibility")
 * .xrayEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
 */
public open class CfnGraphQLApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGraphQLApiProps,
  ) :
      this(software.amazon.awscdk.services.appsync.CfnGraphQLApi(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnGraphQLApiProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGraphQLApiProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGraphQLApiProps(props)
  )

  /**
   * A list of additional authentication providers for the `GraphqlApi` API.
   */
  public open fun additionalAuthenticationProviders(): Any? =
      unwrap(this).getAdditionalAuthenticationProviders()

  /**
   * A list of additional authentication providers for the `GraphqlApi` API.
   */
  public open fun additionalAuthenticationProviders(`value`: IResolvable) {
    unwrap(this).setAdditionalAuthenticationProviders(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of additional authentication providers for the `GraphqlApi` API.
   */
  public open fun additionalAuthenticationProviders(`value`: List<Any>) {
    unwrap(this).setAdditionalAuthenticationProviders(`value`)
  }

  /**
   * A list of additional authentication providers for the `GraphqlApi` API.
   */
  public open fun additionalAuthenticationProviders(vararg `value`: Any): Unit =
      additionalAuthenticationProviders(`value`.toList())

  /**
   * The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL` ) or merged API
   * ( `MERGED` ).
   */
  public open fun apiType(): String? = unwrap(this).getApiType()

  /**
   * The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL` ) or merged API
   * ( `MERGED` ).
   */
  public open fun apiType(`value`: String) {
    unwrap(this).setApiType(`value`)
  }

  /**
   * Unique AWS AppSync GraphQL API identifier.
   */
  public open fun attrApiId(): String = unwrap(this).getAttrApiId()

  /**
   * The Amazon Resource Name (ARN) of the API key, such as
   * `arn:aws:appsync:us-east-1:123456789012:apis/graphqlapiid` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The fully qualified domain name (FQDN) of the endpoint URL of your GraphQL API.
   */
  public open fun attrGraphQlDns(): String = unwrap(this).getAttrGraphQlDns()

  /**
   * The GraphQL endpoint ARN.
   */
  public open fun attrGraphQlEndpointArn(): String = unwrap(this).getAttrGraphQlEndpointArn()

  /**
   * The Endpoint URL of your GraphQL API.
   */
  public open fun attrGraphQlUrl(): String = unwrap(this).getAttrGraphQlUrl()

  /**
   * The ID value.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The fully qualified domain name (FQDN) of the real-time endpoint URL of your GraphQL API.
   */
  public open fun attrRealtimeDns(): String = unwrap(this).getAttrRealtimeDns()

  /**
   * The GraphQL API real-time endpoint URL.
   *
   * For more information, see [Discovering the real-time endpoint from the GraphQL
   * endpoint](https://docs.aws.amazon.com/appsync/latest/devguide/real-time-websocket-client.html#handshake-details-to-establish-the-websocket-connection)
   * .
   */
  public open fun attrRealtimeUrl(): String = unwrap(this).getAttrRealtimeUrl()

  /**
   * Security configuration for your GraphQL API.
   */
  public open fun authenticationType(): String = unwrap(this).getAuthenticationType()

  /**
   * Security configuration for your GraphQL API.
   */
  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  /**
   * Enables and controls the enhanced metrics feature.
   */
  public open fun enhancedMetricsConfig(): Any? = unwrap(this).getEnhancedMetricsConfig()

  /**
   * Enables and controls the enhanced metrics feature.
   */
  public open fun enhancedMetricsConfig(`value`: IResolvable) {
    unwrap(this).setEnhancedMetricsConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Enables and controls the enhanced metrics feature.
   */
  public open fun enhancedMetricsConfig(`value`: EnhancedMetricsConfigProperty) {
    unwrap(this).setEnhancedMetricsConfig(`value`.let(EnhancedMetricsConfigProperty::unwrap))
  }

  /**
   * Enables and controls the enhanced metrics feature.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c7cb6d997eb7a913c637402f730d7e5a2eea234cb5376e200f14f691bf25aca")
  public open fun enhancedMetricsConfig(`value`: EnhancedMetricsConfigProperty.Builder.() -> Unit):
      Unit = enhancedMetricsConfig(EnhancedMetricsConfigProperty(`value`))

  /**
   * A map containing the list of resources with their properties and environment variables.
   */
  public open fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  /**
   * A map containing the list of resources with their properties and environment variables.
   */
  public open fun environmentVariables(`value`: Any) {
    unwrap(this).setEnvironmentVariables(`value`)
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
   *
   */
  public open fun introspectionConfig(): String? = unwrap(this).getIntrospectionConfig()

  /**
   *
   */
  public open fun introspectionConfig(`value`: String) {
    unwrap(this).setIntrospectionConfig(`value`)
  }

  /**
   * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access when
   * using the `AWS_LAMBDA` authorizer mode.
   */
  public open fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

  /**
   * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access when
   * using the `AWS_LAMBDA` authorizer mode.
   */
  public open fun lambdaAuthorizerConfig(`value`: IResolvable) {
    unwrap(this).setLambdaAuthorizerConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access when
   * using the `AWS_LAMBDA` authorizer mode.
   */
  public open fun lambdaAuthorizerConfig(`value`: LambdaAuthorizerConfigProperty) {
    unwrap(this).setLambdaAuthorizerConfig(`value`.let(LambdaAuthorizerConfigProperty::unwrap))
  }

  /**
   * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access when
   * using the `AWS_LAMBDA` authorizer mode.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("226654479798f7d69b9831494fd1f18b4eae751c1940e3d6dd7d7793b9b25dbd")
  public open
      fun lambdaAuthorizerConfig(`value`: LambdaAuthorizerConfigProperty.Builder.() -> Unit): Unit =
      lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty(`value`))

  /**
   * The Amazon CloudWatch Logs configuration.
   */
  public open fun logConfig(): Any? = unwrap(this).getLogConfig()

  /**
   * The Amazon CloudWatch Logs configuration.
   */
  public open fun logConfig(`value`: IResolvable) {
    unwrap(this).setLogConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon CloudWatch Logs configuration.
   */
  public open fun logConfig(`value`: LogConfigProperty) {
    unwrap(this).setLogConfig(`value`.let(LogConfigProperty::unwrap))
  }

  /**
   * The Amazon CloudWatch Logs configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6480098209f2ac20bfd8339046fd57d0cd067b9efde8da561a61daa0cadb30f9")
  public open fun logConfig(`value`: LogConfigProperty.Builder.() -> Unit): Unit =
      logConfig(LogConfigProperty(`value`))

  /**
   * The AWS Identity and Access Management service role ARN for a merged API.
   */
  public open fun mergedApiExecutionRoleArn(): String? = unwrap(this).getMergedApiExecutionRoleArn()

  /**
   * The AWS Identity and Access Management service role ARN for a merged API.
   */
  public open fun mergedApiExecutionRoleArn(`value`: String) {
    unwrap(this).setMergedApiExecutionRoleArn(`value`)
  }

  /**
   * The API name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The API name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The OpenID Connect configuration.
   */
  public open fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

  /**
   * The OpenID Connect configuration.
   */
  public open fun openIdConnectConfig(`value`: IResolvable) {
    unwrap(this).setOpenIdConnectConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The OpenID Connect configuration.
   */
  public open fun openIdConnectConfig(`value`: OpenIDConnectConfigProperty) {
    unwrap(this).setOpenIdConnectConfig(`value`.let(OpenIDConnectConfigProperty::unwrap))
  }

  /**
   * The OpenID Connect configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e541f6d43022ab20caf6f4c7b278a91eb2996d21015ce459c57588123eb39ac")
  public open fun openIdConnectConfig(`value`: OpenIDConnectConfigProperty.Builder.() -> Unit): Unit
      = openIdConnectConfig(OpenIDConnectConfigProperty(`value`))

  /**
   * The owner contact information for an API resource.
   */
  public open fun ownerContact(): String? = unwrap(this).getOwnerContact()

  /**
   * The owner contact information for an API resource.
   */
  public open fun ownerContact(`value`: String) {
    unwrap(this).setOwnerContact(`value`)
  }

  /**
   * The maximum depth a query can have in a single request.
   */
  public open fun queryDepthLimit(): Number? = unwrap(this).getQueryDepthLimit()

  /**
   * The maximum depth a query can have in a single request.
   */
  public open fun queryDepthLimit(`value`: Number) {
    unwrap(this).setQueryDepthLimit(`value`)
  }

  /**
   * The maximum number of resolvers that can be invoked in a single request.
   */
  public open fun resolverCountLimit(): Number? = unwrap(this).getResolverCountLimit()

  /**
   * The maximum number of resolvers that can be invoked in a single request.
   */
  public open fun resolverCountLimit(`value`: Number) {
    unwrap(this).setResolverCountLimit(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An arbitrary set of tags (key-value pairs) for this GraphQL API.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An arbitrary set of tags (key-value pairs) for this GraphQL API.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this GraphQL API.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
   * endpoint.
   */
  public open fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()

  /**
   * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
   * endpoint.
   */
  public open fun userPoolConfig(`value`: IResolvable) {
    unwrap(this).setUserPoolConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
   * endpoint.
   */
  public open fun userPoolConfig(`value`: UserPoolConfigProperty) {
    unwrap(this).setUserPoolConfig(`value`.let(UserPoolConfigProperty::unwrap))
  }

  /**
   * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
   * endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dedb1423752ba769548b44201e47da5b6467be2433e52472f507f75ea376cfd")
  public open fun userPoolConfig(`value`: UserPoolConfigProperty.Builder.() -> Unit): Unit =
      userPoolConfig(UserPoolConfigProperty(`value`))

  /**
   * Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private ( `PRIVATE` ).
   */
  public open fun visibility(): String? = unwrap(this).getVisibility()

  /**
   * Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private ( `PRIVATE` ).
   */
  public open fun visibility(`value`: String) {
    unwrap(this).setVisibility(`value`)
  }

  /**
   * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
   */
  public open fun xrayEnabled(): Any? = unwrap(this).getXrayEnabled()

  /**
   * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
   */
  public open fun xrayEnabled(`value`: Boolean) {
    unwrap(this).setXrayEnabled(`value`)
  }

  /**
   * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
   */
  public open fun xrayEnabled(`value`: IResolvable) {
    unwrap(this).setXrayEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnGraphQLApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of additional authentication providers for the `GraphqlApi` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-additionalauthenticationproviders)
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API. 
     */
    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable)

    /**
     * A list of additional authentication providers for the `GraphqlApi` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-additionalauthenticationproviders)
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API. 
     */
    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: List<Any>)

    /**
     * A list of additional authentication providers for the `GraphqlApi` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-additionalauthenticationproviders)
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API. 
     */
    public fun additionalAuthenticationProviders(vararg additionalAuthenticationProviders: Any)

    /**
     * The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL` ) or merged
     * API ( `MERGED` ).
     *
     * *WARNING* : If the `ApiType` has not been defined, *explicitly* setting it to `GRAPHQL` in a
     * template/stack update will result in an API replacement and new DNS values.
     *
     * The following values are valid:
     *
     * `GRAPHQL | MERGED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-apitype)
     * @param apiType The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL`
     * ) or merged API ( `MERGED` ). 
     */
    public fun apiType(apiType: String)

    /**
     * Security configuration for your GraphQL API.
     *
     * For allowed values (such as `API_KEY` , `AWS_IAM` , `AMAZON_COGNITO_USER_POOLS` ,
     * `OPENID_CONNECT` , or `AWS_LAMBDA` ), see
     * [Security](https://docs.aws.amazon.com/appsync/latest/devguide/security.html) in the *AWS
     * AppSync Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype)
     * @param authenticationType Security configuration for your GraphQL API. 
     */
    public fun authenticationType(authenticationType: String)

    /**
     * Enables and controls the enhanced metrics feature.
     *
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-enhancedmetricsconfig)
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. 
     */
    public fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable)

    /**
     * Enables and controls the enhanced metrics feature.
     *
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-enhancedmetricsconfig)
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. 
     */
    public fun enhancedMetricsConfig(enhancedMetricsConfig: EnhancedMetricsConfigProperty)

    /**
     * Enables and controls the enhanced metrics feature.
     *
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-enhancedmetricsconfig)
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a3cbe12d2f9c1e1a862aab95ce5d1ed65deac5e1e157ce800b5bd5fb9660b0")
    public
        fun enhancedMetricsConfig(enhancedMetricsConfig: EnhancedMetricsConfigProperty.Builder.() -> Unit)

    /**
     * A map containing the list of resources with their properties and environment variables.
     *
     * For more information, see [Environmental
     * variables](https://docs.aws.amazon.com/appsync/latest/devguide/environmental-variables.html) .
     *
     * *Pattern* : `^[A-Za-z]+\\w*$\\`
     *
     * *Minimum* : 2
     *
     * *Maximum* : 64
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-environmentvariables)
     * @param environmentVariables A map containing the list of resources with their properties and
     * environment variables. 
     */
    public fun environmentVariables(environmentVariables: Any)

    /**
     *
     * If no value is provided, the introspection configuration will be set to `ENABLED` by default.
     * This field will produce an error if the operation attempts to use the introspection feature
     * while this field is disabled.
     *
     * For more information about introspection, see [GraphQL
     * introspection](https://docs.aws.amazon.com/https://graphql.org/learn/introspection/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-introspectionconfig)
     * @param introspectionConfig Sets the value of the GraphQL API to enable ( `ENABLED` ) or
     * disable ( `DISABLED` ) introspection. 
     */
    public fun introspectionConfig(introspectionConfig: String)

    /**
     * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access
     * when using the `AWS_LAMBDA` authorizer mode.
     *
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig)
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode. 
     */
    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable)

    /**
     * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access
     * when using the `AWS_LAMBDA` authorizer mode.
     *
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig)
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode. 
     */
    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty)

    /**
     * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access
     * when using the `AWS_LAMBDA` authorizer mode.
     *
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig)
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da0488f40eaf1552ec2288dda6c9768e72ad743ce7745489d6072e08448f082f")
    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon CloudWatch Logs configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
     * @param logConfig The Amazon CloudWatch Logs configuration. 
     */
    public fun logConfig(logConfig: IResolvable)

    /**
     * The Amazon CloudWatch Logs configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
     * @param logConfig The Amazon CloudWatch Logs configuration. 
     */
    public fun logConfig(logConfig: LogConfigProperty)

    /**
     * The Amazon CloudWatch Logs configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
     * @param logConfig The Amazon CloudWatch Logs configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2c348d48fad955cda15b42b518ffcbb90f81c47fad3596459e8ddc515e4cf07")
    public fun logConfig(logConfig: LogConfigProperty.Builder.() -> Unit)

    /**
     * The AWS Identity and Access Management service role ARN for a merged API.
     *
     * The AppSync service assumes this role on behalf of the Merged API to validate access to
     * source APIs at runtime and to prompt the `AUTO_MERGE` to update the merged API endpoint with the
     * source API changes automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-mergedapiexecutionrolearn)
     * @param mergedApiExecutionRoleArn The AWS Identity and Access Management service role ARN for
     * a merged API. 
     */
    public fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String)

    /**
     * The API name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name)
     * @param name The API name. 
     */
    public fun name(name: String)

    /**
     * The OpenID Connect configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
     * @param openIdConnectConfig The OpenID Connect configuration. 
     */
    public fun openIdConnectConfig(openIdConnectConfig: IResolvable)

    /**
     * The OpenID Connect configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
     * @param openIdConnectConfig The OpenID Connect configuration. 
     */
    public fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty)

    /**
     * The OpenID Connect configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
     * @param openIdConnectConfig The OpenID Connect configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe4a9b46f44d59c47b3c13cb4b1549218bdb0f63f34a8a03263e81ca1c843d27")
    public
        fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty.Builder.() -> Unit)

    /**
     * The owner contact information for an API resource.
     *
     * This field accepts any string input with a length of 0 - 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-ownercontact)
     * @param ownerContact The owner contact information for an API resource. 
     */
    public fun ownerContact(ownerContact: String)

    /**
     * The maximum depth a query can have in a single request.
     *
     * Depth refers to the amount of nested levels allowed in the body of query. The default value
     * is `0` (or unspecified), which indicates there's no depth limit. If you set a limit, it can be
     * between `1` and `75` nested levels. This field will produce a limit error if the operation falls
     * out of bounds. Note that fields can still be set to nullable or non-nullable. If a non-nullable
     * field produces an error, the error will be thrown upwards to the first nullable field available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-querydepthlimit)
     * @param queryDepthLimit The maximum depth a query can have in a single request. 
     */
    public fun queryDepthLimit(queryDepthLimit: Number)

    /**
     * The maximum number of resolvers that can be invoked in a single request.
     *
     * The default value is `0` (or unspecified), which will set the limit to `10000` . When
     * specified, the limit value can be between `1` and `10000` . This field will produce a limit
     * error if the operation falls out of bounds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-resolvercountlimit)
     * @param resolverCountLimit The maximum number of resolvers that can be invoked in a single
     * request. 
     */
    public fun resolverCountLimit(resolverCountLimit: Number)

    /**
     * An arbitrary set of tags (key-value pairs) for this GraphQL API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key-value pairs) for this GraphQL API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint. 
     */
    public fun userPoolConfig(userPoolConfig: IResolvable)

    /**
     * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint. 
     */
    public fun userPoolConfig(userPoolConfig: UserPoolConfigProperty)

    /**
     * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a451ad14d60acde1fe3c55adbbc11e432d8495048e155210873a9d30f0d2b986")
    public fun userPoolConfig(userPoolConfig: UserPoolConfigProperty.Builder.() -> Unit)

    /**
     * Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private ( `PRIVATE` ).
     *
     * By default, the scope is set to `Global` if no value is provided.
     *
     * *WARNING* : If `Visibility` has not been defined, *explicitly* setting it to `GLOBAL` in a
     * template/stack update will result in an API replacement and new DNS values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-visibility)
     * @param visibility Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private (
     * `PRIVATE` ). 
     */
    public fun visibility(visibility: String)

    /**
     * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled)
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     * 
     */
    public fun xrayEnabled(xrayEnabled: Boolean)

    /**
     * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled)
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     * 
     */
    public fun xrayEnabled(xrayEnabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnGraphQLApi.Builder =
        software.amazon.awscdk.services.appsync.CfnGraphQLApi.Builder.create(scope, id)

    /**
     * A list of additional authentication providers for the `GraphqlApi` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-additionalauthenticationproviders)
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API. 
     */
    override fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable) {
      cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders.let(IResolvable::unwrap))
    }

    /**
     * A list of additional authentication providers for the `GraphqlApi` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-additionalauthenticationproviders)
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API. 
     */
    override fun additionalAuthenticationProviders(additionalAuthenticationProviders: List<Any>) {
      cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders)
    }

    /**
     * A list of additional authentication providers for the `GraphqlApi` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-additionalauthenticationproviders)
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API. 
     */
    override fun additionalAuthenticationProviders(vararg additionalAuthenticationProviders: Any):
        Unit = additionalAuthenticationProviders(additionalAuthenticationProviders.toList())

    /**
     * The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL` ) or merged
     * API ( `MERGED` ).
     *
     * *WARNING* : If the `ApiType` has not been defined, *explicitly* setting it to `GRAPHQL` in a
     * template/stack update will result in an API replacement and new DNS values.
     *
     * The following values are valid:
     *
     * `GRAPHQL | MERGED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-apitype)
     * @param apiType The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL`
     * ) or merged API ( `MERGED` ). 
     */
    override fun apiType(apiType: String) {
      cdkBuilder.apiType(apiType)
    }

    /**
     * Security configuration for your GraphQL API.
     *
     * For allowed values (such as `API_KEY` , `AWS_IAM` , `AMAZON_COGNITO_USER_POOLS` ,
     * `OPENID_CONNECT` , or `AWS_LAMBDA` ), see
     * [Security](https://docs.aws.amazon.com/appsync/latest/devguide/security.html) in the *AWS
     * AppSync Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype)
     * @param authenticationType Security configuration for your GraphQL API. 
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * Enables and controls the enhanced metrics feature.
     *
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-enhancedmetricsconfig)
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. 
     */
    override fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable) {
      cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig.let(IResolvable::unwrap))
    }

    /**
     * Enables and controls the enhanced metrics feature.
     *
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-enhancedmetricsconfig)
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. 
     */
    override fun enhancedMetricsConfig(enhancedMetricsConfig: EnhancedMetricsConfigProperty) {
      cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig.let(EnhancedMetricsConfigProperty::unwrap))
    }

    /**
     * Enables and controls the enhanced metrics feature.
     *
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-enhancedmetricsconfig)
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a3cbe12d2f9c1e1a862aab95ce5d1ed65deac5e1e157ce800b5bd5fb9660b0")
    override
        fun enhancedMetricsConfig(enhancedMetricsConfig: EnhancedMetricsConfigProperty.Builder.() -> Unit):
        Unit = enhancedMetricsConfig(EnhancedMetricsConfigProperty(enhancedMetricsConfig))

    /**
     * A map containing the list of resources with their properties and environment variables.
     *
     * For more information, see [Environmental
     * variables](https://docs.aws.amazon.com/appsync/latest/devguide/environmental-variables.html) .
     *
     * *Pattern* : `^[A-Za-z]+\\w*$\\`
     *
     * *Minimum* : 2
     *
     * *Maximum* : 64
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-environmentvariables)
     * @param environmentVariables A map containing the list of resources with their properties and
     * environment variables. 
     */
    override fun environmentVariables(environmentVariables: Any) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     *
     * If no value is provided, the introspection configuration will be set to `ENABLED` by default.
     * This field will produce an error if the operation attempts to use the introspection feature
     * while this field is disabled.
     *
     * For more information about introspection, see [GraphQL
     * introspection](https://docs.aws.amazon.com/https://graphql.org/learn/introspection/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-introspectionconfig)
     * @param introspectionConfig Sets the value of the GraphQL API to enable ( `ENABLED` ) or
     * disable ( `DISABLED` ) introspection. 
     */
    override fun introspectionConfig(introspectionConfig: String) {
      cdkBuilder.introspectionConfig(introspectionConfig)
    }

    /**
     * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access
     * when using the `AWS_LAMBDA` authorizer mode.
     *
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig)
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode. 
     */
    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(IResolvable::unwrap))
    }

    /**
     * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access
     * when using the `AWS_LAMBDA` authorizer mode.
     *
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig)
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode. 
     */
    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(LambdaAuthorizerConfigProperty::unwrap))
    }

    /**
     * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access
     * when using the `AWS_LAMBDA` authorizer mode.
     *
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig)
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da0488f40eaf1552ec2288dda6c9768e72ad743ce7745489d6072e08448f082f")
    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty.Builder.() -> Unit):
        Unit = lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty(lambdaAuthorizerConfig))

    /**
     * The Amazon CloudWatch Logs configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
     * @param logConfig The Amazon CloudWatch Logs configuration. 
     */
    override fun logConfig(logConfig: IResolvable) {
      cdkBuilder.logConfig(logConfig.let(IResolvable::unwrap))
    }

    /**
     * The Amazon CloudWatch Logs configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
     * @param logConfig The Amazon CloudWatch Logs configuration. 
     */
    override fun logConfig(logConfig: LogConfigProperty) {
      cdkBuilder.logConfig(logConfig.let(LogConfigProperty::unwrap))
    }

    /**
     * The Amazon CloudWatch Logs configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
     * @param logConfig The Amazon CloudWatch Logs configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2c348d48fad955cda15b42b518ffcbb90f81c47fad3596459e8ddc515e4cf07")
    override fun logConfig(logConfig: LogConfigProperty.Builder.() -> Unit): Unit =
        logConfig(LogConfigProperty(logConfig))

    /**
     * The AWS Identity and Access Management service role ARN for a merged API.
     *
     * The AppSync service assumes this role on behalf of the Merged API to validate access to
     * source APIs at runtime and to prompt the `AUTO_MERGE` to update the merged API endpoint with the
     * source API changes automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-mergedapiexecutionrolearn)
     * @param mergedApiExecutionRoleArn The AWS Identity and Access Management service role ARN for
     * a merged API. 
     */
    override fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String) {
      cdkBuilder.mergedApiExecutionRoleArn(mergedApiExecutionRoleArn)
    }

    /**
     * The API name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name)
     * @param name The API name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The OpenID Connect configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
     * @param openIdConnectConfig The OpenID Connect configuration. 
     */
    override fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(IResolvable::unwrap))
    }

    /**
     * The OpenID Connect configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
     * @param openIdConnectConfig The OpenID Connect configuration. 
     */
    override fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(OpenIDConnectConfigProperty::unwrap))
    }

    /**
     * The OpenID Connect configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
     * @param openIdConnectConfig The OpenID Connect configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe4a9b46f44d59c47b3c13cb4b1549218bdb0f63f34a8a03263e81ca1c843d27")
    override
        fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty.Builder.() -> Unit):
        Unit = openIdConnectConfig(OpenIDConnectConfigProperty(openIdConnectConfig))

    /**
     * The owner contact information for an API resource.
     *
     * This field accepts any string input with a length of 0 - 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-ownercontact)
     * @param ownerContact The owner contact information for an API resource. 
     */
    override fun ownerContact(ownerContact: String) {
      cdkBuilder.ownerContact(ownerContact)
    }

    /**
     * The maximum depth a query can have in a single request.
     *
     * Depth refers to the amount of nested levels allowed in the body of query. The default value
     * is `0` (or unspecified), which indicates there's no depth limit. If you set a limit, it can be
     * between `1` and `75` nested levels. This field will produce a limit error if the operation falls
     * out of bounds. Note that fields can still be set to nullable or non-nullable. If a non-nullable
     * field produces an error, the error will be thrown upwards to the first nullable field available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-querydepthlimit)
     * @param queryDepthLimit The maximum depth a query can have in a single request. 
     */
    override fun queryDepthLimit(queryDepthLimit: Number) {
      cdkBuilder.queryDepthLimit(queryDepthLimit)
    }

    /**
     * The maximum number of resolvers that can be invoked in a single request.
     *
     * The default value is `0` (or unspecified), which will set the limit to `10000` . When
     * specified, the limit value can be between `1` and `10000` . This field will produce a limit
     * error if the operation falls out of bounds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-resolvercountlimit)
     * @param resolverCountLimit The maximum number of resolvers that can be invoked in a single
     * request. 
     */
    override fun resolverCountLimit(resolverCountLimit: Number) {
      cdkBuilder.resolverCountLimit(resolverCountLimit)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this GraphQL API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this GraphQL API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint. 
     */
    override fun userPoolConfig(userPoolConfig: IResolvable) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(IResolvable::unwrap))
    }

    /**
     * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint. 
     */
    override fun userPoolConfig(userPoolConfig: UserPoolConfigProperty) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(UserPoolConfigProperty::unwrap))
    }

    /**
     * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a451ad14d60acde1fe3c55adbbc11e432d8495048e155210873a9d30f0d2b986")
    override fun userPoolConfig(userPoolConfig: UserPoolConfigProperty.Builder.() -> Unit): Unit =
        userPoolConfig(UserPoolConfigProperty(userPoolConfig))

    /**
     * Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private ( `PRIVATE` ).
     *
     * By default, the scope is set to `Global` if no value is provided.
     *
     * *WARNING* : If `Visibility` has not been defined, *explicitly* setting it to `GLOBAL` in a
     * template/stack update will result in an API replacement and new DNS values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-visibility)
     * @param visibility Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private (
     * `PRIVATE` ). 
     */
    override fun visibility(visibility: String) {
      cdkBuilder.visibility(visibility)
    }

    /**
     * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled)
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     * 
     */
    override fun xrayEnabled(xrayEnabled: Boolean) {
      cdkBuilder.xrayEnabled(xrayEnabled)
    }

    /**
     * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled)
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     * 
     */
    override fun xrayEnabled(xrayEnabled: IResolvable) {
      cdkBuilder.xrayEnabled(xrayEnabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLApi = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnGraphQLApi.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGraphQLApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGraphQLApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi):
        CfnGraphQLApi = CfnGraphQLApi(cdkObject)

    internal fun unwrap(wrapped: CfnGraphQLApi):
        software.amazon.awscdk.services.appsync.CfnGraphQLApi = wrapped.cdkObject
  }

  /**
   * The `LogConfig` property type specifies the logging configuration when writing GraphQL
   * operations and tracing to Amazon CloudWatch for an AWS AppSync GraphQL API.
   *
   * `LogConfig` is a property of the
   * [AWS::AppSync::GraphQLApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * LogConfigProperty logConfigProperty = LogConfigProperty.builder()
   * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
   * .excludeVerboseContent(false)
   * .fieldLogLevel("fieldLogLevel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html)
   */
  public interface LogConfigProperty {
    /**
     * The service role that AWS AppSync will assume to publish to Amazon CloudWatch Logs in your
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn)
     */
    public fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

    /**
     * Set to TRUE to exclude sections that contain information such as headers, context, and
     * evaluated mapping templates, regardless of logging level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-excludeverbosecontent)
     */
    public fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

    /**
     * The field logging level. Values can be NONE, ERROR, or ALL.
     *
     * * *NONE* : No field-level logs are captured.
     * * *ERROR* : Logs the following information only for the fields that are in error:
     * * The error section in the server response.
     * * Field-level errors.
     * * The generated request/response functions that got resolved for error fields.
     * * *ALL* : The following information is logged for all fields in the query:
     * * Field-level tracing information.
     * * The generated request/response functions that got resolved for each field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel)
     */
    public fun fieldLogLevel(): String? = unwrap(this).getFieldLogLevel()

    /**
     * A builder for [LogConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsRoleArn The service role that AWS AppSync will assume to publish to
       * Amazon CloudWatch Logs in your account.
       */
      public fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String)

      /**
       * @param excludeVerboseContent Set to TRUE to exclude sections that contain information such
       * as headers, context, and evaluated mapping templates, regardless of logging level.
       */
      public fun excludeVerboseContent(excludeVerboseContent: Boolean)

      /**
       * @param excludeVerboseContent Set to TRUE to exclude sections that contain information such
       * as headers, context, and evaluated mapping templates, regardless of logging level.
       */
      public fun excludeVerboseContent(excludeVerboseContent: IResolvable)

      /**
       * @param fieldLogLevel The field logging level. Values can be NONE, ERROR, or ALL.
       * * *NONE* : No field-level logs are captured.
       * * *ERROR* : Logs the following information only for the fields that are in error:
       * * The error section in the server response.
       * * Field-level errors.
       * * The generated request/response functions that got resolved for error fields.
       * * *ALL* : The following information is logged for all fields in the query:
       * * Field-level tracing information.
       * * The generated request/response functions that got resolved for each field.
       */
      public fun fieldLogLevel(fieldLogLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty.builder()

      /**
       * @param cloudWatchLogsRoleArn The service role that AWS AppSync will assume to publish to
       * Amazon CloudWatch Logs in your account.
       */
      override fun cloudWatchLogsRoleArn(cloudWatchLogsRoleArn: String) {
        cdkBuilder.cloudWatchLogsRoleArn(cloudWatchLogsRoleArn)
      }

      /**
       * @param excludeVerboseContent Set to TRUE to exclude sections that contain information such
       * as headers, context, and evaluated mapping templates, regardless of logging level.
       */
      override fun excludeVerboseContent(excludeVerboseContent: Boolean) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent)
      }

      /**
       * @param excludeVerboseContent Set to TRUE to exclude sections that contain information such
       * as headers, context, and evaluated mapping templates, regardless of logging level.
       */
      override fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
        cdkBuilder.excludeVerboseContent(excludeVerboseContent.let(IResolvable::unwrap))
      }

      /**
       * @param fieldLogLevel The field logging level. Values can be NONE, ERROR, or ALL.
       * * *NONE* : No field-level logs are captured.
       * * *ERROR* : Logs the following information only for the fields that are in error:
       * * The error section in the server response.
       * * Field-level errors.
       * * The generated request/response functions that got resolved for error fields.
       * * *ALL* : The following information is logged for all fields in the query:
       * * Field-level tracing information.
       * * The generated request/response functions that got resolved for each field.
       */
      override fun fieldLogLevel(fieldLogLevel: String) {
        cdkBuilder.fieldLogLevel(fieldLogLevel)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty,
    ) : CdkObject(cdkObject), LogConfigProperty {
      /**
       * The service role that AWS AppSync will assume to publish to Amazon CloudWatch Logs in your
       * account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn)
       */
      override fun cloudWatchLogsRoleArn(): String? = unwrap(this).getCloudWatchLogsRoleArn()

      /**
       * Set to TRUE to exclude sections that contain information such as headers, context, and
       * evaluated mapping templates, regardless of logging level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-excludeverbosecontent)
       */
      override fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

      /**
       * The field logging level. Values can be NONE, ERROR, or ALL.
       *
       * * *NONE* : No field-level logs are captured.
       * * *ERROR* : Logs the following information only for the fields that are in error:
       * * The error section in the server response.
       * * Field-level errors.
       * * The generated request/response functions that got resolved for error fields.
       * * *ALL* : The following information is logged for all fields in the query:
       * * Field-level tracing information.
       * * The generated request/response functions that got resolved for each field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel)
       */
      override fun fieldLogLevel(): String? = unwrap(this).getFieldLogLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty):
          LogConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LogConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LogConfigProperty
    }
  }

  /**
   * Describes an additional authentication provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * AdditionalAuthenticationProviderProperty additionalAuthenticationProviderProperty =
   * AdditionalAuthenticationProviderProperty.builder()
   * .authenticationType("authenticationType")
   * // the properties below are optional
   * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
   * .authorizerResultTtlInSeconds(123)
   * .authorizerUri("authorizerUri")
   * .identityValidationExpression("identityValidationExpression")
   * .build())
   * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
   * .authTtl(123)
   * .clientId("clientId")
   * .iatTtl(123)
   * .issuer("issuer")
   * .build())
   * .userPoolConfig(CognitoUserPoolConfigProperty.builder()
   * .appIdClientRegex("appIdClientRegex")
   * .awsRegion("awsRegion")
   * .userPoolId("userPoolId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html)
   */
  public interface AdditionalAuthenticationProviderProperty {
    /**
     * The authentication type for API key, AWS Identity and Access Management , OIDC, Amazon
     * Cognito user pools , or AWS Lambda .
     *
     * Valid Values: `API_KEY` | `AWS_IAM` | `OPENID_CONNECT` | `AMAZON_COGNITO_USER_POOLS` |
     * `AWS_LAMBDA`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-authenticationtype)
     */
    public fun authenticationType(): String

    /**
     * Configuration for AWS Lambda function authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-lambdaauthorizerconfig)
     */
    public fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

    /**
     * The OIDC configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-openidconnectconfig)
     */
    public fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

    /**
     * The Amazon Cognito user pool configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-userpoolconfig)
     */
    public fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()

    /**
     * A builder for [AdditionalAuthenticationProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationType The authentication type for API key, AWS Identity and Access
       * Management , OIDC, Amazon Cognito user pools , or AWS Lambda . 
       * Valid Values: `API_KEY` | `AWS_IAM` | `OPENID_CONNECT` | `AMAZON_COGNITO_USER_POOLS` |
       * `AWS_LAMBDA`
       */
      public fun authenticationType(authenticationType: String)

      /**
       * @param lambdaAuthorizerConfig Configuration for AWS Lambda function authorization.
       */
      public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable)

      /**
       * @param lambdaAuthorizerConfig Configuration for AWS Lambda function authorization.
       */
      public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty)

      /**
       * @param lambdaAuthorizerConfig Configuration for AWS Lambda function authorization.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c725c71f314c4bd56eb2b17f58b70b2d257681b61ea70bc4693e8c8a18bfd3e")
      public
          fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty.Builder.() -> Unit)

      /**
       * @param openIdConnectConfig The OIDC configuration.
       */
      public fun openIdConnectConfig(openIdConnectConfig: IResolvable)

      /**
       * @param openIdConnectConfig The OIDC configuration.
       */
      public fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty)

      /**
       * @param openIdConnectConfig The OIDC configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9498b6b157ad96b3b0958064168aed6238968a8c43d4575f26c6084b6c2f039")
      public
          fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty.Builder.() -> Unit)

      /**
       * @param userPoolConfig The Amazon Cognito user pool configuration.
       */
      public fun userPoolConfig(userPoolConfig: IResolvable)

      /**
       * @param userPoolConfig The Amazon Cognito user pool configuration.
       */
      public fun userPoolConfig(userPoolConfig: CognitoUserPoolConfigProperty)

      /**
       * @param userPoolConfig The Amazon Cognito user pool configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b11fb0086d77979f441505f9978f2cde9cb032a3d2b086df92ff5a5070e180d0")
      public fun userPoolConfig(userPoolConfig: CognitoUserPoolConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty.builder()

      /**
       * @param authenticationType The authentication type for API key, AWS Identity and Access
       * Management , OIDC, Amazon Cognito user pools , or AWS Lambda . 
       * Valid Values: `API_KEY` | `AWS_IAM` | `OPENID_CONNECT` | `AMAZON_COGNITO_USER_POOLS` |
       * `AWS_LAMBDA`
       */
      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      /**
       * @param lambdaAuthorizerConfig Configuration for AWS Lambda function authorization.
       */
      override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaAuthorizerConfig Configuration for AWS Lambda function authorization.
       */
      override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(LambdaAuthorizerConfigProperty::unwrap))
      }

      /**
       * @param lambdaAuthorizerConfig Configuration for AWS Lambda function authorization.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c725c71f314c4bd56eb2b17f58b70b2d257681b61ea70bc4693e8c8a18bfd3e")
      override
          fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigProperty.Builder.() -> Unit):
          Unit = lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty(lambdaAuthorizerConfig))

      /**
       * @param openIdConnectConfig The OIDC configuration.
       */
      override fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(IResolvable::unwrap))
      }

      /**
       * @param openIdConnectConfig The OIDC configuration.
       */
      override fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(OpenIDConnectConfigProperty::unwrap))
      }

      /**
       * @param openIdConnectConfig The OIDC configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9498b6b157ad96b3b0958064168aed6238968a8c43d4575f26c6084b6c2f039")
      override
          fun openIdConnectConfig(openIdConnectConfig: OpenIDConnectConfigProperty.Builder.() -> Unit):
          Unit = openIdConnectConfig(OpenIDConnectConfigProperty(openIdConnectConfig))

      /**
       * @param userPoolConfig The Amazon Cognito user pool configuration.
       */
      override fun userPoolConfig(userPoolConfig: IResolvable) {
        cdkBuilder.userPoolConfig(userPoolConfig.let(IResolvable::unwrap))
      }

      /**
       * @param userPoolConfig The Amazon Cognito user pool configuration.
       */
      override fun userPoolConfig(userPoolConfig: CognitoUserPoolConfigProperty) {
        cdkBuilder.userPoolConfig(userPoolConfig.let(CognitoUserPoolConfigProperty::unwrap))
      }

      /**
       * @param userPoolConfig The Amazon Cognito user pool configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b11fb0086d77979f441505f9978f2cde9cb032a3d2b086df92ff5a5070e180d0")
      override fun userPoolConfig(userPoolConfig: CognitoUserPoolConfigProperty.Builder.() -> Unit):
          Unit = userPoolConfig(CognitoUserPoolConfigProperty(userPoolConfig))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty,
    ) : CdkObject(cdkObject), AdditionalAuthenticationProviderProperty {
      /**
       * The authentication type for API key, AWS Identity and Access Management , OIDC, Amazon
       * Cognito user pools , or AWS Lambda .
       *
       * Valid Values: `API_KEY` | `AWS_IAM` | `OPENID_CONNECT` | `AMAZON_COGNITO_USER_POOLS` |
       * `AWS_LAMBDA`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-authenticationtype)
       */
      override fun authenticationType(): String = unwrap(this).getAuthenticationType()

      /**
       * Configuration for AWS Lambda function authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-lambdaauthorizerconfig)
       */
      override fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

      /**
       * The OIDC configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-openidconnectconfig)
       */
      override fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

      /**
       * The Amazon Cognito user pool configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-userpoolconfig)
       */
      override fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdditionalAuthenticationProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty):
          AdditionalAuthenticationProviderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdditionalAuthenticationProviderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalAuthenticationProviderProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty
    }
  }

  /**
   * Configuration for AWS Lambda function authorization.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * LambdaAuthorizerConfigProperty lambdaAuthorizerConfigProperty =
   * LambdaAuthorizerConfigProperty.builder()
   * .authorizerResultTtlInSeconds(123)
   * .authorizerUri("authorizerUri")
   * .identityValidationExpression("identityValidationExpression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html)
   */
  public interface LambdaAuthorizerConfigProperty {
    /**
     * The number of seconds a response should be cached for.
     *
     * The default is 0 seconds, which disables caching. If you don't specify a value for
     * `authorizerResultTtlInSeconds` , the default value is used. The maximum value is one hour (3600
     * seconds). The Lambda function can override this by returning a `ttlOverride` key in its
     * response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig-authorizerresultttlinseconds)
     */
    public fun authorizerResultTtlInSeconds(): Number? =
        unwrap(this).getAuthorizerResultTtlInSeconds()

    /**
     * The ARN of the Lambda function to be called for authorization.
     *
     * This may be a standard Lambda ARN, a version ARN ( `.../v3` ) or alias ARN.
     *
     * *Note* : This Lambda function must have the following resource-based policy assigned to it.
     * When configuring Lambda authorizers in the console, this is done for you. To do so with the AWS
     * CLI , run the following:
     *
     * `aws lambda add-permission --function-name
     * "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id
     * "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig-authorizeruri)
     */
    public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

    /**
     * A regular expression for validation of tokens before the Lambda function is called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig-identityvalidationexpression)
     */
    public fun identityValidationExpression(): String? =
        unwrap(this).getIdentityValidationExpression()

    /**
     * A builder for [LambdaAuthorizerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizerResultTtlInSeconds The number of seconds a response should be cached for.
       * The default is 0 seconds, which disables caching. If you don't specify a value for
       * `authorizerResultTtlInSeconds` , the default value is used. The maximum value is one hour
       * (3600 seconds). The Lambda function can override this by returning a `ttlOverride` key in its
       * response.
       */
      public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number)

      /**
       * @param authorizerUri The ARN of the Lambda function to be called for authorization.
       * This may be a standard Lambda ARN, a version ARN ( `.../v3` ) or alias ARN.
       *
       * *Note* : This Lambda function must have the following resource-based policy assigned to it.
       * When configuring Lambda authorizers in the console, this is done for you. To do so with the
       * AWS CLI , run the following:
       *
       * `aws lambda add-permission --function-name
       * "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id
       * "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction`
       */
      public fun authorizerUri(authorizerUri: String)

      /**
       * @param identityValidationExpression A regular expression for validation of tokens before
       * the Lambda function is called.
       */
      public fun identityValidationExpression(identityValidationExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty.builder()

      /**
       * @param authorizerResultTtlInSeconds The number of seconds a response should be cached for.
       * The default is 0 seconds, which disables caching. If you don't specify a value for
       * `authorizerResultTtlInSeconds` , the default value is used. The maximum value is one hour
       * (3600 seconds). The Lambda function can override this by returning a `ttlOverride` key in its
       * response.
       */
      override fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
        cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
      }

      /**
       * @param authorizerUri The ARN of the Lambda function to be called for authorization.
       * This may be a standard Lambda ARN, a version ARN ( `.../v3` ) or alias ARN.
       *
       * *Note* : This Lambda function must have the following resource-based policy assigned to it.
       * When configuring Lambda authorizers in the console, this is done for you. To do so with the
       * AWS CLI , run the following:
       *
       * `aws lambda add-permission --function-name
       * "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id
       * "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction`
       */
      override fun authorizerUri(authorizerUri: String) {
        cdkBuilder.authorizerUri(authorizerUri)
      }

      /**
       * @param identityValidationExpression A regular expression for validation of tokens before
       * the Lambda function is called.
       */
      override fun identityValidationExpression(identityValidationExpression: String) {
        cdkBuilder.identityValidationExpression(identityValidationExpression)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty,
    ) : CdkObject(cdkObject), LambdaAuthorizerConfigProperty {
      /**
       * The number of seconds a response should be cached for.
       *
       * The default is 0 seconds, which disables caching. If you don't specify a value for
       * `authorizerResultTtlInSeconds` , the default value is used. The maximum value is one hour
       * (3600 seconds). The Lambda function can override this by returning a `ttlOverride` key in its
       * response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig-authorizerresultttlinseconds)
       */
      override fun authorizerResultTtlInSeconds(): Number? =
          unwrap(this).getAuthorizerResultTtlInSeconds()

      /**
       * The ARN of the Lambda function to be called for authorization.
       *
       * This may be a standard Lambda ARN, a version ARN ( `.../v3` ) or alias ARN.
       *
       * *Note* : This Lambda function must have the following resource-based policy assigned to it.
       * When configuring Lambda authorizers in the console, this is done for you. To do so with the
       * AWS CLI , run the following:
       *
       * `aws lambda add-permission --function-name
       * "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id
       * "appsync" --principal appsync.amazonaws.com --action lambda:InvokeFunction`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig-authorizeruri)
       */
      override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

      /**
       * A regular expression for validation of tokens before the Lambda function is called.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig-identityvalidationexpression)
       */
      override fun identityValidationExpression(): String? =
          unwrap(this).getIdentityValidationExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaAuthorizerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty):
          LambdaAuthorizerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LambdaAuthorizerConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaAuthorizerConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty
    }
  }

  /**
   * The `OpenIDConnectConfig` property type specifies the optional authorization configuration for
   * using an OpenID Connect compliant service with your GraphQL endpoint for an AWS AppSync GraphQL
   * API.
   *
   * `OpenIDConnectConfig` is a property of the
   * [AWS::AppSync::GraphQLApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * OpenIDConnectConfigProperty openIDConnectConfigProperty = OpenIDConnectConfigProperty.builder()
   * .authTtl(123)
   * .clientId("clientId")
   * .iatTtl(123)
   * .issuer("issuer")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html)
   */
  public interface OpenIDConnectConfigProperty {
    /**
     * The number of milliseconds that a token is valid after being authenticated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl)
     */
    public fun authTtl(): Number? = unwrap(this).getAuthTtl()

    /**
     * The client identifier of the Relying party at the OpenID identity provider.
     *
     * This identifier is typically obtained when the Relying party is registered with the OpenID
     * identity provider. You can specify a regular expression so that AWS AppSync can validate against
     * multiple client identifiers at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid)
     */
    public fun clientId(): String? = unwrap(this).getClientId()

    /**
     * The number of milliseconds that a token is valid after it's issued to a user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl)
     */
    public fun iatTtl(): Number? = unwrap(this).getIatTtl()

    /**
     * The issuer for the OIDC configuration.
     *
     * The issuer returned by discovery must exactly match the value of `iss` in the ID token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer)
     */
    public fun issuer(): String? = unwrap(this).getIssuer()

    /**
     * A builder for [OpenIDConnectConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authTtl The number of milliseconds that a token is valid after being authenticated.
       */
      public fun authTtl(authTtl: Number)

      /**
       * @param clientId The client identifier of the Relying party at the OpenID identity provider.
       * This identifier is typically obtained when the Relying party is registered with the OpenID
       * identity provider. You can specify a regular expression so that AWS AppSync can validate
       * against multiple client identifiers at a time.
       */
      public fun clientId(clientId: String)

      /**
       * @param iatTtl The number of milliseconds that a token is valid after it's issued to a user.
       */
      public fun iatTtl(iatTtl: Number)

      /**
       * @param issuer The issuer for the OIDC configuration.
       * The issuer returned by discovery must exactly match the value of `iss` in the ID token.
       */
      public fun issuer(issuer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty.builder()

      /**
       * @param authTtl The number of milliseconds that a token is valid after being authenticated.
       */
      override fun authTtl(authTtl: Number) {
        cdkBuilder.authTtl(authTtl)
      }

      /**
       * @param clientId The client identifier of the Relying party at the OpenID identity provider.
       * This identifier is typically obtained when the Relying party is registered with the OpenID
       * identity provider. You can specify a regular expression so that AWS AppSync can validate
       * against multiple client identifiers at a time.
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param iatTtl The number of milliseconds that a token is valid after it's issued to a user.
       */
      override fun iatTtl(iatTtl: Number) {
        cdkBuilder.iatTtl(iatTtl)
      }

      /**
       * @param issuer The issuer for the OIDC configuration.
       * The issuer returned by discovery must exactly match the value of `iss` in the ID token.
       */
      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty,
    ) : CdkObject(cdkObject), OpenIDConnectConfigProperty {
      /**
       * The number of milliseconds that a token is valid after being authenticated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl)
       */
      override fun authTtl(): Number? = unwrap(this).getAuthTtl()

      /**
       * The client identifier of the Relying party at the OpenID identity provider.
       *
       * This identifier is typically obtained when the Relying party is registered with the OpenID
       * identity provider. You can specify a regular expression so that AWS AppSync can validate
       * against multiple client identifiers at a time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid)
       */
      override fun clientId(): String? = unwrap(this).getClientId()

      /**
       * The number of milliseconds that a token is valid after it's issued to a user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl)
       */
      override fun iatTtl(): Number? = unwrap(this).getIatTtl()

      /**
       * The issuer for the OIDC configuration.
       *
       * The issuer returned by discovery must exactly match the value of `iss` in the ID token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer)
       */
      override fun issuer(): String? = unwrap(this).getIssuer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenIDConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty):
          OpenIDConnectConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenIDConnectConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenIDConnectConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty
    }
  }

  /**
   * Describes an Amazon Cognito user pool configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * CognitoUserPoolConfigProperty cognitoUserPoolConfigProperty =
   * CognitoUserPoolConfigProperty.builder()
   * .appIdClientRegex("appIdClientRegex")
   * .awsRegion("awsRegion")
   * .userPoolId("userPoolId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html)
   */
  public interface CognitoUserPoolConfigProperty {
    /**
     * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     *
     * If this value isn't set, no filtering is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html#cfn-appsync-graphqlapi-cognitouserpoolconfig-appidclientregex)
     */
    public fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

    /**
     * The AWS Region in which the user pool was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html#cfn-appsync-graphqlapi-cognitouserpoolconfig-awsregion)
     */
    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html#cfn-appsync-graphqlapi-cognitouserpoolconfig-userpoolid)
     */
    public fun userPoolId(): String? = unwrap(this).getUserPoolId()

    /**
     * A builder for [CognitoUserPoolConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appIdClientRegex A regular expression for validating the incoming Amazon Cognito
       * user pool app client ID.
       * If this value isn't set, no filtering is applied.
       */
      public fun appIdClientRegex(appIdClientRegex: String)

      /**
       * @param awsRegion The AWS Region in which the user pool was created.
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param userPoolId The user pool ID.
       */
      public fun userPoolId(userPoolId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty.builder()

      /**
       * @param appIdClientRegex A regular expression for validating the incoming Amazon Cognito
       * user pool app client ID.
       * If this value isn't set, no filtering is applied.
       */
      override fun appIdClientRegex(appIdClientRegex: String) {
        cdkBuilder.appIdClientRegex(appIdClientRegex)
      }

      /**
       * @param awsRegion The AWS Region in which the user pool was created.
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param userPoolId The user pool ID.
       */
      override fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty,
    ) : CdkObject(cdkObject), CognitoUserPoolConfigProperty {
      /**
       * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
       *
       * If this value isn't set, no filtering is applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html#cfn-appsync-graphqlapi-cognitouserpoolconfig-appidclientregex)
       */
      override fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

      /**
       * The AWS Region in which the user pool was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html#cfn-appsync-graphqlapi-cognitouserpoolconfig-awsregion)
       */
      override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      /**
       * The user pool ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html#cfn-appsync-graphqlapi-cognitouserpoolconfig-userpoolid)
       */
      override fun userPoolId(): String? = unwrap(this).getUserPoolId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoUserPoolConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty):
          CognitoUserPoolConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CognitoUserPoolConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoUserPoolConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty
    }
  }

  /**
   * The `UserPoolConfig` property type specifies the optional authorization configuration for using
   * Amazon Cognito user pools with your GraphQL endpoint for an AWS AppSync GraphQL API.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * UserPoolConfigProperty userPoolConfigProperty = UserPoolConfigProperty.builder()
   * .appIdClientRegex("appIdClientRegex")
   * .awsRegion("awsRegion")
   * .defaultAction("defaultAction")
   * .userPoolId("userPoolId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html)
   */
  public interface UserPoolConfigProperty {
    /**
     * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
     *
     * If this value isn't set, no filtering is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex)
     */
    public fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

    /**
     * The AWS Region in which the user pool was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion)
     */
    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    /**
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito
     * user pool authentication doesn't match the Amazon Cognito user pool configuration.
     *
     * When specifying Amazon Cognito user pools as the default authentication, you must set the
     * value for `DefaultAction` to `ALLOW` if specifying `AdditionalAuthenticationProviders` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction)
     */
    public fun defaultAction(): String? = unwrap(this).getDefaultAction()

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid)
     */
    public fun userPoolId(): String? = unwrap(this).getUserPoolId()

    /**
     * A builder for [UserPoolConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appIdClientRegex A regular expression for validating the incoming Amazon Cognito
       * user pool app client ID.
       * If this value isn't set, no filtering is applied.
       */
      public fun appIdClientRegex(appIdClientRegex: String)

      /**
       * @param awsRegion The AWS Region in which the user pool was created.
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param defaultAction The action that you want your GraphQL API to take when a request that
       * uses Amazon Cognito user pool authentication doesn't match the Amazon Cognito user pool
       * configuration.
       * When specifying Amazon Cognito user pools as the default authentication, you must set the
       * value for `DefaultAction` to `ALLOW` if specifying `AdditionalAuthenticationProviders` .
       */
      public fun defaultAction(defaultAction: String)

      /**
       * @param userPoolId The user pool ID.
       */
      public fun userPoolId(userPoolId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.builder()

      /**
       * @param appIdClientRegex A regular expression for validating the incoming Amazon Cognito
       * user pool app client ID.
       * If this value isn't set, no filtering is applied.
       */
      override fun appIdClientRegex(appIdClientRegex: String) {
        cdkBuilder.appIdClientRegex(appIdClientRegex)
      }

      /**
       * @param awsRegion The AWS Region in which the user pool was created.
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param defaultAction The action that you want your GraphQL API to take when a request that
       * uses Amazon Cognito user pool authentication doesn't match the Amazon Cognito user pool
       * configuration.
       * When specifying Amazon Cognito user pools as the default authentication, you must set the
       * value for `DefaultAction` to `ALLOW` if specifying `AdditionalAuthenticationProviders` .
       */
      override fun defaultAction(defaultAction: String) {
        cdkBuilder.defaultAction(defaultAction)
      }

      /**
       * @param userPoolId The user pool ID.
       */
      override fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty,
    ) : CdkObject(cdkObject), UserPoolConfigProperty {
      /**
       * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
       *
       * If this value isn't set, no filtering is applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex)
       */
      override fun appIdClientRegex(): String? = unwrap(this).getAppIdClientRegex()

      /**
       * The AWS Region in which the user pool was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion)
       */
      override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      /**
       * The action that you want your GraphQL API to take when a request that uses Amazon Cognito
       * user pool authentication doesn't match the Amazon Cognito user pool configuration.
       *
       * When specifying Amazon Cognito user pools as the default authentication, you must set the
       * value for `DefaultAction` to `ALLOW` if specifying `AdditionalAuthenticationProviders` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction)
       */
      override fun defaultAction(): String? = unwrap(this).getDefaultAction()

      /**
       * The user pool ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid)
       */
      override fun userPoolId(): String? = unwrap(this).getUserPoolId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty):
          UserPoolConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? UserPoolConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPoolConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty
    }
  }

  /**
   * Describes an enhanced metrics configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * EnhancedMetricsConfigProperty enhancedMetricsConfigProperty =
   * EnhancedMetricsConfigProperty.builder()
   * .dataSourceLevelMetricsBehavior("dataSourceLevelMetricsBehavior")
   * .operationLevelMetricsConfig("operationLevelMetricsConfig")
   * .resolverLevelMetricsBehavior("resolverLevelMetricsBehavior")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-enhancedmetricsconfig.html)
   */
  public interface EnhancedMetricsConfigProperty {
    /**
     * Controls how data source metrics will be emitted to CloudWatch. Data source metrics include:.
     *
     * * *Requests* : The number of invocations that occured during a request.
     * * *Latency* : The time to complete a data source invocation.
     * * *Errors* : The number of errors that occurred during a data source invocation.
     *
     * These metrics can be emitted to CloudWatch per data source or for all data sources in the
     * request. Metrics will be recorded by API ID and data source name.
     * `dataSourceLevelMetricsBehavior` accepts one of these values at a time:
     *
     * * `FULL_REQUEST_DATA_SOURCE_METRICS` : Records and emits metric data for all data sources in
     * the request.
     * * `PER_DATA_SOURCE_METRICS` : Records and emits metric data for data sources that have the
     * `MetricsConfig` value set to `ENABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-enhancedmetricsconfig.html#cfn-appsync-graphqlapi-enhancedmetricsconfig-datasourcelevelmetricsbehavior)
     */
    public fun dataSourceLevelMetricsBehavior(): String

    /**
     * Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:.
     *
     * * *Requests* : The number of times a specified GraphQL operation was called.
     * * *GraphQL errors* : The number of GraphQL errors that occurred during a specified GraphQL
     * operation.
     *
     * Metrics will be recorded by API ID and operation name. You can set the value to `ENABLED` or
     * `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-enhancedmetricsconfig.html#cfn-appsync-graphqlapi-enhancedmetricsconfig-operationlevelmetricsconfig)
     */
    public fun operationLevelMetricsConfig(): String

    /**
     * Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:.
     *
     * * *GraphQL errors* : The number of GraphQL errors that occurred.
     * * *Requests* : The number of invocations that occurred during a request.
     * * *Latency* : The time to complete a resolver invocation.
     * * *Cache hits* : The number of cache hits during a request.
     * * *Cache misses* : The number of cache misses during a request.
     *
     * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the request.
     * Metrics will be recorded by API ID and resolver name. `resolverLevelMetricsBehavior` accepts one
     * of these values at a time:
     *
     * * `FULL_REQUEST_RESOLVER_METRICS` : Records and emits metric data for all resolvers in the
     * request.
     * * `PER_RESOLVER_METRICS` : Records and emits metric data for resolvers that have the
     * `MetricsConfig` value set to `ENABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-enhancedmetricsconfig.html#cfn-appsync-graphqlapi-enhancedmetricsconfig-resolverlevelmetricsbehavior)
     */
    public fun resolverLevelMetricsBehavior(): String

    /**
     * A builder for [EnhancedMetricsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSourceLevelMetricsBehavior Controls how data source metrics will be emitted to
       * CloudWatch. Data source metrics include:. 
       * * *Requests* : The number of invocations that occured during a request.
       * * *Latency* : The time to complete a data source invocation.
       * * *Errors* : The number of errors that occurred during a data source invocation.
       *
       * These metrics can be emitted to CloudWatch per data source or for all data sources in the
       * request. Metrics will be recorded by API ID and data source name.
       * `dataSourceLevelMetricsBehavior` accepts one of these values at a time:
       *
       * * `FULL_REQUEST_DATA_SOURCE_METRICS` : Records and emits metric data for all data sources
       * in the request.
       * * `PER_DATA_SOURCE_METRICS` : Records and emits metric data for data sources that have the
       * `MetricsConfig` value set to `ENABLED` .
       */
      public fun dataSourceLevelMetricsBehavior(dataSourceLevelMetricsBehavior: String)

      /**
       * @param operationLevelMetricsConfig Controls how operation metrics will be emitted to
       * CloudWatch. Operation metrics include:. 
       * * *Requests* : The number of times a specified GraphQL operation was called.
       * * *GraphQL errors* : The number of GraphQL errors that occurred during a specified GraphQL
       * operation.
       *
       * Metrics will be recorded by API ID and operation name. You can set the value to `ENABLED`
       * or `DISABLED` .
       */
      public fun operationLevelMetricsConfig(operationLevelMetricsConfig: String)

      /**
       * @param resolverLevelMetricsBehavior Controls how resolver metrics will be emitted to
       * CloudWatch. Resolver metrics include:. 
       * * *GraphQL errors* : The number of GraphQL errors that occurred.
       * * *Requests* : The number of invocations that occurred during a request.
       * * *Latency* : The time to complete a resolver invocation.
       * * *Cache hits* : The number of cache hits during a request.
       * * *Cache misses* : The number of cache misses during a request.
       *
       * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the
       * request. Metrics will be recorded by API ID and resolver name. `resolverLevelMetricsBehavior`
       * accepts one of these values at a time:
       *
       * * `FULL_REQUEST_RESOLVER_METRICS` : Records and emits metric data for all resolvers in the
       * request.
       * * `PER_RESOLVER_METRICS` : Records and emits metric data for resolvers that have the
       * `MetricsConfig` value set to `ENABLED` .
       */
      public fun resolverLevelMetricsBehavior(resolverLevelMetricsBehavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty.builder()

      /**
       * @param dataSourceLevelMetricsBehavior Controls how data source metrics will be emitted to
       * CloudWatch. Data source metrics include:. 
       * * *Requests* : The number of invocations that occured during a request.
       * * *Latency* : The time to complete a data source invocation.
       * * *Errors* : The number of errors that occurred during a data source invocation.
       *
       * These metrics can be emitted to CloudWatch per data source or for all data sources in the
       * request. Metrics will be recorded by API ID and data source name.
       * `dataSourceLevelMetricsBehavior` accepts one of these values at a time:
       *
       * * `FULL_REQUEST_DATA_SOURCE_METRICS` : Records and emits metric data for all data sources
       * in the request.
       * * `PER_DATA_SOURCE_METRICS` : Records and emits metric data for data sources that have the
       * `MetricsConfig` value set to `ENABLED` .
       */
      override fun dataSourceLevelMetricsBehavior(dataSourceLevelMetricsBehavior: String) {
        cdkBuilder.dataSourceLevelMetricsBehavior(dataSourceLevelMetricsBehavior)
      }

      /**
       * @param operationLevelMetricsConfig Controls how operation metrics will be emitted to
       * CloudWatch. Operation metrics include:. 
       * * *Requests* : The number of times a specified GraphQL operation was called.
       * * *GraphQL errors* : The number of GraphQL errors that occurred during a specified GraphQL
       * operation.
       *
       * Metrics will be recorded by API ID and operation name. You can set the value to `ENABLED`
       * or `DISABLED` .
       */
      override fun operationLevelMetricsConfig(operationLevelMetricsConfig: String) {
        cdkBuilder.operationLevelMetricsConfig(operationLevelMetricsConfig)
      }

      /**
       * @param resolverLevelMetricsBehavior Controls how resolver metrics will be emitted to
       * CloudWatch. Resolver metrics include:. 
       * * *GraphQL errors* : The number of GraphQL errors that occurred.
       * * *Requests* : The number of invocations that occurred during a request.
       * * *Latency* : The time to complete a resolver invocation.
       * * *Cache hits* : The number of cache hits during a request.
       * * *Cache misses* : The number of cache misses during a request.
       *
       * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the
       * request. Metrics will be recorded by API ID and resolver name. `resolverLevelMetricsBehavior`
       * accepts one of these values at a time:
       *
       * * `FULL_REQUEST_RESOLVER_METRICS` : Records and emits metric data for all resolvers in the
       * request.
       * * `PER_RESOLVER_METRICS` : Records and emits metric data for resolvers that have the
       * `MetricsConfig` value set to `ENABLED` .
       */
      override fun resolverLevelMetricsBehavior(resolverLevelMetricsBehavior: String) {
        cdkBuilder.resolverLevelMetricsBehavior(resolverLevelMetricsBehavior)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty,
    ) : CdkObject(cdkObject), EnhancedMetricsConfigProperty {
      /**
       * Controls how data source metrics will be emitted to CloudWatch. Data source metrics
       * include:.
       *
       * * *Requests* : The number of invocations that occured during a request.
       * * *Latency* : The time to complete a data source invocation.
       * * *Errors* : The number of errors that occurred during a data source invocation.
       *
       * These metrics can be emitted to CloudWatch per data source or for all data sources in the
       * request. Metrics will be recorded by API ID and data source name.
       * `dataSourceLevelMetricsBehavior` accepts one of these values at a time:
       *
       * * `FULL_REQUEST_DATA_SOURCE_METRICS` : Records and emits metric data for all data sources
       * in the request.
       * * `PER_DATA_SOURCE_METRICS` : Records and emits metric data for data sources that have the
       * `MetricsConfig` value set to `ENABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-enhancedmetricsconfig.html#cfn-appsync-graphqlapi-enhancedmetricsconfig-datasourcelevelmetricsbehavior)
       */
      override fun dataSourceLevelMetricsBehavior(): String =
          unwrap(this).getDataSourceLevelMetricsBehavior()

      /**
       * Controls how operation metrics will be emitted to CloudWatch. Operation metrics include:.
       *
       * * *Requests* : The number of times a specified GraphQL operation was called.
       * * *GraphQL errors* : The number of GraphQL errors that occurred during a specified GraphQL
       * operation.
       *
       * Metrics will be recorded by API ID and operation name. You can set the value to `ENABLED`
       * or `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-enhancedmetricsconfig.html#cfn-appsync-graphqlapi-enhancedmetricsconfig-operationlevelmetricsconfig)
       */
      override fun operationLevelMetricsConfig(): String =
          unwrap(this).getOperationLevelMetricsConfig()

      /**
       * Controls how resolver metrics will be emitted to CloudWatch. Resolver metrics include:.
       *
       * * *GraphQL errors* : The number of GraphQL errors that occurred.
       * * *Requests* : The number of invocations that occurred during a request.
       * * *Latency* : The time to complete a resolver invocation.
       * * *Cache hits* : The number of cache hits during a request.
       * * *Cache misses* : The number of cache misses during a request.
       *
       * These metrics can be emitted to CloudWatch per resolver or for all resolvers in the
       * request. Metrics will be recorded by API ID and resolver name. `resolverLevelMetricsBehavior`
       * accepts one of these values at a time:
       *
       * * `FULL_REQUEST_RESOLVER_METRICS` : Records and emits metric data for all resolvers in the
       * request.
       * * `PER_RESOLVER_METRICS` : Records and emits metric data for resolvers that have the
       * `MetricsConfig` value set to `ENABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-enhancedmetricsconfig.html#cfn-appsync-graphqlapi-enhancedmetricsconfig-resolverlevelmetricsbehavior)
       */
      override fun resolverLevelMetricsBehavior(): String =
          unwrap(this).getResolverLevelMetricsBehavior()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnhancedMetricsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty):
          EnhancedMetricsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnhancedMetricsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnhancedMetricsConfigProperty):
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnGraphQLApi.EnhancedMetricsConfigProperty
    }
  }
}
