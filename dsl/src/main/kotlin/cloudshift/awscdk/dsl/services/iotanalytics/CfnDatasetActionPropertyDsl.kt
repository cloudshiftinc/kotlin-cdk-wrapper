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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * Information needed to run the "containerAction" to produce data set contents.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .actionName("actionName")
 * // the properties below are optional
 * .containerAction(ContainerActionProperty.builder()
 * .executionRoleArn("executionRoleArn")
 * .image("image")
 * .resourceConfiguration(ResourceConfigurationProperty.builder()
 * .computeType("computeType")
 * .volumeSizeInGb(123)
 * .build())
 * // the properties below are optional
 * .variables(List.of(VariableProperty.builder()
 * .variableName("variableName")
 * // the properties below are optional
 * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
 * .datasetName("datasetName")
 * .build())
 * .doubleValue(123)
 * .outputFileUriValue(OutputFileUriValueProperty.builder()
 * .fileName("fileName")
 * .build())
 * .stringValue("stringValue")
 * .build()))
 * .build())
 * .queryAction(QueryActionProperty.builder()
 * .sqlQuery("sqlQuery")
 * // the properties below are optional
 * .filters(List.of(FilterProperty.builder()
 * .deltaTime(DeltaTimeProperty.builder()
 * .offsetSeconds(123)
 * .timeExpression("timeExpression")
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-action.html)
 */
@CdkDslMarker
public class CfnDatasetActionPropertyDsl {
    private val cdkBuilder: CfnDataset.ActionProperty.Builder = CfnDataset.ActionProperty.builder()

    /**
     * @param actionName The name of the data set action by which data set contents are
     *   automatically created.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param containerAction Information which allows the system to run a containerized application
     *   in order to create the data set contents. The application must be in a Docker container
     *   along with any needed support libraries.
     */
    public fun containerAction(containerAction: IResolvable) {
        cdkBuilder.containerAction(containerAction)
    }

    /**
     * @param containerAction Information which allows the system to run a containerized application
     *   in order to create the data set contents. The application must be in a Docker container
     *   along with any needed support libraries.
     */
    public fun containerAction(containerAction: CfnDataset.ContainerActionProperty) {
        cdkBuilder.containerAction(containerAction)
    }

    /**
     * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to automatically
     *   create data set contents.
     */
    public fun queryAction(queryAction: IResolvable) {
        cdkBuilder.queryAction(queryAction)
    }

    /**
     * @param queryAction An "SqlQueryDatasetAction" object that uses an SQL query to automatically
     *   create data set contents.
     */
    public fun queryAction(queryAction: CfnDataset.QueryActionProperty) {
        cdkBuilder.queryAction(queryAction)
    }

    public fun build(): CfnDataset.ActionProperty = cdkBuilder.build()
}
