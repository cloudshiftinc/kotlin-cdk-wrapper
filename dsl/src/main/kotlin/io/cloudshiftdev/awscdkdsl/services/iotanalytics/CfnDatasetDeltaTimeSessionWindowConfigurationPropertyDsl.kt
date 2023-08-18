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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * A structure that contains the configuration information of a delta time session window.
 *
 * [`DeltaTime`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html)
 * specifies a time interval. You can use `DeltaTime` to create dataset contents with data that has
 * arrived in the data store since the last execution. For an example of `DeltaTime` , see
 * [Creating a SQL dataset with a delta window (CLI)](https://docs.aws.amazon.com/iotanalytics/latest/userguide/automate-create-dataset.html#automate-example6)
 * in the *AWS IoT Analytics User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * DeltaTimeSessionWindowConfigurationProperty deltaTimeSessionWindowConfigurationProperty =
 * DeltaTimeSessionWindowConfigurationProperty.builder()
 * .timeoutInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-deltatimesessionwindowconfiguration.html)
 */
@CdkDslMarker
public class CfnDatasetDeltaTimeSessionWindowConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.DeltaTimeSessionWindowConfigurationProperty.Builder =
        CfnDataset.DeltaTimeSessionWindowConfigurationProperty.builder()

    /**
     * @param timeoutInMinutes A time interval. You can use `timeoutInMinutes` so that AWS IoT
     *   Analytics can batch up late data notifications that have been generated since the last
     *   execution. AWS IoT Analytics sends one batch of notifications to Amazon CloudWatch Events
     *   at one time.
     *
     * For more information about how to write a timestamp expression, see
     * [Date and Time Functions and Operators](https://docs.aws.amazon.com/https://prestodb.io/docs/current/functions/datetime.html)
     * , in the *Presto 0.172 Documentation* .
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): CfnDataset.DeltaTimeSessionWindowConfigurationProperty = cdkBuilder.build()
}
