@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Instance accessible using values other than an IP address or a domain name (CNAME).
 *
 * Specify the other values in Custom attributes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * Service service;
 * NonIpInstance nonIpInstance = NonIpInstance.Builder.create(this, "MyNonIpInstance")
 * .service(service)
 * // the properties below are optional
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .build();
 * ```
 */
public open class NonIpInstance(
  cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstance,
) : InstanceBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NonIpInstanceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.NonIpInstance(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(NonIpInstanceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NonIpInstanceProps.Builder.() -> Unit,
  ) : this(scope, id, NonIpInstanceProps(props)
  )

  /**
   * The Id of the instance.
   */
  public override fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The Cloudmap service to which the instance is registered.
   */
  public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.NonIpInstance].
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
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.NonIpInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.NonIpInstance.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.servicediscovery.NonIpInstance =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NonIpInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NonIpInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstance):
        NonIpInstance = NonIpInstance(cdkObject)

    internal fun unwrap(wrapped: NonIpInstance):
        software.amazon.awscdk.services.servicediscovery.NonIpInstance = wrapped.cdkObject as
        software.amazon.awscdk.services.servicediscovery.NonIpInstance
  }
}
