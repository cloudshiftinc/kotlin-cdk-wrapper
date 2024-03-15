@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ResourceBindOptions {
  public fun resourceProperty(): String? = unwrap(this).getResourceProperty()

  @CdkDslMarker
  public interface Builder {
    public fun resourceProperty(resourceProperty: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.ResourceBindOptions.Builder =
        software.amazon.awscdk.services.lambda.ResourceBindOptions.builder()

    override fun resourceProperty(resourceProperty: String) {
      cdkBuilder.resourceProperty(resourceProperty)
    }

    public fun build(): software.amazon.awscdk.services.lambda.ResourceBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.ResourceBindOptions,
  ) : CdkObject(cdkObject), ResourceBindOptions {
    override fun resourceProperty(): String? = unwrap(this).getResourceProperty()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ResourceBindOptions):
        ResourceBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceBindOptions):
        software.amazon.awscdk.services.lambda.ResourceBindOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.ResourceBindOptions
  }
}
