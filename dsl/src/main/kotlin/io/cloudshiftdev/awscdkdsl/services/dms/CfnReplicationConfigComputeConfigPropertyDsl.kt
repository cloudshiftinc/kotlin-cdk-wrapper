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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnReplicationConfig

/**
 * Configuration parameters for provisioning an AWS DMS Serverless replication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * ComputeConfigProperty computeConfigProperty = ComputeConfigProperty.builder()
 * .maxCapacityUnits(123)
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .dnsNameServers("dnsNameServers")
 * .kmsKeyId("kmsKeyId")
 * .minCapacityUnits(123)
 * .multiAz(false)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .replicationSubnetGroupId("replicationSubnetGroupId")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-replicationconfig-computeconfig.html)
 */
@CdkDslMarker
public class CfnReplicationConfigComputeConfigPropertyDsl {
    private val cdkBuilder: CfnReplicationConfig.ComputeConfigProperty.Builder =
        CfnReplicationConfig.ComputeConfigProperty.builder()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    /**
     * @param availabilityZone The Availability Zone where the AWS DMS Serverless replication using
     *   this configuration will run. The default value is a random, system-chosen Availability Zone
     *   in the configuration's AWS Region , for example, `"us-west-2"` . You can't set this
     *   parameter if the `MultiAZ` parameter is set to `true` .
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param dnsNameServers A list of custom DNS name servers supported for the AWS DMS Serverless
     *   replication to access your source or target database. This list overrides the default name
     *   servers supported by the AWS DMS Serverless replication. You can specify a comma-separated
     *   list of internet addresses for up to four DNS name servers. For example:
     *   `"1.1.1.1,2.2.2.2,3.3.3.3,4.4.4.4"`
     */
    public fun dnsNameServers(dnsNameServers: String) {
        cdkBuilder.dnsNameServers(dnsNameServers)
    }

    /**
     * @param kmsKeyId An AWS Key Management Service ( AWS KMS ) key Amazon Resource Name (ARN) that
     *   is used to encrypt the data during AWS DMS Serverless replication. If you don't specify a
     *   value for the `KmsKeyId` parameter, AWS DMS uses your default encryption key.
     *
     * AWS KMS creates the default encryption key for your Amazon Web Services account. Your AWS
     * account has a different default encryption key for each AWS Region .
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param maxCapacityUnits Specifies the maximum value of the AWS DMS capacity units (DCUs) for
     *   which a given AWS DMS Serverless replication can be provisioned. A single DCU is 2GB of
     *   RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values includes 1, 2,
     *   4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the maximum value that you can specify for
     *   AWS DMS Serverless is 384. The `MaxCapacityUnits` parameter is the only DCU parameter you
     *   are required to specify.
     */
    public fun maxCapacityUnits(maxCapacityUnits: Number) {
        cdkBuilder.maxCapacityUnits(maxCapacityUnits)
    }

    /**
     * @param minCapacityUnits Specifies the minimum value of the AWS DMS capacity units (DCUs) for
     *   which a given AWS DMS Serverless replication can be provisioned. A single DCU is 2GB of
     *   RAM, with 1 DCU as the minimum value allowed. The list of valid DCU values includes 1, 2,
     *   4, 8, 16, 32, 64, 128, 192, 256, and 384. So, the minimum DCU value that you can specify
     *   for AWS DMS Serverless is 1. If you don't set this value, AWS DMS sets this parameter to
     *   the minimum DCU value allowed, 1. If there is no current source activity, AWS DMS scales
     *   down your replication until it reaches the value specified in `MinCapacityUnits` .
     */
    public fun minCapacityUnits(minCapacityUnits: Number) {
        cdkBuilder.minCapacityUnits(minCapacityUnits)
    }

    /**
     * @param multiAz Specifies whether the AWS DMS Serverless replication is a Multi-AZ deployment.
     *   You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to `true`
     *   .
     */
    public fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
    }

    /**
     * @param multiAz Specifies whether the AWS DMS Serverless replication is a Multi-AZ deployment.
     *   You can't set the `AvailabilityZone` parameter if the `MultiAZ` parameter is set to `true`
     *   .
     */
    public fun multiAz(multiAz: IResolvable) {
        cdkBuilder.multiAz(multiAz)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     *   occur for the AWS DMS Serverless replication, in Universal Coordinated Time (UTC). The
     *   format is `ddd:hh24:mi-ddd:hh24:mi` .
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time per AWS
     * Region . This maintenance occurs on a random day of the week. Valid values for days of the
     * week include `Mon` , `Tue` , `Wed` , `Thu` , `Fri` , `Sat` , and `Sun` .
     *
     * Constraints include a minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param replicationSubnetGroupId Specifies a subnet group identifier to associate with the AWS
     *   DMS Serverless replication.
     */
    public fun replicationSubnetGroupId(replicationSubnetGroupId: String) {
        cdkBuilder.replicationSubnetGroupId(replicationSubnetGroupId)
    }

    /**
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to use
     *   with the AWS DMS Serverless replication. The VPC security group must work with the VPC
     *   containing the replication.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    /**
     * @param vpcSecurityGroupIds Specifies the virtual private cloud (VPC) security group to use
     *   with the AWS DMS Serverless replication. The VPC security group must work with the VPC
     *   containing the replication.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    public fun build(): CfnReplicationConfig.ComputeConfigProperty {
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        return cdkBuilder.build()
    }
}
