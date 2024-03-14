package io.cloudshiftdev.awscdk.services.lambda

public abstract class SnapStartConf
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf,
) {
    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf,
    ) : SnapStartConf(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.SnapStartConf
        ): SnapStartConf = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: SnapStartConf
        ): software.amazon.awscdk.services.lambda.SnapStartConf = (wrapped as Wrapper).cdkObject
    }
}
