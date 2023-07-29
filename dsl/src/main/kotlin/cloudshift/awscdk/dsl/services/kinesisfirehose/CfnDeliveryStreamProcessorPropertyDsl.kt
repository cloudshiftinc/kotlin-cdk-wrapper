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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `Processor` property specifies a data processor for an Amazon Kinesis Data Firehose delivery
 * stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * ProcessorProperty processorProperty = ProcessorProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .parameters(List.of(ProcessorParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processor.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamProcessorPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.ProcessorProperty.Builder =
        CfnDeliveryStream.ProcessorProperty.builder()

    private val _parameters: MutableList<Any> = mutableListOf()

    /** @param parameters The processor parameters. */
    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    /** @param parameters The processor parameters. */
    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    /** @param parameters The processor parameters. */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param type The type of processor. Valid values: `Lambda` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDeliveryStream.ProcessorProperty {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        return cdkBuilder.build()
    }
}
