@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public abstract class PrincipalBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.PrincipalBase,
) : CdkObject(cdkObject), IAssumeRolePrincipal, IComparablePrincipal {
  public override fun addToAssumeRolePolicy(document: PolicyDocument) {
    unwrap(this).addToAssumeRolePolicy(document.let(PolicyDocument::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cef9e06c9678a219d566dc6f09959675ba743f7c64440ddbd5b37c4d552db9c0")
  public override fun addToAssumeRolePolicy(document: PolicyDocument.Builder.() -> Unit): Unit =
      addToAssumeRolePolicy(PolicyDocument(document))

  public open fun addToPolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToPolicy(statement.let(PolicyStatement::unwrap))

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6148e52b961e7728ba57cdabfd202385d97a77f6d5da33adb746c32e8c75340f")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean =
      addToPolicy(PolicyStatement(statement))

  public override fun addToPrincipalPolicy(_statement: PolicyStatement): AddToPrincipalPolicyResult
      =
      unwrap(this).addToPrincipalPolicy(_statement.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(_statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(_statement))

  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  public open fun toJson(): Map<String, List<String>> = unwrap(this).toJSON() ?: emptyMap()

  public open fun withConditions(conditions: Map<String, Any>): PrincipalBase =
      unwrap(this).withConditions(conditions).let(PrincipalBase::wrap)

  public open fun withSessionTags(): PrincipalBase =
      unwrap(this).withSessionTags().let(PrincipalBase::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.PrincipalBase,
  ) : PrincipalBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PrincipalBase): PrincipalBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrincipalBase): software.amazon.awscdk.services.iam.PrincipalBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.PrincipalBase
  }
}
