package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface GrantOnPrincipalAndResourceOptions : CommonGrantOptions {
    /**
     * The resource with a resource policy.
     *
     * The statement will always be added to the resource policy.
     */
    public fun resource(): IResourceWithPolicy

    /**
     * The principal to use in the statement for the resource policy.
     *
     * Default: - the principal of the grantee will be used
     */
    public fun resourcePolicyPrincipal(): IPrincipal? =
        unwrap(this).getResourcePolicyPrincipal()?.let(IPrincipal::wrap)

    /**
     * When referring to the resource in a resource policy, use this as ARN.
     *
     * (Depending on the resource type, this needs to be '*' in a resource policy).
     *
     * Default: Same as regular resource ARNs
     */
    public fun resourceSelfArns(): List<String> = unwrap(this).getResourceSelfArns() ?: emptyList()

    /** A builder for [GrantOnPrincipalAndResourceOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param actions The actions to grant. */
        public fun actions(actions: List<String>)

        /** @param actions The actions to grant. */
        public fun actions(vararg actions: String)

        /** @param conditions Any conditions to attach to the grant. */
        public fun conditions(conditions: Map<String, Map<String, Any>>)

        /** @param grantee The principal to grant to. */
        public fun grantee(grantee: IGrantable)

        /**
         * @param resource The resource with a resource policy. The statement will always be added
         *   to the resource policy.
         */
        public fun resource(resource: IResourceWithPolicy)

        /** @param resourceArns The resource ARNs to grant to. */
        public fun resourceArns(resourceArns: List<String>)

        /** @param resourceArns The resource ARNs to grant to. */
        public fun resourceArns(vararg resourceArns: String)

        /**
         * @param resourcePolicyPrincipal The principal to use in the statement for the resource
         *   policy.
         */
        public fun resourcePolicyPrincipal(resourcePolicyPrincipal: IPrincipal)

        /**
         * @param resourceSelfArns When referring to the resource in a resource policy, use this as
         *   ARN. (Depending on the resource type, this needs to be '*' in a resource policy).
         */
        public fun resourceSelfArns(resourceSelfArns: List<String>)

        /**
         * @param resourceSelfArns When referring to the resource in a resource policy, use this as
         *   ARN. (Depending on the resource type, this needs to be '*' in a resource policy).
         */
        public fun resourceSelfArns(vararg resourceSelfArns: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions.Builder =
            software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions.builder()

        /** @param actions The actions to grant. */
        override fun actions(actions: List<String>) {
            cdkBuilder.actions(actions)
        }

        /** @param actions The actions to grant. */
        override fun actions(vararg actions: String): Unit = actions(actions.toList())

        /** @param conditions Any conditions to attach to the grant. */
        override fun conditions(conditions: Map<String, Map<String, Any>>) {
            cdkBuilder.conditions(conditions)
        }

        /** @param grantee The principal to grant to. */
        override fun grantee(grantee: IGrantable) {
            cdkBuilder.grantee(grantee.let(IGrantable::unwrap))
        }

        /**
         * @param resource The resource with a resource policy. The statement will always be added
         *   to the resource policy.
         */
        override fun resource(resource: IResourceWithPolicy) {
            cdkBuilder.resource(resource.let(IResourceWithPolicy::unwrap))
        }

        /** @param resourceArns The resource ARNs to grant to. */
        override fun resourceArns(resourceArns: List<String>) {
            cdkBuilder.resourceArns(resourceArns)
        }

        /** @param resourceArns The resource ARNs to grant to. */
        override fun resourceArns(vararg resourceArns: String): Unit =
            resourceArns(resourceArns.toList())

        /**
         * @param resourcePolicyPrincipal The principal to use in the statement for the resource
         *   policy.
         */
        override fun resourcePolicyPrincipal(resourcePolicyPrincipal: IPrincipal) {
            cdkBuilder.resourcePolicyPrincipal(resourcePolicyPrincipal.let(IPrincipal::unwrap))
        }

        /**
         * @param resourceSelfArns When referring to the resource in a resource policy, use this as
         *   ARN. (Depending on the resource type, this needs to be '*' in a resource policy).
         */
        override fun resourceSelfArns(resourceSelfArns: List<String>) {
            cdkBuilder.resourceSelfArns(resourceSelfArns)
        }

        /**
         * @param resourceSelfArns When referring to the resource in a resource policy, use this as
         *   ARN. (Depending on the resource type, this needs to be '*' in a resource policy).
         */
        override fun resourceSelfArns(vararg resourceSelfArns: String): Unit =
            resourceSelfArns(resourceSelfArns.toList())

        public fun build(): software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions,
    ) : GrantOnPrincipalAndResourceOptions {
        /** The actions to grant. */
        override fun actions(): List<String> = unwrap(this).getActions()

        /**
         * Any conditions to attach to the grant.
         *
         * Default: - No conditions
         */
        override fun conditions(): Map<String, Map<String, Any>> =
            unwrap(this).getConditions() ?: emptyMap()

        /**
         * The principal to grant to.
         *
         * Default: if principal is undefined, no work is done.
         */
        override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

        /**
         * The resource with a resource policy.
         *
         * The statement will always be added to the resource policy.
         */
        override fun resource(): IResourceWithPolicy =
            unwrap(this).getResource().let(IResourceWithPolicy::wrap)

        /** The resource ARNs to grant to. */
        override fun resourceArns(): List<String> = unwrap(this).getResourceArns()

        /**
         * The principal to use in the statement for the resource policy.
         *
         * Default: - the principal of the grantee will be used
         */
        override fun resourcePolicyPrincipal(): IPrincipal? =
            unwrap(this).getResourcePolicyPrincipal()?.let(IPrincipal::wrap)

        /**
         * When referring to the resource in a resource policy, use this as ARN.
         *
         * (Depending on the resource type, this needs to be '*' in a resource policy).
         *
         * Default: Same as regular resource ARNs
         */
        override fun resourceSelfArns(): List<String> =
            unwrap(this).getResourceSelfArns() ?: emptyList()
    }

    public companion object {
        init {}

        public operator fun invoke(
            block: Builder.() -> Unit = {}
        ): GrantOnPrincipalAndResourceOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions
        ): GrantOnPrincipalAndResourceOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: GrantOnPrincipalAndResourceOptions
        ): software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions =
            (wrapped as Wrapper).cdkObject
    }
}
