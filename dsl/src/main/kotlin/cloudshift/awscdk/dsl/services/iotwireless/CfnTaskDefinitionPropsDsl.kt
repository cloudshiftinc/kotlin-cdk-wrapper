@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnTaskDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnTaskDefinitionProps cfnTaskDefinitionProps = CfnTaskDefinitionProps.builder()
 * .autoCreateTasks(false)
 * // the properties below are optional
 * .loRaWanUpdateGatewayTaskEntry(LoRaWANUpdateGatewayTaskEntryProperty.builder()
 * .currentVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .updateVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskDefinitionType("taskDefinitionType")
 * .update(UpdateWirelessGatewayTaskCreateProperty.builder()
 * .loRaWan(LoRaWANUpdateGatewayTaskCreateProperty.builder()
 * .currentVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .sigKeyCrc(123)
 * .updateSignature("updateSignature")
 * .updateVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .build())
 * .updateDataRole("updateDataRole")
 * .updateDataSource("updateDataSource")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionPropsDsl {
    private val cdkBuilder: CfnTaskDefinitionProps.Builder = CfnTaskDefinitionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for all
     * gateways with the specified current version.
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     */
    public fun autoCreateTasks(autoCreateTasks: Boolean) {
        cdkBuilder.autoCreateTasks(autoCreateTasks)
    }

    /**
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for all
     * gateways with the specified current version.
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     */
    public fun autoCreateTasks(autoCreateTasks: IResolvable) {
        cdkBuilder.autoCreateTasks(autoCreateTasks)
    }

    /**
     * @param loRaWanUpdateGatewayTaskEntry the value to be set.
     */
    public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable) {
        cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry)
    }

    /**
     * @param loRaWanUpdateGatewayTaskEntry the value to be set.
     */
    public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty) {
        cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry)
    }

    /**
     * @param name The name of the new resource.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param taskDefinitionType A filter to list only the wireless gateway task definitions that use
     * this task definition type.
     */
    public fun taskDefinitionType(taskDefinitionType: String) {
        cdkBuilder.taskDefinitionType(taskDefinitionType)
    }

    /**
     * @param update Information about the gateways to update.
     */
    public fun update(update: IResolvable) {
        cdkBuilder.update(update)
    }

    /**
     * @param update Information about the gateways to update.
     */
    public fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty) {
        cdkBuilder.update(update)
    }

    public fun build(): CfnTaskDefinitionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
