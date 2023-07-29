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
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.HttpNamespace
import software.constructs.Construct

/**
 * Define an HTTP Namespace.
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
public class HttpNamespaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HttpNamespace.Builder = HttpNamespace.Builder.create(scope, id)

    /**
     * A description of the Namespace.
     *
     * Default: none
     *
     * @param description A description of the Namespace.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A name for the Namespace.
     *
     * @param name A name for the Namespace.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): HttpNamespace = cdkBuilder.build()
}
