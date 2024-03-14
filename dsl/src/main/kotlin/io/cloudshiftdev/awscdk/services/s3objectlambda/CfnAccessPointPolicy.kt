package io.cloudshiftdev.awscdk.services.s3objectlambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessPointPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun objectLambdaAccessPoint(): String = unwrap(this).getObjectLambdaAccessPoint()

  public open fun objectLambdaAccessPoint(`value`: String) {
    unwrap(this).setObjectLambdaAccessPoint(`value`)
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public interface Builder {
    public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String)

    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy.Builder =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy.Builder.create(scope,
        id)

    override fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
      cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
    }

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPointPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPointPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy):
        CfnAccessPointPolicy = CfnAccessPointPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointPolicy):
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy = wrapped.cdkObject
  }
}
