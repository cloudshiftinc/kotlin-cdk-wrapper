package io.cloudshiftdev.awscdk.services.s3

import kotlin.Boolean
import kotlin.Unit

public open class BlockPublicAccess internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.BlockPublicAccess,
) {
  public open fun blockPublicAcls(): Boolean? = unwrap(this).getBlockPublicAcls()

  public open fun blockPublicAcls(`value`: Boolean) {
    unwrap(this).setBlockPublicAcls(`value`)
  }

  public open fun blockPublicPolicy(): Boolean? = unwrap(this).getBlockPublicPolicy()

  public open fun blockPublicPolicy(`value`: Boolean) {
    unwrap(this).setBlockPublicPolicy(`value`)
  }

  public open fun ignorePublicAcls(): Boolean? = unwrap(this).getIgnorePublicAcls()

  public open fun ignorePublicAcls(`value`: Boolean) {
    unwrap(this).setIgnorePublicAcls(`value`)
  }

  public open fun restrictPublicBuckets(): Boolean? = unwrap(this).getRestrictPublicBuckets()

  public open fun restrictPublicBuckets(`value`: Boolean) {
    unwrap(this).setRestrictPublicBuckets(`value`)
  }

  public interface Builder {
    public fun blockPublicAcls(blockPublicAcls: Boolean) {
    }

    public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
    }

    public fun ignorePublicAcls(ignorePublicAcls: Boolean) {
    }

    public fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BlockPublicAccess.Builder =
        software.amazon.awscdk.services.s3.BlockPublicAccess.Builder.create()

    public override fun blockPublicAcls(blockPublicAcls: Boolean) {
      cdkBuilder.blockPublicAcls(blockPublicAcls)
    }

    public override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    public override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
      cdkBuilder.ignorePublicAcls(ignorePublicAcls)
    }

    public override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
      cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
    }

    public fun build(): software.amazon.awscdk.services.s3.BlockPublicAccess = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BlockPublicAccess {
      val builderImpl = BuilderImpl()
      return BlockPublicAccess(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BlockPublicAccess):
        BlockPublicAccess = BlockPublicAccess(cdkObject)

    internal fun unwrap(wrapped: BlockPublicAccess):
        software.amazon.awscdk.services.s3.BlockPublicAccess = wrapped.cdkObject
  }
}
