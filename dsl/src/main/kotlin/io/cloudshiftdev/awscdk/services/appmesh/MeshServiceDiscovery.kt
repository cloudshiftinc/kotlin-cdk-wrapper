package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface MeshServiceDiscovery {
    /**
     * IP preference applied to all Virtual Nodes in the Mesh.
     *
     * Default: - No IP preference is applied to any of the Virtual Nodes in the Mesh. Virtual Nodes
     * without an IP preference will have the following configured. Envoy listeners are configured
     * to bind only to IPv4. Envoy will use IPv4 when sending traffic to a local application. For
     * DNS service discovery, the Envoy DNS resolver to prefer using IPv6 and fall back to IPv4. For
     * CloudMap service discovery, App Mesh will prefer using IPv4 and fall back to IPv6 for IPs
     * returned by CloudMap.
     */
    public fun ipPreference(): IpPreference? =
        unwrap(this).getIpPreference()?.let(IpPreference::wrap)

    /** A builder for [MeshServiceDiscovery] */
    @CdkDslMarker
    public interface Builder {
        /** @param ipPreference IP preference applied to all Virtual Nodes in the Mesh. */
        public fun ipPreference(ipPreference: IpPreference)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appmesh.MeshServiceDiscovery.Builder =
            software.amazon.awscdk.services.appmesh.MeshServiceDiscovery.builder()

        /** @param ipPreference IP preference applied to all Virtual Nodes in the Mesh. */
        override fun ipPreference(ipPreference: IpPreference) {
            cdkBuilder.ipPreference(ipPreference.let(IpPreference::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.appmesh.MeshServiceDiscovery =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.MeshServiceDiscovery,
    ) : MeshServiceDiscovery {
        /**
         * IP preference applied to all Virtual Nodes in the Mesh.
         *
         * Default: - No IP preference is applied to any of the Virtual Nodes in the Mesh. Virtual
         * Nodes without an IP preference will have the following configured. Envoy listeners are
         * configured to bind only to IPv4. Envoy will use IPv4 when sending traffic to a local
         * application. For DNS service discovery, the Envoy DNS resolver to prefer using IPv6 and
         * fall back to IPv4. For CloudMap service discovery, App Mesh will prefer using IPv4 and
         * fall back to IPv6 for IPs returned by CloudMap.
         */
        override fun ipPreference(): IpPreference? =
            unwrap(this).getIpPreference()?.let(IpPreference::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): MeshServiceDiscovery {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.MeshServiceDiscovery
        ): MeshServiceDiscovery = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: MeshServiceDiscovery
        ): software.amazon.awscdk.services.appmesh.MeshServiceDiscovery =
            (wrapped as Wrapper).cdkObject
    }
}
