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
import software.amazon.awscdk.services.shield.CfnProtectionProps

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
@CdkDslMarker
public class CfnProtectionPropsDsl {
    private val cdkBuilder: CfnProtectionProps.Builder = CfnProtectionProps.builder()

    private val _healthCheckArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     *   mitigation settings for the protection. This configuration determines whether Shield
     *   Advanced automatically manages rules in the web ACL in order to respond to application
     *   layer events that Shield Advanced determines to be DDoS attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     */
    public fun applicationLayerAutomaticResponseConfiguration(
        applicationLayerAutomaticResponseConfiguration: IResolvable
    ) {
        cdkBuilder.applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration
        )
    }

    /**
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     *   mitigation settings for the protection. This configuration determines whether Shield
     *   Advanced automatically manages rules in the web ACL in order to respond to application
     *   layer events that Shield Advanced determines to be DDoS attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
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
     * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate with
     *   the protection. Health-based detection provides improved responsiveness and accuracy in
     *   attack detection and mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see
     * [Configuring health-based detection using health checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     */
    public fun healthCheckArns(vararg healthCheckArns: String) {
        _healthCheckArns.addAll(listOf(*healthCheckArns))
    }

    /**
     * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate with
     *   the protection. Health-based detection provides improved responsiveness and accuracy in
     *   attack detection and mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see
     * [Configuring health-based detection using health checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     */
    public fun healthCheckArns(healthCheckArns: Collection<String>) {
        _healthCheckArns.addAll(healthCheckArns)
    }

    /**
     * @param name The name of the protection. For example, `My CloudFront distributions` .
     *
     * If you change the name of an existing protection, Shield Advanced deletes the protection and
     * replaces it with a new one. While this is happening, the protection isn't available on the
     * AWS resource.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param resourceArn The ARN (Amazon Resource Name) of the AWS resource that is protected. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource. The key:value pair can be
     *   anything you define. Typically, the tag key represents a category (such as "environment")
     *   and the tag value represents a specific value within that category (such as "test,"
     *   "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource. The key:value pair can be
     *   anything you define. Typically, the tag key represents a category (such as "environment")
     *   and the tag value represents a specific value within that category (such as "test,"
     *   "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProtectionProps {
        if (_healthCheckArns.isNotEmpty()) cdkBuilder.healthCheckArns(_healthCheckArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
