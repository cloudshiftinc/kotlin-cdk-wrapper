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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
 *
 * For more information, see
 * [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * CorsConfigurationProperty corsConfigurationProperty = CorsConfigurationProperty.builder()
 * .corsRules(List.of(CorsRuleProperty.builder()
 * .allowedMethods(List.of("allowedMethods"))
 * .allowedOrigins(List.of("allowedOrigins"))
 * // the properties below are optional
 * .allowedHeaders(List.of("allowedHeaders"))
 * .exposedHeaders(List.of("exposedHeaders"))
 * .id("id")
 * .maxAge(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketCorsConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.CorsConfigurationProperty.Builder =
        CfnBucket.CorsConfigurationProperty.builder()

    private val _corsRules: MutableList<Any> = mutableListOf()

    /**
     * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
     *   You can add up to 100 rules to the configuration.
     */
    public fun corsRules(vararg corsRules: Any) {
        _corsRules.addAll(listOf(*corsRules))
    }

    /**
     * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
     *   You can add up to 100 rules to the configuration.
     */
    public fun corsRules(corsRules: Collection<Any>) {
        _corsRules.addAll(corsRules)
    }

    /**
     * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
     *   You can add up to 100 rules to the configuration.
     */
    public fun corsRules(corsRules: IResolvable) {
        cdkBuilder.corsRules(corsRules)
    }

    public fun build(): CfnBucket.CorsConfigurationProperty {
        if (_corsRules.isNotEmpty()) cdkBuilder.corsRules(_corsRules)
        return cdkBuilder.build()
    }
}
