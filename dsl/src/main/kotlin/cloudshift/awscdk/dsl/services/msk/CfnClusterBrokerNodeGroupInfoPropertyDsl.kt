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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Describes the setup to be used for the broker nodes in the cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * BrokerNodeGroupInfoProperty brokerNodeGroupInfoProperty = BrokerNodeGroupInfoProperty.builder()
 * .clientSubnets(List.of("clientSubnets"))
 * .instanceType("instanceType")
 * // the properties below are optional
 * .brokerAzDistribution("brokerAzDistribution")
 * .connectivityInfo(ConnectivityInfoProperty.builder()
 * .publicAccess(PublicAccessProperty.builder()
 * .type("type")
 * .build())
 * .vpcConnectivity(VpcConnectivityProperty.builder()
 * .clientAuthentication(VpcConnectivityClientAuthenticationProperty.builder()
 * .sasl(VpcConnectivitySaslProperty.builder()
 * .iam(VpcConnectivityIamProperty.builder()
 * .enabled(false)
 * .build())
 * .scram(VpcConnectivityScramProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .tls(VpcConnectivityTlsProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .build())
 * .build())
 * .securityGroups(List.of("securityGroups"))
 * .storageInfo(StorageInfoProperty.builder()
 * .ebsStorageInfo(EBSStorageInfoProperty.builder()
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .enabled(false)
 * .volumeThroughput(123)
 * .build())
 * .volumeSize(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html)
 */
@CdkDslMarker
public class CfnClusterBrokerNodeGroupInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.BrokerNodeGroupInfoProperty.Builder =
        CfnCluster.BrokerNodeGroupInfoProperty.builder()

    private val _clientSubnets: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    /** @param brokerAzDistribution This parameter is currently not in use. */
    public fun brokerAzDistribution(brokerAzDistribution: String) {
        cdkBuilder.brokerAzDistribution(brokerAzDistribution)
    }

    /**
     * @param clientSubnets The list of subnets to connect to in the client virtual private cloud
     *   (VPC). Amazon creates elastic network interfaces inside these subnets. Client applications
     *   use elastic network interfaces to produce and consume data.
     *
     * If you use the US West (N. California) Region, specify exactly two subnets. For other Regions
     * where Amazon MSK is available, you can specify either two or three subnets. The subnets that
     * you specify must be in distinct Availability Zones. When you create a cluster, Amazon MSK
     * distributes the broker nodes evenly across the subnets that you specify.
     *
     * Client subnets can't occupy the Availability Zone with ID `use1-az3` .
     */
    public fun clientSubnets(vararg clientSubnets: String) {
        _clientSubnets.addAll(listOf(*clientSubnets))
    }

    /**
     * @param clientSubnets The list of subnets to connect to in the client virtual private cloud
     *   (VPC). Amazon creates elastic network interfaces inside these subnets. Client applications
     *   use elastic network interfaces to produce and consume data.
     *
     * If you use the US West (N. California) Region, specify exactly two subnets. For other Regions
     * where Amazon MSK is available, you can specify either two or three subnets. The subnets that
     * you specify must be in distinct Availability Zones. When you create a cluster, Amazon MSK
     * distributes the broker nodes evenly across the subnets that you specify.
     *
     * Client subnets can't occupy the Availability Zone with ID `use1-az3` .
     */
    public fun clientSubnets(clientSubnets: Collection<String>) {
        _clientSubnets.addAll(clientSubnets)
    }

    /** @param connectivityInfo Information about the cluster's connectivity setting. */
    public fun connectivityInfo(connectivityInfo: IResolvable) {
        cdkBuilder.connectivityInfo(connectivityInfo)
    }

    /** @param connectivityInfo Information about the cluster's connectivity setting. */
    public fun connectivityInfo(connectivityInfo: CfnCluster.ConnectivityInfoProperty) {
        cdkBuilder.connectivityInfo(connectivityInfo)
    }

    /**
     * @param instanceType The type of Amazon EC2 instances to use for brokers. The following
     *   instance types are allowed: kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge,
     *   kafka.m5.4xlarge, kafka.m5.8xlarge, kafka.m5.12xlarge, kafka.m5.16xlarge, and
     *   kafka.m5.24xlarge, and kafka.t3.small.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param securityGroups The security groups to associate with the elastic network interfaces in
     *   order to specify who can connect to and communicate with the Amazon MSK cluster. If you
     *   don't specify a security group, Amazon MSK uses the default security group associated with
     *   the VPC. If you specify security groups that were shared with you, you must ensure that you
     *   have permissions to them. Specifically, you need the `ec2:DescribeSecurityGroups`
     *   permission.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The security groups to associate with the elastic network interfaces in
     *   order to specify who can connect to and communicate with the Amazon MSK cluster. If you
     *   don't specify a security group, Amazon MSK uses the default security group associated with
     *   the VPC. If you specify security groups that were shared with you, you must ensure that you
     *   have permissions to them. Specifically, you need the `ec2:DescribeSecurityGroups`
     *   permission.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param storageInfo Contains information about storage volumes attached to Amazon MSK broker
     *   nodes.
     */
    public fun storageInfo(storageInfo: IResolvable) {
        cdkBuilder.storageInfo(storageInfo)
    }

    /**
     * @param storageInfo Contains information about storage volumes attached to Amazon MSK broker
     *   nodes.
     */
    public fun storageInfo(storageInfo: CfnCluster.StorageInfoProperty) {
        cdkBuilder.storageInfo(storageInfo)
    }

    public fun build(): CfnCluster.BrokerNodeGroupInfoProperty {
        if (_clientSubnets.isNotEmpty()) cdkBuilder.clientSubnets(_clientSubnets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
