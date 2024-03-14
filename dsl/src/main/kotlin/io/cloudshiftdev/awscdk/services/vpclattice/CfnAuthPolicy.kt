package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAuthPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.vpclattice.CfnAuthPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrState(): String = unwrap(this).getAttrState()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policy(): Any = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public open fun resourceIdentifier(): String = unwrap(this).getResourceIdentifier()

  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  public interface Builder {
    public fun policy(policy: Any) {
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnAuthPolicy.Builder =
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicy.Builder.create(scope, id)

    public override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnAuthPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAuthPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAuthPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnAuthPolicy):
        CfnAuthPolicy = CfnAuthPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnAuthPolicy):
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicy = wrapped.cdkObject
  }
}
