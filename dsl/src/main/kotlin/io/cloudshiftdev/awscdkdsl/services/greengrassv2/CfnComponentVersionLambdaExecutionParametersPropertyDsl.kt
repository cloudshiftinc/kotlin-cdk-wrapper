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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

/**
 * Contains parameters for a Lambda function that runs on AWS IoT Greengrass .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * LambdaExecutionParametersProperty lambdaExecutionParametersProperty =
 * LambdaExecutionParametersProperty.builder()
 * .environmentVariables(Map.of(
 * "environmentVariablesKey", "environmentVariables"))
 * .eventSources(List.of(LambdaEventSourceProperty.builder()
 * .topic("topic")
 * .type("type")
 * .build()))
 * .execArgs(List.of("execArgs"))
 * .inputPayloadEncodingType("inputPayloadEncodingType")
 * .linuxProcessParams(LambdaLinuxProcessParamsProperty.builder()
 * .containerParams(LambdaContainerParamsProperty.builder()
 * .devices(List.of(LambdaDeviceMountProperty.builder()
 * .addGroupOwner(false)
 * .path("path")
 * .permission("permission")
 * .build()))
 * .memorySizeInKb(123)
 * .mountRoSysfs(false)
 * .volumes(List.of(LambdaVolumeMountProperty.builder()
 * .addGroupOwner(false)
 * .destinationPath("destinationPath")
 * .permission("permission")
 * .sourcePath("sourcePath")
 * .build()))
 * .build())
 * .isolationMode("isolationMode")
 * .build())
 * .maxIdleTimeInSeconds(123)
 * .maxInstancesCount(123)
 * .maxQueueSize(123)
 * .pinned(false)
 * .statusTimeoutInSeconds(123)
 * .timeoutInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaexecutionparameters.html)
 */
@CdkDslMarker
public class CfnComponentVersionLambdaExecutionParametersPropertyDsl {
    private val cdkBuilder: CfnComponentVersion.LambdaExecutionParametersProperty.Builder =
        CfnComponentVersion.LambdaExecutionParametersProperty.builder()

    private val _eventSources: MutableList<Any> = mutableListOf()

    private val _execArgs: MutableList<String> = mutableListOf()

    /**
     * @param environmentVariables The map of environment variables that are available to the Lambda
     *   function when it runs.
     */
    public fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param environmentVariables The map of environment variables that are available to the Lambda
     *   function when it runs.
     */
    public fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param eventSources The list of event sources to which to subscribe to receive work messages.
     *   The Lambda function runs when it receives a message from an event source. You can subscribe
     *   this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
     */
    public fun eventSources(vararg eventSources: Any) {
        _eventSources.addAll(listOf(*eventSources))
    }

    /**
     * @param eventSources The list of event sources to which to subscribe to receive work messages.
     *   The Lambda function runs when it receives a message from an event source. You can subscribe
     *   this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
     */
    public fun eventSources(eventSources: Collection<Any>) {
        _eventSources.addAll(eventSources)
    }

    /**
     * @param eventSources The list of event sources to which to subscribe to receive work messages.
     *   The Lambda function runs when it receives a message from an event source. You can subscribe
     *   this function to local publish/subscribe messages and AWS IoT Core MQTT messages.
     */
    public fun eventSources(eventSources: IResolvable) {
        cdkBuilder.eventSources(eventSources)
    }

    /** @param execArgs The list of arguments to pass to the Lambda function when it runs. */
    public fun execArgs(vararg execArgs: String) {
        _execArgs.addAll(listOf(*execArgs))
    }

    /** @param execArgs The list of arguments to pass to the Lambda function when it runs. */
    public fun execArgs(execArgs: Collection<String>) {
        _execArgs.addAll(execArgs)
    }

    /**
     * @param inputPayloadEncodingType The encoding type that the Lambda function supports. Default:
     *   `json`
     */
    public fun inputPayloadEncodingType(inputPayloadEncodingType: String) {
        cdkBuilder.inputPayloadEncodingType(inputPayloadEncodingType)
    }

    /**
     * @param linuxProcessParams The parameters for the Linux process that contains the Lambda
     *   function.
     */
    public fun linuxProcessParams(linuxProcessParams: IResolvable) {
        cdkBuilder.linuxProcessParams(linuxProcessParams)
    }

    /**
     * @param linuxProcessParams The parameters for the Linux process that contains the Lambda
     *   function.
     */
    public fun linuxProcessParams(
        linuxProcessParams: CfnComponentVersion.LambdaLinuxProcessParamsProperty
    ) {
        cdkBuilder.linuxProcessParams(linuxProcessParams)
    }

    /**
     * @param maxIdleTimeInSeconds The maximum amount of time in seconds that a non-pinned Lambda
     *   function can idle before the AWS IoT Greengrass Core software stops its process.
     */
    public fun maxIdleTimeInSeconds(maxIdleTimeInSeconds: Number) {
        cdkBuilder.maxIdleTimeInSeconds(maxIdleTimeInSeconds)
    }

    /**
     * @param maxInstancesCount The maximum number of instances that a non-pinned Lambda function
     *   can run at the same time.
     */
    public fun maxInstancesCount(maxInstancesCount: Number) {
        cdkBuilder.maxInstancesCount(maxInstancesCount)
    }

    /**
     * @param maxQueueSize The maximum size of the message queue for the Lambda function component.
     *   The AWS IoT Greengrass core device stores messages in a FIFO (first-in-first-out) queue
     *   until it can run the Lambda function to consume each message.
     */
    public fun maxQueueSize(maxQueueSize: Number) {
        cdkBuilder.maxQueueSize(maxQueueSize)
    }

    /**
     * @param pinned Whether or not the Lambda function is pinned, or long-lived.
     * * A pinned Lambda function starts when the AWS IoT Greengrass Core starts and keeps running
     *   in its own container.
     * * A non-pinned Lambda function starts only when it receives a work item and exists after it
     *   idles for `maxIdleTimeInSeconds` . If the function has multiple work items, the AWS IoT
     *   Greengrass Core software creates multiple instances of the function.
     *
     * Default: `true`
     */
    public fun pinned(pinned: Boolean) {
        cdkBuilder.pinned(pinned)
    }

    /**
     * @param pinned Whether or not the Lambda function is pinned, or long-lived.
     * * A pinned Lambda function starts when the AWS IoT Greengrass Core starts and keeps running
     *   in its own container.
     * * A non-pinned Lambda function starts only when it receives a work item and exists after it
     *   idles for `maxIdleTimeInSeconds` . If the function has multiple work items, the AWS IoT
     *   Greengrass Core software creates multiple instances of the function.
     *
     * Default: `true`
     */
    public fun pinned(pinned: IResolvable) {
        cdkBuilder.pinned(pinned)
    }

    /**
     * @param statusTimeoutInSeconds The interval in seconds at which a pinned (also known as
     *   long-lived) Lambda function component sends status updates to the Lambda manager component.
     */
    public fun statusTimeoutInSeconds(statusTimeoutInSeconds: Number) {
        cdkBuilder.statusTimeoutInSeconds(statusTimeoutInSeconds)
    }

    /**
     * @param timeoutInSeconds The maximum amount of time in seconds that the Lambda function can
     *   process a work item.
     */
    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): CfnComponentVersion.LambdaExecutionParametersProperty {
        if (_eventSources.isNotEmpty()) cdkBuilder.eventSources(_eventSources)
        if (_execArgs.isNotEmpty()) cdkBuilder.execArgs(_execArgs)
        return cdkBuilder.build()
    }
}
