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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.events.Authorization
import software.amazon.awscdk.services.events.Connection
import software.amazon.awscdk.services.events.HttpParameter
import software.constructs.Construct

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
@CdkDslMarker
public class ConnectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Connection.Builder = Connection.Builder.create(scope, id)

    /**
     * The authorization type for the connection.
     *
     * @param authorization The authorization type for the connection.
     */
    public fun authorization(authorization: Authorization) {
        cdkBuilder.authorization(authorization)
    }

    /**
     * Additional string parameters to add to the invocation bodies.
     *
     * Default: - No additional parameters
     *
     * @param bodyParameters Additional string parameters to add to the invocation bodies.
     */
    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
        cdkBuilder.bodyParameters(bodyParameters)
    }

    /**
     * The name of the connection.
     *
     * Default: - A name is automatically generated
     *
     * @param connectionName The name of the connection.
     */
    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    /**
     * The name of the connection.
     *
     * Default: - none
     *
     * @param description The name of the connection.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Additional string parameters to add to the invocation headers.
     *
     * Default: - No additional parameters
     *
     * @param headerParameters Additional string parameters to add to the invocation headers.
     */
    public fun headerParameters(headerParameters: Map<String, HttpParameter>) {
        cdkBuilder.headerParameters(headerParameters)
    }

    /**
     * Additional string parameters to add to the invocation query strings.
     *
     * Default: - No additional parameters
     *
     * @param queryStringParameters Additional string parameters to add to the invocation query
     *   strings.
     */
    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
    }

    public fun build(): Connection = cdkBuilder.build()
}
