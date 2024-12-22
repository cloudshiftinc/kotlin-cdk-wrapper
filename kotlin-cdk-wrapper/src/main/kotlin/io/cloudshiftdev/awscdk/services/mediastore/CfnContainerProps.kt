@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediastore

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnContainer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediastore.*;
 * CfnContainerProps cfnContainerProps = CfnContainerProps.builder()
 * .containerName("containerName")
 * // the properties below are optional
 * .accessLoggingEnabled(false)
 * .corsPolicy(List.of(CorsRuleProperty.builder()
 * .allowedHeaders(List.of("allowedHeaders"))
 * .allowedMethods(List.of("allowedMethods"))
 * .allowedOrigins(List.of("allowedOrigins"))
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAgeSeconds(123)
 * .build()))
 * .lifecyclePolicy("lifecyclePolicy")
 * .metricPolicy(MetricPolicyProperty.builder()
 * .containerLevelMetrics("containerLevelMetrics")
 * // the properties below are optional
 * .metricPolicyRules(List.of(MetricPolicyRuleProperty.builder()
 * .objectGroup("objectGroup")
 * .objectGroupName("objectGroupName")
 * .build()))
 * .build())
 * .policy("policy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html)
 */
public interface CfnContainerProps {
  /**
   * The state of access logging on the container.
   *
   * This value is `false` by default, indicating that AWS Elemental MediaStore does not send access
   * logs to Amazon CloudWatch Logs. When you enable access logging on the container, MediaStore
   * changes this value to `true` , indicating that the service delivers access logs for objects stored
   * in that container to CloudWatch Logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled)
   */
  public fun accessLoggingEnabled(): Any? = unwrap(this).getAccessLoggingEnabled()

  /**
   * The name for the container.
   *
   * The name must be from 1 to 255 characters. Container names must be unique to your AWS account
   * within a specific region. As an example, you could create a container named `movies` in every
   * region, as long as you don’t have an existing container with that name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername)
   */
  public fun containerName(): String

  /**
   * End of support notice: On November 13, 2025, AWS will discontinue support for AWS Elemental
   * MediaStore.
   *
   * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
   * console or AWS Elemental MediaStore resources. For more information, visit this [blog
   * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
   *
   * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
   * container can service cross-origin requests. For example, you might want to enable a request whose
   * origin is http://www.example.com to access your AWS Elemental MediaStore container at
   * my.example.container.com by using the browser's XMLHttpRequest capability.
   *
   * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
   * you configure rules that identify origins and the HTTP methods that can be executed on your
   * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS
   * policy. If more than one rule applies, the service uses the first applicable rule listed.
   *
   * To learn more about CORS, see [Cross-Origin Resource Sharing (CORS) in AWS Elemental
   * MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
   */
  public fun corsPolicy(): Any? = unwrap(this).getCorsPolicy()

  /**
   * End of support notice: On November 13, 2025, AWS will discontinue support for AWS Elemental
   * MediaStore.
   *
   * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
   * console or AWS Elemental MediaStore resources. For more information, visit this [blog
   * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
   *
   * Writes an object lifecycle policy to a container. If the container already has an object
   * lifecycle policy, the service replaces the existing policy with the new policy. It takes up to 20
   * minutes for the change to take effect.
   *
   * For information about how to construct an object lifecycle policy, see [Components of an Object
   * Lifecycle
   * Policy](https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy)
   */
  public fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

  /**
   * The metric policy that is associated with the container.
   *
   * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
   * policy, you must indicate whether you want MediaStore to send container-level metrics. You can
   * also include rules to define groups of objects that you want MediaStore to send object-level
   * metrics for.
   *
   * To view examples of how to construct a metric policy for your use case, see [Example Metric
   * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
   */
  public fun metricPolicy(): Any? = unwrap(this).getMetricPolicy()

  /**
   * Creates an access policy for the specified container to restrict the users and clients that can
   * access it.
   *
   * For information about the data that is included in an access policy, see the [AWS Identity and
   * Access Management User Guide](https://docs.aws.amazon.com/iam/) .
   *
   * For this release of the REST API, you can create only one policy for a container. If you enter
   * `PutContainerPolicy` twice, the second command modifies the existing policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy)
   */
  public fun policy(): String? = unwrap(this).getPolicy()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnContainerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLoggingEnabled The state of access logging on the container.
     * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
     * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
     * MediaStore changes this value to `true` , indicating that the service delivers access logs for
     * objects stored in that container to CloudWatch Logs.
     */
    public fun accessLoggingEnabled(accessLoggingEnabled: Boolean)

    /**
     * @param accessLoggingEnabled The state of access logging on the container.
     * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
     * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
     * MediaStore changes this value to `true` , indicating that the service delivers access logs for
     * objects stored in that container to CloudWatch Logs.
     */
    public fun accessLoggingEnabled(accessLoggingEnabled: IResolvable)

    /**
     * @param containerName The name for the container. 
     * The name must be from 1 to 255 characters. Container names must be unique to your AWS account
     * within a specific region. As an example, you could create a container named `movies` in every
     * region, as long as you don’t have an existing container with that name.
     */
    public fun containerName(containerName: String)

    /**
     * @param corsPolicy End of support notice: On November 13, 2025, AWS will discontinue support
     * for AWS Elemental MediaStore.
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests. For example, you might want to enable a request
     * whose origin is http://www.example.com to access your AWS Elemental MediaStore container at
     * my.example.container.com by using the browser's XMLHttpRequest capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
     *
     * To learn more about CORS, see [Cross-Origin Resource Sharing (CORS) in AWS Elemental
     * MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html) .
     */
    public fun corsPolicy(corsPolicy: IResolvable)

    /**
     * @param corsPolicy End of support notice: On November 13, 2025, AWS will discontinue support
     * for AWS Elemental MediaStore.
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests. For example, you might want to enable a request
     * whose origin is http://www.example.com to access your AWS Elemental MediaStore container at
     * my.example.container.com by using the browser's XMLHttpRequest capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
     *
     * To learn more about CORS, see [Cross-Origin Resource Sharing (CORS) in AWS Elemental
     * MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html) .
     */
    public fun corsPolicy(corsPolicy: List<Any>)

    /**
     * @param corsPolicy End of support notice: On November 13, 2025, AWS will discontinue support
     * for AWS Elemental MediaStore.
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests. For example, you might want to enable a request
     * whose origin is http://www.example.com to access your AWS Elemental MediaStore container at
     * my.example.container.com by using the browser's XMLHttpRequest capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
     *
     * To learn more about CORS, see [Cross-Origin Resource Sharing (CORS) in AWS Elemental
     * MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html) .
     */
    public fun corsPolicy(vararg corsPolicy: Any)

    /**
     * @param lifecyclePolicy End of support notice: On November 13, 2025, AWS will discontinue
     * support for AWS Elemental MediaStore.
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Writes an object lifecycle policy to a container. If the container already has an object
     * lifecycle policy, the service replaces the existing policy with the new policy. It takes up to
     * 20 minutes for the change to take effect.
     *
     * For information about how to construct an object lifecycle policy, see [Components of an
     * Object Lifecycle
     * Policy](https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)
     * .
     */
    public fun lifecyclePolicy(lifecyclePolicy: String)

    /**
     * @param metricPolicy The metric policy that is associated with the container.
     * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
     * policy, you must indicate whether you want MediaStore to send container-level metrics. You can
     * also include rules to define groups of objects that you want MediaStore to send object-level
     * metrics for.
     *
     * To view examples of how to construct a metric policy for your use case, see [Example Metric
     * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
     */
    public fun metricPolicy(metricPolicy: IResolvable)

    /**
     * @param metricPolicy The metric policy that is associated with the container.
     * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
     * policy, you must indicate whether you want MediaStore to send container-level metrics. You can
     * also include rules to define groups of objects that you want MediaStore to send object-level
     * metrics for.
     *
     * To view examples of how to construct a metric policy for your use case, see [Example Metric
     * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
     */
    public fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty)

    /**
     * @param metricPolicy The metric policy that is associated with the container.
     * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
     * policy, you must indicate whether you want MediaStore to send container-level metrics. You can
     * also include rules to define groups of objects that you want MediaStore to send object-level
     * metrics for.
     *
     * To view examples of how to construct a metric policy for your use case, see [Example Metric
     * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41affe32981c7187ad762a830107953301cbdaa00ad1df7d32cd97c2766e9bd2")
    public fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty.Builder.() -> Unit)

    /**
     * @param policy Creates an access policy for the specified container to restrict the users and
     * clients that can access it.
     * For information about the data that is included in an access policy, see the [AWS Identity
     * and Access Management User Guide](https://docs.aws.amazon.com/iam/) .
     *
     * For this release of the REST API, you can create only one policy for a container. If you
     * enter `PutContainerPolicy` twice, the second command modifies the existing policy.
     */
    public fun policy(policy: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediastore.CfnContainerProps.Builder =
        software.amazon.awscdk.services.mediastore.CfnContainerProps.builder()

    /**
     * @param accessLoggingEnabled The state of access logging on the container.
     * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
     * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
     * MediaStore changes this value to `true` , indicating that the service delivers access logs for
     * objects stored in that container to CloudWatch Logs.
     */
    override fun accessLoggingEnabled(accessLoggingEnabled: Boolean) {
      cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    /**
     * @param accessLoggingEnabled The state of access logging on the container.
     * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
     * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
     * MediaStore changes this value to `true` , indicating that the service delivers access logs for
     * objects stored in that container to CloudWatch Logs.
     */
    override fun accessLoggingEnabled(accessLoggingEnabled: IResolvable) {
      cdkBuilder.accessLoggingEnabled(accessLoggingEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param containerName The name for the container. 
     * The name must be from 1 to 255 characters. Container names must be unique to your AWS account
     * within a specific region. As an example, you could create a container named `movies` in every
     * region, as long as you don’t have an existing container with that name.
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    /**
     * @param corsPolicy End of support notice: On November 13, 2025, AWS will discontinue support
     * for AWS Elemental MediaStore.
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests. For example, you might want to enable a request
     * whose origin is http://www.example.com to access your AWS Elemental MediaStore container at
     * my.example.container.com by using the browser's XMLHttpRequest capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
     *
     * To learn more about CORS, see [Cross-Origin Resource Sharing (CORS) in AWS Elemental
     * MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html) .
     */
    override fun corsPolicy(corsPolicy: IResolvable) {
      cdkBuilder.corsPolicy(corsPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param corsPolicy End of support notice: On November 13, 2025, AWS will discontinue support
     * for AWS Elemental MediaStore.
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests. For example, you might want to enable a request
     * whose origin is http://www.example.com to access your AWS Elemental MediaStore container at
     * my.example.container.com by using the browser's XMLHttpRequest capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
     *
     * To learn more about CORS, see [Cross-Origin Resource Sharing (CORS) in AWS Elemental
     * MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html) .
     */
    override fun corsPolicy(corsPolicy: List<Any>) {
      cdkBuilder.corsPolicy(corsPolicy.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param corsPolicy End of support notice: On November 13, 2025, AWS will discontinue support
     * for AWS Elemental MediaStore.
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests. For example, you might want to enable a request
     * whose origin is http://www.example.com to access your AWS Elemental MediaStore container at
     * my.example.container.com by using the browser's XMLHttpRequest capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
     *
     * To learn more about CORS, see [Cross-Origin Resource Sharing (CORS) in AWS Elemental
     * MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html) .
     */
    override fun corsPolicy(vararg corsPolicy: Any): Unit = corsPolicy(corsPolicy.toList())

    /**
     * @param lifecyclePolicy End of support notice: On November 13, 2025, AWS will discontinue
     * support for AWS Elemental MediaStore.
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Writes an object lifecycle policy to a container. If the container already has an object
     * lifecycle policy, the service replaces the existing policy with the new policy. It takes up to
     * 20 minutes for the change to take effect.
     *
     * For information about how to construct an object lifecycle policy, see [Components of an
     * Object Lifecycle
     * Policy](https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)
     * .
     */
    override fun lifecyclePolicy(lifecyclePolicy: String) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * @param metricPolicy The metric policy that is associated with the container.
     * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
     * policy, you must indicate whether you want MediaStore to send container-level metrics. You can
     * also include rules to define groups of objects that you want MediaStore to send object-level
     * metrics for.
     *
     * To view examples of how to construct a metric policy for your use case, see [Example Metric
     * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
     */
    override fun metricPolicy(metricPolicy: IResolvable) {
      cdkBuilder.metricPolicy(metricPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param metricPolicy The metric policy that is associated with the container.
     * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
     * policy, you must indicate whether you want MediaStore to send container-level metrics. You can
     * also include rules to define groups of objects that you want MediaStore to send object-level
     * metrics for.
     *
     * To view examples of how to construct a metric policy for your use case, see [Example Metric
     * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
     */
    override fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty) {
      cdkBuilder.metricPolicy(metricPolicy.let(CfnContainer.MetricPolicyProperty.Companion::unwrap))
    }

    /**
     * @param metricPolicy The metric policy that is associated with the container.
     * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
     * policy, you must indicate whether you want MediaStore to send container-level metrics. You can
     * also include rules to define groups of objects that you want MediaStore to send object-level
     * metrics for.
     *
     * To view examples of how to construct a metric policy for your use case, see [Example Metric
     * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41affe32981c7187ad762a830107953301cbdaa00ad1df7d32cd97c2766e9bd2")
    override fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty.Builder.() -> Unit):
        Unit = metricPolicy(CfnContainer.MetricPolicyProperty(metricPolicy))

    /**
     * @param policy Creates an access policy for the specified container to restrict the users and
     * clients that can access it.
     * For information about the data that is included in an access policy, see the [AWS Identity
     * and Access Management User Guide](https://docs.aws.amazon.com/iam/) .
     *
     * For this release of the REST API, you can create only one policy for a container. If you
     * enter `PutContainerPolicy` twice, the second command modifies the existing policy.
     */
    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediastore.CfnContainerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediastore.CfnContainerProps,
  ) : CdkObject(cdkObject),
      CfnContainerProps {
    /**
     * The state of access logging on the container.
     *
     * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
     * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
     * MediaStore changes this value to `true` , indicating that the service delivers access logs for
     * objects stored in that container to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled)
     */
    override fun accessLoggingEnabled(): Any? = unwrap(this).getAccessLoggingEnabled()

    /**
     * The name for the container.
     *
     * The name must be from 1 to 255 characters. Container names must be unique to your AWS account
     * within a specific region. As an example, you could create a container named `movies` in every
     * region, as long as you don’t have an existing container with that name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername)
     */
    override fun containerName(): String = unwrap(this).getContainerName()

    /**
     * End of support notice: On November 13, 2025, AWS will discontinue support for AWS Elemental
     * MediaStore.
     *
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests. For example, you might want to enable a request
     * whose origin is http://www.example.com to access your AWS Elemental MediaStore container at
     * my.example.container.com by using the browser's XMLHttpRequest capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
     *
     * To learn more about CORS, see [Cross-Origin Resource Sharing (CORS) in AWS Elemental
     * MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
     */
    override fun corsPolicy(): Any? = unwrap(this).getCorsPolicy()

    /**
     * End of support notice: On November 13, 2025, AWS will discontinue support for AWS Elemental
     * MediaStore.
     *
     * After November 13, 2025, you will no longer be able to access the AWS Elemental MediaStore
     * console or AWS Elemental MediaStore resources. For more information, visit this [blog
     * post](https://docs.aws.amazon.com/media/support-for-aws-elemental-mediastore-ending-soon/) .
     *
     * Writes an object lifecycle policy to a container. If the container already has an object
     * lifecycle policy, the service replaces the existing policy with the new policy. It takes up to
     * 20 minutes for the change to take effect.
     *
     * For information about how to construct an object lifecycle policy, see [Components of an
     * Object Lifecycle
     * Policy](https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy)
     */
    override fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

    /**
     * The metric policy that is associated with the container.
     *
     * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
     * policy, you must indicate whether you want MediaStore to send container-level metrics. You can
     * also include rules to define groups of objects that you want MediaStore to send object-level
     * metrics for.
     *
     * To view examples of how to construct a metric policy for your use case, see [Example Metric
     * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
     */
    override fun metricPolicy(): Any? = unwrap(this).getMetricPolicy()

    /**
     * Creates an access policy for the specified container to restrict the users and clients that
     * can access it.
     *
     * For information about the data that is included in an access policy, see the [AWS Identity
     * and Access Management User Guide](https://docs.aws.amazon.com/iam/) .
     *
     * For this release of the REST API, you can create only one policy for a container. If you
     * enter `PutContainerPolicy` twice, the second command modifies the existing policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy)
     */
    override fun policy(): String? = unwrap(this).getPolicy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContainerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediastore.CfnContainerProps):
        CfnContainerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnContainerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContainerProps):
        software.amazon.awscdk.services.mediastore.CfnContainerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediastore.CfnContainerProps
  }
}
