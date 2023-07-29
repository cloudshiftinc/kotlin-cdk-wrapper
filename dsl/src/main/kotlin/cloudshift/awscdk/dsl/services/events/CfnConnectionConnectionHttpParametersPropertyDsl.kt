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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection

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
@CdkDslMarker
public class CfnConnectionConnectionHttpParametersPropertyDsl {
    private val cdkBuilder: CfnConnection.ConnectionHttpParametersProperty.Builder =
        CfnConnection.ConnectionHttpParametersProperty.builder()

    private val _bodyParameters: MutableList<Any> = mutableListOf()

    private val _headerParameters: MutableList<Any> = mutableListOf()

    private val _queryStringParameters: MutableList<Any> = mutableListOf()

    /** @param bodyParameters Contains additional body string parameters for the connection. */
    public fun bodyParameters(vararg bodyParameters: Any) {
        _bodyParameters.addAll(listOf(*bodyParameters))
    }

    /** @param bodyParameters Contains additional body string parameters for the connection. */
    public fun bodyParameters(bodyParameters: Collection<Any>) {
        _bodyParameters.addAll(bodyParameters)
    }

    /** @param bodyParameters Contains additional body string parameters for the connection. */
    public fun bodyParameters(bodyParameters: IResolvable) {
        cdkBuilder.bodyParameters(bodyParameters)
    }

    /** @param headerParameters Contains additional header parameters for the connection. */
    public fun headerParameters(vararg headerParameters: Any) {
        _headerParameters.addAll(listOf(*headerParameters))
    }

    /** @param headerParameters Contains additional header parameters for the connection. */
    public fun headerParameters(headerParameters: Collection<Any>) {
        _headerParameters.addAll(headerParameters)
    }

    /** @param headerParameters Contains additional header parameters for the connection. */
    public fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters)
    }

    /**
     * @param queryStringParameters Contains additional query string parameters for the connection.
     */
    public fun queryStringParameters(vararg queryStringParameters: Any) {
        _queryStringParameters.addAll(listOf(*queryStringParameters))
    }

    /**
     * @param queryStringParameters Contains additional query string parameters for the connection.
     */
    public fun queryStringParameters(queryStringParameters: Collection<Any>) {
        _queryStringParameters.addAll(queryStringParameters)
    }

    /**
     * @param queryStringParameters Contains additional query string parameters for the connection.
     */
    public fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters)
    }

    public fun build(): CfnConnection.ConnectionHttpParametersProperty {
        if (_bodyParameters.isNotEmpty()) cdkBuilder.bodyParameters(_bodyParameters)
        if (_headerParameters.isNotEmpty()) cdkBuilder.headerParameters(_headerParameters)
        if (_queryStringParameters.isNotEmpty())
            cdkBuilder.queryStringParameters(_queryStringParameters)
        return cdkBuilder.build()
    }
}
