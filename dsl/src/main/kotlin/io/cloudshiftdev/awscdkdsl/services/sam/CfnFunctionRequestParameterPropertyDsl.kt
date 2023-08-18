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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * RequestParameterProperty requestParameterProperty = RequestParameterProperty.builder()
 * .caching(false)
 * .required(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-requestparameter.html)
 */
@CdkDslMarker
public class CfnFunctionRequestParameterPropertyDsl {
    private val cdkBuilder: CfnFunction.RequestParameterProperty.Builder =
        CfnFunction.RequestParameterProperty.builder()

    /** @param caching the value to be set. */
    public fun caching(caching: Boolean) {
        cdkBuilder.caching(caching)
    }

    /** @param caching the value to be set. */
    public fun caching(caching: IResolvable) {
        cdkBuilder.caching(caching)
    }

    /** @param required the value to be set. */
    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    /** @param required the value to be set. */
    public fun required(required: IResolvable) {
        cdkBuilder.required(required)
    }

    public fun build(): CfnFunction.RequestParameterProperty = cdkBuilder.build()
}
