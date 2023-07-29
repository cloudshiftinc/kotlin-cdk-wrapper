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

package cloudshift.awscdk.dsl.services.mediastore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.mediastore.CfnContainer

/**
 * A rule for a CORS policy.
 *
 * You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the
 * first applicable rule listed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediastore.*;
 * CorsRuleProperty corsRuleProperty = CorsRuleProperty.builder()
 * .allowedHeaders(List.of("allowedHeaders"))
 * .allowedMethods(List.of("allowedMethods"))
 * .allowedOrigins(List.of("allowedOrigins"))
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAgeSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html)
 */
@CdkDslMarker
public class CfnContainerCorsRulePropertyDsl {
    private val cdkBuilder: CfnContainer.CorsRuleProperty.Builder =
        CfnContainer.CorsRuleProperty.builder()

    private val _allowedHeaders: MutableList<String> = mutableListOf()

    private val _allowedMethods: MutableList<String> = mutableListOf()

    private val _allowedOrigins: MutableList<String> = mutableListOf()

    private val _exposeHeaders: MutableList<String> = mutableListOf()

    /**
     * @param allowedHeaders Specifies which headers are allowed in a preflight `OPTIONS` request
     *   through the `Access-Control-Request-Headers` header. Each header name that is specified in
     *   `Access-Control-Request-Headers` must have a corresponding entry in the rule. Only the
     *   headers that were requested are sent back.
     *
     * This element can contain only one wildcard character (*).
     */
    public fun allowedHeaders(vararg allowedHeaders: String) {
        _allowedHeaders.addAll(listOf(*allowedHeaders))
    }

    /**
     * @param allowedHeaders Specifies which headers are allowed in a preflight `OPTIONS` request
     *   through the `Access-Control-Request-Headers` header. Each header name that is specified in
     *   `Access-Control-Request-Headers` must have a corresponding entry in the rule. Only the
     *   headers that were requested are sent back.
     *
     * This element can contain only one wildcard character (*).
     */
    public fun allowedHeaders(allowedHeaders: Collection<String>) {
        _allowedHeaders.addAll(allowedHeaders)
    }

    /**
     * @param allowedMethods Identifies an HTTP method that the origin that is specified in the rule
     *   is allowed to execute. Each CORS rule must contain at least one `AllowedMethods` and one
     *   `AllowedOrigins` element.
     */
    public fun allowedMethods(vararg allowedMethods: String) {
        _allowedMethods.addAll(listOf(*allowedMethods))
    }

    /**
     * @param allowedMethods Identifies an HTTP method that the origin that is specified in the rule
     *   is allowed to execute. Each CORS rule must contain at least one `AllowedMethods` and one
     *   `AllowedOrigins` element.
     */
    public fun allowedMethods(allowedMethods: Collection<String>) {
        _allowedMethods.addAll(allowedMethods)
    }

    /**
     * @param allowedOrigins One or more response headers that you want users to be able to access
     *   from their applications (for example, from a JavaScript `XMLHttpRequest` object). Each CORS
     *   rule must have at least one `AllowedOrigins` element. The string value can include only one
     *   wildcard character (*), for example, http:// *.example.com. Additionally, you can specify
     *   only one wildcard character to allow cross-origin access for all origins.
     */
    public fun allowedOrigins(vararg allowedOrigins: String) {
        _allowedOrigins.addAll(listOf(*allowedOrigins))
    }

    /**
     * @param allowedOrigins One or more response headers that you want users to be able to access
     *   from their applications (for example, from a JavaScript `XMLHttpRequest` object). Each CORS
     *   rule must have at least one `AllowedOrigins` element. The string value can include only one
     *   wildcard character (*), for example, http:// *.example.com. Additionally, you can specify
     *   only one wildcard character to allow cross-origin access for all origins.
     */
    public fun allowedOrigins(allowedOrigins: Collection<String>) {
        _allowedOrigins.addAll(allowedOrigins)
    }

    /**
     * @param exposeHeaders One or more headers in the response that you want users to be able to
     *   access from their applications (for example, from a JavaScript `XMLHttpRequest` object).
     *   This element is optional for each rule.
     */
    public fun exposeHeaders(vararg exposeHeaders: String) {
        _exposeHeaders.addAll(listOf(*exposeHeaders))
    }

    /**
     * @param exposeHeaders One or more headers in the response that you want users to be able to
     *   access from their applications (for example, from a JavaScript `XMLHttpRequest` object).
     *   This element is optional for each rule.
     */
    public fun exposeHeaders(exposeHeaders: Collection<String>) {
        _exposeHeaders.addAll(exposeHeaders)
    }

    /**
     * @param maxAgeSeconds The time in seconds that your browser caches the preflight response for
     *   the specified resource. A CORS rule can have only one `MaxAgeSeconds` element.
     */
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
