@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * Service service;
 * NonIpInstanceProps nonIpInstanceProps = NonIpInstanceProps.builder()
 * .service(service)
 * // the properties below are optional
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .build();
 * ```
 */
public interface NonIpInstanceProps : NonIpInstanceBaseProps {
  /**
   * The Cloudmap service this resource is registered to.
   */
  public fun service(): IService

  /**
   * A builder for [NonIpInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customAttributes Custom attributes of the instance.
     */
    public fun customAttributes(customAttributes: Map<String, String>)

    /**
     * @param instanceId The id of the instance resource.
     */
    public fun instanceId(instanceId: String)

    /**
     * @param service The Cloudmap service this resource is registered to. 
     */
    public fun service(service: IService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps.builder()

    /**
     * @param customAttributes Custom attributes of the instance.
     */
    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * @param instanceId The id of the instance resource.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param service The Cloudmap service this resource is registered to. 
     */
    override fun service(service: IService) {
      cdkBuilder.service(service.let(IService.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps,
  ) : CdkObject(cdkObject), NonIpInstanceProps {
    /**
     * Custom attributes of the instance.
     *
     * Default: none
     */
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     */
    override fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * The Cloudmap service this resource is registered to.
     */
    override fun service(): IService = unwrap(this).getService().let(IService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NonIpInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps):
        NonIpInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? NonIpInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NonIpInstanceProps):
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps
  }
}
