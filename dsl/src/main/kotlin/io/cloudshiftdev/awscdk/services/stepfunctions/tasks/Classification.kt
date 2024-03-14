package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.String

public open class Classification
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Classification,
) {
    /** A literal string in case a new EMR classification is released, if not already defined. */
    public open fun classificationStatement(): String = unwrap(this).getClassificationStatement()

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Classification
        ): Classification = Classification(cdkObject)

        internal fun unwrap(
            wrapped: Classification
        ): software.amazon.awscdk.services.stepfunctions.tasks.Classification = wrapped.cdkObject
    }
}
