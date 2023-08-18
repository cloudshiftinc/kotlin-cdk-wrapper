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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps

/**
 * Properties for defining a `CfnPublicRepository`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * Object repositoryCatalogData;
 * Object repositoryPolicyText;
 * CfnPublicRepositoryProps cfnPublicRepositoryProps = CfnPublicRepositoryProps.builder()
 * .repositoryCatalogData(repositoryCatalogData)
 * .repositoryName("repositoryName")
 * .repositoryPolicyText(repositoryPolicyText)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html)
 */
@CdkDslMarker
public class CfnPublicRepositoryPropsDsl {
    private val cdkBuilder: CfnPublicRepositoryProps.Builder = CfnPublicRepositoryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param repositoryCatalogData The CatalogData property type specifies Catalog data for ECR
     *   Public Repository. For information about Catalog Data, see <link>
     */
    public fun repositoryCatalogData(repositoryCatalogData: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(repositoryCatalogData)
        cdkBuilder.repositoryCatalogData(builder.map)
    }

    /**
     * @param repositoryCatalogData The CatalogData property type specifies Catalog data for ECR
     *   Public Repository. For information about Catalog Data, see <link>
     */
    public fun repositoryCatalogData(repositoryCatalogData: Any) {
        cdkBuilder.repositoryCatalogData(repositoryCatalogData)
    }

    /**
     * @param repositoryName The name to use for the public repository. The repository name may be
     *   specified on its own (such as `nginx-web-app` ) or it can be prepended with a namespace to
     *   group the repository into a category (such as `project-a/nginx-web-app` ). If you don't
     *   specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the
     *   repository name. For more information, see
     *   [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     *   .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param repositoryPolicyText The JSON repository policy text to apply to the public
     *   repository. For more information, see
     *   [Amazon ECR Public repository policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     *   in the *Amazon ECR Public User Guide* .
     */
    public fun repositoryPolicyText(repositoryPolicyText: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(repositoryPolicyText)
        cdkBuilder.repositoryPolicyText(builder.map)
    }

    /**
     * @param repositoryPolicyText The JSON repository policy text to apply to the public
     *   repository. For more information, see
     *   [Amazon ECR Public repository policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     *   in the *Amazon ECR Public User Guide* .
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

    public fun build(): CfnPublicRepositoryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
