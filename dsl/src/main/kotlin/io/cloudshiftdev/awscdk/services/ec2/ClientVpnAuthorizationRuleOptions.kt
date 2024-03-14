package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ClientVpnAuthorizationRuleOptions {
    /**
     * The IPv4 address range, in CIDR notation, of the network for which access is being
     * authorized.
     */
    public fun cidr(): String

    /**
     * A brief description of the authorization rule.
     *
     * Default: - no description
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the group to grant access to, for example, the Active Directory group or identity
     * provider (IdP) group.
     *
     * Default: - authorize all groups
     */
    public fun groupId(): String? = unwrap(this).getGroupId()

    /** A builder for [ClientVpnAuthorizationRuleOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is
         *   being authorized.
         */
        public fun cidr(cidr: String)

        /** @param description A brief description of the authorization rule. */
        public fun description(description: String)

        /**
         * @param groupId The ID of the group to grant access to, for example, the Active Directory
         *   group or identity provider (IdP) group.
         */
        public fun groupId(groupId: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions.Builder =
            software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions.builder()

        /**
         * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is
         *   being authorized.
         */
        override fun cidr(cidr: String) {
            cdkBuilder.cidr(cidr)
        }

        /** @param description A brief description of the authorization rule. */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * @param groupId The ID of the group to grant access to, for example, the Active Directory
         *   group or identity provider (IdP) group.
         */
        override fun groupId(groupId: String) {
            cdkBuilder.groupId(groupId)
        }

        public fun build(): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions,
    ) : ClientVpnAuthorizationRuleOptions {
        /**
         * The IPv4 address range, in CIDR notation, of the network for which access is being
         * authorized.
         */
        override fun cidr(): String = unwrap(this).getCidr()

        /**
         * A brief description of the authorization rule.
         *
         * Default: - no description
         */
        override fun description(): String? = unwrap(this).getDescription()

        /**
         * The ID of the group to grant access to, for example, the Active Directory group or
         * identity provider (IdP) group.
         *
         * Default: - authorize all groups
         */
        override fun groupId(): String? = unwrap(this).getGroupId()
    }

    public companion object {
        init {}

        public operator fun invoke(
            block: Builder.() -> Unit = {}
        ): ClientVpnAuthorizationRuleOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions
        ): ClientVpnAuthorizationRuleOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ClientVpnAuthorizationRuleOptions
        ): software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions =
            (wrapped as Wrapper).cdkObject
    }
}
