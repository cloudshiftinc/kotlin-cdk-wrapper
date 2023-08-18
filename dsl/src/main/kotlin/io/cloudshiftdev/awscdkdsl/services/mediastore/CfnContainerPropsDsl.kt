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

package io.cloudshiftdev.awscdkdsl.services.mediastore

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediastore.CfnContainer
import software.amazon.awscdk.services.mediastore.CfnContainerProps

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
@CdkDslMarker
public class CfnContainerPropsDsl {
    private val cdkBuilder: CfnContainerProps.Builder = CfnContainerProps.builder()

    private val _corsPolicy: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param accessLoggingEnabled The state of access logging on the container. This value is
     *   `false` by default, indicating that AWS Elemental MediaStore does not send access logs to
     *   Amazon CloudWatch Logs. When you enable access logging on the container, MediaStore changes
     *   this value to `true` , indicating that the service delivers access logs for objects stored
     *   in that container to CloudWatch Logs.
     */
    public fun accessLoggingEnabled(accessLoggingEnabled: Boolean) {
        cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    /**
     * @param accessLoggingEnabled The state of access logging on the container. This value is
     *   `false` by default, indicating that AWS Elemental MediaStore does not send access logs to
     *   Amazon CloudWatch Logs. When you enable access logging on the container, MediaStore changes
     *   this value to `true` , indicating that the service delivers access logs for objects stored
     *   in that container to CloudWatch Logs.
     */
    public fun accessLoggingEnabled(accessLoggingEnabled: IResolvable) {
        cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    /**
     * @param containerName The name for the container. The name must be from 1 to 255 characters.
     *   Container names must be unique to your AWS account within a specific region. As an example,
     *   you could create a container named `movies` in every region, as long as you don’t have an
     *   existing container with that name.
     */
    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    /**
     * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a container
     *   so that the container can service cross-origin requests. For example, you might want to
     *   enable a request whose origin is http://www.example.com to access your AWS Elemental
     *   MediaStore container at my.example.container.com by using the browser's XMLHttpRequest
     *   capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule
     * listed.
     *
     * To learn more about CORS, see
     * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
     * .
     */
    public fun corsPolicy(vararg corsPolicy: Any) {
        _corsPolicy.addAll(listOf(*corsPolicy))
    }

    /**
     * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a container
     *   so that the container can service cross-origin requests. For example, you might want to
     *   enable a request whose origin is http://www.example.com to access your AWS Elemental
     *   MediaStore container at my.example.container.com by using the browser's XMLHttpRequest
     *   capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule
     * listed.
     *
     * To learn more about CORS, see
     * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
     * .
     */
    public fun corsPolicy(corsPolicy: Collection<Any>) {
        _corsPolicy.addAll(corsPolicy)
    }

    /**
     * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a container
     *   so that the container can service cross-origin requests. For example, you might want to
     *   enable a request whose origin is http://www.example.com to access your AWS Elemental
     *   MediaStore container at my.example.container.com by using the browser's XMLHttpRequest
     *   capability.
     *
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule
     * listed.
     *
     * To learn more about CORS, see
     * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
     * .
     */
    public fun corsPolicy(corsPolicy: IResolvable) {
        cdkBuilder.corsPolicy(corsPolicy)
    }

    /**
     * @param lifecyclePolicy Writes an object lifecycle policy to a container. If the container
     *   already has an object lifecycle policy, the service replaces the existing policy with the
     *   new policy. It takes up to 20 minutes for the change to take effect.
     *
     * For information about how to construct an object lifecycle policy, see
     * [Components of an Object Lifecycle Policy](https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)
     * .
     */
    public fun lifecyclePolicy(lifecyclePolicy: String) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /** @param metricPolicy the value to be set. */
    public fun metricPolicy(metricPolicy: IResolvable) {
        cdkBuilder.metricPolicy(metricPolicy)
    }

    /** @param metricPolicy the value to be set. */
    public fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty) {
        cdkBuilder.metricPolicy(metricPolicy)
    }

    /**
     * @param policy Creates an access policy for the specified container to restrict the users and
     *   clients that can access it. For information about the data that is included in an access
     *   policy, see the
     *   [AWS Identity and Access Management User Guide](https://docs.aws.amazon.com/iam/) .
     *
     * For this release of the REST API, you can create only one policy for a container. If you
     * enter `PutContainerPolicy` twice, the second command modifies the existing policy.
     */
    public fun policy(policy: String) {
        cdkBuilder.policy(policy)
    }

    /** @param tags the value to be set. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags the value to be set. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnContainerProps {
        if (_corsPolicy.isNotEmpty()) cdkBuilder.corsPolicy(_corsPolicy)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
