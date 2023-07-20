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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnDataset
import software.amazon.awscdk.services.personalize.CfnDatasetProps
import kotlin.String

@CdkDslMarker
public class CfnDatasetPropsDsl {
    private val cdkBuilder: CfnDatasetProps.Builder = CfnDatasetProps.builder()

    public fun datasetGroupArn(datasetGroupArn: String) {
        cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    public fun datasetImportJob(datasetImportJob: IResolvable) {
        cdkBuilder.datasetImportJob(datasetImportJob)
    }

    public fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty) {
        cdkBuilder.datasetImportJob(datasetImportJob)
    }

    public fun datasetType(datasetType: String) {
        cdkBuilder.datasetType(datasetType)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): CfnDatasetProps = cdkBuilder.build()
}
