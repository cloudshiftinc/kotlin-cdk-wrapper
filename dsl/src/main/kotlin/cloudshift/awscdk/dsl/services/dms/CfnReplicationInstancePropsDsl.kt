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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnReplicationInstanceProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReplicationInstancePropsDsl {
    private val cdkBuilder: CfnReplicationInstanceProps.Builder =
        CfnReplicationInstanceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    public fun allocatedStorage(allocatedStorage: Number) {
        cdkBuilder.allocatedStorage(allocatedStorage)
    }

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
    }

    public fun multiAz(multiAz: IResolvable) {
        cdkBuilder.multiAz(multiAz)
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

    public fun replicationInstanceClass(replicationInstanceClass: String) {
        cdkBuilder.replicationInstanceClass(replicationInstanceClass)
    }

    public fun replicationInstanceIdentifier(replicationInstanceIdentifier: String) {
        cdkBuilder.replicationInstanceIdentifier(replicationInstanceIdentifier)
    }

    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
        cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    public fun build(): CfnReplicationInstanceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        return cdkBuilder.build()
    }
}
