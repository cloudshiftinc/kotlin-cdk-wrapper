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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFunctionKinesisEventPropertyDsl {
    private val cdkBuilder: CfnFunction.KinesisEventProperty.Builder =
        CfnFunction.KinesisEventProperty.builder()

    private val _functionResponseTypes: MutableList<String> = mutableListOf()

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun functionResponseTypes(vararg functionResponseTypes: String) {
        _functionResponseTypes.addAll(listOf(*functionResponseTypes))
    }

    public fun functionResponseTypes(functionResponseTypes: Collection<String>) {
        _functionResponseTypes.addAll(functionResponseTypes)
    }

    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun stream(stream: String) {
        cdkBuilder.stream(stream)
    }

    public fun build(): CfnFunction.KinesisEventProperty {
        if (_functionResponseTypes.isNotEmpty()) cdkBuilder.functionResponseTypes(_functionResponseTypes)
        return cdkBuilder.build()
    }
}
