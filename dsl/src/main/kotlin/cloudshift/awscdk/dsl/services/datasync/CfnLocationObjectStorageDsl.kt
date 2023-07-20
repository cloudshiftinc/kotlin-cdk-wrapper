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
import software.amazon.awscdk.services.datasync.CfnLocationObjectStorage
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLocationObjectStorageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocationObjectStorage.Builder =
        CfnLocationObjectStorage.Builder.create(scope, id)

    private val _agentArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun accessKey(accessKey: String) {
        cdkBuilder.accessKey(accessKey)
    }

    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun secretKey(secretKey: String) {
        cdkBuilder.secretKey(secretKey)
    }

    public fun serverCertificate(serverCertificate: String) {
        cdkBuilder.serverCertificate(serverCertificate)
    }

    public fun serverHostname(serverHostname: String) {
        cdkBuilder.serverHostname(serverHostname)
    }

    public fun serverPort(serverPort: Number) {
        cdkBuilder.serverPort(serverPort)
    }

    public fun serverProtocol(serverProtocol: String) {
        cdkBuilder.serverProtocol(serverProtocol)
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

    public fun build(): CfnLocationObjectStorage {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
