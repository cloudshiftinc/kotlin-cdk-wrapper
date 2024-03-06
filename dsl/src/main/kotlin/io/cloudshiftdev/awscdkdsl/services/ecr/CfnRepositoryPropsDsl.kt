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

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnRepository
import software.amazon.awscdk.services.ecr.CfnRepositoryProps

/**
 * Properties for defining a `CfnRepository`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * Object repositoryPolicyText;
 * CfnRepositoryProps cfnRepositoryProps = CfnRepositoryProps.builder()
 * .emptyOnDelete(false)
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionType("encryptionType")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
 * .scanOnPush(false)
 * .build())
 * .imageTagMutability("imageTagMutability")
 * .lifecyclePolicy(LifecyclePolicyProperty.builder()
 * .lifecyclePolicyText("lifecyclePolicyText")
 * .registryId("registryId")
 * .build())
 * .repositoryName("repositoryName")
 * .repositoryPolicyText(repositoryPolicyText)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html)
 */
@CdkDslMarker
public class CfnRepositoryPropsDsl {
    private val cdkBuilder: CfnRepositoryProps.Builder = CfnRepositoryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     *   repository. If false, the repository must be empty before attempting to delete it.
     */
    public fun emptyOnDelete(emptyOnDelete: Boolean) {
        cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    /**
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     *   repository. If false, the repository must be empty before attempting to delete it.
     */
    public fun emptyOnDelete(emptyOnDelete: IResolvable) {
        cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the repository. This
     *   determines how the contents of your repository are encrypted at rest.
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the repository. This
     *   determines how the contents of your repository are encrypted at rest.
     */
    public fun encryptionConfiguration(
        encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty
    ) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param imageScanningConfiguration The image scanning configuration for the repository. This
     *   determines whether images are scanned for known vulnerabilities after being pushed to the
     *   repository.
     */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    /**
     * @param imageScanningConfiguration The image scanning configuration for the repository. This
     *   determines whether images are scanned for known vulnerabilities after being pushed to the
     *   repository.
     */
    public fun imageScanningConfiguration(
        imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty
    ) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    /**
     * @param imageTagMutability The tag mutability setting for the repository. If this parameter is
     *   omitted, the default setting of `MUTABLE` will be used which will allow image tags to be
     *   overwritten. If `IMMUTABLE` is specified, all image tags within the repository will be
     *   immutable which will prevent them from being overwritten.
     */
    public fun imageTagMutability(imageTagMutability: String) {
        cdkBuilder.imageTagMutability(imageTagMutability)
    }

    /**
     * @param lifecyclePolicy Creates or updates a lifecycle policy. For information about lifecycle
     *   policy syntax, see
     *   [Lifecycle policy template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html)
     *   .
     */
    public fun lifecyclePolicy(lifecyclePolicy: IResolvable) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * @param lifecyclePolicy Creates or updates a lifecycle policy. For information about lifecycle
     *   policy syntax, see
     *   [Lifecycle policy template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html)
     *   .
     */
    public fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * @param repositoryName The name to use for the repository. The repository name may be
     *   specified on its own (such as `nginx-web-app` ) or it can be prepended with a namespace to
     *   group the repository into a category (such as `project-a/nginx-web-app` ). If you don't
     *   specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the
     *   repository name. For more information, see
     *   [Name type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     *   .
     *
     * The repository name must start with a letter and can only contain lowercase letters, numbers,
     * hyphens, underscores, and forward slashes.
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param repositoryPolicyText The JSON repository policy text to apply to the repository. For
     *   more information, see
     *   [Amazon ECR repository policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
     *   in the *Amazon Elastic Container Registry User Guide* .
     */
    public fun repositoryPolicyText(repositoryPolicyText: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(repositoryPolicyText)
        cdkBuilder.repositoryPolicyText(builder.map)
    }

    /**
     * @param repositoryPolicyText The JSON repository policy text to apply to the repository. For
     *   more information, see
     *   [Amazon ECR repository policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
     *   in the *Amazon Elastic Container Registry User Guide* .
     */
    public fun repositoryPolicyText(repositoryPolicyText: Any) {
        cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRepositoryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
