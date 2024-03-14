package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGraphQLApiProps {
  /**
   * A list of additional authentication providers for the `GraphqlApi` API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-additionalauthenticationproviders)
   */
  public fun additionalAuthenticationProviders(): Any? =
      unwrap(this).getAdditionalAuthenticationProviders()

  /**
   * The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL` ) or merged API
   * ( `MERGED` ).
   *
   * *WARNING* : If the `ApiType` has not been defined, *explicitly* setting it to `GRAPHQL` in a
   * template/stack update will result in an API replacement and new DNS values.
   *
   * The following values are valid:
   *
   * `GRAPHQL | MERGED`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-apitype)
   */
  public fun apiType(): String? = unwrap(this).getApiType()

  /**
   * Security configuration for your GraphQL API.
   *
   * For allowed values (such as `API_KEY` , `AWS_IAM` , `AMAZON_COGNITO_USER_POOLS` ,
   * `OPENID_CONNECT` , or `AWS_LAMBDA` ), see
   * [Security](https://docs.aws.amazon.com/appsync/latest/devguide/security.html) in the *AWS AppSync
   * Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype)
   */
  public fun authenticationType(): String

  /**
   * Enables and controls the enhanced metrics feature.
   *
   * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
   * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your CloudWatch
   * account, and you can configure the types of data that will be sent.
   *
   * Enhanced metrics can be configured at the resolver, data source, and operation levels. For more
   * information, see [Monitoring and
   * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
   * *AWS AppSync User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-enhancedmetricsconfig)
   */
  public fun enhancedMetricsConfig(): Any? = unwrap(this).getEnhancedMetricsConfig()

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
   */
  public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  /**
   *
   * If no value is provided, the introspection configuration will be set to `ENABLED` by default.
   * This field will produce an error if the operation attempts to use the introspection feature while
   * this field is disabled.
   *
   * For more information about introspection, see [GraphQL
   * introspection](https://docs.aws.amazon.com/https://graphql.org/learn/introspection/) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-introspectionconfig)
   */
  public fun introspectionConfig(): String? = unwrap(this).getIntrospectionConfig()

  /**
   * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access when
   * using the `AWS_LAMBDA` authorizer mode.
   *
   * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig)
   */
  public fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

  /**
   * The Amazon CloudWatch Logs configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
   */
  public fun logConfig(): Any? = unwrap(this).getLogConfig()

  /**
   * The AWS Identity and Access Management service role ARN for a merged API.
   *
   * The AppSync service assumes this role on behalf of the Merged API to validate access to source
   * APIs at runtime and to prompt the `AUTO_MERGE` to update the merged API endpoint with the source
   * API changes automatically.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-mergedapiexecutionrolearn)
   */
  public fun mergedApiExecutionRoleArn(): String? = unwrap(this).getMergedApiExecutionRoleArn()

  /**
   * The API name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name)
   */
  public fun name(): String

  /**
   * The OpenID Connect configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
   */
  public fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

  /**
   * The owner contact information for an API resource.
   *
   * This field accepts any string input with a length of 0 - 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-ownercontact)
   */
  public fun ownerContact(): String? = unwrap(this).getOwnerContact()

  /**
   * The maximum depth a query can have in a single request.
   *
   * Depth refers to the amount of nested levels allowed in the body of query. The default value is
   * `0` (or unspecified), which indicates there's no depth limit. If you set a limit, it can be
   * between `1` and `75` nested levels. This field will produce a limit error if the operation falls
   * out of bounds. Note that fields can still be set to nullable or non-nullable. If a non-nullable
   * field produces an error, the error will be thrown upwards to the first nullable field available.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-querydepthlimit)
   */
  public fun queryDepthLimit(): Number? = unwrap(this).getQueryDepthLimit()

  /**
   * The maximum number of resolvers that can be invoked in a single request.
   *
   * The default value is `0` (or unspecified), which will set the limit to `10000` . When
   * specified, the limit value can be between `1` and `10000` . This field will produce a limit error
   * if the operation falls out of bounds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-resolvercountlimit)
   */
  public fun resolverCountLimit(): Number? = unwrap(this).getResolverCountLimit()

  /**
   * An arbitrary set of tags (key-value pairs) for this GraphQL API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
   */
  public fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()

  /**
   * Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private ( `PRIVATE` ).
   *
   * By default, the scope is set to `Global` if no value is provided.
   *
   * *WARNING* : If `Visibility` has not been defined, *explicitly* setting it to `GLOBAL` in a
   * template/stack update will result in an API replacement and new DNS values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-visibility)
   */
  public fun visibility(): String? = unwrap(this).getVisibility()

  /**
   * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled)
   */
  public fun xrayEnabled(): Any? = unwrap(this).getXrayEnabled()

  /**
   * A builder for [CfnGraphQLApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API.
     */
    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable)

    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API.
     */
    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: List<Any>)

    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API.
     */
    public fun additionalAuthenticationProviders(vararg additionalAuthenticationProviders: Any)

    /**
     * @param apiType The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL`
     * ) or merged API ( `MERGED` ).
     * *WARNING* : If the `ApiType` has not been defined, *explicitly* setting it to `GRAPHQL` in a
     * template/stack update will result in an API replacement and new DNS values.
     *
     * The following values are valid:
     *
     * `GRAPHQL | MERGED`
     */
    public fun apiType(apiType: String)

    /**
     * @param authenticationType Security configuration for your GraphQL API. 
     * For allowed values (such as `API_KEY` , `AWS_IAM` , `AMAZON_COGNITO_USER_POOLS` ,
     * `OPENID_CONNECT` , or `AWS_LAMBDA` ), see
     * [Security](https://docs.aws.amazon.com/appsync/latest/devguide/security.html) in the *AWS
     * AppSync Developer Guide* .
     */
    public fun authenticationType(authenticationType: String)

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature.
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     */
    public fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable)

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature.
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     */
    public
        fun enhancedMetricsConfig(enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty)

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature.
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0efa0f39cce019574232dd75add87d04ee18d03c60f1dbda18e21794e6c20b1")
    public
        fun enhancedMetricsConfig(enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty.Builder.() -> Unit)

    /**
     * @param environmentVariables A map containing the list of resources with their properties and
     * environment variables.
     * For more information, see [Environmental
     * variables](https://docs.aws.amazon.com/appsync/latest/devguide/environmental-variables.html) .
     *
     * *Pattern* : `^[A-Za-z]+\\w*$\\`
     *
     * *Minimum* : 2
     *
     * *Maximum* : 64
     */
    public fun environmentVariables(environmentVariables: Any)

    /**
     * @param introspectionConfig Sets the value of the GraphQL API to enable ( `ENABLED` ) or
     * disable ( `DISABLED` ) introspection.
     * If no value is provided, the introspection configuration will be set to `ENABLED` by default.
     * This field will produce an error if the operation attempts to use the introspection feature
     * while this field is disabled.
     *
     * For more information about introspection, see [GraphQL
     * introspection](https://docs.aws.amazon.com/https://graphql.org/learn/introspection/) .
     */
    public fun introspectionConfig(introspectionConfig: String)

    /**
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode.
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     */
    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable)

    /**
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode.
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     */
    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty)

    /**
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode.
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eb76c1ec5d398128c9b07af4116598bba626361c451a0df93d8bfcda785edb0")
    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder.() -> Unit)

    /**
     * @param logConfig The Amazon CloudWatch Logs configuration.
     */
    public fun logConfig(logConfig: IResolvable)

    /**
     * @param logConfig The Amazon CloudWatch Logs configuration.
     */
    public fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty)

    /**
     * @param logConfig The Amazon CloudWatch Logs configuration.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de74a6546ba74cbad9f5040bb79d027d0bd1f18bbef73ff841a5f0241675204f")
    public fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty.Builder.() -> Unit)

    /**
     * @param mergedApiExecutionRoleArn The AWS Identity and Access Management service role ARN for
     * a merged API.
     * The AppSync service assumes this role on behalf of the Merged API to validate access to
     * source APIs at runtime and to prompt the `AUTO_MERGE` to update the merged API endpoint with the
     * source API changes automatically.
     */
    public fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String)

    /**
     * @param name The API name. 
     */
    public fun name(name: String)

    /**
     * @param openIdConnectConfig The OpenID Connect configuration.
     */
    public fun openIdConnectConfig(openIdConnectConfig: IResolvable)

    /**
     * @param openIdConnectConfig The OpenID Connect configuration.
     */
    public fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty)

    /**
     * @param openIdConnectConfig The OpenID Connect configuration.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d88378825460c8ca91d2d2bf9d9f2d5311246886798201fa77244444769e6353")
    public
        fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.() -> Unit)

    /**
     * @param ownerContact The owner contact information for an API resource.
     * This field accepts any string input with a length of 0 - 256 characters.
     */
    public fun ownerContact(ownerContact: String)

    /**
     * @param queryDepthLimit The maximum depth a query can have in a single request.
     * Depth refers to the amount of nested levels allowed in the body of query. The default value
     * is `0` (or unspecified), which indicates there's no depth limit. If you set a limit, it can be
     * between `1` and `75` nested levels. This field will produce a limit error if the operation falls
     * out of bounds. Note that fields can still be set to nullable or non-nullable. If a non-nullable
     * field produces an error, the error will be thrown upwards to the first nullable field available.
     */
    public fun queryDepthLimit(queryDepthLimit: Number)

    /**
     * @param resolverCountLimit The maximum number of resolvers that can be invoked in a single
     * request.
     * The default value is `0` (or unspecified), which will set the limit to `10000` . When
     * specified, the limit value can be between `1` and `10000` . This field will produce a limit
     * error if the operation falls out of bounds.
     */
    public fun resolverCountLimit(resolverCountLimit: Number)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint.
     */
    public fun userPoolConfig(userPoolConfig: IResolvable)

    /**
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint.
     */
    public fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty)

    /**
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("293d6aa648fb922aa813c180441e910a52a682312f7a05060ef891a5f134031c")
    public
        fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty.Builder.() -> Unit)

    /**
     * @param visibility Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private (
     * `PRIVATE` ).
     * By default, the scope is set to `Global` if no value is provided.
     *
     * *WARNING* : If `Visibility` has not been defined, *explicitly* setting it to `GLOBAL` in a
     * template/stack update will result in an API replacement and new DNS values.
     */
    public fun visibility(visibility: String)

    /**
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     */
    public fun xrayEnabled(xrayEnabled: Boolean)

    /**
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     */
    public fun xrayEnabled(xrayEnabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.Builder =
        software.amazon.awscdk.services.appsync.CfnGraphQLApiProps.builder()

    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API.
     */
    override fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable) {
      cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders.let(IResolvable::unwrap))
    }

    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API.
     */
    override fun additionalAuthenticationProviders(additionalAuthenticationProviders: List<Any>) {
      cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders)
    }

    /**
     * @param additionalAuthenticationProviders A list of additional authentication providers for
     * the `GraphqlApi` API.
     */
    override fun additionalAuthenticationProviders(vararg additionalAuthenticationProviders: Any):
        Unit = additionalAuthenticationProviders(additionalAuthenticationProviders.toList())

    /**
     * @param apiType The value that indicates whether the GraphQL API is a standard API ( `GRAPHQL`
     * ) or merged API ( `MERGED` ).
     * *WARNING* : If the `ApiType` has not been defined, *explicitly* setting it to `GRAPHQL` in a
     * template/stack update will result in an API replacement and new DNS values.
     *
     * The following values are valid:
     *
     * `GRAPHQL | MERGED`
     */
    override fun apiType(apiType: String) {
      cdkBuilder.apiType(apiType)
    }

    /**
     * @param authenticationType Security configuration for your GraphQL API. 
     * For allowed values (such as `API_KEY` , `AWS_IAM` , `AMAZON_COGNITO_USER_POOLS` ,
     * `OPENID_CONNECT` , or `AWS_LAMBDA` ), see
     * [Security](https://docs.aws.amazon.com/appsync/latest/devguide/security.html) in the *AWS
     * AppSync Developer Guide* .
     */
    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature.
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     */
    override fun enhancedMetricsConfig(enhancedMetricsConfig: IResolvable) {
      cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig.let(IResolvable::unwrap))
    }

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature.
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     */
    override
        fun enhancedMetricsConfig(enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty) {
      cdkBuilder.enhancedMetricsConfig(enhancedMetricsConfig.let(CfnGraphQLApi.EnhancedMetricsConfigProperty::unwrap))
    }

    /**
     * @param enhancedMetricsConfig Enables and controls the enhanced metrics feature.
     * Enhanced metrics emit granular data on API usage and performance such as AppSync request and
     * error counts, latency, and cache hits/misses. All enhanced metric data is sent to your
     * CloudWatch account, and you can configure the types of data that will be sent.
     *
     * Enhanced metrics can be configured at the resolver, data source, and operation levels. For
     * more information, see [Monitoring and
     * logging](https://docs.aws.amazon.com//appsync/latest/devguide/monitoring.html#cw-metrics) in the
     * *AWS AppSync User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0efa0f39cce019574232dd75add87d04ee18d03c60f1dbda18e21794e6c20b1")
    override
        fun enhancedMetricsConfig(enhancedMetricsConfig: CfnGraphQLApi.EnhancedMetricsConfigProperty.Builder.() -> Unit):
        Unit =
        enhancedMetricsConfig(CfnGraphQLApi.EnhancedMetricsConfigProperty(enhancedMetricsConfig))

    /**
     * @param environmentVariables A map containing the list of resources with their properties and
     * environment variables.
     * For more information, see [Environmental
     * variables](https://docs.aws.amazon.com/appsync/latest/devguide/environmental-variables.html) .
     *
     * *Pattern* : `^[A-Za-z]+\\w*$\\`
     *
     * *Minimum* : 2
     *
     * *Maximum* : 64
     */
    override fun environmentVariables(environmentVariables: Any) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param introspectionConfig Sets the value of the GraphQL API to enable ( `ENABLED` ) or
     * disable ( `DISABLED` ) introspection.
     * If no value is provided, the introspection configuration will be set to `ENABLED` by default.
     * This field will produce an error if the operation attempts to use the introspection feature
     * while this field is disabled.
     *
     * For more information about introspection, see [GraphQL
     * introspection](https://docs.aws.amazon.com/https://graphql.org/learn/introspection/) .
     */
    override fun introspectionConfig(introspectionConfig: String) {
      cdkBuilder.introspectionConfig(introspectionConfig)
    }

    /**
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode.
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     */
    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(IResolvable::unwrap))
    }

    /**
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode.
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     */
    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(CfnGraphQLApi.LambdaAuthorizerConfigProperty::unwrap))
    }

    /**
     * @param lambdaAuthorizerConfig A `LambdaAuthorizerConfig` holds configuration on how to
     * authorize AWS AppSync API access when using the `AWS_LAMBDA` authorizer mode.
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eb76c1ec5d398128c9b07af4116598bba626361c451a0df93d8bfcda785edb0")
    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder.() -> Unit):
        Unit =
        lambdaAuthorizerConfig(CfnGraphQLApi.LambdaAuthorizerConfigProperty(lambdaAuthorizerConfig))

    /**
     * @param logConfig The Amazon CloudWatch Logs configuration.
     */
    override fun logConfig(logConfig: IResolvable) {
      cdkBuilder.logConfig(logConfig.let(IResolvable::unwrap))
    }

    /**
     * @param logConfig The Amazon CloudWatch Logs configuration.
     */
    override fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty) {
      cdkBuilder.logConfig(logConfig.let(CfnGraphQLApi.LogConfigProperty::unwrap))
    }

    /**
     * @param logConfig The Amazon CloudWatch Logs configuration.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de74a6546ba74cbad9f5040bb79d027d0bd1f18bbef73ff841a5f0241675204f")
    override fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty.Builder.() -> Unit): Unit =
        logConfig(CfnGraphQLApi.LogConfigProperty(logConfig))

    /**
     * @param mergedApiExecutionRoleArn The AWS Identity and Access Management service role ARN for
     * a merged API.
     * The AppSync service assumes this role on behalf of the Merged API to validate access to
     * source APIs at runtime and to prompt the `AUTO_MERGE` to update the merged API endpoint with the
     * source API changes automatically.
     */
    override fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String) {
      cdkBuilder.mergedApiExecutionRoleArn(mergedApiExecutionRoleArn)
    }

    /**
     * @param name The API name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param openIdConnectConfig The OpenID Connect configuration.
     */
    override fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(IResolvable::unwrap))
    }

    /**
     * @param openIdConnectConfig The OpenID Connect configuration.
     */
    override
        fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(CfnGraphQLApi.OpenIDConnectConfigProperty::unwrap))
    }

    /**
     * @param openIdConnectConfig The OpenID Connect configuration.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d88378825460c8ca91d2d2bf9d9f2d5311246886798201fa77244444769e6353")
    override
        fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty.Builder.() -> Unit):
        Unit = openIdConnectConfig(CfnGraphQLApi.OpenIDConnectConfigProperty(openIdConnectConfig))

    /**
     * @param ownerContact The owner contact information for an API resource.
     * This field accepts any string input with a length of 0 - 256 characters.
     */
    override fun ownerContact(ownerContact: String) {
      cdkBuilder.ownerContact(ownerContact)
    }

    /**
     * @param queryDepthLimit The maximum depth a query can have in a single request.
     * Depth refers to the amount of nested levels allowed in the body of query. The default value
     * is `0` (or unspecified), which indicates there's no depth limit. If you set a limit, it can be
     * between `1` and `75` nested levels. This field will produce a limit error if the operation falls
     * out of bounds. Note that fields can still be set to nullable or non-nullable. If a non-nullable
     * field produces an error, the error will be thrown upwards to the first nullable field available.
     */
    override fun queryDepthLimit(queryDepthLimit: Number) {
      cdkBuilder.queryDepthLimit(queryDepthLimit)
    }

    /**
     * @param resolverCountLimit The maximum number of resolvers that can be invoked in a single
     * request.
     * The default value is `0` (or unspecified), which will set the limit to `10000` . When
     * specified, the limit value can be between `1` and `10000` . This field will produce a limit
     * error if the operation falls out of bounds.
     */
    override fun resolverCountLimit(resolverCountLimit: Number) {
      cdkBuilder.resolverCountLimit(resolverCountLimit)
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this GraphQL API.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint.
     */
    override fun userPoolConfig(userPoolConfig: IResolvable) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(IResolvable::unwrap))
    }

    /**
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint.
     */
    override fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(CfnGraphQLApi.UserPoolConfigProperty::unwrap))
    }

    /**
     * @param userPoolConfig Optional authorization configuration for using Amazon Cognito user
     * pools with your GraphQL endpoint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("293d6aa648fb922aa813c180441e910a52a682312f7a05060ef891a5f134031c")
    override
        fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty.Builder.() -> Unit):
        Unit = userPoolConfig(CfnGraphQLApi.UserPoolConfigProperty(userPoolConfig))

    /**
     * @param visibility Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private (
     * `PRIVATE` ).
     * By default, the scope is set to `Global` if no value is provided.
     *
     * *WARNING* : If `Visibility` has not been defined, *explicitly* setting it to `GLOBAL` in a
     * template/stack update will result in an API replacement and new DNS values.
     */
    override fun visibility(visibility: String) {
      cdkBuilder.visibility(visibility)
    }

    /**
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     */
    override fun xrayEnabled(xrayEnabled: Boolean) {
      cdkBuilder.xrayEnabled(xrayEnabled)
    }

    /**
     * @param xrayEnabled A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     */
    override fun xrayEnabled(xrayEnabled: IResolvable) {
      cdkBuilder.xrayEnabled(xrayEnabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApiProps,
  ) : CdkObject(cdkObject), CfnGraphQLApiProps {
    /**
     * A list of additional authentication providers for the `GraphqlApi` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-additionalauthenticationproviders)
     */
    override fun additionalAuthenticationProviders(): Any? =
        unwrap(this).getAdditionalAuthenticationProviders()

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
     */
    override fun apiType(): String? = unwrap(this).getApiType()

    /**
     * Security configuration for your GraphQL API.
     *
     * For allowed values (such as `API_KEY` , `AWS_IAM` , `AMAZON_COGNITO_USER_POOLS` ,
     * `OPENID_CONNECT` , or `AWS_LAMBDA` ), see
     * [Security](https://docs.aws.amazon.com/appsync/latest/devguide/security.html) in the *AWS
     * AppSync Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype)
     */
    override fun authenticationType(): String = unwrap(this).getAuthenticationType()

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
     */
    override fun enhancedMetricsConfig(): Any? = unwrap(this).getEnhancedMetricsConfig()

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
     */
    override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

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
     */
    override fun introspectionConfig(): String? = unwrap(this).getIntrospectionConfig()

    /**
     * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access
     * when using the `AWS_LAMBDA` authorizer mode.
     *
     * Be aware that an AWS AppSync API may have only one Lambda authorizer configured at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-lambdaauthorizerconfig)
     */
    override fun lambdaAuthorizerConfig(): Any? = unwrap(this).getLambdaAuthorizerConfig()

    /**
     * The Amazon CloudWatch Logs configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-logconfig)
     */
    override fun logConfig(): Any? = unwrap(this).getLogConfig()

    /**
     * The AWS Identity and Access Management service role ARN for a merged API.
     *
     * The AppSync service assumes this role on behalf of the Merged API to validate access to
     * source APIs at runtime and to prompt the `AUTO_MERGE` to update the merged API endpoint with the
     * source API changes automatically.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-mergedapiexecutionrolearn)
     */
    override fun mergedApiExecutionRoleArn(): String? = unwrap(this).getMergedApiExecutionRoleArn()

    /**
     * The API name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The OpenID Connect configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-openidconnectconfig)
     */
    override fun openIdConnectConfig(): Any? = unwrap(this).getOpenIdConnectConfig()

    /**
     * The owner contact information for an API resource.
     *
     * This field accepts any string input with a length of 0 - 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-ownercontact)
     */
    override fun ownerContact(): String? = unwrap(this).getOwnerContact()

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
     */
    override fun queryDepthLimit(): Number? = unwrap(this).getQueryDepthLimit()

    /**
     * The maximum number of resolvers that can be invoked in a single request.
     *
     * The default value is `0` (or unspecified), which will set the limit to `10000` . When
     * specified, the limit value can be between `1` and `10000` . This field will produce a limit
     * error if the operation falls out of bounds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-resolvercountlimit)
     */
    override fun resolverCountLimit(): Number? = unwrap(this).getResolverCountLimit()

    /**
     * An arbitrary set of tags (key-value pairs) for this GraphQL API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-userpoolconfig)
     */
    override fun userPoolConfig(): Any? = unwrap(this).getUserPoolConfig()

    /**
     * Sets the scope of the GraphQL API to public ( `GLOBAL` ) or private ( `PRIVATE` ).
     *
     * By default, the scope is set to `Global` if no value is provided.
     *
     * *WARNING* : If `Visibility` has not been defined, *explicitly* setting it to `GLOBAL` in a
     * template/stack update will result in an API replacement and new DNS values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-visibility)
     */
    override fun visibility(): String? = unwrap(this).getVisibility()

    /**
     * A flag indicating whether to use AWS X-Ray tracing for this `GraphqlApi` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled)
     */
    override fun xrayEnabled(): Any? = unwrap(this).getXrayEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGraphQLApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLApiProps):
        CfnGraphQLApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGraphQLApiProps):
        software.amazon.awscdk.services.appsync.CfnGraphQLApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnGraphQLApiProps
  }
}
