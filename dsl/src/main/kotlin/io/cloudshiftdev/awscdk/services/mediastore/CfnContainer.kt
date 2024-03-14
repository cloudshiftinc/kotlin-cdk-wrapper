package io.cloudshiftdev.awscdk.services.mediastore

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnContainer
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.mediastore.CfnContainer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The state of access logging on the container. */
    public open fun accessLoggingEnabled(): Any? = unwrap(this).getAccessLoggingEnabled()

    /** The state of access logging on the container. */
    public open fun accessLoggingEnabled(`value`: Boolean) {
        unwrap(this).setAccessLoggingEnabled(`value`)
    }

    /** The state of access logging on the container. */
    public open fun accessLoggingEnabled(`value`: IResolvable) {
        unwrap(this).setAccessLoggingEnabled(`value`.let(IResolvable::unwrap))
    }

    /**
     * The DNS endpoint of the container.
     *
     * Use the endpoint to identify the specific container when sending requests to the data plane.
     * The service assigns this value when the container is created. Once the value has been
     * assigned, it does not change.
     */
    public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The name for the container. */
    public open fun containerName(): String = unwrap(this).getContainerName()

    /** The name for the container. */
    public open fun containerName(`value`: String) {
        unwrap(this).setContainerName(`value`)
    }

    /**
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests.
     */
    public open fun corsPolicy(): Any? = unwrap(this).getCorsPolicy()

    /**
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests.
     */
    public open fun corsPolicy(`value`: IResolvable) {
        unwrap(this).setCorsPolicy(`value`.let(IResolvable::unwrap))
    }

    /**
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests.
     */
    public open fun corsPolicy(__idx_ac66f0: List<Any>) {
        unwrap(this).setCorsPolicy(__idx_ac66f0)
    }

    /**
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests.
     */
    public open fun corsPolicy(vararg __idx_ac66f0: Any): Unit = corsPolicy(__idx_ac66f0.toList())

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Writes an object lifecycle policy to a container. */
    public open fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

    /** Writes an object lifecycle policy to a container. */
    public open fun lifecyclePolicy(`value`: String) {
        unwrap(this).setLifecyclePolicy(`value`)
    }

    /** The metric policy that is associated with the container. */
    public open fun metricPolicy(): Any? = unwrap(this).getMetricPolicy()

    /** The metric policy that is associated with the container. */
    public open fun metricPolicy(`value`: IResolvable) {
        unwrap(this).setMetricPolicy(`value`.let(IResolvable::unwrap))
    }

    /** The metric policy that is associated with the container. */
    public open fun metricPolicy(`value`: MetricPolicyProperty) {
        unwrap(this).setMetricPolicy(`value`.let(MetricPolicyProperty::unwrap))
    }

    /** The metric policy that is associated with the container. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("30ad567ccaa3199b28cca233862d91eadd4ede572bd2261c65ad626c00b0c6e3")
    public open fun metricPolicy(`value`: MetricPolicyProperty.Builder.() -> Unit): Unit =
        metricPolicy(MetricPolicyProperty(`value`))

    /**
     * Creates an access policy for the specified container to restrict the users and clients that
     * can access it.
     */
    public open fun policy(): String? = unwrap(this).getPolicy()

    /**
     * Creates an access policy for the specified container to restrict the users and clients that
     * can access it.
     */
    public open fun policy(`value`: String) {
        unwrap(this).setPolicy(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /**  */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /**  */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /**  */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.mediastore.CfnContainer]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The state of access logging on the container.
         *
         * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
         * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
         * MediaStore changes this value to `true` , indicating that the service delivers access
         * logs for objects stored in that container to CloudWatch Logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled)
         *
         * @param accessLoggingEnabled The state of access logging on the container.
         */
        public fun accessLoggingEnabled(accessLoggingEnabled: Boolean)

        /**
         * The state of access logging on the container.
         *
         * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
         * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
         * MediaStore changes this value to `true` , indicating that the service delivers access
         * logs for objects stored in that container to CloudWatch Logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled)
         *
         * @param accessLoggingEnabled The state of access logging on the container.
         */
        public fun accessLoggingEnabled(accessLoggingEnabled: IResolvable)

        /**
         * The name for the container.
         *
         * The name must be from 1 to 255 characters. Container names must be unique to your AWS
         * account within a specific region. As an example, you could create a container named
         * `movies` in every region, as long as you don’t have an existing container with that name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername)
         *
         * @param containerName The name for the container.
         */
        public fun containerName(containerName: String)

        /**
         * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
         * container can service cross-origin requests.
         *
         * For example, you might want to enable a request whose origin is http://www.example.com to
         * access your AWS Elemental MediaStore container at my.example.container.com by using the
         * browser's XMLHttpRequest capability.
         *
         * To enable CORS on a container, you attach a CORS policy to the container. In the CORS
         * policy, you configure rules that identify origins and the HTTP methods that can be
         * executed on your container. The policy can contain up to 398,000 characters. You can add
         * up to 100 rules to a CORS policy. If more than one rule applies, the service uses the
         * first applicable rule listed.
         *
         * To learn more about CORS, see
         * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
         *
         * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a
         *   container so that the container can service cross-origin requests.
         */
        public fun corsPolicy(corsPolicy: IResolvable)

        /**
         * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
         * container can service cross-origin requests.
         *
         * For example, you might want to enable a request whose origin is http://www.example.com to
         * access your AWS Elemental MediaStore container at my.example.container.com by using the
         * browser's XMLHttpRequest capability.
         *
         * To enable CORS on a container, you attach a CORS policy to the container. In the CORS
         * policy, you configure rules that identify origins and the HTTP methods that can be
         * executed on your container. The policy can contain up to 398,000 characters. You can add
         * up to 100 rules to a CORS policy. If more than one rule applies, the service uses the
         * first applicable rule listed.
         *
         * To learn more about CORS, see
         * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
         *
         * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a
         *   container so that the container can service cross-origin requests.
         */
        public fun corsPolicy(corsPolicy: List<Any>)

        /**
         * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
         * container can service cross-origin requests.
         *
         * For example, you might want to enable a request whose origin is http://www.example.com to
         * access your AWS Elemental MediaStore container at my.example.container.com by using the
         * browser's XMLHttpRequest capability.
         *
         * To enable CORS on a container, you attach a CORS policy to the container. In the CORS
         * policy, you configure rules that identify origins and the HTTP methods that can be
         * executed on your container. The policy can contain up to 398,000 characters. You can add
         * up to 100 rules to a CORS policy. If more than one rule applies, the service uses the
         * first applicable rule listed.
         *
         * To learn more about CORS, see
         * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
         *
         * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a
         *   container so that the container can service cross-origin requests.
         */
        public fun corsPolicy(vararg corsPolicy: Any)

        /**
         * Writes an object lifecycle policy to a container.
         *
         * If the container already has an object lifecycle policy, the service replaces the
         * existing policy with the new policy. It takes up to 20 minutes for the change to take
         * effect.
         *
         * For information about how to construct an object lifecycle policy, see
         * [Components of an Object Lifecycle Policy](https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy)
         *
         * @param lifecyclePolicy Writes an object lifecycle policy to a container.
         */
        public fun lifecyclePolicy(lifecyclePolicy: String)

        /**
         * The metric policy that is associated with the container.
         *
         * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In
         * the policy, you must indicate whether you want MediaStore to send container-level
         * metrics. You can also include rules to define groups of objects that you want MediaStore
         * to send object-level metrics for.
         *
         * To view examples of how to construct a metric policy for your use case, see
         * [Example Metric Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
         *
         * @param metricPolicy The metric policy that is associated with the container.
         */
        public fun metricPolicy(metricPolicy: IResolvable)

        /**
         * The metric policy that is associated with the container.
         *
         * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In
         * the policy, you must indicate whether you want MediaStore to send container-level
         * metrics. You can also include rules to define groups of objects that you want MediaStore
         * to send object-level metrics for.
         *
         * To view examples of how to construct a metric policy for your use case, see
         * [Example Metric Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
         *
         * @param metricPolicy The metric policy that is associated with the container.
         */
        public fun metricPolicy(metricPolicy: MetricPolicyProperty)

        /**
         * The metric policy that is associated with the container.
         *
         * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In
         * the policy, you must indicate whether you want MediaStore to send container-level
         * metrics. You can also include rules to define groups of objects that you want MediaStore
         * to send object-level metrics for.
         *
         * To view examples of how to construct a metric policy for your use case, see
         * [Example Metric Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
         *
         * @param metricPolicy The metric policy that is associated with the container.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e37cc4c8bc6c719112c42e2773256cdec9ad280b8934023a1763cc5845c8f29a")
        public fun metricPolicy(metricPolicy: MetricPolicyProperty.Builder.() -> Unit)

        /**
         * Creates an access policy for the specified container to restrict the users and clients
         * that can access it.
         *
         * For information about the data that is included in an access policy, see the
         * [AWS Identity and Access Management User Guide](https://docs.aws.amazon.com/iam/) .
         *
         * For this release of the REST API, you can create only one policy for a container. If you
         * enter `PutContainerPolicy` twice, the second command modifies the existing policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy)
         *
         * @param policy Creates an access policy for the specified container to restrict the users
         *   and clients that can access it.
         */
        public fun policy(policy: String)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-tags)
         *
         * @param tags
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-tags)
         *
         * @param tags
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.mediastore.CfnContainer.Builder =
            software.amazon.awscdk.services.mediastore.CfnContainer.Builder.create(scope, id)

        /**
         * The state of access logging on the container.
         *
         * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
         * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
         * MediaStore changes this value to `true` , indicating that the service delivers access
         * logs for objects stored in that container to CloudWatch Logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled)
         *
         * @param accessLoggingEnabled The state of access logging on the container.
         */
        override fun accessLoggingEnabled(accessLoggingEnabled: Boolean) {
            cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
        }

        /**
         * The state of access logging on the container.
         *
         * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
         * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
         * MediaStore changes this value to `true` , indicating that the service delivers access
         * logs for objects stored in that container to CloudWatch Logs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled)
         *
         * @param accessLoggingEnabled The state of access logging on the container.
         */
        override fun accessLoggingEnabled(accessLoggingEnabled: IResolvable) {
            cdkBuilder.accessLoggingEnabled(accessLoggingEnabled.let(IResolvable::unwrap))
        }

        /**
         * The name for the container.
         *
         * The name must be from 1 to 255 characters. Container names must be unique to your AWS
         * account within a specific region. As an example, you could create a container named
         * `movies` in every region, as long as you don’t have an existing container with that name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername)
         *
         * @param containerName The name for the container.
         */
        override fun containerName(containerName: String) {
            cdkBuilder.containerName(containerName)
        }

        /**
         * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
         * container can service cross-origin requests.
         *
         * For example, you might want to enable a request whose origin is http://www.example.com to
         * access your AWS Elemental MediaStore container at my.example.container.com by using the
         * browser's XMLHttpRequest capability.
         *
         * To enable CORS on a container, you attach a CORS policy to the container. In the CORS
         * policy, you configure rules that identify origins and the HTTP methods that can be
         * executed on your container. The policy can contain up to 398,000 characters. You can add
         * up to 100 rules to a CORS policy. If more than one rule applies, the service uses the
         * first applicable rule listed.
         *
         * To learn more about CORS, see
         * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
         *
         * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a
         *   container so that the container can service cross-origin requests.
         */
        override fun corsPolicy(corsPolicy: IResolvable) {
            cdkBuilder.corsPolicy(corsPolicy.let(IResolvable::unwrap))
        }

        /**
         * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
         * container can service cross-origin requests.
         *
         * For example, you might want to enable a request whose origin is http://www.example.com to
         * access your AWS Elemental MediaStore container at my.example.container.com by using the
         * browser's XMLHttpRequest capability.
         *
         * To enable CORS on a container, you attach a CORS policy to the container. In the CORS
         * policy, you configure rules that identify origins and the HTTP methods that can be
         * executed on your container. The policy can contain up to 398,000 characters. You can add
         * up to 100 rules to a CORS policy. If more than one rule applies, the service uses the
         * first applicable rule listed.
         *
         * To learn more about CORS, see
         * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
         *
         * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a
         *   container so that the container can service cross-origin requests.
         */
        override fun corsPolicy(corsPolicy: List<Any>) {
            cdkBuilder.corsPolicy(corsPolicy)
        }

        /**
         * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
         * container can service cross-origin requests.
         *
         * For example, you might want to enable a request whose origin is http://www.example.com to
         * access your AWS Elemental MediaStore container at my.example.container.com by using the
         * browser's XMLHttpRequest capability.
         *
         * To enable CORS on a container, you attach a CORS policy to the container. In the CORS
         * policy, you configure rules that identify origins and the HTTP methods that can be
         * executed on your container. The policy can contain up to 398,000 characters. You can add
         * up to 100 rules to a CORS policy. If more than one rule applies, the service uses the
         * first applicable rule listed.
         *
         * To learn more about CORS, see
         * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
         *
         * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a
         *   container so that the container can service cross-origin requests.
         */
        override fun corsPolicy(vararg corsPolicy: Any): Unit = corsPolicy(corsPolicy.toList())

        /**
         * Writes an object lifecycle policy to a container.
         *
         * If the container already has an object lifecycle policy, the service replaces the
         * existing policy with the new policy. It takes up to 20 minutes for the change to take
         * effect.
         *
         * For information about how to construct an object lifecycle policy, see
         * [Components of an Object Lifecycle Policy](https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy)
         *
         * @param lifecyclePolicy Writes an object lifecycle policy to a container.
         */
        override fun lifecyclePolicy(lifecyclePolicy: String) {
            cdkBuilder.lifecyclePolicy(lifecyclePolicy)
        }

        /**
         * The metric policy that is associated with the container.
         *
         * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In
         * the policy, you must indicate whether you want MediaStore to send container-level
         * metrics. You can also include rules to define groups of objects that you want MediaStore
         * to send object-level metrics for.
         *
         * To view examples of how to construct a metric policy for your use case, see
         * [Example Metric Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
         *
         * @param metricPolicy The metric policy that is associated with the container.
         */
        override fun metricPolicy(metricPolicy: IResolvable) {
            cdkBuilder.metricPolicy(metricPolicy.let(IResolvable::unwrap))
        }

        /**
         * The metric policy that is associated with the container.
         *
         * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In
         * the policy, you must indicate whether you want MediaStore to send container-level
         * metrics. You can also include rules to define groups of objects that you want MediaStore
         * to send object-level metrics for.
         *
         * To view examples of how to construct a metric policy for your use case, see
         * [Example Metric Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
         *
         * @param metricPolicy The metric policy that is associated with the container.
         */
        override fun metricPolicy(metricPolicy: MetricPolicyProperty) {
            cdkBuilder.metricPolicy(metricPolicy.let(MetricPolicyProperty::unwrap))
        }

        /**
         * The metric policy that is associated with the container.
         *
         * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In
         * the policy, you must indicate whether you want MediaStore to send container-level
         * metrics. You can also include rules to define groups of objects that you want MediaStore
         * to send object-level metrics for.
         *
         * To view examples of how to construct a metric policy for your use case, see
         * [Example Metric Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
         *
         * @param metricPolicy The metric policy that is associated with the container.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e37cc4c8bc6c719112c42e2773256cdec9ad280b8934023a1763cc5845c8f29a")
        override fun metricPolicy(metricPolicy: MetricPolicyProperty.Builder.() -> Unit): Unit =
            metricPolicy(MetricPolicyProperty(metricPolicy))

        /**
         * Creates an access policy for the specified container to restrict the users and clients
         * that can access it.
         *
         * For information about the data that is included in an access policy, see the
         * [AWS Identity and Access Management User Guide](https://docs.aws.amazon.com/iam/) .
         *
         * For this release of the REST API, you can create only one policy for a container. If you
         * enter `PutContainerPolicy` twice, the second command modifies the existing policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy)
         *
         * @param policy Creates an access policy for the specified container to restrict the users
         *   and clients that can access it.
         */
        override fun policy(policy: String) {
            cdkBuilder.policy(policy)
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-tags)
         *
         * @param tags
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-tags)
         *
         * @param tags
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.mediastore.CfnContainer =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnContainer {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnContainer(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.mediastore.CfnContainer
        ): CfnContainer = CfnContainer(cdkObject)

        internal fun unwrap(
            wrapped: CfnContainer
        ): software.amazon.awscdk.services.mediastore.CfnContainer = wrapped.cdkObject
    }

    public interface MetricPolicyRuleProperty {
        /**
         * A path or file name that defines which objects to include in the group.
         *
         * Wildcards (*) are acceptable.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroup)
         */
        public fun objectGroup(): String

        /**
         * A name that allows you to refer to the object group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroupname)
         */
        public fun objectGroupName(): String

        /** A builder for [MetricPolicyRuleProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param objectGroup A path or file name that defines which objects to include in the
             *   group. Wildcards (*) are acceptable.
             */
            public fun objectGroup(objectGroup: String)

            /** @param objectGroupName A name that allows you to refer to the object group. */
            public fun objectGroupName(objectGroupName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty.Builder =
                software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty
                    .builder()

            /**
             * @param objectGroup A path or file name that defines which objects to include in the
             *   group. Wildcards (*) are acceptable.
             */
            override fun objectGroup(objectGroup: String) {
                cdkBuilder.objectGroup(objectGroup)
            }

            /** @param objectGroupName A name that allows you to refer to the object group. */
            override fun objectGroupName(objectGroupName: String) {
                cdkBuilder.objectGroupName(objectGroupName)
            }

            public fun build():
                software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty,
        ) : MetricPolicyRuleProperty {
            /**
             * A path or file name that defines which objects to include in the group.
             *
             * Wildcards (*) are acceptable.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroup)
             */
            override fun objectGroup(): String = unwrap(this).getObjectGroup()

            /**
             * A name that allows you to refer to the object group.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html#cfn-mediastore-container-metricpolicyrule-objectgroupname)
             */
            override fun objectGroupName(): String = unwrap(this).getObjectGroupName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MetricPolicyRuleProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty
            ): MetricPolicyRuleProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MetricPolicyRuleProperty
            ): software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MetricPolicyProperty {
        /**
         * A setting to enable or disable metrics at the container level.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-containerlevelmetrics)
         */
        public fun containerLevelMetrics(): String

        /**
         * A parameter that holds an array of rules that enable metrics at the object level.
         *
         * This parameter is optional, but if you choose to include it, you must also include at
         * least one rule. By default, you can include up to five rules. You can also
         * [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
         * to allow up to 300 rules per policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-metricpolicyrules)
         */
        public fun metricPolicyRules(): Any? = unwrap(this).getMetricPolicyRules()

        /** A builder for [MetricPolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param containerLevelMetrics A setting to enable or disable metrics at the container
             *   level.
             */
            public fun containerLevelMetrics(containerLevelMetrics: String)

            /**
             * @param metricPolicyRules A parameter that holds an array of rules that enable metrics
             *   at the object level. This parameter is optional, but if you choose to include it,
             *   you must also include at least one rule. By default, you can include up to five
             *   rules. You can also
             *   [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
             *   to allow up to 300 rules per policy.
             */
            public fun metricPolicyRules(metricPolicyRules: IResolvable)

            /**
             * @param metricPolicyRules A parameter that holds an array of rules that enable metrics
             *   at the object level. This parameter is optional, but if you choose to include it,
             *   you must also include at least one rule. By default, you can include up to five
             *   rules. You can also
             *   [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
             *   to allow up to 300 rules per policy.
             */
            public fun metricPolicyRules(metricPolicyRules: List<Any>)

            /**
             * @param metricPolicyRules A parameter that holds an array of rules that enable metrics
             *   at the object level. This parameter is optional, but if you choose to include it,
             *   you must also include at least one rule. By default, you can include up to five
             *   rules. You can also
             *   [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
             *   to allow up to 300 rules per policy.
             */
            public fun metricPolicyRules(vararg metricPolicyRules: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty.Builder =
                software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty
                    .builder()

            /**
             * @param containerLevelMetrics A setting to enable or disable metrics at the container
             *   level.
             */
            override fun containerLevelMetrics(containerLevelMetrics: String) {
                cdkBuilder.containerLevelMetrics(containerLevelMetrics)
            }

            /**
             * @param metricPolicyRules A parameter that holds an array of rules that enable metrics
             *   at the object level. This parameter is optional, but if you choose to include it,
             *   you must also include at least one rule. By default, you can include up to five
             *   rules. You can also
             *   [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
             *   to allow up to 300 rules per policy.
             */
            override fun metricPolicyRules(metricPolicyRules: IResolvable) {
                cdkBuilder.metricPolicyRules(metricPolicyRules.let(IResolvable::unwrap))
            }

            /**
             * @param metricPolicyRules A parameter that holds an array of rules that enable metrics
             *   at the object level. This parameter is optional, but if you choose to include it,
             *   you must also include at least one rule. By default, you can include up to five
             *   rules. You can also
             *   [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
             *   to allow up to 300 rules per policy.
             */
            override fun metricPolicyRules(metricPolicyRules: List<Any>) {
                cdkBuilder.metricPolicyRules(metricPolicyRules)
            }

            /**
             * @param metricPolicyRules A parameter that holds an array of rules that enable metrics
             *   at the object level. This parameter is optional, but if you choose to include it,
             *   you must also include at least one rule. By default, you can include up to five
             *   rules. You can also
             *   [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
             *   to allow up to 300 rules per policy.
             */
            override fun metricPolicyRules(vararg metricPolicyRules: Any): Unit =
                metricPolicyRules(metricPolicyRules.toList())

            public fun build():
                software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty,
        ) : MetricPolicyProperty {
            /**
             * A setting to enable or disable metrics at the container level.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-containerlevelmetrics)
             */
            override fun containerLevelMetrics(): String = unwrap(this).getContainerLevelMetrics()

            /**
             * A parameter that holds an array of rules that enable metrics at the object level.
             *
             * This parameter is optional, but if you choose to include it, you must also include at
             * least one rule. By default, you can include up to five rules. You can also
             * [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
             * to allow up to 300 rules per policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html#cfn-mediastore-container-metricpolicy-metricpolicyrules)
             */
            override fun metricPolicyRules(): Any? = unwrap(this).getMetricPolicyRules()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MetricPolicyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty
            ): MetricPolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MetricPolicyProperty
            ): software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CorsRuleProperty {
        /**
         * Specifies which headers are allowed in a preflight `OPTIONS` request through the
         * `Access-Control-Request-Headers` header.
         *
         * Each header name that is specified in `Access-Control-Request-Headers` must have a
         * corresponding entry in the rule. Only the headers that were requested are sent back.
         *
         * This element can contain only one wildcard character (*).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedheaders)
         */
        public fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

        /**
         * Identifies an HTTP method that the origin that is specified in the rule is allowed to
         * execute.
         *
         * Each CORS rule must contain at least one `AllowedMethods` and one `AllowedOrigins`
         * element.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedmethods)
         */
        public fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

        /**
         * One or more response headers that you want users to be able to access from their
         * applications (for example, from a JavaScript `XMLHttpRequest` object).
         *
         * Each CORS rule must have at least one `AllowedOrigins` element. The string value can
         * include only one wildcard character (*), for example, http:// *.example.com.
         * Additionally, you can specify only one wildcard character to allow cross-origin access
         * for all origins.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedorigins)
         */
        public fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins() ?: emptyList()

        /**
         * One or more headers in the response that you want users to be able to access from their
         * applications (for example, from a JavaScript `XMLHttpRequest` object).
         *
         * This element is optional for each rule.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-exposeheaders)
         */
        public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

        /**
         * The time in seconds that your browser caches the preflight response for the specified
         * resource.
         *
         * A CORS rule can have only one `MaxAgeSeconds` element.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-maxageseconds)
         */
        public fun maxAgeSeconds(): Number? = unwrap(this).getMaxAgeSeconds()

        /** A builder for [CorsRuleProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param allowedHeaders Specifies which headers are allowed in a preflight `OPTIONS`
             *   request through the `Access-Control-Request-Headers` header. Each header name that
             *   is specified in `Access-Control-Request-Headers` must have a corresponding entry in
             *   the rule. Only the headers that were requested are sent back.
             *
             * This element can contain only one wildcard character (*).
             */
            public fun allowedHeaders(allowedHeaders: List<String>)

            /**
             * @param allowedHeaders Specifies which headers are allowed in a preflight `OPTIONS`
             *   request through the `Access-Control-Request-Headers` header. Each header name that
             *   is specified in `Access-Control-Request-Headers` must have a corresponding entry in
             *   the rule. Only the headers that were requested are sent back.
             *
             * This element can contain only one wildcard character (*).
             */
            public fun allowedHeaders(vararg allowedHeaders: String)

            /**
             * @param allowedMethods Identifies an HTTP method that the origin that is specified in
             *   the rule is allowed to execute. Each CORS rule must contain at least one
             *   `AllowedMethods` and one `AllowedOrigins` element.
             */
            public fun allowedMethods(allowedMethods: List<String>)

            /**
             * @param allowedMethods Identifies an HTTP method that the origin that is specified in
             *   the rule is allowed to execute. Each CORS rule must contain at least one
             *   `AllowedMethods` and one `AllowedOrigins` element.
             */
            public fun allowedMethods(vararg allowedMethods: String)

            /**
             * @param allowedOrigins One or more response headers that you want users to be able to
             *   access from their applications (for example, from a JavaScript `XMLHttpRequest`
             *   object). Each CORS rule must have at least one `AllowedOrigins` element. The string
             *   value can include only one wildcard character (*), for example, http://
             *   *.example.com. Additionally, you can specify only one wildcard character to allow
             *   cross-origin access for all origins.
             */
            public fun allowedOrigins(allowedOrigins: List<String>)

            /**
             * @param allowedOrigins One or more response headers that you want users to be able to
             *   access from their applications (for example, from a JavaScript `XMLHttpRequest`
             *   object). Each CORS rule must have at least one `AllowedOrigins` element. The string
             *   value can include only one wildcard character (*), for example, http://
             *   *.example.com. Additionally, you can specify only one wildcard character to allow
             *   cross-origin access for all origins.
             */
            public fun allowedOrigins(vararg allowedOrigins: String)

            /**
             * @param exposeHeaders One or more headers in the response that you want users to be
             *   able to access from their applications (for example, from a JavaScript
             *   `XMLHttpRequest` object). This element is optional for each rule.
             */
            public fun exposeHeaders(exposeHeaders: List<String>)

            /**
             * @param exposeHeaders One or more headers in the response that you want users to be
             *   able to access from their applications (for example, from a JavaScript
             *   `XMLHttpRequest` object). This element is optional for each rule.
             */
            public fun exposeHeaders(vararg exposeHeaders: String)

            /**
             * @param maxAgeSeconds The time in seconds that your browser caches the preflight
             *   response for the specified resource. A CORS rule can have only one `MaxAgeSeconds`
             *   element.
             */
            public fun maxAgeSeconds(maxAgeSeconds: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty.Builder =
                software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty.builder()

            /**
             * @param allowedHeaders Specifies which headers are allowed in a preflight `OPTIONS`
             *   request through the `Access-Control-Request-Headers` header. Each header name that
             *   is specified in `Access-Control-Request-Headers` must have a corresponding entry in
             *   the rule. Only the headers that were requested are sent back.
             *
             * This element can contain only one wildcard character (*).
             */
            override fun allowedHeaders(allowedHeaders: List<String>) {
                cdkBuilder.allowedHeaders(allowedHeaders)
            }

            /**
             * @param allowedHeaders Specifies which headers are allowed in a preflight `OPTIONS`
             *   request through the `Access-Control-Request-Headers` header. Each header name that
             *   is specified in `Access-Control-Request-Headers` must have a corresponding entry in
             *   the rule. Only the headers that were requested are sent back.
             *
             * This element can contain only one wildcard character (*).
             */
            override fun allowedHeaders(vararg allowedHeaders: String): Unit =
                allowedHeaders(allowedHeaders.toList())

            /**
             * @param allowedMethods Identifies an HTTP method that the origin that is specified in
             *   the rule is allowed to execute. Each CORS rule must contain at least one
             *   `AllowedMethods` and one `AllowedOrigins` element.
             */
            override fun allowedMethods(allowedMethods: List<String>) {
                cdkBuilder.allowedMethods(allowedMethods)
            }

            /**
             * @param allowedMethods Identifies an HTTP method that the origin that is specified in
             *   the rule is allowed to execute. Each CORS rule must contain at least one
             *   `AllowedMethods` and one `AllowedOrigins` element.
             */
            override fun allowedMethods(vararg allowedMethods: String): Unit =
                allowedMethods(allowedMethods.toList())

            /**
             * @param allowedOrigins One or more response headers that you want users to be able to
             *   access from their applications (for example, from a JavaScript `XMLHttpRequest`
             *   object). Each CORS rule must have at least one `AllowedOrigins` element. The string
             *   value can include only one wildcard character (*), for example, http://
             *   *.example.com. Additionally, you can specify only one wildcard character to allow
             *   cross-origin access for all origins.
             */
            override fun allowedOrigins(allowedOrigins: List<String>) {
                cdkBuilder.allowedOrigins(allowedOrigins)
            }

            /**
             * @param allowedOrigins One or more response headers that you want users to be able to
             *   access from their applications (for example, from a JavaScript `XMLHttpRequest`
             *   object). Each CORS rule must have at least one `AllowedOrigins` element. The string
             *   value can include only one wildcard character (*), for example, http://
             *   *.example.com. Additionally, you can specify only one wildcard character to allow
             *   cross-origin access for all origins.
             */
            override fun allowedOrigins(vararg allowedOrigins: String): Unit =
                allowedOrigins(allowedOrigins.toList())

            /**
             * @param exposeHeaders One or more headers in the response that you want users to be
             *   able to access from their applications (for example, from a JavaScript
             *   `XMLHttpRequest` object). This element is optional for each rule.
             */
            override fun exposeHeaders(exposeHeaders: List<String>) {
                cdkBuilder.exposeHeaders(exposeHeaders)
            }

            /**
             * @param exposeHeaders One or more headers in the response that you want users to be
             *   able to access from their applications (for example, from a JavaScript
             *   `XMLHttpRequest` object). This element is optional for each rule.
             */
            override fun exposeHeaders(vararg exposeHeaders: String): Unit =
                exposeHeaders(exposeHeaders.toList())

            /**
             * @param maxAgeSeconds The time in seconds that your browser caches the preflight
             *   response for the specified resource. A CORS rule can have only one `MaxAgeSeconds`
             *   element.
             */
            override fun maxAgeSeconds(maxAgeSeconds: Number) {
                cdkBuilder.maxAgeSeconds(maxAgeSeconds)
            }

            public fun build():
                software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty,
        ) : CorsRuleProperty {
            /**
             * Specifies which headers are allowed in a preflight `OPTIONS` request through the
             * `Access-Control-Request-Headers` header.
             *
             * Each header name that is specified in `Access-Control-Request-Headers` must have a
             * corresponding entry in the rule. Only the headers that were requested are sent back.
             *
             * This element can contain only one wildcard character (*).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedheaders)
             */
            override fun allowedHeaders(): List<String> =
                unwrap(this).getAllowedHeaders() ?: emptyList()

            /**
             * Identifies an HTTP method that the origin that is specified in the rule is allowed to
             * execute.
             *
             * Each CORS rule must contain at least one `AllowedMethods` and one `AllowedOrigins`
             * element.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedmethods)
             */
            override fun allowedMethods(): List<String> =
                unwrap(this).getAllowedMethods() ?: emptyList()

            /**
             * One or more response headers that you want users to be able to access from their
             * applications (for example, from a JavaScript `XMLHttpRequest` object).
             *
             * Each CORS rule must have at least one `AllowedOrigins` element. The string value can
             * include only one wildcard character (*), for example, http:// *.example.com.
             * Additionally, you can specify only one wildcard character to allow cross-origin
             * access for all origins.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-allowedorigins)
             */
            override fun allowedOrigins(): List<String> =
                unwrap(this).getAllowedOrigins() ?: emptyList()

            /**
             * One or more headers in the response that you want users to be able to access from
             * their applications (for example, from a JavaScript `XMLHttpRequest` object).
             *
             * This element is optional for each rule.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-exposeheaders)
             */
            override fun exposeHeaders(): List<String> =
                unwrap(this).getExposeHeaders() ?: emptyList()

            /**
             * The time in seconds that your browser caches the preflight response for the specified
             * resource.
             *
             * A CORS rule can have only one `MaxAgeSeconds` element.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html#cfn-mediastore-container-corsrule-maxageseconds)
             */
            override fun maxAgeSeconds(): Number? = unwrap(this).getMaxAgeSeconds()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CorsRuleProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty
            ): CorsRuleProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CorsRuleProperty
            ): software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
