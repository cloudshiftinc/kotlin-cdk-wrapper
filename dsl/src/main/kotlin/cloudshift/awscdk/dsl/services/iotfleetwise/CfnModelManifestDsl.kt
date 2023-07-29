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
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifest
import software.constructs.Construct

/**
 * Creates a vehicle model (model manifest) that specifies signals (attributes, branches, sensors,
 * and actuators).
 *
 * For more information, see
 * [Vehicle models](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/vehicle-models.html)
 * in the *AWS IoT FleetWise Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CfnModelManifest cfnModelManifest = CfnModelManifest.Builder.create(this, "MyCfnModelManifest")
 * .name("name")
 * .signalCatalogArn("signalCatalogArn")
 * // the properties below are optional
 * .description("description")
 * .nodes(List.of("nodes"))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html)
 */
@CdkDslMarker
public class CfnModelManifestDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnModelManifest.Builder = CfnModelManifest.Builder.create(scope, id)

    private val _nodes: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * (Optional) A brief description of the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-description)
     *
     * @param description (Optional) A brief description of the vehicle model.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-name)
     *
     * @param name The name of the vehicle model.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * (Optional) A list of nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-nodes)
     *
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals.
     */
    public fun nodes(vararg nodes: String) {
        _nodes.addAll(listOf(*nodes))
    }

    /**
     * (Optional) A list of nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-nodes)
     *
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals.
     */
    public fun nodes(nodes: Collection<String>) {
        _nodes.addAll(nodes)
    }

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-signalcatalogarn)
     *
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     *   the vehicle model.
     */
    public fun signalCatalogArn(signalCatalogArn: String) {
        cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * (Optional) The state of the vehicle model.
     *
     * If the status is `ACTIVE` , the vehicle model can't be edited. If the status is `DRAFT` , you
     * can edit the vehicle model.
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-status)
     *
     * @param status (Optional) The state of the vehicle model.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * (Optional) Metadata that can be used to manage the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-tags)
     *
     * @param tags (Optional) Metadata that can be used to manage the vehicle model.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * (Optional) Metadata that can be used to manage the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-tags)
     *
     * @param tags (Optional) Metadata that can be used to manage the vehicle model.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnModelManifest {
        if (_nodes.isNotEmpty()) cdkBuilder.nodes(_nodes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
