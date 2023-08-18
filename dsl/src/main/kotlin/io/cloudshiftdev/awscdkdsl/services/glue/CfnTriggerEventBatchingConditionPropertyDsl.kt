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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.glue.CfnTrigger

/**
 * Batch condition that must be met (specified number of events received or batch time window
 * expired) before EventBridge event trigger fires.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * EventBatchingConditionProperty eventBatchingConditionProperty =
 * EventBatchingConditionProperty.builder()
 * .batchSize(123)
 * // the properties below are optional
 * .batchWindow(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-eventbatchingcondition.html)
 */
@CdkDslMarker
public class CfnTriggerEventBatchingConditionPropertyDsl {
    private val cdkBuilder: CfnTrigger.EventBatchingConditionProperty.Builder =
        CfnTrigger.EventBatchingConditionProperty.builder()

    /**
     * @param batchSize Number of events that must be received from Amazon EventBridge before
     *   EventBridge event trigger fires.
     */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param batchWindow Window of time in seconds after which EventBridge event trigger fires.
     *   Window starts when first event is received.
     */
    public fun batchWindow(batchWindow: Number) {
        cdkBuilder.batchWindow(batchWindow)
    }

    public fun build(): CfnTrigger.EventBatchingConditionProperty = cdkBuilder.build()
}
