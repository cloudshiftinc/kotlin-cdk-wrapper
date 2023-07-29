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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CorsConfigurationProperty corsConfigurationProperty = CorsConfigurationProperty.builder()
 * .allowOrigin("allowOrigin")
 * // the properties below are optional
 * .allowCredentials(false)
 * .allowHeaders("allowHeaders")
 * .allowMethods("allowMethods")
 * .maxAge("maxAge")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html)
 */
@CdkDslMarker
public class CfnApiCorsConfigurationPropertyDsl {
    private val cdkBuilder: CfnApi.CorsConfigurationProperty.Builder =
        CfnApi.CorsConfigurationProperty.builder()

    /** @param allowCredentials the value to be set. */
    public fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
    }

    /** @param allowCredentials the value to be set. */
    public fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials)
    }

    /** @param allowHeaders the value to be set. */
    public fun allowHeaders(allowHeaders: String) {
        cdkBuilder.allowHeaders(allowHeaders)
    }

    /** @param allowMethods the value to be set. */
    public fun allowMethods(allowMethods: String) {
        cdkBuilder.allowMethods(allowMethods)
    }

    /** @param allowOrigin the value to be set. */
    public fun allowOrigin(allowOrigin: String) {
        cdkBuilder.allowOrigin(allowOrigin)
    }

    /** @param maxAge the value to be set. */
    public fun maxAge(maxAge: String) {
        cdkBuilder.maxAge(maxAge)
    }

    public fun build(): CfnApi.CorsConfigurationProperty = cdkBuilder.build()
}
