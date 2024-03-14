package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourcePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

  public open fun blockPublicPolicy(`value`: Boolean) {
    unwrap(this).setBlockPublicPolicy(`value`)
  }

  public open fun blockPublicPolicy(`value`: IResolvable) {
    unwrap(this).setBlockPublicPolicy(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

  public open fun resourcePolicy(`value`: Any) {
    unwrap(this).setResourcePolicy(`value`)
  }

  public open fun secretId(): String = unwrap(this).getSecretId()

  public open fun secretId(`value`: String) {
    unwrap(this).setSecretId(`value`)
  }

  public interface Builder {
    public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
    }

    public fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
    }

    public fun resourcePolicy(resourcePolicy: Any) {
    }

    public fun secretId(secretId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy.Builder
        = software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy.Builder.create(scope, id)

    public override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    public override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
    }

    public override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    public override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy =
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy = wrapped.cdkObject
  }
}
