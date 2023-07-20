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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetPathParameterPropertyDsl {
    private val cdkBuilder: CfnDataset.PathParameterProperty.Builder =
        CfnDataset.PathParameterProperty.builder()

    public fun datasetParameter(datasetParameter: IResolvable) {
        cdkBuilder.datasetParameter(datasetParameter)
    }

    public fun datasetParameter(datasetParameter: CfnDataset.DatasetParameterProperty) {
        cdkBuilder.datasetParameter(datasetParameter)
    }

    public fun pathParameterName(pathParameterName: String) {
        cdkBuilder.pathParameterName(pathParameterName)
    }

    public fun build(): CfnDataset.PathParameterProperty = cdkBuilder.build()
}
