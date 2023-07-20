@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.docdb.CfnDBInstance
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDBInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBInstance.Builder = CfnDBInstance.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    public fun dbInstanceClass(dbInstanceClass: String) {
        cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    public fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
        cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBInstance {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
