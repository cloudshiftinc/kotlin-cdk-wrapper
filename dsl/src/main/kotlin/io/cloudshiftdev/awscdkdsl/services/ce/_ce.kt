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

package io.cloudshiftdev.awscdkdsl.services.ce

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalyMonitor
import software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps
import software.amazon.awscdk.services.ce.CfnAnomalySubscription
import software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps
import software.amazon.awscdk.services.ce.CfnCostCategory
import software.amazon.awscdk.services.ce.CfnCostCategoryProps
import software.constructs.Construct

public object ce {
    /**
     * The `AWS::CE::AnomalyMonitor` resource is a Cost Explorer resource type that continuously
     * inspects your account's cost data for anomalies, based on `MonitorType` and
     * `MonitorSpecification` .
     *
     * The content consists of detailed metadata and the current status of the monitor object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * CfnAnomalyMonitor cfnAnomalyMonitor = CfnAnomalyMonitor.Builder.create(this,
     * "MyCfnAnomalyMonitor")
     * .monitorName("monitorName")
     * .monitorType("monitorType")
     * // the properties below are optional
     * .monitorDimension("monitorDimension")
     * .monitorSpecification("monitorSpecification")
     * .resourceTags(List.of(ResourceTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html)
     */
    public inline fun cfnAnomalyMonitor(
        scope: Construct,
        id: String,
        block: CfnAnomalyMonitorDsl.() -> Unit = {},
    ): CfnAnomalyMonitor {
        val builder = CfnAnomalyMonitorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAnomalyMonitor`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * CfnAnomalyMonitorProps cfnAnomalyMonitorProps = CfnAnomalyMonitorProps.builder()
     * .monitorName("monitorName")
     * .monitorType("monitorType")
     * // the properties below are optional
     * .monitorDimension("monitorDimension")
     * .monitorSpecification("monitorSpecification")
     * .resourceTags(List.of(ResourceTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html)
     */
    public inline fun cfnAnomalyMonitorProps(
        block: CfnAnomalyMonitorPropsDsl.() -> Unit = {}
    ): CfnAnomalyMonitorProps {
        val builder = CfnAnomalyMonitorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The tag structure that contains a tag key and value.
     *
     * Tagging is supported only for the following Cost Explorer resource types:
     * [`AnomalyMonitor`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_AnomalyMonitor.html)
     * ,
     * [`AnomalySubscription`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_AnomalySubscription.html)
     * ,
     * [`CostCategory`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategory.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalymonitor-resourcetag.html)
     */
    public inline fun cfnAnomalyMonitorResourceTagProperty(
        block: CfnAnomalyMonitorResourceTagPropertyDsl.() -> Unit = {}
    ): CfnAnomalyMonitor.ResourceTagProperty {
        val builder = CfnAnomalyMonitorResourceTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CE::AnomalySubscription` resource (also referred to as an alert subscription) is a
     * Cost Explorer resource type that sends notifications about specific anomalies that meet an
     * alerting criteria defined by you.
     *
     * You can specify the frequency of the alerts and the subscribers to notify.
     *
     * Anomaly subscriptions can be associated with one or more
     * [`AWS::CE::AnomalyMonitor`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalymonitor.html)
     * resources, and they only send notifications about anomalies detected by those associated
     * monitors. You can also configure a threshold to further control which anomalies are included
     * in the notifications.
     *
     * Anomalies that don’t exceed the chosen threshold and therefore don’t trigger notifications
     * from an anomaly subscription will still be available on the console and from the
     * [`GetAnomalies`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetAnomalies.html)
     * API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * CfnAnomalySubscription cfnAnomalySubscription = CfnAnomalySubscription.Builder.create(this,
     * "MyCfnAnomalySubscription")
     * .frequency("frequency")
     * .monitorArnList(List.of("monitorArnList"))
     * .subscribers(List.of(SubscriberProperty.builder()
     * .address("address")
     * .type("type")
     * // the properties below are optional
     * .status("status")
     * .build()))
     * .subscriptionName("subscriptionName")
     * // the properties below are optional
     * .resourceTags(List.of(ResourceTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .threshold(123)
     * .thresholdExpression("thresholdExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html)
     */
    public inline fun cfnAnomalySubscription(
        scope: Construct,
        id: String,
        block: CfnAnomalySubscriptionDsl.() -> Unit = {},
    ): CfnAnomalySubscription {
        val builder = CfnAnomalySubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAnomalySubscription`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * CfnAnomalySubscriptionProps cfnAnomalySubscriptionProps = CfnAnomalySubscriptionProps.builder()
     * .frequency("frequency")
     * .monitorArnList(List.of("monitorArnList"))
     * .subscribers(List.of(SubscriberProperty.builder()
     * .address("address")
     * .type("type")
     * // the properties below are optional
     * .status("status")
     * .build()))
     * .subscriptionName("subscriptionName")
     * // the properties below are optional
     * .resourceTags(List.of(ResourceTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .threshold(123)
     * .thresholdExpression("thresholdExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-anomalysubscription.html)
     */
    public inline fun cfnAnomalySubscriptionProps(
        block: CfnAnomalySubscriptionPropsDsl.() -> Unit = {}
    ): CfnAnomalySubscriptionProps {
        val builder = CfnAnomalySubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The tag structure that contains a tag key and value.
     *
     * Tagging is supported only for the following Cost Explorer resource types:
     * [`AnomalyMonitor`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_AnomalyMonitor.html)
     * ,
     * [`AnomalySubscription`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_AnomalySubscription.html)
     * ,
     * [`CostCategory`](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_CostCategory.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-resourcetag.html)
     */
    public inline fun cfnAnomalySubscriptionResourceTagProperty(
        block: CfnAnomalySubscriptionResourceTagPropertyDsl.() -> Unit = {}
    ): CfnAnomalySubscription.ResourceTagProperty {
        val builder = CfnAnomalySubscriptionResourceTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The recipient of `AnomalySubscription` notifications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * SubscriberProperty subscriberProperty = SubscriberProperty.builder()
     * .address("address")
     * .type("type")
     * // the properties below are optional
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ce-anomalysubscription-subscriber.html)
     */
    public inline fun cfnAnomalySubscriptionSubscriberProperty(
        block: CfnAnomalySubscriptionSubscriberPropertyDsl.() -> Unit = {}
    ): CfnAnomalySubscription.SubscriberProperty {
        val builder = CfnAnomalySubscriptionSubscriberPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CE::CostCategory` resource creates groupings of cost that you can use across
     * products in the AWS Billing and Cost Management console, such as Cost Explorer and AWS
     * Budgets.
     *
     * For more information, see
     * [Managing Your Costs with Cost Categories](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/manage-cost-categories.html)
     * in the *AWS Billing and Cost Management User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * CfnCostCategory cfnCostCategory = CfnCostCategory.Builder.create(this, "MyCfnCostCategory")
     * .name("name")
     * .rules("rules")
     * .ruleVersion("ruleVersion")
     * // the properties below are optional
     * .defaultValue("defaultValue")
     * .splitChargeRules("splitChargeRules")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html)
     */
    public inline fun cfnCostCategory(
        scope: Construct,
        id: String,
        block: CfnCostCategoryDsl.() -> Unit = {},
    ): CfnCostCategory {
        val builder = CfnCostCategoryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCostCategory`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ce.*;
     * CfnCostCategoryProps cfnCostCategoryProps = CfnCostCategoryProps.builder()
     * .name("name")
     * .rules("rules")
     * .ruleVersion("ruleVersion")
     * // the properties below are optional
     * .defaultValue("defaultValue")
     * .splitChargeRules("splitChargeRules")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html)
     */
    public inline fun cfnCostCategoryProps(
        block: CfnCostCategoryPropsDsl.() -> Unit = {}
    ): CfnCostCategoryProps {
        val builder = CfnCostCategoryPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
