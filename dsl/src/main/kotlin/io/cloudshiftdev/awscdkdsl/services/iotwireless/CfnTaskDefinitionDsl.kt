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

package io.cloudshiftdev.awscdkdsl.services.iotwireless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.constructs.Construct

/**
 * Creates a gateway task definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnTaskDefinition cfnTaskDefinition = CfnTaskDefinition.Builder.create(this,
 * "MyCfnTaskDefinition")
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
public class CfnTaskDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTaskDefinition.Builder = CfnTaskDefinition.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Whether to automatically create tasks using this task definition for all gateways with the
     * specified current version.
     *
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
     *
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     *   all gateways with the specified current version.
     */
    public fun autoCreateTasks(autoCreateTasks: Boolean) {
        cdkBuilder.autoCreateTasks(autoCreateTasks)
    }

    /**
     * Whether to automatically create tasks using this task definition for all gateways with the
     * specified current version.
     *
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
     *
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     *   all gateways with the specified current version.
     */
    public fun autoCreateTasks(autoCreateTasks: IResolvable) {
        cdkBuilder.autoCreateTasks(autoCreateTasks)
    }

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     *
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object.
     */
    public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable) {
        cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry)
    }

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     *
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object.
     */
    public fun loRaWanUpdateGatewayTaskEntry(
        loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty
    ) {
        cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry)
    }

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-name)
     *
     * @param name The name of the new resource.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
     *
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
     *
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A filter to list only the wireless gateway task definitions that use this task definition
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-taskdefinitiontype)
     *
     * @param taskDefinitionType A filter to list only the wireless gateway task definitions that
     *   use this task definition type.
     */
    public fun taskDefinitionType(taskDefinitionType: String) {
        cdkBuilder.taskDefinitionType(taskDefinitionType)
    }

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     *
     * @param update Information about the gateways to update.
     */
    public fun update(update: IResolvable) {
        cdkBuilder.update(update)
    }

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     *
     * @param update Information about the gateways to update.
     */
    public fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty) {
        cdkBuilder.update(update)
    }

    public fun build(): CfnTaskDefinition {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
