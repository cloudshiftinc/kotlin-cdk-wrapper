package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListener
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener,
) : CfnResource(cdkObject), IInspectable {
    /** [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy. */
    public open fun alpnPolicy(): List<String> = unwrap(this).getAlpnPolicy() ?: emptyList()

    /** [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy. */
    public open fun alpnPolicy(`value`: List<String>) {
        unwrap(this).setAlpnPolicy(`value`)
    }

    /** [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy. */
    public open fun alpnPolicy(vararg `value`: String): Unit = alpnPolicy(`value`.toList())

    /** The Amazon Resource Name (ARN) of the listener. */
    public open fun attrListenerArn(): String = unwrap(this).getAttrListenerArn()

    /** The default SSL server certificate for a secure listener. */
    public open fun certificates(): Any? = unwrap(this).getCertificates()

    /** The default SSL server certificate for a secure listener. */
    public open fun certificates(`value`: IResolvable) {
        unwrap(this).setCertificates(`value`.let(IResolvable::unwrap))
    }

    /** The default SSL server certificate for a secure listener. */
    public open fun certificates(__idx_ac66f0: List<Any>) {
        unwrap(this).setCertificates(__idx_ac66f0)
    }

    /** The default SSL server certificate for a secure listener. */
    public open fun certificates(vararg __idx_ac66f0: Any): Unit =
        certificates(__idx_ac66f0.toList())

    /**
     * The actions for the default rule.
     *
     * You cannot define a condition for a default rule.
     */
    public open fun defaultActions(): Any = unwrap(this).getDefaultActions()

    /**
     * The actions for the default rule.
     *
     * You cannot define a condition for a default rule.
     */
    public open fun defaultActions(`value`: IResolvable) {
        unwrap(this).setDefaultActions(`value`.let(IResolvable::unwrap))
    }

    /**
     * The actions for the default rule.
     *
     * You cannot define a condition for a default rule.
     */
    public open fun defaultActions(__idx_ac66f0: List<Any>) {
        unwrap(this).setDefaultActions(__idx_ac66f0)
    }

    /**
     * The actions for the default rule.
     *
     * You cannot define a condition for a default rule.
     */
    public open fun defaultActions(vararg __idx_ac66f0: Any): Unit =
        defaultActions(__idx_ac66f0.toList())

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The Amazon Resource Name (ARN) of the load balancer. */
    public open fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    /** The Amazon Resource Name (ARN) of the load balancer. */
    public open fun loadBalancerArn(`value`: String) {
        unwrap(this).setLoadBalancerArn(`value`)
    }

    /** The mutual authentication configuration information. */
    public open fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

    /** The mutual authentication configuration information. */
    public open fun mutualAuthentication(`value`: IResolvable) {
        unwrap(this).setMutualAuthentication(`value`.let(IResolvable::unwrap))
    }

    /** The mutual authentication configuration information. */
    public open fun mutualAuthentication(`value`: MutualAuthenticationProperty) {
        unwrap(this).setMutualAuthentication(`value`.let(MutualAuthenticationProperty::unwrap))
    }

    /** The mutual authentication configuration information. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c9e407a19512c871db899a37b3eb962268ef3790578f834e35f148510992c13")
    public open fun mutualAuthentication(
        `value`: MutualAuthenticationProperty.Builder.() -> Unit
    ): Unit = mutualAuthentication(MutualAuthenticationProperty(`value`))

    /** The port on which the load balancer is listening. */
    public open fun port(): Number? = unwrap(this).getPort()

    /** The port on which the load balancer is listening. */
    public open fun port(`value`: Number) {
        unwrap(this).setPort(`value`)
    }

    /** The protocol for connections from clients to the load balancer. */
    public open fun protocol(): String? = unwrap(this).getProtocol()

    /** The protocol for connections from clients to the load balancer. */
    public open fun protocol(`value`: String) {
        unwrap(this).setProtocol(`value`)
    }

    /**
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are
     * supported.
     */
    public open fun sslPolicy(): String? = unwrap(this).getSslPolicy()

    /**
     * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are
     * supported.
     */
    public open fun sslPolicy(`value`: String) {
        unwrap(this).setSslPolicy(`value`)
    }

    /**
     * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.CfnListener].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
         *
         * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
         *   (ALPN) policy.
         */
        public fun alpnPolicy(alpnPolicy: List<String>)

        /**
         * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
         *
         * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
         *   (ALPN) policy.
         */
        public fun alpnPolicy(vararg alpnPolicy: String)

        /**
         * The default SSL server certificate for a secure listener.
         *
         * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
         *
         * To create a certificate list for a secure listener, use
         * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * @param certificates The default SSL server certificate for a secure listener.
         */
        public fun certificates(certificates: IResolvable)

        /**
         * The default SSL server certificate for a secure listener.
         *
         * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
         *
         * To create a certificate list for a secure listener, use
         * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * @param certificates The default SSL server certificate for a secure listener.
         */
        public fun certificates(certificates: List<Any>)

        /**
         * The default SSL server certificate for a secure listener.
         *
         * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
         *
         * To create a certificate list for a secure listener, use
         * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * @param certificates The default SSL server certificate for a secure listener.
         */
        public fun certificates(vararg certificates: Any)

        /**
         * The actions for the default rule. You cannot define a condition for a default rule.
         *
         * To create additional rules for an Application Load Balancer, use
         * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * @param defaultActions The actions for the default rule. You cannot define a condition for
         *   a default rule.
         */
        public fun defaultActions(defaultActions: IResolvable)

        /**
         * The actions for the default rule. You cannot define a condition for a default rule.
         *
         * To create additional rules for an Application Load Balancer, use
         * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * @param defaultActions The actions for the default rule. You cannot define a condition for
         *   a default rule.
         */
        public fun defaultActions(defaultActions: List<Any>)

        /**
         * The actions for the default rule. You cannot define a condition for a default rule.
         *
         * To create additional rules for an Application Load Balancer, use
         * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * @param defaultActions The actions for the default rule. You cannot define a condition for
         *   a default rule.
         */
        public fun defaultActions(vararg defaultActions: Any)

        /**
         * The Amazon Resource Name (ARN) of the load balancer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
         *
         * @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer.
         */
        public fun loadBalancerArn(loadBalancerArn: String)

        /**
         * The mutual authentication configuration information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-mutualauthentication)
         *
         * @param mutualAuthentication The mutual authentication configuration information.
         */
        public fun mutualAuthentication(mutualAuthentication: IResolvable)

        /**
         * The mutual authentication configuration information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-mutualauthentication)
         *
         * @param mutualAuthentication The mutual authentication configuration information.
         */
        public fun mutualAuthentication(mutualAuthentication: MutualAuthenticationProperty)

        /**
         * The mutual authentication configuration information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-mutualauthentication)
         *
         * @param mutualAuthentication The mutual authentication configuration information.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("01c5e9974f3e8e426d9a6c1f4b1089bd12c1c53d8336253e472d8a2e4cc5077c")
        public fun mutualAuthentication(
            mutualAuthentication: MutualAuthenticationProperty.Builder.() -> Unit
        )

        /**
         * The port on which the load balancer is listening.
         *
         * You cannot specify a port for a Gateway Load Balancer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port)
         *
         * @param port The port on which the load balancer is listening.
         */
        public fun port(port: Number)

        /**
         * The protocol for connections from clients to the load balancer.
         *
         * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network
         * Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify
         * the UDP or TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol
         * for a Gateway Load Balancer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
         *
         * @param protocol The protocol for connections from clients to the load balancer.
         */
        public fun protocol(protocol: String)

        /**
         * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers
         * are supported.
         *
         * For more information, see
         * [Security policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)
         * in the *Application Load Balancers Guide* and
         * [Security policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies)
         * in the *Network Load Balancers Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy)
         *
         * @param sslPolicy [HTTPS and TLS listeners] The security policy that defines which
         *   protocols and ciphers are supported.
         */
        public fun sslPolicy(sslPolicy: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.Builder =
            software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.Builder.create(
                scope,
                id
            )

        /**
         * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
         *
         * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
         *   (ALPN) policy.
         */
        override fun alpnPolicy(alpnPolicy: List<String>) {
            cdkBuilder.alpnPolicy(alpnPolicy)
        }

        /**
         * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-alpnpolicy)
         *
         * @param alpnPolicy [TLS listener] The name of the Application-Layer Protocol Negotiation
         *   (ALPN) policy.
         */
        override fun alpnPolicy(vararg alpnPolicy: String): Unit = alpnPolicy(alpnPolicy.toList())

        /**
         * The default SSL server certificate for a secure listener.
         *
         * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
         *
         * To create a certificate list for a secure listener, use
         * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * @param certificates The default SSL server certificate for a secure listener.
         */
        override fun certificates(certificates: IResolvable) {
            cdkBuilder.certificates(certificates.let(IResolvable::unwrap))
        }

        /**
         * The default SSL server certificate for a secure listener.
         *
         * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
         *
         * To create a certificate list for a secure listener, use
         * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * @param certificates The default SSL server certificate for a secure listener.
         */
        override fun certificates(certificates: List<Any>) {
            cdkBuilder.certificates(certificates)
        }

        /**
         * The default SSL server certificate for a secure listener.
         *
         * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
         *
         * To create a certificate list for a secure listener, use
         * [AWS::ElasticLoadBalancingV2::ListenerCertificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates)
         *
         * @param certificates The default SSL server certificate for a secure listener.
         */
        override fun certificates(vararg certificates: Any): Unit =
            certificates(certificates.toList())

        /**
         * The actions for the default rule. You cannot define a condition for a default rule.
         *
         * To create additional rules for an Application Load Balancer, use
         * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * @param defaultActions The actions for the default rule. You cannot define a condition for
         *   a default rule.
         */
        override fun defaultActions(defaultActions: IResolvable) {
            cdkBuilder.defaultActions(defaultActions.let(IResolvable::unwrap))
        }

        /**
         * The actions for the default rule. You cannot define a condition for a default rule.
         *
         * To create additional rules for an Application Load Balancer, use
         * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * @param defaultActions The actions for the default rule. You cannot define a condition for
         *   a default rule.
         */
        override fun defaultActions(defaultActions: List<Any>) {
            cdkBuilder.defaultActions(defaultActions)
        }

        /**
         * The actions for the default rule. You cannot define a condition for a default rule.
         *
         * To create additional rules for an Application Load Balancer, use
         * [AWS::ElasticLoadBalancingV2::ListenerRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions)
         *
         * @param defaultActions The actions for the default rule. You cannot define a condition for
         *   a default rule.
         */
        override fun defaultActions(vararg defaultActions: Any): Unit =
            defaultActions(defaultActions.toList())

        /**
         * The Amazon Resource Name (ARN) of the load balancer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn)
         *
         * @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer.
         */
        override fun loadBalancerArn(loadBalancerArn: String) {
            cdkBuilder.loadBalancerArn(loadBalancerArn)
        }

        /**
         * The mutual authentication configuration information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-mutualauthentication)
         *
         * @param mutualAuthentication The mutual authentication configuration information.
         */
        override fun mutualAuthentication(mutualAuthentication: IResolvable) {
            cdkBuilder.mutualAuthentication(mutualAuthentication.let(IResolvable::unwrap))
        }

        /**
         * The mutual authentication configuration information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-mutualauthentication)
         *
         * @param mutualAuthentication The mutual authentication configuration information.
         */
        override fun mutualAuthentication(mutualAuthentication: MutualAuthenticationProperty) {
            cdkBuilder.mutualAuthentication(
                mutualAuthentication.let(MutualAuthenticationProperty::unwrap)
            )
        }

        /**
         * The mutual authentication configuration information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-mutualauthentication)
         *
         * @param mutualAuthentication The mutual authentication configuration information.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("01c5e9974f3e8e426d9a6c1f4b1089bd12c1c53d8336253e472d8a2e4cc5077c")
        override fun mutualAuthentication(
            mutualAuthentication: MutualAuthenticationProperty.Builder.() -> Unit
        ): Unit = mutualAuthentication(MutualAuthenticationProperty(mutualAuthentication))

        /**
         * The port on which the load balancer is listening.
         *
         * You cannot specify a port for a Gateway Load Balancer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port)
         *
         * @param port The port on which the load balancer is listening.
         */
        override fun port(port: Number) {
            cdkBuilder.port(port)
        }

        /**
         * The protocol for connections from clients to the load balancer.
         *
         * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network
         * Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify
         * the UDP or TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol
         * for a Gateway Load Balancer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol)
         *
         * @param protocol The protocol for connections from clients to the load balancer.
         */
        override fun protocol(protocol: String) {
            cdkBuilder.protocol(protocol)
        }

        /**
         * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers
         * are supported.
         *
         * For more information, see
         * [Security policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)
         * in the *Application Load Balancers Guide* and
         * [Security policies](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/create-tls-listener.html#describe-ssl-policies)
         * in the *Network Load Balancers Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy)
         *
         * @param sslPolicy [HTTPS and TLS listeners] The security policy that defines which
         *   protocols and ciphers are supported.
         */
        override fun sslPolicy(sslPolicy: String) {
            cdkBuilder.sslPolicy(sslPolicy)
        }

        public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnListener {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnListener(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
        ): CfnListener = CfnListener(cdkObject)

        internal fun unwrap(
            wrapped: CfnListener
        ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener = wrapped.cdkObject
    }

    public interface MutualAuthenticationProperty {
        /**
         * Indicates whether expired client certificates are ignored.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-mutualauthentication.html#cfn-elasticloadbalancingv2-listener-mutualauthentication-ignoreclientcertificateexpiry)
         */
        public fun ignoreClientCertificateExpiry(): Any? =
            unwrap(this).getIgnoreClientCertificateExpiry()

        /**
         * The client certificate handling method.
         *
         * Options are `off` , `passthrough` or `verify` . The default value is `off` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-mutualauthentication.html#cfn-elasticloadbalancingv2-listener-mutualauthentication-mode)
         */
        public fun mode(): String? = unwrap(this).getMode()

        /**
         * The Amazon Resource Name (ARN) of the trust store.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-mutualauthentication.html#cfn-elasticloadbalancingv2-listener-mutualauthentication-truststorearn)
         */
        public fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

        /** A builder for [MutualAuthenticationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param ignoreClientCertificateExpiry Indicates whether expired client certificates
             *   are ignored.
             */
            public fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: Boolean)

            /**
             * @param ignoreClientCertificateExpiry Indicates whether expired client certificates
             *   are ignored.
             */
            public fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: IResolvable)

            /**
             * @param mode The client certificate handling method. Options are `off` , `passthrough`
             *   or `verify` . The default value is `off` .
             */
            public fun mode(mode: String)

            /** @param trustStoreArn The Amazon Resource Name (ARN) of the trust store. */
            public fun trustStoreArn(trustStoreArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .MutualAuthenticationProperty
                    .builder()

            /**
             * @param ignoreClientCertificateExpiry Indicates whether expired client certificates
             *   are ignored.
             */
            override fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: Boolean) {
                cdkBuilder.ignoreClientCertificateExpiry(ignoreClientCertificateExpiry)
            }

            /**
             * @param ignoreClientCertificateExpiry Indicates whether expired client certificates
             *   are ignored.
             */
            override fun ignoreClientCertificateExpiry(ignoreClientCertificateExpiry: IResolvable) {
                cdkBuilder.ignoreClientCertificateExpiry(
                    ignoreClientCertificateExpiry.let(IResolvable::unwrap)
                )
            }

            /**
             * @param mode The client certificate handling method. Options are `off` , `passthrough`
             *   or `verify` . The default value is `off` .
             */
            override fun mode(mode: String) {
                cdkBuilder.mode(mode)
            }

            /** @param trustStoreArn The Amazon Resource Name (ARN) of the trust store. */
            override fun trustStoreArn(trustStoreArn: String) {
                cdkBuilder.trustStoreArn(trustStoreArn)
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty,
        ) : MutualAuthenticationProperty {
            /**
             * Indicates whether expired client certificates are ignored.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-mutualauthentication.html#cfn-elasticloadbalancingv2-listener-mutualauthentication-ignoreclientcertificateexpiry)
             */
            override fun ignoreClientCertificateExpiry(): Any? =
                unwrap(this).getIgnoreClientCertificateExpiry()

            /**
             * The client certificate handling method.
             *
             * Options are `off` , `passthrough` or `verify` . The default value is `off` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-mutualauthentication.html#cfn-elasticloadbalancingv2-listener-mutualauthentication-mode)
             */
            override fun mode(): String? = unwrap(this).getMode()

            /**
             * The Amazon Resource Name (ARN) of the trust store.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-mutualauthentication.html#cfn-elasticloadbalancingv2-listener-mutualauthentication-truststorearn)
             */
            override fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MutualAuthenticationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty
            ): MutualAuthenticationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MutualAuthenticationProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.MutualAuthenticationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TargetGroupTupleProperty {
        /**
         * The Amazon Resource Name (ARN) of the target group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-targetgrouparn)
         */
        public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

        /**
         * The weight.
         *
         * The range is 0 to 999.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-weight)
         */
        public fun weight(): Number? = unwrap(this).getWeight()

        /** A builder for [TargetGroupTupleProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param targetGroupArn The Amazon Resource Name (ARN) of the target group. */
            public fun targetGroupArn(targetGroupArn: String)

            /** @param weight The weight. The range is 0 to 999. */
            public fun weight(weight: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .TargetGroupTupleProperty
                    .builder()

            /** @param targetGroupArn The Amazon Resource Name (ARN) of the target group. */
            override fun targetGroupArn(targetGroupArn: String) {
                cdkBuilder.targetGroupArn(targetGroupArn)
            }

            /** @param weight The weight. The range is 0 to 999. */
            override fun weight(weight: Number) {
                cdkBuilder.weight(weight)
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty,
        ) : TargetGroupTupleProperty {
            /**
             * The Amazon Resource Name (ARN) of the target group.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-targetgrouparn)
             */
            override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

            /**
             * The weight.
             *
             * The range is 0 to 999.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-weight)
             */
            override fun weight(): Number? = unwrap(this).getWeight()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupTupleProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty
            ): TargetGroupTupleProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TargetGroupTupleProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupTupleProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface FixedResponseConfigProperty {
        /**
         * The content type.
         *
         * Valid Values: text/plain | text/css | text/html | application/javascript |
         * application/json
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listener-fixedresponseconfig-contenttype)
         */
        public fun contentType(): String? = unwrap(this).getContentType()

        /**
         * The message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listener-fixedresponseconfig-messagebody)
         */
        public fun messageBody(): String? = unwrap(this).getMessageBody()

        /**
         * The HTTP response code (2XX, 4XX, or 5XX).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listener-fixedresponseconfig-statuscode)
         */
        public fun statusCode(): String

        /** A builder for [FixedResponseConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param contentType The content type. Valid Values: text/plain | text/css | text/html
             *   | application/javascript | application/json
             */
            public fun contentType(contentType: String)

            /** @param messageBody The message. */
            public fun messageBody(messageBody: String)

            /** @param statusCode The HTTP response code (2XX, 4XX, or 5XX). */
            public fun statusCode(statusCode: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .FixedResponseConfigProperty
                    .builder()

            /**
             * @param contentType The content type. Valid Values: text/plain | text/css | text/html
             *   | application/javascript | application/json
             */
            override fun contentType(contentType: String) {
                cdkBuilder.contentType(contentType)
            }

            /** @param messageBody The message. */
            override fun messageBody(messageBody: String) {
                cdkBuilder.messageBody(messageBody)
            }

            /** @param statusCode The HTTP response code (2XX, 4XX, or 5XX). */
            override fun statusCode(statusCode: String) {
                cdkBuilder.statusCode(statusCode)
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty,
        ) : FixedResponseConfigProperty {
            /**
             * The content type.
             *
             * Valid Values: text/plain | text/css | text/html | application/javascript |
             * application/json
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listener-fixedresponseconfig-contenttype)
             */
            override fun contentType(): String? = unwrap(this).getContentType()

            /**
             * The message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listener-fixedresponseconfig-messagebody)
             */
            override fun messageBody(): String? = unwrap(this).getMessageBody()

            /**
             * The HTTP response code (2XX, 4XX, or 5XX).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listener-fixedresponseconfig-statuscode)
             */
            override fun statusCode(): String = unwrap(this).getStatusCode()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): FixedResponseConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty
            ): FixedResponseConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: FixedResponseConfigProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface TargetGroupStickinessConfigProperty {
        /**
         * The time period, in seconds, during which requests from a client should be routed to the
         * same target group.
         *
         * The range is 1-604800 seconds (7 days).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgroupstickinessconfig.html#cfn-elasticloadbalancingv2-listener-targetgroupstickinessconfig-durationseconds)
         */
        public fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

        /**
         * Indicates whether target group stickiness is enabled.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgroupstickinessconfig.html#cfn-elasticloadbalancingv2-listener-targetgroupstickinessconfig-enabled)
         */
        public fun enabled(): Any? = unwrap(this).getEnabled()

        /** A builder for [TargetGroupStickinessConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param durationSeconds The time period, in seconds, during which requests from a
             *   client should be routed to the same target group. The range is 1-604800 seconds (7
             *   days).
             */
            public fun durationSeconds(durationSeconds: Number)

            /** @param enabled Indicates whether target group stickiness is enabled. */
            public fun enabled(enabled: Boolean)

            /** @param enabled Indicates whether target group stickiness is enabled. */
            public fun enabled(enabled: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .TargetGroupStickinessConfigProperty
                    .builder()

            /**
             * @param durationSeconds The time period, in seconds, during which requests from a
             *   client should be routed to the same target group. The range is 1-604800 seconds (7
             *   days).
             */
            override fun durationSeconds(durationSeconds: Number) {
                cdkBuilder.durationSeconds(durationSeconds)
            }

            /** @param enabled Indicates whether target group stickiness is enabled. */
            override fun enabled(enabled: Boolean) {
                cdkBuilder.enabled(enabled)
            }

            /** @param enabled Indicates whether target group stickiness is enabled. */
            override fun enabled(enabled: IResolvable) {
                cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty,
        ) : TargetGroupStickinessConfigProperty {
            /**
             * The time period, in seconds, during which requests from a client should be routed to
             * the same target group.
             *
             * The range is 1-604800 seconds (7 days).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgroupstickinessconfig.html#cfn-elasticloadbalancingv2-listener-targetgroupstickinessconfig-durationseconds)
             */
            override fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

            /**
             * Indicates whether target group stickiness is enabled.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgroupstickinessconfig.html#cfn-elasticloadbalancingv2-listener-targetgroupstickinessconfig-enabled)
             */
            override fun enabled(): Any? = unwrap(this).getEnabled()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): TargetGroupStickinessConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty
            ): TargetGroupStickinessConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TargetGroupStickinessConfigProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.TargetGroupStickinessConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ForwardConfigProperty {
        /**
         * Information about the target group stickiness for a rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html#cfn-elasticloadbalancingv2-listener-forwardconfig-targetgroupstickinessconfig)
         */
        public fun targetGroupStickinessConfig(): Any? =
            unwrap(this).getTargetGroupStickinessConfig()

        /**
         * Information about how traffic will be distributed between multiple target groups in a
         * forward rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html#cfn-elasticloadbalancingv2-listener-forwardconfig-targetgroups)
         */
        public fun targetGroups(): Any? = unwrap(this).getTargetGroups()

        /** A builder for [ForwardConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param targetGroupStickinessConfig Information about the target group stickiness for
             *   a rule.
             */
            public fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable)

            /**
             * @param targetGroupStickinessConfig Information about the target group stickiness for
             *   a rule.
             */
            public fun targetGroupStickinessConfig(
                targetGroupStickinessConfig: TargetGroupStickinessConfigProperty
            )

            /**
             * @param targetGroupStickinessConfig Information about the target group stickiness for
             *   a rule.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("99f6637a85351cd3698125d7a5a5d7f3d544a374d5bc8cdf8f39ba6a59a24924")
            public fun targetGroupStickinessConfig(
                targetGroupStickinessConfig: TargetGroupStickinessConfigProperty.Builder.() -> Unit
            )

            /**
             * @param targetGroups Information about how traffic will be distributed between
             *   multiple target groups in a forward rule.
             */
            public fun targetGroups(targetGroups: IResolvable)

            /**
             * @param targetGroups Information about how traffic will be distributed between
             *   multiple target groups in a forward rule.
             */
            public fun targetGroups(targetGroups: List<Any>)

            /**
             * @param targetGroups Information about how traffic will be distributed between
             *   multiple target groups in a forward rule.
             */
            public fun targetGroups(vararg targetGroups: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .ForwardConfigProperty
                    .builder()

            /**
             * @param targetGroupStickinessConfig Information about the target group stickiness for
             *   a rule.
             */
            override fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable) {
                cdkBuilder.targetGroupStickinessConfig(
                    targetGroupStickinessConfig.let(IResolvable::unwrap)
                )
            }

            /**
             * @param targetGroupStickinessConfig Information about the target group stickiness for
             *   a rule.
             */
            override fun targetGroupStickinessConfig(
                targetGroupStickinessConfig: TargetGroupStickinessConfigProperty
            ) {
                cdkBuilder.targetGroupStickinessConfig(
                    targetGroupStickinessConfig.let(TargetGroupStickinessConfigProperty::unwrap)
                )
            }

            /**
             * @param targetGroupStickinessConfig Information about the target group stickiness for
             *   a rule.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("99f6637a85351cd3698125d7a5a5d7f3d544a374d5bc8cdf8f39ba6a59a24924")
            override fun targetGroupStickinessConfig(
                targetGroupStickinessConfig: TargetGroupStickinessConfigProperty.Builder.() -> Unit
            ): Unit =
                targetGroupStickinessConfig(
                    TargetGroupStickinessConfigProperty(targetGroupStickinessConfig)
                )

            /**
             * @param targetGroups Information about how traffic will be distributed between
             *   multiple target groups in a forward rule.
             */
            override fun targetGroups(targetGroups: IResolvable) {
                cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
            }

            /**
             * @param targetGroups Information about how traffic will be distributed between
             *   multiple target groups in a forward rule.
             */
            override fun targetGroups(targetGroups: List<Any>) {
                cdkBuilder.targetGroups(targetGroups)
            }

            /**
             * @param targetGroups Information about how traffic will be distributed between
             *   multiple target groups in a forward rule.
             */
            override fun targetGroups(vararg targetGroups: Any): Unit =
                targetGroups(targetGroups.toList())

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty,
        ) : ForwardConfigProperty {
            /**
             * Information about the target group stickiness for a rule.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html#cfn-elasticloadbalancingv2-listener-forwardconfig-targetgroupstickinessconfig)
             */
            override fun targetGroupStickinessConfig(): Any? =
                unwrap(this).getTargetGroupStickinessConfig()

            /**
             * Information about how traffic will be distributed between multiple target groups in a
             * forward rule.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-forwardconfig.html#cfn-elasticloadbalancingv2-listener-forwardconfig-targetgroups)
             */
            override fun targetGroups(): Any? = unwrap(this).getTargetGroups()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ForwardConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty
            ): ForwardConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ForwardConfigProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ForwardConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ActionProperty {
        /**
         * [HTTPS listeners] Information for using Amazon Cognito to authenticate users.
         *
         * Specify only when `Type` is `authenticate-cognito` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-authenticatecognitoconfig)
         */
        public fun authenticateCognitoConfig(): Any? = unwrap(this).getAuthenticateCognitoConfig()

        /**
         * [HTTPS listeners] Information about an identity provider that is compliant with OpenID
         * Connect (OIDC).
         *
         * Specify only when `Type` is `authenticate-oidc` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-authenticateoidcconfig)
         */
        public fun authenticateOidcConfig(): Any? = unwrap(this).getAuthenticateOidcConfig()

        /**
         * [Application Load Balancer] Information for creating an action that returns a custom HTTP
         * response.
         *
         * Specify only when `Type` is `fixed-response` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-fixedresponseconfig)
         */
        public fun fixedResponseConfig(): Any? = unwrap(this).getFixedResponseConfig()

        /**
         * Information for creating an action that distributes requests among one or more target
         * groups.
         *
         * For Network Load Balancers, you can specify a single target group. Specify only when
         * `Type` is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can
         * specify only one target group using `ForwardConfig` and it must be the same target group
         * specified in `TargetGroupArn` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-forwardconfig)
         */
        public fun forwardConfig(): Any? = unwrap(this).getForwardConfig()

        /**
         * The order for the action.
         *
         * This value is required for rules with multiple actions. The action with the lowest value
         * for order is performed first.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-order)
         */
        public fun order(): Number? = unwrap(this).getOrder()

        /**
         * [Application Load Balancer] Information for creating a redirect action.
         *
         * Specify only when `Type` is `redirect` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-redirectconfig)
         */
        public fun redirectConfig(): Any? = unwrap(this).getRedirectConfig()

        /**
         * The Amazon Resource Name (ARN) of the target group.
         *
         * Specify only when `Type` is `forward` and you want to route to a single target group. To
         * route to one or more target groups, use `ForwardConfig` instead.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-targetgrouparn)
         */
        public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

        /**
         * The type of action.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-type)
         */
        public fun type(): String

        /** A builder for [ActionProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon
             *   Cognito to authenticate users. Specify only when `Type` is `authenticate-cognito` .
             */
            public fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable)

            /**
             * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon
             *   Cognito to authenticate users. Specify only when `Type` is `authenticate-cognito` .
             */
            public fun authenticateCognitoConfig(
                authenticateCognitoConfig: AuthenticateCognitoConfigProperty
            )

            /**
             * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon
             *   Cognito to authenticate users. Specify only when `Type` is `authenticate-cognito` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8cfeea4b49561bdc6feb9f4a60a5021f2a1e580a6b079128d183fa90e53840ee")
            public fun authenticateCognitoConfig(
                authenticateCognitoConfig: AuthenticateCognitoConfigProperty.Builder.() -> Unit
            )

            /**
             * @param authenticateOidcConfig [HTTPS listeners] Information about an identity
             *   provider that is compliant with OpenID Connect (OIDC). Specify only when `Type` is
             *   `authenticate-oidc` .
             */
            public fun authenticateOidcConfig(authenticateOidcConfig: IResolvable)

            /**
             * @param authenticateOidcConfig [HTTPS listeners] Information about an identity
             *   provider that is compliant with OpenID Connect (OIDC). Specify only when `Type` is
             *   `authenticate-oidc` .
             */
            public fun authenticateOidcConfig(
                authenticateOidcConfig: AuthenticateOidcConfigProperty
            )

            /**
             * @param authenticateOidcConfig [HTTPS listeners] Information about an identity
             *   provider that is compliant with OpenID Connect (OIDC). Specify only when `Type` is
             *   `authenticate-oidc` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("97ccd3442f5f1be7bb075d5d14d1278ef600cfa68d463c4e1284ef706743762a")
            public fun authenticateOidcConfig(
                authenticateOidcConfig: AuthenticateOidcConfigProperty.Builder.() -> Unit
            )

            /**
             * @param fixedResponseConfig [Application Load Balancer] Information for creating an
             *   action that returns a custom HTTP response. Specify only when `Type` is
             *   `fixed-response` .
             */
            public fun fixedResponseConfig(fixedResponseConfig: IResolvable)

            /**
             * @param fixedResponseConfig [Application Load Balancer] Information for creating an
             *   action that returns a custom HTTP response. Specify only when `Type` is
             *   `fixed-response` .
             */
            public fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty)

            /**
             * @param fixedResponseConfig [Application Load Balancer] Information for creating an
             *   action that returns a custom HTTP response. Specify only when `Type` is
             *   `fixed-response` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e689ad8c6214b741e6712db92a23bc2fe13065c763917aabd257dbc6b09faa59")
            public fun fixedResponseConfig(
                fixedResponseConfig: FixedResponseConfigProperty.Builder.() -> Unit
            )

            /**
             * @param forwardConfig Information for creating an action that distributes requests
             *   among one or more target groups. For Network Load Balancers, you can specify a
             *   single target group. Specify only when `Type` is `forward` . If you specify both
             *   `ForwardConfig` and `TargetGroupArn` , you can specify only one target group using
             *   `ForwardConfig` and it must be the same target group specified in `TargetGroupArn`
             *   .
             */
            public fun forwardConfig(forwardConfig: IResolvable)

            /**
             * @param forwardConfig Information for creating an action that distributes requests
             *   among one or more target groups. For Network Load Balancers, you can specify a
             *   single target group. Specify only when `Type` is `forward` . If you specify both
             *   `ForwardConfig` and `TargetGroupArn` , you can specify only one target group using
             *   `ForwardConfig` and it must be the same target group specified in `TargetGroupArn`
             *   .
             */
            public fun forwardConfig(forwardConfig: ForwardConfigProperty)

            /**
             * @param forwardConfig Information for creating an action that distributes requests
             *   among one or more target groups. For Network Load Balancers, you can specify a
             *   single target group. Specify only when `Type` is `forward` . If you specify both
             *   `ForwardConfig` and `TargetGroupArn` , you can specify only one target group using
             *   `ForwardConfig` and it must be the same target group specified in `TargetGroupArn`
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3634d8453b2a4e945ba0da08c10536d1f9821e671ce33ff1f9bb5a8da159ebb5")
            public fun forwardConfig(forwardConfig: ForwardConfigProperty.Builder.() -> Unit)

            /**
             * @param order The order for the action. This value is required for rules with multiple
             *   actions. The action with the lowest value for order is performed first.
             */
            public fun order(order: Number)

            /**
             * @param redirectConfig [Application Load Balancer] Information for creating a redirect
             *   action. Specify only when `Type` is `redirect` .
             */
            public fun redirectConfig(redirectConfig: IResolvable)

            /**
             * @param redirectConfig [Application Load Balancer] Information for creating a redirect
             *   action. Specify only when `Type` is `redirect` .
             */
            public fun redirectConfig(redirectConfig: RedirectConfigProperty)

            /**
             * @param redirectConfig [Application Load Balancer] Information for creating a redirect
             *   action. Specify only when `Type` is `redirect` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5a437908f5f7ed34380a4ccc3edfd03464aaf72d917ec3bf8ac2d6f1e5873aa3")
            public fun redirectConfig(redirectConfig: RedirectConfigProperty.Builder.() -> Unit)

            /**
             * @param targetGroupArn The Amazon Resource Name (ARN) of the target group. Specify
             *   only when `Type` is `forward` and you want to route to a single target group. To
             *   route to one or more target groups, use `ForwardConfig` instead.
             */
            public fun targetGroupArn(targetGroupArn: String)

            /** @param type The type of action. */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty
                    .builder()

            /**
             * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon
             *   Cognito to authenticate users. Specify only when `Type` is `authenticate-cognito` .
             */
            override fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable) {
                cdkBuilder.authenticateCognitoConfig(
                    authenticateCognitoConfig.let(IResolvable::unwrap)
                )
            }

            /**
             * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon
             *   Cognito to authenticate users. Specify only when `Type` is `authenticate-cognito` .
             */
            override fun authenticateCognitoConfig(
                authenticateCognitoConfig: AuthenticateCognitoConfigProperty
            ) {
                cdkBuilder.authenticateCognitoConfig(
                    authenticateCognitoConfig.let(AuthenticateCognitoConfigProperty::unwrap)
                )
            }

            /**
             * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon
             *   Cognito to authenticate users. Specify only when `Type` is `authenticate-cognito` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("8cfeea4b49561bdc6feb9f4a60a5021f2a1e580a6b079128d183fa90e53840ee")
            override fun authenticateCognitoConfig(
                authenticateCognitoConfig: AuthenticateCognitoConfigProperty.Builder.() -> Unit
            ): Unit =
                authenticateCognitoConfig(
                    AuthenticateCognitoConfigProperty(authenticateCognitoConfig)
                )

            /**
             * @param authenticateOidcConfig [HTTPS listeners] Information about an identity
             *   provider that is compliant with OpenID Connect (OIDC). Specify only when `Type` is
             *   `authenticate-oidc` .
             */
            override fun authenticateOidcConfig(authenticateOidcConfig: IResolvable) {
                cdkBuilder.authenticateOidcConfig(authenticateOidcConfig.let(IResolvable::unwrap))
            }

            /**
             * @param authenticateOidcConfig [HTTPS listeners] Information about an identity
             *   provider that is compliant with OpenID Connect (OIDC). Specify only when `Type` is
             *   `authenticate-oidc` .
             */
            override fun authenticateOidcConfig(
                authenticateOidcConfig: AuthenticateOidcConfigProperty
            ) {
                cdkBuilder.authenticateOidcConfig(
                    authenticateOidcConfig.let(AuthenticateOidcConfigProperty::unwrap)
                )
            }

            /**
             * @param authenticateOidcConfig [HTTPS listeners] Information about an identity
             *   provider that is compliant with OpenID Connect (OIDC). Specify only when `Type` is
             *   `authenticate-oidc` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("97ccd3442f5f1be7bb075d5d14d1278ef600cfa68d463c4e1284ef706743762a")
            override fun authenticateOidcConfig(
                authenticateOidcConfig: AuthenticateOidcConfigProperty.Builder.() -> Unit
            ): Unit = authenticateOidcConfig(AuthenticateOidcConfigProperty(authenticateOidcConfig))

            /**
             * @param fixedResponseConfig [Application Load Balancer] Information for creating an
             *   action that returns a custom HTTP response. Specify only when `Type` is
             *   `fixed-response` .
             */
            override fun fixedResponseConfig(fixedResponseConfig: IResolvable) {
                cdkBuilder.fixedResponseConfig(fixedResponseConfig.let(IResolvable::unwrap))
            }

            /**
             * @param fixedResponseConfig [Application Load Balancer] Information for creating an
             *   action that returns a custom HTTP response. Specify only when `Type` is
             *   `fixed-response` .
             */
            override fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty) {
                cdkBuilder.fixedResponseConfig(
                    fixedResponseConfig.let(FixedResponseConfigProperty::unwrap)
                )
            }

            /**
             * @param fixedResponseConfig [Application Load Balancer] Information for creating an
             *   action that returns a custom HTTP response. Specify only when `Type` is
             *   `fixed-response` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e689ad8c6214b741e6712db92a23bc2fe13065c763917aabd257dbc6b09faa59")
            override fun fixedResponseConfig(
                fixedResponseConfig: FixedResponseConfigProperty.Builder.() -> Unit
            ): Unit = fixedResponseConfig(FixedResponseConfigProperty(fixedResponseConfig))

            /**
             * @param forwardConfig Information for creating an action that distributes requests
             *   among one or more target groups. For Network Load Balancers, you can specify a
             *   single target group. Specify only when `Type` is `forward` . If you specify both
             *   `ForwardConfig` and `TargetGroupArn` , you can specify only one target group using
             *   `ForwardConfig` and it must be the same target group specified in `TargetGroupArn`
             *   .
             */
            override fun forwardConfig(forwardConfig: IResolvable) {
                cdkBuilder.forwardConfig(forwardConfig.let(IResolvable::unwrap))
            }

            /**
             * @param forwardConfig Information for creating an action that distributes requests
             *   among one or more target groups. For Network Load Balancers, you can specify a
             *   single target group. Specify only when `Type` is `forward` . If you specify both
             *   `ForwardConfig` and `TargetGroupArn` , you can specify only one target group using
             *   `ForwardConfig` and it must be the same target group specified in `TargetGroupArn`
             *   .
             */
            override fun forwardConfig(forwardConfig: ForwardConfigProperty) {
                cdkBuilder.forwardConfig(forwardConfig.let(ForwardConfigProperty::unwrap))
            }

            /**
             * @param forwardConfig Information for creating an action that distributes requests
             *   among one or more target groups. For Network Load Balancers, you can specify a
             *   single target group. Specify only when `Type` is `forward` . If you specify both
             *   `ForwardConfig` and `TargetGroupArn` , you can specify only one target group using
             *   `ForwardConfig` and it must be the same target group specified in `TargetGroupArn`
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3634d8453b2a4e945ba0da08c10536d1f9821e671ce33ff1f9bb5a8da159ebb5")
            override fun forwardConfig(
                forwardConfig: ForwardConfigProperty.Builder.() -> Unit
            ): Unit = forwardConfig(ForwardConfigProperty(forwardConfig))

            /**
             * @param order The order for the action. This value is required for rules with multiple
             *   actions. The action with the lowest value for order is performed first.
             */
            override fun order(order: Number) {
                cdkBuilder.order(order)
            }

            /**
             * @param redirectConfig [Application Load Balancer] Information for creating a redirect
             *   action. Specify only when `Type` is `redirect` .
             */
            override fun redirectConfig(redirectConfig: IResolvable) {
                cdkBuilder.redirectConfig(redirectConfig.let(IResolvable::unwrap))
            }

            /**
             * @param redirectConfig [Application Load Balancer] Information for creating a redirect
             *   action. Specify only when `Type` is `redirect` .
             */
            override fun redirectConfig(redirectConfig: RedirectConfigProperty) {
                cdkBuilder.redirectConfig(redirectConfig.let(RedirectConfigProperty::unwrap))
            }

            /**
             * @param redirectConfig [Application Load Balancer] Information for creating a redirect
             *   action. Specify only when `Type` is `redirect` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5a437908f5f7ed34380a4ccc3edfd03464aaf72d917ec3bf8ac2d6f1e5873aa3")
            override fun redirectConfig(
                redirectConfig: RedirectConfigProperty.Builder.() -> Unit
            ): Unit = redirectConfig(RedirectConfigProperty(redirectConfig))

            /**
             * @param targetGroupArn The Amazon Resource Name (ARN) of the target group. Specify
             *   only when `Type` is `forward` and you want to route to a single target group. To
             *   route to one or more target groups, use `ForwardConfig` instead.
             */
            override fun targetGroupArn(targetGroupArn: String) {
                cdkBuilder.targetGroupArn(targetGroupArn)
            }

            /** @param type The type of action. */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty,
        ) : ActionProperty {
            /**
             * [HTTPS listeners] Information for using Amazon Cognito to authenticate users.
             *
             * Specify only when `Type` is `authenticate-cognito` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-authenticatecognitoconfig)
             */
            override fun authenticateCognitoConfig(): Any? =
                unwrap(this).getAuthenticateCognitoConfig()

            /**
             * [HTTPS listeners] Information about an identity provider that is compliant with
             * OpenID Connect (OIDC).
             *
             * Specify only when `Type` is `authenticate-oidc` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-authenticateoidcconfig)
             */
            override fun authenticateOidcConfig(): Any? = unwrap(this).getAuthenticateOidcConfig()

            /**
             * [Application Load Balancer] Information for creating an action that returns a custom
             * HTTP response.
             *
             * Specify only when `Type` is `fixed-response` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-fixedresponseconfig)
             */
            override fun fixedResponseConfig(): Any? = unwrap(this).getFixedResponseConfig()

            /**
             * Information for creating an action that distributes requests among one or more target
             * groups.
             *
             * For Network Load Balancers, you can specify a single target group. Specify only when
             * `Type` is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you
             * can specify only one target group using `ForwardConfig` and it must be the same
             * target group specified in `TargetGroupArn` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-forwardconfig)
             */
            override fun forwardConfig(): Any? = unwrap(this).getForwardConfig()

            /**
             * The order for the action.
             *
             * This value is required for rules with multiple actions. The action with the lowest
             * value for order is performed first.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-order)
             */
            override fun order(): Number? = unwrap(this).getOrder()

            /**
             * [Application Load Balancer] Information for creating a redirect action.
             *
             * Specify only when `Type` is `redirect` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-redirectconfig)
             */
            override fun redirectConfig(): Any? = unwrap(this).getRedirectConfig()

            /**
             * The Amazon Resource Name (ARN) of the target group.
             *
             * Specify only when `Type` is `forward` and you want to route to a single target group.
             * To route to one or more target groups, use `ForwardConfig` instead.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-targetgrouparn)
             */
            override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

            /**
             * The type of action.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-action.html#cfn-elasticloadbalancingv2-listener-action-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty
            ): ActionProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ActionProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.ActionProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CertificateProperty {
        /**
         * The Amazon Resource Name (ARN) of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificate.html#cfn-elasticloadbalancingv2-listener-certificate-certificatearn)
         */
        public fun certificateArn(): String? = unwrap(this).getCertificateArn()

        /** A builder for [CertificateProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param certificateArn The Amazon Resource Name (ARN) of the certificate. */
            public fun certificateArn(certificateArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .CertificateProperty
                    .builder()

            /** @param certificateArn The Amazon Resource Name (ARN) of the certificate. */
            override fun certificateArn(certificateArn: String) {
                cdkBuilder.certificateArn(certificateArn)
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty,
        ) : CertificateProperty {
            /**
             * The Amazon Resource Name (ARN) of the certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificate.html#cfn-elasticloadbalancingv2-listener-certificate-certificatearn)
             */
            override fun certificateArn(): String? = unwrap(this).getCertificateArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty
            ): CertificateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CertificateProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.CertificateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AuthenticateOidcConfigProperty {
        /**
         * The query parameters (up to 10) to include in the redirect request to the authorization
         * endpoint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authenticationrequestextraparams)
         */
        public fun authenticationRequestExtraParams(): Any? =
            unwrap(this).getAuthenticationRequestExtraParams()

        /**
         * The authorization endpoint of the IdP.
         *
         * This must be a full URL, including the HTTPS protocol, the domain, and the path.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authorizationendpoint)
         */
        public fun authorizationEndpoint(): String

        /**
         * The OAuth 2.0 client identifier.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientid)
         */
        public fun clientId(): String

        /**
         * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If
         * you are modifying a rule, you can omit this parameter if you set
         * `UseExistingClientSecret` to true.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientsecret)
         */
        public fun clientSecret(): String? = unwrap(this).getClientSecret()

        /**
         * The OIDC issuer identifier of the IdP.
         *
         * This must be a full URL, including the HTTPS protocol, the domain, and the path.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-issuer)
         */
        public fun issuer(): String

        /**
         * The behavior if the user is not authenticated. The following are possible values:.
         * * deny `` - Return an HTTP 401 Unauthorized error.
         * * allow `` - Allow the request to be forwarded to the target.
         * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
         *   default value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-onunauthenticatedrequest)
         */
        public fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

        /**
         * The set of user claims to be requested from the IdP. The default is `openid` .
         *
         * To verify which scope values your IdP supports and how to separate multiple values, see
         * the documentation for your IdP.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-scope)
         */
        public fun scope(): String? = unwrap(this).getScope()

        /**
         * The name of the cookie used to maintain session information.
         *
         * The default is AWSELBAuthSessionCookie.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessioncookiename)
         */
        public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

        /**
         * The maximum duration of the authentication session, in seconds.
         *
         * The default is 604800 seconds (7 days).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessiontimeout)
         */
        public fun sessionTimeout(): String? = unwrap(this).getSessionTimeout()

        /**
         * The token endpoint of the IdP.
         *
         * This must be a full URL, including the HTTPS protocol, the domain, and the path.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-tokenendpoint)
         */
        public fun tokenEndpoint(): String

        /**
         * Indicates whether to use the existing client secret when modifying a rule.
         *
         * If you are creating a rule, you can omit this parameter or set it to false.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-useexistingclientsecret)
         */
        public fun useExistingClientSecret(): Any? = unwrap(this).getUseExistingClientSecret()

        /**
         * The user info endpoint of the IdP.
         *
         * This must be a full URL, including the HTTPS protocol, the domain, and the path.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-userinfoendpoint)
         */
        public fun userInfoEndpoint(): String

        /** A builder for [AuthenticateOidcConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param authenticationRequestExtraParams The query parameters (up to 10) to include in
             *   the redirect request to the authorization endpoint.
             */
            public fun authenticationRequestExtraParams(
                authenticationRequestExtraParams: IResolvable
            )

            /**
             * @param authenticationRequestExtraParams The query parameters (up to 10) to include in
             *   the redirect request to the authorization endpoint.
             */
            public fun authenticationRequestExtraParams(
                authenticationRequestExtraParams: Map<String, String>
            )

            /**
             * @param authorizationEndpoint The authorization endpoint of the IdP. This must be a
             *   full URL, including the HTTPS protocol, the domain, and the path.
             */
            public fun authorizationEndpoint(authorizationEndpoint: String)

            /** @param clientId The OAuth 2.0 client identifier. */
            public fun clientId(clientId: String)

            /**
             * @param clientSecret The OAuth 2.0 client secret. This parameter is required if you
             *   are creating a rule. If you are modifying a rule, you can omit this parameter if
             *   you set `UseExistingClientSecret` to true.
             */
            public fun clientSecret(clientSecret: String)

            /**
             * @param issuer The OIDC issuer identifier of the IdP. This must be a full URL,
             *   including the HTTPS protocol, the domain, and the path.
             */
            public fun issuer(issuer: String)

            /**
             * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The
             *   following are possible values:.
             * * deny `` - Return an HTTP 401 Unauthorized error.
             * * allow `` - Allow the request to be forwarded to the target.
             * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is
             *   the default value.
             */
            public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String)

            /**
             * @param scope The set of user claims to be requested from the IdP. The default is
             *   `openid` . To verify which scope values your IdP supports and how to separate
             *   multiple values, see the documentation for your IdP.
             */
            public fun scope(scope: String)

            /**
             * @param sessionCookieName The name of the cookie used to maintain session information.
             *   The default is AWSELBAuthSessionCookie.
             */
            public fun sessionCookieName(sessionCookieName: String)

            /**
             * @param sessionTimeout The maximum duration of the authentication session, in seconds.
             *   The default is 604800 seconds (7 days).
             */
            public fun sessionTimeout(sessionTimeout: String)

            /**
             * @param tokenEndpoint The token endpoint of the IdP. This must be a full URL,
             *   including the HTTPS protocol, the domain, and the path.
             */
            public fun tokenEndpoint(tokenEndpoint: String)

            /**
             * @param useExistingClientSecret Indicates whether to use the existing client secret
             *   when modifying a rule. If you are creating a rule, you can omit this parameter or
             *   set it to false.
             */
            public fun useExistingClientSecret(useExistingClientSecret: Boolean)

            /**
             * @param useExistingClientSecret Indicates whether to use the existing client secret
             *   when modifying a rule. If you are creating a rule, you can omit this parameter or
             *   set it to false.
             */
            public fun useExistingClientSecret(useExistingClientSecret: IResolvable)

            /**
             * @param userInfoEndpoint The user info endpoint of the IdP. This must be a full URL,
             *   including the HTTPS protocol, the domain, and the path.
             */
            public fun userInfoEndpoint(userInfoEndpoint: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .AuthenticateOidcConfigProperty
                    .builder()

            /**
             * @param authenticationRequestExtraParams The query parameters (up to 10) to include in
             *   the redirect request to the authorization endpoint.
             */
            override fun authenticationRequestExtraParams(
                authenticationRequestExtraParams: IResolvable
            ) {
                cdkBuilder.authenticationRequestExtraParams(
                    authenticationRequestExtraParams.let(IResolvable::unwrap)
                )
            }

            /**
             * @param authenticationRequestExtraParams The query parameters (up to 10) to include in
             *   the redirect request to the authorization endpoint.
             */
            override fun authenticationRequestExtraParams(
                authenticationRequestExtraParams: Map<String, String>
            ) {
                cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
            }

            /**
             * @param authorizationEndpoint The authorization endpoint of the IdP. This must be a
             *   full URL, including the HTTPS protocol, the domain, and the path.
             */
            override fun authorizationEndpoint(authorizationEndpoint: String) {
                cdkBuilder.authorizationEndpoint(authorizationEndpoint)
            }

            /** @param clientId The OAuth 2.0 client identifier. */
            override fun clientId(clientId: String) {
                cdkBuilder.clientId(clientId)
            }

            /**
             * @param clientSecret The OAuth 2.0 client secret. This parameter is required if you
             *   are creating a rule. If you are modifying a rule, you can omit this parameter if
             *   you set `UseExistingClientSecret` to true.
             */
            override fun clientSecret(clientSecret: String) {
                cdkBuilder.clientSecret(clientSecret)
            }

            /**
             * @param issuer The OIDC issuer identifier of the IdP. This must be a full URL,
             *   including the HTTPS protocol, the domain, and the path.
             */
            override fun issuer(issuer: String) {
                cdkBuilder.issuer(issuer)
            }

            /**
             * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The
             *   following are possible values:.
             * * deny `` - Return an HTTP 401 Unauthorized error.
             * * allow `` - Allow the request to be forwarded to the target.
             * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is
             *   the default value.
             */
            override fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
                cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
            }

            /**
             * @param scope The set of user claims to be requested from the IdP. The default is
             *   `openid` . To verify which scope values your IdP supports and how to separate
             *   multiple values, see the documentation for your IdP.
             */
            override fun scope(scope: String) {
                cdkBuilder.scope(scope)
            }

            /**
             * @param sessionCookieName The name of the cookie used to maintain session information.
             *   The default is AWSELBAuthSessionCookie.
             */
            override fun sessionCookieName(sessionCookieName: String) {
                cdkBuilder.sessionCookieName(sessionCookieName)
            }

            /**
             * @param sessionTimeout The maximum duration of the authentication session, in seconds.
             *   The default is 604800 seconds (7 days).
             */
            override fun sessionTimeout(sessionTimeout: String) {
                cdkBuilder.sessionTimeout(sessionTimeout)
            }

            /**
             * @param tokenEndpoint The token endpoint of the IdP. This must be a full URL,
             *   including the HTTPS protocol, the domain, and the path.
             */
            override fun tokenEndpoint(tokenEndpoint: String) {
                cdkBuilder.tokenEndpoint(tokenEndpoint)
            }

            /**
             * @param useExistingClientSecret Indicates whether to use the existing client secret
             *   when modifying a rule. If you are creating a rule, you can omit this parameter or
             *   set it to false.
             */
            override fun useExistingClientSecret(useExistingClientSecret: Boolean) {
                cdkBuilder.useExistingClientSecret(useExistingClientSecret)
            }

            /**
             * @param useExistingClientSecret Indicates whether to use the existing client secret
             *   when modifying a rule. If you are creating a rule, you can omit this parameter or
             *   set it to false.
             */
            override fun useExistingClientSecret(useExistingClientSecret: IResolvable) {
                cdkBuilder.useExistingClientSecret(useExistingClientSecret.let(IResolvable::unwrap))
            }

            /**
             * @param userInfoEndpoint The user info endpoint of the IdP. This must be a full URL,
             *   including the HTTPS protocol, the domain, and the path.
             */
            override fun userInfoEndpoint(userInfoEndpoint: String) {
                cdkBuilder.userInfoEndpoint(userInfoEndpoint)
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty,
        ) : AuthenticateOidcConfigProperty {
            /**
             * The query parameters (up to 10) to include in the redirect request to the
             * authorization endpoint.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authenticationrequestextraparams)
             */
            override fun authenticationRequestExtraParams(): Any? =
                unwrap(this).getAuthenticationRequestExtraParams()

            /**
             * The authorization endpoint of the IdP.
             *
             * This must be a full URL, including the HTTPS protocol, the domain, and the path.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authorizationendpoint)
             */
            override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

            /**
             * The OAuth 2.0 client identifier.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientid)
             */
            override fun clientId(): String = unwrap(this).getClientId()

            /**
             * The OAuth 2.0 client secret. This parameter is required if you are creating a rule.
             * If you are modifying a rule, you can omit this parameter if you set
             * `UseExistingClientSecret` to true.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientsecret)
             */
            override fun clientSecret(): String? = unwrap(this).getClientSecret()

            /**
             * The OIDC issuer identifier of the IdP.
             *
             * This must be a full URL, including the HTTPS protocol, the domain, and the path.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-issuer)
             */
            override fun issuer(): String = unwrap(this).getIssuer()

            /**
             * The behavior if the user is not authenticated. The following are possible values:.
             * * deny `` - Return an HTTP 401 Unauthorized error.
             * * allow `` - Allow the request to be forwarded to the target.
             * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is
             *   the default value.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-onunauthenticatedrequest)
             */
            override fun onUnauthenticatedRequest(): String? =
                unwrap(this).getOnUnauthenticatedRequest()

            /**
             * The set of user claims to be requested from the IdP. The default is `openid` .
             *
             * To verify which scope values your IdP supports and how to separate multiple values,
             * see the documentation for your IdP.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-scope)
             */
            override fun scope(): String? = unwrap(this).getScope()

            /**
             * The name of the cookie used to maintain session information.
             *
             * The default is AWSELBAuthSessionCookie.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessioncookiename)
             */
            override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

            /**
             * The maximum duration of the authentication session, in seconds.
             *
             * The default is 604800 seconds (7 days).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessiontimeout)
             */
            override fun sessionTimeout(): String? = unwrap(this).getSessionTimeout()

            /**
             * The token endpoint of the IdP.
             *
             * This must be a full URL, including the HTTPS protocol, the domain, and the path.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-tokenendpoint)
             */
            override fun tokenEndpoint(): String = unwrap(this).getTokenEndpoint()

            /**
             * Indicates whether to use the existing client secret when modifying a rule.
             *
             * If you are creating a rule, you can omit this parameter or set it to false.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-useexistingclientsecret)
             */
            override fun useExistingClientSecret(): Any? = unwrap(this).getUseExistingClientSecret()

            /**
             * The user info endpoint of the IdP.
             *
             * This must be a full URL, including the HTTPS protocol, the domain, and the path.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-userinfoendpoint)
             */
            override fun userInfoEndpoint(): String = unwrap(this).getUserInfoEndpoint()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): AuthenticateOidcConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty
            ): AuthenticateOidcConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AuthenticateOidcConfigProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateOidcConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RedirectConfigProperty {
        /**
         * The hostname.
         *
         * This component is not percent-encoded. The hostname can contain #{host}.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-host)
         */
        public fun host(): String? = unwrap(this).getHost()

        /**
         * The absolute path, starting with the leading "/".
         *
         * This component is not percent-encoded. The path can contain #{host}, #{path},
         * and #{port}.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-path)
         */
        public fun path(): String? = unwrap(this).getPath()

        /**
         * The port.
         *
         * You can specify a value from 1 to 65535 or #{port}.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-port)
         */
        public fun port(): String? = unwrap(this).getPort()

        /**
         * The protocol.
         *
         * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to
         * HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-protocol)
         */
        public fun protocol(): String? = unwrap(this).getProtocol()

        /**
         * The query parameters, URL-encoded when necessary, but not percent-encoded.
         *
         * Do not include the leading "?", as it is automatically added. You can specify any of the
         * reserved keywords.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-query)
         */
        public fun query(): String? = unwrap(this).getQuery()

        /**
         * The HTTP redirect code.
         *
         * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-statuscode)
         */
        public fun statusCode(): String

        /** A builder for [RedirectConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param host The hostname. This component is not percent-encoded. The hostname can
             *   contain #{host}.
             */
            public fun host(host: String)

            /**
             * @param path The absolute path, starting with the leading "/". This component is not
             *   percent-encoded. The path can contain #{host}, #{path}, and #{port}.
             */
            public fun path(path: String)

            /** @param port The port. You can specify a value from 1 to 65535 or #{port}. */
            public fun port(port: String)

            /**
             * @param protocol The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can
             *   redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS
             *   to HTTP.
             */
            public fun protocol(protocol: String)

            /**
             * @param query The query parameters, URL-encoded when necessary, but not
             *   percent-encoded. Do not include the leading "?", as it is automatically added. You
             *   can specify any of the reserved keywords.
             */
            public fun query(query: String)

            /**
             * @param statusCode The HTTP redirect code. The redirect is either permanent (HTTP 301)
             *   or temporary (HTTP 302).
             */
            public fun statusCode(statusCode: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .RedirectConfigProperty
                    .builder()

            /**
             * @param host The hostname. This component is not percent-encoded. The hostname can
             *   contain #{host}.
             */
            override fun host(host: String) {
                cdkBuilder.host(host)
            }

            /**
             * @param path The absolute path, starting with the leading "/". This component is not
             *   percent-encoded. The path can contain #{host}, #{path}, and #{port}.
             */
            override fun path(path: String) {
                cdkBuilder.path(path)
            }

            /** @param port The port. You can specify a value from 1 to 65535 or #{port}. */
            override fun port(port: String) {
                cdkBuilder.port(port)
            }

            /**
             * @param protocol The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can
             *   redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS
             *   to HTTP.
             */
            override fun protocol(protocol: String) {
                cdkBuilder.protocol(protocol)
            }

            /**
             * @param query The query parameters, URL-encoded when necessary, but not
             *   percent-encoded. Do not include the leading "?", as it is automatically added. You
             *   can specify any of the reserved keywords.
             */
            override fun query(query: String) {
                cdkBuilder.query(query)
            }

            /**
             * @param statusCode The HTTP redirect code. The redirect is either permanent (HTTP 301)
             *   or temporary (HTTP 302).
             */
            override fun statusCode(statusCode: String) {
                cdkBuilder.statusCode(statusCode)
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty,
        ) : RedirectConfigProperty {
            /**
             * The hostname.
             *
             * This component is not percent-encoded. The hostname can contain #{host}.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-host)
             */
            override fun host(): String? = unwrap(this).getHost()

            /**
             * The absolute path, starting with the leading "/".
             *
             * This component is not percent-encoded. The path can contain #{host}, #{path},
             * and #{port}.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-path)
             */
            override fun path(): String? = unwrap(this).getPath()

            /**
             * The port.
             *
             * You can specify a value from 1 to 65535 or #{port}.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-port)
             */
            override fun port(): String? = unwrap(this).getPort()

            /**
             * The protocol.
             *
             * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to
             * HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-protocol)
             */
            override fun protocol(): String? = unwrap(this).getProtocol()

            /**
             * The query parameters, URL-encoded when necessary, but not percent-encoded.
             *
             * Do not include the leading "?", as it is automatically added. You can specify any of
             * the reserved keywords.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-query)
             */
            override fun query(): String? = unwrap(this).getQuery()

            /**
             * The HTTP redirect code.
             *
             * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html#cfn-elasticloadbalancingv2-listener-redirectconfig-statuscode)
             */
            override fun statusCode(): String = unwrap(this).getStatusCode()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RedirectConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty
            ): RedirectConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RedirectConfigProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.RedirectConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AuthenticateCognitoConfigProperty {
        /**
         * The query parameters (up to 10) to include in the redirect request to the authorization
         * endpoint.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-authenticationrequestextraparams)
         */
        public fun authenticationRequestExtraParams(): Any? =
            unwrap(this).getAuthenticationRequestExtraParams()

        /**
         * The behavior if the user is not authenticated. The following are possible values:.
         * * deny `` - Return an HTTP 401 Unauthorized error.
         * * allow `` - Allow the request to be forwarded to the target.
         * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
         *   default value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-onunauthenticatedrequest)
         */
        public fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

        /**
         * The set of user claims to be requested from the IdP. The default is `openid` .
         *
         * To verify which scope values your IdP supports and how to separate multiple values, see
         * the documentation for your IdP.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-scope)
         */
        public fun scope(): String? = unwrap(this).getScope()

        /**
         * The name of the cookie used to maintain session information.
         *
         * The default is AWSELBAuthSessionCookie.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessioncookiename)
         */
        public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

        /**
         * The maximum duration of the authentication session, in seconds.
         *
         * The default is 604800 seconds (7 days).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessiontimeout)
         */
        public fun sessionTimeout(): String? = unwrap(this).getSessionTimeout()

        /**
         * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolarn)
         */
        public fun userPoolArn(): String

        /**
         * The ID of the Amazon Cognito user pool client.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolclientid)
         */
        public fun userPoolClientId(): String

        /**
         * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpooldomain)
         */
        public fun userPoolDomain(): String

        /** A builder for [AuthenticateCognitoConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param authenticationRequestExtraParams The query parameters (up to 10) to include in
             *   the redirect request to the authorization endpoint.
             */
            public fun authenticationRequestExtraParams(
                authenticationRequestExtraParams: IResolvable
            )

            /**
             * @param authenticationRequestExtraParams The query parameters (up to 10) to include in
             *   the redirect request to the authorization endpoint.
             */
            public fun authenticationRequestExtraParams(
                authenticationRequestExtraParams: Map<String, String>
            )

            /**
             * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The
             *   following are possible values:.
             * * deny `` - Return an HTTP 401 Unauthorized error.
             * * allow `` - Allow the request to be forwarded to the target.
             * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is
             *   the default value.
             */
            public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String)

            /**
             * @param scope The set of user claims to be requested from the IdP. The default is
             *   `openid` . To verify which scope values your IdP supports and how to separate
             *   multiple values, see the documentation for your IdP.
             */
            public fun scope(scope: String)

            /**
             * @param sessionCookieName The name of the cookie used to maintain session information.
             *   The default is AWSELBAuthSessionCookie.
             */
            public fun sessionCookieName(sessionCookieName: String)

            /**
             * @param sessionTimeout The maximum duration of the authentication session, in seconds.
             *   The default is 604800 seconds (7 days).
             */
            public fun sessionTimeout(sessionTimeout: String)

            /**
             * @param userPoolArn The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
             */
            public fun userPoolArn(userPoolArn: String)

            /** @param userPoolClientId The ID of the Amazon Cognito user pool client. */
            public fun userPoolClientId(userPoolClientId: String)

            /**
             * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon
             *   Cognito user pool.
             */
            public fun userPoolDomain(userPoolDomain: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty.Builder =
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
                    .AuthenticateCognitoConfigProperty
                    .builder()

            /**
             * @param authenticationRequestExtraParams The query parameters (up to 10) to include in
             *   the redirect request to the authorization endpoint.
             */
            override fun authenticationRequestExtraParams(
                authenticationRequestExtraParams: IResolvable
            ) {
                cdkBuilder.authenticationRequestExtraParams(
                    authenticationRequestExtraParams.let(IResolvable::unwrap)
                )
            }

            /**
             * @param authenticationRequestExtraParams The query parameters (up to 10) to include in
             *   the redirect request to the authorization endpoint.
             */
            override fun authenticationRequestExtraParams(
                authenticationRequestExtraParams: Map<String, String>
            ) {
                cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
            }

            /**
             * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The
             *   following are possible values:.
             * * deny `` - Return an HTTP 401 Unauthorized error.
             * * allow `` - Allow the request to be forwarded to the target.
             * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is
             *   the default value.
             */
            override fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
                cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
            }

            /**
             * @param scope The set of user claims to be requested from the IdP. The default is
             *   `openid` . To verify which scope values your IdP supports and how to separate
             *   multiple values, see the documentation for your IdP.
             */
            override fun scope(scope: String) {
                cdkBuilder.scope(scope)
            }

            /**
             * @param sessionCookieName The name of the cookie used to maintain session information.
             *   The default is AWSELBAuthSessionCookie.
             */
            override fun sessionCookieName(sessionCookieName: String) {
                cdkBuilder.sessionCookieName(sessionCookieName)
            }

            /**
             * @param sessionTimeout The maximum duration of the authentication session, in seconds.
             *   The default is 604800 seconds (7 days).
             */
            override fun sessionTimeout(sessionTimeout: String) {
                cdkBuilder.sessionTimeout(sessionTimeout)
            }

            /**
             * @param userPoolArn The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
             */
            override fun userPoolArn(userPoolArn: String) {
                cdkBuilder.userPoolArn(userPoolArn)
            }

            /** @param userPoolClientId The ID of the Amazon Cognito user pool client. */
            override fun userPoolClientId(userPoolClientId: String) {
                cdkBuilder.userPoolClientId(userPoolClientId)
            }

            /**
             * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon
             *   Cognito user pool.
             */
            override fun userPoolDomain(userPoolDomain: String) {
                cdkBuilder.userPoolDomain(userPoolDomain)
            }

            public fun build():
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty,
        ) : AuthenticateCognitoConfigProperty {
            /**
             * The query parameters (up to 10) to include in the redirect request to the
             * authorization endpoint.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-authenticationrequestextraparams)
             */
            override fun authenticationRequestExtraParams(): Any? =
                unwrap(this).getAuthenticationRequestExtraParams()

            /**
             * The behavior if the user is not authenticated. The following are possible values:.
             * * deny `` - Return an HTTP 401 Unauthorized error.
             * * allow `` - Allow the request to be forwarded to the target.
             * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is
             *   the default value.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-onunauthenticatedrequest)
             */
            override fun onUnauthenticatedRequest(): String? =
                unwrap(this).getOnUnauthenticatedRequest()

            /**
             * The set of user claims to be requested from the IdP. The default is `openid` .
             *
             * To verify which scope values your IdP supports and how to separate multiple values,
             * see the documentation for your IdP.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-scope)
             */
            override fun scope(): String? = unwrap(this).getScope()

            /**
             * The name of the cookie used to maintain session information.
             *
             * The default is AWSELBAuthSessionCookie.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessioncookiename)
             */
            override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

            /**
             * The maximum duration of the authentication session, in seconds.
             *
             * The default is 604800 seconds (7 days).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessiontimeout)
             */
            override fun sessionTimeout(): String? = unwrap(this).getSessionTimeout()

            /**
             * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolarn)
             */
            override fun userPoolArn(): String = unwrap(this).getUserPoolArn()

            /**
             * The ID of the Amazon Cognito user pool client.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolclientid)
             */
            override fun userPoolClientId(): String = unwrap(this).getUserPoolClientId()

            /**
             * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpooldomain)
             */
            override fun userPoolDomain(): String = unwrap(this).getUserPoolDomain()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): AuthenticateCognitoConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty
            ): AuthenticateCognitoConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AuthenticateCognitoConfigProperty
            ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.AuthenticateCognitoConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
