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

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediastore.CfnContainer
import software.constructs.Construct

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
@CdkDslMarker
public class CfnContainerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnContainer.Builder = CfnContainer.Builder.create(scope, id)

    private val _corsPolicy: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The state of access logging on the container.
     *
     * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
     * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
     * MediaStore changes this value to `true` , indicating that the service delivers access logs
     * for objects stored in that container to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled)
     *
     * @param accessLoggingEnabled The state of access logging on the container.
     */
    public fun accessLoggingEnabled(accessLoggingEnabled: Boolean) {
        cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    /**
     * The state of access logging on the container.
     *
     * This value is `false` by default, indicating that AWS Elemental MediaStore does not send
     * access logs to Amazon CloudWatch Logs. When you enable access logging on the container,
     * MediaStore changes this value to `true` , indicating that the service delivers access logs
     * for objects stored in that container to CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-accessloggingenabled)
     *
     * @param accessLoggingEnabled The state of access logging on the container.
     */
    public fun accessLoggingEnabled(accessLoggingEnabled: IResolvable) {
        cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    /**
     * The name for the container.
     *
     * The name must be from 1 to 255 characters. Container names must be unique to your AWS account
     * within a specific region. As an example, you could create a container named `movies` in every
     * region, as long as you don’t have an existing container with that name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-containername)
     *
     * @param containerName The name for the container.
     */
    public fun containerName(containerName: String) {
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
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy,
     * you configure rules that identify origins and the HTTP methods that can be executed on your
     * container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a
     * CORS policy. If more than one rule applies, the service uses the first applicable rule
     * listed.
     *
     * To learn more about CORS, see
     * [Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore](https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
     *
     * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a container
     *   so that the container can service cross-origin requests.
     */
    public fun corsPolicy(vararg corsPolicy: Any) {
        _corsPolicy.addAll(listOf(*corsPolicy))
    }

    /**
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests.
     *
     * For example, you might want to enable a request whose origin is http://www.example.com to
     * access your AWS Elemental MediaStore container at my.example.container.com by using the
     * browser's XMLHttpRequest capability.
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
     *
     * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a container
     *   so that the container can service cross-origin requests.
     */
    public fun corsPolicy(corsPolicy: Collection<Any>) {
        _corsPolicy.addAll(corsPolicy)
    }

    /**
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the
     * container can service cross-origin requests.
     *
     * For example, you might want to enable a request whose origin is http://www.example.com to
     * access your AWS Elemental MediaStore container at my.example.container.com by using the
     * browser's XMLHttpRequest capability.
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-corspolicy)
     *
     * @param corsPolicy Sets the cross-origin resource sharing (CORS) configuration on a container
     *   so that the container can service cross-origin requests.
     */
    public fun corsPolicy(corsPolicy: IResolvable) {
        cdkBuilder.corsPolicy(corsPolicy)
    }

    /**
     * Writes an object lifecycle policy to a container.
     *
     * If the container already has an object lifecycle policy, the service replaces the existing
     * policy with the new policy. It takes up to 20 minutes for the change to take effect.
     *
     * For information about how to construct an object lifecycle policy, see
     * [Components of an Object Lifecycle Policy](https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-lifecyclepolicy)
     *
     * @param lifecyclePolicy Writes an object lifecycle policy to a container.
     */
    public fun lifecyclePolicy(lifecyclePolicy: String) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
     *
     * @param metricPolicy
     */
    public fun metricPolicy(metricPolicy: IResolvable) {
        cdkBuilder.metricPolicy(metricPolicy)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-metricpolicy)
     *
     * @param metricPolicy
     */
    public fun metricPolicy(metricPolicy: CfnContainer.MetricPolicyProperty) {
        cdkBuilder.metricPolicy(metricPolicy)
    }

    /**
     * Creates an access policy for the specified container to restrict the users and clients that
     * can access it.
     *
     * For information about the data that is included in an access policy, see the
     * [AWS Identity and Access Management User Guide](https://docs.aws.amazon.com/iam/) .
     *
     * For this release of the REST API, you can create only one policy for a container. If you
     * enter `PutContainerPolicy` twice, the second command modifies the existing policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-policy)
     *
     * @param policy Creates an access policy for the specified container to restrict the users and
     *   clients that can access it.
     */
    public fun policy(policy: String) {
        cdkBuilder.policy(policy)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-tags)
     *
     * @param tags
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediastore-container.html#cfn-mediastore-container-tags)
     *
     * @param tags
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnContainer {
        if (_corsPolicy.isNotEmpty()) cdkBuilder.corsPolicy(_corsPolicy)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
