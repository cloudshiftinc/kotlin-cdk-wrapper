@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDynamicReferenceProps {
  public fun referenceKey(): String

  public fun service(): CfnDynamicReferenceService

  @CdkDslMarker
  public interface Builder {
    public fun referenceKey(referenceKey: String)

    public fun service(service: CfnDynamicReferenceService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnDynamicReferenceProps.Builder =
        software.amazon.awscdk.CfnDynamicReferenceProps.builder()

    override fun referenceKey(referenceKey: String) {
      cdkBuilder.referenceKey(referenceKey)
    }

    override fun service(service: CfnDynamicReferenceService) {
      cdkBuilder.service(service.let(CfnDynamicReferenceService::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnDynamicReferenceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnDynamicReferenceProps,
  ) : CdkObject(cdkObject), CfnDynamicReferenceProps {
    override fun referenceKey(): String = unwrap(this).getReferenceKey()

    override fun service(): CfnDynamicReferenceService =
        unwrap(this).getService().let(CfnDynamicReferenceService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDynamicReferenceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnDynamicReferenceProps):
        CfnDynamicReferenceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDynamicReferenceProps):
        software.amazon.awscdk.CfnDynamicReferenceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnDynamicReferenceProps
  }
}
