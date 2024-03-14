package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.Number
import kotlin.String

public open class DynamoProjectionExpression
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression,
) {
    /**
     * Adds the array literal access for passed index.
     *
     * @param index array index.
     */
    public open fun atIndex(index: Number): DynamoProjectionExpression =
        unwrap(this).atIndex(index).let(DynamoProjectionExpression::wrap)

    /**
     * Adds the passed attribute to the chain.
     *
     * @param attr Attribute name.
     */
    public open fun withAttribute(attr: String): DynamoProjectionExpression =
        unwrap(this).withAttribute(attr).let(DynamoProjectionExpression::wrap)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression
        ): DynamoProjectionExpression = DynamoProjectionExpression(cdkObject)

        internal fun unwrap(
            wrapped: DynamoProjectionExpression
        ): software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression =
            wrapped.cdkObject
    }
}
