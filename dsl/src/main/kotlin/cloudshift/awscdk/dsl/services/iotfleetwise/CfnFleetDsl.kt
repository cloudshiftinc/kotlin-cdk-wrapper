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
import software.amazon.awscdk.services.iotfleetwise.CfnFleet
import software.constructs.Construct

/**
 * Creates a fleet that represents a group of vehicles.
 *
 * You must create both a signal catalog and vehicles before you can create a fleet.
 *
 * For more information, see
 * [Fleets](https://docs.aws.amazon.com/iot-fleetwise/latest/developerguide/fleets.html) in the *AWS
 * IoT FleetWise Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CfnFleet cfnFleet = CfnFleet.Builder.create(this, "MyCfnFleet")
 * .id("id")
 * .signalCatalogArn("signalCatalogArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html)
 */
@CdkDslMarker
public class CfnFleetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFleet.Builder = CfnFleet.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * (Optional) A brief description of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-description)
     *
     * @param description (Optional) A brief description of the fleet.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The unique ID of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-id)
     *
     * @param id The unique ID of the fleet.
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * The ARN of the signal catalog associated with the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-signalcatalogarn)
     *
     * @param signalCatalogArn The ARN of the signal catalog associated with the fleet.
     */
    public fun signalCatalogArn(signalCatalogArn: String) {
        cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * (Optional) Metadata that can be used to manage the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-tags)
     *
     * @param tags (Optional) Metadata that can be used to manage the fleet.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * (Optional) Metadata that can be used to manage the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-tags)
     *
     * @param tags (Optional) Metadata that can be used to manage the fleet.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFleet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
