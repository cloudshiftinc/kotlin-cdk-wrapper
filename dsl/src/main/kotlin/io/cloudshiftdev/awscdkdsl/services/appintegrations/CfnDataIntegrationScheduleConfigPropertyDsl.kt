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

package io.cloudshiftdev.awscdkdsl.services.appintegrations

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration

/**
 * The name of the data and how often it should be pulled from the source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appintegrations.*;
 * ScheduleConfigProperty scheduleConfigProperty = ScheduleConfigProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .firstExecutionFrom("firstExecutionFrom")
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-scheduleconfig.html)
 */
@CdkDslMarker
public class CfnDataIntegrationScheduleConfigPropertyDsl {
    private val cdkBuilder: CfnDataIntegration.ScheduleConfigProperty.Builder =
        CfnDataIntegration.ScheduleConfigProperty.builder()

    /**
     * @param firstExecutionFrom The start date for objects to import in the first flow run as an
     *   Unix/epoch timestamp in milliseconds or in ISO-8601 format.
     */
    public fun firstExecutionFrom(firstExecutionFrom: String) {
        cdkBuilder.firstExecutionFrom(firstExecutionFrom)
    }

    /** @param object The name of the object to pull from the data source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    /** @param scheduleExpression How often the data should be pulled from data source. */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun build(): CfnDataIntegration.ScheduleConfigProperty = cdkBuilder.build()
}
