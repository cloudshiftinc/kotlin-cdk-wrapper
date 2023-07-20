@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.RetryProps
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class RetryPropsDsl {
    private val cdkBuilder: RetryProps.Builder = RetryProps.builder()

    private val _errors: MutableList<String> = mutableListOf()

    public fun backoffRate(backoffRate: Number) {
        cdkBuilder.backoffRate(backoffRate)
    }

    public fun errors(vararg errors: String) {
        _errors.addAll(listOf(*errors))
    }

    public fun errors(errors: Collection<String>) {
        _errors.addAll(errors)
    }

    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    public fun maxAttempts(maxAttempts: Number) {
        cdkBuilder.maxAttempts(maxAttempts)
    }

    public fun build(): RetryProps {
        if (_errors.isNotEmpty()) cdkBuilder.errors(_errors)
        return cdkBuilder.build()
    }
}
