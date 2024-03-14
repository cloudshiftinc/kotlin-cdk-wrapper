package io.cloudshiftdev.awscdk.services.iam

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IPrincipal : IGrantable {
    /**
     * Add to the policy of this principal.
     *
     * @param statement
     */
    public fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult

    /**
     * Add to the policy of this principal.
     *
     * @param statement
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
    public fun addToPrincipalPolicy(
        statement: PolicyStatement.Builder.() -> Unit
    ): AddToPrincipalPolicyResult

    /** When this Principal is used in an AssumeRole policy, the action to use. */
    public fun assumeRoleAction(): String

    /** Return the policy fragment that identifies this principal in a Policy. */
    public fun policyFragment(): PrincipalPolicyFragment

    /**
     * The AWS account ID of this principal.
     *
     * Can be undefined when the account is not known (for example, for service principals). Can be
     * a Token - in that case, it's assumed to be AWS::AccountId.
     */
    public fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.iam.IPrincipal,
    ) : IPrincipal {
        /**
         * Add to the policy of this principal.
         *
         * @param statement
         */
        override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
            unwrap(this)
                .addToPrincipalPolicy(statement.let(PolicyStatement::unwrap))
                .let(AddToPrincipalPolicyResult::wrap)

        /**
         * Add to the policy of this principal.
         *
         * @param statement
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
        override fun addToPrincipalPolicy(
            statement: PolicyStatement.Builder.() -> Unit
        ): AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

        /** When this Principal is used in an AssumeRole policy, the action to use. */
        override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

        /** The principal to grant permissions to. */
        override fun grantPrincipal(): IPrincipal =
            unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

        /** Return the policy fragment that identifies this principal in a Policy. */
        override fun policyFragment(): PrincipalPolicyFragment =
            unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

        /**
         * The AWS account ID of this principal.
         *
         * Can be undefined when the account is not known (for example, for service principals). Can
         * be a Token - in that case, it's assumed to be AWS::AccountId.
         */
        override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()
    }

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IPrincipal): IPrincipal =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: IPrincipal): software.amazon.awscdk.services.iam.IPrincipal =
            (wrapped as Wrapper).cdkObject
    }
}
