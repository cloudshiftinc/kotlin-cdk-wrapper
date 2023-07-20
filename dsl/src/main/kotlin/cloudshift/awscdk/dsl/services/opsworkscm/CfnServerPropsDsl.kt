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

package cloudshift.awscdk.dsl.services.opsworkscm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworkscm.CfnServerProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServerPropsDsl {
    private val cdkBuilder: CfnServerProps.Builder = CfnServerProps.builder()

    private val _engineAttributes: MutableList<Any> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    public fun backupId(backupId: String) {
        cdkBuilder.backupId(backupId)
    }

    public fun backupRetentionCount(backupRetentionCount: Number) {
        cdkBuilder.backupRetentionCount(backupRetentionCount)
    }

    public fun customCertificate(customCertificate: String) {
        cdkBuilder.customCertificate(customCertificate)
    }

    public fun customDomain(customDomain: String) {
        cdkBuilder.customDomain(customDomain)
    }

    public fun customPrivateKey(customPrivateKey: String) {
        cdkBuilder.customPrivateKey(customPrivateKey)
    }

    public fun disableAutomatedBackup(disableAutomatedBackup: Boolean) {
        cdkBuilder.disableAutomatedBackup(disableAutomatedBackup)
    }

    public fun disableAutomatedBackup(disableAutomatedBackup: IResolvable) {
        cdkBuilder.disableAutomatedBackup(disableAutomatedBackup)
    }

    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    public fun engineAttributes(vararg engineAttributes: Any) {
        _engineAttributes.addAll(listOf(*engineAttributes))
    }

    public fun engineAttributes(engineAttributes: Collection<Any>) {
        _engineAttributes.addAll(engineAttributes)
    }

    public fun engineAttributes(engineAttributes: IResolvable) {
        cdkBuilder.engineAttributes(engineAttributes)
    }

    public fun engineModel(engineModel: String) {
        cdkBuilder.engineModel(engineModel)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun instanceProfileArn(instanceProfileArn: String) {
        cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun keyPair(keyPair: String) {
        cdkBuilder.keyPair(keyPair)
    }

    public fun preferredBackupWindow(preferredBackupWindow: String) {
        cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
    }

    public fun serviceRoleArn(serviceRoleArn: String) {
        cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServerProps {
        if (_engineAttributes.isNotEmpty()) cdkBuilder.engineAttributes(_engineAttributes)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
