package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnParameter
import io.cloudshiftdev.awscdk.services.s3.Location
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class CfnParametersCode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCode,
) : Code(cdkObject) {
  public open fun assign(location: Location): Map<String, Any> =
      unwrap(this).assign(location.let(Location::unwrap)) ?: emptyMap()

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("763bde8316faa202313b1726887e0e19b556f1a821ee54d3e2ebf1d920950e12")
  public open fun assign(location: Location.Builder.() -> Unit): Map<String, Any> =
      assign(Location(location))

  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  public open fun bucketNameParam(): String = unwrap(this).getBucketNameParam()

  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public open fun objectKeyParam(): String = unwrap(this).getObjectKeyParam()

  public interface Builder {
    public fun bucketNameParam(bucketNameParam: CfnParameter) {
    }

    public fun objectKeyParam(objectKeyParam: CfnParameter) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnParametersCode.Builder =
        software.amazon.awscdk.services.lambda.CfnParametersCode.Builder.create()

    public override fun bucketNameParam(bucketNameParam: CfnParameter) {
      cdkBuilder.bucketNameParam(bucketNameParam.let(CfnParameter::unwrap))
    }

    public override fun objectKeyParam(objectKeyParam: CfnParameter) {
      cdkBuilder.objectKeyParam(objectKeyParam.let(CfnParameter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnParametersCode =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParametersCode {
      val builderImpl = BuilderImpl()
      return CfnParametersCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCode):
        CfnParametersCode = CfnParametersCode(cdkObject)

    internal fun unwrap(wrapped: CfnParametersCode):
        software.amazon.awscdk.services.lambda.CfnParametersCode = wrapped.cdkObject
  }
}
