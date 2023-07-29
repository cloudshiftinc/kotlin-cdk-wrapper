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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ConfigureNatOptions
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.Vpc

/**
 * Options passed by the VPC when NAT needs to be configured.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PrivateSubnet privateSubnet;
 * PublicSubnet publicSubnet;
 * Vpc vpc;
 * ConfigureNatOptions configureNatOptions = ConfigureNatOptions.builder()
 * .natSubnets(List.of(publicSubnet))
 * .privateSubnets(List.of(privateSubnet))
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class ConfigureNatOptionsDsl {
    private val cdkBuilder: ConfigureNatOptions.Builder = ConfigureNatOptions.builder()

    private val _natSubnets: MutableList<PublicSubnet> = mutableListOf()

    private val _privateSubnets: MutableList<PrivateSubnet> = mutableListOf()

    /** @param natSubnets The public subnets where the NAT providers need to be placed. */
    public fun natSubnets(vararg natSubnets: PublicSubnet) {
        _natSubnets.addAll(listOf(*natSubnets))
    }

    /** @param natSubnets The public subnets where the NAT providers need to be placed. */
    public fun natSubnets(natSubnets: Collection<PublicSubnet>) {
        _natSubnets.addAll(natSubnets)
    }

    /**
     * @param privateSubnets The private subnets that need to route through the NAT providers. There
     *   may be more private subnets than public subnets with NAT providers.
     */
    public fun privateSubnets(vararg privateSubnets: PrivateSubnet) {
        _privateSubnets.addAll(listOf(*privateSubnets))
    }

    /**
     * @param privateSubnets The private subnets that need to route through the NAT providers. There
     *   may be more private subnets than public subnets with NAT providers.
     */
    public fun privateSubnets(privateSubnets: Collection<PrivateSubnet>) {
        _privateSubnets.addAll(privateSubnets)
    }

    /** @param vpc The VPC we're configuring NAT for. */
    public fun vpc(vpc: Vpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ConfigureNatOptions {
        if (_natSubnets.isNotEmpty()) cdkBuilder.natSubnets(_natSubnets)
        if (_privateSubnets.isNotEmpty()) cdkBuilder.privateSubnets(_privateSubnets)
        return cdkBuilder.build()
    }
}
