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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters for Amazon RDS.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RdsParametersProperty rdsParametersProperty = RdsParametersProperty.builder()
 * .database("database")
 * .instanceId("instanceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-rdsparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceRdsParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.RdsParametersProperty.Builder =
        CfnDataSource.RdsParametersProperty.builder()

    /** @param database Database. */
    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    /** @param instanceId Instance ID. */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun build(): CfnDataSource.RdsParametersProperty = cdkBuilder.build()
}
