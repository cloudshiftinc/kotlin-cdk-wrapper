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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import software.amazon.awscdk.services.medialive.CfnChannelProps

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-channel.html)
 */
@CdkDslMarker
public class CfnChannelPropsDsl {
    private val cdkBuilder: CfnChannelProps.Builder = CfnChannelProps.builder()

    private val _destinations: MutableList<Any> = mutableListOf()

    private val _inputAttachments: MutableList<Any> = mutableListOf()

    /** @param cdiInputSpecification Specification of CDI inputs for this channel. */
    public fun cdiInputSpecification(cdiInputSpecification: IResolvable) {
        cdkBuilder.cdiInputSpecification(cdiInputSpecification)
    }

    /** @param cdiInputSpecification Specification of CDI inputs for this channel. */
    public fun cdiInputSpecification(
        cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty
    ) {
        cdkBuilder.cdiInputSpecification(cdiInputSpecification)
    }

    /**
     * @param channelClass The class for this channel. For a channel with two pipelines, the class
     *   is STANDARD. For a channel with one pipeline, the class is SINGLE_PIPELINE.
     */
    public fun channelClass(channelClass: String) {
        cdkBuilder.channelClass(channelClass)
    }

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     *   MediaLive output package.
     */
    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     *   MediaLive output package.
     */
    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    /**
     * @param destinations The settings that identify the destination for the outputs in this
     *   MediaLive output package.
     */
    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    /** @param encoderSettings The encoding configuration for the output content. */
    public fun encoderSettings(encoderSettings: IResolvable) {
        cdkBuilder.encoderSettings(encoderSettings)
    }

    /** @param encoderSettings The encoding configuration for the output content. */
    public fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty) {
        cdkBuilder.encoderSettings(encoderSettings)
    }

    /** @param inputAttachments The list of input attachments for the channel. */
    public fun inputAttachments(vararg inputAttachments: Any) {
        _inputAttachments.addAll(listOf(*inputAttachments))
    }

    /** @param inputAttachments The list of input attachments for the channel. */
    public fun inputAttachments(inputAttachments: Collection<Any>) {
        _inputAttachments.addAll(inputAttachments)
    }

    /** @param inputAttachments The list of input attachments for the channel. */
    public fun inputAttachments(inputAttachments: IResolvable) {
        cdkBuilder.inputAttachments(inputAttachments)
    }

    /**
     * @param inputSpecification The input specification for this channel. It specifies the key
     *   characteristics of the inputs for this channel: the maximum bitrate, the resolution, and
     *   the codec.
     */
    public fun inputSpecification(inputSpecification: IResolvable) {
        cdkBuilder.inputSpecification(inputSpecification)
    }

    /**
     * @param inputSpecification The input specification for this channel. It specifies the key
     *   characteristics of the inputs for this channel: the maximum bitrate, the resolution, and
     *   the codec.
     */
    public fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty) {
        cdkBuilder.inputSpecification(inputSpecification)
    }

    /**
     * @param logLevel The verbosity for logging activity for this channel. Charges for logging
     *   (which are generated through Amazon CloudWatch Logging) are higher for higher verbosities.
     */
    public fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
    }

    /** @param maintenance Maintenance settings for this channel. */
    public fun maintenance(maintenance: IResolvable) {
        cdkBuilder.maintenance(maintenance)
    }

    /** @param maintenance Maintenance settings for this channel. */
    public fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty) {
        cdkBuilder.maintenance(maintenance)
    }

    /**
     * @param name A name for this audio selector. The AudioDescription (in an output) references
     *   this name in order to identify a specific input audio to include in that output.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param roleArn The IAM role for MediaLive to assume when running this channel. The role is
     *   identified by its ARN.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param tags A collection of tags for this channel. Each tag is a key-value pair. */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /** @param tags A collection of tags for this channel. Each tag is a key-value pair. */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
     *   are in your VPC.
     */
    public fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpc Settings to enable VPC mode in the channel, so that the endpoints for all outputs
     *   are in your VPC.
     */
    public fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): CfnChannelProps {
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        if (_inputAttachments.isNotEmpty()) cdkBuilder.inputAttachments(_inputAttachments)
        return cdkBuilder.build()
    }
}
