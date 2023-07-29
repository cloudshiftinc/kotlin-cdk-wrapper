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
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckType

/**
 * Settings for an optional Amazon Route 53 health check.
 *
 * If you specify settings for a health check, AWS Cloud Map associates the health check with all
 * the records that you specify in DnsConfig. Only valid with a PublicDnsNamespace.
 *
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
public class HealthCheckConfigDsl {
    private val cdkBuilder: HealthCheckConfig.Builder = HealthCheckConfig.builder()

    /**
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     *   fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or
     *   vice versa.
     */
    public fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
    }

    /**
     * @param resourcePath The path that you want Route 53 to request when performing health checks.
     *   Do not use when health check type is TCP.
     */
    public fun resourcePath(resourcePath: String) {
        cdkBuilder.resourcePath(resourcePath)
    }

    /**
     * @param type The type of health check that you want to create, which indicates how Route 53
     *   determines whether an endpoint is healthy. Cannot be modified once created. Supported
     *   values are HTTP, HTTPS, and TCP.
     */
    public fun type(type: HealthCheckType) {
        cdkBuilder.type(type)
    }

    public fun build(): HealthCheckConfig = cdkBuilder.build()
}
