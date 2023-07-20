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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    private val _inputs: MutableList<Any> = mutableListOf()

    public fun applicationCode(applicationCode: String) {
        cdkBuilder.applicationCode(applicationCode)
    }

    public fun applicationDescription(applicationDescription: String) {
        cdkBuilder.applicationDescription(applicationDescription)
    }

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun inputs(vararg inputs: Any) {
        _inputs.addAll(listOf(*inputs))
    }

    public fun inputs(inputs: Collection<Any>) {
        _inputs.addAll(inputs)
    }

    public fun inputs(inputs: IResolvable) {
        cdkBuilder.inputs(inputs)
    }

    public fun build(): CfnApplicationProps {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        return cdkBuilder.build()
    }
}
