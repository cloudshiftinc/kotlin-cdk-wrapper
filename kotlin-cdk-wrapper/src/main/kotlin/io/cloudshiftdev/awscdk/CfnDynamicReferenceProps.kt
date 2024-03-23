@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Dynamic Reference.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnDynamicReferenceProps cfnDynamicReferenceProps = CfnDynamicReferenceProps.builder()
 * .referenceKey("referenceKey")
 * .service(CfnDynamicReferenceService.SSM)
 * .build();
 * ```
 */
public interface CfnDynamicReferenceProps {
  /**
   * The reference key of the dynamic reference.
   */
  public fun referenceKey(): String

  /**
   * The service to retrieve the dynamic reference from.
   */
  public fun service(): CfnDynamicReferenceService

  /**
   * A builder for [CfnDynamicReferenceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param referenceKey The reference key of the dynamic reference. 
     */
    public fun referenceKey(referenceKey: String)

    /**
     * @param service The service to retrieve the dynamic reference from. 
     */
    public fun service(service: CfnDynamicReferenceService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnDynamicReferenceProps.Builder =
        software.amazon.awscdk.CfnDynamicReferenceProps.builder()

    /**
     * @param referenceKey The reference key of the dynamic reference. 
     */
    override fun referenceKey(referenceKey: String) {
      cdkBuilder.referenceKey(referenceKey)
    }

    /**
     * @param service The service to retrieve the dynamic reference from. 
     */
    override fun service(service: CfnDynamicReferenceService) {
      cdkBuilder.service(service.let(CfnDynamicReferenceService::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnDynamicReferenceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnDynamicReferenceProps,
  ) : CdkObject(cdkObject), CfnDynamicReferenceProps {
    /**
     * The reference key of the dynamic reference.
     */
    override fun referenceKey(): String = unwrap(this).getReferenceKey()

    /**
     * The service to retrieve the dynamic reference from.
     */
    override fun service(): CfnDynamicReferenceService =
        unwrap(this).getService().let(CfnDynamicReferenceService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDynamicReferenceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnDynamicReferenceProps):
        CfnDynamicReferenceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDynamicReferenceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDynamicReferenceProps):
        software.amazon.awscdk.CfnDynamicReferenceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnDynamicReferenceProps
  }
}
