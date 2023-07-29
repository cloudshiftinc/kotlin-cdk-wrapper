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

package cloudshift.awscdk.dsl.services.mediastore

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediastore.CfnContainer
import software.amazon.awscdk.services.mediastore.CfnContainerProps
import software.constructs.Construct

public object mediastore {
    /**
     * The AWS::MediaStore::Container resource specifies a storage container to hold objects.
     *
     * A container is similar to a bucket in Amazon S3.
     *
     * When you create a container using AWS CloudFormation , the template manages data for five API
     * actions: creating a container, setting access logging, updating the default container policy,
     * adding a cross-origin resource sharing (CORS) policy, and adding an object lifecycle policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediastore.*;
     * CfnContainer cfnContainer = CfnContainer.Builder.create(this, "MyCfnContainer")
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
    public inline fun cfnContainer(
        scope: Construct,
        id: String,
        block: CfnContainerDsl.() -> Unit = {},
    ): CfnContainer {
        val builder = CfnContainerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule for a CORS policy.
     *
     * You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses
     * the first applicable rule listed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediastore.*;
     * CorsRuleProperty corsRuleProperty = CorsRuleProperty.builder()
     * .allowedHeaders(List.of("allowedHeaders"))
     * .allowedMethods(List.of("allowedMethods"))
     * .allowedOrigins(List.of("allowedOrigins"))
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAgeSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-corsrule.html)
     */
    public inline fun cfnContainerCorsRuleProperty(
        block: CfnContainerCorsRulePropertyDsl.() -> Unit = {}
    ): CfnContainer.CorsRuleProperty {
        val builder = CfnContainerCorsRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The metric policy that is associated with the container.
     *
     * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
     * policy, you must indicate whether you want MediaStore to send container-level metrics. You
     * can also include rules to define groups of objects that you want MediaStore to send
     * object-level metrics for.
     *
     * To view examples of how to construct a metric policy for your use case, see
     * [Example Metric Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediastore.*;
     * MetricPolicyProperty metricPolicyProperty = MetricPolicyProperty.builder()
     * .containerLevelMetrics("containerLevelMetrics")
     * // the properties below are optional
     * .metricPolicyRules(List.of(MetricPolicyRuleProperty.builder()
     * .objectGroup("objectGroup")
     * .objectGroupName("objectGroupName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html)
     */
    public inline fun cfnContainerMetricPolicyProperty(
        block: CfnContainerMetricPolicyPropertyDsl.() -> Unit = {}
    ): CfnContainer.MetricPolicyProperty {
        val builder = CfnContainerMetricPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A setting that enables metrics at the object level.
     *
     * Each rule contains an object group and an object group name. If the policy includes the
     * MetricPolicyRules parameter, you must include at least one rule. Each metric policy can
     * include up to five rules by default. You can also
     * [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
     * to allow up to 300 rules per policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediastore.*;
     * MetricPolicyRuleProperty metricPolicyRuleProperty = MetricPolicyRuleProperty.builder()
     * .objectGroup("objectGroup")
     * .objectGroupName("objectGroupName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html)
     */
    public inline fun cfnContainerMetricPolicyRuleProperty(
        block: CfnContainerMetricPolicyRulePropertyDsl.() -> Unit = {}
    ): CfnContainer.MetricPolicyRuleProperty {
        val builder = CfnContainerMetricPolicyRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnContainer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediastore.*;
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
    public inline fun cfnContainerProps(
        block: CfnContainerPropsDsl.() -> Unit = {}
    ): CfnContainerProps {
        val builder = CfnContainerPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
