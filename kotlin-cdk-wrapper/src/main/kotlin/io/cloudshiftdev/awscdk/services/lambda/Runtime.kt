@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.DockerImage
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class Runtime internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.Runtime,
) : CdkObject(cdkObject) {
  public open fun bundlingImage(): DockerImage =
      unwrap(this).getBundlingImage().let(DockerImage::wrap)

  public open fun family(): RuntimeFamily? = unwrap(this).getFamily()?.let(RuntimeFamily::wrap)

  public open fun isVariable(): Boolean = unwrap(this).getIsVariable()

  public open fun name(): String = unwrap(this).getName()

  public open fun runtimeEquals(other: Runtime): Boolean =
      unwrap(this).runtimeEquals(other.let(Runtime::unwrap))

  public open fun supportsCodeGuruProfiling(): Boolean = unwrap(this).getSupportsCodeGuruProfiling()

  public open fun supportsInlineCode(): Boolean = unwrap(this).getSupportsInlineCode()

  public open fun supportsSnapStart(): Boolean = unwrap(this).getSupportsSnapStart()

  @CdkDslMarker
  public interface Builder {
    public fun bundlingDockerImage(bundlingDockerImage: String)

    public fun isVariable(isVariable: Boolean)

    public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean)

    public fun supportsInlineCode(supportsInlineCode: Boolean)

    public fun supportsSnapStart(supportsSnapStart: Boolean)
  }

  private class BuilderImpl(
    name: String,
    family: software.amazon.awscdk.services.lambda.RuntimeFamily,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Runtime.Builder =
        software.amazon.awscdk.services.lambda.Runtime.Builder.create(name, family)

    override fun bundlingDockerImage(bundlingDockerImage: String) {
      cdkBuilder.bundlingDockerImage(bundlingDockerImage)
    }

    override fun isVariable(isVariable: Boolean) {
      cdkBuilder.isVariable(isVariable)
    }

    override fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
      cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
    }

    override fun supportsInlineCode(supportsInlineCode: Boolean) {
      cdkBuilder.supportsInlineCode(supportsInlineCode)
    }

    override fun supportsSnapStart(supportsSnapStart: Boolean) {
      cdkBuilder.supportsSnapStart(supportsSnapStart)
    }

    public fun build(): software.amazon.awscdk.services.lambda.Runtime = cdkBuilder.build()
  }

  public companion object {
    public val ALL: List<Runtime> =
        software.amazon.awscdk.services.lambda.Runtime.ALL.map(Runtime::wrap)

    public val DOTNET_6: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.DOTNET_6)

    public val DOTNET_8: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.DOTNET_8)

    public val DOTNET_CORE_1: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.DOTNET_CORE_1)

    public val DOTNET_CORE_2: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.DOTNET_CORE_2)

    public val DOTNET_CORE_2_1: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.DOTNET_CORE_2_1)

    public val DOTNET_CORE_3_1: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.DOTNET_CORE_3_1)

    public val FROM_IMAGE: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.FROM_IMAGE)

    public val GO_1_X: Runtime = Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.GO_1_X)

    public val JAVA_11: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.JAVA_11)

    public val JAVA_17: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.JAVA_17)

    public val JAVA_21: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.JAVA_21)

    public val JAVA_8: Runtime = Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.JAVA_8)

    public val JAVA_8_CORRETTO: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.JAVA_8_CORRETTO)

    public val NODEJS: Runtime = Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS)

    public val NODEJS_10_X: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_10_X)

    public val NODEJS_12_X: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_12_X)

    public val NODEJS_14_X: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_14_X)

    public val NODEJS_16_X: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_16_X)

    public val NODEJS_18_X: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_18_X)

    public val NODEJS_20_X: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_20_X)

    public val NODEJS_4_3: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_4_3)

    public val NODEJS_6_10: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_6_10)

    public val NODEJS_8_10: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_8_10)

    public val NODEJS_LATEST: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.NODEJS_LATEST)

    public val PROVIDED: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PROVIDED)

    public val PROVIDED_AL2: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PROVIDED_AL2)

    public val PROVIDED_AL2023: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PROVIDED_AL2023)

    public val PYTHON_2_7: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PYTHON_2_7)

    public val PYTHON_3_10: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PYTHON_3_10)

    public val PYTHON_3_11: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PYTHON_3_11)

    public val PYTHON_3_12: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PYTHON_3_12)

    public val PYTHON_3_6: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PYTHON_3_6)

    public val PYTHON_3_7: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PYTHON_3_7)

    public val PYTHON_3_8: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PYTHON_3_8)

    public val PYTHON_3_9: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.PYTHON_3_9)

    public val RUBY_2_5: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.RUBY_2_5)

    public val RUBY_2_7: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.RUBY_2_7)

    public val RUBY_3_2: Runtime =
        Runtime.wrap(software.amazon.awscdk.services.lambda.Runtime.RUBY_3_2)

    public operator fun invoke(
      name: String,
      family: RuntimeFamily,
      block: Builder.() -> Unit = {},
    ): Runtime {
      val builderImpl = BuilderImpl(name, RuntimeFamily.unwrap(family))
      return Runtime(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Runtime): Runtime =
        Runtime(cdkObject)

    internal fun unwrap(wrapped: Runtime): software.amazon.awscdk.services.lambda.Runtime =
        wrapped.cdkObject
  }
}
