package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface InstanceProps {
    /**
     * Whether to allow upgrade of major version for the DB instance.
     *
     * Default: - false
     */
    public fun allowMajorVersionUpgrade(): Boolean? = unwrap(this).getAllowMajorVersionUpgrade()

    /**
     * Whether to enable automatic upgrade of minor version for the DB instance.
     *
     * Default: - true
     */
    public fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

    /**
     * Whether to remove automated backups immediately after the DB instance is deleted for the DB
     * instance.
     *
     * Default: - true
     */
    public fun deleteAutomatedBackups(): Boolean? = unwrap(this).getDeleteAutomatedBackups()

    /**
     * Whether to enable Performance Insights for the DB instance.
     *
     * Default: - false, unless ``performanceInsightRetention`` or
     * ``performanceInsightEncryptionKey`` is set.
     */
    public fun enablePerformanceInsights(): Boolean? = unwrap(this).getEnablePerformanceInsights()

    /**
     * What type of instance to start for the replicas.
     *
     * Default: - t3.medium (or, more precisely, db.t3.medium)
     */
    public fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    /**
     * The DB parameter group to associate with the instance.
     *
     * Default: no parameter group
     */
    public fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    /**
     * The parameters in the DBParameterGroup to create automatically.
     *
     * You can only specify parameterGroup or parameters but not both. You need to use a versioned
     * engine to auto-generate a DBParameterGroup.
     *
     * Default: - None
     */
    public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * The AWS KMS key for encryption of Performance Insights data.
     *
     * Default: - default master key
     */
    public fun performanceInsightEncryptionKey(): IKey? =
        unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

    /**
     * The amount of time, in days, to retain Performance Insights data.
     *
     * Default: 7
     */
    public fun performanceInsightRetention(): PerformanceInsightRetention? =
        unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

    /**
     * A preferred maintenance window day/time range. Should be specified as a range
     * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
     *
     * Example: 'Sun:23:45-Mon:00:15'
     *
     * Default: - 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region, occurring on a random day of the week.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance)
     */
    public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

    /**
     * Indicates whether the DB instance is an internet-facing instance.
     *
     * Default: - `true` if `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false` otherwise
     */
    public fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()

    /**
     * Security group.
     *
     * Default: a new security group is created.
     */
    public fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * What subnets to run the RDS instances in.
     *
     * Must be at least 2 subnets in two different AZs.
     */
    public fun vpc(): IVpc

    /**
     * Where to place the instances within the VPC.
     *
     * Default: - the Vpc default strategy if not specified.
     */
    public fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

    /** A builder for [InstanceProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB
         *   instance.
         */
        public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

        /**
         * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for
         *   the DB instance.
         */
        public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

        /**
         * @param deleteAutomatedBackups Whether to remove automated backups immediately after the
         *   DB instance is deleted for the DB instance.
         */
        public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean)

        /**
         * @param enablePerformanceInsights Whether to enable Performance Insights for the DB
         *   instance.
         */
        public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

        /** @param instanceType What type of instance to start for the replicas. */
        public fun instanceType(instanceType: InstanceType)

        /** @param parameterGroup The DB parameter group to associate with the instance. */
        public fun parameterGroup(parameterGroup: IParameterGroup)

        /**
         * @param parameters The parameters in the DBParameterGroup to create automatically. You can
         *   only specify parameterGroup or parameters but not both. You need to use a versioned
         *   engine to auto-generate a DBParameterGroup.
         */
        public fun parameters(parameters: Map<String, String>)

        /**
         * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance
         *   Insights data.
         */
        public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey)

        /**
         * @param performanceInsightRetention The amount of time, in days, to retain Performance
         *   Insights data.
         */
        public fun performanceInsightRetention(
            performanceInsightRetention: PerformanceInsightRetention
        )

        /**
         * @param preferredMaintenanceWindow A preferred maintenance window day/time range. Should
         *   be specified as a range ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). Example:
         *   'Sun:23:45-Mon:00:15'
         */
        public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

        /**
         * @param publiclyAccessible Indicates whether the DB instance is an internet-facing
         *   instance.
         */
        public fun publiclyAccessible(publiclyAccessible: Boolean)

        /** @param securityGroups Security group. */
        public fun securityGroups(securityGroups: List<ISecurityGroup>)

        /** @param securityGroups Security group. */
        public fun securityGroups(vararg securityGroups: ISecurityGroup)

        /**
         * @param vpc What subnets to run the RDS instances in. Must be at least 2 subnets in two
         *   different AZs.
         */
        public fun vpc(vpc: IVpc)

        /** @param vpcSubnets Where to place the instances within the VPC. */
        public fun vpcSubnets(vpcSubnets: SubnetSelection)

        /** @param vpcSubnets Where to place the instances within the VPC. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("06f29cc1e421b47afc48b17869ce6a6a175e083e14694e74c2e89c878ef0fa55")
        public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.rds.InstanceProps.Builder =
            software.amazon.awscdk.services.rds.InstanceProps.builder()

        /**
         * @param allowMajorVersionUpgrade Whether to allow upgrade of major version for the DB
         *   instance.
         */
        override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
            cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
        }

        /**
         * @param autoMinorVersionUpgrade Whether to enable automatic upgrade of minor version for
         *   the DB instance.
         */
        override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
            cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
        }

        /**
         * @param deleteAutomatedBackups Whether to remove automated backups immediately after the
         *   DB instance is deleted for the DB instance.
         */
        override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
            cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
        }

        /**
         * @param enablePerformanceInsights Whether to enable Performance Insights for the DB
         *   instance.
         */
        override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
            cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
        }

        /** @param instanceType What type of instance to start for the replicas. */
        override fun instanceType(instanceType: InstanceType) {
            cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
        }

        /** @param parameterGroup The DB parameter group to associate with the instance. */
        override fun parameterGroup(parameterGroup: IParameterGroup) {
            cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
        }

        /**
         * @param parameters The parameters in the DBParameterGroup to create automatically. You can
         *   only specify parameterGroup or parameters but not both. You need to use a versioned
         *   engine to auto-generate a DBParameterGroup.
         */
        override fun parameters(parameters: Map<String, String>) {
            cdkBuilder.parameters(parameters)
        }

        /**
         * @param performanceInsightEncryptionKey The AWS KMS key for encryption of Performance
         *   Insights data.
         */
        override fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
            cdkBuilder.performanceInsightEncryptionKey(
                performanceInsightEncryptionKey.let(IKey::unwrap)
            )
        }

        /**
         * @param performanceInsightRetention The amount of time, in days, to retain Performance
         *   Insights data.
         */
        override fun performanceInsightRetention(
            performanceInsightRetention: PerformanceInsightRetention
        ) {
            cdkBuilder.performanceInsightRetention(
                performanceInsightRetention.let(PerformanceInsightRetention::unwrap)
            )
        }

        /**
         * @param preferredMaintenanceWindow A preferred maintenance window day/time range. Should
         *   be specified as a range ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). Example:
         *   'Sun:23:45-Mon:00:15'
         */
        override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
            cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
        }

        /**
         * @param publiclyAccessible Indicates whether the DB instance is an internet-facing
         *   instance.
         */
        override fun publiclyAccessible(publiclyAccessible: Boolean) {
            cdkBuilder.publiclyAccessible(publiclyAccessible)
        }

        /** @param securityGroups Security group. */
        override fun securityGroups(securityGroups: List<ISecurityGroup>) {
            cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
        }

        /** @param securityGroups Security group. */
        override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
            securityGroups(securityGroups.toList())

        /**
         * @param vpc What subnets to run the RDS instances in. Must be at least 2 subnets in two
         *   different AZs.
         */
        override fun vpc(vpc: IVpc) {
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
        }

        /** @param vpcSubnets Where to place the instances within the VPC. */
        override fun vpcSubnets(vpcSubnets: SubnetSelection) {
            cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
        }

        /** @param vpcSubnets Where to place the instances within the VPC. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("06f29cc1e421b47afc48b17869ce6a6a175e083e14694e74c2e89c878ef0fa55")
        override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
            vpcSubnets(SubnetSelection(vpcSubnets))

        public fun build(): software.amazon.awscdk.services.rds.InstanceProps = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.rds.InstanceProps,
    ) : InstanceProps {
        /**
         * Whether to allow upgrade of major version for the DB instance.
         *
         * Default: - false
         */
        override fun allowMajorVersionUpgrade(): Boolean? =
            unwrap(this).getAllowMajorVersionUpgrade()

        /**
         * Whether to enable automatic upgrade of minor version for the DB instance.
         *
         * Default: - true
         */
        override fun autoMinorVersionUpgrade(): Boolean? = unwrap(this).getAutoMinorVersionUpgrade()

        /**
         * Whether to remove automated backups immediately after the DB instance is deleted for the
         * DB instance.
         *
         * Default: - true
         */
        override fun deleteAutomatedBackups(): Boolean? = unwrap(this).getDeleteAutomatedBackups()

        /**
         * Whether to enable Performance Insights for the DB instance.
         *
         * Default: - false, unless ``performanceInsightRetention`` or
         * ``performanceInsightEncryptionKey`` is set.
         */
        override fun enablePerformanceInsights(): Boolean? =
            unwrap(this).getEnablePerformanceInsights()

        /**
         * What type of instance to start for the replicas.
         *
         * Default: - t3.medium (or, more precisely, db.t3.medium)
         */
        override fun instanceType(): InstanceType? =
            unwrap(this).getInstanceType()?.let(InstanceType::wrap)

        /**
         * The DB parameter group to associate with the instance.
         *
         * Default: no parameter group
         */
        override fun parameterGroup(): IParameterGroup? =
            unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

        /**
         * The parameters in the DBParameterGroup to create automatically.
         *
         * You can only specify parameterGroup or parameters but not both. You need to use a
         * versioned engine to auto-generate a DBParameterGroup.
         *
         * Default: - None
         */
        override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

        /**
         * The AWS KMS key for encryption of Performance Insights data.
         *
         * Default: - default master key
         */
        override fun performanceInsightEncryptionKey(): IKey? =
            unwrap(this).getPerformanceInsightEncryptionKey()?.let(IKey::wrap)

        /**
         * The amount of time, in days, to retain Performance Insights data.
         *
         * Default: 7
         */
        override fun performanceInsightRetention(): PerformanceInsightRetention? =
            unwrap(this).getPerformanceInsightRetention()?.let(PerformanceInsightRetention::wrap)

        /**
         * A preferred maintenance window day/time range. Should be specified as a range
         * ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC).
         *
         * Example: 'Sun:23:45-Mon:00:15'
         *
         * Default: - 30-minute window selected at random from an 8-hour block of time for each AWS
         * Region, occurring on a random day of the week.
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance)
         */
        override fun preferredMaintenanceWindow(): String? =
            unwrap(this).getPreferredMaintenanceWindow()

        /**
         * Indicates whether the DB instance is an internet-facing instance.
         *
         * Default: - `true` if `vpcSubnets` is `subnetType: SubnetType.PUBLIC`, `false` otherwise
         */
        override fun publiclyAccessible(): Boolean? = unwrap(this).getPubliclyAccessible()

        /**
         * Security group.
         *
         * Default: a new security group is created.
         */
        override fun securityGroups(): List<ISecurityGroup> =
            unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

        /**
         * What subnets to run the RDS instances in.
         *
         * Must be at least 2 subnets in two different AZs.
         */
        override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

        /**
         * Where to place the instances within the VPC.
         *
         * Default: - the Vpc default strategy if not specified.
         */
        override fun vpcSubnets(): SubnetSelection? =
            unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): InstanceProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.InstanceProps
        ): InstanceProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: InstanceProps
        ): software.amazon.awscdk.services.rds.InstanceProps = (wrapped as Wrapper).cdkObject
    }
}
