@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3objectlambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnAccessPointPolicyProps {
  public fun objectLambdaAccessPoint(): String

  public fun policyDocument(): Any

  @CdkDslMarker
  public interface Builder {
    public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String)

    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps.Builder =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps.builder()

    override fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
      cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
    }

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps,
  ) : CdkObject(cdkObject), CfnAccessPointPolicyProps {
    override fun objectLambdaAccessPoint(): String = unwrap(this).getObjectLambdaAccessPoint()

    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps):
        CfnAccessPointPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointPolicyProps):
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicyProps
  }
}
