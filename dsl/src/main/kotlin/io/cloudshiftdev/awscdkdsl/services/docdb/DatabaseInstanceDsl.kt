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

package io.cloudshiftdev.awscdkdsl.services.docdb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.docdb.DatabaseInstance
import software.amazon.awscdk.services.docdb.IDatabaseCluster
import software.amazon.awscdk.services.ec2.InstanceType
import software.constructs.Construct

/**
 * A database instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.docdb.*;
 * import software.amazon.awscdk.services.ec2.*;
 * DatabaseCluster databaseCluster;
 * InstanceType instanceType;
 * DatabaseInstance databaseInstance = DatabaseInstance.Builder.create(this, "MyDatabaseInstance")
 * .cluster(databaseCluster)
 * .instanceType(instanceType)
 * // the properties below are optional
 * .autoMinorVersionUpgrade(false)
 * .availabilityZone("availabilityZone")
 * .dbInstanceName("dbInstanceName")
 * .enablePerformanceInsights(false)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build();
 * ```
 */
@CdkDslMarker
public class DatabaseInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DatabaseInstance.Builder = DatabaseInstance.Builder.create(scope, id)

    /**
     * Indicates that minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window.
     *
     * Default: true
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     *   to the DB instance during the maintenance window.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
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
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The DocumentDB database cluster the instance should launch into.
     *
     * @param cluster The DocumentDB database cluster the instance should launch into.
     */
    public fun cluster(cluster: IDatabaseCluster) {
        cdkBuilder.cluster(cluster)
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
    public fun dbInstanceName(dbInstanceName: String) {
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
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * The name of the compute and memory capacity classes.
     *
     * @param instanceType The name of the compute and memory capacity classes.
     */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The weekly time range (in UTC) during which system maintenance can occur.
     *
     * Format: `ddd:hh24:mi-ddd:hh24:mi` Constraint: Minimum 30-minute window
     *
     * Default: - a 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region, occurring on a random day of the week. To see the time blocks available, see
     * https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-maintain.html#maintenance-window
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     *   maintenance can occur.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The CloudFormation policy to apply when the instance is removed from the stack or replaced
     * during an update.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     *   stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): DatabaseInstance = cdkBuilder.build()
}
