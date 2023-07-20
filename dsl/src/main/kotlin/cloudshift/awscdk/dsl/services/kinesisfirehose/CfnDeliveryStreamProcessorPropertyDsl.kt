@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeliveryStreamProcessorPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.ProcessorProperty.Builder =
        CfnDeliveryStream.ProcessorProperty.builder()

    private val _parameters: MutableList<Any> = mutableListOf()

    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDeliveryStream.ProcessorProperty {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        return cdkBuilder.build()
    }
}
