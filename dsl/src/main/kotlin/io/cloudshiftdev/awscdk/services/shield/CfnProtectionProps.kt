package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProtectionProps {
  /**
   * The automatic application layer DDoS mitigation settings for the protection.
   *
   * This configuration determines whether Shield Advanced automatically manages rules in the web
   * ACL in order to respond to application layer events that Shield Advanced determines to be DDoS
   * attacks.
   *
   * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
   * automatic mitigation, see the additional guidance about web ACL management in the
   * `AWS::WAFv2::WebACL` resource description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
   */
  public fun applicationLayerAutomaticResponseConfiguration(): Any? =
      unwrap(this).getApplicationLayerAutomaticResponseConfiguration()

  /**
   * The ARN (Amazon Resource Name) of the health check to associate with the protection.
   *
   * Health-based detection provides improved responsiveness and accuracy in attack detection and
   * mitigation.
   *
   * You can use this option with any resource type except for Route 53 hosted zones.
   *
   * For more information, see [Configuring health-based detection using health
   * checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html) in
   * the *AWS Shield Advanced Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-healthcheckarns)
   */
  public fun healthCheckArns(): List<String> = unwrap(this).getHealthCheckArns() ?: emptyList()

  /**
   * The name of the protection. For example, `My CloudFront distributions` .
   *
   *
   * If you change the name of an existing protection, Shield Advanced deletes the protection and
   * replaces it with a new one. While this is happening, the protection isn't available on the AWS
   * resource.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-name)
   */
  public fun name(): String

  /**
   * The ARN (Amazon Resource Name) of the AWS resource that is protected.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * Key:value pairs associated with an AWS resource.
   *
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProtectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     * mitigation settings for the protection.
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be DDoS
     * attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     */
    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: IResolvable)

    /**
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     * mitigation settings for the protection.
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be DDoS
     * attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     */
    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty)

    /**
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     * mitigation settings for the protection.
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be DDoS
     * attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11e0d509d4ff54e73473ccedba610367533f211ef77087a90bb4aae15a31ff6c")
    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit)

    /**
     * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate with
     * the protection.
     * Health-based detection provides improved responsiveness and accuracy in attack detection and
     * mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see [Configuring health-based detection using health
     * checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     */
    public fun healthCheckArns(healthCheckArns: List<String>)

    /**
     * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate with
     * the protection.
     * Health-based detection provides improved responsiveness and accuracy in attack detection and
     * mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see [Configuring health-based detection using health
     * checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     */
    public fun healthCheckArns(vararg healthCheckArns: String)

    /**
     * @param name The name of the protection. For example, `My CloudFront distributions` . 
     *
     * If you change the name of an existing protection, Shield Advanced deletes the protection and
     * replaces it with a new one. While this is happening, the protection isn't available on the AWS
     * resource.
     */
    public fun name(name: String)

    /**
     * @param resourceArn The ARN (Amazon Resource Name) of the AWS resource that is protected. 
     */
    public fun resourceArn(resourceArn: String)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProtectionProps.Builder =
        software.amazon.awscdk.services.shield.CfnProtectionProps.builder()

    /**
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     * mitigation settings for the protection.
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be DDoS
     * attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     */
    override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: IResolvable) {
      cdkBuilder.applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     * mitigation settings for the protection.
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be DDoS
     * attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     */
    override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty) {
      cdkBuilder.applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration.let(CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty::unwrap))
    }

    /**
     * @param applicationLayerAutomaticResponseConfiguration The automatic application layer DDoS
     * mitigation settings for the protection.
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be DDoS
     * attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11e0d509d4ff54e73473ccedba610367533f211ef77087a90bb4aae15a31ff6c")
    override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationLayerAutomaticResponseConfiguration(CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty(applicationLayerAutomaticResponseConfiguration))

    /**
     * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate with
     * the protection.
     * Health-based detection provides improved responsiveness and accuracy in attack detection and
     * mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see [Configuring health-based detection using health
     * checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     */
    override fun healthCheckArns(healthCheckArns: List<String>) {
      cdkBuilder.healthCheckArns(healthCheckArns)
    }

    /**
     * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate with
     * the protection.
     * Health-based detection provides improved responsiveness and accuracy in attack detection and
     * mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see [Configuring health-based detection using health
     * checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     */
    override fun healthCheckArns(vararg healthCheckArns: String): Unit =
        healthCheckArns(healthCheckArns.toList())

    /**
     * @param name The name of the protection. For example, `My CloudFront distributions` . 
     *
     * If you change the name of an existing protection, Shield Advanced deletes the protection and
     * replaces it with a new one. While this is happening, the protection isn't available on the AWS
     * resource.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resourceArn The ARN (Amazon Resource Name) of the AWS resource that is protected. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.shield.CfnProtectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.shield.CfnProtectionProps,
  ) : CdkObject(cdkObject), CfnProtectionProps {
    /**
     * The automatic application layer DDoS mitigation settings for the protection.
     *
     * This configuration determines whether Shield Advanced automatically manages rules in the web
     * ACL in order to respond to application layer events that Shield Advanced determines to be DDoS
     * attacks.
     *
     * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
     * automatic mitigation, see the additional guidance about web ACL management in the
     * `AWS::WAFv2::WebACL` resource description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
     */
    override fun applicationLayerAutomaticResponseConfiguration(): Any? =
        unwrap(this).getApplicationLayerAutomaticResponseConfiguration()

    /**
     * The ARN (Amazon Resource Name) of the health check to associate with the protection.
     *
     * Health-based detection provides improved responsiveness and accuracy in attack detection and
     * mitigation.
     *
     * You can use this option with any resource type except for Route 53 hosted zones.
     *
     * For more information, see [Configuring health-based detection using health
     * checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
     * in the *AWS Shield Advanced Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-healthcheckarns)
     */
    override fun healthCheckArns(): List<String> = unwrap(this).getHealthCheckArns() ?: emptyList()

    /**
     * The name of the protection. For example, `My CloudFront distributions` .
     *
     *
     * If you change the name of an existing protection, Shield Advanced deletes the protection and
     * replaces it with a new one. While this is happening, the protection isn't available on the AWS
     * resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProtectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtectionProps):
        CfnProtectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProtectionProps):
        software.amazon.awscdk.services.shield.CfnProtectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.shield.CfnProtectionProps
  }
}
