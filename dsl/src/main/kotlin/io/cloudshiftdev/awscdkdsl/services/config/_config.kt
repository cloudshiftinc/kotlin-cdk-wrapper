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

package io.cloudshiftdev.awscdkdsl.services.config

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.amazon.awscdk.services.config.CfnAggregationAuthorization
import software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigRuleProps
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps
import software.amazon.awscdk.services.config.CfnConformancePack
import software.amazon.awscdk.services.config.CfnConformancePackProps
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnDeliveryChannelProps
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack
import software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CfnRemediationConfigurationProps
import software.amazon.awscdk.services.config.CfnStoredQuery
import software.amazon.awscdk.services.config.CfnStoredQueryProps
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
import software.amazon.awscdk.services.config.CustomPolicy
import software.amazon.awscdk.services.config.CustomPolicyProps
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.CustomRuleProps
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.config.ManagedRuleProps
import software.amazon.awscdk.services.config.RuleProps
import software.constructs.Construct

public object config {
    /**
     * Checks whether the active access keys are rotated within the number of days specified in
     * `maxAge`.
     *
     * Example:
     * ```
     * // compliant if access keys have been rotated within the last 90 days
     * // compliant if access keys have been rotated within the last 90 days
     * new AccessKeysRotated(this, "AccessKeyRotated");
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html)
     */
    public inline fun accessKeysRotated(
        scope: Construct,
        id: String,
        block: AccessKeysRotatedDsl.() -> Unit = {},
    ): AccessKeysRotated {
        val builder = AccessKeysRotatedDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a AccessKeysRotated.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.config.*;
     * Object inputParameters;
     * RuleScope ruleScope;
     * AccessKeysRotatedProps accessKeysRotatedProps = AccessKeysRotatedProps.builder()
     * .configRuleName("configRuleName")
     * .description("description")
     * .inputParameters(Map.of(
     * "inputParametersKey", inputParameters))
     * .maxAge(Duration.minutes(30))
     * .maximumExecutionFrequency(MaximumExecutionFrequency.ONE_HOUR)
     * .ruleScope(ruleScope)
     * .build();
     * ```
     */
    public inline fun accessKeysRotatedProps(
        block: AccessKeysRotatedPropsDsl.() -> Unit = {}
    ): AccessKeysRotatedProps {
        val builder = AccessKeysRotatedPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents the authorizations granted to aggregator accounts and regions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnAggregationAuthorization cfnAggregationAuthorization =
     * CfnAggregationAuthorization.Builder.create(this, "MyCfnAggregationAuthorization")
     * .authorizedAccountId("authorizedAccountId")
     * .authorizedAwsRegion("authorizedAwsRegion")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html)
     */
    public inline fun cfnAggregationAuthorization(
        scope: Construct,
        id: String,
        block: CfnAggregationAuthorizationDsl.() -> Unit = {},
    ): CfnAggregationAuthorization {
        val builder = CfnAggregationAuthorizationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAggregationAuthorization`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnAggregationAuthorizationProps cfnAggregationAuthorizationProps =
     * CfnAggregationAuthorizationProps.builder()
     * .authorizedAccountId("authorizedAccountId")
     * .authorizedAwsRegion("authorizedAwsRegion")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html)
     */
    public inline fun cfnAggregationAuthorizationProps(
        block: CfnAggregationAuthorizationPropsDsl.() -> Unit = {}
    ): CfnAggregationAuthorizationProps {
        val builder = CfnAggregationAuthorizationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * You must first create and start the AWS Config configuration recorder in order to create AWS
     * Config managed rules with AWS CloudFormation .
     *
     * For more information, see
     * [Managing the Configuration Recorder](https://docs.aws.amazon.com/config/latest/developerguide/stop-start-recorder.html)
     * .
     *
     * Adds or updates an AWS Config rule to evaluate if your AWS resources comply with your desired
     * configurations. For information on how many AWS Config rules you can have per account, see
     * [*Service Limits*](https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html)
     * in the *AWS Config Developer Guide* .
     *
     * There are two types of rules: *AWS Config Managed Rules* and *AWS Config Custom Rules* . You
     * can use the `ConfigRule` resource to create both AWS Config Managed Rules and AWS Config
     * Custom Rules.
     *
     * AWS Config Managed Rules are predefined, customizable rules created by AWS Config . For a
     * list of managed rules, see
     * [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
     * . If you are adding an AWS Config managed rule, you must specify the rule's identifier for
     * the `SourceIdentifier` key.
     *
     * AWS Config Custom Rules are rules that you create from scratch. There are two ways to create
     * AWS Config custom rules: with Lambda functions (
     * [AWS Lambda Developer Guide](https://docs.aws.amazon.com/config/latest/developerguide/gettingstarted-concepts.html#gettingstarted-concepts-function)
     * ) and with Guard (
     * [Guard GitHub Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
     * ), a policy-as-code language. AWS Config custom rules created with AWS Lambda are called *AWS
     * Config Custom Lambda Rules* and AWS Config custom rules created with Guard are called *AWS
     * Config Custom Policy Rules* .
     *
     * If you are adding a new AWS Config Custom Lambda rule, you first need to create an AWS Lambda
     * function that the rule invokes to evaluate your resources. When you use the `ConfigRule`
     * resource to add a Custom Lambda rule to AWS Config , you must specify the Amazon Resource
     * Name (ARN) that AWS Lambda assigns to the function. You specify the ARN in the
     * `SourceIdentifier` key. This key is part of the `Source` object, which is part of the
     * `ConfigRule` object.
     *
     * For any new AWS Config rule that you add, specify the `ConfigRuleName` in the `ConfigRule`
     * object. Do not specify the `ConfigRuleArn` or the `ConfigRuleId` . These values are generated
     * by AWS Config for new rules.
     *
     * If you are updating a rule that you added previously, you can specify the rule by
     * `ConfigRuleName` , `ConfigRuleId` , or `ConfigRuleArn` in the `ConfigRule` data type that you
     * use in this request.
     *
     * For more information about developing and using AWS Config rules, see
     * [Evaluating Resources with AWS Config Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html)
     * in the *AWS Config Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * Object inputParameters;
     * CfnConfigRule cfnConfigRule = CfnConfigRule.Builder.create(this, "MyCfnConfigRule")
     * .source(SourceProperty.builder()
     * .owner("owner")
     * // the properties below are optional
     * .customPolicyDetails(CustomPolicyDetailsProperty.builder()
     * .enableDebugLogDelivery(false)
     * .policyRuntime("policyRuntime")
     * .policyText("policyText")
     * .build())
     * .sourceDetails(List.of(SourceDetailProperty.builder()
     * .eventSource("eventSource")
     * .messageType("messageType")
     * // the properties below are optional
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .build()))
     * .sourceIdentifier("sourceIdentifier")
     * .build())
     * // the properties below are optional
     * .compliance(ComplianceProperty.builder()
     * .type("type")
     * .build())
     * .configRuleName("configRuleName")
     * .description("description")
     * .evaluationModes(List.of(EvaluationModeConfigurationProperty.builder()
     * .mode("mode")
     * .build()))
     * .inputParameters(inputParameters)
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .scope(ScopeProperty.builder()
     * .complianceResourceId("complianceResourceId")
     * .complianceResourceTypes(List.of("complianceResourceTypes"))
     * .tagKey("tagKey")
     * .tagValue("tagValue")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html)
     */
    public inline fun cfnConfigRule(
        scope: Construct,
        id: String,
        block: CfnConfigRuleDsl.() -> Unit = {},
    ): CfnConfigRule {
        val builder = CfnConfigRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Compliance details of the Config rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * ComplianceProperty complianceProperty = ComplianceProperty.builder()
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-compliance.html)
     */
    public inline fun cfnConfigRuleComplianceProperty(
        block: CfnConfigRuleCompliancePropertyDsl.() -> Unit = {}
    ): CfnConfigRule.ComplianceProperty {
        val builder = CfnConfigRuleCompliancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the runtime system, policy definition, and whether debug logging enabled.
     *
     * You can specify the following CustomPolicyDetails parameter values only for AWS Config Custom
     * Policy rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CustomPolicyDetailsProperty customPolicyDetailsProperty = CustomPolicyDetailsProperty.builder()
     * .enableDebugLogDelivery(false)
     * .policyRuntime("policyRuntime")
     * .policyText("policyText")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-custompolicydetails.html)
     */
    public inline fun cfnConfigRuleCustomPolicyDetailsProperty(
        block: CfnConfigRuleCustomPolicyDetailsPropertyDsl.() -> Unit = {}
    ): CfnConfigRule.CustomPolicyDetailsProperty {
        val builder = CfnConfigRuleCustomPolicyDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Evaluation mode for the AWS Config rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * EvaluationModeConfigurationProperty evaluationModeConfigurationProperty =
     * EvaluationModeConfigurationProperty.builder()
     * .mode("mode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-evaluationmodeconfiguration.html)
     */
    public inline fun cfnConfigRuleEvaluationModeConfigurationProperty(
        block: CfnConfigRuleEvaluationModeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnConfigRule.EvaluationModeConfigurationProperty {
        val builder = CfnConfigRuleEvaluationModeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfigRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * Object inputParameters;
     * CfnConfigRuleProps cfnConfigRuleProps = CfnConfigRuleProps.builder()
     * .source(SourceProperty.builder()
     * .owner("owner")
     * // the properties below are optional
     * .customPolicyDetails(CustomPolicyDetailsProperty.builder()
     * .enableDebugLogDelivery(false)
     * .policyRuntime("policyRuntime")
     * .policyText("policyText")
     * .build())
     * .sourceDetails(List.of(SourceDetailProperty.builder()
     * .eventSource("eventSource")
     * .messageType("messageType")
     * // the properties below are optional
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .build()))
     * .sourceIdentifier("sourceIdentifier")
     * .build())
     * // the properties below are optional
     * .compliance(ComplianceProperty.builder()
     * .type("type")
     * .build())
     * .configRuleName("configRuleName")
     * .description("description")
     * .evaluationModes(List.of(EvaluationModeConfigurationProperty.builder()
     * .mode("mode")
     * .build()))
     * .inputParameters(inputParameters)
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .scope(ScopeProperty.builder()
     * .complianceResourceId("complianceResourceId")
     * .complianceResourceTypes(List.of("complianceResourceTypes"))
     * .tagKey("tagKey")
     * .tagValue("tagValue")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html)
     */
    public inline fun cfnConfigRuleProps(
        block: CfnConfigRulePropsDsl.() -> Unit = {}
    ): CfnConfigRuleProps {
        val builder = CfnConfigRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * The scope can include one or more resource types, a combination of a tag key and value, or a
     * combination of one resource type and one resource ID. Specify a scope to constrain which
     * resources trigger an evaluation for a rule. Otherwise, evaluations for the rule are triggered
     * when any resource in your recording group changes in configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * ScopeProperty scopeProperty = ScopeProperty.builder()
     * .complianceResourceId("complianceResourceId")
     * .complianceResourceTypes(List.of("complianceResourceTypes"))
     * .tagKey("tagKey")
     * .tagValue("tagValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-scope.html)
     */
    public inline fun cfnConfigRuleScopeProperty(
        block: CfnConfigRuleScopePropertyDsl.() -> Unit = {}
    ): CfnConfigRule.ScopeProperty {
        val builder = CfnConfigRuleScopePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the source and the message types that trigger AWS Config to evaluate your AWS
     * resources against a rule.
     *
     * It also provides the frequency with which you want AWS Config to run evaluations for the rule
     * if the trigger type is periodic. You can specify the parameter values for `SourceDetail` only
     * for custom rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * SourceDetailProperty sourceDetailProperty = SourceDetailProperty.builder()
     * .eventSource("eventSource")
     * .messageType("messageType")
     * // the properties below are optional
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-sourcedetail.html)
     */
    public inline fun cfnConfigRuleSourceDetailProperty(
        block: CfnConfigRuleSourceDetailPropertyDsl.() -> Unit = {}
    ): CfnConfigRule.SourceDetailProperty {
        val builder = CfnConfigRuleSourceDetailPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the CustomPolicyDetails, the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY`
     * for Custom Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier,
     * and the events that cause the evaluation of your AWS resources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * SourceProperty sourceProperty = SourceProperty.builder()
     * .owner("owner")
     * // the properties below are optional
     * .customPolicyDetails(CustomPolicyDetailsProperty.builder()
     * .enableDebugLogDelivery(false)
     * .policyRuntime("policyRuntime")
     * .policyText("policyText")
     * .build())
     * .sourceDetails(List.of(SourceDetailProperty.builder()
     * .eventSource("eventSource")
     * .messageType("messageType")
     * // the properties below are optional
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .build()))
     * .sourceIdentifier("sourceIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source.html)
     */
    public inline fun cfnConfigRuleSourceProperty(
        block: CfnConfigRuleSourcePropertyDsl.() -> Unit = {}
    ): CfnConfigRule.SourceProperty {
        val builder = CfnConfigRuleSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details about the configuration aggregator, including information about source accounts,
     * regions, and metadata of the aggregator.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnConfigurationAggregator cfnConfigurationAggregator =
     * CfnConfigurationAggregator.Builder.create(this, "MyCfnConfigurationAggregator")
     * .accountAggregationSources(List.of(AccountAggregationSourceProperty.builder()
     * .accountIds(List.of("accountIds"))
     * // the properties below are optional
     * .allAwsRegions(false)
     * .awsRegions(List.of("awsRegions"))
     * .build()))
     * .configurationAggregatorName("configurationAggregatorName")
     * .organizationAggregationSource(OrganizationAggregationSourceProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .allAwsRegions(false)
     * .awsRegions(List.of("awsRegions"))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html)
     */
    public inline fun cfnConfigurationAggregator(
        scope: Construct,
        id: String,
        block: CfnConfigurationAggregatorDsl.() -> Unit = {},
    ): CfnConfigurationAggregator {
        val builder = CfnConfigurationAggregatorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A collection of accounts and regions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * AccountAggregationSourceProperty accountAggregationSourceProperty =
     * AccountAggregationSourceProperty.builder()
     * .accountIds(List.of("accountIds"))
     * // the properties below are optional
     * .allAwsRegions(false)
     * .awsRegions(List.of("awsRegions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html)
     */
    public inline fun cfnConfigurationAggregatorAccountAggregationSourceProperty(
        block: CfnConfigurationAggregatorAccountAggregationSourcePropertyDsl.() -> Unit = {}
    ): CfnConfigurationAggregator.AccountAggregationSourceProperty {
        val builder = CfnConfigurationAggregatorAccountAggregationSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This object contains regions to set up the aggregator and an IAM role to retrieve
     * organization details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * OrganizationAggregationSourceProperty organizationAggregationSourceProperty =
     * OrganizationAggregationSourceProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .allAwsRegions(false)
     * .awsRegions(List.of("awsRegions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html)
     */
    public inline fun cfnConfigurationAggregatorOrganizationAggregationSourceProperty(
        block: CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl.() -> Unit = {}
    ): CfnConfigurationAggregator.OrganizationAggregationSourceProperty {
        val builder = CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfigurationAggregator`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnConfigurationAggregatorProps cfnConfigurationAggregatorProps =
     * CfnConfigurationAggregatorProps.builder()
     * .accountAggregationSources(List.of(AccountAggregationSourceProperty.builder()
     * .accountIds(List.of("accountIds"))
     * // the properties below are optional
     * .allAwsRegions(false)
     * .awsRegions(List.of("awsRegions"))
     * .build()))
     * .configurationAggregatorName("configurationAggregatorName")
     * .organizationAggregationSource(OrganizationAggregationSourceProperty.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .allAwsRegions(false)
     * .awsRegions(List.of("awsRegions"))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html)
     */
    public inline fun cfnConfigurationAggregatorProps(
        block: CfnConfigurationAggregatorPropsDsl.() -> Unit = {}
    ): CfnConfigurationAggregatorProps {
        val builder = CfnConfigurationAggregatorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Config::ConfigurationRecorder resource describes the AWS resource types for which
     * AWS Config records configuration changes.
     *
     * The configuration recorder stores the configurations of the supported resources in your
     * account as configuration items.
     *
     * To enable AWS Config , you must create a configuration recorder and a delivery channel. AWS
     * Config uses the delivery channel to deliver the configuration changes to your Amazon S3
     * bucket or Amazon SNS topic. For more information, see
     * [AWS::Config::DeliveryChannel](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
     * .
     *
     * AWS CloudFormation starts the recorder as soon as the delivery channel is available.
     *
     * To stop the recorder and delete it, delete the configuration recorder from your stack. To
     * stop the recorder without deleting it, call the
     * [StopConfigurationRecorder](https://docs.aws.amazon.com/config/latest/APIReference/API_StopConfigurationRecorder.html)
     * action of the AWS Config API directly.
     *
     * For more information, see
     * [Configuration Recorder](https://docs.aws.amazon.com/config/latest/developerguide/config-concepts.html#config-recorder)
     * in the AWS Config Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnConfigurationRecorder cfnConfigurationRecorder =
     * CfnConfigurationRecorder.Builder.create(this, "MyCfnConfigurationRecorder")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .name("name")
     * .recordingGroup(RecordingGroupProperty.builder()
     * .allSupported(false)
     * .includeGlobalResourceTypes(false)
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
     */
    public inline fun cfnConfigurationRecorder(
        scope: Construct,
        id: String,
        block: CfnConfigurationRecorderDsl.() -> Unit = {},
    ): CfnConfigurationRecorder {
        val builder = CfnConfigurationRecorderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfigurationRecorder`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnConfigurationRecorderProps cfnConfigurationRecorderProps =
     * CfnConfigurationRecorderProps.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .name("name")
     * .recordingGroup(RecordingGroupProperty.builder()
     * .allSupported(false)
     * .includeGlobalResourceTypes(false)
     * .resourceTypes(List.of("resourceTypes"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
     */
    public inline fun cfnConfigurationRecorderProps(
        block: CfnConfigurationRecorderPropsDsl.() -> Unit = {}
    ): CfnConfigurationRecorderProps {
        val builder = CfnConfigurationRecorderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies which resource types AWS Config records for configuration changes.
     *
     * In the recording group, you specify whether you want to record all supported resource types
     * or to include or exclude specific types of resources.
     *
     * By default, AWS Config records configuration changes for all supported types of *Regional
     * resources* that AWS Config discovers in the AWS Region in which it is running. Regional
     * resources are tied to a Region and can be used only in that Region. Examples of Regional
     * resources are Amazon EC2 instances and Amazon EBS volumes.
     *
     * You can also have AWS Config record supported types of *globally recorded resources* .
     * Globally recorded resource types are not tied to a specific Region and can be used in all
     * Regions. The globally recorded resource types that AWS Config supports are IAM users, groups,
     * roles, and customer managed policies. These resource types are recorded in all enabled AWS
     * Config regions where AWS Config was available before February 2022 (which excludes Asia
     * Pacific (Hyderabad), Asia Pacific (Melbourne), Europe (Spain), Europe (Zurich), Israel (Tel
     * Aviv), and Middle East (UAE)). AWS Config also supports some global resources types for
     * Amazon Elastic Container Registry Public, AWS Global Accelerator , and Amazon Route 53;
     * however, these resource types are not globally recorded in all enabled AWS Config regions.
     *
     * Global resource types onboarded to AWS Config recording after February 2022 will be recorded
     * only in the service's home Region for the commercial partition and AWS GovCloud (US-West) for
     * the AWS GovCloud (US) partition. You can view the Configuration Items for these new global
     * resource types only in their home Region and AWS GovCloud (US-West).
     *
     * If you don't want AWS Config to record all resources, you can specify which types of
     * resources AWS Config records with the `resourceTypes` parameter.
     *
     * For a list of supported resource types, see
     * [Supported Resource Types](https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources)
     * in the *AWS Config developer guide* .
     *
     * For more information and a table of the Home Regions for Global Resource Types Onboarded
     * after February 2022, see
     * [Selecting Which Resources AWS Config Records](https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html)
     * in the *AWS Config developer guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * RecordingGroupProperty recordingGroupProperty = RecordingGroupProperty.builder()
     * .allSupported(false)
     * .includeGlobalResourceTypes(false)
     * .resourceTypes(List.of("resourceTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html)
     */
    public inline fun cfnConfigurationRecorderRecordingGroupProperty(
        block: CfnConfigurationRecorderRecordingGroupPropertyDsl.() -> Unit = {}
    ): CfnConfigurationRecorder.RecordingGroupProperty {
        val builder = CfnConfigurationRecorderRecordingGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A conformance pack is a collection of AWS Config rules and remediation actions that can be
     * easily deployed in an account and a region.
     *
     * ConformancePack creates a service linked role in your account. The service linked role is
     * created only when the role does not exist in your account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * Object templateSsmDocumentDetails;
     * CfnConformancePack cfnConformancePack = CfnConformancePack.Builder.create(this,
     * "MyCfnConformancePack")
     * .conformancePackName("conformancePackName")
     * // the properties below are optional
     * .conformancePackInputParameters(List.of(ConformancePackInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .deliveryS3Bucket("deliveryS3Bucket")
     * .deliveryS3KeyPrefix("deliveryS3KeyPrefix")
     * .templateBody("templateBody")
     * .templateS3Uri("templateS3Uri")
     * .templateSsmDocumentDetails(templateSsmDocumentDetails)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html)
     */
    public inline fun cfnConformancePack(
        scope: Construct,
        id: String,
        block: CfnConformancePackDsl.() -> Unit = {},
    ): CfnConformancePack {
        val builder = CfnConformancePackDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input parameters in the form of key-value pairs for the conformance pack, both of which you
     * define.
     *
     * Keys can have a maximum character length of 255 characters, and values can have a maximum
     * length of 4096 characters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * ConformancePackInputParameterProperty conformancePackInputParameterProperty =
     * ConformancePackInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html)
     */
    public inline fun cfnConformancePackConformancePackInputParameterProperty(
        block: CfnConformancePackConformancePackInputParameterPropertyDsl.() -> Unit = {}
    ): CfnConformancePack.ConformancePackInputParameterProperty {
        val builder = CfnConformancePackConformancePackInputParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConformancePack`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * Object templateSsmDocumentDetails;
     * CfnConformancePackProps cfnConformancePackProps = CfnConformancePackProps.builder()
     * .conformancePackName("conformancePackName")
     * // the properties below are optional
     * .conformancePackInputParameters(List.of(ConformancePackInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .deliveryS3Bucket("deliveryS3Bucket")
     * .deliveryS3KeyPrefix("deliveryS3KeyPrefix")
     * .templateBody("templateBody")
     * .templateS3Uri("templateS3Uri")
     * .templateSsmDocumentDetails(templateSsmDocumentDetails)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html)
     */
    public inline fun cfnConformancePackProps(
        block: CfnConformancePackPropsDsl.() -> Unit = {}
    ): CfnConformancePackProps {
        val builder = CfnConformancePackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This API allows you to create a conformance pack template with an AWS Systems Manager
     * document (SSM document).
     *
     * To deploy a conformance pack using an SSM document, first create an SSM document with
     * conformance pack content, and then provide the `DocumentName` in the
     * [PutConformancePack API](https://docs.aws.amazon.com/config/latest/APIReference/API_PutConformancePack.html)
     * . You can also provide the `DocumentVersion` .
     *
     * The `TemplateSSMDocumentDetails` object contains the name of the SSM document and the version
     * of the SSM document.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * TemplateSSMDocumentDetailsProperty templateSSMDocumentDetailsProperty =
     * TemplateSSMDocumentDetailsProperty.builder()
     * .documentName("documentName")
     * .documentVersion("documentVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-templatessmdocumentdetails.html)
     */
    public inline fun cfnConformancePackTemplateSSMDocumentDetailsProperty(
        block: CfnConformancePackTemplateSSMDocumentDetailsPropertyDsl.() -> Unit = {}
    ): CfnConformancePack.TemplateSSMDocumentDetailsProperty {
        val builder = CfnConformancePackTemplateSSMDocumentDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a delivery channel object to deliver configuration information to an Amazon S3
     * bucket and Amazon SNS topic.
     *
     * Before you can create a delivery channel, you must create a configuration recorder. You can
     * use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing
     * delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and
     * specify the changed values for the S3 bucket and the SNS topic. If you specify a different
     * value for either the S3 bucket or the SNS topic, this action will keep the existing value for
     * the parameter that is not changed.
     *
     * In the China (Beijing) Region, when you call this action, the Amazon S3 bucket must also be
     * in the China (Beijing) Region. In all the other regions, AWS Config supports cross-region and
     * cross-account delivery channels.
     *
     * You can have only one delivery channel per region per AWS account, and the delivery channel
     * is required to use AWS Config .
     *
     * AWS Config does not support the delivery channel to an Amazon S3 bucket bucket where object
     * lock is enabled. For more information, see
     * [How S3 Object Lock works](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html)
     * .
     *
     * When you create the delivery channel, you can specify; how often AWS Config delivers
     * configuration snapshots to your Amazon S3 bucket (for example, 24 hours), the S3 bucket to
     * which AWS Config sends configuration snapshots and configuration history files, and the
     * Amazon SNS topic to which AWS Config sends notifications about configuration changes, such as
     * updated resources, AWS Config rule evaluations, and when AWS Config delivers the
     * configuration snapshot to your S3 bucket. For more information, see
     * [Deliver Configuration Items](https://docs.aws.amazon.com/config/latest/developerguide/how-does-config-work.html#delivery-channel)
     * in the AWS Config Developer Guide.
     *
     * To enable AWS Config , you must create a configuration recorder and a delivery channel. If
     * you want to create the resources separately, you must create a configuration recorder before
     * you can create a delivery channel. AWS Config uses the configuration recorder to capture
     * configuration changes to your resources. For more information, see
     * [AWS::Config::ConfigurationRecorder](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html)
     * .
     *
     * For more information, see
     * [Managing the Delivery Channel](https://docs.aws.amazon.com/config/latest/developerguide/manage-delivery-channel.html)
     * in the AWS Config Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnDeliveryChannel cfnDeliveryChannel = CfnDeliveryChannel.Builder.create(this,
     * "MyCfnDeliveryChannel")
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .configSnapshotDeliveryProperties(ConfigSnapshotDeliveryPropertiesProperty.builder()
     * .deliveryFrequency("deliveryFrequency")
     * .build())
     * .name("name")
     * .s3KeyPrefix("s3KeyPrefix")
     * .s3KmsKeyArn("s3KmsKeyArn")
     * .snsTopicArn("snsTopicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
     */
    public inline fun cfnDeliveryChannel(
        scope: Construct,
        id: String,
        block: CfnDeliveryChannelDsl.() -> Unit = {},
    ): CfnDeliveryChannel {
        val builder = CfnDeliveryChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides options for how often AWS Config delivers configuration snapshots to the Amazon S3
     * bucket in your delivery channel.
     *
     * If you want to create a rule that triggers evaluations for your resources when AWS Config
     * delivers the configuration snapshot, see the following:
     *
     * The frequency for a rule that triggers evaluations for your resources when AWS Config
     * delivers the configuration snapshot is set by one of two values, depending on which is less
     * frequent:
     * * The value for the `deliveryFrequency` parameter within the delivery channel configuration,
     *   which sets how often AWS Config delivers configuration snapshots. This value also sets how
     *   often AWS Config invokes evaluations for AWS Config rules.
     * * The value for the `MaximumExecutionFrequency` parameter, which sets the maximum frequency
     *   with which AWS Config invokes evaluations for the rule. For more information, see
     *   [ConfigRule](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigRule.html) .
     *
     * If the `deliveryFrequency` value is less frequent than the `MaximumExecutionFrequency` value
     * for a rule, AWS Config invokes the rule only as often as the `deliveryFrequency` value.
     * * For example, you want your rule to run evaluations when AWS Config delivers the
     *   configuration snapshot.
     * * You specify the `MaximumExecutionFrequency` value for `Six_Hours` .
     * * You then specify the delivery channel `deliveryFrequency` value for `TwentyFour_Hours` .
     * * Because the value for `deliveryFrequency` is less frequent than `MaximumExecutionFrequency`
     *   , AWS Config invokes evaluations for the rule every 24 hours.
     *
     * You should set the `MaximumExecutionFrequency` value to be at least as frequent as the
     * `deliveryFrequency` value. You can view the `deliveryFrequency` value by using the
     * `DescribeDeliveryChannnels` action.
     *
     * To update the `deliveryFrequency` with which AWS Config delivers your configuration
     * snapshots, use the `PutDeliveryChannel` action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * ConfigSnapshotDeliveryPropertiesProperty configSnapshotDeliveryPropertiesProperty =
     * ConfigSnapshotDeliveryPropertiesProperty.builder()
     * .deliveryFrequency("deliveryFrequency")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html)
     */
    public inline fun cfnDeliveryChannelConfigSnapshotDeliveryPropertiesProperty(
        block: CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl.() -> Unit = {}
    ): CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty {
        val builder = CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeliveryChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnDeliveryChannelProps cfnDeliveryChannelProps = CfnDeliveryChannelProps.builder()
     * .s3BucketName("s3BucketName")
     * // the properties below are optional
     * .configSnapshotDeliveryProperties(ConfigSnapshotDeliveryPropertiesProperty.builder()
     * .deliveryFrequency("deliveryFrequency")
     * .build())
     * .name("name")
     * .s3KeyPrefix("s3KeyPrefix")
     * .s3KmsKeyArn("s3KmsKeyArn")
     * .snsTopicArn("snsTopicArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-deliverychannel.html)
     */
    public inline fun cfnDeliveryChannelProps(
        block: CfnDeliveryChannelPropsDsl.() -> Unit = {}
    ): CfnDeliveryChannelProps {
        val builder = CfnDeliveryChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds or updates an AWS Config rule for your entire organization to evaluate if your AWS
     * resources comply with your desired configurations.
     *
     * For information on how many organization AWS Config rules you can have per account, see
     * [*Service Limits*](https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html)
     * in the *AWS Config Developer Guide* .
     *
     * Only a management account and a delegated administrator can create or update an organization
     * AWS Config rule. When calling the `OrganizationConfigRule` resource with a delegated
     * administrator, you must ensure AWS Organizations `ListDelegatedAdministrator` permissions are
     * added. An organization can have up to 3 delegated administrators.
     *
     * The `OrganizationConfigRule` resource enables organization service access through the
     * `EnableAWSServiceAccess` action and creates a service-linked role
     * `AWSServiceRoleForConfigMultiAccountSetup` in the management or delegated administrator
     * account of your organization. The service-linked role is created only when the role does not
     * exist in the caller account. AWS Config verifies the existence of role with `GetRole` action.
     *
     * To use the `OrganizationConfigRule` resource with delegated administrator, register a
     * delegated administrator by calling AWS Organization `register-delegated-administrator` for
     * `config-multiaccountsetup.amazonaws.com` .
     *
     * There are two types of rules: *AWS Config Managed Rules* and *AWS Config Custom Rules* . You
     * can use `PutOrganizationConfigRule` to create both AWS Config Managed Rules and AWS Config
     * Custom Rules.
     *
     * AWS Config Managed Rules are predefined, customizable rules created by AWS Config . For a
     * list of managed rules, see
     * [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
     * . If you are adding an AWS Config managed rule, you must specify the rule's identifier for
     * the `RuleIdentifier` key.
     *
     * AWS Config Custom Rules are rules that you create from scratch. There are two ways to create
     * AWS Config custom rules: with Lambda functions (
     * [AWS Lambda Developer Guide](https://docs.aws.amazon.com/config/latest/developerguide/gettingstarted-concepts.html#gettingstarted-concepts-function)
     * ) and with Guard (
     * [Guard GitHub Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
     * ), a policy-as-code language. AWS Config custom rules created with AWS Lambda are called *AWS
     * Config Custom Lambda Rules* and AWS Config custom rules created with Guard are called *AWS
     * Config Custom Policy Rules* .
     *
     * If you are adding a new AWS Config Custom Lambda rule, you first need to create an AWS Lambda
     * function in the management account or a delegated administrator that the rule invokes to
     * evaluate your resources. You also need to create an IAM role in the managed account that can
     * be assumed by the Lambda function. When you use `PutOrganizationConfigRule` to add a Custom
     * Lambda rule to AWS Config , you must specify the Amazon Resource Name (ARN) that AWS Lambda
     * assigns to the function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnOrganizationConfigRule cfnOrganizationConfigRule =
     * CfnOrganizationConfigRule.Builder.create(this, "MyCfnOrganizationConfigRule")
     * .organizationConfigRuleName("organizationConfigRuleName")
     * // the properties below are optional
     * .excludedAccounts(List.of("excludedAccounts"))
     * .organizationCustomPolicyRuleMetadata(OrganizationCustomPolicyRuleMetadataProperty.builder()
     * .policyText("policyText")
     * .runtime("runtime")
     * // the properties below are optional
     * .debugLogDeliveryAccounts(List.of("debugLogDeliveryAccounts"))
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build())
     * .organizationCustomRuleMetadata(OrganizationCustomRuleMetadataProperty.builder()
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
     * // the properties below are optional
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build())
     * .organizationManagedRuleMetadata(OrganizationManagedRuleMetadataProperty.builder()
     * .ruleIdentifier("ruleIdentifier")
     * // the properties below are optional
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html)
     */
    public inline fun cfnOrganizationConfigRule(
        scope: Construct,
        id: String,
        block: CfnOrganizationConfigRuleDsl.() -> Unit = {},
    ): CfnOrganizationConfigRule {
        val builder = CfnOrganizationConfigRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * OrganizationCustomPolicyRuleMetadataProperty organizationCustomPolicyRuleMetadataProperty =
     * OrganizationCustomPolicyRuleMetadataProperty.builder()
     * .policyText("policyText")
     * .runtime("runtime")
     * // the properties below are optional
     * .debugLogDeliveryAccounts(List.of("debugLogDeliveryAccounts"))
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html)
     */
    public inline fun cfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataProperty(
        block: CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl.() -> Unit =
            {}
    ): CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty {
        val builder = CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * organization custom rule metadata such as resource type, resource ID of AWS resource, Lambda
     * function ARN, and organization trigger types that trigger AWS Config to evaluate your AWS
     * resources against a rule.
     *
     * It also provides the frequency with which you want AWS Config to run evaluations for the rule
     * if the trigger type is periodic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * OrganizationCustomRuleMetadataProperty organizationCustomRuleMetadataProperty =
     * OrganizationCustomRuleMetadataProperty.builder()
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
     * // the properties below are optional
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html)
     */
    public inline fun cfnOrganizationConfigRuleOrganizationCustomRuleMetadataProperty(
        block: CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl.() -> Unit = {}
    ): CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty {
        val builder = CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * organization managed rule metadata such as resource type and ID of AWS resource along with
     * the rule identifier.
     *
     * It also provides the frequency with which you want AWS Config to run evaluations for the rule
     * if the trigger type is periodic.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * OrganizationManagedRuleMetadataProperty organizationManagedRuleMetadataProperty =
     * OrganizationManagedRuleMetadataProperty.builder()
     * .ruleIdentifier("ruleIdentifier")
     * // the properties below are optional
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html)
     */
    public inline fun cfnOrganizationConfigRuleOrganizationManagedRuleMetadataProperty(
        block: CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl.() -> Unit = {}
    ): CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty {
        val builder = CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOrganizationConfigRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnOrganizationConfigRuleProps cfnOrganizationConfigRuleProps =
     * CfnOrganizationConfigRuleProps.builder()
     * .organizationConfigRuleName("organizationConfigRuleName")
     * // the properties below are optional
     * .excludedAccounts(List.of("excludedAccounts"))
     * .organizationCustomPolicyRuleMetadata(OrganizationCustomPolicyRuleMetadataProperty.builder()
     * .policyText("policyText")
     * .runtime("runtime")
     * // the properties below are optional
     * .debugLogDeliveryAccounts(List.of("debugLogDeliveryAccounts"))
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build())
     * .organizationCustomRuleMetadata(OrganizationCustomRuleMetadataProperty.builder()
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
     * // the properties below are optional
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build())
     * .organizationManagedRuleMetadata(OrganizationManagedRuleMetadataProperty.builder()
     * .ruleIdentifier("ruleIdentifier")
     * // the properties below are optional
     * .description("description")
     * .inputParameters("inputParameters")
     * .maximumExecutionFrequency("maximumExecutionFrequency")
     * .resourceIdScope("resourceIdScope")
     * .resourceTypesScope(List.of("resourceTypesScope"))
     * .tagKeyScope("tagKeyScope")
     * .tagValueScope("tagValueScope")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html)
     */
    public inline fun cfnOrganizationConfigRuleProps(
        block: CfnOrganizationConfigRulePropsDsl.() -> Unit = {}
    ): CfnOrganizationConfigRuleProps {
        val builder = CfnOrganizationConfigRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * OrganizationConformancePack deploys conformance packs across member accounts in an AWS
     * Organizations .
     *
     * OrganizationConformancePack enables organization service access for
     * `config-multiaccountsetup.amazonaws.com` through the `EnableAWSServiceAccess` action and
     * creates a service linked role in the master account of your organization. The service linked
     * role is created only when the role does not exist in the master account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnOrganizationConformancePack cfnOrganizationConformancePack =
     * CfnOrganizationConformancePack.Builder.create(this, "MyCfnOrganizationConformancePack")
     * .organizationConformancePackName("organizationConformancePackName")
     * // the properties below are optional
     * .conformancePackInputParameters(List.of(ConformancePackInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .deliveryS3Bucket("deliveryS3Bucket")
     * .deliveryS3KeyPrefix("deliveryS3KeyPrefix")
     * .excludedAccounts(List.of("excludedAccounts"))
     * .templateBody("templateBody")
     * .templateS3Uri("templateS3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html)
     */
    public inline fun cfnOrganizationConformancePack(
        scope: Construct,
        id: String,
        block: CfnOrganizationConformancePackDsl.() -> Unit = {},
    ): CfnOrganizationConformancePack {
        val builder = CfnOrganizationConformancePackDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input parameters in the form of key-value pairs for the conformance pack, both of which you
     * define.
     *
     * Keys can have a maximum character length of 255 characters, and values can have a maximum
     * length of 4096 characters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * ConformancePackInputParameterProperty conformancePackInputParameterProperty =
     * ConformancePackInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconformancepack-conformancepackinputparameter.html)
     */
    public inline fun cfnOrganizationConformancePackConformancePackInputParameterProperty(
        block: CfnOrganizationConformancePackConformancePackInputParameterPropertyDsl.() -> Unit =
            {}
    ): CfnOrganizationConformancePack.ConformancePackInputParameterProperty {
        val builder = CfnOrganizationConformancePackConformancePackInputParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOrganizationConformancePack`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnOrganizationConformancePackProps cfnOrganizationConformancePackProps =
     * CfnOrganizationConformancePackProps.builder()
     * .organizationConformancePackName("organizationConformancePackName")
     * // the properties below are optional
     * .conformancePackInputParameters(List.of(ConformancePackInputParameterProperty.builder()
     * .parameterName("parameterName")
     * .parameterValue("parameterValue")
     * .build()))
     * .deliveryS3Bucket("deliveryS3Bucket")
     * .deliveryS3KeyPrefix("deliveryS3KeyPrefix")
     * .excludedAccounts(List.of("excludedAccounts"))
     * .templateBody("templateBody")
     * .templateS3Uri("templateS3Uri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html)
     */
    public inline fun cfnOrganizationConformancePackProps(
        block: CfnOrganizationConformancePackPropsDsl.() -> Unit = {}
    ): CfnOrganizationConformancePackProps {
        val builder = CfnOrganizationConformancePackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that represents the details about the remediation configuration that includes the
     * remediation action, parameters, and data to execute the action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * Object parameters;
     * CfnRemediationConfiguration cfnRemediationConfiguration =
     * CfnRemediationConfiguration.Builder.create(this, "MyCfnRemediationConfiguration")
     * .configRuleName("configRuleName")
     * .targetId("targetId")
     * .targetType("targetType")
     * // the properties below are optional
     * .automatic(false)
     * .executionControls(ExecutionControlsProperty.builder()
     * .ssmControls(SsmControlsProperty.builder()
     * .concurrentExecutionRatePercentage(123)
     * .errorPercentage(123)
     * .build())
     * .build())
     * .maximumAutomaticAttempts(123)
     * .parameters(parameters)
     * .resourceType("resourceType")
     * .retryAttemptSeconds(123)
     * .targetVersion("targetVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html)
     */
    public inline fun cfnRemediationConfiguration(
        scope: Construct,
        id: String,
        block: CfnRemediationConfigurationDsl.() -> Unit = {},
    ): CfnRemediationConfiguration {
        val builder = CfnRemediationConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An ExecutionControls object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * ExecutionControlsProperty executionControlsProperty = ExecutionControlsProperty.builder()
     * .ssmControls(SsmControlsProperty.builder()
     * .concurrentExecutionRatePercentage(123)
     * .errorPercentage(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html)
     */
    public inline fun cfnRemediationConfigurationExecutionControlsProperty(
        block: CfnRemediationConfigurationExecutionControlsPropertyDsl.() -> Unit = {}
    ): CfnRemediationConfiguration.ExecutionControlsProperty {
        val builder = CfnRemediationConfigurationExecutionControlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRemediationConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * Object parameters;
     * CfnRemediationConfigurationProps cfnRemediationConfigurationProps =
     * CfnRemediationConfigurationProps.builder()
     * .configRuleName("configRuleName")
     * .targetId("targetId")
     * .targetType("targetType")
     * // the properties below are optional
     * .automatic(false)
     * .executionControls(ExecutionControlsProperty.builder()
     * .ssmControls(SsmControlsProperty.builder()
     * .concurrentExecutionRatePercentage(123)
     * .errorPercentage(123)
     * .build())
     * .build())
     * .maximumAutomaticAttempts(123)
     * .parameters(parameters)
     * .resourceType("resourceType")
     * .retryAttemptSeconds(123)
     * .targetVersion("targetVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-remediationconfiguration.html)
     */
    public inline fun cfnRemediationConfigurationProps(
        block: CfnRemediationConfigurationPropsDsl.() -> Unit = {}
    ): CfnRemediationConfigurationProps {
        val builder = CfnRemediationConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value is either a dynamic (resource) value or a static value.
     *
     * You must select either a dynamic value or a static value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * RemediationParameterValueProperty remediationParameterValueProperty =
     * RemediationParameterValueProperty.builder()
     * .resourceValue(ResourceValueProperty.builder()
     * .value("value")
     * .build())
     * .staticValue(StaticValueProperty.builder()
     * .value(List.of("value"))
     * .values(List.of("values"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-remediationparametervalue.html)
     */
    public inline fun cfnRemediationConfigurationRemediationParameterValueProperty(
        block: CfnRemediationConfigurationRemediationParameterValuePropertyDsl.() -> Unit = {}
    ): CfnRemediationConfiguration.RemediationParameterValueProperty {
        val builder = CfnRemediationConfigurationRemediationParameterValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The dynamic value of the resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * ResourceValueProperty resourceValueProperty = ResourceValueProperty.builder()
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html)
     */
    public inline fun cfnRemediationConfigurationResourceValueProperty(
        block: CfnRemediationConfigurationResourceValuePropertyDsl.() -> Unit = {}
    ): CfnRemediationConfiguration.ResourceValueProperty {
        val builder = CfnRemediationConfigurationResourceValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * AWS Systems Manager (SSM) specific remediation controls.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * SsmControlsProperty ssmControlsProperty = SsmControlsProperty.builder()
     * .concurrentExecutionRatePercentage(123)
     * .errorPercentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html)
     */
    public inline fun cfnRemediationConfigurationSsmControlsProperty(
        block: CfnRemediationConfigurationSsmControlsPropertyDsl.() -> Unit = {}
    ): CfnRemediationConfiguration.SsmControlsProperty {
        val builder = CfnRemediationConfigurationSsmControlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The static value of the resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * StaticValueProperty staticValueProperty = StaticValueProperty.builder()
     * .value(List.of("value"))
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-staticvalue.html)
     */
    public inline fun cfnRemediationConfigurationStaticValueProperty(
        block: CfnRemediationConfigurationStaticValuePropertyDsl.() -> Unit = {}
    ): CfnRemediationConfiguration.StaticValueProperty {
        val builder = CfnRemediationConfigurationStaticValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides the details of a stored query.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnStoredQuery cfnStoredQuery = CfnStoredQuery.Builder.create(this, "MyCfnStoredQuery")
     * .queryExpression("queryExpression")
     * .queryName("queryName")
     * // the properties below are optional
     * .queryDescription("queryDescription")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html)
     */
    public inline fun cfnStoredQuery(
        scope: Construct,
        id: String,
        block: CfnStoredQueryDsl.() -> Unit = {},
    ): CfnStoredQuery {
        val builder = CfnStoredQueryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStoredQuery`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * CfnStoredQueryProps cfnStoredQueryProps = CfnStoredQueryProps.builder()
     * .queryExpression("queryExpression")
     * .queryName("queryName")
     * // the properties below are optional
     * .queryDescription("queryDescription")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html)
     */
    public inline fun cfnStoredQueryProps(
        block: CfnStoredQueryPropsDsl.() -> Unit = {}
    ): CfnStoredQueryProps {
        val builder = CfnStoredQueryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Checks whether your CloudFormation stacks' actual configuration differs, or has drifted, from
     * its expected configuration.
     *
     * Example:
     * ```
     * // Topic to which compliance notification events will be published
     * Topic complianceTopic = new Topic(this, "ComplianceTopic");
     * CloudFormationStackDriftDetectionCheck rule = new CloudFormationStackDriftDetectionCheck(this,
     * "Drift");
     * rule.onComplianceChange("TopicEvent", OnEventOptions.builder()
     * .target(new SnsTopic(complianceTopic))
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/cloudformation-stack-drift-detection-check.html)
     */
    public inline fun cloudFormationStackDriftDetectionCheck(
        scope: Construct,
        id: String,
        block: CloudFormationStackDriftDetectionCheckDsl.() -> Unit = {},
    ): CloudFormationStackDriftDetectionCheck {
        val builder = CloudFormationStackDriftDetectionCheckDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a CloudFormationStackDriftDetectionCheck.
     *
     * Example:
     * ```
     * // compliant if stack's status is 'IN_SYNC'
     * // non-compliant if the stack's drift status is 'DRIFTED'
     * // compliant if stack's status is 'IN_SYNC'
     * // non-compliant if the stack's drift status is 'DRIFTED'
     * CloudFormationStackDriftDetectionCheck.Builder.create(this, "Drift")
     * .ownStackOnly(true)
     * .build();
     * ```
     */
    public inline fun cloudFormationStackDriftDetectionCheckProps(
        block: CloudFormationStackDriftDetectionCheckPropsDsl.() -> Unit = {}
    ): CloudFormationStackDriftDetectionCheckProps {
        val builder = CloudFormationStackDriftDetectionCheckPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Checks whether your CloudFormation stacks are sending event notifications to a SNS topic.
     *
     * Optionally checks whether specified SNS topics are used.
     *
     * Example:
     * ```
     * // topics to which CloudFormation stacks may send event notifications
     * Topic topic1 = new Topic(this, "AllowedTopic1");
     * Topic topic2 = new Topic(this, "AllowedTopic2");
     * // non-compliant if CloudFormation stack does not send notifications to 'topic1' or 'topic2'
     * // non-compliant if CloudFormation stack does not send notifications to 'topic1' or 'topic2'
     * CloudFormationStackNotificationCheck.Builder.create(this, "NotificationCheck")
     * .topics(List.of(topic1, topic2))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/cloudformation-stack-notification-check.html)
     */
    public inline fun cloudFormationStackNotificationCheck(
        scope: Construct,
        id: String,
        block: CloudFormationStackNotificationCheckDsl.() -> Unit = {},
    ): CloudFormationStackNotificationCheck {
        val builder = CloudFormationStackNotificationCheckDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a CloudFormationStackNotificationCheck.
     *
     * Example:
     * ```
     * // topics to which CloudFormation stacks may send event notifications
     * Topic topic1 = new Topic(this, "AllowedTopic1");
     * Topic topic2 = new Topic(this, "AllowedTopic2");
     * // non-compliant if CloudFormation stack does not send notifications to 'topic1' or 'topic2'
     * // non-compliant if CloudFormation stack does not send notifications to 'topic1' or 'topic2'
     * CloudFormationStackNotificationCheck.Builder.create(this, "NotificationCheck")
     * .topics(List.of(topic1, topic2))
     * .build();
     * ```
     */
    public inline fun cloudFormationStackNotificationCheckProps(
        block: CloudFormationStackNotificationCheckPropsDsl.() -> Unit = {}
    ): CloudFormationStackNotificationCheckProps {
        val builder = CloudFormationStackNotificationCheckPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new custom policy.
     *
     * Example:
     * ```
     * String samplePolicyText = "\n# This rule checks if point in time recovery (PITR) is enabled on
     * active Amazon DynamoDB tables\nlet status = ['ACTIVE']\n\nrule tableisactive when\n
     * resourceType == \"AWS::DynamoDB::Table\" {\n    configuration.tableStatus == %status\n}\n\nrule
     * checkcompliance when\n    resourceType == \"AWS::DynamoDB::Table\"\n    tableisactive {\n
     * let pitr =
     * supplementaryConfiguration.ContinuousBackupsDescription.pointInTimeRecoveryDescription.pointInTimeRecoveryStatus\n
     *        %pitr == \"ENABLED\"\n}\n";
     * CustomPolicy.Builder.create(this, "Custom")
     * .policyText(samplePolicyText)
     * .enableDebugLog(true)
     * .ruleScope(RuleScope.fromResources(List.of(ResourceType.DYNAMODB_TABLE)))
     * .build();
     * ```
     */
    public inline fun customPolicy(
        scope: Construct,
        id: String,
        block: CustomPolicyDsl.() -> Unit = {},
    ): CustomPolicy {
        val builder = CustomPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a CustomPolicy.
     *
     * Example:
     * ```
     * String samplePolicyText = "\n# This rule checks if point in time recovery (PITR) is enabled on
     * active Amazon DynamoDB tables\nlet status = ['ACTIVE']\n\nrule tableisactive when\n
     * resourceType == \"AWS::DynamoDB::Table\" {\n    configuration.tableStatus == %status\n}\n\nrule
     * checkcompliance when\n    resourceType == \"AWS::DynamoDB::Table\"\n    tableisactive {\n
     * let pitr =
     * supplementaryConfiguration.ContinuousBackupsDescription.pointInTimeRecoveryDescription.pointInTimeRecoveryStatus\n
     *        %pitr == \"ENABLED\"\n}\n";
     * CustomPolicy.Builder.create(this, "Custom")
     * .policyText(samplePolicyText)
     * .enableDebugLog(true)
     * .ruleScope(RuleScope.fromResources(List.of(ResourceType.DYNAMODB_TABLE)))
     * .build();
     * ```
     */
    public inline fun customPolicyProps(
        block: CustomPolicyPropsDsl.() -> Unit = {}
    ): CustomPolicyProps {
        val builder = CustomPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new custom rule.
     *
     * Example:
     * ```
     * // Lambda function containing logic that evaluates compliance with the rule.
     * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
     * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_18_X)
     * .build();
     * // A custom rule that runs on configuration changes of EC2 instances
     * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
     * .configurationChanges(true)
     * .lambdaFunction(evalComplianceFn)
     * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
     * .build();
     * ```
     */
    public inline fun customRule(
        scope: Construct,
        id: String,
        block: CustomRuleDsl.() -> Unit = {},
    ): CustomRule {
        val builder = CustomRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a CustomRule.
     *
     * Example:
     * ```
     * // Lambda function containing logic that evaluates compliance with the rule.
     * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
     * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
     * .handler("index.handler")
     * .runtime(Runtime.NODEJS_18_X)
     * .build();
     * // A custom rule that runs on configuration changes of EC2 instances
     * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
     * .configurationChanges(true)
     * .lambdaFunction(evalComplianceFn)
     * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
     * .build();
     * ```
     */
    public inline fun customRuleProps(block: CustomRulePropsDsl.() -> Unit = {}): CustomRuleProps {
        val builder = CustomRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new managed rule.
     *
     * Example:
     * ```
     * // https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html
     * // https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html
     * ManagedRule.Builder.create(this, "AccessKeysRotated")
     * .identifier(ManagedRuleIdentifiers.ACCESS_KEYS_ROTATED)
     * .inputParameters(Map.of(
     * "maxAccessKeyAge", 60))
     * // default is 24 hours
     * .maximumExecutionFrequency(MaximumExecutionFrequency.TWELVE_HOURS)
     * .build();
     * ```
     */
    public inline fun managedRule(
        scope: Construct,
        id: String,
        block: ManagedRuleDsl.() -> Unit = {},
    ): ManagedRule {
        val builder = ManagedRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a ManagedRule.
     *
     * Example:
     * ```
     * // https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html
     * // https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html
     * ManagedRule.Builder.create(this, "AccessKeysRotated")
     * .identifier(ManagedRuleIdentifiers.ACCESS_KEYS_ROTATED)
     * .inputParameters(Map.of(
     * "maxAccessKeyAge", 60))
     * // default is 24 hours
     * .maximumExecutionFrequency(MaximumExecutionFrequency.TWELVE_HOURS)
     * .build();
     * ```
     */
    public inline fun managedRuleProps(
        block: ManagedRulePropsDsl.() -> Unit = {}
    ): ManagedRuleProps {
        val builder = ManagedRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a new rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.config.*;
     * Object inputParameters;
     * RuleScope ruleScope;
     * RuleProps ruleProps = RuleProps.builder()
     * .configRuleName("configRuleName")
     * .description("description")
     * .inputParameters(Map.of(
     * "inputParametersKey", inputParameters))
     * .maximumExecutionFrequency(MaximumExecutionFrequency.ONE_HOUR)
     * .ruleScope(ruleScope)
     * .build();
     * ```
     */
    public inline fun ruleProps(block: RulePropsDsl.() -> Unit = {}): RuleProps {
        val builder = RulePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
