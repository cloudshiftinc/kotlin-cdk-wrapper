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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnStorageSystem
import software.amazon.awscdk.services.datasync.CfnStorageSystemProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStorageSystemPropsDsl {
    private val cdkBuilder: CfnStorageSystemProps.Builder = CfnStorageSystemProps.builder()

    private val _agentArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
        cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun serverConfiguration(serverConfiguration: IResolvable) {
        cdkBuilder.serverConfiguration(serverConfiguration)
    }

    public fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty) {
        cdkBuilder.serverConfiguration(serverConfiguration)
    }

    public fun serverCredentials(serverCredentials: IResolvable) {
        cdkBuilder.serverCredentials(serverCredentials)
    }

    public fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty) {
        cdkBuilder.serverCredentials(serverCredentials)
    }

    public fun systemType(systemType: String) {
        cdkBuilder.systemType(systemType)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStorageSystemProps {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
