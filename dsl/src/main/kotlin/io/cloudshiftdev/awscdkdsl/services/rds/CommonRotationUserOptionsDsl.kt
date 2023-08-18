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
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.rds.CommonRotationUserOptions

/**
 * Properties common to single-user and multi-user rotation options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.rds.*;
 * InterfaceVpcEndpoint interfaceVpcEndpoint;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * CommonRotationUserOptions commonRotationUserOptions = CommonRotationUserOptions.builder()
 * .automaticallyAfter(Duration.minutes(30))
 * .endpoint(interfaceVpcEndpoint)
 * .excludeCharacters("excludeCharacters")
 * .rotateImmediatelyOnUpdate(false)
 * .securityGroup(securityGroup)
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
public class CommonRotationUserOptionsDsl {
    private val cdkBuilder: CommonRotationUserOptions.Builder = CommonRotationUserOptions.builder()

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     *   Secrets Manager triggers the next automatic rotation.
     */
    public fun automaticallyAfter(automaticallyAfter: Duration) {
        cdkBuilder.automaticallyAfter(automaticallyAfter)
    }

    /**
     * @param endpoint The VPC interface endpoint to use for the Secrets Manager API. If you enable
     *   private DNS hostnames for your VPC private endpoint (the default), you don't need to
     *   specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager CLI and
     *   SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically resolves
     *   to your VPC endpoint.
     */
    public fun endpoint(endpoint: IInterfaceVpcEndpoint) {
        cdkBuilder.endpoint(endpoint)
    }

    /** @param excludeCharacters Specifies characters to not include in generated passwords. */
    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     *   until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /** @param securityGroup The security group for the Lambda rotation function. */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /** @param vpcSubnets Where to place the rotation Lambda function. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets Where to place the rotation Lambda function. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): CommonRotationUserOptions = cdkBuilder.build()
}
