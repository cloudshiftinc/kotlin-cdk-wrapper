package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.String

public open class FunctionRuntime
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionRuntime,
) {
    /**  */
    public open fun `value`(): String = unwrap(this).getValue()

    public companion object {
        public fun custom(runtimeString: String): FunctionRuntime =
            software.amazon.awscdk.services.cloudfront.FunctionRuntime.custom(runtimeString)
                .let(FunctionRuntime::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.FunctionRuntime
        ): FunctionRuntime = FunctionRuntime(cdkObject)

        internal fun unwrap(
            wrapped: FunctionRuntime
        ): software.amazon.awscdk.services.cloudfront.FunctionRuntime = wrapped.cdkObject
    }
}
