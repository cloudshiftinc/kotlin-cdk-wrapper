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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `ProcessingConfiguration` property configures data processing for an Amazon Kinesis Data
 * Firehose delivery stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * ProcessingConfigurationProperty processingConfigurationProperty =
 * ProcessingConfigurationProperty.builder()
 * .enabled(false)
 * .processors(List.of(ProcessorProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .parameters(List.of(ProcessorParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamProcessingConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.ProcessingConfigurationProperty.Builder =
        CfnDeliveryStream.ProcessingConfigurationProperty.builder()

    private val _processors: MutableList<Any> = mutableListOf()

    /** @param enabled Indicates whether data processing is enabled (true) or disabled (false). */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Indicates whether data processing is enabled (true) or disabled (false). */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param processors The data processors. */
    public fun processors(vararg processors: Any) {
        _processors.addAll(listOf(*processors))
    }

    /** @param processors The data processors. */
    public fun processors(processors: Collection<Any>) {
        _processors.addAll(processors)
    }

    /** @param processors The data processors. */
    public fun processors(processors: IResolvable) {
        cdkBuilder.processors(processors)
    }

    public fun build(): CfnDeliveryStream.ProcessingConfigurationProperty {
        if (_processors.isNotEmpty()) cdkBuilder.processors(_processors)
        return cdkBuilder.build()
    }
}
