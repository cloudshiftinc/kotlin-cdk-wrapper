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

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.docdb.DatabaseInstanceProps
import software.amazon.awscdk.services.docdb.IDatabaseCluster
import software.amazon.awscdk.services.ec2.InstanceType

/**
 * Construction properties for a DatabaseInstanceNew.
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
 * DatabaseInstanceProps databaseInstanceProps = DatabaseInstanceProps.builder()
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
public class DatabaseInstancePropsDsl {
    private val cdkBuilder: DatabaseInstanceProps.Builder = DatabaseInstanceProps.builder()

    /**
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades are applied automatically
     *   to the DB instance during the maintenance window.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param availabilityZone The name of the Availability Zone where the DB instance will be
     *   located.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param cluster The DocumentDB database cluster the instance should launch into. */
    public fun cluster(cluster: IDatabaseCluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param dbInstanceName A name for the DB instance. If you specify a name, AWS CloudFormation
     *   converts it to lowercase.
     */
    public fun dbInstanceName(dbInstanceName: String) {
        cdkBuilder.dbInstanceName(dbInstanceName)
    }

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     *   Insights for the DB Instance.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /** @param instanceType The name of the compute and memory capacity classes. */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system
     *   maintenance can occur. Format: `ddd:hh24:mi-ddd:hh24:mi` Constraint: Minimum 30-minute
     *   window
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param removalPolicy The CloudFormation policy to apply when the instance is removed from the
     *   stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): DatabaseInstanceProps = cdkBuilder.build()
}
