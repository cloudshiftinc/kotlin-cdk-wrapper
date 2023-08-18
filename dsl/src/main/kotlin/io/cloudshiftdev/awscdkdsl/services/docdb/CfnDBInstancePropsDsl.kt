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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.docdb.CfnDBInstanceProps

/**
 * Properties for defining a `CfnDBInstance`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * CfnDBInstanceProps cfnDBInstanceProps = CfnDBInstanceProps.builder()
 * .dbClusterIdentifier("dbClusterIdentifier")
 * .dbInstanceClass("dbInstanceClass")
 * // the properties below are optional
 * .autoMinorVersionUpgrade(false)
 * .availabilityZone("availabilityZone")
 * .dbInstanceIdentifier("dbInstanceIdentifier")
 * .enablePerformanceInsights(false)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbinstance.html)
 */
@CdkDslMarker
public class CfnDBInstancePropsDsl {
    private val cdkBuilder: CfnDBInstanceProps.Builder = CfnDBInstanceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB. Amazon
     *   DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade This parameter does not apply to Amazon DocumentDB. Amazon
     *   DocumentDB does not perform minor version upgrades regardless of the value set.
     *
     * Default: `false`
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param availabilityZone The Amazon EC2 Availability Zone that the instance is created in.
     *   Default: A random, system-chosen Availability Zone in the endpoint's AWS Region .
     *
     * Example: `us-east-1d`
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param dbClusterIdentifier The identifier of the cluster that the instance will belong to.
     */
    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    /**
     * @param dbInstanceClass The compute and memory capacity of the instance;. for example,
     *   `db.m4.large` . If you change the class of an instance there can be some interruption in
     *   the cluster's service.
     */
    public fun dbInstanceClass(dbInstanceClass: String) {
        cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    /**
     * @param dbInstanceIdentifier The instance identifier. This parameter is stored as a lowercase
     *   string. Constraints:
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * Example: `mydbinstance`
     */
    public fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
        cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    /** @param enablePerformanceInsights the value to be set. */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /** @param enablePerformanceInsights the value to be set. */
    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /**
     * @param preferredMaintenanceWindow The time range each week during which system maintenance
     *   can occur, in Universal Coordinated Time (UTC). Format: `ddd:hh24:mi-ddd:hh24:mi`
     *
     * The default is a 30-minute window selected at random from an 8-hour block of time for each
     * AWS Region , occurring on a random day of the week.
     *
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * Constraints: Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param tags The tags to be assigned to the instance. You can assign up to 10 tags to an
     *   instance.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags to be assigned to the instance. You can assign up to 10 tags to an
     *   instance.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBInstanceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
