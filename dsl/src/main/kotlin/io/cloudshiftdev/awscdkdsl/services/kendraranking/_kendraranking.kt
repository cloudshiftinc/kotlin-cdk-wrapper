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

package io.cloudshiftdev.awscdkdsl.services.kendraranking

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps
import software.constructs.Construct

public object kendraranking {
    /**
     * Creates a rescore execution plan.
     *
     * A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for
     * provisioning the `Rescore` API. You set the number of capacity units that you require for
     * Amazon Kendra Intelligent Ranking to rescore or re-rank a search service's results.
     *
     * For an example of using the `CreateRescoreExecutionPlan` API, including using the Python and
     * Java SDKs, see
     * [Semantically ranking a search service's results](https://docs.aws.amazon.com/kendra/latest/dg/search-service-rerank.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendraranking.*;
     * CfnExecutionPlan cfnExecutionPlan = CfnExecutionPlan.Builder.create(this, "MyCfnExecutionPlan")
     * .name("name")
     * // the properties below are optional
     * .capacityUnits(CapacityUnitsConfigurationProperty.builder()
     * .rescoreCapacityUnits(123)
     * .build())
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html)
     */
    public inline fun cfnExecutionPlan(
        scope: Construct,
        id: String,
        block: CfnExecutionPlanDsl.() -> Unit = {},
    ): CfnExecutionPlan {
        val builder = CfnExecutionPlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Sets additional capacity units configured for your rescore execution plan.
     *
     * A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for
     * provisioning the `Rescore` API. You can add and remove capacity units to fit your usage
     * requirements.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendraranking.*;
     * CapacityUnitsConfigurationProperty capacityUnitsConfigurationProperty =
     * CapacityUnitsConfigurationProperty.builder()
     * .rescoreCapacityUnits(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendraranking-executionplan-capacityunitsconfiguration.html)
     */
    public inline fun cfnExecutionPlanCapacityUnitsConfigurationProperty(
        block: CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnExecutionPlan.CapacityUnitsConfigurationProperty {
        val builder = CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnExecutionPlan`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kendraranking.*;
     * CfnExecutionPlanProps cfnExecutionPlanProps = CfnExecutionPlanProps.builder()
     * .name("name")
     * // the properties below are optional
     * .capacityUnits(CapacityUnitsConfigurationProperty.builder()
     * .rescoreCapacityUnits(123)
     * .build())
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendraranking-executionplan.html)
     */
    public inline fun cfnExecutionPlanProps(
        block: CfnExecutionPlanPropsDsl.() -> Unit = {}
    ): CfnExecutionPlanProps {
        val builder = CfnExecutionPlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
