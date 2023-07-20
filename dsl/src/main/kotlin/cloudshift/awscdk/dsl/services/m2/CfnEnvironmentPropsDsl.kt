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

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.m2.CfnEnvironment
import software.amazon.awscdk.services.m2.CfnEnvironmentProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEnvironmentPropsDsl {
    private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _storageConfigurations: MutableList<Any> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun engineType(engineType: String) {
        cdkBuilder.engineType(engineType)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun highAvailabilityConfig(highAvailabilityConfig: IResolvable) {
        cdkBuilder.highAvailabilityConfig(highAvailabilityConfig)
    }

    public fun highAvailabilityConfig(highAvailabilityConfig: CfnEnvironment.HighAvailabilityConfigProperty) {
        cdkBuilder.highAvailabilityConfig(highAvailabilityConfig)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
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

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun storageConfigurations(vararg storageConfigurations: Any) {
        _storageConfigurations.addAll(listOf(*storageConfigurations))
    }

    public fun storageConfigurations(storageConfigurations: Collection<Any>) {
        _storageConfigurations.addAll(storageConfigurations)
    }

    public fun storageConfigurations(storageConfigurations: IResolvable) {
        cdkBuilder.storageConfigurations(storageConfigurations)
    }

    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnEnvironmentProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_storageConfigurations.isNotEmpty()) cdkBuilder.storageConfigurations(_storageConfigurations)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
