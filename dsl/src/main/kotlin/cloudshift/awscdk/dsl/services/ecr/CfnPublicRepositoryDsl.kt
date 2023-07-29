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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ecr.CfnPublicRepository
import software.constructs.Construct

/**
 * The `AWS::ECR::PublicRepository` resource specifies an Amazon Elastic Container Registry Public
 * (Amazon ECR Public) repository, where users can push and pull Docker images, Open Container
 * Initiative (OCI) images, and OCI compatible artifacts.
 *
 * For more information, see
 * [Amazon ECR public repositories](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repositories.html)
 * in the *Amazon ECR Public User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * Object repositoryCatalogData;
 * Object repositoryPolicyText;
 * CfnPublicRepository cfnPublicRepository = CfnPublicRepository.Builder.create(this,
 * "MyCfnPublicRepository")
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
public class CfnPublicRepositoryDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPublicRepository.Builder =
        CfnPublicRepository.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The CatalogData property type specifies Catalog data for ECR Public Repository.
     *
     * For information about Catalog Data, see <link>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorycatalogdata)
     *
     * @param repositoryCatalogData The CatalogData property type specifies Catalog data for ECR
     *   Public Repository.
     */
    public fun repositoryCatalogData(repositoryCatalogData: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(repositoryCatalogData)
        cdkBuilder.repositoryCatalogData(builder.map)
    }

    /**
     * The CatalogData property type specifies Catalog data for ECR Public Repository.
     *
     * For information about Catalog Data, see <link>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorycatalogdata)
     *
     * @param repositoryCatalogData The CatalogData property type specifies Catalog data for ECR
     *   Public Repository.
     */
    public fun repositoryCatalogData(repositoryCatalogData: Any) {
        cdkBuilder.repositoryCatalogData(repositoryCatalogData)
    }

    /**
     * The name to use for the public repository.
     *
     * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
     * prepended with a namespace to group the repository into a category (such as
     * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a
     * unique physical ID and uses that ID for the repository name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositoryname)
     *
     * @param repositoryName The name to use for the public repository.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * The JSON repository policy text to apply to the public repository.
     *
     * For more information, see
     * [Amazon ECR Public repository policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     * in the *Amazon ECR Public User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorypolicytext)
     *
     * @param repositoryPolicyText The JSON repository policy text to apply to the public
     *   repository.
     */
    public fun repositoryPolicyText(repositoryPolicyText: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(repositoryPolicyText)
        cdkBuilder.repositoryPolicyText(builder.map)
    }

    /**
     * The JSON repository policy text to apply to the public repository.
     *
     * For more information, see
     * [Amazon ECR Public repository policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     * in the *Amazon ECR Public User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorypolicytext)
     *
     * @param repositoryPolicyText The JSON repository policy text to apply to the public
     *   repository.
     */
    public fun repositoryPolicyText(repositoryPolicyText: Any) {
        cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPublicRepository {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
