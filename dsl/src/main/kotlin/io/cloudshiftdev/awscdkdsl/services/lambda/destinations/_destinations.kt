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

import kotlin.Unit
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.destinations.LambdaDestination
import software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions

public object destinations {
    /**
     * Use a Lambda function as a Lambda destination.
     *
     * Example:
     * ```
     * // Auto-extract response payload with a lambda destination
     * Function destinationFn;
     * Function sourceFn = Function.Builder.create(this, "Source")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * // auto-extract on success
     * .onSuccess(LambdaDestination.Builder.create(destinationFn)
     * .responseOnly(true)
     * .build())
     * .build();
     * ```
     */
    public inline fun lambdaDestination(
        fn: IFunction,
        block: LambdaDestinationDsl.() -> Unit = {}
    ): LambdaDestination {
        val builder = LambdaDestinationDsl(fn)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for a Lambda destination.
     *
     * Example:
     * ```
     * // Auto-extract response payload with a lambda destination
     * Function destinationFn;
     * Function sourceFn = Function.Builder.create(this, "Source")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * // auto-extract on success
     * .onSuccess(LambdaDestination.Builder.create(destinationFn)
     * .responseOnly(true)
     * .build())
     * .build();
     * ```
     */
    public inline fun lambdaDestinationOptions(
        block: LambdaDestinationOptionsDsl.() -> Unit = {}
    ): LambdaDestinationOptions {
        val builder = LambdaDestinationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
