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

package cloudshift.awscdk.dsl.services.mediastore

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediastore.CfnContainer
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContainerCorsRulePropertyDsl {
    private val cdkBuilder: CfnContainer.CorsRuleProperty.Builder =
        CfnContainer.CorsRuleProperty.builder()

    private val _allowedHeaders: MutableList<String> = mutableListOf()

    private val _allowedMethods: MutableList<String> = mutableListOf()

    private val _allowedOrigins: MutableList<String> = mutableListOf()

    private val _exposeHeaders: MutableList<String> = mutableListOf()

    public fun allowedHeaders(vararg allowedHeaders: String) {
        _allowedHeaders.addAll(listOf(*allowedHeaders))
    }

    public fun allowedHeaders(allowedHeaders: Collection<String>) {
        _allowedHeaders.addAll(allowedHeaders)
    }

    public fun allowedMethods(vararg allowedMethods: String) {
        _allowedMethods.addAll(listOf(*allowedMethods))
    }

    public fun allowedMethods(allowedMethods: Collection<String>) {
        _allowedMethods.addAll(allowedMethods)
    }

    public fun allowedOrigins(vararg allowedOrigins: String) {
        _allowedOrigins.addAll(listOf(*allowedOrigins))
    }

    public fun allowedOrigins(allowedOrigins: Collection<String>) {
        _allowedOrigins.addAll(allowedOrigins)
    }

    public fun exposeHeaders(vararg exposeHeaders: String) {
        _exposeHeaders.addAll(listOf(*exposeHeaders))
    }

    public fun exposeHeaders(exposeHeaders: Collection<String>) {
        _exposeHeaders.addAll(exposeHeaders)
    }

    public fun maxAgeSeconds(maxAgeSeconds: Number) {
        cdkBuilder.maxAgeSeconds(maxAgeSeconds)
    }

    public fun build(): CfnContainer.CorsRuleProperty {
        if (_allowedHeaders.isNotEmpty()) cdkBuilder.allowedHeaders(_allowedHeaders)
        if (_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
        if (_allowedOrigins.isNotEmpty()) cdkBuilder.allowedOrigins(_allowedOrigins)
        if (_exposeHeaders.isNotEmpty()) cdkBuilder.exposeHeaders(_exposeHeaders)
        return cdkBuilder.build()
    }
}
