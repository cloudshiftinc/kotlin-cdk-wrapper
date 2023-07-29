@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps

/**
 * Properties for defining a `CfnVehicle`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CfnVehicleProps cfnVehicleProps = CfnVehicleProps.builder()
 * .decoderManifestArn("decoderManifestArn")
 * .modelManifestArn("modelManifestArn")
 * .name("name")
 * // the properties below are optional
 * .associationBehavior("associationBehavior")
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-vehicle.html)
 */
@CdkDslMarker
public class CfnVehiclePropsDsl {
    private val cdkBuilder: CfnVehicleProps.Builder = CfnVehicleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param associationBehavior (Optional) An option to create a new AWS IoT thing when creating a
     *   vehicle, or to validate an existing thing as a vehicle.
     */
    public fun associationBehavior(associationBehavior: String) {
        cdkBuilder.associationBehavior(associationBehavior)
    }

    /**
     * @param attributes (Optional) Static information about a vehicle in a key-value pair. For
     *   example: `"engine Type"` : `"v6"`
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param attributes (Optional) Static information about a vehicle in a key-value pair. For
     *   example: `"engine Type"` : `"v6"`
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param decoderManifestArn The Amazon Resource Name (ARN) of a decoder manifest associated
     *   with the vehicle to create.
     */
    public fun decoderManifestArn(decoderManifestArn: String) {
        cdkBuilder.decoderManifestArn(decoderManifestArn)
    }

    /**
     * @param modelManifestArn The Amazon Resource Name (ARN) of the vehicle model (model manifest)
     *   to create the vehicle from.
     */
    public fun modelManifestArn(modelManifestArn: String) {
        cdkBuilder.modelManifestArn(modelManifestArn)
    }

    /** @param name The unique ID of the vehicle. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags (Optional) Metadata which can be used to manage the vehicle. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags (Optional) Metadata which can be used to manage the vehicle. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnVehicleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
