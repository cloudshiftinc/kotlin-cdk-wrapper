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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFlowOutputDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlowOutput.Builder = CfnFlowOutput.Builder.create(scope, id)

    private val _cidrAllowList: MutableList<String> = mutableListOf()

    public fun cidrAllowList(vararg cidrAllowList: String) {
        _cidrAllowList.addAll(listOf(*cidrAllowList))
    }

    public fun cidrAllowList(cidrAllowList: Collection<String>) {
        _cidrAllowList.addAll(cidrAllowList)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryption(encryption: CfnFlowOutput.EncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    public fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
    }

    public fun maxLatency(maxLatency: Number) {
        cdkBuilder.maxLatency(maxLatency)
    }

    public fun minLatency(minLatency: Number) {
        cdkBuilder.minLatency(minLatency)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun remoteId(remoteId: String) {
        cdkBuilder.remoteId(remoteId)
    }

    public fun smoothingLatency(smoothingLatency: Number) {
        cdkBuilder.smoothingLatency(smoothingLatency)
    }

    public fun streamId(streamId: String) {
        cdkBuilder.streamId(streamId)
    }

    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
    }

    public fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlowOutput.VpcInterfaceAttachmentProperty) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
    }

    public fun build(): CfnFlowOutput {
        if (_cidrAllowList.isNotEmpty()) cdkBuilder.cidrAllowList(_cidrAllowList)
        return cdkBuilder.build()
    }
}
