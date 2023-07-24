@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.triggers

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.triggers.InvocationType
import software.amazon.awscdk.triggers.Trigger
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Triggers an AWS Lambda function during deployment.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.triggers.*;
 * Function func = Function.Builder.create(this, "MyFunction")
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_14_X)
 * .code(Code.fromInline("foo"))
 * .build();
 * Trigger.Builder.create(this, "MyTrigger")
 * .handler(func)
 * .timeout(Duration.minutes(10))
 * .invocationType(InvocationType.EVENT)
 * .build();
 * ```
 */
@CdkDslMarker
public class TriggerDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: Trigger.Builder = Trigger.Builder.create(scope, id)

    private val _executeAfter: MutableList<Construct> = mutableListOf()

    private val _executeBefore: MutableList<Construct> = mutableListOf()

    /**
     * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
     * provisioned.
     *
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     *
     * Default: []
     *
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these construct
     * scopes have been provisioned.
     */
    public fun executeAfter(vararg executeAfter: Construct) {
        _executeAfter.addAll(listOf(*executeAfter))
    }

    /**
     * Adds trigger dependencies. Execute this trigger only after these construct scopes have been
     * provisioned.
     *
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     *
     * Default: []
     *
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these construct
     * scopes have been provisioned.
     */
    public fun executeAfter(executeAfter: Collection<Construct>) {
        _executeAfter.addAll(executeAfter)
    }

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     *
     * Default: []
     *
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     */
    public fun executeBefore(vararg executeBefore: Construct) {
        _executeBefore.addAll(listOf(*executeBefore))
    }

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     *
     * Default: []
     *
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     */
    public fun executeBefore(executeBefore: Collection<Construct>) {
        _executeBefore.addAll(executeBefore)
    }

    /**
     * Re-executes the trigger every time the handler changes.
     *
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     *
     * Default: true
     *
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes.
     */
    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
        cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    /**
     * The AWS Lambda function of the handler to execute.
     *
     * @param handler The AWS Lambda function of the handler to execute.
     */
    public fun handler(handler: Function) {
        cdkBuilder.handler(handler)
    }

    /**
     * The invocation type to invoke the Lambda function with.
     *
     * Default: RequestResponse
     *
     * @param invocationType The invocation type to invoke the Lambda function with.
     */
    public fun invocationType(invocationType: InvocationType) {
        cdkBuilder.invocationType(invocationType)
    }

    /**
     * The timeout of the invocation call of the Lambda function to be triggered.
     *
     * Default: Duration.minutes(2)
     *
     * @param timeout The timeout of the invocation call of the Lambda function to be triggered.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): Trigger {
        if (_executeAfter.isNotEmpty()) cdkBuilder.executeAfter(_executeAfter)
        if (_executeBefore.isNotEmpty()) cdkBuilder.executeBefore(_executeBefore)
        return cdkBuilder.build()
    }
}
