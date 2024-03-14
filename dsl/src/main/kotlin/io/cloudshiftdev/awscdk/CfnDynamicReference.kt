package io.cloudshiftdev.awscdk

public open class CfnDynamicReference
internal constructor(
    private val cdkObject: software.amazon.awscdk.CfnDynamicReference,
) : Intrinsic(cdkObject) {
    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.CfnDynamicReference
        ): CfnDynamicReference = CfnDynamicReference(cdkObject)

        internal fun unwrap(
            wrapped: CfnDynamicReference
        ): software.amazon.awscdk.CfnDynamicReference = wrapped.cdkObject
    }
}
