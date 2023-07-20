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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisCascadingControlConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CascadingControlConfigurationProperty.Builder =
        CfnAnalysis.CascadingControlConfigurationProperty.builder()

    private val _sourceControls: MutableList<Any> = mutableListOf()

    public fun sourceControls(vararg sourceControls: Any) {
        _sourceControls.addAll(listOf(*sourceControls))
    }

    public fun sourceControls(sourceControls: Collection<Any>) {
        _sourceControls.addAll(sourceControls)
    }

    public fun sourceControls(sourceControls: IResolvable) {
        cdkBuilder.sourceControls(sourceControls)
    }

    public fun build(): CfnAnalysis.CascadingControlConfigurationProperty {
        if (_sourceControls.isNotEmpty()) cdkBuilder.sourceControls(_sourceControls)
        return cdkBuilder.build()
    }
}
