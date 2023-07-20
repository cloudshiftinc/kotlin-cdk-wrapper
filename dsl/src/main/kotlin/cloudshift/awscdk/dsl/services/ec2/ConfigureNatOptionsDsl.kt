@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.ConfigureNatOptions
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.Vpc
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ConfigureNatOptionsDsl {
    private val cdkBuilder: ConfigureNatOptions.Builder = ConfigureNatOptions.builder()

    private val _natSubnets: MutableList<PublicSubnet> = mutableListOf()

    private val _privateSubnets: MutableList<PrivateSubnet> = mutableListOf()

    public fun natSubnets(vararg natSubnets: PublicSubnet) {
        _natSubnets.addAll(listOf(*natSubnets))
    }

    public fun natSubnets(natSubnets: Collection<PublicSubnet>) {
        _natSubnets.addAll(natSubnets)
    }

    public fun privateSubnets(vararg privateSubnets: PrivateSubnet) {
        _privateSubnets.addAll(listOf(*privateSubnets))
    }

    public fun privateSubnets(privateSubnets: Collection<PrivateSubnet>) {
        _privateSubnets.addAll(privateSubnets)
    }

    public fun vpc(vpc: Vpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ConfigureNatOptions {
        if (_natSubnets.isNotEmpty()) cdkBuilder.natSubnets(_natSubnets)
        if (_privateSubnets.isNotEmpty()) cdkBuilder.privateSubnets(_privateSubnets)
        return cdkBuilder.build()
    }
}
