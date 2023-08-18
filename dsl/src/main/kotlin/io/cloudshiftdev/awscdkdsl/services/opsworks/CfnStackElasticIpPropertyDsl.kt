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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnStack

/**
 * Describes an Elastic IP address.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * ElasticIpProperty elasticIpProperty = ElasticIpProperty.builder()
 * .ip("ip")
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html)
 */
@CdkDslMarker
public class CfnStackElasticIpPropertyDsl {
    private val cdkBuilder: CfnStack.ElasticIpProperty.Builder =
        CfnStack.ElasticIpProperty.builder()

    /** @param ip The IP address. */
    public fun ip(ip: String) {
        cdkBuilder.ip(ip)
    }

    /** @param name The name, which can be a maximum of 32 characters. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnStack.ElasticIpProperty = cdkBuilder.build()
}
