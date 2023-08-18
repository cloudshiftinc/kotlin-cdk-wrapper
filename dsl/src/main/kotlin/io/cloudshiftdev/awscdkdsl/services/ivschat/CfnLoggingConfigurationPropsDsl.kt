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

package io.cloudshiftdev.awscdkdsl.services.ivschat

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps

/**
 * Properties for defining a `CfnLoggingConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivschat.*;
 * CfnLoggingConfigurationProps cfnLoggingConfigurationProps =
 * CfnLoggingConfigurationProps.builder()
 * .destinationConfiguration(DestinationConfigurationProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .firehose(FirehoseDestinationConfigurationProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * .build())
 * .s3(S3DestinationConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationPropsDsl {
    private val cdkBuilder: CfnLoggingConfigurationProps.Builder =
        CfnLoggingConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     *   information about where chat content will be logged.
     */
    public fun destinationConfiguration(destinationConfiguration: IResolvable) {
        cdkBuilder.destinationConfiguration(destinationConfiguration)
    }

    /**
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     *   information about where chat content will be logged.
     */
    public fun destinationConfiguration(
        destinationConfiguration: CfnLoggingConfiguration.DestinationConfigurationProperty
    ) {
        cdkBuilder.destinationConfiguration(destinationConfiguration)
    }

    /** @param name Logging-configuration name. The value does not need to be unique. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLoggingConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
