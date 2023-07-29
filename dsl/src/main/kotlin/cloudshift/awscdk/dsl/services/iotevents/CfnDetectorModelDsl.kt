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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.constructs.Construct

/**
 * The AWS::IoTEvents::DetectorModel resource creates a detector model.
 *
 * You create a *detector model* (a model of your equipment or process) using *states* . For each
 * state, you define conditional (Boolean) logic that evaluates the incoming inputs to detect
 * significant events. When an event is detected, it can change the state or trigger custom-built or
 * predefined actions using other AWS services. You can define additional events that trigger
 * actions when entering or exiting a state and, optionally, when a condition is met. For more
 * information, see
 * [How to Use AWS IoT Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html)
 * in the *AWS IoT Events Developer Guide* .
 *
 * When you successfully update a detector model (using the AWS IoT Events console, AWS IoT Events
 * API or CLI commands, or AWS CloudFormation ) all detector instances created by the model are
 * reset to their initial states. (The detector's `state` , and the values of any variables and
 * timers are reset.)
 *
 * When you successfully update a detector model (using the AWS IoT Events console, AWS IoT Events
 * API or CLI commands, or AWS CloudFormation ) the version number of the detector model is
 * incremented. (A detector model with version number 1 before the update has version number 2 after
 * the update succeeds.)
 *
 * If you attempt to update a detector model using AWS CloudFormation and the update does not
 * succeed, the system may, in some cases, restore the original detector model. When this occurs,
 * the detector model's version is incremented twice (for example, from version 1 to version 3) and
 * the detector instances are reset.
 *
 * Also, be aware that if you attempt to update several detector models at once using AWS
 * CloudFormation , some updates may succeed and others fail. In this case, the effects on each
 * detector model's detector instances and version number depend on whether the update succeeded or
 * failed, with the results as stated.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html)
 */
@CdkDslMarker
public class CfnDetectorModelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDetectorModel.Builder = CfnDetectorModel.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     *
     * @param detectorModelDefinition Information that defines how a detector operates.
     */
    public fun detectorModelDefinition(detectorModelDefinition: IResolvable) {
        cdkBuilder.detectorModelDefinition(detectorModelDefinition)
    }

    /**
     * Information that defines how a detector operates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldefinition)
     *
     * @param detectorModelDefinition Information that defines how a detector operates.
     */
    public fun detectorModelDefinition(
        detectorModelDefinition: CfnDetectorModel.DetectorModelDefinitionProperty
    ) {
        cdkBuilder.detectorModelDefinition(detectorModelDefinition)
    }

    /**
     * A brief description of the detector model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodeldescription)
     *
     * @param detectorModelDescription A brief description of the detector model.
     */
    public fun detectorModelDescription(detectorModelDescription: String) {
        cdkBuilder.detectorModelDescription(detectorModelDescription)
    }

    /**
     * The name of the detector model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-detectormodelname)
     *
     * @param detectorModelName The name of the detector model.
     */
    public fun detectorModelName(detectorModelName: String) {
        cdkBuilder.detectorModelName(detectorModelName)
    }

    /**
     * Information about the order in which events are evaluated and how actions are executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-evaluationmethod)
     *
     * @param evaluationMethod Information about the order in which events are evaluated and how
     *   actions are executed.
     */
    public fun evaluationMethod(evaluationMethod: String) {
        cdkBuilder.evaluationMethod(evaluationMethod)
    }

    /**
     * The value used to identify a detector instance.
     *
     * When a device or system sends input, a new detector instance with a unique key value is
     * created. AWS IoT Events can continue to route input to its corresponding detector instance
     * based on this identifying information.
     *
     * This parameter uses a JSON-path expression to select the attribute-value pair in the message
     * payload that is used for identification. To route the message to the correct detector
     * instance, the device must send a message payload that contains the same attribute-value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-key)
     *
     * @param key The value used to identify a detector instance.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-rolearn)
     *
     * @param roleArn The ARN of the role that grants permission to AWS IoT Events to perform its
     *   operations.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html#cfn-iotevents-detectormodel-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDetectorModel {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
