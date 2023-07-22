@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnGroup
import software.amazon.awscdk.services.xray.CfnGroupProps
import software.amazon.awscdk.services.xray.CfnResourcePolicy
import software.amazon.awscdk.services.xray.CfnResourcePolicyProps
import software.amazon.awscdk.services.xray.CfnSamplingRule
import software.amazon.awscdk.services.xray.CfnSamplingRuleProps
import software.constructs.Construct

public object xray {
  /**
   * Use the `AWS::XRay::Group` resource to specify a group with a name and a filter expression.
   *
   * Groups enable the collection of traces that match the filter expression, can be used to filter
   * service graphs and traces, and to supply Amazon CloudWatch metrics.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * Object tags;
   * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
   * .groupName("groupName")
   * // the properties below are optional
   * .filterExpression("filterExpression")
   * .insightsConfiguration(InsightsConfigurationProperty.builder()
   * .insightsEnabled(false)
   * .notificationsEnabled(false)
   * .build())
   * .tags(List.of(tags))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html)
   */
  public inline fun cfnGroup(
    scope: Construct,
    id: String,
    block: CfnGroupDsl.() -> Unit = {},
  ): CfnGroup {
    val builder = CfnGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The structure containing configurations related to insights.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * InsightsConfigurationProperty insightsConfigurationProperty =
   * InsightsConfigurationProperty.builder()
   * .insightsEnabled(false)
   * .notificationsEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-group-insightsconfiguration.html)
   */
  public inline
      fun cfnGroupInsightsConfigurationProperty(block: CfnGroupInsightsConfigurationPropertyDsl.() -> Unit
      = {}): CfnGroup.InsightsConfigurationProperty {
    val builder = CfnGroupInsightsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * Object tags;
   * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
   * .groupName("groupName")
   * // the properties below are optional
   * .filterExpression("filterExpression")
   * .insightsConfiguration(InsightsConfigurationProperty.builder()
   * .insightsEnabled(false)
   * .notificationsEnabled(false)
   * .build())
   * .tags(List.of(tags))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-group.html)
   */
  public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
    val builder = CfnGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use `AWS::XRay::ResourcePolicy` to specify an X-Ray resource-based policy, which grants one or
   * more AWS services and accounts permissions to access X-Ray .
   *
   * Each resource-based policy is associated with a specific AWS account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
   * "MyCfnResourcePolicy")
   * .policyDocument("policyDocument")
   * .policyName("policyName")
   * // the properties below are optional
   * .bypassPolicyLockoutCheck(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html)
   */
  public inline fun cfnResourcePolicy(
    scope: Construct,
    id: String,
    block: CfnResourcePolicyDsl.() -> Unit = {},
  ): CfnResourcePolicy {
    val builder = CfnResourcePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnResourcePolicy`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
   * .policyDocument("policyDocument")
   * .policyName("policyName")
   * // the properties below are optional
   * .bypassPolicyLockoutCheck(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html)
   */
  public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}):
      CfnResourcePolicyProps {
    val builder = CfnResourcePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use the `AWS::XRay::SamplingRule` resource to specify a sampling rule, which controls sampling
   * behavior for instrumented applications.
   *
   * Include a `SamplingRule` entity to create or update a sampling rule.
   *
   *
   * `SamplingRule.Version` can only be set when creating a sampling rule. Updating the version will
   * cause the update to fail.
   *
   *
   * Services retrieve rules with
   * [GetSamplingRules](https://docs.aws.amazon.com//xray/latest/api/API_GetSamplingRules.html) , and
   * evaluate each rule in ascending order of *priority* for each request. If a rule matches, the
   * service records a trace, borrowing it from the reservoir size. After 10 seconds, the service
   * reports back to X-Ray with
   * [GetSamplingTargets](https://docs.aws.amazon.com//xray/latest/api/API_GetSamplingTargets.html) to
   * get updated versions of each in-use rule. The updated rule contains a trace quota that the service
   * can use instead of borrowing from the reservoir.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * Object tags;
   * CfnSamplingRule cfnSamplingRule = CfnSamplingRule.Builder.create(this, "MyCfnSamplingRule")
   * .ruleName("ruleName")
   * .samplingRule(SamplingRuleProperty.builder()
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * // the properties below are optional
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .version(123)
   * .build())
   * .samplingRuleRecord(SamplingRuleRecordProperty.builder()
   * .createdAt("createdAt")
   * .modifiedAt("modifiedAt")
   * .samplingRule(SamplingRuleProperty.builder()
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * // the properties below are optional
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .version(123)
   * .build())
   * .build())
   * .samplingRuleUpdate(SamplingRuleUpdateProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * .build())
   * .tags(List.of(tags))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html)
   */
  public inline fun cfnSamplingRule(
    scope: Construct,
    id: String,
    block: CfnSamplingRuleDsl.() -> Unit = {},
  ): CfnSamplingRule {
    val builder = CfnSamplingRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSamplingRule`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * Object tags;
   * CfnSamplingRuleProps cfnSamplingRuleProps = CfnSamplingRuleProps.builder()
   * .ruleName("ruleName")
   * .samplingRule(SamplingRuleProperty.builder()
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * // the properties below are optional
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .version(123)
   * .build())
   * .samplingRuleRecord(SamplingRuleRecordProperty.builder()
   * .createdAt("createdAt")
   * .modifiedAt("modifiedAt")
   * .samplingRule(SamplingRuleProperty.builder()
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * // the properties below are optional
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .version(123)
   * .build())
   * .build())
   * .samplingRuleUpdate(SamplingRuleUpdateProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * .build())
   * .tags(List.of(tags))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html)
   */
  public inline fun cfnSamplingRuleProps(block: CfnSamplingRulePropsDsl.() -> Unit = {}):
      CfnSamplingRuleProps {
    val builder = CfnSamplingRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A sampling rule that services use to decide whether to instrument a request.
   *
   * Rule fields can match properties of the service, or properties of a request. The service can
   * ignore rules that don't match its properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * SamplingRuleProperty samplingRuleProperty = SamplingRuleProperty.builder()
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * // the properties below are optional
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .version(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html)
   */
  public inline
      fun cfnSamplingRuleSamplingRuleProperty(block: CfnSamplingRuleSamplingRulePropertyDsl.() -> Unit
      = {}): CfnSamplingRule.SamplingRuleProperty {
    val builder = CfnSamplingRuleSamplingRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * SamplingRuleRecordProperty samplingRuleRecordProperty = SamplingRuleRecordProperty.builder()
   * .createdAt("createdAt")
   * .modifiedAt("modifiedAt")
   * .samplingRule(SamplingRuleProperty.builder()
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * // the properties below are optional
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .version(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html)
   */
  public inline
      fun cfnSamplingRuleSamplingRuleRecordProperty(block: CfnSamplingRuleSamplingRuleRecordPropertyDsl.() -> Unit
      = {}): CfnSamplingRule.SamplingRuleRecordProperty {
    val builder = CfnSamplingRuleSamplingRuleRecordPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.xray.*;
   * SamplingRuleUpdateProperty samplingRuleUpdateProperty = SamplingRuleUpdateProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html)
   */
  public inline
      fun cfnSamplingRuleSamplingRuleUpdateProperty(block: CfnSamplingRuleSamplingRuleUpdatePropertyDsl.() -> Unit
      = {}): CfnSamplingRule.SamplingRuleUpdateProperty {
    val builder = CfnSamplingRuleSamplingRuleUpdatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
