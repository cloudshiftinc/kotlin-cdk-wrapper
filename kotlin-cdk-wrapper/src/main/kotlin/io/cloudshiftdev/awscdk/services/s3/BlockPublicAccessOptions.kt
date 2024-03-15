@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface BlockPublicAccessOptions {
  public fun blockPublicAcls(): Boolean? = unwrap(this).getBlockPublicAcls()

  public fun blockPublicPolicy(): Boolean? = unwrap(this).getBlockPublicPolicy()

  public fun ignorePublicAcls(): Boolean? = unwrap(this).getIgnorePublicAcls()

  public fun restrictPublicBuckets(): Boolean? = unwrap(this).getRestrictPublicBuckets()

  @CdkDslMarker
  public interface Builder {
    public fun blockPublicAcls(blockPublicAcls: Boolean)

    public fun blockPublicPolicy(blockPublicPolicy: Boolean)

    public fun ignorePublicAcls(ignorePublicAcls: Boolean)

    public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder =
        software.amazon.awscdk.services.s3.BlockPublicAccessOptions.builder()

    override fun blockPublicAcls(blockPublicAcls: Boolean) {
      cdkBuilder.blockPublicAcls(blockPublicAcls)
    }

    override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
      cdkBuilder.ignorePublicAcls(ignorePublicAcls)
    }

    override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
      cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
    }

    public fun build(): software.amazon.awscdk.services.s3.BlockPublicAccessOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.BlockPublicAccessOptions,
  ) : CdkObject(cdkObject), BlockPublicAccessOptions {
    override fun blockPublicAcls(): Boolean? = unwrap(this).getBlockPublicAcls()

    override fun blockPublicPolicy(): Boolean? = unwrap(this).getBlockPublicPolicy()

    override fun ignorePublicAcls(): Boolean? = unwrap(this).getIgnorePublicAcls()

    override fun restrictPublicBuckets(): Boolean? = unwrap(this).getRestrictPublicBuckets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BlockPublicAccessOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BlockPublicAccessOptions):
        BlockPublicAccessOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BlockPublicAccessOptions):
        software.amazon.awscdk.services.s3.BlockPublicAccessOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.BlockPublicAccessOptions
  }
}
