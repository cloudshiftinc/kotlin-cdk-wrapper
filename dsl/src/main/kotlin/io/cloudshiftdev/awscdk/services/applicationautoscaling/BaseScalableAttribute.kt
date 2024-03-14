package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.constructs.Construct

public abstract class BaseScalableAttribute
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute,
) : Construct(cdkObject) {
    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute,
    ) : BaseScalableAttribute(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute
        ): BaseScalableAttribute = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: BaseScalableAttribute
        ): software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttribute =
            (wrapped as Wrapper).cdkObject
    }
}
