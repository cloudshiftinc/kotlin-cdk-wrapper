package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProtection
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.shield.CfnProtection,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /** The automatic application layer DDoS mitigation settings for the protection. */
    public open fun applicationLayerAutomaticResponseConfiguration(): Any? =
        unwrap(this).getApplicationLayerAutomaticResponseConfiguration()

    /** The automatic application layer DDoS mitigation settings for the protection. */
    public open fun applicationLayerAutomaticResponseConfiguration(`value`: IResolvable) {
        unwrap(this)
            .setApplicationLayerAutomaticResponseConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** The automatic application layer DDoS mitigation settings for the protection. */
    public open fun applicationLayerAutomaticResponseConfiguration(
        `value`: ApplicationLayerAutomaticResponseConfigurationProperty
    ) {
        unwrap(this)
            .setApplicationLayerAutomaticResponseConfiguration(
                `value`.let(ApplicationLayerAutomaticResponseConfigurationProperty::unwrap)
            )
    }

    /** The automatic application layer DDoS mitigation settings for the protection. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("436e263b50a5a95995a9795ae7db91a9746693576825798754e01d1c72146b89")
    public open fun applicationLayerAutomaticResponseConfiguration(
        `value`: ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit
    ): Unit =
        applicationLayerAutomaticResponseConfiguration(
            ApplicationLayerAutomaticResponseConfigurationProperty(`value`)
        )

    /** The ARN (Amazon Resource Name) of the new protection. */
    public open fun attrProtectionArn(): String = unwrap(this).getAttrProtectionArn()

    /** The ID of the new protection. */
    public open fun attrProtectionId(): String = unwrap(this).getAttrProtectionId()

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /** The ARN (Amazon Resource Name) of the health check to associate with the protection. */
    public open fun healthCheckArns(): List<String> =
        unwrap(this).getHealthCheckArns() ?: emptyList()

    /** The ARN (Amazon Resource Name) of the health check to associate with the protection. */
    public open fun healthCheckArns(`value`: List<String>) {
        unwrap(this).setHealthCheckArns(`value`)
    }

    /** The ARN (Amazon Resource Name) of the health check to associate with the protection. */
    public open fun healthCheckArns(vararg `value`: String): Unit =
        healthCheckArns(`value`.toList())

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * The name of the protection.
     *
     * For example, `My CloudFront distributions` .
     */
    public open fun name(): String = unwrap(this).getName()

    /**
     * The name of the protection.
     *
     * For example, `My CloudFront distributions` .
     */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** The ARN (Amazon Resource Name) of the AWS resource that is protected. */
    public open fun resourceArn(): String = unwrap(this).getResourceArn()

    /** The ARN (Amazon Resource Name) of the AWS resource that is protected. */
    public open fun resourceArn(`value`: String) {
        unwrap(this).setResourceArn(`value`)
    }

    /** Key:value pairs associated with an AWS resource. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** Key:value pairs associated with an AWS resource. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** Key:value pairs associated with an AWS resource. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.shield.CfnProtection]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The automatic application layer DDoS mitigation settings for the protection.
         *
         * This configuration determines whether Shield Advanced automatically manages rules in the
         * web ACL in order to respond to application layer events that Shield Advanced determines
         * to be DDoS attacks.
         *
         * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
         * automatic mitigation, see the additional guidance about web ACL management in the
         * `AWS::WAFv2::WebACL` resource description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
         *
         * @param applicationLayerAutomaticResponseConfiguration The automatic application layer
         *   DDoS mitigation settings for the protection.
         */
        public fun applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration: IResolvable
        )

        /**
         * The automatic application layer DDoS mitigation settings for the protection.
         *
         * This configuration determines whether Shield Advanced automatically manages rules in the
         * web ACL in order to respond to application layer events that Shield Advanced determines
         * to be DDoS attacks.
         *
         * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
         * automatic mitigation, see the additional guidance about web ACL management in the
         * `AWS::WAFv2::WebACL` resource description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
         *
         * @param applicationLayerAutomaticResponseConfiguration The automatic application layer
         *   DDoS mitigation settings for the protection.
         */
        public fun applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration:
                ApplicationLayerAutomaticResponseConfigurationProperty
        )

        /**
         * The automatic application layer DDoS mitigation settings for the protection.
         *
         * This configuration determines whether Shield Advanced automatically manages rules in the
         * web ACL in order to respond to application layer events that Shield Advanced determines
         * to be DDoS attacks.
         *
         * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
         * automatic mitigation, see the additional guidance about web ACL management in the
         * `AWS::WAFv2::WebACL` resource description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
         *
         * @param applicationLayerAutomaticResponseConfiguration The automatic application layer
         *   DDoS mitigation settings for the protection.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6ad69ea36018550e2d034dd48646a5d76908c61d6c21a95ea72805d7596bf673")
        public fun applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration:
                ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit
        )

        /**
         * The ARN (Amazon Resource Name) of the health check to associate with the protection.
         *
         * Health-based detection provides improved responsiveness and accuracy in attack detection
         * and mitigation.
         *
         * You can use this option with any resource type except for Route 53 hosted zones.
         *
         * For more information, see
         * [Configuring health-based detection using health checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
         * in the *AWS Shield Advanced Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-healthcheckarns)
         *
         * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate
         *   with the protection.
         */
        public fun healthCheckArns(healthCheckArns: List<String>)

        /**
         * The ARN (Amazon Resource Name) of the health check to associate with the protection.
         *
         * Health-based detection provides improved responsiveness and accuracy in attack detection
         * and mitigation.
         *
         * You can use this option with any resource type except for Route 53 hosted zones.
         *
         * For more information, see
         * [Configuring health-based detection using health checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
         * in the *AWS Shield Advanced Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-healthcheckarns)
         *
         * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate
         *   with the protection.
         */
        public fun healthCheckArns(vararg healthCheckArns: String)

        /**
         * The name of the protection. For example, `My CloudFront distributions` .
         *
         * If you change the name of an existing protection, Shield Advanced deletes the protection
         * and replaces it with a new one. While this is happening, the protection isn't available
         * on the AWS resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-name)
         *
         * @param name The name of the protection. For example, `My CloudFront distributions` .
         */
        public fun name(name: String)

        /**
         * The ARN (Amazon Resource Name) of the AWS resource that is protected.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-resourcearn)
         *
         * @param resourceArn The ARN (Amazon Resource Name) of the AWS resource that is protected.
         */
        public fun resourceArn(resourceArn: String)

        /**
         * Key:value pairs associated with an AWS resource.
         *
         * The key:value pair can be anything you define. Typically, the tag key represents a
         * category (such as "environment") and the tag value represents a specific value within
         * that category (such as "test," "development," or "production"). You can add up to 50 tags
         * to each AWS resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-tags)
         *
         * @param tags Key:value pairs associated with an AWS resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Key:value pairs associated with an AWS resource.
         *
         * The key:value pair can be anything you define. Typically, the tag key represents a
         * category (such as "environment") and the tag value represents a specific value within
         * that category (such as "test," "development," or "production"). You can add up to 50 tags
         * to each AWS resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-tags)
         *
         * @param tags Key:value pairs associated with an AWS resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProtection.Builder =
            software.amazon.awscdk.services.shield.CfnProtection.Builder.create(scope, id)

        /**
         * The automatic application layer DDoS mitigation settings for the protection.
         *
         * This configuration determines whether Shield Advanced automatically manages rules in the
         * web ACL in order to respond to application layer events that Shield Advanced determines
         * to be DDoS attacks.
         *
         * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
         * automatic mitigation, see the additional guidance about web ACL management in the
         * `AWS::WAFv2::WebACL` resource description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
         *
         * @param applicationLayerAutomaticResponseConfiguration The automatic application layer
         *   DDoS mitigation settings for the protection.
         */
        override fun applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration: IResolvable
        ) {
            cdkBuilder.applicationLayerAutomaticResponseConfiguration(
                applicationLayerAutomaticResponseConfiguration.let(IResolvable::unwrap)
            )
        }

        /**
         * The automatic application layer DDoS mitigation settings for the protection.
         *
         * This configuration determines whether Shield Advanced automatically manages rules in the
         * web ACL in order to respond to application layer events that Shield Advanced determines
         * to be DDoS attacks.
         *
         * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
         * automatic mitigation, see the additional guidance about web ACL management in the
         * `AWS::WAFv2::WebACL` resource description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
         *
         * @param applicationLayerAutomaticResponseConfiguration The automatic application layer
         *   DDoS mitigation settings for the protection.
         */
        override fun applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration:
                ApplicationLayerAutomaticResponseConfigurationProperty
        ) {
            cdkBuilder.applicationLayerAutomaticResponseConfiguration(
                applicationLayerAutomaticResponseConfiguration.let(
                    ApplicationLayerAutomaticResponseConfigurationProperty::unwrap
                )
            )
        }

        /**
         * The automatic application layer DDoS mitigation settings for the protection.
         *
         * This configuration determines whether Shield Advanced automatically manages rules in the
         * web ACL in order to respond to application layer events that Shield Advanced determines
         * to be DDoS attacks.
         *
         * If you use AWS CloudFormation to manage the web ACLs that you use with Shield Advanced
         * automatic mitigation, see the additional guidance about web ACL management in the
         * `AWS::WAFv2::WebACL` resource description.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration)
         *
         * @param applicationLayerAutomaticResponseConfiguration The automatic application layer
         *   DDoS mitigation settings for the protection.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6ad69ea36018550e2d034dd48646a5d76908c61d6c21a95ea72805d7596bf673")
        override fun applicationLayerAutomaticResponseConfiguration(
            applicationLayerAutomaticResponseConfiguration:
                ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit
        ): Unit =
            applicationLayerAutomaticResponseConfiguration(
                ApplicationLayerAutomaticResponseConfigurationProperty(
                    applicationLayerAutomaticResponseConfiguration
                )
            )

        /**
         * The ARN (Amazon Resource Name) of the health check to associate with the protection.
         *
         * Health-based detection provides improved responsiveness and accuracy in attack detection
         * and mitigation.
         *
         * You can use this option with any resource type except for Route 53 hosted zones.
         *
         * For more information, see
         * [Configuring health-based detection using health checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
         * in the *AWS Shield Advanced Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-healthcheckarns)
         *
         * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate
         *   with the protection.
         */
        override fun healthCheckArns(healthCheckArns: List<String>) {
            cdkBuilder.healthCheckArns(healthCheckArns)
        }

        /**
         * The ARN (Amazon Resource Name) of the health check to associate with the protection.
         *
         * Health-based detection provides improved responsiveness and accuracy in attack detection
         * and mitigation.
         *
         * You can use this option with any resource type except for Route 53 hosted zones.
         *
         * For more information, see
         * [Configuring health-based detection using health checks](https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-health-checks.html)
         * in the *AWS Shield Advanced Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-healthcheckarns)
         *
         * @param healthCheckArns The ARN (Amazon Resource Name) of the health check to associate
         *   with the protection.
         */
        override fun healthCheckArns(vararg healthCheckArns: String): Unit =
            healthCheckArns(healthCheckArns.toList())

        /**
         * The name of the protection. For example, `My CloudFront distributions` .
         *
         * If you change the name of an existing protection, Shield Advanced deletes the protection
         * and replaces it with a new one. While this is happening, the protection isn't available
         * on the AWS resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-name)
         *
         * @param name The name of the protection. For example, `My CloudFront distributions` .
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The ARN (Amazon Resource Name) of the AWS resource that is protected.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-resourcearn)
         *
         * @param resourceArn The ARN (Amazon Resource Name) of the AWS resource that is protected.
         */
        override fun resourceArn(resourceArn: String) {
            cdkBuilder.resourceArn(resourceArn)
        }

        /**
         * Key:value pairs associated with an AWS resource.
         *
         * The key:value pair can be anything you define. Typically, the tag key represents a
         * category (such as "environment") and the tag value represents a specific value within
         * that category (such as "test," "development," or "production"). You can add up to 50 tags
         * to each AWS resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-tags)
         *
         * @param tags Key:value pairs associated with an AWS resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Key:value pairs associated with an AWS resource.
         *
         * The key:value pair can be anything you define. Typically, the tag key represents a
         * category (such as "environment") and the tag value represents a specific value within
         * that category (such as "test," "development," or "production"). You can add up to 50 tags
         * to each AWS resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protection.html#cfn-shield-protection-tags)
         *
         * @param tags Key:value pairs associated with an AWS resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.shield.CfnProtection =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnProtection {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnProtection(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.shield.CfnProtection
        ): CfnProtection = CfnProtection(cdkObject)

        internal fun unwrap(
            wrapped: CfnProtection
        ): software.amazon.awscdk.services.shield.CfnProtection = wrapped.cdkObject
    }

    public interface ApplicationLayerAutomaticResponseConfigurationProperty {
        /**
         * Specifies the action setting that Shield Advanced should use in the AWS WAF rules that it
         * creates on behalf of the protected resource in response to DDoS attacks.
         *
         * You specify this as part of the configuration for the automatic application layer DDoS
         * mitigation feature, when you enable or update automatic mitigation. Shield Advanced
         * creates the AWS WAF rules in a Shield Advanced-managed rule group, inside the web ACL
         * that you have associated with the resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-applicationlayerautomaticresponseconfiguration.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration-action)
         */
        public fun action(): Any

        /**
         * Indicates whether automatic application layer DDoS mitigation is enabled for the
         * protection.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-applicationlayerautomaticresponseconfiguration.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration-status)
         */
        public fun status(): String

        /** A builder for [ApplicationLayerAutomaticResponseConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param action Specifies the action setting that Shield Advanced should use in the AWS
             *   WAF rules that it creates on behalf of the protected resource in response to DDoS
             *   attacks. You specify this as part of the configuration for the automatic
             *   application layer DDoS mitigation feature, when you enable or update automatic
             *   mitigation. Shield Advanced creates the AWS WAF rules in a Shield Advanced-managed
             *   rule group, inside the web ACL that you have associated with the resource.
             */
            public fun action(action: IResolvable)

            /**
             * @param action Specifies the action setting that Shield Advanced should use in the AWS
             *   WAF rules that it creates on behalf of the protected resource in response to DDoS
             *   attacks. You specify this as part of the configuration for the automatic
             *   application layer DDoS mitigation feature, when you enable or update automatic
             *   mitigation. Shield Advanced creates the AWS WAF rules in a Shield Advanced-managed
             *   rule group, inside the web ACL that you have associated with the resource.
             */
            public fun action(action: ActionProperty)

            /**
             * @param action Specifies the action setting that Shield Advanced should use in the AWS
             *   WAF rules that it creates on behalf of the protected resource in response to DDoS
             *   attacks. You specify this as part of the configuration for the automatic
             *   application layer DDoS mitigation feature, when you enable or update automatic
             *   mitigation. Shield Advanced creates the AWS WAF rules in a Shield Advanced-managed
             *   rule group, inside the web ACL that you have associated with the resource.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("eacdaaffff023b14a9cce4f48634923c2822f0a133865877fdb6951c765f722f")
            public fun action(action: ActionProperty.Builder.() -> Unit)

            /**
             * @param status Indicates whether automatic application layer DDoS mitigation is
             *   enabled for the protection.
             */
            public fun status(status: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.Builder =
                software.amazon.awscdk.services.shield.CfnProtection
                    .ApplicationLayerAutomaticResponseConfigurationProperty
                    .builder()

            /**
             * @param action Specifies the action setting that Shield Advanced should use in the AWS
             *   WAF rules that it creates on behalf of the protected resource in response to DDoS
             *   attacks. You specify this as part of the configuration for the automatic
             *   application layer DDoS mitigation feature, when you enable or update automatic
             *   mitigation. Shield Advanced creates the AWS WAF rules in a Shield Advanced-managed
             *   rule group, inside the web ACL that you have associated with the resource.
             */
            override fun action(action: IResolvable) {
                cdkBuilder.action(action.let(IResolvable::unwrap))
            }

            /**
             * @param action Specifies the action setting that Shield Advanced should use in the AWS
             *   WAF rules that it creates on behalf of the protected resource in response to DDoS
             *   attacks. You specify this as part of the configuration for the automatic
             *   application layer DDoS mitigation feature, when you enable or update automatic
             *   mitigation. Shield Advanced creates the AWS WAF rules in a Shield Advanced-managed
             *   rule group, inside the web ACL that you have associated with the resource.
             */
            override fun action(action: ActionProperty) {
                cdkBuilder.action(action.let(ActionProperty::unwrap))
            }

            /**
             * @param action Specifies the action setting that Shield Advanced should use in the AWS
             *   WAF rules that it creates on behalf of the protected resource in response to DDoS
             *   attacks. You specify this as part of the configuration for the automatic
             *   application layer DDoS mitigation feature, when you enable or update automatic
             *   mitigation. Shield Advanced creates the AWS WAF rules in a Shield Advanced-managed
             *   rule group, inside the web ACL that you have associated with the resource.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("eacdaaffff023b14a9cce4f48634923c2822f0a133865877fdb6951c765f722f")
            override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
                action(ActionProperty(action))

            /**
             * @param status Indicates whether automatic application layer DDoS mitigation is
             *   enabled for the protection.
             */
            override fun status(status: String) {
                cdkBuilder.status(status)
            }

            public fun build():
                software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty,
        ) : ApplicationLayerAutomaticResponseConfigurationProperty {
            /**
             * Specifies the action setting that Shield Advanced should use in the AWS WAF rules
             * that it creates on behalf of the protected resource in response to DDoS attacks.
             *
             * You specify this as part of the configuration for the automatic application layer
             * DDoS mitigation feature, when you enable or update automatic mitigation. Shield
             * Advanced creates the AWS WAF rules in a Shield Advanced-managed rule group, inside
             * the web ACL that you have associated with the resource.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-applicationlayerautomaticresponseconfiguration.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration-action)
             */
            override fun action(): Any = unwrap(this).getAction()

            /**
             * Indicates whether automatic application layer DDoS mitigation is enabled for the
             * protection.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-applicationlayerautomaticresponseconfiguration.html#cfn-shield-protection-applicationlayerautomaticresponseconfiguration-status)
             */
            override fun status(): String = unwrap(this).getStatus()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ApplicationLayerAutomaticResponseConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty
            ): ApplicationLayerAutomaticResponseConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ApplicationLayerAutomaticResponseConfigurationProperty
            ): software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ActionProperty {
        /**
         * Specifies that Shield Advanced should configure its AWS WAF rules with the AWS WAF
         * `Block` action.
         *
         * You must specify exactly one action, either `Block` or `Count` .
         *
         * Example JSON: `{ "Block": {} }`
         *
         * Example YAML: `Block: {}`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-action.html#cfn-shield-protection-action-block)
         */
        public fun block(): Any? = unwrap(this).getBlock()

        /**
         * Specifies that Shield Advanced should configure its AWS WAF rules with the AWS WAF
         * `Count` action.
         *
         * You must specify exactly one action, either `Block` or `Count` .
         *
         * Example JSON: `{ "Count": {} }`
         *
         * Example YAML: `Count: {}`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-action.html#cfn-shield-protection-action-count)
         */
        public fun count(): Any? = unwrap(this).getCount()

        /** A builder for [ActionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param block Specifies that Shield Advanced should configure its AWS WAF rules with
             *   the AWS WAF `Block` action. You must specify exactly one action, either `Block` or
             *   `Count` .
             *
             * Example JSON: `{ "Block": {} }`
             *
             * Example YAML: `Block: {}`
             */
            public fun block(block: Any)

            /**
             * @param count Specifies that Shield Advanced should configure its AWS WAF rules with
             *   the AWS WAF `Count` action. You must specify exactly one action, either `Block` or
             *   `Count` .
             *
             * Example JSON: `{ "Count": {} }`
             *
             * Example YAML: `Count: {}`
             */
            public fun count(count: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.shield.CfnProtection.ActionProperty.Builder =
                software.amazon.awscdk.services.shield.CfnProtection.ActionProperty.builder()

            /**
             * @param block Specifies that Shield Advanced should configure its AWS WAF rules with
             *   the AWS WAF `Block` action. You must specify exactly one action, either `Block` or
             *   `Count` .
             *
             * Example JSON: `{ "Block": {} }`
             *
             * Example YAML: `Block: {}`
             */
            override fun block(block: Any) {
                cdkBuilder.block(block)
            }

            /**
             * @param count Specifies that Shield Advanced should configure its AWS WAF rules with
             *   the AWS WAF `Count` action. You must specify exactly one action, either `Block` or
             *   `Count` .
             *
             * Example JSON: `{ "Count": {} }`
             *
             * Example YAML: `Count: {}`
             */
            override fun count(count: Any) {
                cdkBuilder.count(count)
            }

            public fun build():
                software.amazon.awscdk.services.shield.CfnProtection.ActionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.shield.CfnProtection.ActionProperty,
        ) : ActionProperty {
            /**
             * Specifies that Shield Advanced should configure its AWS WAF rules with the AWS WAF
             * `Block` action.
             *
             * You must specify exactly one action, either `Block` or `Count` .
             *
             * Example JSON: `{ "Block": {} }`
             *
             * Example YAML: `Block: {}`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-action.html#cfn-shield-protection-action-block)
             */
            override fun block(): Any? = unwrap(this).getBlock()

            /**
             * Specifies that Shield Advanced should configure its AWS WAF rules with the AWS WAF
             * `Count` action.
             *
             * You must specify exactly one action, either `Block` or `Count` .
             *
             * Example JSON: `{ "Count": {} }`
             *
             * Example YAML: `Count: {}`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-shield-protection-action.html#cfn-shield-protection-action-count)
             */
            override fun count(): Any? = unwrap(this).getCount()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.shield.CfnProtection.ActionProperty
            ): ActionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ActionProperty
            ): software.amazon.awscdk.services.shield.CfnProtection.ActionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
