@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LayerVersionAttributes {
  public fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  public fun layerVersionArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun compatibleRuntimes(compatibleRuntimes: List<Runtime>)

    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime)

    public fun layerVersionArn(layerVersionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersionAttributes.Builder =
        software.amazon.awscdk.services.lambda.LayerVersionAttributes.builder()

    override fun compatibleRuntimes(compatibleRuntimes: List<Runtime>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes.map(Runtime::unwrap))
    }

    override fun compatibleRuntimes(vararg compatibleRuntimes: Runtime): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    override fun layerVersionArn(layerVersionArn: String) {
      cdkBuilder.layerVersionArn(layerVersionArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LayerVersionAttributes,
  ) : CdkObject(cdkObject), LayerVersionAttributes {
    override fun compatibleRuntimes(): List<Runtime> =
        unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

    override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LayerVersionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersionAttributes):
        LayerVersionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LayerVersionAttributes):
        software.amazon.awscdk.services.lambda.LayerVersionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LayerVersionAttributes
  }
}
