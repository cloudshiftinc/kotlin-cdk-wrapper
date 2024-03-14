package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AliasTargetInstanceProps : BaseInstanceProps {
  /**
   * DNS name of the target.
   */
  public fun dnsName(): String

  /**
   * The Cloudmap service this resource is registered to.
   */
  public fun service(): IService

  /**
   * A builder for [AliasTargetInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customAttributes Custom attributes of the instance.
     */
    public fun customAttributes(customAttributes: Map<String, String>)

    /**
     * @param dnsName DNS name of the target. 
     */
    public fun dnsName(dnsName: String)

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
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps.builder()

    /**
     * @param customAttributes Custom attributes of the instance.
     */
    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * @param dnsName DNS name of the target. 
     */
    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
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

    public fun build(): software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps,
  ) : CdkObject(cdkObject), AliasTargetInstanceProps {
    /**
     * Custom attributes of the instance.
     *
     * Default: none
     */
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    /**
     * DNS name of the target.
     */
    override fun dnsName(): String = unwrap(this).getDnsName()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasTargetInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps):
        AliasTargetInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasTargetInstanceProps):
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
  }
}
