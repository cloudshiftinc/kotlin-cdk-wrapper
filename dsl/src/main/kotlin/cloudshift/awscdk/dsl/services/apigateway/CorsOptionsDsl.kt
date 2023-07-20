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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.CorsOptions
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CorsOptionsDsl {
    private val cdkBuilder: CorsOptions.Builder = CorsOptions.builder()

    private val _allowHeaders: MutableList<String> = mutableListOf()

    private val _allowMethods: MutableList<String> = mutableListOf()

    private val _allowOrigins: MutableList<String> = mutableListOf()

    private val _exposeHeaders: MutableList<String> = mutableListOf()

    public fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
    }

    public fun allowHeaders(vararg allowHeaders: String) {
        _allowHeaders.addAll(listOf(*allowHeaders))
    }

    public fun allowHeaders(allowHeaders: Collection<String>) {
        _allowHeaders.addAll(allowHeaders)
    }

    public fun allowMethods(vararg allowMethods: String) {
        _allowMethods.addAll(listOf(*allowMethods))
    }

    public fun allowMethods(allowMethods: Collection<String>) {
        _allowMethods.addAll(allowMethods)
    }

    public fun allowOrigins(vararg allowOrigins: String) {
        _allowOrigins.addAll(listOf(*allowOrigins))
    }

    public fun allowOrigins(allowOrigins: Collection<String>) {
        _allowOrigins.addAll(allowOrigins)
    }

    public fun disableCache(disableCache: Boolean) {
        cdkBuilder.disableCache(disableCache)
    }

    public fun exposeHeaders(vararg exposeHeaders: String) {
        _exposeHeaders.addAll(listOf(*exposeHeaders))
    }

    public fun exposeHeaders(exposeHeaders: Collection<String>) {
        _exposeHeaders.addAll(exposeHeaders)
    }

    public fun maxAge(maxAge: Duration) {
        cdkBuilder.maxAge(maxAge)
    }

    public fun statusCode(statusCode: Number) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CorsOptions {
        if (_allowHeaders.isNotEmpty()) cdkBuilder.allowHeaders(_allowHeaders)
        if (_allowMethods.isNotEmpty()) cdkBuilder.allowMethods(_allowMethods)
        if (_allowOrigins.isNotEmpty()) cdkBuilder.allowOrigins(_allowOrigins)
        if (_exposeHeaders.isNotEmpty()) cdkBuilder.exposeHeaders(_exposeHeaders)
        return cdkBuilder.build()
    }
}
