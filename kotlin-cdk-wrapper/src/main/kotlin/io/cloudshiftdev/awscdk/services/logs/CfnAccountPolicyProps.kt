@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnAccountPolicyProps {
  public fun policyDocument(): String

  public fun policyName(): String

  public fun policyType(): String

  public fun scope(): String? = unwrap(this).getScope()

  public fun selectionCriteria(): String? = unwrap(this).getSelectionCriteria()

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: String)

    public fun policyName(policyName: String)

    public fun policyType(policyType: String)

    public fun scope(scope: String)

    public fun selectionCriteria(selectionCriteria: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnAccountPolicyProps.Builder =
        software.amazon.awscdk.services.logs.CfnAccountPolicyProps.builder()

    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun selectionCriteria(selectionCriteria: String) {
      cdkBuilder.selectionCriteria(selectionCriteria)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnAccountPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnAccountPolicyProps,
  ) : CdkObject(cdkObject), CfnAccountPolicyProps {
    override fun policyDocument(): String = unwrap(this).getPolicyDocument()

    override fun policyName(): String = unwrap(this).getPolicyName()

    override fun policyType(): String = unwrap(this).getPolicyType()

    override fun scope(): String? = unwrap(this).getScope()

    override fun selectionCriteria(): String? = unwrap(this).getSelectionCriteria()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnAccountPolicyProps):
        CfnAccountPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountPolicyProps):
        software.amazon.awscdk.services.logs.CfnAccountPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnAccountPolicyProps
  }
}
