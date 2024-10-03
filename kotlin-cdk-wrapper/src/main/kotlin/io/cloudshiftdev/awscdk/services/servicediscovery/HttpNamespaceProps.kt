@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = new Stack(app, "aws-servicediscovery-integ");
 * HttpNamespace namespace = HttpNamespace.Builder.create(stack, "MyNamespace")
 * .name("MyHTTPNamespace")
 * .build();
 * Service service1 = namespace.createService("NonIpService", BaseServiceProps.builder()
 * .description("service registering non-ip instances")
 * .build());
 * service1.registerNonIpInstance("NonIpInstance", NonIpInstanceBaseProps.builder()
 * .customAttributes(Map.of("arn", "arn:aws:s3:::mybucket"))
 * .build());
 * Service service2 = namespace.createService("IpService", BaseServiceProps.builder()
 * .description("service registering ip instances")
 * .healthCheck(HealthCheckConfig.builder()
 * .type(HealthCheckType.HTTP)
 * .resourcePath("/check")
 * .build())
 * .build());
 * service2.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
 * .ipv4("54.239.25.192")
 * .build());
 * app.synth();
 * ```
 */
public interface HttpNamespaceProps : BaseNamespaceProps {
  /**
   * A builder for [HttpNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the Namespace.
     */
    public fun description(description: String)

    /**
     * @param name A name for the Namespace. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps.builder()

    /**
     * @param description A description of the Namespace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the Namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps,
  ) : CdkObject(cdkObject),
      HttpNamespaceProps {
    /**
     * A description of the Namespace.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the Namespace.
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps):
        HttpNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as? HttpNamespaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps
  }
}
