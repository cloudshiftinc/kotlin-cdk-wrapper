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

package io.cloudshiftdev.awscdkdsl.services.shield

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.shield.CfnDRTAccess
import software.amazon.awscdk.services.shield.CfnDRTAccessProps
import software.amazon.awscdk.services.shield.CfnProactiveEngagement
import software.amazon.awscdk.services.shield.CfnProactiveEngagementProps
import software.amazon.awscdk.services.shield.CfnProtection
import software.amazon.awscdk.services.shield.CfnProtectionGroup
import software.amazon.awscdk.services.shield.CfnProtectionGroupProps
import software.amazon.awscdk.services.shield.CfnProtectionProps
import software.constructs.Construct

public object shield {
    /**
     * Provides permissions for the AWS Shield Advanced Shield response team (SRT) to access your
     * account and your resource protections, to help you mitigate potential distributed denial of
     * service (DDoS) attacks.
     *
     * *Configure `AWS::Shield::DRTAccess` for one account*
     *
     * To configure this resource through AWS CloudFormation , you must be subscribed to AWS Shield
     * Advanced . You can subscribe through the
     * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs.
     * For more information, see
     * [Subscribe to AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html)
     * .
     *
     * See example templates for Shield Advanced in AWS CloudFormation at
     * [aws-samples/aws-shield-advanced-examples](https://docs.aws.amazon.com/https://github.com/aws-samples/aws-shield-advanced-examples)
     * .
     *
     * *Configure Shield Advanced using AWS CloudFormation and AWS Firewall Manager*
     *
     * You might be able to use Firewall Manager with AWS CloudFormation to configure Shield
     * Advanced across multiple accounts and protected resources. To do this, your accounts must be
     * part of an organization in AWS Organizations . You can use Firewall Manager to configure
     * Shield Advanced protections for any resource types except for Amazon Route 53 or AWS Global
     * Accelerator .
     *
     * For an example of this, see the one-click configuration guidance published by the AWS
     * technical community at
     * [One-click deployment of Shield Advanced](https://docs.aws.amazon.com/https://youtu.be/LCA3FwMk_QE)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * CfnDRTAccess cfnDRTAccess = CfnDRTAccess.Builder.create(this, "MyCfnDRTAccess")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .logBucketList(List.of("logBucketList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html)
     */
    public inline fun cfnDRTAccess(
        scope: Construct,
        id: String,
        block: CfnDRTAccessDsl.() -> Unit = {},
    ): CfnDRTAccess {
        val builder = CfnDRTAccessDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDRTAccess`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * CfnDRTAccessProps cfnDRTAccessProps = CfnDRTAccessProps.builder()
     * .roleArn("roleArn")
     * // the properties below are optional
     * .logBucketList(List.of("logBucketList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html)
     */
    public inline fun cfnDRTAccessProps(
        block: CfnDRTAccessPropsDsl.() -> Unit = {}
    ): CfnDRTAccessProps {
        val builder = CfnDRTAccessPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about
     * escalations to the SRT and to initiate proactive customer support.
     *
     * To enable proactive engagement, you must be subscribed to the
     * [Business Support plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the
     * [Enterprise Support plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     *
     * *Configure `AWS::Shield::ProactiveEngagement` for one account*
     *
     * To configure this resource through AWS CloudFormation , you must be subscribed to AWS Shield
     * Advanced . You can subscribe through the
     * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs.
     * For more information, see
     * [Subscribe to AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html)
     * .
     *
     * See example templates for Shield Advanced in AWS CloudFormation at
     * [aws-samples/aws-shield-advanced-examples](https://docs.aws.amazon.com/https://github.com/aws-samples/aws-shield-advanced-examples)
     * .
     *
     * *Configure Shield Advanced using AWS CloudFormation and AWS Firewall Manager*
     *
     * You might be able to use Firewall Manager with AWS CloudFormation to configure Shield
     * Advanced across multiple accounts and protected resources. To do this, your accounts must be
     * part of an organization in AWS Organizations . You can use Firewall Manager to configure
     * Shield Advanced protections for any resource types except for Amazon Route 53 or AWS Global
     * Accelerator .
     *
     * For an example of this, see the one-click configuration guidance published by the AWS
     * technical community at
     * [One-click deployment of Shield Advanced](https://docs.aws.amazon.com/https://youtu.be/LCA3FwMk_QE)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * CfnProactiveEngagement cfnProactiveEngagement = CfnProactiveEngagement.Builder.create(this,
     * "MyCfnProactiveEngagement")
     * .emergencyContactList(List.of(EmergencyContactProperty.builder()
     * .emailAddress("emailAddress")
     * // the properties below are optional
     * .contactNotes("contactNotes")
     * .phoneNumber("phoneNumber")
     * .build()))
     * .proactiveEngagementStatus("proactiveEngagementStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html)
     */
    public inline fun cfnProactiveEngagement(
        scope: Construct,
        id: String,
        block: CfnProactiveEngagementDsl.() -> Unit = {},
    ): CfnProactiveEngagement {
        val builder = CfnProactiveEngagementDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contact information that the SRT can use to contact you if you have proactive engagement
     * enabled, for escalations to the SRT and to initiate proactive customer support.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * EmergencyContactProperty emergencyContactProperty = EmergencyContactProperty.builder()
     * .emailAddress("emailAddress")
     * // the properties below are optional
     * .contactNotes("contactNotes")
     * .phoneNumber("phoneNumber")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-proactiveengagement-emergencycontact.html)
     */
    public inline fun cfnProactiveEngagementEmergencyContactProperty(
        block: CfnProactiveEngagementEmergencyContactPropertyDsl.() -> Unit = {}
    ): CfnProactiveEngagement.EmergencyContactProperty {
        val builder = CfnProactiveEngagementEmergencyContactPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProactiveEngagement`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * CfnProactiveEngagementProps cfnProactiveEngagementProps = CfnProactiveEngagementProps.builder()
     * .emergencyContactList(List.of(EmergencyContactProperty.builder()
     * .emailAddress("emailAddress")
     * // the properties below are optional
     * .contactNotes("contactNotes")
     * .phoneNumber("phoneNumber")
     * .build()))
     * .proactiveEngagementStatus("proactiveEngagementStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-proactiveengagement.html)
     */
    public inline fun cfnProactiveEngagementProps(
        block: CfnProactiveEngagementPropsDsl.() -> Unit = {}
    ): CfnProactiveEngagementProps {
        val builder = CfnProactiveEngagementPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Enables AWS Shield Advanced for a specific AWS resource.
     *
     * The resource can be an Amazon CloudFront distribution, Amazon Route 53 hosted zone, AWS
     * Global Accelerator standard accelerator, Elastic IP Address, Application Load Balancer, or a
     * Classic Load Balancer. You can protect Amazon EC2 instances and Network Load Balancers by
     * association with protected Amazon EC2 Elastic IP addresses.
     *
     * *Configure a single `AWS::Shield::Protection`*
     *
     * Use this protection to protect a single resource at a time.
     *
     * To configure this Shield Advanced protection through AWS CloudFormation , you must be
     * subscribed to Shield Advanced . You can subscribe through the
     * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs.
     * For more information, see
     * [Subscribe to AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html)
     * .
     *
     * See example templates for Shield Advanced in AWS CloudFormation at
     * [aws-samples/aws-shield-advanced-examples](https://docs.aws.amazon.com/https://github.com/aws-samples/aws-shield-advanced-examples)
     * .
     *
     * *Configure Shield Advanced using AWS CloudFormation and AWS Firewall Manager*
     *
     * You might be able to use Firewall Manager with AWS CloudFormation to configure Shield
     * Advanced across multiple accounts and protected resources. To do this, your accounts must be
     * part of an organization in AWS Organizations . You can use Firewall Manager to configure
     * Shield Advanced protections for any resource types except for Amazon Route 53 or AWS Global
     * Accelerator .
     *
     * For an example of this, see the one-click configuration guidance published by the AWS
     * technical community at
     * [One-click deployment of Shield Advanced](https://docs.aws.amazon.com/https://youtu.be/LCA3FwMk_QE)
     * .
     *
     * *Configure multiple protections through the Shield Advanced console*
     *
     * You can add protection to multiple resources at once through the
     * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) . For more
     * information see
     * [Getting Started with AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html)
     * and
     * [Managing resource protections in AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-manage-protected-resources.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * Object block;
     * Object count;
     * CfnProtection cfnProtection = CfnProtection.Builder.create(this, "MyCfnProtection")
     * .name("name")
     * .resourceArn("resourceArn")
     * // the properties below are optional
     * .applicationLayerAutomaticResponseConfiguration(ApplicationLayerAutomaticResponseConfigurationProperty.builder()
     * .action(ActionProperty.builder()
     * .block(block)
     * .count(count)
     * .build())
     * .status("status")
     * .build())
     * .healthCheckArns(List.of("healthCheckArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html)
     */
    public inline fun cfnProtection(
        scope: Construct,
        id: String,
        block: CfnProtectionDsl.() -> Unit = {},
    ): CfnProtection {
        val builder = CfnProtectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the action setting that Shield Advanced should use in the AWS WAF rules that it
     * creates on behalf of the protected resource in response to DDoS attacks.
     *
     * You specify this as part of the configuration for the automatic application layer DDoS
     * mitigation feature, when you enable or update automatic mitigation. Shield Advanced creates
     * the AWS WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have
     * associated with the resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * Object block;
     * Object count;
     * ActionProperty actionProperty = ActionProperty.builder()
     * .block(block)
     * .count(count)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-action.html)
     */
    public inline fun cfnProtectionActionProperty(
        block: CfnProtectionActionPropertyDsl.() -> Unit = {}
    ): CfnProtection.ActionProperty {
        val builder = CfnProtectionActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The automatic application layer DDoS mitigation settings for a `Protection` .
     *
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be
     * DDoS attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the guidance for the `AWS::WAFv2::WebACL` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * Object block;
     * Object count;
     * ApplicationLayerAutomaticResponseConfigurationProperty
     * applicationLayerAutomaticResponseConfigurationProperty =
     * ApplicationLayerAutomaticResponseConfigurationProperty.builder()
     * .action(ActionProperty.builder()
     * .block(block)
     * .count(count)
     * .build())
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-applicationlayerautomaticresponseconfiguration.html)
     */
    public inline fun cfnProtectionApplicationLayerAutomaticResponseConfigurationProperty(
        block: CfnProtectionApplicationLayerAutomaticResponseConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty {
        val builder = CfnProtectionApplicationLayerAutomaticResponseConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a grouping of protected resources so they can be handled as a collective.
     *
     * This resource grouping improves the accuracy of detection and reduces false positives.
     *
     * To configure this resource through AWS CloudFormation , you must be subscribed to AWS Shield
     * Advanced . You can subscribe through the
     * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs.
     * For more information, see
     * [Subscribe to AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * CfnProtectionGroup cfnProtectionGroup = CfnProtectionGroup.Builder.create(this,
     * "MyCfnProtectionGroup")
     * .aggregation("aggregation")
     * .pattern("pattern")
     * .protectionGroupId("protectionGroupId")
     * // the properties below are optional
     * .members(List.of("members"))
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html)
     */
    public inline fun cfnProtectionGroup(
        scope: Construct,
        id: String,
        block: CfnProtectionGroupDsl.() -> Unit = {},
    ): CfnProtectionGroup {
        val builder = CfnProtectionGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProtectionGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * CfnProtectionGroupProps cfnProtectionGroupProps = CfnProtectionGroupProps.builder()
     * .aggregation("aggregation")
     * .pattern("pattern")
     * .protectionGroupId("protectionGroupId")
     * // the properties below are optional
     * .members(List.of("members"))
     * .resourceType("resourceType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html)
     */
    public inline fun cfnProtectionGroupProps(
        block: CfnProtectionGroupPropsDsl.() -> Unit = {}
    ): CfnProtectionGroupProps {
        val builder = CfnProtectionGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProtection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.shield.*;
     * Object block;
     * Object count;
     * CfnProtectionProps cfnProtectionProps = CfnProtectionProps.builder()
     * .name("name")
     * .resourceArn("resourceArn")
     * // the properties below are optional
     * .applicationLayerAutomaticResponseConfiguration(ApplicationLayerAutomaticResponseConfigurationProperty.builder()
     * .action(ActionProperty.builder()
     * .block(block)
     * .count(count)
     * .build())
     * .status("status")
     * .build())
     * .healthCheckArns(List.of("healthCheckArns"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html)
     */
    public inline fun cfnProtectionProps(
        block: CfnProtectionPropsDsl.() -> Unit = {}
    ): CfnProtectionProps {
        val builder = CfnProtectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
