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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationV2SqlApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.SqlApplicationConfigurationProperty.Builder =
        CfnApplicationV2.SqlApplicationConfigurationProperty.builder()

    private val _inputs: MutableList<Any> = mutableListOf()

    public fun inputs(vararg inputs: Any) {
        _inputs.addAll(listOf(*inputs))
    }

    public fun inputs(inputs: Collection<Any>) {
        _inputs.addAll(inputs)
    }

    public fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs)
    }

    public fun build(): CfnApplicationV2.SqlApplicationConfigurationProperty {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        return cdkBuilder.build()
    }
}
