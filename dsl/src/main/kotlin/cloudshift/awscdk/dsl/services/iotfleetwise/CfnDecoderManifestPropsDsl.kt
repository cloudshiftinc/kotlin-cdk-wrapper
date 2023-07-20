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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDecoderManifestPropsDsl {
    private val cdkBuilder: CfnDecoderManifestProps.Builder = CfnDecoderManifestProps.builder()

    private val _networkInterfaces: MutableList<Any> = mutableListOf()

    private val _signalDecoders: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun modelManifestArn(modelManifestArn: String) {
        cdkBuilder.modelManifestArn(modelManifestArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun networkInterfaces(vararg networkInterfaces: Any) {
        _networkInterfaces.addAll(listOf(*networkInterfaces))
    }

    public fun networkInterfaces(networkInterfaces: Collection<Any>) {
        _networkInterfaces.addAll(networkInterfaces)
    }

    public fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces)
    }

    public fun signalDecoders(vararg signalDecoders: Any) {
        _signalDecoders.addAll(listOf(*signalDecoders))
    }

    public fun signalDecoders(signalDecoders: Collection<Any>) {
        _signalDecoders.addAll(signalDecoders)
    }

    public fun signalDecoders(signalDecoders: IResolvable) {
        cdkBuilder.signalDecoders(signalDecoders)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDecoderManifestProps {
        if (_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
        if (_signalDecoders.isNotEmpty()) cdkBuilder.signalDecoders(_signalDecoders)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
