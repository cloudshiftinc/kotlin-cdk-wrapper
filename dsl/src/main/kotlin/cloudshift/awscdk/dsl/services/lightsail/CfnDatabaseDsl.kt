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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDatabase
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDatabaseDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDatabase.Builder = CfnDatabase.Builder.create(scope, id)

    private val _relationalDatabaseParameters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun backupRetention(backupRetention: Boolean) {
        cdkBuilder.backupRetention(backupRetention)
    }

    public fun backupRetention(backupRetention: IResolvable) {
        cdkBuilder.backupRetention(backupRetention)
    }

    public fun caCertificateIdentifier(caCertificateIdentifier: String) {
        cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    public fun masterDatabaseName(masterDatabaseName: String) {
        cdkBuilder.masterDatabaseName(masterDatabaseName)
    }

    public fun masterUserPassword(masterUserPassword: String) {
        cdkBuilder.masterUserPassword(masterUserPassword)
    }

    public fun masterUsername(masterUsername: String) {
        cdkBuilder.masterUsername(masterUsername)
    }

    public fun preferredBackupWindow(preferredBackupWindow: String) {
        cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String) {
        cdkBuilder.relationalDatabaseBlueprintId(relationalDatabaseBlueprintId)
    }

    public fun relationalDatabaseBundleId(relationalDatabaseBundleId: String) {
        cdkBuilder.relationalDatabaseBundleId(relationalDatabaseBundleId)
    }

    public fun relationalDatabaseName(relationalDatabaseName: String) {
        cdkBuilder.relationalDatabaseName(relationalDatabaseName)
    }

    public fun relationalDatabaseParameters(vararg relationalDatabaseParameters: Any) {
        _relationalDatabaseParameters.addAll(listOf(*relationalDatabaseParameters))
    }

    public fun relationalDatabaseParameters(relationalDatabaseParameters: Collection<Any>) {
        _relationalDatabaseParameters.addAll(relationalDatabaseParameters)
    }

    public fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable) {
        cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters)
    }

    public fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean) {
        cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword)
    }

    public fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable) {
        cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDatabase {
        if (_relationalDatabaseParameters.isNotEmpty()) {
            cdkBuilder.relationalDatabaseParameters(_relationalDatabaseParameters)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
