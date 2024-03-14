package io.cloudshiftdev.awscdk.lambdalayer.kubectl

import io.cloudshiftdev.awscdk.services.lambda.LayerVersion

public open class KubectlLayer
internal constructor(
    private val cdkObject: software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer,
) : LayerVersion(cdkObject) {
    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer
        ): KubectlLayer = KubectlLayer(cdkObject)

        internal fun unwrap(
            wrapped: KubectlLayer
        ): software.amazon.awscdk.lambdalayer.kubectl.KubectlLayer = wrapped.cdkObject
    }
}
