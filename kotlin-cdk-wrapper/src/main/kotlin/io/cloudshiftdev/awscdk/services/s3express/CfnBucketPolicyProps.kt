@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnBucketPolicyProps {
  public fun bucket(): String

  public fun policyDocument(): Any

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: String)

    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3express.CfnBucketPolicyProps.Builder =
        software.amazon.awscdk.services.s3express.CfnBucketPolicyProps.builder()

    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3express.CfnBucketPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3express.CfnBucketPolicyProps,
  ) : CdkObject(cdkObject), CfnBucketPolicyProps {
    override fun bucket(): String = unwrap(this).getBucket()

    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBucketPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnBucketPolicyProps):
        CfnBucketPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBucketPolicyProps):
        software.amazon.awscdk.services.s3express.CfnBucketPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3express.CfnBucketPolicyProps
  }
}
