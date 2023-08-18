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

package io.cloudshiftdev.awscdkdsl.services.applicationinsights

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application SubComponentTypeConfiguration` property type specifies
 * the sub-component configurations for a component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * SubComponentTypeConfigurationProperty subComponentTypeConfigurationProperty =
 * SubComponentTypeConfigurationProperty.builder()
 * .subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .logs(List.of(LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build()))
 * .windowsEvents(List.of(WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build()))
 * .build())
 * .subComponentType("subComponentType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponenttypeconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationSubComponentTypeConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.SubComponentTypeConfigurationProperty.Builder =
        CfnApplication.SubComponentTypeConfigurationProperty.builder()

    /** @param subComponentConfigurationDetails The configuration settings of the sub-components. */
    public fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails)
    }

    /** @param subComponentConfigurationDetails The configuration settings of the sub-components. */
    public fun subComponentConfigurationDetails(
        subComponentConfigurationDetails: CfnApplication.SubComponentConfigurationDetailsProperty
    ) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails)
    }

    /** @param subComponentType The sub-component type. */
    public fun subComponentType(subComponentType: String) {
        cdkBuilder.subComponentType(subComponentType)
    }

    public fun build(): CfnApplication.SubComponentTypeConfigurationProperty = cdkBuilder.build()
}
