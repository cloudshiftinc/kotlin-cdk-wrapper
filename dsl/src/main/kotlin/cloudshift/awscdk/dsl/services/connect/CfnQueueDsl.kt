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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnQueue
import software.constructs.Construct

/**
 * Contains information about a queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnQueue cfnQueue = CfnQueue.Builder.create(this, "MyCfnQueue")
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
public class CfnQueueDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnQueue.Builder = CfnQueue.Builder.create(scope, id)

    private val _quickConnectArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-description)
     *
     * @param description The description of the queue.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-hoursofoperationarn)
     *
     * @param hoursOfOperationArn The Amazon Resource Name (ARN) of the hours of operation.
     */
    public fun hoursOfOperationArn(hoursOfOperationArn: String) {
        cdkBuilder.hoursOfOperationArn(hoursOfOperationArn)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-instancearn)
     *
     * @param instanceArn The identifier of the Amazon Connect instance.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The maximum number of contacts that can be in the queue before it is considered full.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-maxcontacts)
     *
     * @param maxContacts The maximum number of contacts that can be in the queue before it is
     *   considered full.
     */
    public fun maxContacts(maxContacts: Number) {
        cdkBuilder.maxContacts(maxContacts)
    }

    /**
     * The name of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-name)
     *
     * @param name The name of the queue.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     *
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    public fun outboundCallerConfig(outboundCallerConfig: IResolvable) {
        cdkBuilder.outboundCallerConfig(outboundCallerConfig)
    }

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     *
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    public fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty) {
        cdkBuilder.outboundCallerConfig(outboundCallerConfig)
    }

    /**
     * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
     * working the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-quickconnectarns)
     *
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     *   available to agents who are working the queue.
     */
    public fun quickConnectArns(vararg quickConnectArns: String) {
        _quickConnectArns.addAll(listOf(*quickConnectArns))
    }

    /**
     * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
     * working the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-quickconnectarns)
     *
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     *   available to agents who are working the queue.
     */
    public fun quickConnectArns(quickConnectArns: Collection<String>) {
        _quickConnectArns.addAll(quickConnectArns)
    }

    /**
     * The status of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-status)
     *
     * @param status The status of the queue.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnQueue {
        if (_quickConnectArns.isNotEmpty()) cdkBuilder.quickConnectArns(_quickConnectArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
