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
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.InstanceProps
import software.amazon.awscdk.services.rds.PerformanceInsightRetention

/**
 * Instance properties for database instances.
 *
 * Example:
 * ```
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(stack, "Database")
 * .engine(DatabaseClusterEngine.AURORA)
 * .instanceProps(InstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
 * .vpc(vpc)
 * .build())
 * .build();
 * cluster.addRotationSingleUser();
 * DatabaseCluster clusterWithCustomRotationOptions = DatabaseCluster.Builder.create(stack,
 * "CustomRotationOptions")
 * .engine(DatabaseClusterEngine.AURORA)
 * .instanceProps(InstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
 * .vpc(vpc)
 * .build())
 * .build();
 * clusterWithCustomRotationOptions.addRotationSingleUser(RotationSingleUserOptions.builder()
 * .automaticallyAfter(Duration.days(7))
 * .excludeCharacters("!&#64;#$%^&amp;*")
 * .securityGroup(securityGroup)
 * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_WITH_EGRESS).build())
 * .endpoint(endpoint)
 * .build());
 * ```
 */
@CdkDslMarker
public class InstancePropsDsl {
    private val cdkBuilder: InstanceProps.Builder = InstanceProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB
     *   instance.
     */
    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for the
     *   DB instance.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param deleteAutomatedBackups Whether to remove automated backups immediately after the DB
     *   instance is deleted for the DB instance.
     */
    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
        cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    /**
     * @param enablePerformanceInsights Whether to enable Performance Insights for the DB instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /** @param instanceType What type of instance to start for the replicas. */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /** @param parameterGroup The DB parameter group to associate with the instance. */
    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    /**
     * @param parameters The parameters in the DBParameterGroup to create automatically. You can
     *   only specify parameterGroup or parameters but not both. You need to use a versioned engine
     *   to auto-generate a DBParameterGroup.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance Insights
     *   data.
     */
    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
        cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey)
    }

    /**
     * @param performanceInsightRetention The amount of time, in days, to retain Performance
     *   Insights data.
     */
    public fun performanceInsightRetention(
        performanceInsightRetention: PerformanceInsightRetention
    ) {
        cdkBuilder.performanceInsightRetention(performanceInsightRetention)
    }

    /**
     * @param publiclyAccessible Indicates whether the DB instance is an internet-facing instance.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /** @param securityGroups Security group. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups Security group. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param vpc What subnets to run the RDS instances in. Must be at least 2 subnets in two
     *   different AZs.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnets Where to place the instances within the VPC. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets Where to place the instances within the VPC. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): InstanceProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
