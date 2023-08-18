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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object authorizers;
 * HttpApiAuthProperty httpApiAuthProperty = HttpApiAuthProperty.builder()
 * .authorizers(authorizers)
 * .defaultAuthorizer("defaultAuthorizer")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapiauth.html)
 */
@CdkDslMarker
public class CfnHttpApiHttpApiAuthPropertyDsl {
    private val cdkBuilder: CfnHttpApi.HttpApiAuthProperty.Builder =
        CfnHttpApi.HttpApiAuthProperty.builder()

    /** @param authorizers the value to be set. */
    public fun authorizers(authorizers: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(authorizers)
        cdkBuilder.authorizers(builder.map)
    }

    /** @param authorizers the value to be set. */
    public fun authorizers(authorizers: Any) {
        cdkBuilder.authorizers(authorizers)
    }

    /** @param defaultAuthorizer the value to be set. */
    public fun defaultAuthorizer(defaultAuthorizer: String) {
        cdkBuilder.defaultAuthorizer(defaultAuthorizer)
    }

    public fun build(): CfnHttpApi.HttpApiAuthProperty = cdkBuilder.build()
}
