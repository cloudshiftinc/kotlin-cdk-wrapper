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

package cloudshift.awscdk.dsl.services.vpclattice

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps
import software.amazon.awscdk.services.vpclattice.CfnListener
import software.amazon.awscdk.services.vpclattice.CfnListenerProps
import software.amazon.awscdk.services.vpclattice.CfnResourcePolicy
import software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps
import software.amazon.awscdk.services.vpclattice.CfnRule
import software.amazon.awscdk.services.vpclattice.CfnRuleProps
import software.amazon.awscdk.services.vpclattice.CfnService
import software.amazon.awscdk.services.vpclattice.CfnServiceNetwork
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps
import software.amazon.awscdk.services.vpclattice.CfnServiceProps
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps
import software.constructs.Construct

public object vpclattice {
    /**
     * Enables access logs to be sent to Amazon CloudWatch, Amazon S3, and Amazon Kinesis Data
     * Firehose.
     *
     * The service network owner can use the access logs to audit the services in the network. The
     * service network owner will only see access logs from clients and services that are associated
     * with their service network. Access log entries represent traffic originated from VPCs
     * associated with that network. For more information, see
     * [Access logs](https://docs.aws.amazon.com/vpc-lattice/latest/ug/monitoring-access-logs.html)
     * in the *Amazon VPC Lattice User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnAccessLogSubscription cfnAccessLogSubscription =
     * CfnAccessLogSubscription.Builder.create(this, "MyCfnAccessLogSubscription")
     * .destinationArn("destinationArn")
     * // the properties below are optional
     * .resourceIdentifier("resourceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html)
     */
    public inline fun cfnAccessLogSubscription(
        scope: Construct,
        id: String,
        block: CfnAccessLogSubscriptionDsl.() -> Unit = {},
    ): CfnAccessLogSubscription {
        val builder = CfnAccessLogSubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessLogSubscription`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnAccessLogSubscriptionProps cfnAccessLogSubscriptionProps =
     * CfnAccessLogSubscriptionProps.builder()
     * .destinationArn("destinationArn")
     * // the properties below are optional
     * .resourceIdentifier("resourceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-accesslogsubscription.html)
     */
    public inline fun cfnAccessLogSubscriptionProps(
        block: CfnAccessLogSubscriptionPropsDsl.() -> Unit = {}
    ): CfnAccessLogSubscriptionProps {
        val builder = CfnAccessLogSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates the auth policy.
     *
     * The policy string in JSON must not contain newlines or blank lines.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * Object policy;
     * CfnAuthPolicy cfnAuthPolicy = CfnAuthPolicy.Builder.create(this, "MyCfnAuthPolicy")
     * .policy(policy)
     * .resourceIdentifier("resourceIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html)
     */
    public inline fun cfnAuthPolicy(
        scope: Construct,
        id: String,
        block: CfnAuthPolicyDsl.() -> Unit = {},
    ): CfnAuthPolicy {
        val builder = CfnAuthPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAuthPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * Object policy;
     * CfnAuthPolicyProps cfnAuthPolicyProps = CfnAuthPolicyProps.builder()
     * .policy(policy)
     * .resourceIdentifier("resourceIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html)
     */
    public inline fun cfnAuthPolicyProps(
        block: CfnAuthPolicyPropsDsl.() -> Unit = {}
    ): CfnAuthPolicyProps {
        val builder = CfnAuthPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a listener for a service.
     *
     * Before you start using your Amazon VPC Lattice service, you must add one or more listeners. A
     * listener is a process that checks for connection requests to your services. For more
     * information, see
     * [Listeners](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html) in the *Amazon
     * VPC Lattice User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnListener cfnListener = CfnListener.Builder.create(this, "MyCfnListener")
     * .defaultAction(DefaultActionProperty.builder()
     * .fixedResponse(FixedResponseProperty.builder()
     * .statusCode(123)
     * .build())
     * .forward(ForwardProperty.builder()
     * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build()))
     * .build())
     * .build())
     * .protocol("protocol")
     * // the properties below are optional
     * .name("name")
     * .port(123)
     * .serviceIdentifier("serviceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html)
     */
    public inline fun cfnListener(
        scope: Construct,
        id: String,
        block: CfnListenerDsl.() -> Unit = {},
    ): CfnListener {
        val builder = CfnListenerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The action for the default rule.
     *
     * Each listener has a default rule. Each rule consists of a priority, one or more actions, and
     * one or more conditions. The default rule is the rule that's used if no other rules match.
     * Each rule must include exactly one of the following types of actions: `forward` or
     * `fixed-response` , and it must be the last action to be performed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * DefaultActionProperty defaultActionProperty = DefaultActionProperty.builder()
     * .fixedResponse(FixedResponseProperty.builder()
     * .statusCode(123)
     * .build())
     * .forward(ForwardProperty.builder()
     * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-defaultaction.html)
     */
    public inline fun cfnListenerDefaultActionProperty(
        block: CfnListenerDefaultActionPropertyDsl.() -> Unit = {}
    ): CfnListener.DefaultActionProperty {
        val builder = CfnListenerDefaultActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about an action that returns a custom HTTP response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * FixedResponseProperty fixedResponseProperty = FixedResponseProperty.builder()
     * .statusCode(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-fixedresponse.html)
     */
    public inline fun cfnListenerFixedResponseProperty(
        block: CfnListenerFixedResponsePropertyDsl.() -> Unit = {}
    ): CfnListener.FixedResponseProperty {
        val builder = CfnListenerFixedResponsePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The forward action.
     *
     * Traffic that matches the rule is forwarded to the specified target groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * ForwardProperty forwardProperty = ForwardProperty.builder()
     * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-forward.html)
     */
    public inline fun cfnListenerForwardProperty(
        block: CfnListenerForwardPropertyDsl.() -> Unit = {}
    ): CfnListener.ForwardProperty {
        val builder = CfnListenerForwardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnListener`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnListenerProps cfnListenerProps = CfnListenerProps.builder()
     * .defaultAction(DefaultActionProperty.builder()
     * .fixedResponse(FixedResponseProperty.builder()
     * .statusCode(123)
     * .build())
     * .forward(ForwardProperty.builder()
     * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build()))
     * .build())
     * .build())
     * .protocol("protocol")
     * // the properties below are optional
     * .name("name")
     * .port(123)
     * .serviceIdentifier("serviceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html)
     */
    public inline fun cfnListenerProps(
        block: CfnListenerPropsDsl.() -> Unit = {}
    ): CfnListenerProps {
        val builder = CfnListenerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the weight of a target group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * WeightedTargetGroupProperty weightedTargetGroupProperty = WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-weightedtargetgroup.html)
     */
    public inline fun cfnListenerWeightedTargetGroupProperty(
        block: CfnListenerWeightedTargetGroupPropertyDsl.() -> Unit = {}
    ): CfnListener.WeightedTargetGroupProperty {
        val builder = CfnListenerWeightedTargetGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Retrieves information about the resource policy.
     *
     * The resource policy is an IAM policy created on behalf of the resource owner when they share
     * a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * Object policy;
     * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
     * "MyCfnResourcePolicy")
     * .policy(policy)
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcepolicy.html)
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * Object policy;
     * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
     * .policy(policy)
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-resourcepolicy.html)
     */
    public inline fun cfnResourcePolicyProps(
        block: CfnResourcePolicyPropsDsl.() -> Unit = {}
    ): CfnResourcePolicyProps {
        val builder = CfnResourcePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a listener rule.
     *
     * Each listener has a default rule for checking connection requests, but you can define
     * additional rules. Each rule consists of a priority, one or more actions, and one or more
     * conditions. For more information, see
     * [Listener rules](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules)
     * in the *Amazon VPC Lattice User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
     * .action(ActionProperty.builder()
     * .fixedResponse(FixedResponseProperty.builder()
     * .statusCode(123)
     * .build())
     * .forward(ForwardProperty.builder()
     * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build()))
     * .build())
     * .build())
     * .match(MatchProperty.builder()
     * .httpMatch(HttpMatchProperty.builder()
     * .headerMatches(List.of(HeaderMatchProperty.builder()
     * .match(HeaderMatchTypeProperty.builder()
     * .contains("contains")
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .caseSensitive(false)
     * .build()))
     * .method("method")
     * .pathMatch(PathMatchProperty.builder()
     * .match(PathMatchTypeProperty.builder()
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * // the properties below are optional
     * .caseSensitive(false)
     * .build())
     * .build())
     * .build())
     * .priority(123)
     * // the properties below are optional
     * .listenerIdentifier("listenerIdentifier")
     * .name("name")
     * .serviceIdentifier("serviceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html)
     */
    public inline fun cfnRule(
        scope: Construct,
        id: String,
        block: CfnRuleDsl.() -> Unit = {},
    ): CfnRule {
        val builder = CfnRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the action for a rule.
     *
     * Each rule must include exactly one of the following types of actions: `forward` or
     * `fixed-response` , and it must be the last action to be performed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .fixedResponse(FixedResponseProperty.builder()
     * .statusCode(123)
     * .build())
     * .forward(ForwardProperty.builder()
     * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-action.html)
     */
    public inline fun cfnRuleActionProperty(
        block: CfnRuleActionPropertyDsl.() -> Unit = {}
    ): CfnRule.ActionProperty {
        val builder = CfnRuleActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about an action that returns a custom HTTP response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * FixedResponseProperty fixedResponseProperty = FixedResponseProperty.builder()
     * .statusCode(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-fixedresponse.html)
     */
    public inline fun cfnRuleFixedResponseProperty(
        block: CfnRuleFixedResponsePropertyDsl.() -> Unit = {}
    ): CfnRule.FixedResponseProperty {
        val builder = CfnRuleFixedResponsePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The forward action.
     *
     * Traffic that matches the rule is forwarded to the specified target groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * ForwardProperty forwardProperty = ForwardProperty.builder()
     * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-forward.html)
     */
    public inline fun cfnRuleForwardProperty(
        block: CfnRuleForwardPropertyDsl.() -> Unit = {}
    ): CfnRule.ForwardProperty {
        val builder = CfnRuleForwardPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the constraints for a header match.
     *
     * Matches incoming requests with rule based on request header value before applying rule
     * action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * HeaderMatchProperty headerMatchProperty = HeaderMatchProperty.builder()
     * .match(HeaderMatchTypeProperty.builder()
     * .contains("contains")
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .caseSensitive(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatch.html)
     */
    public inline fun cfnRuleHeaderMatchProperty(
        block: CfnRuleHeaderMatchPropertyDsl.() -> Unit = {}
    ): CfnRule.HeaderMatchProperty {
        val builder = CfnRuleHeaderMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a header match type.
     *
     * Only one can be provided.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * HeaderMatchTypeProperty headerMatchTypeProperty = HeaderMatchTypeProperty.builder()
     * .contains("contains")
     * .exact("exact")
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-headermatchtype.html)
     */
    public inline fun cfnRuleHeaderMatchTypeProperty(
        block: CfnRuleHeaderMatchTypePropertyDsl.() -> Unit = {}
    ): CfnRule.HeaderMatchTypeProperty {
        val builder = CfnRuleHeaderMatchTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes criteria that can be applied to incoming requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * HttpMatchProperty httpMatchProperty = HttpMatchProperty.builder()
     * .headerMatches(List.of(HeaderMatchProperty.builder()
     * .match(HeaderMatchTypeProperty.builder()
     * .contains("contains")
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .caseSensitive(false)
     * .build()))
     * .method("method")
     * .pathMatch(PathMatchProperty.builder()
     * .match(PathMatchTypeProperty.builder()
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * // the properties below are optional
     * .caseSensitive(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html)
     */
    public inline fun cfnRuleHttpMatchProperty(
        block: CfnRuleHttpMatchPropertyDsl.() -> Unit = {}
    ): CfnRule.HttpMatchProperty {
        val builder = CfnRuleHttpMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a rule match.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * MatchProperty matchProperty = MatchProperty.builder()
     * .httpMatch(HttpMatchProperty.builder()
     * .headerMatches(List.of(HeaderMatchProperty.builder()
     * .match(HeaderMatchTypeProperty.builder()
     * .contains("contains")
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .caseSensitive(false)
     * .build()))
     * .method("method")
     * .pathMatch(PathMatchProperty.builder()
     * .match(PathMatchTypeProperty.builder()
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * // the properties below are optional
     * .caseSensitive(false)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-match.html)
     */
    public inline fun cfnRuleMatchProperty(
        block: CfnRuleMatchPropertyDsl.() -> Unit = {}
    ): CfnRule.MatchProperty {
        val builder = CfnRuleMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the conditions that can be applied when matching a path for incoming requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * PathMatchProperty pathMatchProperty = PathMatchProperty.builder()
     * .match(PathMatchTypeProperty.builder()
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * // the properties below are optional
     * .caseSensitive(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatch.html)
     */
    public inline fun cfnRulePathMatchProperty(
        block: CfnRulePathMatchPropertyDsl.() -> Unit = {}
    ): CfnRule.PathMatchProperty {
        val builder = CfnRulePathMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a path match type.
     *
     * Each rule can include only one of the following types of paths.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * PathMatchTypeProperty pathMatchTypeProperty = PathMatchTypeProperty.builder()
     * .exact("exact")
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatchtype.html)
     */
    public inline fun cfnRulePathMatchTypeProperty(
        block: CfnRulePathMatchTypePropertyDsl.() -> Unit = {}
    ): CfnRule.PathMatchTypeProperty {
        val builder = CfnRulePathMatchTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
     * .action(ActionProperty.builder()
     * .fixedResponse(FixedResponseProperty.builder()
     * .statusCode(123)
     * .build())
     * .forward(ForwardProperty.builder()
     * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build()))
     * .build())
     * .build())
     * .match(MatchProperty.builder()
     * .httpMatch(HttpMatchProperty.builder()
     * .headerMatches(List.of(HeaderMatchProperty.builder()
     * .match(HeaderMatchTypeProperty.builder()
     * .contains("contains")
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .caseSensitive(false)
     * .build()))
     * .method("method")
     * .pathMatch(PathMatchProperty.builder()
     * .match(PathMatchTypeProperty.builder()
     * .exact("exact")
     * .prefix("prefix")
     * .build())
     * // the properties below are optional
     * .caseSensitive(false)
     * .build())
     * .build())
     * .build())
     * .priority(123)
     * // the properties below are optional
     * .listenerIdentifier("listenerIdentifier")
     * .name("name")
     * .serviceIdentifier("serviceIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html)
     */
    public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
        val builder = CfnRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the weight of a target group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * WeightedTargetGroupProperty weightedTargetGroupProperty = WeightedTargetGroupProperty.builder()
     * .targetGroupIdentifier("targetGroupIdentifier")
     * // the properties below are optional
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-weightedtargetgroup.html)
     */
    public inline fun cfnRuleWeightedTargetGroupProperty(
        block: CfnRuleWeightedTargetGroupPropertyDsl.() -> Unit = {}
    ): CfnRule.WeightedTargetGroupProperty {
        val builder = CfnRuleWeightedTargetGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a service.
     *
     * A service is any software application that can run on instances containers, or serverless
     * functions within an account or virtual private cloud (VPC).
     *
     * For more information, see
     * [Services](https://docs.aws.amazon.com/vpc-lattice/latest/ug/services.html) in the *Amazon
     * VPC Lattice User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnService cfnService = CfnService.Builder.create(this, "MyCfnService")
     * .authType("authType")
     * .certificateArn("certificateArn")
     * .customDomainName("customDomainName")
     * .dnsEntry(DnsEntryProperty.builder()
     * .domainName("domainName")
     * .hostedZoneId("hostedZoneId")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html)
     */
    public inline fun cfnService(
        scope: Construct,
        id: String,
        block: CfnServiceDsl.() -> Unit = {},
    ): CfnService {
        val builder = CfnServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the DNS information of a service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * DnsEntryProperty dnsEntryProperty = DnsEntryProperty.builder()
     * .domainName("domainName")
     * .hostedZoneId("hostedZoneId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-service-dnsentry.html)
     */
    public inline fun cfnServiceDnsEntryProperty(
        block: CfnServiceDnsEntryPropertyDsl.() -> Unit = {}
    ): CfnService.DnsEntryProperty {
        val builder = CfnServiceDnsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a service network.
     *
     * A service network is a logical boundary for a collection of services. You can associate
     * services and VPCs with a service network.
     *
     * For more information, see
     * [Service networks](https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html)
     * in the *Amazon VPC Lattice User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnServiceNetwork cfnServiceNetwork = CfnServiceNetwork.Builder.create(this,
     * "MyCfnServiceNetwork")
     * .authType("authType")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html)
     */
    public inline fun cfnServiceNetwork(
        scope: Construct,
        id: String,
        block: CfnServiceNetworkDsl.() -> Unit = {},
    ): CfnServiceNetwork {
        val builder = CfnServiceNetworkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServiceNetwork`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnServiceNetworkProps cfnServiceNetworkProps = CfnServiceNetworkProps.builder()
     * .authType("authType")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html)
     */
    public inline fun cfnServiceNetworkProps(
        block: CfnServiceNetworkPropsDsl.() -> Unit = {}
    ): CfnServiceNetworkProps {
        val builder = CfnServiceNetworkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a service with a service network.
     *
     * You can't use this operation if the service and service network are already associated or if
     * there is a disassociation or deletion in progress. If the association fails, you can retry
     * the operation by deleting the association and recreating it.
     *
     * You cannot associate a service and service network that are shared with a caller. The caller
     * must own either the service or the service network.
     *
     * As a result of this operation, the association is created in the service network account and
     * the association owner account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnServiceNetworkServiceAssociation cfnServiceNetworkServiceAssociation =
     * CfnServiceNetworkServiceAssociation.Builder.create(this, "MyCfnServiceNetworkServiceAssociation")
     * .dnsEntry(DnsEntryProperty.builder()
     * .domainName("domainName")
     * .hostedZoneId("hostedZoneId")
     * .build())
     * .serviceIdentifier("serviceIdentifier")
     * .serviceNetworkIdentifier("serviceNetworkIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html)
     */
    public inline fun cfnServiceNetworkServiceAssociation(
        scope: Construct,
        id: String,
        block: CfnServiceNetworkServiceAssociationDsl.() -> Unit = {},
    ): CfnServiceNetworkServiceAssociation {
        val builder = CfnServiceNetworkServiceAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * DNS information about the service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * DnsEntryProperty dnsEntryProperty = DnsEntryProperty.builder()
     * .domainName("domainName")
     * .hostedZoneId("hostedZoneId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetworkserviceassociation-dnsentry.html)
     */
    public inline fun cfnServiceNetworkServiceAssociationDnsEntryProperty(
        block: CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl.() -> Unit = {}
    ): CfnServiceNetworkServiceAssociation.DnsEntryProperty {
        val builder = CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServiceNetworkServiceAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnServiceNetworkServiceAssociationProps cfnServiceNetworkServiceAssociationProps =
     * CfnServiceNetworkServiceAssociationProps.builder()
     * .dnsEntry(DnsEntryProperty.builder()
     * .domainName("domainName")
     * .hostedZoneId("hostedZoneId")
     * .build())
     * .serviceIdentifier("serviceIdentifier")
     * .serviceNetworkIdentifier("serviceNetworkIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkserviceassociation.html)
     */
    public inline fun cfnServiceNetworkServiceAssociationProps(
        block: CfnServiceNetworkServiceAssociationPropsDsl.() -> Unit = {}
    ): CfnServiceNetworkServiceAssociationProps {
        val builder = CfnServiceNetworkServiceAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates a VPC with a service network.
     *
     * When you associate a VPC with the service network, it enables all the resources within that
     * VPC to be clients and communicate with other services in the service network. For more
     * information, see
     * [Manage VPC associations](https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-network-associations.html#service-network-vpc-associations)
     * in the *Amazon VPC Lattice User Guide* .
     *
     * You can't use this operation if there is a disassociation in progress. If the association
     * fails, retry by deleting the association and recreating it.
     *
     * As a result of this operation, the association gets created in the service network account
     * and the VPC owner account.
     *
     * If you add a security group to the service network and VPC association, the association must
     * continue to always have at least one security group. You can add or edit security groups at
     * any time. However, to remove all security groups, you must first delete the association and
     * recreate it without security groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnServiceNetworkVpcAssociation cfnServiceNetworkVpcAssociation =
     * CfnServiceNetworkVpcAssociation.Builder.create(this, "MyCfnServiceNetworkVpcAssociation")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .serviceNetworkIdentifier("serviceNetworkIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcIdentifier("vpcIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html)
     */
    public inline fun cfnServiceNetworkVpcAssociation(
        scope: Construct,
        id: String,
        block: CfnServiceNetworkVpcAssociationDsl.() -> Unit = {},
    ): CfnServiceNetworkVpcAssociation {
        val builder = CfnServiceNetworkVpcAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServiceNetworkVpcAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnServiceNetworkVpcAssociationProps cfnServiceNetworkVpcAssociationProps =
     * CfnServiceNetworkVpcAssociationProps.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .serviceNetworkIdentifier("serviceNetworkIdentifier")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcIdentifier("vpcIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html)
     */
    public inline fun cfnServiceNetworkVpcAssociationProps(
        block: CfnServiceNetworkVpcAssociationPropsDsl.() -> Unit = {}
    ): CfnServiceNetworkVpcAssociationProps {
        val builder = CfnServiceNetworkVpcAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnService`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
     * .authType("authType")
     * .certificateArn("certificateArn")
     * .customDomainName("customDomainName")
     * .dnsEntry(DnsEntryProperty.builder()
     * .domainName("domainName")
     * .hostedZoneId("hostedZoneId")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html)
     */
    public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
        val builder = CfnServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a target group.
     *
     * A target group is a collection of targets, or compute resources, that run your application or
     * service. A target group can only be used by a single service.
     *
     * For more information, see
     * [Target groups](https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html) in the
     * *Amazon VPC Lattice User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnTargetGroup cfnTargetGroup = CfnTargetGroup.Builder.create(this, "MyCfnTargetGroup")
     * .type("type")
     * // the properties below are optional
     * .config(TargetGroupConfigProperty.builder()
     * .port(123)
     * .protocol("protocol")
     * .vpcIdentifier("vpcIdentifier")
     * // the properties below are optional
     * .healthCheck(HealthCheckConfigProperty.builder()
     * .enabled(false)
     * .healthCheckIntervalSeconds(123)
     * .healthCheckTimeoutSeconds(123)
     * .healthyThresholdCount(123)
     * .matcher(MatcherProperty.builder()
     * .httpCode("httpCode")
     * .build())
     * .path("path")
     * .port(123)
     * .protocol("protocol")
     * .protocolVersion("protocolVersion")
     * .unhealthyThresholdCount(123)
     * .build())
     * .ipAddressType("ipAddressType")
     * .protocolVersion("protocolVersion")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targets(List.of(TargetProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .port(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html)
     */
    public inline fun cfnTargetGroup(
        scope: Construct,
        id: String,
        block: CfnTargetGroupDsl.() -> Unit = {},
    ): CfnTargetGroup {
        val builder = CfnTargetGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The health check configuration of a target group.
     *
     * Health check configurations aren't used for `LAMBDA` and `ALB` target groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
     * .enabled(false)
     * .healthCheckIntervalSeconds(123)
     * .healthCheckTimeoutSeconds(123)
     * .healthyThresholdCount(123)
     * .matcher(MatcherProperty.builder()
     * .httpCode("httpCode")
     * .build())
     * .path("path")
     * .port(123)
     * .protocol("protocol")
     * .protocolVersion("protocolVersion")
     * .unhealthyThresholdCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html)
     */
    public inline fun cfnTargetGroupHealthCheckConfigProperty(
        block: CfnTargetGroupHealthCheckConfigPropertyDsl.() -> Unit = {}
    ): CfnTargetGroup.HealthCheckConfigProperty {
        val builder = CfnTargetGroupHealthCheckConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The codes to use when checking for a successful response from a target for health checks.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * MatcherProperty matcherProperty = MatcherProperty.builder()
     * .httpCode("httpCode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-matcher.html)
     */
    public inline fun cfnTargetGroupMatcherProperty(
        block: CfnTargetGroupMatcherPropertyDsl.() -> Unit = {}
    ): CfnTargetGroup.MatcherProperty {
        val builder = CfnTargetGroupMatcherPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTargetGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * CfnTargetGroupProps cfnTargetGroupProps = CfnTargetGroupProps.builder()
     * .type("type")
     * // the properties below are optional
     * .config(TargetGroupConfigProperty.builder()
     * .port(123)
     * .protocol("protocol")
     * .vpcIdentifier("vpcIdentifier")
     * // the properties below are optional
     * .healthCheck(HealthCheckConfigProperty.builder()
     * .enabled(false)
     * .healthCheckIntervalSeconds(123)
     * .healthCheckTimeoutSeconds(123)
     * .healthyThresholdCount(123)
     * .matcher(MatcherProperty.builder()
     * .httpCode("httpCode")
     * .build())
     * .path("path")
     * .port(123)
     * .protocol("protocol")
     * .protocolVersion("protocolVersion")
     * .unhealthyThresholdCount(123)
     * .build())
     * .ipAddressType("ipAddressType")
     * .protocolVersion("protocolVersion")
     * .build())
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .targets(List.of(TargetProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .port(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html)
     */
    public inline fun cfnTargetGroupProps(
        block: CfnTargetGroupPropsDsl.() -> Unit = {}
    ): CfnTargetGroupProps {
        val builder = CfnTargetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration of a target group.
     *
     * Lambda functions don't support target group configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * TargetGroupConfigProperty targetGroupConfigProperty = TargetGroupConfigProperty.builder()
     * .port(123)
     * .protocol("protocol")
     * .vpcIdentifier("vpcIdentifier")
     * // the properties below are optional
     * .healthCheck(HealthCheckConfigProperty.builder()
     * .enabled(false)
     * .healthCheckIntervalSeconds(123)
     * .healthCheckTimeoutSeconds(123)
     * .healthyThresholdCount(123)
     * .matcher(MatcherProperty.builder()
     * .httpCode("httpCode")
     * .build())
     * .path("path")
     * .port(123)
     * .protocol("protocol")
     * .protocolVersion("protocolVersion")
     * .unhealthyThresholdCount(123)
     * .build())
     * .ipAddressType("ipAddressType")
     * .protocolVersion("protocolVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html)
     */
    public inline fun cfnTargetGroupTargetGroupConfigProperty(
        block: CfnTargetGroupTargetGroupConfigPropertyDsl.() -> Unit = {}
    ): CfnTargetGroup.TargetGroupConfigProperty {
        val builder = CfnTargetGroupTargetGroupConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.vpclattice.*;
     * TargetProperty targetProperty = TargetProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .port(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-target.html)
     */
    public inline fun cfnTargetGroupTargetProperty(
        block: CfnTargetGroupTargetPropertyDsl.() -> Unit = {}
    ): CfnTargetGroup.TargetProperty {
        val builder = CfnTargetGroupTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
