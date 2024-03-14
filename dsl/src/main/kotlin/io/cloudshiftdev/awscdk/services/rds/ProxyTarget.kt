package io.cloudshiftdev.awscdk.services.rds

public open class ProxyTarget
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.rds.ProxyTarget,
) {
    /**
     * Bind this target to the specified database proxy.
     *
     * @param proxy
     */
    public open fun bind(proxy: DatabaseProxy): ProxyTargetConfig =
        unwrap(this).bind(proxy.let(DatabaseProxy::unwrap)).let(ProxyTargetConfig::wrap)

    public companion object {
        public fun fromCluster(cluster: IDatabaseCluster): ProxyTarget =
            software.amazon.awscdk.services.rds.ProxyTarget.fromCluster(
                    cluster.let(IDatabaseCluster::unwrap)
                )
                .let(ProxyTarget::wrap)

        public fun fromInstance(instance: IDatabaseInstance): ProxyTarget =
            software.amazon.awscdk.services.rds.ProxyTarget.fromInstance(
                    instance.let(IDatabaseInstance::unwrap)
                )
                .let(ProxyTarget::wrap)

        internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ProxyTarget): ProxyTarget =
            ProxyTarget(cdkObject)

        internal fun unwrap(wrapped: ProxyTarget): software.amazon.awscdk.services.rds.ProxyTarget =
            wrapped.cdkObject
    }
}
