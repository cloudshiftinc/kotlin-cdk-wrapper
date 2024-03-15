@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class CompositePrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CompositePrincipal,
) : PrincipalBase(cdkObject) {
  public open fun addPrincipals(principals: IPrincipal): CompositePrincipal =
      unwrap(this).addPrincipals(principals.let(IPrincipal::unwrap)).let(CompositePrincipal::wrap)

  public override fun addToAssumeRolePolicy(doc: PolicyDocument) {
    unwrap(this).addToAssumeRolePolicy(doc.let(PolicyDocument::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cef9e06c9678a219d566dc6f09959675ba743f7c64440ddbd5b37c4d552db9c0")
  public override fun addToAssumeRolePolicy(doc: PolicyDocument.Builder.() -> Unit): Unit =
      addToAssumeRolePolicy(PolicyDocument(doc))

  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public open fun principals(): List<IPrincipal> =
      unwrap(this).getPrincipals().map(IPrincipal::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CompositePrincipal):
        CompositePrincipal = CompositePrincipal(cdkObject)

    internal fun unwrap(wrapped: CompositePrincipal):
        software.amazon.awscdk.services.iam.CompositePrincipal = wrapped.cdkObject
  }
}
