package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CnameInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstance,
) : InstanceBase(cdkObject) {
  /**
   * The domain name returned by DNS queries for the instance.
   */
  public open fun cname(): String = unwrap(this).getCname()

  /**
   * The Id of the instance.
   */
  public override fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The Cloudmap service to which the instance is registered.
   */
  public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.CnameInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Custom attributes of the instance.
     *
     * Default: none
     *
     * @param customAttributes Custom attributes of the instance. 
     */
    public fun customAttributes(customAttributes: Map<String, String>)

    /**
     * If the service configuration includes a CNAME record, the domain name that you want Route 53
     * to return in response to DNS queries, for example, example.com. This value is required if the
     * service specified by ServiceId includes settings for an CNAME record.
     *
     * @param instanceCname If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example, example.com. This
     * value is required if the service specified by ServiceId includes settings for an CNAME record. 
     */
    public fun instanceCname(instanceCname: String)

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     *
     * @param instanceId The id of the instance resource. 
     */
    public fun instanceId(instanceId: String)

    /**
     * The Cloudmap service this resource is registered to.
     *
     * @param service The Cloudmap service this resource is registered to. 
     */
    public fun service(service: IService)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.CnameInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.CnameInstance.Builder.create(scope, id)

    /**
     * Custom attributes of the instance.
     *
     * Default: none
     *
     * @param customAttributes Custom attributes of the instance. 
     */
    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * If the service configuration includes a CNAME record, the domain name that you want Route 53
     * to return in response to DNS queries, for example, example.com. This value is required if the
     * service specified by ServiceId includes settings for an CNAME record.
     *
     * @param instanceCname If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example, example.com. This
     * value is required if the service specified by ServiceId includes settings for an CNAME record. 
     */
    override fun instanceCname(instanceCname: String) {
      cdkBuilder.instanceCname(instanceCname)
    }

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     *
     * @param instanceId The id of the instance resource. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * The Cloudmap service this resource is registered to.
     *
     * @param service The Cloudmap service this resource is registered to. 
     */
    override fun service(service: IService) {
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CnameInstance =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CnameInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CnameInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstance):
        CnameInstance = CnameInstance(cdkObject)

    internal fun unwrap(wrapped: CnameInstance):
        software.amazon.awscdk.services.servicediscovery.CnameInstance = wrapped.cdkObject
  }
}
