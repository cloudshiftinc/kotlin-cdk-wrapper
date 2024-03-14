package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.Number

public open class MinimumHealthyHosts
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts,
) {
    public companion object {
        public fun count(`value`: Number): MinimumHealthyHosts =
            software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts.count(`value`)
                .let(MinimumHealthyHosts::wrap)

        public fun percentage(`value`: Number): MinimumHealthyHosts =
            software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts.percentage(`value`)
                .let(MinimumHealthyHosts::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
        ): MinimumHealthyHosts = MinimumHealthyHosts(cdkObject)

        internal fun unwrap(
            wrapped: MinimumHealthyHosts
        ): software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts = wrapped.cdkObject
    }
}
