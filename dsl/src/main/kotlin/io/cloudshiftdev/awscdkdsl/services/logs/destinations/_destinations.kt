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

package io.cloudshiftdev.awscdkdsl.services.logs.destinations

import kotlin.Unit
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.destinations.KinesisDestination
import software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps
import software.amazon.awscdk.services.logs.destinations.LambdaDestination
import software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions

public object destinations {
    /**
     * Use a Kinesis stream as the destination for a log subscription.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.kinesis.*;
     * import software.amazon.awscdk.services.logs.destinations.*;
     * Role role;
     * Stream stream;
     * KinesisDestination kinesisDestination = KinesisDestination.Builder.create(stream)
     * .role(role)
     * .build();
     * ```
     */
    public inline fun kinesisDestination(
        stream: IStream,
        block: KinesisDestinationDsl.() -> Unit = {}
    ): KinesisDestination {
        val builder = KinesisDestinationDsl(stream)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Customize the Kinesis Logs Destination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.destinations.*;
     * Role role;
     * KinesisDestinationProps kinesisDestinationProps = KinesisDestinationProps.builder()
     * .role(role)
     * .build();
     * ```
     */
    public inline fun kinesisDestinationProps(
        block: KinesisDestinationPropsDsl.() -> Unit = {}
    ): KinesisDestinationProps {
        val builder = KinesisDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use a Lambda Function as the destination for a log subscription.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.logs.destinations.*;
     * Function fn;
     * LogGroup logGroup;
     * SubscriptionFilter.Builder.create(this, "Subscription")
     * .logGroup(logGroup)
     * .destination(new LambdaDestination(fn))
     * .filterPattern(FilterPattern.allTerms("ERROR", "MainThread"))
     * .filterName("ErrorInMainThread")
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
     * Options that may be provided to LambdaDestination.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.logs.destinations.*;
     * LambdaDestinationOptions lambdaDestinationOptions = LambdaDestinationOptions.builder()
     * .addPermissions(false)
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
