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
import software.amazon.awscdk.services.iotfleetwise.CfnVehicle
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVehicleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVehicle.Builder = CfnVehicle.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun associationBehavior(associationBehavior: String) {
        cdkBuilder.associationBehavior(associationBehavior)
    }

    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    public fun decoderManifestArn(decoderManifestArn: String) {
        cdkBuilder.decoderManifestArn(decoderManifestArn)
    }

    public fun modelManifestArn(modelManifestArn: String) {
        cdkBuilder.modelManifestArn(modelManifestArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnVehicle {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
