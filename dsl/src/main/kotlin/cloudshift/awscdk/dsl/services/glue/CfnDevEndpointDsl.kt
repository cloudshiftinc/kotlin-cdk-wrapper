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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.glue.CfnDevEndpoint
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDevEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDevEndpoint.Builder = CfnDevEndpoint.Builder.create(scope, id)

    private val _publicKeys: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    public fun arguments(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.arguments(builder.map)
    }

    public fun arguments(arguments: Any) {
        cdkBuilder.arguments(arguments)
    }

    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    public fun extraJarsS3Path(extraJarsS3Path: String) {
        cdkBuilder.extraJarsS3Path(extraJarsS3Path)
    }

    public fun extraPythonLibsS3Path(extraPythonLibsS3Path: String) {
        cdkBuilder.extraPythonLibsS3Path(extraPythonLibsS3Path)
    }

    public fun glueVersion(glueVersion: String) {
        cdkBuilder.glueVersion(glueVersion)
    }

    public fun numberOfNodes(numberOfNodes: Number) {
        cdkBuilder.numberOfNodes(numberOfNodes)
    }

    public fun numberOfWorkers(numberOfWorkers: Number) {
        cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    public fun publicKey(publicKey: String) {
        cdkBuilder.publicKey(publicKey)
    }

    public fun publicKeys(vararg publicKeys: String) {
        _publicKeys.addAll(listOf(*publicKeys))
    }

    public fun publicKeys(publicKeys: Collection<String>) {
        _publicKeys.addAll(publicKeys)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun workerType(workerType: String) {
        cdkBuilder.workerType(workerType)
    }

    public fun build(): CfnDevEndpoint {
        if (_publicKeys.isNotEmpty()) cdkBuilder.publicKeys(_publicKeys)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
