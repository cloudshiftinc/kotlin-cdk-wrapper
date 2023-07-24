@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Multi user hosted rotation options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Secret secret;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * MultiUserHostedRotationOptions multiUserHostedRotationOptions =
 * MultiUserHostedRotationOptions.builder()
 * .masterSecret(secret)
 * // the properties below are optional
 * .excludeCharacters("excludeCharacters")
 * .functionName("functionName")
 * .securityGroups(List.of(securityGroup))
 * .vpc(vpc)
 * .vpcSubnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class MultiUserHostedRotationOptionsDsl {
    private val cdkBuilder: MultiUserHostedRotationOptions.Builder =
        MultiUserHostedRotationOptions.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param excludeCharacters A string of the characters that you don't want in the password.
     */
    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param functionName A name for the Lambda created to rotate the secret.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * @param masterSecret The master secret for a multi user rotation scheme.
     */
    public fun masterSecret(masterSecret: ISecret) {
        cdkBuilder.masterSecret(masterSecret)
    }

    /**
     * @param securityGroups A list of security groups for the Lambda created to rotate the secret.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups A list of security groups for the Lambda created to rotate the secret.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param vpc The VPC where the Lambda rotation function will run.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): MultiUserHostedRotationOptions {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
