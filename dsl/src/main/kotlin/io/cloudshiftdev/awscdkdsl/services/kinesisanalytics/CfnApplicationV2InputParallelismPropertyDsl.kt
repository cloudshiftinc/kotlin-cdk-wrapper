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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * For a SQL-based Managed Service for Apache Flink application, describes the number of
 * in-application streams to create for a given streaming source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * InputParallelismProperty inputParallelismProperty = InputParallelismProperty.builder()
 * .count(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputparallelism.html)
 */
@CdkDslMarker
public class CfnApplicationV2InputParallelismPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.InputParallelismProperty.Builder =
        CfnApplicationV2.InputParallelismProperty.builder()

    /** @param count The number of in-application streams to create. */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    public fun build(): CfnApplicationV2.InputParallelismProperty = cdkBuilder.build()
}
