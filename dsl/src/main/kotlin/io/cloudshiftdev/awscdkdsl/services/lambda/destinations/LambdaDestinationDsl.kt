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

package io.cloudshiftdev.awscdkdsl.services.lambda.destinations

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.destinations.LambdaDestination

/**
 * Use a Lambda function as a Lambda destination.
 *
 * Example:
 * ```
 * // Auto-extract response payload with a lambda destination
 * Function destinationFn;
 * Function sourceFn = Function.Builder.create(this, "Source")
 * .runtime(Runtime.NODEJS_14_X)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * // auto-extract on success
 * .onSuccess(LambdaDestination.Builder.create(destinationFn)
 * .responseOnly(true)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaDestinationDsl(
    fn: IFunction,
) {
    private val cdkBuilder: LambdaDestination.Builder = LambdaDestination.Builder.create(fn)

    /**
     * Whether the destination function receives only the `responsePayload` of the source function.
     *
     * When set to `true` and used as `onSuccess` destination, the destination function will be
     * invoked with the payload returned by the source function.
     *
     * When set to `true` and used as `onFailure` destination, the destination function will be
     * invoked with the error object returned by source function.
     *
     * See the README of this module to see a full explanation of this option.
     *
     * Default: false The destination function receives the full invocation record.
     *
     * @param responseOnly Whether the destination function receives only the `responsePayload` of
     *   the source function.
     */
    public fun responseOnly(responseOnly: Boolean) {
        cdkBuilder.responseOnly(responseOnly)
    }

    public fun build(): LambdaDestination = cdkBuilder.build()
}
