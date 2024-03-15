@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ECRSourceOptions {
  public fun actionName(): String? = unwrap(this).getActionName()

  public fun imageTag(): String? = unwrap(this).getImageTag()

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun imageTag(imageTag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ECRSourceOptions.Builder =
        software.amazon.awscdk.pipelines.ECRSourceOptions.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    public fun build(): software.amazon.awscdk.pipelines.ECRSourceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ECRSourceOptions,
  ) : CdkObject(cdkObject), ECRSourceOptions {
    override fun actionName(): String? = unwrap(this).getActionName()

    override fun imageTag(): String? = unwrap(this).getImageTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ECRSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ECRSourceOptions):
        ECRSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ECRSourceOptions):
        software.amazon.awscdk.pipelines.ECRSourceOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.ECRSourceOptions
  }
}
