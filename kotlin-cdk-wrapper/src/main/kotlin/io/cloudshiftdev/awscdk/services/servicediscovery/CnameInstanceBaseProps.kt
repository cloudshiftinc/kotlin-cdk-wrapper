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
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = new Stack(app, "aws-servicediscovery-integ");
 * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
 * .name("foobar.com")
 * .build();
 * Service service = namespace.createService("Service", DnsServiceProps.builder()
 * .name("foo")
 * .dnsRecordType(DnsRecordType.CNAME)
 * .dnsTtl(Duration.seconds(30))
 * .build());
 * service.registerCnameInstance("CnameInstance", CnameInstanceBaseProps.builder()
 * .instanceCname("service.pizza")
 * .build());
 * app.synth();
 * ```
 */
public interface CnameInstanceBaseProps : BaseInstanceProps {
  /**
   * If the service configuration includes a CNAME record, the domain name that you want Route 53 to
   * return in response to DNS queries, for example, example.com. This value is required if the service
   * specified by ServiceId includes settings for an CNAME record.
   */
  public fun instanceCname(): String

  /**
   * A builder for [CnameInstanceBaseProps]
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps.Builder =
        software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps.builder()

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

    public fun build(): software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps,
  ) : CdkObject(cdkObject),
      CnameInstanceBaseProps {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CnameInstanceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps):
        CnameInstanceBaseProps = CdkObjectWrappers.wrap(cdkObject) as? CnameInstanceBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CnameInstanceBaseProps):
        software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps
  }
}
