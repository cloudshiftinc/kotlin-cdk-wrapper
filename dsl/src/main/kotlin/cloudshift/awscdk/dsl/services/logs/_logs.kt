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

package cloudshift.awscdk.dsl.services.logs

import software.amazon.awscdk.services.logs.CfnDestination
import software.amazon.awscdk.services.logs.CfnDestinationProps
import software.amazon.awscdk.services.logs.CfnLogGroup
import software.amazon.awscdk.services.logs.CfnLogGroupProps
import software.amazon.awscdk.services.logs.CfnLogStream
import software.amazon.awscdk.services.logs.CfnLogStreamProps
import software.amazon.awscdk.services.logs.CfnMetricFilter
import software.amazon.awscdk.services.logs.CfnMetricFilterProps
import software.amazon.awscdk.services.logs.CfnQueryDefinition
import software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
import software.amazon.awscdk.services.logs.CfnResourcePolicy
import software.amazon.awscdk.services.logs.CfnResourcePolicyProps
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps
import software.amazon.awscdk.services.logs.ColumnRestriction
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.amazon.awscdk.services.logs.CrossAccountDestinationProps
import software.amazon.awscdk.services.logs.DataProtectionPolicy
import software.amazon.awscdk.services.logs.DataProtectionPolicyConfig
import software.amazon.awscdk.services.logs.DataProtectionPolicyProps
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.LogGroupProps
import software.amazon.awscdk.services.logs.LogRetention
import software.amazon.awscdk.services.logs.LogRetentionProps
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions
import software.amazon.awscdk.services.logs.LogStream
import software.amazon.awscdk.services.logs.LogStreamProps
import software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig
import software.amazon.awscdk.services.logs.MetricFilter
import software.amazon.awscdk.services.logs.MetricFilterOptions
import software.amazon.awscdk.services.logs.MetricFilterProps
import software.amazon.awscdk.services.logs.QueryDefinition
import software.amazon.awscdk.services.logs.QueryDefinitionProps
import software.amazon.awscdk.services.logs.QueryString
import software.amazon.awscdk.services.logs.QueryStringProps
import software.amazon.awscdk.services.logs.ResourcePolicy
import software.amazon.awscdk.services.logs.ResourcePolicyProps
import software.amazon.awscdk.services.logs.StreamOptions
import software.amazon.awscdk.services.logs.SubscriptionFilter
import software.amazon.awscdk.services.logs.SubscriptionFilterOptions
import software.amazon.awscdk.services.logs.SubscriptionFilterProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object logs {
    public inline fun cfnDestination(
        scope: Construct,
        id: String,
        block: CfnDestinationDsl.() -> Unit = {},
    ): CfnDestination {
        val builder = CfnDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDestinationProps(block: CfnDestinationPropsDsl.() -> Unit = {}): CfnDestinationProps {
        val builder = CfnDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLogGroup(
        scope: Construct,
        id: String,
        block: CfnLogGroupDsl.() -> Unit = {},
    ): CfnLogGroup {
        val builder = CfnLogGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLogGroupProps(block: CfnLogGroupPropsDsl.() -> Unit = {}): CfnLogGroupProps {
        val builder = CfnLogGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLogStream(
        scope: Construct,
        id: String,
        block: CfnLogStreamDsl.() -> Unit = {},
    ): CfnLogStream {
        val builder = CfnLogStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLogStreamProps(block: CfnLogStreamPropsDsl.() -> Unit = {}): CfnLogStreamProps {
        val builder = CfnLogStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMetricFilter(
        scope: Construct,
        id: String,
        block: CfnMetricFilterDsl.() -> Unit = {},
    ): CfnMetricFilter {
        val builder = CfnMetricFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMetricFilterDimensionProperty(
        block: CfnMetricFilterDimensionPropertyDsl.() -> Unit =
            {},
    ): CfnMetricFilter.DimensionProperty {
        val builder = CfnMetricFilterDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMetricFilterMetricTransformationProperty(
        block: CfnMetricFilterMetricTransformationPropertyDsl.() -> Unit =
            {},
    ): CfnMetricFilter.MetricTransformationProperty {
        val builder = CfnMetricFilterMetricTransformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMetricFilterProps(block: CfnMetricFilterPropsDsl.() -> Unit = {}): CfnMetricFilterProps {
        val builder = CfnMetricFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQueryDefinition(
        scope: Construct,
        id: String,
        block: CfnQueryDefinitionDsl.() -> Unit = {},
    ): CfnQueryDefinition {
        val builder = CfnQueryDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQueryDefinitionProps(block: CfnQueryDefinitionPropsDsl.() -> Unit = {}): CfnQueryDefinitionProps {
        val builder = CfnQueryDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourcePolicy(
        scope: Construct,
        id: String,
        block: CfnResourcePolicyDsl.() -> Unit = {},
    ): CfnResourcePolicy {
        val builder = CfnResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSubscriptionFilter(
        scope: Construct,
        id: String,
        block: CfnSubscriptionFilterDsl.() -> Unit = {},
    ): CfnSubscriptionFilter {
        val builder = CfnSubscriptionFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSubscriptionFilterProps(
        block: CfnSubscriptionFilterPropsDsl.() -> Unit =
            {},
    ): CfnSubscriptionFilterProps {
        val builder = CfnSubscriptionFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun columnRestriction(block: ColumnRestrictionDsl.() -> Unit = {}): ColumnRestriction {
        val builder = ColumnRestrictionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun crossAccountDestination(
        scope: Construct,
        id: String,
        block: CrossAccountDestinationDsl.() -> Unit = {},
    ): CrossAccountDestination {
        val builder = CrossAccountDestinationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun crossAccountDestinationProps(
        block: CrossAccountDestinationPropsDsl.() -> Unit =
            {},
    ): CrossAccountDestinationProps {
        val builder = CrossAccountDestinationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dataProtectionPolicy(block: DataProtectionPolicyDsl.() -> Unit = {}): DataProtectionPolicy {
        val builder = DataProtectionPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dataProtectionPolicyConfig(
        block: DataProtectionPolicyConfigDsl.() -> Unit =
            {},
    ): DataProtectionPolicyConfig {
        val builder = DataProtectionPolicyConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dataProtectionPolicyProps(block: DataProtectionPolicyPropsDsl.() -> Unit = {}): DataProtectionPolicyProps {
        val builder = DataProtectionPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun logGroup(
        scope: Construct,
        id: String,
        block: LogGroupDsl.() -> Unit = {},
    ): LogGroup {
        val builder = LogGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun logGroupProps(block: LogGroupPropsDsl.() -> Unit = {}): LogGroupProps {
        val builder = LogGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun logRetention(
        scope: Construct,
        id: String,
        block: LogRetentionDsl.() -> Unit = {},
    ): LogRetention {
        val builder = LogRetentionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun logRetentionProps(block: LogRetentionPropsDsl.() -> Unit = {}): LogRetentionProps {
        val builder = LogRetentionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun logRetentionRetryOptions(block: LogRetentionRetryOptionsDsl.() -> Unit = {}): LogRetentionRetryOptions {
        val builder = LogRetentionRetryOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun logStream(
        scope: Construct,
        id: String,
        block: LogStreamDsl.() -> Unit = {},
    ): LogStream {
        val builder = LogStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun logStreamProps(block: LogStreamPropsDsl.() -> Unit = {}): LogStreamProps {
        val builder = LogStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun logSubscriptionDestinationConfig(
        block: LogSubscriptionDestinationConfigDsl.() -> Unit =
            {},
    ): LogSubscriptionDestinationConfig {
        val builder = LogSubscriptionDestinationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun metricFilter(
        scope: Construct,
        id: String,
        block: MetricFilterDsl.() -> Unit = {},
    ): MetricFilter {
        val builder = MetricFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun metricFilterOptions(block: MetricFilterOptionsDsl.() -> Unit = {}): MetricFilterOptions {
        val builder = MetricFilterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun metricFilterProps(block: MetricFilterPropsDsl.() -> Unit = {}): MetricFilterProps {
        val builder = MetricFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun queryDefinition(
        scope: Construct,
        id: String,
        block: QueryDefinitionDsl.() -> Unit = {},
    ): QueryDefinition {
        val builder = QueryDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun queryDefinitionProps(block: QueryDefinitionPropsDsl.() -> Unit = {}): QueryDefinitionProps {
        val builder = QueryDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun queryString(block: QueryStringDsl.() -> Unit = {}): QueryString {
        val builder = QueryStringDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun queryStringProps(block: QueryStringPropsDsl.() -> Unit = {}): QueryStringProps {
        val builder = QueryStringPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun resourcePolicy(
        scope: Construct,
        id: String,
        block: ResourcePolicyDsl.() -> Unit = {},
    ): ResourcePolicy {
        val builder = ResourcePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun resourcePolicyProps(block: ResourcePolicyPropsDsl.() -> Unit = {}): ResourcePolicyProps {
        val builder = ResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun streamOptions(block: StreamOptionsDsl.() -> Unit = {}): StreamOptions {
        val builder = StreamOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun subscriptionFilter(
        scope: Construct,
        id: String,
        block: SubscriptionFilterDsl.() -> Unit = {},
    ): SubscriptionFilter {
        val builder = SubscriptionFilterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun subscriptionFilterOptions(block: SubscriptionFilterOptionsDsl.() -> Unit = {}): SubscriptionFilterOptions {
        val builder = SubscriptionFilterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun subscriptionFilterProps(block: SubscriptionFilterPropsDsl.() -> Unit = {}): SubscriptionFilterProps {
        val builder = SubscriptionFilterPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
