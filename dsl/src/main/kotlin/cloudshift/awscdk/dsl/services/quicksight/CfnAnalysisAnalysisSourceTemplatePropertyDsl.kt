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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisAnalysisSourceTemplatePropertyDsl {
    private val cdkBuilder: CfnAnalysis.AnalysisSourceTemplateProperty.Builder =
        CfnAnalysis.AnalysisSourceTemplateProperty.builder()

    private val _dataSetReferences: MutableList<Any> = mutableListOf()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun dataSetReferences(vararg dataSetReferences: Any) {
        _dataSetReferences.addAll(listOf(*dataSetReferences))
    }

    public fun dataSetReferences(dataSetReferences: Collection<Any>) {
        _dataSetReferences.addAll(dataSetReferences)
    }

    public fun dataSetReferences(dataSetReferences: IResolvable) {
        cdkBuilder.dataSetReferences(dataSetReferences)
    }

    public fun build(): CfnAnalysis.AnalysisSourceTemplateProperty {
        if (_dataSetReferences.isNotEmpty()) cdkBuilder.dataSetReferences(_dataSetReferences)
        return cdkBuilder.build()
    }
}
