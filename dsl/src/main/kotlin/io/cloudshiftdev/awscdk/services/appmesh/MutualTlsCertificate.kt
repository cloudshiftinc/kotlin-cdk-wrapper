package io.cloudshiftdev.awscdk.services.appmesh

public abstract class MutualTlsCertificate
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate,
) : TlsCertificate(cdkObject) {
    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate,
    ) : MutualTlsCertificate(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.MutualTlsCertificate
        ): MutualTlsCertificate = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: MutualTlsCertificate
        ): software.amazon.awscdk.services.appmesh.MutualTlsCertificate =
            (wrapped as Wrapper).cdkObject
    }
}
