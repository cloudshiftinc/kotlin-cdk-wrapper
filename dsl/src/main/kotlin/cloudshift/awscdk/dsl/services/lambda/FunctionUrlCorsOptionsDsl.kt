@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
import software.amazon.awscdk.services.lambda.HttpMethod
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class FunctionUrlCorsOptionsDsl {
    private val cdkBuilder: FunctionUrlCorsOptions.Builder = FunctionUrlCorsOptions.builder()

    private val _allowedHeaders: MutableList<String> = mutableListOf()

    private val _allowedMethods: MutableList<HttpMethod> = mutableListOf()

    private val _allowedOrigins: MutableList<String> = mutableListOf()

    private val _exposedHeaders: MutableList<String> = mutableListOf()

    public fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
    }

    public fun allowedHeaders(vararg allowedHeaders: String) {
        _allowedHeaders.addAll(listOf(*allowedHeaders))
    }

    public fun allowedHeaders(allowedHeaders: Collection<String>) {
        _allowedHeaders.addAll(allowedHeaders)
    }

    public fun allowedMethods(vararg allowedMethods: HttpMethod) {
        _allowedMethods.addAll(listOf(*allowedMethods))
    }

    public fun allowedMethods(allowedMethods: Collection<HttpMethod>) {
        _allowedMethods.addAll(allowedMethods)
    }

    public fun allowedOrigins(vararg allowedOrigins: String) {
        _allowedOrigins.addAll(listOf(*allowedOrigins))
    }

    public fun allowedOrigins(allowedOrigins: Collection<String>) {
        _allowedOrigins.addAll(allowedOrigins)
    }

    public fun exposedHeaders(vararg exposedHeaders: String) {
        _exposedHeaders.addAll(listOf(*exposedHeaders))
    }

    public fun exposedHeaders(exposedHeaders: Collection<String>) {
        _exposedHeaders.addAll(exposedHeaders)
    }

    public fun maxAge(maxAge: Duration) {
        cdkBuilder.maxAge(maxAge)
    }

    public fun build(): FunctionUrlCorsOptions {
        if (_allowedHeaders.isNotEmpty()) cdkBuilder.allowedHeaders(_allowedHeaders)
        if (_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
        if (_allowedOrigins.isNotEmpty()) cdkBuilder.allowedOrigins(_allowedOrigins)
        if (_exposedHeaders.isNotEmpty()) cdkBuilder.exposedHeaders(_exposedHeaders)
        return cdkBuilder.build()
    }
}
