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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.personalize.CfnDataset
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnDatasetDatasetImportJobPropertyDsl {
    private val cdkBuilder: CfnDataset.DatasetImportJobProperty.Builder =
        CfnDataset.DatasetImportJobProperty.builder()

    public fun dataSource(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.dataSource(builder.map)
    }

    public fun dataSource(dataSource: Any) {
        cdkBuilder.dataSource(dataSource)
    }

    public fun datasetArn(datasetArn: String) {
        cdkBuilder.datasetArn(datasetArn)
    }

    public fun datasetImportJobArn(datasetImportJobArn: String) {
        cdkBuilder.datasetImportJobArn(datasetImportJobArn)
    }

    public fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDataset.DatasetImportJobProperty = cdkBuilder.build()
}
