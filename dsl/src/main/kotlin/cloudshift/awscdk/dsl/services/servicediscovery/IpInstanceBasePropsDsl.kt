@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps

/**
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.*;
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
@CdkDslMarker
public class IpInstanceBasePropsDsl {
    private val cdkBuilder: IpInstanceBaseProps.Builder = IpInstanceBaseProps.builder()

    /** @param customAttributes Custom attributes of the instance. */
    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    /** @param instanceId The id of the instance resource. */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param ipv4 If the service that you specify contains a template for an A record, the IPv4
     *   address that you want AWS Cloud Map to use for the value of the A record.
     */
    public fun ipv4(ipv4: String) {
        cdkBuilder.ipv4(ipv4)
    }

    /**
     * @param ipv6 If the service that you specify contains a template for an AAAA record, the IPv6
     *   address that you want AWS Cloud Map to use for the value of the AAAA record.
     */
    public fun ipv6(ipv6: String) {
        cdkBuilder.ipv6(ipv6)
    }

    /**
     * @param port The port on the endpoint that you want AWS Cloud Map to perform health checks on.
     *   This value is also used for the port value in an SRV record if the service that you specify
     *   includes an SRV record. You can also specify a default port that is applied to all
     *   instances in the Service configuration.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): IpInstanceBaseProps = cdkBuilder.build()
}
