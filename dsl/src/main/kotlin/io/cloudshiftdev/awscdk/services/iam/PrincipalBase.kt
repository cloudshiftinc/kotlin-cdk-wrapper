package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public abstract class PrincipalBase
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.iam.PrincipalBase,
) : IAssumeRolePrincipal, IComparablePrincipal {
    /**
     * Add the principal to the AssumeRolePolicyDocument.
     *
     * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
     * permissions to assume the given role.
     *
     * @param document
     */
    public override fun addToAssumeRolePolicy(document: PolicyDocument) {
        unwrap(this).addToAssumeRolePolicy(document.let(PolicyDocument::unwrap))
    }

    /**
     * Add the principal to the AssumeRolePolicyDocument.
     *
     * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
     * permissions to assume the given role.
     *
     * @param document
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cef9e06c9678a219d566dc6f09959675ba743f7c64440ddbd5b37c4d552db9c0")
    public override fun addToAssumeRolePolicy(document: PolicyDocument.Builder.() -> Unit): Unit =
        addToAssumeRolePolicy(PolicyDocument(document))

    /**
     * Add to the policy of this principal.
     *
     * @param statement
     */
    public open fun addToPolicy(statement: PolicyStatement): Boolean =
        unwrap(this).addToPolicy(statement.let(PolicyStatement::unwrap))

    /**
     * Add to the policy of this principal.
     *
     * @param statement
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6148e52b961e7728ba57cdabfd202385d97a77f6d5da33adb746c32e8c75340f")
    public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean =
        addToPolicy(PolicyStatement(statement))

    /**
     * Add to the policy of this principal.
     *
     * @param _statement
     */
    public override fun addToPrincipalPolicy(
        _statement: PolicyStatement
    ): AddToPrincipalPolicyResult =
        unwrap(this)
            .addToPrincipalPolicy(_statement.let(PolicyStatement::unwrap))
            .let(AddToPrincipalPolicyResult::wrap)

    /**
     * Add to the policy of this principal.
     *
     * @param _statement
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
    public override fun addToPrincipalPolicy(
        _statement: PolicyStatement.Builder.() -> Unit
    ): AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(_statement))

    /** When this Principal is used in an AssumeRole policy, the action to use. */
    public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

    /** Return whether or not this principal is equal to the given principal. */
    public override fun dedupeString(): String? = unwrap(this).dedupeString()

    /** The principal to grant permissions to. */
    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /** Return the policy fragment that identifies this principal in a Policy. */
    public override fun policyFragment(): PrincipalPolicyFragment =
        unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

    /**
     * The AWS account ID of this principal.
     *
     * Can be undefined when the account is not known (for example, for service principals). Can be
     * a Token - in that case, it's assumed to be AWS::AccountId.
     */
    public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

    /**
     * JSON-ify the principal.
     *
     * Used when JSON.stringify() is called
     */
    public open fun toJson(): Map<String, List<String>> = unwrap(this).toJSON() ?: emptyMap()

    /**
     * Returns a new PrincipalWithConditions using this principal as the base, with the passed
     * conditions added.
     *
     * When there is a value for the same operator and key in both the principal and the conditions
     * parameter, the value from the conditions parameter will be used.
     *
     * @param conditions
     * @return a new PrincipalWithConditions object.
     */
    public open fun withConditions(conditions: Map<String, Any>): PrincipalBase =
        unwrap(this).withConditions(conditions).let(PrincipalBase::wrap)

    /**
     * Returns a new principal using this principal as the base, with session tags enabled.
     *
     * @return a new SessionTagsPrincipal object.
     */
    public open fun withSessionTags(): PrincipalBase =
        unwrap(this).withSessionTags().let(PrincipalBase::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.iam.PrincipalBase,
    ) : PrincipalBase(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.iam.PrincipalBase
        ): PrincipalBase = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: PrincipalBase
        ): software.amazon.awscdk.services.iam.PrincipalBase = (wrapped as Wrapper).cdkObject
    }
}
