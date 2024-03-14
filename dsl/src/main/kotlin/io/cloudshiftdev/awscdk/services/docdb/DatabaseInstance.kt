package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DatabaseInstance
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstance,
) : Resource(cdkObject), IDatabaseInstance {
    /** The instance's database cluster. */
    public open fun cluster(): IDatabaseCluster =
        unwrap(this).getCluster().let(IDatabaseCluster::wrap)

    /** The instance endpoint address. */
    public override fun dbInstanceEndpointAddress(): String =
        unwrap(this).getDbInstanceEndpointAddress()

    /** The instance endpoint port. */
    public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

    /** The instance arn. */
    public override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /** The instance endpoint. */
    public override fun instanceEndpoint(): Endpoint =
        unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

    /** The instance identifier. */
    public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.docdb.DatabaseInstance]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Indicates that minor engine upgrades are applied automatically to the DB instance during
         * the maintenance window.
         *
         * Default: true
         *
         * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied
         *   automatically to the DB instance during the maintenance window.
         */
        public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

        /**
         * The name of the Availability Zone where the DB instance will be located.
         *
         * Default: - no preference
         *
         * @param availabilityZone The name of the Availability Zone where the DB instance will be
         *   located.
         */
        public fun availabilityZone(availabilityZone: String)

        /**
         * The DocumentDB database cluster the instance should launch into.
         *
         * @param cluster The DocumentDB database cluster the instance should launch into.
         */
        public fun cluster(cluster: IDatabaseCluster)

        /**
         * A name for the DB instance.
         *
         * If you specify a name, AWS CloudFormation converts it to lowercase.
         *
         * Default: - a CloudFormation generated name
         *
         * @param dbInstanceName A name for the DB instance.
         */
        public fun dbInstanceName(dbInstanceName: String)

        /**
         * A value that indicates whether to enable Performance Insights for the DB Instance.
         *
         * Default: - false
         *
         * @param enablePerformanceInsights A value that indicates whether to enable Performance
         *   Insights for the DB Instance.
         */
        public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

        /**
         * The name of the compute and memory capacity classes.
         *
         * @param instanceType The name of the compute and memory capacity classes.
         */
        public fun instanceType(instanceType: InstanceType)

        /**
         * The weekly time range (in UTC) during which system maintenance can occur.
         *
         * Format: `ddd:hh24:mi-ddd:hh24:mi` Constraint: Minimum 30-minute window
         *
         * Default: - a 30-minute window selected at random from an 8-hour block of time for each
         * AWS Region, occurring on a random day of the week. To see the time blocks available, see
         * https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-maintain.html#maintenance-window
         *
         * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
         *   maintenance can occur.
         */
        public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

        /**
         * The CloudFormation policy to apply when the instance is removed from the stack or
         * replaced during an update.
         *
         * Default: RemovalPolicy.Retain
         *
         * @param removalPolicy The CloudFormation policy to apply when the instance is removed from
         *   the stack or replaced during an update.
         */
        public fun removalPolicy(removalPolicy: RemovalPolicy)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseInstance.Builder =
            software.amazon.awscdk.services.docdb.DatabaseInstance.Builder.create(scope, id)

        /**
         * Indicates that minor engine upgrades are applied automatically to the DB instance during
         * the maintenance window.
         *
         * Default: true
         *
         * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied
         *   automatically to the DB instance during the maintenance window.
         */
        override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
            cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
        }

        /**
         * The name of the Availability Zone where the DB instance will be located.
         *
         * Default: - no preference
         *
         * @param availabilityZone The name of the Availability Zone where the DB instance will be
         *   located.
         */
        override fun availabilityZone(availabilityZone: String) {
            cdkBuilder.availabilityZone(availabilityZone)
        }

        /**
         * The DocumentDB database cluster the instance should launch into.
         *
         * @param cluster The DocumentDB database cluster the instance should launch into.
         */
        override fun cluster(cluster: IDatabaseCluster) {
            cdkBuilder.cluster(cluster.let(IDatabaseCluster::unwrap))
        }

        /**
         * A name for the DB instance.
         *
         * If you specify a name, AWS CloudFormation converts it to lowercase.
         *
         * Default: - a CloudFormation generated name
         *
         * @param dbInstanceName A name for the DB instance.
         */
        override fun dbInstanceName(dbInstanceName: String) {
            cdkBuilder.dbInstanceName(dbInstanceName)
        }

        /**
         * A value that indicates whether to enable Performance Insights for the DB Instance.
         *
         * Default: - false
         *
         * @param enablePerformanceInsights A value that indicates whether to enable Performance
         *   Insights for the DB Instance.
         */
        override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
            cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
        }

        /**
         * The name of the compute and memory capacity classes.
         *
         * @param instanceType The name of the compute and memory capacity classes.
         */
        override fun instanceType(instanceType: InstanceType) {
            cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
        }

        /**
         * The weekly time range (in UTC) during which system maintenance can occur.
         *
         * Format: `ddd:hh24:mi-ddd:hh24:mi` Constraint: Minimum 30-minute window
         *
         * Default: - a 30-minute window selected at random from an 8-hour block of time for each
         * AWS Region, occurring on a random day of the week. To see the time blocks available, see
         * https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-maintain.html#maintenance-window
         *
         * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
         *   maintenance can occur.
         */
        override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
            cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
        }

        /**
         * The CloudFormation policy to apply when the instance is removed from the stack or
         * replaced during an update.
         *
         * Default: RemovalPolicy.Retain
         *
         * @param removalPolicy The CloudFormation policy to apply when the instance is removed from
         *   the stack or replaced during an update.
         */
        override fun removalPolicy(removalPolicy: RemovalPolicy) {
            cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.docdb.DatabaseInstance =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromDatabaseInstanceAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: DatabaseInstanceAttributes,
        ): IDatabaseInstance =
            software.amazon.awscdk.services.docdb.DatabaseInstance.fromDatabaseInstanceAttributes(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    attrs.let(DatabaseInstanceAttributes::unwrap)
                )
                .let(IDatabaseInstance::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ff4a584981905c20a48b9c9367a21a00691a564de963b093a11b8692116afdde")
        public fun fromDatabaseInstanceAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: DatabaseInstanceAttributes.Builder.() -> Unit,
        ): IDatabaseInstance =
            fromDatabaseInstanceAttributes(scope, id, DatabaseInstanceAttributes(attrs))

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): DatabaseInstance {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return DatabaseInstance(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstance
        ): DatabaseInstance = DatabaseInstance(cdkObject)

        internal fun unwrap(
            wrapped: DatabaseInstance
        ): software.amazon.awscdk.services.docdb.DatabaseInstance = wrapped.cdkObject
    }
}
