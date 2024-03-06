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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnQueue
import software.amazon.awscdk.services.connect.CfnQueueProps

/**
 * Properties for defining a `CfnQueue`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnQueueProps cfnQueueProps = CfnQueueProps.builder()
 * .hoursOfOperationArn("hoursOfOperationArn")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .maxContacts(123)
 * .outboundCallerConfig(OutboundCallerConfigProperty.builder()
 * .outboundCallerIdName("outboundCallerIdName")
 * .outboundCallerIdNumberArn("outboundCallerIdNumberArn")
 * .outboundFlowArn("outboundFlowArn")
 * .build())
 * .quickConnectArns(List.of("quickConnectArns"))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html)
 */
@CdkDslMarker
public class CfnQueuePropsDsl {
    private val cdkBuilder: CfnQueueProps.Builder = CfnQueueProps.builder()

    private val _quickConnectArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the queue. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param hoursOfOperationArn The Amazon Resource Name (ARN) of the hours of operation. */
    public fun hoursOfOperationArn(hoursOfOperationArn: String) {
        cdkBuilder.hoursOfOperationArn(hoursOfOperationArn)
    }

    /** @param instanceArn The identifier of the Amazon Connect instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param maxContacts The maximum number of contacts that can be in the queue before it is
     *   considered full.
     */
    public fun maxContacts(maxContacts: Number) {
        cdkBuilder.maxContacts(maxContacts)
    }

    /** @param name The name of the queue. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    public fun outboundCallerConfig(outboundCallerConfig: IResolvable) {
        cdkBuilder.outboundCallerConfig(outboundCallerConfig)
    }

    /**
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    public fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty) {
        cdkBuilder.outboundCallerConfig(outboundCallerConfig)
    }

    /**
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     *   available to agents who are working the queue.
     */
    public fun quickConnectArns(vararg quickConnectArns: String) {
        _quickConnectArns.addAll(listOf(*quickConnectArns))
    }

    /**
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     *   available to agents who are working the queue.
     */
    public fun quickConnectArns(quickConnectArns: Collection<String>) {
        _quickConnectArns.addAll(quickConnectArns)
    }

    /** @param status The status of the queue. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnQueueProps {
        if (_quickConnectArns.isNotEmpty()) cdkBuilder.quickConnectArns(_quickConnectArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
