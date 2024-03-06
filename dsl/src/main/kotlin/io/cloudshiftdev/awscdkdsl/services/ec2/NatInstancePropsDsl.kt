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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.ec2.CpuCredits
import software.amazon.awscdk.services.ec2.IKeyPair
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.NatInstanceProps
import software.amazon.awscdk.services.ec2.NatTrafficDirection

/**
 * Properties for a NAT instance.
 *
 * Example:
 * ```
 * // Configure the `natGatewayProvider` when defining a Vpc
 * NatInstanceProvider natGatewayProvider = NatProvider.instance(NatInstanceProps.builder()
 * .instanceType(new InstanceType("t3.small"))
 * .build());
 * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
 * .natGatewayProvider(natGatewayProvider)
 * // The 'natGateways' parameter now controls the number of NAT instances
 * .natGateways(2)
 * .build();
 * ```
 */
@CdkDslMarker
public class NatInstancePropsDsl {
    private val cdkBuilder: NatInstanceProps.Builder = NatInstanceProps.builder()

    /**
     * @param creditSpecification Specifying the CPU credit type for burstable EC2 instance types
     *   (T2, T3, T3a, etc). The unlimited CPU credit option is not supported for T3 instances with
     *   dedicated host (`host`) tenancy.
     */
    public fun creditSpecification(creditSpecification: CpuCredits) {
        cdkBuilder.creditSpecification(creditSpecification)
    }

    /**
     * @param defaultAllowedTraffic Direction to allow all traffic through the NAT instance by
     *   default. By default, inbound and outbound traffic is allowed.
     *
     * If you set this to another value than INBOUND_AND_OUTBOUND, you must configure the NAT
     * instance's security groups in another way, either by passing in a fully configured Security
     * Group using the `securityGroup` property, or by configuring it using the `.securityGroup` or
     * `.connections` members after passing the NAT Instance Provider to a Vpc.
     */
    public fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection) {
        cdkBuilder.defaultAllowedTraffic(defaultAllowedTraffic)
    }

    /** @param instanceType Instance type of the NAT instance. */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param keyName Name of SSH keypair to grant access to instance.
     * @deprecated - Use `keyPair` instead -
     *   https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /** @param keyPair The SSH keypair to grant access to the instance. */
    public fun keyPair(keyPair: IKeyPair) {
        cdkBuilder.keyPair(keyPair)
    }

    /**
     * @param machineImage The machine image (AMI) to use. By default, will do an AMI lookup for the
     *   latest NAT instance image.
     *
     * If you have a specific AMI ID you want to use, pass a `GenericLinuxImage`. For example:
     * ```
     * NatProvider.instance(NatInstanceProps.builder()
     * .instanceType(new InstanceType("t3.micro"))
     * .machineImage(new GenericLinuxImage(Map.of(
     * "us-east-2", "ami-0f9c61b5a562a16af")))
     * .build());
     * ```
     */
    public fun machineImage(machineImage: IMachineImage) {
        cdkBuilder.machineImage(machineImage)
    }

    /** @param securityGroup Security Group for NAT instances. */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun build(): NatInstanceProps = cdkBuilder.build()
}
