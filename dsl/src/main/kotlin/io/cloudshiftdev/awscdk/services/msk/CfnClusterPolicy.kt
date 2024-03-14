package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClusterPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.msk.CfnClusterPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCurrentVersion(): String = unwrap(this).getAttrCurrentVersion()

  public open fun clusterArn(): String = unwrap(this).getClusterArn()

  public open fun clusterArn(`value`: String) {
    unwrap(this).setClusterArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policy(): Any = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public interface Builder {
    public fun clusterArn(clusterArn: String)

    public fun policy(policy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnClusterPolicy.Builder =
        software.amazon.awscdk.services.msk.CfnClusterPolicy.Builder.create(scope, id)

    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnClusterPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClusterPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClusterPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnClusterPolicy):
        CfnClusterPolicy = CfnClusterPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnClusterPolicy):
        software.amazon.awscdk.services.msk.CfnClusterPolicy = wrapped.cdkObject
  }
}
