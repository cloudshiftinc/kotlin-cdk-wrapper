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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * This structure specifies the VPC subnets and security groups for the stream, and whether a public
 * IP address is to be used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * SelfManagedKafkaAccessConfigurationVpcProperty selfManagedKafkaAccessConfigurationVpcProperty =
 * SelfManagedKafkaAccessConfigurationVpcProperty.builder()
 * .securityGroup(List.of("securityGroup"))
 * .subnets(List.of("subnets"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-selfmanagedkafkaaccessconfigurationvpc.html)
 */
@CdkDslMarker
public class CfnPipeSelfManagedKafkaAccessConfigurationVpcPropertyDsl {
    private val cdkBuilder: CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.Builder =
        CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.builder()

    private val _securityGroup: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    /**
     * @param securityGroup Specifies the security groups associated with the stream. These security
     *   groups must all be in the same VPC. You can specify as many as five security groups. If you
     *   do not specify a security group, the default security group for the VPC is used.
     */
    public fun securityGroup(vararg securityGroup: String) {
        _securityGroup.addAll(listOf(*securityGroup))
    }

    /**
     * @param securityGroup Specifies the security groups associated with the stream. These security
     *   groups must all be in the same VPC. You can specify as many as five security groups. If you
     *   do not specify a security group, the default security group for the VPC is used.
     */
    public fun securityGroup(securityGroup: Collection<String>) {
        _securityGroup.addAll(securityGroup)
    }

    /**
     * @param subnets Specifies the subnets associated with the stream. These subnets must all be in
     *   the same VPC. You can specify as many as 16 subnets.
     */
    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    /**
     * @param subnets Specifies the subnets associated with the stream. These subnets must all be in
     *   the same VPC. You can specify as many as 16 subnets.
     */
    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    public fun build(): CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty {
        if (_securityGroup.isNotEmpty()) cdkBuilder.securityGroup(_securityGroup)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
