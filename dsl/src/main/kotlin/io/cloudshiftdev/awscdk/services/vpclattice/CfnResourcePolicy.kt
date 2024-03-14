package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourcePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policy(): Any = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  public interface Builder {
    public fun policy(policy: Any)

    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnResourcePolicy.Builder =
        software.amazon.awscdk.services.vpclattice.CfnResourcePolicy.Builder.create(scope, id)

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnResourcePolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.vpclattice.CfnResourcePolicy = wrapped.cdkObject
  }
}
