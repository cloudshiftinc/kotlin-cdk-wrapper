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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3.CorsRule
import software.amazon.awscdk.services.s3.HttpMethods

/**
 * Specifies a cross-origin access rule for an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * CorsRule corsRule = CorsRule.builder()
 * .allowedMethods(List.of(HttpMethods.GET))
 * .allowedOrigins(List.of("allowedOrigins"))
 * // the properties below are optional
 * .allowedHeaders(List.of("allowedHeaders"))
 * .exposedHeaders(List.of("exposedHeaders"))
 * .id("id")
 * .maxAge(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class CorsRuleDsl {
    private val cdkBuilder: CorsRule.Builder = CorsRule.builder()

    private val _allowedHeaders: MutableList<String> = mutableListOf()

    private val _allowedMethods: MutableList<HttpMethods> = mutableListOf()

    private val _allowedOrigins: MutableList<String> = mutableListOf()

    private val _exposedHeaders: MutableList<String> = mutableListOf()

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     *   header.
     */
    public fun allowedHeaders(vararg allowedHeaders: String) {
        _allowedHeaders.addAll(listOf(*allowedHeaders))
    }

    /**
     * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers
     *   header.
     */
    public fun allowedHeaders(allowedHeaders: Collection<String>) {
        _allowedHeaders.addAll(allowedHeaders)
    }

    /** @param allowedMethods An HTTP method that you allow the origin to execute. */
    public fun allowedMethods(vararg allowedMethods: HttpMethods) {
        _allowedMethods.addAll(listOf(*allowedMethods))
    }

    /** @param allowedMethods An HTTP method that you allow the origin to execute. */
    public fun allowedMethods(allowedMethods: Collection<HttpMethods>) {
        _allowedMethods.addAll(allowedMethods)
    }

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     *   from.
     */
    public fun allowedOrigins(vararg allowedOrigins: String) {
        _allowedOrigins.addAll(listOf(*allowedOrigins))
    }

    /**
     * @param allowedOrigins One or more origins you want customers to be able to access the bucket
     *   from.
     */
    public fun allowedOrigins(allowedOrigins: Collection<String>) {
        _allowedOrigins.addAll(allowedOrigins)
    }

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     *   to access from their applications.
     */
    public fun exposedHeaders(vararg exposedHeaders: String) {
        _exposedHeaders.addAll(listOf(*exposedHeaders))
    }

    /**
     * @param exposedHeaders One or more headers in the response that you want customers to be able
     *   to access from their applications.
     */
    public fun exposedHeaders(exposedHeaders: Collection<String>) {
        _exposedHeaders.addAll(exposedHeaders)
    }

    /** @param id A unique identifier for this rule. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param maxAge The time in seconds that your browser is to cache the preflight response for
     *   the specified resource.
     */
    public fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
    }

    public fun build(): CorsRule {
        if (_allowedHeaders.isNotEmpty()) cdkBuilder.allowedHeaders(_allowedHeaders)
        if (_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
        if (_allowedOrigins.isNotEmpty()) cdkBuilder.allowedOrigins(_allowedOrigins)
        if (_exposedHeaders.isNotEmpty()) cdkBuilder.exposedHeaders(_exposedHeaders)
        return cdkBuilder.build()
    }
}
