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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * Information about the VPC in which the connector resides.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * VpcProperty vpcProperty = VpcProperty.builder()
 * .securityGroups(List.of("securityGroups"))
 * .subnets(List.of("subnets"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-vpc.html)
 */
@CdkDslMarker
public class CfnConnectorVpcPropertyDsl {
    private val cdkBuilder: CfnConnector.VpcProperty.Builder = CfnConnector.VpcProperty.builder()

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    /** @param securityGroups The security groups for the connector. */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups for the connector. */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param subnets The subnets for the connector. */
    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    /** @param subnets The subnets for the connector. */
    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    public fun build(): CfnConnector.VpcProperty {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
