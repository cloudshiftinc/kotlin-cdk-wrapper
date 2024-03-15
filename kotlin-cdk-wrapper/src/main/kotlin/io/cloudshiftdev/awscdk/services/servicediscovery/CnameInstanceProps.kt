@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * CnameInstanceProps cnameInstanceProps = CnameInstanceProps.builder()
 * .instanceCname("instanceCname")
 * .service(service)
 * // the properties below are optional
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .build();
 * ```
 */
public interface CnameInstanceProps : CnameInstanceBaseProps {
  /**
   * The Cloudmap service this resource is registered to.
   */
  public fun service(): IService

  /**
   * A builder for [CnameInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customAttributes Custom attributes of the instance.
     */
    public fun customAttributes(customAttributes: Map<String, String>)

    /**
     * @param instanceCname If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example, example.com. This
     * value is required if the service specified by ServiceId includes settings for an CNAME record. 
     */
    public fun instanceCname(instanceCname: String)

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
        software.amazon.awscdk.services.servicediscovery.CnameInstanceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.CnameInstanceProps.builder()

    /**
     * @param customAttributes Custom attributes of the instance.
     */
    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * @param instanceCname If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example, example.com. This
     * value is required if the service specified by ServiceId includes settings for an CNAME record. 
     */
    override fun instanceCname(instanceCname: String) {
      cdkBuilder.instanceCname(instanceCname)
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
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CnameInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstanceProps,
  ) : CdkObject(cdkObject), CnameInstanceProps {
    /**
     * Custom attributes of the instance.
     *
     * Default: none
     */
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    /**
     * If the service configuration includes a CNAME record, the domain name that you want Route 53
     * to return in response to DNS queries, for example, example.com. This value is required if the
     * service specified by ServiceId includes settings for an CNAME record.
     */
    override fun instanceCname(): String = unwrap(this).getInstanceCname()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): CnameInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstanceProps):
        CnameInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CnameInstanceProps):
        software.amazon.awscdk.services.servicediscovery.CnameInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.CnameInstanceProps
  }
}
