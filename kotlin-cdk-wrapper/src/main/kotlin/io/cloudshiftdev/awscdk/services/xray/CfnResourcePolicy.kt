@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourcePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.xray.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun bypassPolicyLockoutCheck(): Any? = unwrap(this).getBypassPolicyLockoutCheck()

  public open fun bypassPolicyLockoutCheck(`value`: Boolean) {
    unwrap(this).setBypassPolicyLockoutCheck(`value`)
  }

  public open fun bypassPolicyLockoutCheck(`value`: IResolvable) {
    unwrap(this).setBypassPolicyLockoutCheck(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): String = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: String) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun policyName(): String = unwrap(this).getPolicyName()

  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean)

    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable)

    public fun policyDocument(policyDocument: String)

    public fun policyName(policyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnResourcePolicy.Builder =
        software.amazon.awscdk.services.xray.CfnResourcePolicy.Builder.create(scope, id)

    override fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    override fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck.let(IResolvable::unwrap))
    }

    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public fun build(): software.amazon.awscdk.services.xray.CfnResourcePolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.xray.CfnResourcePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.xray.CfnResourcePolicy = wrapped.cdkObject
  }
}
