package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AliasTargetInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicediscovery.AliasTargetInstance,
) : InstanceBase(cdkObject) {
  /**
   * The Route53 DNS name of the alias target.
   */
  public open fun dnsName(): String = unwrap(this).getDnsName()

  /**
   * The Id of the instance.
   */
  public override fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The Cloudmap service to which the instance is registered.
   */
  public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.AliasTargetInstance].
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
     * DNS name of the target.
     *
     * @param dnsName DNS name of the target. 
     */
    public fun dnsName(dnsName: String)

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
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstance.Builder.create(scope,
        id)

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
     * DNS name of the target.
     *
     * @param dnsName DNS name of the target. 
     */
    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
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

    public fun build(): software.amazon.awscdk.services.servicediscovery.AliasTargetInstance =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AliasTargetInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AliasTargetInstance(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.AliasTargetInstance):
        AliasTargetInstance = AliasTargetInstance(cdkObject)

    internal fun unwrap(wrapped: AliasTargetInstance):
        software.amazon.awscdk.services.servicediscovery.AliasTargetInstance = wrapped.cdkObject
  }
}
