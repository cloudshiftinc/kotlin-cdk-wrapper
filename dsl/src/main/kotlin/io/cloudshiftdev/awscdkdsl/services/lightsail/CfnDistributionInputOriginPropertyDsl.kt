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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDistribution

/**
 * `InputOrigin` is a property of the
 * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
 * resource. It describes the origin resource of an Amazon Lightsail content delivery network (CDN)
 * distribution.
 *
 * An origin can be a instance, bucket, or load balancer. A distribution pulls content from an
 * origin, caches it, and serves it to viewers through a worldwide network of edge servers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * InputOriginProperty inputOriginProperty = InputOriginProperty.builder()
 * .name("name")
 * .protocolPolicy("protocolPolicy")
 * .regionName("regionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html)
 */
@CdkDslMarker
public class CfnDistributionInputOriginPropertyDsl {
    private val cdkBuilder: CfnDistribution.InputOriginProperty.Builder =
        CfnDistribution.InputOriginProperty.builder()

    /** @param name The name of the origin resource. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param protocolPolicy The protocol that your Amazon Lightsail distribution uses when
     *   establishing a connection with your origin to pull content.
     */
    public fun protocolPolicy(protocolPolicy: String) {
        cdkBuilder.protocolPolicy(protocolPolicy)
    }

    /** @param regionName The AWS Region name of the origin resource. */
    public fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
    }

    public fun build(): CfnDistribution.InputOriginProperty = cdkBuilder.build()
}
