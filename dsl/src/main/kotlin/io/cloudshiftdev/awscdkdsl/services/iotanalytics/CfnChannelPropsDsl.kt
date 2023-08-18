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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import software.amazon.awscdk.services.iotanalytics.CfnChannelProps

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * Object serviceManagedS3;
 * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
 * .channelName("channelName")
 * .channelStorage(ChannelStorageProperty.builder()
 * .customerManagedS3(CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .serviceManagedS3(serviceManagedS3)
 * .build())
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-channel.html)
 */
@CdkDslMarker
public class CfnChannelPropsDsl {
    private val cdkBuilder: CfnChannelProps.Builder = CfnChannelProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param channelName The name of the channel. */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /** @param channelStorage Where channel data is stored. */
    public fun channelStorage(channelStorage: IResolvable) {
        cdkBuilder.channelStorage(channelStorage)
    }

    /** @param channelStorage Where channel data is stored. */
    public fun channelStorage(channelStorage: CfnChannel.ChannelStorageProperty) {
        cdkBuilder.channelStorage(channelStorage)
    }

    /** @param retentionPeriod How long, in days, message data is kept for the channel. */
    public fun retentionPeriod(retentionPeriod: IResolvable) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /** @param retentionPeriod How long, in days, message data is kept for the channel. */
    public fun retentionPeriod(retentionPeriod: CfnChannel.RetentionPeriodProperty) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * @param tags Metadata which can be used to manage the channel. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Metadata which can be used to manage the channel. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnChannelProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
