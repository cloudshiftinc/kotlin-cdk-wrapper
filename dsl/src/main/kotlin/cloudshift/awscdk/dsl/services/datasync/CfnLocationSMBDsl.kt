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
import software.amazon.awscdk.services.datasync.CfnLocationSMB
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLocationSMBDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocationSMB.Builder = CfnLocationSMB.Builder.create(scope, id)

    private val _agentArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions)
    }

    public fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions)
    }

    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    public fun serverHostname(serverHostname: String) {
        cdkBuilder.serverHostname(serverHostname)
    }

    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun build(): CfnLocationSMB {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
