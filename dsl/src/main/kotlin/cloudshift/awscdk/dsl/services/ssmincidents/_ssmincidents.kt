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

package cloudshift.awscdk.dsl.services.ssmincidents

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps
import software.constructs.Construct

public object ssmincidents {
    /**
     * The `AWS::SSMIncidents::ReplicationSet` resource specifies a set of Regions that Incident
     * Manager data is replicated to and the KMS key used to encrypt the data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * CfnReplicationSet cfnReplicationSet = CfnReplicationSet.Builder.create(this,
     * "MyCfnReplicationSet")
     * .regions(List.of(ReplicationRegionProperty.builder()
     * .regionConfiguration(RegionConfigurationProperty.builder()
     * .sseKmsKeyId("sseKmsKeyId")
     * .build())
     * .regionName("regionName")
     * .build()))
     * // the properties below are optional
     * .deletionProtected(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html)
     */
    public inline fun cfnReplicationSet(
        scope: Construct,
        id: String,
        block: CfnReplicationSetDsl.() -> Unit = {},
    ): CfnReplicationSet {
        val builder = CfnReplicationSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReplicationSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * CfnReplicationSetProps cfnReplicationSetProps = CfnReplicationSetProps.builder()
     * .regions(List.of(ReplicationRegionProperty.builder()
     * .regionConfiguration(RegionConfigurationProperty.builder()
     * .sseKmsKeyId("sseKmsKeyId")
     * .build())
     * .regionName("regionName")
     * .build()))
     * // the properties below are optional
     * .deletionProtected(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html)
     */
    public inline fun cfnReplicationSetProps(
        block: CfnReplicationSetPropsDsl.() -> Unit = {}
    ): CfnReplicationSetProps {
        val builder = CfnReplicationSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `RegionConfiguration` property specifies the Region and KMS key to add to the replication
     * set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * RegionConfigurationProperty regionConfigurationProperty = RegionConfigurationProperty.builder()
     * .sseKmsKeyId("sseKmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-regionconfiguration.html)
     */
    public inline fun cfnReplicationSetRegionConfigurationProperty(
        block: CfnReplicationSetRegionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnReplicationSet.RegionConfigurationProperty {
        val builder = CfnReplicationSetRegionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ReplicationRegion` property type specifies the Region and KMS key to add to the
     * replication set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * ReplicationRegionProperty replicationRegionProperty = ReplicationRegionProperty.builder()
     * .regionConfiguration(RegionConfigurationProperty.builder()
     * .sseKmsKeyId("sseKmsKeyId")
     * .build())
     * .regionName("regionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-replicationset-replicationregion.html)
     */
    public inline fun cfnReplicationSetReplicationRegionProperty(
        block: CfnReplicationSetReplicationRegionPropertyDsl.() -> Unit = {}
    ): CfnReplicationSet.ReplicationRegionProperty {
        val builder = CfnReplicationSetReplicationRegionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SSMIncidents::ResponsePlan` resource specifies the details of the response plan
     * that are used when creating an incident.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * CfnResponsePlan cfnResponsePlan = CfnResponsePlan.Builder.create(this, "MyCfnResponsePlan")
     * .incidentTemplate(IncidentTemplateProperty.builder()
     * .impact(123)
     * .title("title")
     * // the properties below are optional
     * .dedupeString("dedupeString")
     * .incidentTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .notificationTargets(List.of(NotificationTargetItemProperty.builder()
     * .snsTopicArn("snsTopicArn")
     * .build()))
     * .summary("summary")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .actions(List.of(ActionProperty.builder()
     * .ssmAutomation(SsmAutomationProperty.builder()
     * .documentName("documentName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .documentVersion("documentVersion")
     * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
     * .key("key")
     * .value(DynamicSsmParameterValueProperty.builder()
     * .variable("variable")
     * .build())
     * .build()))
     * .parameters(List.of(SsmParameterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .targetAccount("targetAccount")
     * .build())
     * .build()))
     * .chatChannel(ChatChannelProperty.builder()
     * .chatbotSns(List.of("chatbotSns"))
     * .build())
     * .displayName("displayName")
     * .engagements(List.of("engagements"))
     * .integrations(List.of(IntegrationProperty.builder()
     * .pagerDutyConfiguration(PagerDutyConfigurationProperty.builder()
     * .name("name")
     * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
     * .serviceId("serviceId")
     * .build())
     * .secretId("secretId")
     * .build())
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html)
     */
    public inline fun cfnResponsePlan(
        scope: Construct,
        id: String,
        block: CfnResponsePlanDsl.() -> Unit = {},
    ): CfnResponsePlan {
        val builder = CfnResponsePlanDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Action` property type specifies the configuration to launch.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .ssmAutomation(SsmAutomationProperty.builder()
     * .documentName("documentName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .documentVersion("documentVersion")
     * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
     * .key("key")
     * .value(DynamicSsmParameterValueProperty.builder()
     * .variable("variable")
     * .build())
     * .build()))
     * .parameters(List.of(SsmParameterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .targetAccount("targetAccount")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-action.html)
     */
    public inline fun cfnResponsePlanActionProperty(
        block: CfnResponsePlanActionPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.ActionProperty {
        val builder = CfnResponsePlanActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS Chatbot chat channel used for collaboration during an incident.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * ChatChannelProperty chatChannelProperty = ChatChannelProperty.builder()
     * .chatbotSns(List.of("chatbotSns"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-chatchannel.html)
     */
    public inline fun cfnResponsePlanChatChannelProperty(
        block: CfnResponsePlanChatChannelPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.ChatChannelProperty {
        val builder = CfnResponsePlanChatChannelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * When you add a runbook to a response plan, you can specify the parameters the runbook should
     * use at runtime.
     *
     * Response plans support parameters with both static and dynamic values. For static values, you
     * enter the value when you define the parameter in the response plan. For dynamic values, the
     * system determines the correct parameter value by collecting information from the incident.
     * Incident Manager supports the following dynamic parameters:
     *
     * *Incident ARN*
     *
     * When Incident Manager creates an incident, the system captures the Amazon Resource Name (ARN)
     * of the corresponding incident record and enters it for this parameter in the runbook.
     *
     * This value can only be assigned to parameters of type `String` . If assigned to a parameter
     * of any other type, the runbook fails to run.
     *
     * *Involved resources*
     *
     * When Incident Manager creates an incident, the system captures the ARNs of the resources
     * involved in the incident. These resource ARNs are then assigned to this parameter in the
     * runbook.
     *
     * This value can only be assigned to parameters of type `StringList` . If assigned to a
     * parameter of any other type, the runbook fails to run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * DynamicSsmParameterProperty dynamicSsmParameterProperty = DynamicSsmParameterProperty.builder()
     * .key("key")
     * .value(DynamicSsmParameterValueProperty.builder()
     * .variable("variable")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparameter.html)
     */
    public inline fun cfnResponsePlanDynamicSsmParameterProperty(
        block: CfnResponsePlanDynamicSsmParameterPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.DynamicSsmParameterProperty {
        val builder = CfnResponsePlanDynamicSsmParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dynamic parameter value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * DynamicSsmParameterValueProperty dynamicSsmParameterValueProperty =
     * DynamicSsmParameterValueProperty.builder()
     * .variable("variable")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparametervalue.html)
     */
    public inline fun cfnResponsePlanDynamicSsmParameterValueProperty(
        block: CfnResponsePlanDynamicSsmParameterValuePropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.DynamicSsmParameterValueProperty {
        val builder = CfnResponsePlanDynamicSsmParameterValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `IncidentTemplate` property type specifies details used to create an incident when using
     * this response plan.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * IncidentTemplateProperty incidentTemplateProperty = IncidentTemplateProperty.builder()
     * .impact(123)
     * .title("title")
     * // the properties below are optional
     * .dedupeString("dedupeString")
     * .incidentTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .notificationTargets(List.of(NotificationTargetItemProperty.builder()
     * .snsTopicArn("snsTopicArn")
     * .build()))
     * .summary("summary")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-incidenttemplate.html)
     */
    public inline fun cfnResponsePlanIncidentTemplateProperty(
        block: CfnResponsePlanIncidentTemplatePropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.IncidentTemplateProperty {
        val builder = CfnResponsePlanIncidentTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about third-party services integrated into a response plan.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * IntegrationProperty integrationProperty = IntegrationProperty.builder()
     * .pagerDutyConfiguration(PagerDutyConfigurationProperty.builder()
     * .name("name")
     * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
     * .serviceId("serviceId")
     * .build())
     * .secretId("secretId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-integration.html)
     */
    public inline fun cfnResponsePlanIntegrationProperty(
        block: CfnResponsePlanIntegrationPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.IntegrationProperty {
        val builder = CfnResponsePlanIntegrationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The SNS topic that's used by AWS Chatbot to notify the incidents chat channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * NotificationTargetItemProperty notificationTargetItemProperty =
     * NotificationTargetItemProperty.builder()
     * .snsTopicArn("snsTopicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-notificationtargetitem.html)
     */
    public inline fun cfnResponsePlanNotificationTargetItemProperty(
        block: CfnResponsePlanNotificationTargetItemPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.NotificationTargetItemProperty {
        val builder = CfnResponsePlanNotificationTargetItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about the PagerDuty configuration for a response plan.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * PagerDutyConfigurationProperty pagerDutyConfigurationProperty =
     * PagerDutyConfigurationProperty.builder()
     * .name("name")
     * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
     * .serviceId("serviceId")
     * .build())
     * .secretId("secretId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyconfiguration.html)
     */
    public inline fun cfnResponsePlanPagerDutyConfigurationProperty(
        block: CfnResponsePlanPagerDutyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.PagerDutyConfigurationProperty {
        val builder = CfnResponsePlanPagerDutyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about the PagerDuty service where the response plan creates an incident.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * PagerDutyIncidentConfigurationProperty pagerDutyIncidentConfigurationProperty =
     * PagerDutyIncidentConfigurationProperty.builder()
     * .serviceId("serviceId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-pagerdutyincidentconfiguration.html)
     */
    public inline fun cfnResponsePlanPagerDutyIncidentConfigurationProperty(
        block: CfnResponsePlanPagerDutyIncidentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.PagerDutyIncidentConfigurationProperty {
        val builder = CfnResponsePlanPagerDutyIncidentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResponsePlan`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * CfnResponsePlanProps cfnResponsePlanProps = CfnResponsePlanProps.builder()
     * .incidentTemplate(IncidentTemplateProperty.builder()
     * .impact(123)
     * .title("title")
     * // the properties below are optional
     * .dedupeString("dedupeString")
     * .incidentTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .notificationTargets(List.of(NotificationTargetItemProperty.builder()
     * .snsTopicArn("snsTopicArn")
     * .build()))
     * .summary("summary")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .actions(List.of(ActionProperty.builder()
     * .ssmAutomation(SsmAutomationProperty.builder()
     * .documentName("documentName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .documentVersion("documentVersion")
     * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
     * .key("key")
     * .value(DynamicSsmParameterValueProperty.builder()
     * .variable("variable")
     * .build())
     * .build()))
     * .parameters(List.of(SsmParameterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .targetAccount("targetAccount")
     * .build())
     * .build()))
     * .chatChannel(ChatChannelProperty.builder()
     * .chatbotSns(List.of("chatbotSns"))
     * .build())
     * .displayName("displayName")
     * .engagements(List.of("engagements"))
     * .integrations(List.of(IntegrationProperty.builder()
     * .pagerDutyConfiguration(PagerDutyConfigurationProperty.builder()
     * .name("name")
     * .pagerDutyIncidentConfiguration(PagerDutyIncidentConfigurationProperty.builder()
     * .serviceId("serviceId")
     * .build())
     * .secretId("secretId")
     * .build())
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-responseplan.html)
     */
    public inline fun cfnResponsePlanProps(
        block: CfnResponsePlanPropsDsl.() -> Unit = {}
    ): CfnResponsePlanProps {
        val builder = CfnResponsePlanPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `SsmAutomation` property type specifies details about the Systems Manager automation
     * document that will be used as a runbook during an incident.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * SsmAutomationProperty ssmAutomationProperty = SsmAutomationProperty.builder()
     * .documentName("documentName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .documentVersion("documentVersion")
     * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
     * .key("key")
     * .value(DynamicSsmParameterValueProperty.builder()
     * .variable("variable")
     * .build())
     * .build()))
     * .parameters(List.of(SsmParameterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .targetAccount("targetAccount")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmautomation.html)
     */
    public inline fun cfnResponsePlanSsmAutomationProperty(
        block: CfnResponsePlanSsmAutomationPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.SsmAutomationProperty {
        val builder = CfnResponsePlanSsmAutomationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The key-value pair parameters to use when running the automation document.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ssmincidents.*;
     * SsmParameterProperty ssmParameterProperty = SsmParameterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-ssmparameter.html)
     */
    public inline fun cfnResponsePlanSsmParameterProperty(
        block: CfnResponsePlanSsmParameterPropertyDsl.() -> Unit = {}
    ): CfnResponsePlan.SsmParameterProperty {
        val builder = CfnResponsePlanSsmParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
