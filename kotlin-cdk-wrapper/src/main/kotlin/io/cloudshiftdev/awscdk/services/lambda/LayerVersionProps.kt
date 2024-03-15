@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LayerVersionProps : LayerVersionOptions {
  public fun code(): Code

  public fun compatibleArchitectures(): List<Architecture> =
      unwrap(this).getCompatibleArchitectures()?.map(Architecture::wrap) ?: emptyList()

  public fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun code(code: Code)

    public fun compatibleArchitectures(compatibleArchitectures: List<Architecture>)

    public fun compatibleArchitectures(vararg compatibleArchitectures: Architecture)

    public fun compatibleRuntimes(compatibleRuntimes: List<Runtime>)

    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime)

    public fun description(description: String)

    public fun layerVersionName(layerVersionName: String)

    public fun license(license: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionProps.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionProps.builder()

    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    override fun compatibleArchitectures(compatibleArchitectures: List<Architecture>) {
      cdkBuilder.compatibleArchitectures(compatibleArchitectures.map(Architecture::unwrap))
    }

    override fun compatibleArchitectures(vararg compatibleArchitectures: Architecture): Unit =
        compatibleArchitectures(compatibleArchitectures.toList())

    override fun compatibleRuntimes(compatibleRuntimes: List<Runtime>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes.map(Runtime::unwrap))
    }

    override fun compatibleRuntimes(vararg compatibleRuntimes: Runtime): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun layerVersionName(layerVersionName: String) {
      cdkBuilder.layerVersionName(layerVersionName)
    }

    override fun license(license: String) {
      cdkBuilder.license(license)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LayerVersionProps,
  ) : CdkObject(cdkObject), LayerVersionProps {
    override fun code(): Code = unwrap(this).getCode().let(Code::wrap)

    override fun compatibleArchitectures(): List<Architecture> =
        unwrap(this).getCompatibleArchitectures()?.map(Architecture::wrap) ?: emptyList()

    override fun compatibleRuntimes(): List<Runtime> =
        unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun layerVersionName(): String? = unwrap(this).getLayerVersionName()

    override fun license(): String? = unwrap(this).getLicense()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionProps):
        LayerVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LayerVersionProps):
        software.amazon.awscdk.services.lambda.LayerVersionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.LayerVersionProps
  }
}
