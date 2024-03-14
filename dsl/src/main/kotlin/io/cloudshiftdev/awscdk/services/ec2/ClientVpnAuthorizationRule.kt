package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ClientVpnAuthorizationRule
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule,
) : Resource(cdkObject) {
    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.ClientVpnAuthorizationRule]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The IPv4 address range, in CIDR notation, of the network for which access is being
         * authorized.
         *
         * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is
         *   being authorized.
         */
        public fun cidr(cidr: String)

        /**
         * The client VPN endpoint to which to add the rule.
         *
         * Default: clientVpnEndpoint is required
         *
         * @param clientVpnEndpoint The client VPN endpoint to which to add the rule.
         */
        public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint)

        /**
         * A brief description of the authorization rule.
         *
         * Default: - no description
         *
         * @param description A brief description of the authorization rule.
         */
        public fun description(description: String)

        /**
         * The ID of the group to grant access to, for example, the Active Directory group or
         * identity provider (IdP) group.
         *
         * Default: - authorize all groups
         *
         * @param groupId The ID of the group to grant access to, for example, the Active Directory
         *   group or identity provider (IdP) group.
         */
        public fun groupId(groupId: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule.Builder =
            software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule.Builder.create(scope, id)

        /**
         * The IPv4 address range, in CIDR notation, of the network for which access is being
         * authorized.
         *
         * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is
         *   being authorized.
         */
        override fun cidr(cidr: String) {
            cdkBuilder.cidr(cidr)
        }

        /**
         * The client VPN endpoint to which to add the rule.
         *
         * Default: clientVpnEndpoint is required
         *
         * @param clientVpnEndpoint The client VPN endpoint to which to add the rule.
         */
        override fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
            cdkBuilder.clientVpnEndpoint(clientVpnEndpoint.let(IClientVpnEndpoint::unwrap))
        }

        /**
         * A brief description of the authorization rule.
         *
         * Default: - no description
         *
         * @param description A brief description of the authorization rule.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The ID of the group to grant access to, for example, the Active Directory group or
         * identity provider (IdP) group.
         *
         * Default: - authorize all groups
         *
         * @param groupId The ID of the group to grant access to, for example, the Active Directory
         *   group or identity provider (IdP) group.
         */
        override fun groupId(groupId: String) {
            cdkBuilder.groupId(groupId)
        }

        public fun build(): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): ClientVpnAuthorizationRule {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return ClientVpnAuthorizationRule(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule
        ): ClientVpnAuthorizationRule = ClientVpnAuthorizationRule(cdkObject)

        internal fun unwrap(
            wrapped: ClientVpnAuthorizationRule
        ): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule = wrapped.cdkObject
    }
}
