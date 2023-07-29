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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder

/**
 * Describes VPC configuration information for fleets and image builders.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-vpcconfig.html)
 */
@CdkDslMarker
public class CfnAppBlockBuilderVpcConfigPropertyDsl {
    private val cdkBuilder: CfnAppBlockBuilder.VpcConfigProperty.Builder =
        CfnAppBlockBuilder.VpcConfigProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param securityGroupIds The identifiers of the security groups for the fleet or image
     *   builder.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds The identifiers of the security groups for the fleet or image
     *   builder.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetIds The identifiers of the subnets to which a network interface is attached from
     *   the fleet instance or image builder instance. Fleet instances use one or more subnets.
     *   Image builder instances use one subnet.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds The identifiers of the subnets to which a network interface is attached from
     *   the fleet instance or image builder instance. Fleet instances use one or more subnets.
     *   Image builder instances use one subnet.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun build(): CfnAppBlockBuilder.VpcConfigProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
