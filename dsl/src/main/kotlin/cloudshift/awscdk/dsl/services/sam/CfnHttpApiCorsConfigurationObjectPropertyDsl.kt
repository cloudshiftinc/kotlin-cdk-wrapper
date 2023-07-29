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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CorsConfigurationObjectProperty corsConfigurationObjectProperty =
 * CorsConfigurationObjectProperty.builder()
 * .allowCredentials(false)
 * .allowHeaders(List.of("allowHeaders"))
 * .allowMethods(List.of("allowMethods"))
 * .allowOrigins(List.of("allowOrigins"))
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAge(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html)
 */
@CdkDslMarker
public class CfnHttpApiCorsConfigurationObjectPropertyDsl {
    private val cdkBuilder: CfnHttpApi.CorsConfigurationObjectProperty.Builder =
        CfnHttpApi.CorsConfigurationObjectProperty.builder()

    private val _allowHeaders: MutableList<String> = mutableListOf()

    private val _allowMethods: MutableList<String> = mutableListOf()

    private val _allowOrigins: MutableList<String> = mutableListOf()

    private val _exposeHeaders: MutableList<String> = mutableListOf()

    /** @param allowCredentials the value to be set. */
    public fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
    }

    /** @param allowCredentials the value to be set. */
    public fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials)
    }

    /** @param allowHeaders the value to be set. */
    public fun allowHeaders(vararg allowHeaders: String) {
        _allowHeaders.addAll(listOf(*allowHeaders))
    }

    /** @param allowHeaders the value to be set. */
    public fun allowHeaders(allowHeaders: Collection<String>) {
        _allowHeaders.addAll(allowHeaders)
    }

    /** @param allowMethods the value to be set. */
    public fun allowMethods(vararg allowMethods: String) {
        _allowMethods.addAll(listOf(*allowMethods))
    }

    /** @param allowMethods the value to be set. */
    public fun allowMethods(allowMethods: Collection<String>) {
        _allowMethods.addAll(allowMethods)
    }

    /** @param allowOrigins the value to be set. */
    public fun allowOrigins(vararg allowOrigins: String) {
        _allowOrigins.addAll(listOf(*allowOrigins))
    }

    /** @param allowOrigins the value to be set. */
    public fun allowOrigins(allowOrigins: Collection<String>) {
        _allowOrigins.addAll(allowOrigins)
    }

    /** @param exposeHeaders the value to be set. */
    public fun exposeHeaders(vararg exposeHeaders: String) {
        _exposeHeaders.addAll(listOf(*exposeHeaders))
    }

    /** @param exposeHeaders the value to be set. */
    public fun exposeHeaders(exposeHeaders: Collection<String>) {
        _exposeHeaders.addAll(exposeHeaders)
    }

    /** @param maxAge the value to be set. */
    public fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
    }

    public fun build(): CfnHttpApi.CorsConfigurationObjectProperty {
        if (_allowHeaders.isNotEmpty()) cdkBuilder.allowHeaders(_allowHeaders)
        if (_allowMethods.isNotEmpty()) cdkBuilder.allowMethods(_allowMethods)
        if (_allowOrigins.isNotEmpty()) cdkBuilder.allowOrigins(_allowOrigins)
        if (_exposeHeaders.isNotEmpty()) cdkBuilder.exposeHeaders(_exposeHeaders)
        return cdkBuilder.build()
    }
}
