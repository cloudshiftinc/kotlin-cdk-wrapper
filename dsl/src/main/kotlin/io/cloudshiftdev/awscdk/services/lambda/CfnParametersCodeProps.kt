package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnParameter
import kotlin.Unit

public interface CfnParametersCodeProps {
  public fun bucketNameParam(): CfnParameter? =
      unwrap(this).getBucketNameParam()?.let(CfnParameter::wrap)

  public fun objectKeyParam(): CfnParameter? =
      unwrap(this).getObjectKeyParam()?.let(CfnParameter::wrap)

  public interface Builder {
    public fun bucketNameParam(bucketNameParam: CfnParameter)

    public fun objectKeyParam(objectKeyParam: CfnParameter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnParametersCodeProps.Builder =
        software.amazon.awscdk.services.lambda.CfnParametersCodeProps.builder()

    override fun bucketNameParam(bucketNameParam: CfnParameter) {
      cdkBuilder.bucketNameParam(bucketNameParam.let(CfnParameter::unwrap))
    }

    override fun objectKeyParam(objectKeyParam: CfnParameter) {
      cdkBuilder.objectKeyParam(objectKeyParam.let(CfnParameter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnParametersCodeProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCodeProps,
  ) : CfnParametersCodeProps {
    override fun bucketNameParam(): CfnParameter? =
        unwrap(this).getBucketNameParam()?.let(CfnParameter::wrap)

    override fun objectKeyParam(): CfnParameter? =
        unwrap(this).getObjectKeyParam()?.let(CfnParameter::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParametersCodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCodeProps):
        CfnParametersCodeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParametersCodeProps):
        software.amazon.awscdk.services.lambda.CfnParametersCodeProps = (wrapped as
        Wrapper).cdkObject
  }
}
