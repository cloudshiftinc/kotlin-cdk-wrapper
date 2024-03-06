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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.shield.CfnProtection
import software.constructs.Construct

/**
 * Enables AWS Shield Advanced for a specific AWS resource.
 *
 * The resource can be an Amazon CloudFront distribution, Amazon Route 53 hosted zone, AWS Global
 * Accelerator standard accelerator, Elastic IP Address, Application Load Balancer, or a Classic
 * Load Balancer. You can protect Amazon EC2 instances and Network Load Balancers by association
 * with protected Amazon EC2 Elastic IP addresses.
 *
 * *Configure a single `AWS::Shield::Protection`*
 *
 * Use this protection to protect a single resource at a time.
 *
 * To configure this Shield Advanced protection through AWS CloudFormation , you must be subscribed
 * to Shield Advanced . You can subscribe through the
 * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs. For
 * more information, see
 * [Subscribe to AWS Shield Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html)
 * .
 *
 * See example templates for Shield Advanced in AWS CloudFormation at
 * [aws-samples/aws-shield-advanced-examples](https://docs.aws.amazon.com/https://github.com/aws-samples/aws-shield-advanced-examples)
 * .
 *
 * *Configure Shield Advanced using AWS CloudFormation and AWS Firewall Manager*
 *
 * You might be able to use Firewall Manager with AWS CloudFormation to configure Shield Advanced
 * across multiple accounts and protected resources. To do this, your accounts must be part of an
 * organization in AWS Organizations . You can use Firewall Manager to configure Shield Advanced
 * protections for any resource types except for Amazon Route 53 or AWS Global Accelerator .
 *
 * For an example of this, see the one-click configuration guidance published by the AWS technical
 * community at
 * [One-click deployment of Shield Advanced](https://docs.aws.amazon.com/https://youtu.be/LCA3FwMk_QE)
 * .
 *
 * *Configure multiple protections through the Shield Advanced console*
 *
 * You can add protection to multiple resources at once through the
 * [Shield Advanced console](https://docs.aws.amazon.com/wafv2/shieldv2#/) . For more information
 * see
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
@CdkDslMarker
public class CfnProtectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProtection.Builder = CfnProtection.Builder.create(scope, id)

    private val _healthCheckArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The automatic application layer DDoS mitigation settings for the protection.
     *
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be
     * DDoS attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
     *
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     *   mitigation settings for the protection.
     */
    public fun applicationLayerAutomaticResponseConfiguration(
        applicationLayerAutomaticResponseConfiguration: IResolvable
    ) {
        cdkBuilder.applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration
        )
    }

    /**
     * The automatic application layer DDoS mitigation settings for the protection.
     *
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be
     * DDoS attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
     *
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     *   mitigation settings for the protection.
     */
    public fun applicationLayerAutomaticResponseConfiguration(
        applicationLayerAutomaticResponseConfiguration:
            CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty
    ) {
        cdkBuilder.applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration
        )
    }

    /**
     * The ARN (Amazon Resource Name) of the health check to associate with the protection.
     *
     * Health-based detection provides improved responsiveness and accuracy in attack detection and
     * mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see
     * [Configuring health-based detection using health checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-healthcheckarns)
     *
     * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate with
     *   the protection.
     */
    public fun healthCheckArns(vararg healthCheckArns: String) {
        _healthCheckArns.addAll(listOf(*healthCheckArns))
    }

    /**
     * The ARN (Amazon Resource Name) of the health check to associate with the protection.
     *
     * Health-based detection provides improved responsiveness and accuracy in attack detection and
     * mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see
     * [Configuring health-based detection using health checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-healthcheckarns)
     *
     * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate with
     *   the protection.
     */
    public fun healthCheckArns(healthCheckArns: Collection<String>) {
        _healthCheckArns.addAll(healthCheckArns)
    }

    /**
     * The name of the protection. For example, `My CloudFront distributions` .
     *
     * If you change the name of an existing protection, Shield Advanced deletes the protection and
     * replaces it with a new one. While this is happening, the protection isn't available on the
     * AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-name)
     *
     * @param name The name of the protection. For example, `My CloudFront distributions` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-resourcearn)
     *
     * @param resourceArn The ARN (Amazon Resource Name) of the AWS resource that is protected.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each AWS
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-tags)
     *
     * @param tags Key:value pairs associated with an AWS resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each AWS
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-tags)
     *
     * @param tags Key:value pairs associated with an AWS resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProtection {
        if (_healthCheckArns.isNotEmpty()) cdkBuilder.healthCheckArns(_healthCheckArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
