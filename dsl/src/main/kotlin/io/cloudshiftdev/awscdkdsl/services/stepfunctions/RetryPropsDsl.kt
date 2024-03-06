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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.JitterType
import software.amazon.awscdk.services.stepfunctions.RetryProps

/**
 * Retry details.
 *
 * Example:
 * ```
 * Parallel parallel = new Parallel(this, "Do the work in parallel");
 * // Add branches to be executed in parallel
 * Pass shipItem = new Pass(this, "ShipItem");
 * Pass sendInvoice = new Pass(this, "SendInvoice");
 * Pass restock = new Pass(this, "Restock");
 * parallel.branch(shipItem);
 * parallel.branch(sendInvoice);
 * parallel.branch(restock);
 * // Retry the whole workflow if something goes wrong with exponential backoff
 * parallel.addRetry(RetryProps.builder()
 * .maxAttempts(1)
 * .maxDelay(Duration.seconds(5))
 * .jitterStrategy(JitterType.FULL)
 * .build());
 * // How to recover from errors
 * Pass sendFailureNotification = new Pass(this, "SendFailureNotification");
 * parallel.addCatch(sendFailureNotification);
 * // What to do in case everything succeeded
 * Pass closeOrder = new Pass(this, "CloseOrder");
 * parallel.next(closeOrder);
 * ```
 */
@CdkDslMarker
public class RetryPropsDsl {
    private val cdkBuilder: RetryProps.Builder = RetryProps.builder()

    private val _errors: MutableList<String> = mutableListOf()

    /**
     * @param backoffRate Multiplication for how much longer the wait interval gets on every retry.
     */
    public fun backoffRate(backoffRate: Number) {
        cdkBuilder.backoffRate(backoffRate)
    }

    /**
     * @param errors Errors to retry. A list of error strings to retry, which can be either
     *   predefined errors (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    public fun errors(vararg errors: String) {
        _errors.addAll(listOf(*errors))
    }

    /**
     * @param errors Errors to retry. A list of error strings to retry, which can be either
     *   predefined errors (for example Errors.NoChoiceMatched) or a self-defined error.
     */
    public fun errors(errors: Collection<String>) {
        _errors.addAll(errors)
    }

    /** @param interval How many seconds to wait initially before retrying. */
    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    /** @param jitterStrategy Introduces a randomization over the retry interval. */
    public fun jitterStrategy(jitterStrategy: JitterType) {
        cdkBuilder.jitterStrategy(jitterStrategy)
    }

    /**
     * @param maxAttempts How many times to retry this particular error. May be 0 to disable retry
     *   for specific errors (in case you have a catch-all retry policy).
     */
    public fun maxAttempts(maxAttempts: Number) {
        cdkBuilder.maxAttempts(maxAttempts)
    }

    /** @param maxDelay Maximum limit on retry interval growth during exponential backoff. */
    public fun maxDelay(maxDelay: Duration) {
        cdkBuilder.maxDelay(maxDelay)
    }

    public fun build(): RetryProps {
        if (_errors.isNotEmpty()) cdkBuilder.errors(_errors)
        return cdkBuilder.build()
    }
}
