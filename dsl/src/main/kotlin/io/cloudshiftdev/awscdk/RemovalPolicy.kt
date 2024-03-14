package io.cloudshiftdev.awscdk

public enum class RemovalPolicy(
    private val cdkObject: software.amazon.awscdk.RemovalPolicy,
) {
    DESTROY(software.amazon.awscdk.RemovalPolicy.DESTROY),
    RETAIN(software.amazon.awscdk.RemovalPolicy.RETAIN),
    SNAPSHOT(software.amazon.awscdk.RemovalPolicy.SNAPSHOT),
    RETAIN_ON_UPDATE_OR_DELETE(software.amazon.awscdk.RemovalPolicy.RETAIN_ON_UPDATE_OR_DELETE),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.RemovalPolicy): RemovalPolicy =
            when (cdkObject) {
                software.amazon.awscdk.RemovalPolicy.DESTROY -> RemovalPolicy.DESTROY
                software.amazon.awscdk.RemovalPolicy.RETAIN -> RemovalPolicy.RETAIN
                software.amazon.awscdk.RemovalPolicy.SNAPSHOT -> RemovalPolicy.SNAPSHOT
                software.amazon.awscdk.RemovalPolicy.RETAIN_ON_UPDATE_OR_DELETE ->
                    RemovalPolicy.RETAIN_ON_UPDATE_OR_DELETE
            }

        internal fun unwrap(wrapped: RemovalPolicy): software.amazon.awscdk.RemovalPolicy =
            wrapped.cdkObject
    }
}
