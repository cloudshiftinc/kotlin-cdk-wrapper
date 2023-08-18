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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.rds.OptionConfiguration

/**
 * Configuration properties for an option.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.rds.*;
 * SecurityGroup securityGroup;
 * Vpc vpc;
 * OptionConfiguration optionConfiguration = OptionConfiguration.builder()
 * .name("name")
 * // the properties below are optional
 * .port(123)
 * .securityGroups(List.of(securityGroup))
 * .settings(Map.of(
 * "settingsKey", "settings"))
 * .version("version")
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class OptionConfigurationDsl {
    private val cdkBuilder: OptionConfiguration.Builder = OptionConfiguration.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /** @param name The name of the option. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param port The port number that this option uses. If `port` is specified then `vpc` must
     *   also be specified.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param securityGroups Optional list of security groups to use for this option, if `vpc` is
     *   specified. If no groups are provided, a default one will be created.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups Optional list of security groups to use for this option, if `vpc` is
     *   specified. If no groups are provided, a default one will be created.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param settings The settings for the option. */
    public fun settings(settings: Map<String, String>) {
        cdkBuilder.settings(settings)
    }

    /** @param version The version for the option. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    /**
     * @param vpc The VPC where a security group should be created for this option. If `vpc` is
     *   specified then `port` must also be specified.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): OptionConfiguration {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
