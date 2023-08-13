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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnDataset
import software.amazon.awscdk.services.personalize.CfnDatasetProps

/**
 * Properties for defining a `CfnDataset`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * Object dataSource;
 * CfnDatasetProps cfnDatasetProps = CfnDatasetProps.builder()
 * .datasetGroupArn("datasetGroupArn")
 * .datasetType("datasetType")
 * .name("name")
 * .schemaArn("schemaArn")
 * // the properties below are optional
 * .datasetImportJob(DatasetImportJobProperty.builder()
 * .datasetArn("datasetArn")
 * .datasetImportJobArn("datasetImportJobArn")
 * .dataSource(dataSource)
 * .jobName("jobName")
 * .roleArn("roleArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html)
 */
@CdkDslMarker
public class CfnDatasetPropsDsl {
    private val cdkBuilder: CfnDatasetProps.Builder = CfnDatasetProps.builder()

    /** @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group. */
    public fun datasetGroupArn(datasetGroupArn: String) {
        cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    /**
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     *   S3 bucket) to an Amazon Personalize dataset. If you specify a dataset import job as part of
     *   a dataset, all dataset import job fields are required.
     */
    public fun datasetImportJob(datasetImportJob: IResolvable) {
        cdkBuilder.datasetImportJob(datasetImportJob)
    }

    /**
     * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
     *   S3 bucket) to an Amazon Personalize dataset. If you specify a dataset import job as part of
     *   a dataset, all dataset import job fields are required.
     */
    public fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty) {
        cdkBuilder.datasetImportJob(datasetImportJob)
    }

    /**
     * @param datasetType One of the following values:.
     * * Interactions
     * * Items
     * * Users
     */
    public fun datasetType(datasetType: String) {
        cdkBuilder.datasetType(datasetType)
    }

    /** @param name The name of the dataset. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param schemaArn The ARN of the associated schema. */
    public fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): CfnDatasetProps = cdkBuilder.build()
}
