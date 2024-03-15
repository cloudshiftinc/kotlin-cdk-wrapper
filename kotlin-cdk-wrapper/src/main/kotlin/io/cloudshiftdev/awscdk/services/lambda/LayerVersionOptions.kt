@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface LayerVersionOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun layerVersionName(): String? = unwrap(this).getLayerVersionName()

  public fun license(): String? = unwrap(this).getLicense()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun layerVersionName(layerVersionName: String)

    public fun license(license: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionOptions.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LayerVersionOptions,
  ) : CdkObject(cdkObject), LayerVersionOptions {
    override fun description(): String? = unwrap(this).getDescription()

    override fun layerVersionName(): String? = unwrap(this).getLayerVersionName()

    override fun license(): String? = unwrap(this).getLicense()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionOptions):
        LayerVersionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LayerVersionOptions):
        software.amazon.awscdk.services.lambda.LayerVersionOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LayerVersionOptions
  }
}
