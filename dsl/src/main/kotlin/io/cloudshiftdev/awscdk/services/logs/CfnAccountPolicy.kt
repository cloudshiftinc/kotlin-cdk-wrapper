package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccountPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnAccountPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

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

  public open fun policyType(): String = unwrap(this).getPolicyType()

  public open fun policyType(`value`: String) {
    unwrap(this).setPolicyType(`value`)
  }

  public open fun scope(): String? = unwrap(this).getScope()

  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  public open fun selectionCriteria(): String? = unwrap(this).getSelectionCriteria()

  public open fun selectionCriteria(`value`: String) {
    unwrap(this).setSelectionCriteria(`value`)
  }

  public interface Builder {
    public fun policyDocument(policyDocument: String) {
    }

    public fun policyName(policyName: String) {
    }

    public fun policyType(policyType: String) {
    }

    public fun scope(scope: String) {
    }

    public fun selectionCriteria(selectionCriteria: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnAccountPolicy.Builder =
        software.amazon.awscdk.services.logs.CfnAccountPolicy.Builder.create(scope, id)

    public override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

    public override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    public override fun selectionCriteria(selectionCriteria: String) {
      cdkBuilder.selectionCriteria(selectionCriteria)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnAccountPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccountPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccountPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnAccountPolicy):
        CfnAccountPolicy = CfnAccountPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnAccountPolicy):
        software.amazon.awscdk.services.logs.CfnAccountPolicy = wrapped.cdkObject
  }
}
