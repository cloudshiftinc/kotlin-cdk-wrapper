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

package io.cloudshiftdev.awscdkdsl.services.events

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.ApiDestination
import software.amazon.awscdk.services.events.ApiDestinationProps
import software.amazon.awscdk.services.events.Archive
import software.amazon.awscdk.services.events.ArchiveProps
import software.amazon.awscdk.services.events.BaseArchiveProps
import software.amazon.awscdk.services.events.CfnApiDestination
import software.amazon.awscdk.services.events.CfnApiDestinationProps
import software.amazon.awscdk.services.events.CfnArchive
import software.amazon.awscdk.services.events.CfnArchiveProps
import software.amazon.awscdk.services.events.CfnConnection
import software.amazon.awscdk.services.events.CfnConnectionProps
import software.amazon.awscdk.services.events.CfnEndpoint
import software.amazon.awscdk.services.events.CfnEndpointProps
import software.amazon.awscdk.services.events.CfnEventBus
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.amazon.awscdk.services.events.CfnEventBusPolicyProps
import software.amazon.awscdk.services.events.CfnEventBusProps
import software.amazon.awscdk.services.events.CfnRule
import software.amazon.awscdk.services.events.CfnRuleProps
import software.amazon.awscdk.services.events.ConnectionAttributes
import software.amazon.awscdk.services.events.ConnectionProps
import software.amazon.awscdk.services.events.CronOptions
import software.amazon.awscdk.services.events.EventBusAttributes
import software.amazon.awscdk.services.events.EventBusPolicy
import software.amazon.awscdk.services.events.EventBusPolicyProps
import software.amazon.awscdk.services.events.EventBusProps
import software.amazon.awscdk.services.events.EventCommonOptions
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IConnection
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.OAuthAuthorizationProps
import software.amazon.awscdk.services.events.OnEventOptions
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.RuleProps
import software.amazon.awscdk.services.events.RuleTargetConfig
import software.amazon.awscdk.services.events.RuleTargetInputProperties
import software.constructs.Construct

public object events {
    /**
     * Define an EventBridge Api Destination.
     *
     * Example:
     * ```
     * Connection connection = Connection.Builder.create(this, "Connection")
     * .authorization(Authorization.apiKey("x-api-key", SecretValue.secretsManager("ApiSecretName")))
     * .description("Connection with API Key x-api-key")
     * .build();
     * ApiDestination destination = ApiDestination.Builder.create(this, "Destination")
     * .connection(connection)
     * .endpoint("https://example.com")
     * .description("Calling example.com with API key x-api-key")
     * .build();
     * Rule rule = Rule.Builder.create(this, "Rule")
     * .schedule(Schedule.rate(Duration.minutes(1)))
     * .targets(List.of(new ApiDestination(destination)))
     * .build();
     * ```
     */
    public inline fun apiDestination(
        scope: Construct,
        id: String,
        block: ApiDestinationDsl.() -> Unit = {},
    ): ApiDestination {
        val builder = ApiDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The event API Destination properties.
     *
     * Example:
     * ```
     * Connection connection = Connection.Builder.create(this, "Connection")
     * .authorization(Authorization.apiKey("x-api-key", SecretValue.secretsManager("ApiSecretName")))
     * .description("Connection with API Key x-api-key")
     * .build();
     * ApiDestination destination = ApiDestination.Builder.create(this, "Destination")
     * .connection(connection)
     * .endpoint("https://example.com")
     * .description("Calling example.com with API key x-api-key")
     * .build();
     * Rule rule = Rule.Builder.create(this, "Rule")
     * .schedule(Schedule.rate(Duration.minutes(1)))
     * .targets(List.of(new ApiDestination(destination)))
     * .build();
     * ```
     */
    public inline fun apiDestinationProps(
        block: ApiDestinationPropsDsl.() -> Unit = {}
    ): ApiDestinationProps {
        val builder = ApiDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an EventBridge Archive.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.events.*;
     * Object detail;
     * EventBus eventBus;
     * Archive archive = Archive.Builder.create(this, "MyArchive")
     * .eventPattern(EventPattern.builder()
     * .account(List.of("account"))
     * .detail(Map.of(
     * "detailKey", detail))
     * .detailType(List.of("detailType"))
     * .id(List.of("id"))
     * .region(List.of("region"))
     * .resources(List.of("resources"))
     * .source(List.of("source"))
     * .time(List.of("time"))
     * .version(List.of("version"))
     * .build())
     * .sourceEventBus(eventBus)
     * // the properties below are optional
     * .archiveName("archiveName")
     * .description("description")
     * .retention(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun archive(
        scope: Construct,
        id: String,
        block: ArchiveDsl.() -> Unit = {},
    ): Archive {
        val builder = ArchiveDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The event archive properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.events.*;
     * Object detail;
     * EventBus eventBus;
     * ArchiveProps archiveProps = ArchiveProps.builder()
     * .eventPattern(EventPattern.builder()
     * .account(List.of("account"))
     * .detail(Map.of(
     * "detailKey", detail))
     * .detailType(List.of("detailType"))
     * .id(List.of("id"))
     * .region(List.of("region"))
     * .resources(List.of("resources"))
     * .source(List.of("source"))
     * .time(List.of("time"))
     * .version(List.of("version"))
     * .build())
     * .sourceEventBus(eventBus)
     * // the properties below are optional
     * .archiveName("archiveName")
     * .description("description")
     * .retention(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun archiveProps(block: ArchivePropsDsl.() -> Unit = {}): ArchiveProps {
        val builder = ArchivePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The event archive base properties.
     *
     * Example:
     * ```
     * EventBus bus = EventBus.Builder.create(this, "bus")
     * .eventBusName("MyCustomEventBus")
     * .build();
     * bus.archive("MyArchive", BaseArchiveProps.builder()
     * .archiveName("MyCustomEventBusArchive")
     * .description("MyCustomerEventBus Archive")
     * .eventPattern(EventPattern.builder()
     * .account(List.of(Stack.of(this).getAccount()))
     * .build())
     * .retention(Duration.days(365))
     * .build());
     * ```
     */
    public inline fun baseArchiveProps(
        block: BaseArchivePropsDsl.() -> Unit = {}
    ): BaseArchiveProps {
        val builder = BaseArchivePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an API destination, which is an HTTP invocation endpoint configured as a target for
     * events.
     *
     * When using ApiDesinations with OAuth authentication we recommend these best practices:
     * * Create a secret in Secrets Manager with your OAuth credentials.
     * * Reference that secret in your CloudFormation template for `AWS::Events::Connection` using
     *   CloudFormation dynamic reference syntax. For more information, see
     *   [Secrets Manager secrets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     *   .
     *
     * When the Connection resource is created the secret will be passed to EventBridge and stored
     * in the customer account using “Service Linked Secrets,” effectively creating two secrets.
     * This will minimize the cost because the original secret is only accessed when a
     * CloudFormation template is created or updated, not every time an event is sent to the
     * ApiDestination. The secret stored in the customer account by EventBridge is the one used for
     * each event sent to the ApiDestination and AWS is responsible for the fees.
     *
     * The secret stored in the customer account by EventBridge can’t be updated directly, only when
     * a CloudFormation template is updated.
     *
     * For examples of CloudFormation templates that use secrets, see
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#aws-resource-events-connection--examples)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * CfnApiDestination cfnApiDestination = CfnApiDestination.Builder.create(this,
     * "MyCfnApiDestination")
     * .connectionArn("connectionArn")
     * .httpMethod("httpMethod")
     * .invocationEndpoint("invocationEndpoint")
     * // the properties below are optional
     * .description("description")
     * .invocationRateLimitPerSecond(123)
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html)
     */
    public inline fun cfnApiDestination(
        scope: Construct,
        id: String,
        block: CfnApiDestinationDsl.() -> Unit = {},
    ): CfnApiDestination {
        val builder = CfnApiDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApiDestination`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * CfnApiDestinationProps cfnApiDestinationProps = CfnApiDestinationProps.builder()
     * .connectionArn("connectionArn")
     * .httpMethod("httpMethod")
     * .invocationEndpoint("invocationEndpoint")
     * // the properties below are optional
     * .description("description")
     * .invocationRateLimitPerSecond(123)
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html)
     */
    public inline fun cfnApiDestinationProps(
        block: CfnApiDestinationPropsDsl.() -> Unit = {}
    ): CfnApiDestinationProps {
        val builder = CfnApiDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an archive of events with the specified settings.
     *
     * When you create an archive, incoming events might not immediately start being sent to the
     * archive. Allow a short period of time for changes to take effect. If you do not specify a
     * pattern to filter events sent to the archive, all events are sent to the archive except
     * replayed events. Replayed events are not sent to an archive.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * Object eventPattern;
     * CfnArchive cfnArchive = CfnArchive.Builder.create(this, "MyCfnArchive")
     * .sourceArn("sourceArn")
     * // the properties below are optional
     * .archiveName("archiveName")
     * .description("description")
     * .eventPattern(eventPattern)
     * .retentionDays(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html)
     */
    public inline fun cfnArchive(
        scope: Construct,
        id: String,
        block: CfnArchiveDsl.() -> Unit = {},
    ): CfnArchive {
        val builder = CfnArchiveDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnArchive`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * Object eventPattern;
     * CfnArchiveProps cfnArchiveProps = CfnArchiveProps.builder()
     * .sourceArn("sourceArn")
     * // the properties below are optional
     * .archiveName("archiveName")
     * .description("description")
     * .eventPattern(eventPattern)
     * .retentionDays(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html)
     */
    public inline fun cfnArchiveProps(block: CfnArchivePropsDsl.() -> Unit = {}): CfnArchiveProps {
        val builder = CfnArchivePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a connection.
     *
     * A connection defines the authorization type and credentials to use for authorization with an
     * API destination HTTP endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
     * .authorizationType("authorizationType")
     * // the properties below are optional
     * .authParameters(AuthParametersProperty.builder()
     * .apiKeyAuthParameters(ApiKeyAuthParametersProperty.builder()
     * .apiKeyName("apiKeyName")
     * .apiKeyValue("apiKeyValue")
     * .build())
     * .basicAuthParameters(BasicAuthParametersProperty.builder()
     * .password("password")
     * .username("username")
     * .build())
     * .invocationHttpParameters(ConnectionHttpParametersProperty.builder()
     * .bodyParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .headerParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .queryStringParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .build())
     * .oAuthParameters(OAuthParametersProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientParameters(ClientParametersProperty.builder()
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .build())
     * .httpMethod("httpMethod")
     * // the properties below are optional
     * .oAuthHttpParameters(ConnectionHttpParametersProperty.builder()
     * .bodyParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .headerParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .queryStringParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .build())
     * .build())
     * .build())
     * .description("description")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html)
     */
    public inline fun cfnConnection(
        scope: Construct,
        id: String,
        block: CfnConnectionDsl.() -> Unit = {},
    ): CfnConnection {
        val builder = CfnConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the API key authorization parameters for the connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * ApiKeyAuthParametersProperty apiKeyAuthParametersProperty =
     * ApiKeyAuthParametersProperty.builder()
     * .apiKeyName("apiKeyName")
     * .apiKeyValue("apiKeyValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-apikeyauthparameters.html)
     */
    public inline fun cfnConnectionApiKeyAuthParametersProperty(
        block: CfnConnectionApiKeyAuthParametersPropertyDsl.() -> Unit = {}
    ): CfnConnection.ApiKeyAuthParametersProperty {
        val builder = CfnConnectionApiKeyAuthParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the authorization parameters to use for the connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * AuthParametersProperty authParametersProperty = AuthParametersProperty.builder()
     * .apiKeyAuthParameters(ApiKeyAuthParametersProperty.builder()
     * .apiKeyName("apiKeyName")
     * .apiKeyValue("apiKeyValue")
     * .build())
     * .basicAuthParameters(BasicAuthParametersProperty.builder()
     * .password("password")
     * .username("username")
     * .build())
     * .invocationHttpParameters(ConnectionHttpParametersProperty.builder()
     * .bodyParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .headerParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .queryStringParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .build())
     * .oAuthParameters(OAuthParametersProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientParameters(ClientParametersProperty.builder()
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .build())
     * .httpMethod("httpMethod")
     * // the properties below are optional
     * .oAuthHttpParameters(ConnectionHttpParametersProperty.builder()
     * .bodyParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .headerParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .queryStringParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-authparameters.html)
     */
    public inline fun cfnConnectionAuthParametersProperty(
        block: CfnConnectionAuthParametersPropertyDsl.() -> Unit = {}
    ): CfnConnection.AuthParametersProperty {
        val builder = CfnConnectionAuthParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the Basic authorization parameters for the connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * BasicAuthParametersProperty basicAuthParametersProperty = BasicAuthParametersProperty.builder()
     * .password("password")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-basicauthparameters.html)
     */
    public inline fun cfnConnectionBasicAuthParametersProperty(
        block: CfnConnectionBasicAuthParametersPropertyDsl.() -> Unit = {}
    ): CfnConnection.BasicAuthParametersProperty {
        val builder = CfnConnectionBasicAuthParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the OAuth authorization parameters to use for the connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * ClientParametersProperty clientParametersProperty = ClientParametersProperty.builder()
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-clientparameters.html)
     */
    public inline fun cfnConnectionClientParametersProperty(
        block: CfnConnectionClientParametersPropertyDsl.() -> Unit = {}
    ): CfnConnection.ClientParametersProperty {
        val builder = CfnConnectionClientParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains additional parameters for the connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * ConnectionHttpParametersProperty connectionHttpParametersProperty =
     * ConnectionHttpParametersProperty.builder()
     * .bodyParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .headerParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .queryStringParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-connectionhttpparameters.html)
     */
    public inline fun cfnConnectionConnectionHttpParametersProperty(
        block: CfnConnectionConnectionHttpParametersPropertyDsl.() -> Unit = {}
    ): CfnConnection.ConnectionHttpParametersProperty {
        val builder = CfnConnectionConnectionHttpParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the OAuth authorization parameters to use for the connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * OAuthParametersProperty oAuthParametersProperty = OAuthParametersProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientParameters(ClientParametersProperty.builder()
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .build())
     * .httpMethod("httpMethod")
     * // the properties below are optional
     * .oAuthHttpParameters(ConnectionHttpParametersProperty.builder()
     * .bodyParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .headerParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .queryStringParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-oauthparameters.html)
     */
    public inline fun cfnConnectionOAuthParametersProperty(
        block: CfnConnectionOAuthParametersPropertyDsl.() -> Unit = {}
    ): CfnConnection.OAuthParametersProperty {
        val builder = CfnConnectionOAuthParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional query string parameter for the connection.
     *
     * You can include up to 100 additional query string parameters per request. Each additional
     * parameter counts towards the event payload size, which cannot exceed 64 KB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * ParameterProperty parameterProperty = ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-connection-parameter.html)
     */
    public inline fun cfnConnectionParameterProperty(
        block: CfnConnectionParameterPropertyDsl.() -> Unit = {}
    ): CfnConnection.ParameterProperty {
        val builder = CfnConnectionParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * CfnConnectionProps cfnConnectionProps = CfnConnectionProps.builder()
     * .authorizationType("authorizationType")
     * // the properties below are optional
     * .authParameters(AuthParametersProperty.builder()
     * .apiKeyAuthParameters(ApiKeyAuthParametersProperty.builder()
     * .apiKeyName("apiKeyName")
     * .apiKeyValue("apiKeyValue")
     * .build())
     * .basicAuthParameters(BasicAuthParametersProperty.builder()
     * .password("password")
     * .username("username")
     * .build())
     * .invocationHttpParameters(ConnectionHttpParametersProperty.builder()
     * .bodyParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .headerParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .queryStringParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .build())
     * .oAuthParameters(OAuthParametersProperty.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientParameters(ClientParametersProperty.builder()
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .build())
     * .httpMethod("httpMethod")
     * // the properties below are optional
     * .oAuthHttpParameters(ConnectionHttpParametersProperty.builder()
     * .bodyParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .headerParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .queryStringParameters(List.of(ParameterProperty.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .isValueSecret(false)
     * .build()))
     * .build())
     * .build())
     * .build())
     * .description("description")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html)
     */
    public inline fun cfnConnectionProps(
        block: CfnConnectionPropsDsl.() -> Unit = {}
    ): CfnConnectionProps {
        val builder = CfnConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A global endpoint used to improve your application's availability by making it regional-fault
     * tolerant.
     *
     * For more information about global endpoints, see
     * [Making applications Regional-fault tolerant with global endpoints and event replication](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-global-endpoints.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * CfnEndpoint cfnEndpoint = CfnEndpoint.Builder.create(this, "MyCfnEndpoint")
     * .eventBuses(List.of(EndpointEventBusProperty.builder()
     * .eventBusArn("eventBusArn")
     * .build()))
     * .routingConfig(RoutingConfigProperty.builder()
     * .failoverConfig(FailoverConfigProperty.builder()
     * .primary(PrimaryProperty.builder()
     * .healthCheck("healthCheck")
     * .build())
     * .secondary(SecondaryProperty.builder()
     * .route("route")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .replicationConfig(ReplicationConfigProperty.builder()
     * .state("state")
     * .build())
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html)
     */
    public inline fun cfnEndpoint(
        scope: Construct,
        id: String,
        block: CfnEndpointDsl.() -> Unit = {},
    ): CfnEndpoint {
        val builder = CfnEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The event buses the endpoint is associated with.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * EndpointEventBusProperty endpointEventBusProperty = EndpointEventBusProperty.builder()
     * .eventBusArn("eventBusArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-endpointeventbus.html)
     */
    public inline fun cfnEndpointEndpointEventBusProperty(
        block: CfnEndpointEndpointEventBusPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.EndpointEventBusProperty {
        val builder = CfnEndpointEndpointEventBusPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The failover configuration for an endpoint.
     *
     * This includes what triggers failover and what happens when it's triggered.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * FailoverConfigProperty failoverConfigProperty = FailoverConfigProperty.builder()
     * .primary(PrimaryProperty.builder()
     * .healthCheck("healthCheck")
     * .build())
     * .secondary(SecondaryProperty.builder()
     * .route("route")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-failoverconfig.html)
     */
    public inline fun cfnEndpointFailoverConfigProperty(
        block: CfnEndpointFailoverConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.FailoverConfigProperty {
        val builder = CfnEndpointFailoverConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The primary Region of the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * PrimaryProperty primaryProperty = PrimaryProperty.builder()
     * .healthCheck("healthCheck")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-primary.html)
     */
    public inline fun cfnEndpointPrimaryProperty(
        block: CfnEndpointPrimaryPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.PrimaryProperty {
        val builder = CfnEndpointPrimaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * CfnEndpointProps cfnEndpointProps = CfnEndpointProps.builder()
     * .eventBuses(List.of(EndpointEventBusProperty.builder()
     * .eventBusArn("eventBusArn")
     * .build()))
     * .routingConfig(RoutingConfigProperty.builder()
     * .failoverConfig(FailoverConfigProperty.builder()
     * .primary(PrimaryProperty.builder()
     * .healthCheck("healthCheck")
     * .build())
     * .secondary(SecondaryProperty.builder()
     * .route("route")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .replicationConfig(ReplicationConfigProperty.builder()
     * .state("state")
     * .build())
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-endpoint.html)
     */
    public inline fun cfnEndpointProps(
        block: CfnEndpointPropsDsl.() -> Unit = {}
    ): CfnEndpointProps {
        val builder = CfnEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Endpoints can replicate all events to the secondary Region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * ReplicationConfigProperty replicationConfigProperty = ReplicationConfigProperty.builder()
     * .state("state")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-replicationconfig.html)
     */
    public inline fun cfnEndpointReplicationConfigProperty(
        block: CfnEndpointReplicationConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.ReplicationConfigProperty {
        val builder = CfnEndpointReplicationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The routing configuration of the endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * RoutingConfigProperty routingConfigProperty = RoutingConfigProperty.builder()
     * .failoverConfig(FailoverConfigProperty.builder()
     * .primary(PrimaryProperty.builder()
     * .healthCheck("healthCheck")
     * .build())
     * .secondary(SecondaryProperty.builder()
     * .route("route")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-routingconfig.html)
     */
    public inline fun cfnEndpointRoutingConfigProperty(
        block: CfnEndpointRoutingConfigPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.RoutingConfigProperty {
        val builder = CfnEndpointRoutingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The secondary Region that processes events when failover is triggered or replication is
     * enabled.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * SecondaryProperty secondaryProperty = SecondaryProperty.builder()
     * .route("route")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-secondary.html)
     */
    public inline fun cfnEndpointSecondaryProperty(
        block: CfnEndpointSecondaryPropertyDsl.() -> Unit = {}
    ): CfnEndpoint.SecondaryProperty {
        val builder = CfnEndpointSecondaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an event bus within your account.
     *
     * This can be a custom event bus which you can use to receive events from your custom
     * applications and services, or it can be a partner event bus which can be matched to a partner
     * event source.
     *
     * As an aid to help you jumpstart developing CloudFormation templates, the EventBridge console
     * enables you to create templates from the existing event buses in your account. For more
     * information, see
     * [Generating CloudFormation templates from an EventBridge event bus](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-generate-event-bus-template.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * Object policy;
     * CfnEventBus cfnEventBus = CfnEventBus.Builder.create(this, "MyCfnEventBus")
     * .name("name")
     * // the properties below are optional
     * .eventSourceName("eventSourceName")
     * .policy(policy)
     * .tags(List.of(TagEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html)
     */
    public inline fun cfnEventBus(
        scope: Construct,
        id: String,
        block: CfnEventBusDsl.() -> Unit = {},
    ): CfnEventBus {
        val builder = CfnEventBusDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Running `PutPermission` permits the specified AWS account or AWS organization to put events
     * to the specified *event bus* .
     *
     * Amazon EventBridge (CloudWatch Events) rules in your account are triggered by these events
     * arriving to an event bus in your account.
     *
     * For another account to send events to your account, that external account must have an
     * EventBridge rule with your account's event bus as a target.
     *
     * To enable multiple AWS accounts to put events to your event bus, run `PutPermission` once for
     * each of these accounts. Or, if all the accounts are members of the same AWS organization, you
     * can run `PutPermission` once specifying `Principal` as "*" and specifying the AWS
     * organization ID in `Condition` , to grant permissions to all accounts in that organization.
     *
     * If you grant permissions using an organization, then accounts in that organization must
     * specify a `RoleArn` with proper permissions when they use `PutTarget` to add your account's
     * event bus as a target. For more information, see
     * [Sending and Receiving Events Between AWS Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * The permission policy on the event bus cannot exceed 10 KB in size.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * Object statement;
     * CfnEventBusPolicy cfnEventBusPolicy = CfnEventBusPolicy.Builder.create(this,
     * "MyCfnEventBusPolicy")
     * .statementId("statementId")
     * // the properties below are optional
     * .action("action")
     * .condition(ConditionProperty.builder()
     * .key("key")
     * .type("type")
     * .value("value")
     * .build())
     * .eventBusName("eventBusName")
     * .principal("principal")
     * .statement(statement)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html)
     */
    public inline fun cfnEventBusPolicy(
        scope: Construct,
        id: String,
        block: CfnEventBusPolicyDsl.() -> Unit = {},
    ): CfnEventBusPolicy {
        val builder = CfnEventBusPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A JSON string which you can use to limit the event bus permissions you are granting to only
     * accounts that fulfill the condition.
     *
     * Currently, the only supported condition is membership in a certain AWS organization. The
     * string must contain `Type` , `Key` , and `Value` fields. The `Value` field specifies the ID
     * of the AWS organization. Following is an example value for `Condition` :
     *
     * `'{"Type" : "StringEquals", "Key": "aws:PrincipalOrgID", "Value": "o-1234567890"}'`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * ConditionProperty conditionProperty = ConditionProperty.builder()
     * .key("key")
     * .type("type")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html)
     */
    public inline fun cfnEventBusPolicyConditionProperty(
        block: CfnEventBusPolicyConditionPropertyDsl.() -> Unit = {}
    ): CfnEventBusPolicy.ConditionProperty {
        val builder = CfnEventBusPolicyConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventBusPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * Object statement;
     * CfnEventBusPolicyProps cfnEventBusPolicyProps = CfnEventBusPolicyProps.builder()
     * .statementId("statementId")
     * // the properties below are optional
     * .action("action")
     * .condition(ConditionProperty.builder()
     * .key("key")
     * .type("type")
     * .value("value")
     * .build())
     * .eventBusName("eventBusName")
     * .principal("principal")
     * .statement(statement)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html)
     */
    public inline fun cfnEventBusPolicyProps(
        block: CfnEventBusPolicyPropsDsl.() -> Unit = {}
    ): CfnEventBusPolicyProps {
        val builder = CfnEventBusPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEventBus`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * Object policy;
     * CfnEventBusProps cfnEventBusProps = CfnEventBusProps.builder()
     * .name("name")
     * // the properties below are optional
     * .eventSourceName("eventSourceName")
     * .policy(policy)
     * .tags(List.of(TagEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbus.html)
     */
    public inline fun cfnEventBusProps(
        block: CfnEventBusPropsDsl.() -> Unit = {}
    ): CfnEventBusProps {
        val builder = CfnEventBusPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * TagEntryProperty tagEntryProperty = TagEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-tagentry.html)
     */
    public inline fun cfnEventBusTagEntryProperty(
        block: CfnEventBusTagEntryPropertyDsl.() -> Unit = {}
    ): CfnEventBus.TagEntryProperty {
        val builder = CfnEventBusTagEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates the specified rule.
     *
     * Rules are enabled by default, or based on value of the state. You can disable a rule using
     * [DisableRule](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_DisableRule.html)
     * .
     *
     * A single rule watches for events from a single event bus. Events generated by AWS services go
     * to your account's default event bus. Events generated by SaaS partner services or
     * applications go to the matching partner event bus. If you have custom applications or
     * services, you can specify whether their events go to your default event bus or a custom event
     * bus that you have created. For more information, see
     * [CreateEventBus](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_CreateEventBus.html)
     * .
     *
     * If you are updating an existing rule, the rule is replaced with what you specify in this
     * `PutRule` command. If you omit arguments in `PutRule` , the old values for those arguments
     * are not kept. Instead, they are replaced with null values.
     *
     * When you create or update a rule, incoming events might not immediately start matching to new
     * or updated rules. Allow a short period of time for changes to take effect.
     *
     * A rule must contain at least an EventPattern or ScheduleExpression. Rules with EventPatterns
     * are triggered when a matching event is observed. Rules with ScheduleExpressions self-trigger
     * based on the given schedule. A rule can have both an EventPattern and a ScheduleExpression,
     * in which case the rule triggers on matching events as well as on a schedule.
     *
     * Most services in AWS treat : or / as the same character in Amazon Resource Names (ARNs).
     * However, EventBridge uses an exact match in event patterns and rules. Be sure to use the
     * correct ARN characters when creating event patterns so that they match the ARN syntax in the
     * event you want to match.
     *
     * In EventBridge, it is possible to create rules that lead to infinite loops, where a rule is
     * fired repeatedly. For example, a rule might detect that ACLs have changed on an S3 bucket,
     * and trigger software to change them to the desired state. If the rule is not written
     * carefully, the subsequent change to the ACLs fires the rule again, creating an infinite loop.
     *
     * To prevent this, write the rules so that the triggered actions do not re-fire the same rule.
     * For example, your rule could fire only if ACLs are found to be in a bad state, instead of
     * after any change.
     *
     * An infinite loop can quickly cause higher than expected charges. We recommend that you use
     * budgeting, which alerts you when charges exceed your specified limit. For more information,
     * see
     * [Managing Your Costs with Budgets](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html)
     * .
     *
     * As an aid to help you jumpstart developing CloudFormation templates, the EventBridge console
     * enables you to create templates from the existing rules in your account. For more
     * information, see
     * [Generating CloudFormation templates from an EventBridge rule](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-generate-template.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * Object eventPattern;
     * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
     * .description("description")
     * .eventBusName("eventBusName")
     * .eventPattern(eventPattern)
     * .name("name")
     * .roleArn("roleArn")
     * .scheduleExpression("scheduleExpression")
     * .state("state")
     * .targets(List.of(TargetProperty.builder()
     * .arn("arn")
     * .id("id")
     * // the properties below are optional
     * .appSyncParameters(AppSyncParametersProperty.builder()
     * .graphQlOperation("graphQlOperation")
     * .build())
     * .batchParameters(BatchParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build())
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .ecsParameters(EcsParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategies(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tagList(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build())
     * .httpParameters(HttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .input("input")
     * .inputPath("inputPath")
     * .inputTransformer(InputTransformerProperty.builder()
     * .inputTemplate("inputTemplate")
     * // the properties below are optional
     * .inputPathsMap(Map.of(
     * "inputPathsMapKey", "inputPathsMap"))
     * .build())
     * .kinesisParameters(KinesisParametersProperty.builder()
     * .partitionKeyPath("partitionKeyPath")
     * .build())
     * .redshiftDataParameters(RedshiftDataParametersProperty.builder()
     * .database("database")
     * // the properties below are optional
     * .dbUser("dbUser")
     * .secretManagerArn("secretManagerArn")
     * .sql("sql")
     * .sqls(List.of("sqls"))
     * .statementName("statementName")
     * .withEvent(false)
     * .build())
     * .retryPolicy(RetryPolicyProperty.builder()
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build())
     * .roleArn("roleArn")
     * .runCommandParameters(RunCommandParametersProperty.builder()
     * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .sageMakerPipelineParameters(SageMakerPipelineParametersProperty.builder()
     * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .sqsParameters(SqsParametersProperty.builder()
     * .messageGroupId("messageGroupId")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html)
     */
    public inline fun cfnRule(
        scope: Construct,
        id: String,
        block: CfnRuleDsl.() -> Unit = {},
    ): CfnRule {
        val builder = CfnRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the GraphQL operation to be parsed and executed, if the event target is an AWS
     * AppSync API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * AppSyncParametersProperty appSyncParametersProperty = AppSyncParametersProperty.builder()
     * .graphQlOperation("graphQlOperation")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-appsyncparameters.html)
     */
    public inline fun cfnRuleAppSyncParametersProperty(
        block: CfnRuleAppSyncParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.AppSyncParametersProperty {
        val builder = CfnRuleAppSyncParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies the VPC subnets and security groups for the task, and whether a
     * public IP address is to be used.
     *
     * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * AwsVpcConfigurationProperty awsVpcConfigurationProperty = AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html)
     */
    public inline fun cfnRuleAwsVpcConfigurationProperty(
        block: CfnRuleAwsVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnRule.AwsVpcConfigurationProperty {
        val builder = CfnRuleAwsVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The array properties for the submitted job, such as the size of the array.
     *
     * The array size can be between 2 and 10,000. If you specify array properties for a job, it
     * becomes an array job. This parameter is used only if the target is an AWS Batch job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * BatchArrayPropertiesProperty batchArrayPropertiesProperty =
     * BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batcharrayproperties.html)
     */
    public inline fun cfnRuleBatchArrayPropertiesProperty(
        block: CfnRuleBatchArrayPropertiesPropertyDsl.() -> Unit = {}
    ): CfnRule.BatchArrayPropertiesProperty {
        val builder = CfnRuleBatchArrayPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The custom parameters to be used when the target is an AWS Batch job.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * BatchParametersProperty batchParametersProperty = BatchParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html)
     */
    public inline fun cfnRuleBatchParametersProperty(
        block: CfnRuleBatchParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.BatchParametersProperty {
        val builder = CfnRuleBatchParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The retry strategy to use for failed jobs, if the target is an AWS Batch job.
     *
     * If you specify a retry strategy here, it overrides the retry strategy defined in the job
     * definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * BatchRetryStrategyProperty batchRetryStrategyProperty = BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html)
     */
    public inline fun cfnRuleBatchRetryStrategyProperty(
        block: CfnRuleBatchRetryStrategyPropertyDsl.() -> Unit = {}
    ): CfnRule.BatchRetryStrategyProperty {
        val builder = CfnRuleBatchRetryStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a capacity provider strategy.
     *
     * To learn more, see
     * [CapacityProviderStrategyItem](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CapacityProviderStrategyItem.html)
     * in the Amazon ECS API Reference.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * CapacityProviderStrategyItemProperty capacityProviderStrategyItemProperty =
     * CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-capacityproviderstrategyitem.html)
     */
    public inline fun cfnRuleCapacityProviderStrategyItemProperty(
        block: CfnRuleCapacityProviderStrategyItemPropertyDsl.() -> Unit = {}
    ): CfnRule.CapacityProviderStrategyItemProperty {
        val builder = CfnRuleCapacityProviderStrategyItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A `DeadLetterConfig` object that contains information about a dead-letter queue
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-deadletterconfig.html)
     */
    public inline fun cfnRuleDeadLetterConfigProperty(
        block: CfnRuleDeadLetterConfigPropertyDsl.() -> Unit = {}
    ): CfnRule.DeadLetterConfigProperty {
        val builder = CfnRuleDeadLetterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The custom parameters to be used when the target is an Amazon ECS task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * EcsParametersProperty ecsParametersProperty = EcsParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategies(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tagList(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html)
     */
    public inline fun cfnRuleEcsParametersProperty(
        block: CfnRuleEcsParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.EcsParametersProperty {
        val builder = CfnRuleEcsParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * These are custom parameter to be used when the target is an API Gateway APIs or EventBridge
     * ApiDestinations.
     *
     * In the latter case, these are merged with any InvocationParameters specified on the
     * Connection, with any values from the Connection taking precedence.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * HttpParametersProperty httpParametersProperty = HttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html)
     */
    public inline fun cfnRuleHttpParametersProperty(
        block: CfnRuleHttpParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.HttpParametersProperty {
        val builder = CfnRuleHttpParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the parameters needed for you to provide custom input to a target based on one or
     * more pieces of data extracted from the event.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * InputTransformerProperty inputTransformerProperty = InputTransformerProperty.builder()
     * .inputTemplate("inputTemplate")
     * // the properties below are optional
     * .inputPathsMap(Map.of(
     * "inputPathsMapKey", "inputPathsMap"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html)
     */
    public inline fun cfnRuleInputTransformerProperty(
        block: CfnRuleInputTransformerPropertyDsl.() -> Unit = {}
    ): CfnRule.InputTransformerProperty {
        val builder = CfnRuleInputTransformerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This object enables you to specify a JSON path to extract from the event and use as the
     * partition key for the Amazon Kinesis data stream, so that you can control the shard to which
     * the event goes.
     *
     * If you do not include this parameter, the default is to use the `eventId` as the partition
     * key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * KinesisParametersProperty kinesisParametersProperty = KinesisParametersProperty.builder()
     * .partitionKeyPath("partitionKeyPath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html)
     */
    public inline fun cfnRuleKinesisParametersProperty(
        block: CfnRuleKinesisParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.KinesisParametersProperty {
        val builder = CfnRuleKinesisParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies the network configuration for an ECS task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html)
     */
    public inline fun cfnRuleNetworkConfigurationProperty(
        block: CfnRuleNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnRule.NetworkConfigurationProperty {
        val builder = CfnRuleNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing a constraint on task placement.
     *
     * To learn more, see
     * [Task Placement Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
     * in the Amazon Elastic Container Service Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementconstraint.html)
     */
    public inline fun cfnRulePlacementConstraintProperty(
        block: CfnRulePlacementConstraintPropertyDsl.() -> Unit = {}
    ): CfnRule.PlacementConstraintProperty {
        val builder = CfnRulePlacementConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The task placement strategy for a task or service.
     *
     * To learn more, see
     * [Task Placement Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html)
     * in the Amazon Elastic Container Service Service Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * PlacementStrategyProperty placementStrategyProperty = PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementstrategy.html)
     */
    public inline fun cfnRulePlacementStrategyProperty(
        block: CfnRulePlacementStrategyPropertyDsl.() -> Unit = {}
    ): CfnRule.PlacementStrategyProperty {
        val builder = CfnRulePlacementStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * Object eventPattern;
     * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
     * .description("description")
     * .eventBusName("eventBusName")
     * .eventPattern(eventPattern)
     * .name("name")
     * .roleArn("roleArn")
     * .scheduleExpression("scheduleExpression")
     * .state("state")
     * .targets(List.of(TargetProperty.builder()
     * .arn("arn")
     * .id("id")
     * // the properties below are optional
     * .appSyncParameters(AppSyncParametersProperty.builder()
     * .graphQlOperation("graphQlOperation")
     * .build())
     * .batchParameters(BatchParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build())
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .ecsParameters(EcsParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategies(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tagList(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build())
     * .httpParameters(HttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .input("input")
     * .inputPath("inputPath")
     * .inputTransformer(InputTransformerProperty.builder()
     * .inputTemplate("inputTemplate")
     * // the properties below are optional
     * .inputPathsMap(Map.of(
     * "inputPathsMapKey", "inputPathsMap"))
     * .build())
     * .kinesisParameters(KinesisParametersProperty.builder()
     * .partitionKeyPath("partitionKeyPath")
     * .build())
     * .redshiftDataParameters(RedshiftDataParametersProperty.builder()
     * .database("database")
     * // the properties below are optional
     * .dbUser("dbUser")
     * .secretManagerArn("secretManagerArn")
     * .sql("sql")
     * .sqls(List.of("sqls"))
     * .statementName("statementName")
     * .withEvent(false)
     * .build())
     * .retryPolicy(RetryPolicyProperty.builder()
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build())
     * .roleArn("roleArn")
     * .runCommandParameters(RunCommandParametersProperty.builder()
     * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .sageMakerPipelineParameters(SageMakerPipelineParametersProperty.builder()
     * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .sqsParameters(SqsParametersProperty.builder()
     * .messageGroupId("messageGroupId")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html)
     */
    public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
        val builder = CfnRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke
     * the Amazon Redshift Data API ExecuteStatement based on EventBridge events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * RedshiftDataParametersProperty redshiftDataParametersProperty =
     * RedshiftDataParametersProperty.builder()
     * .database("database")
     * // the properties below are optional
     * .dbUser("dbUser")
     * .secretManagerArn("secretManagerArn")
     * .sql("sql")
     * .sqls(List.of("sqls"))
     * .statementName("statementName")
     * .withEvent(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html)
     */
    public inline fun cfnRuleRedshiftDataParametersProperty(
        block: CfnRuleRedshiftDataParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.RedshiftDataParametersProperty {
        val builder = CfnRuleRedshiftDataParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A `RetryPolicy` object that includes information about the retry policy settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * RetryPolicyProperty retryPolicyProperty = RetryPolicyProperty.builder()
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-retrypolicy.html)
     */
    public inline fun cfnRuleRetryPolicyProperty(
        block: CfnRuleRetryPolicyPropertyDsl.() -> Unit = {}
    ): CfnRule.RetryPolicyProperty {
        val builder = CfnRuleRetryPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This parameter contains the criteria (either InstanceIds or a tag) used to specify which EC2
     * instances are to be sent the command.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * RunCommandParametersProperty runCommandParametersProperty =
     * RunCommandParametersProperty.builder()
     * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html)
     */
    public inline fun cfnRuleRunCommandParametersProperty(
        block: CfnRuleRunCommandParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.RunCommandParametersProperty {
        val builder = CfnRuleRunCommandParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the EC2 instances that are to be sent the command, specified as key-value
     * pairs.
     *
     * Each `RunCommandTarget` block can include only one key, but this key may specify multiple
     * values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * RunCommandTargetProperty runCommandTargetProperty = RunCommandTargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html)
     */
    public inline fun cfnRuleRunCommandTargetProperty(
        block: CfnRuleRunCommandTargetPropertyDsl.() -> Unit = {}
    ): CfnRule.RunCommandTargetProperty {
        val builder = CfnRuleRunCommandTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Name/Value pair of a parameter to start execution of a SageMaker Model Building Pipeline.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * SageMakerPipelineParameterProperty sageMakerPipelineParameterProperty =
     * SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameter.html)
     */
    public inline fun cfnRuleSageMakerPipelineParameterProperty(
        block: CfnRuleSageMakerPipelineParameterPropertyDsl.() -> Unit = {}
    ): CfnRule.SageMakerPipelineParameterProperty {
        val builder = CfnRuleSageMakerPipelineParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * These are custom parameters to use when the target is a SageMaker Model Building Pipeline
     * that starts based on EventBridge events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * SageMakerPipelineParametersProperty sageMakerPipelineParametersProperty =
     * SageMakerPipelineParametersProperty.builder()
     * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameters.html)
     */
    public inline fun cfnRuleSageMakerPipelineParametersProperty(
        block: CfnRuleSageMakerPipelineParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.SageMakerPipelineParametersProperty {
        val builder = CfnRuleSageMakerPipelineParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure includes the custom parameter to be used when the target is an SQS FIFO queue.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * SqsParametersProperty sqsParametersProperty = SqsParametersProperty.builder()
     * .messageGroupId("messageGroupId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html)
     */
    public inline fun cfnRuleSqsParametersProperty(
        block: CfnRuleSqsParametersPropertyDsl.() -> Unit = {}
    ): CfnRule.SqsParametersProperty {
        val builder = CfnRuleSqsParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair associated with an ECS Target of an EventBridge rule.
     *
     * The tag will be propagated to ECS by EventBridge when starting an ECS task based on a matched
     * event.
     *
     * Currently, tags are only available when using ECS with EventBridge .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * TagProperty tagProperty = TagProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-tag.html)
     */
    public inline fun cfnRuleTagProperty(
        block: CfnRuleTagPropertyDsl.() -> Unit = {}
    ): CfnRule.TagProperty {
        val builder = CfnRuleTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Targets are the resources to be invoked when a rule is triggered.
     *
     * For a complete list of services and resources that can be set as a target, see
     * [PutTargets](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutTargets.html)
     * .
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID,
     * then you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see
     * [Sending and Receiving Events Between AWS Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * TargetProperty targetProperty = TargetProperty.builder()
     * .arn("arn")
     * .id("id")
     * // the properties below are optional
     * .appSyncParameters(AppSyncParametersProperty.builder()
     * .graphQlOperation("graphQlOperation")
     * .build())
     * .batchParameters(BatchParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build())
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .ecsParameters(EcsParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategies(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tagList(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build())
     * .httpParameters(HttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .input("input")
     * .inputPath("inputPath")
     * .inputTransformer(InputTransformerProperty.builder()
     * .inputTemplate("inputTemplate")
     * // the properties below are optional
     * .inputPathsMap(Map.of(
     * "inputPathsMapKey", "inputPathsMap"))
     * .build())
     * .kinesisParameters(KinesisParametersProperty.builder()
     * .partitionKeyPath("partitionKeyPath")
     * .build())
     * .redshiftDataParameters(RedshiftDataParametersProperty.builder()
     * .database("database")
     * // the properties below are optional
     * .dbUser("dbUser")
     * .secretManagerArn("secretManagerArn")
     * .sql("sql")
     * .sqls(List.of("sqls"))
     * .statementName("statementName")
     * .withEvent(false)
     * .build())
     * .retryPolicy(RetryPolicyProperty.builder()
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build())
     * .roleArn("roleArn")
     * .runCommandParameters(RunCommandParametersProperty.builder()
     * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .sageMakerPipelineParameters(SageMakerPipelineParametersProperty.builder()
     * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .sqsParameters(SqsParametersProperty.builder()
     * .messageGroupId("messageGroupId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html)
     */
    public inline fun cfnRuleTargetProperty(
        block: CfnRuleTargetPropertyDsl.() -> Unit = {}
    ): CfnRule.TargetProperty {
        val builder = CfnRuleTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an EventBridge Connection.
     *
     * Example:
     * ```
     * Connection connection = Connection.Builder.create(this, "Connection")
     * .authorization(Authorization.apiKey("x-api-key", SecretValue.secretsManager("ApiSecretName")))
     * .description("Connection with API Key x-api-key")
     * .build();
     * ApiDestination destination = ApiDestination.Builder.create(this, "Destination")
     * .connection(connection)
     * .endpoint("https://example.com")
     * .description("Calling example.com with API key x-api-key")
     * .build();
     * Rule rule = Rule.Builder.create(this, "Rule")
     * .schedule(Schedule.rate(Duration.minutes(1)))
     * .targets(List.of(new ApiDestination(destination)))
     * .build();
     * ```
     */
    public inline fun connection(
        scope: Construct,
        id: String,
        block: ConnectionDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.events.Connection {
        val builder = ConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface with properties necessary to import a reusable Connection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * ConnectionAttributes connectionAttributes = ConnectionAttributes.builder()
     * .connectionArn("connectionArn")
     * .connectionName("connectionName")
     * .connectionSecretArn("connectionSecretArn")
     * .build();
     * ```
     */
    public inline fun connectionAttributes(
        block: ConnectionAttributesDsl.() -> Unit = {}
    ): ConnectionAttributes {
        val builder = ConnectionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An API Destination Connection.
     *
     * A connection defines the authorization type and credentials to use for authorization with an
     * API destination HTTP endpoint.
     *
     * Example:
     * ```
     * Connection connection = Connection.Builder.create(this, "Connection")
     * .authorization(Authorization.apiKey("x-api-key", SecretValue.secretsManager("ApiSecretName")))
     * .description("Connection with API Key x-api-key")
     * .build();
     * ApiDestination destination = ApiDestination.Builder.create(this, "Destination")
     * .connection(connection)
     * .endpoint("https://example.com")
     * .description("Calling example.com with API key x-api-key")
     * .build();
     * Rule rule = Rule.Builder.create(this, "Rule")
     * .schedule(Schedule.rate(Duration.minutes(1)))
     * .targets(List.of(new ApiDestination(destination)))
     * .build();
     * ```
     */
    public inline fun connectionProps(block: ConnectionPropsDsl.() -> Unit = {}): ConnectionProps {
        val builder = ConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to configure a cron expression.
     *
     * All fields are strings so you can use complex expressions. Absence of a field implies '*' or
     * '?', whichever one is appropriate.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.events.*;
     * import software.amazon.awscdk.services.events.targets.*;
     * Function fn;
     * Rule rule = Rule.Builder.create(this, "Schedule Rule")
     * .schedule(Schedule.cron(CronOptions.builder().minute("0").hour("4").build()))
     * .build();
     * rule.addTarget(new LambdaFunction(fn));
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/scheduled-events.html#cron-expressions)
     */
    public inline fun cronOptions(block: CronOptionsDsl.() -> Unit = {}): CronOptions {
        val builder = CronOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define an EventBridge EventBus.
     *
     * Example:
     * ```
     * EventBus bus = EventBus.Builder.create(this, "bus")
     * .eventBusName("MyCustomEventBus")
     * .build();
     * bus.archive("MyArchive", BaseArchiveProps.builder()
     * .archiveName("MyCustomEventBusArchive")
     * .description("MyCustomerEventBus Archive")
     * .eventPattern(EventPattern.builder()
     * .account(List.of(Stack.of(this).getAccount()))
     * .build())
     * .retention(Duration.days(365))
     * .build());
     * ```
     */
    public inline fun eventBus(
        scope: Construct,
        id: String,
        block: EventBusDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.events.EventBus {
        val builder = EventBusDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface with properties necessary to import a reusable EventBus.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * EventBusAttributes eventBusAttributes = EventBusAttributes.builder()
     * .eventBusArn("eventBusArn")
     * .eventBusName("eventBusName")
     * .eventBusPolicy("eventBusPolicy")
     * // the properties below are optional
     * .eventSourceName("eventSourceName")
     * .build();
     * ```
     */
    public inline fun eventBusAttributes(
        block: EventBusAttributesDsl.() -> Unit = {}
    ): EventBusAttributes {
        val builder = EventBusAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The policy for an Event Bus.
     *
     * Policies define the operations that are allowed on this resource.
     *
     * You almost never need to define this construct directly.
     *
     * All AWS resources that support resource policies have a method called
     * `addToResourcePolicy()`, which will automatically create a new resource policy if one doesn't
     * exist yet, otherwise it will add to the existing policy.
     *
     * Prefer to use `addToResourcePolicy()` instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * import software.amazon.awscdk.services.iam.*;
     * EventBus eventBus;
     * PolicyStatement policyStatement;
     * EventBusPolicy eventBusPolicy = EventBusPolicy.Builder.create(this, "MyEventBusPolicy")
     * .eventBus(eventBus)
     * .statement(policyStatement)
     * .statementId("statementId")
     * .build();
     * ```
     */
    public inline fun eventBusPolicy(
        scope: Construct,
        id: String,
        block: EventBusPolicyDsl.() -> Unit = {},
    ): EventBusPolicy {
        val builder = EventBusPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to associate Event Buses with a policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * import software.amazon.awscdk.services.iam.*;
     * EventBus eventBus;
     * PolicyStatement policyStatement;
     * EventBusPolicyProps eventBusPolicyProps = EventBusPolicyProps.builder()
     * .eventBus(eventBus)
     * .statement(policyStatement)
     * .statementId("statementId")
     * .build();
     * ```
     */
    public inline fun eventBusPolicyProps(
        block: EventBusPolicyPropsDsl.() -> Unit = {}
    ): EventBusPolicyProps {
        val builder = EventBusPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define an event bus.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.events.*;
     * EventBus eventBus = EventBus.Builder.create(this, "EventBus")
     * .eventBusName("DomainEvents")
     * .build();
     * EventBridgePutEventsEntry eventEntry = EventBridgePutEventsEntry.builder()
     * .eventBus(eventBus)
     * .source("PetService")
     * .detail(ScheduleTargetInput.fromObject(Map.of("Name", "Fluffy")))
     * .detailType("🐶")
     * .build();
     * Schedule.Builder.create(this, "Schedule")
     * .schedule(ScheduleExpression.rate(Duration.hours(1)))
     * .target(EventBridgePutEvents.Builder.create(eventEntry).build())
     * .build();
     * ```
     */
    public inline fun eventBusProps(block: EventBusPropsDsl.() -> Unit = {}): EventBusProps {
        val builder = EventBusPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common options for Events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * import software.constructs.*;
     * Construct construct;
     * Object detail;
     * EventCommonOptions eventCommonOptions = EventCommonOptions.builder()
     * .crossStackScope(construct)
     * .description("description")
     * .eventPattern(EventPattern.builder()
     * .account(List.of("account"))
     * .detail(Map.of(
     * "detailKey", detail))
     * .detailType(List.of("detailType"))
     * .id(List.of("id"))
     * .region(List.of("region"))
     * .resources(List.of("resources"))
     * .source(List.of("source"))
     * .time(List.of("time"))
     * .version(List.of("version"))
     * .build())
     * .ruleName("ruleName")
     * .build();
     * ```
     */
    public inline fun eventCommonOptions(
        block: EventCommonOptionsDsl.() -> Unit = {}
    ): EventCommonOptions {
        val builder = EventCommonOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Events in Amazon CloudWatch Events are represented as JSON objects. For more information
     * about JSON objects, see RFC 7159.
     *
     * **Important**: this class can only be used with a `Rule` class. In particular, do not use it
     * with `CfnRule` class: your pattern will not be rendered correctly. In a `CfnRule` class,
     * write the pattern as you normally would when directly writing CloudFormation.
     *
     * Rules use event patterns to select events and route them to targets. A pattern either matches
     * an event or it doesn't. Event patterns are represented as JSON objects with a structure that
     * is similar to that of events.
     *
     * It is important to remember the following about event pattern matching:
     * * For a pattern to match an event, the event must contain all the field names listed in the
     *   pattern. The field names must appear in the event with the same nesting structure.
     * * Other fields of the event not mentioned in the pattern are ignored; effectively, there is a
     *   `"*": "*"` wildcard for fields not mentioned.
     * * The matching is exact (character-by-character), without case-folding or any other string
     *   normalization.
     * * The values being matched follow JSON rules: Strings enclosed in quotes, numbers, and the
     *   unquoted keywords true, false, and null.
     * * Number matching is at the string representation level. For example, 300, 300.0, and 3.0e2
     *   are not considered equal.
     *
     * For custom events, some optional properties are required. For more information, see
     * [Minimum information needed for a valid custom event](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events-structure.html#eb-custom-event).
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function fn = Function.Builder.create(this, "MyFunc")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(Code.fromInline("exports.handler = handler.toString()"))
     * .build();
     * Rule rule = Rule.Builder.create(this, "rule")
     * .eventPattern(EventPattern.builder()
     * .source(List.of("aws.ec2"))
     * .build())
     * .build();
     * Queue queue = new Queue(this, "Queue");
     * rule.addTarget(LambdaFunction.Builder.create(fn)
     * .deadLetterQueue(queue) // Optional: add a dead letter queue
     * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
     * .retryAttempts(2)
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEventsandEventPatterns.html)
     */
    public inline fun eventPattern(block: EventPatternDsl.() -> Unit = {}): EventPattern {
        val builder = EventPatternDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for `Authorization.oauth()`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.events.*;
     * HttpParameter httpParameter;
     * SecretValue secretValue;
     * OAuthAuthorizationProps oAuthAuthorizationProps = OAuthAuthorizationProps.builder()
     * .authorizationEndpoint("authorizationEndpoint")
     * .clientId("clientId")
     * .clientSecret(secretValue)
     * .httpMethod(HttpMethod.POST)
     * // the properties below are optional
     * .bodyParameters(Map.of(
     * "bodyParametersKey", httpParameter))
     * .headerParameters(Map.of(
     * "headerParametersKey", httpParameter))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", httpParameter))
     * .build();
     * ```
     */
    public inline fun oAuthAuthorizationProps(
        block: OAuthAuthorizationPropsDsl.() -> Unit = {}
    ): OAuthAuthorizationProps {
        val builder = OAuthAuthorizationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Standard set of options for `onXxx` event handlers on construct.
     *
     * Example:
     * ```
     * // Lambda function containing logic that evaluates compliance with the rule.
     * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
     * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_18_X)
     * .build();
     * // A custom rule that runs on configuration changes of EC2 instances
     * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
     * .configurationChanges(true)
     * .lambdaFunction(evalComplianceFn)
     * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
     * .build();
     * // A rule to detect stack drifts
     * CloudFormationStackDriftDetectionCheck driftRule = new
     * CloudFormationStackDriftDetectionCheck(this, "Drift");
     * // Topic to which compliance notification events will be published
     * Topic complianceTopic = new Topic(this, "ComplianceTopic");
     * // Send notification on compliance change events
     * driftRule.onComplianceChange("ComplianceChange", OnEventOptions.builder()
     * .target(new SnsTopic(complianceTopic))
     * .build());
     * ```
     */
    public inline fun onEventOptions(block: OnEventOptionsDsl.() -> Unit = {}): OnEventOptions {
        val builder = OnEventOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an EventBridge Rule in this stack.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function fn = Function.Builder.create(this, "MyFunc")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(Code.fromInline("exports.handler = handler.toString()"))
     * .build();
     * Rule rule = Rule.Builder.create(this, "rule")
     * .eventPattern(EventPattern.builder()
     * .source(List.of("aws.ec2"))
     * .build())
     * .build();
     * Queue queue = new Queue(this, "Queue");
     * rule.addTarget(LambdaFunction.Builder.create(fn)
     * .deadLetterQueue(queue) // Optional: add a dead letter queue
     * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
     * .retryAttempts(2)
     * .build());
     * ```
     */
    public inline fun rule(
        scope: Construct,
        id: String,
        block: RuleDsl.() -> Unit = {},
    ): Rule {
        val builder = RuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an EventBridge Rule.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function fn = Function.Builder.create(this, "MyFunc")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(Code.fromInline("exports.handler = handler.toString()"))
     * .build();
     * Rule rule = Rule.Builder.create(this, "rule")
     * .eventPattern(EventPattern.builder()
     * .source(List.of("aws.ec2"))
     * .build())
     * .build();
     * Queue queue = new Queue(this, "Queue");
     * rule.addTarget(LambdaFunction.Builder.create(fn)
     * .deadLetterQueue(queue) // Optional: add a dead letter queue
     * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
     * .retryAttempts(2)
     * .build());
     * ```
     */
    public inline fun ruleProps(block: RulePropsDsl.() -> Unit = {}): RuleProps {
        val builder = RulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an event rule target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.constructs.*;
     * Construct construct;
     * Role role;
     * RuleTargetInput ruleTargetInput;
     * RuleTargetConfig ruleTargetConfig = RuleTargetConfig.builder()
     * .arn("arn")
     * // the properties below are optional
     * .batchParameters(BatchParametersProperty.builder()
     * .jobDefinition("jobDefinition")
     * .jobName("jobName")
     * // the properties below are optional
     * .arrayProperties(BatchArrayPropertiesProperty.builder()
     * .size(123)
     * .build())
     * .retryStrategy(BatchRetryStrategyProperty.builder()
     * .attempts(123)
     * .build())
     * .build())
     * .deadLetterConfig(DeadLetterConfigProperty.builder()
     * .arn("arn")
     * .build())
     * .ecsParameters(EcsParametersProperty.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .group("group")
     * .launchType("launchType")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .expression("expression")
     * .type("type")
     * .build()))
     * .placementStrategies(List.of(PlacementStrategyProperty.builder()
     * .field("field")
     * .type("type")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .referenceId("referenceId")
     * .tagList(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskCount(123)
     * .build())
     * .httpParameters(HttpParametersProperty.builder()
     * .headerParameters(Map.of(
     * "headerParametersKey", "headerParameters"))
     * .pathParameterValues(List.of("pathParameterValues"))
     * .queryStringParameters(Map.of(
     * "queryStringParametersKey", "queryStringParameters"))
     * .build())
     * .input(ruleTargetInput)
     * .kinesisParameters(KinesisParametersProperty.builder()
     * .partitionKeyPath("partitionKeyPath")
     * .build())
     * .retryPolicy(RetryPolicyProperty.builder()
     * .maximumEventAgeInSeconds(123)
     * .maximumRetryAttempts(123)
     * .build())
     * .role(role)
     * .runCommandParameters(RunCommandParametersProperty.builder()
     * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .sqsParameters(SqsParametersProperty.builder()
     * .messageGroupId("messageGroupId")
     * .build())
     * .targetResource(construct)
     * .build();
     * ```
     */
    public inline fun ruleTargetConfig(
        block: RuleTargetConfigDsl.() -> Unit = {}
    ): RuleTargetConfig {
        val builder = RuleTargetConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The input properties for an event target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.events.*;
     * RuleTargetInputProperties ruleTargetInputProperties = RuleTargetInputProperties.builder()
     * .input("input")
     * .inputPath("inputPath")
     * .inputPathsMap(Map.of(
     * "inputPathsMapKey", "inputPathsMap"))
     * .inputTemplate("inputTemplate")
     * .build();
     * ```
     */
    public inline fun ruleTargetInputProperties(
        block: RuleTargetInputPropertiesDsl.() -> Unit = {}
    ): RuleTargetInputProperties {
        val builder = RuleTargetInputPropertiesDsl()
        builder.apply(block)
        return builder.build()
    }

    public object Authorization {
        public fun oauth(
            block: OAuthAuthorizationPropsDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.events.Authorization {
            val builder = OAuthAuthorizationPropsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.events.Authorization.oauth(builder.build())
        }
    }

    public object Connection {
        public fun fromConnectionAttributes(
            scope: Construct,
            id: String,
            block: ConnectionAttributesDsl.() -> Unit = {},
        ): IConnection {
            val builder = ConnectionAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.events.Connection.fromConnectionAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object EventBus {
        public fun fromEventBusAttributes(
            scope: Construct,
            id: String,
            block: EventBusAttributesDsl.() -> Unit = {},
        ): IEventBus {
            val builder = EventBusAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.events.EventBus.fromEventBusAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object Schedule {
        public fun cron(
            block: CronOptionsDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.events.Schedule {
            val builder = CronOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.events.Schedule.cron(builder.build())
        }
    }
}
