@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPublicRepository`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
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
public interface CfnPublicRepositoryProps {
  /**
   * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
   *
   * For more information, see [Amazon ECR Public repository catalog
   * data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html) in
   * the *Amazon ECR Public User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorycatalogdata)
   */
  public fun repositoryCatalogData(): Any? = unwrap(this).getRepositoryCatalogData()

  /**
   * The name to use for the public repository.
   *
   * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
   * prepended with a namespace to group the repository into a category (such as
   * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
   * physical ID and uses that ID for the repository name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositoryname)
   */
  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

  /**
   * The JSON repository policy text to apply to the public repository.
   *
   * For more information, see [Amazon ECR Public repository
   * policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html) in
   * the *Amazon ECR Public User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorypolicytext)
   */
  public fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPublicRepositoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param repositoryCatalogData The details about the repository that are publicly visible in
     * the Amazon ECR Public Gallery.
     * For more information, see [Amazon ECR Public repository catalog
     * data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html)
     * in the *Amazon ECR Public User Guide* .
     */
    public fun repositoryCatalogData(repositoryCatalogData: Any)

    /**
     * @param repositoryName The name to use for the public repository.
     * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
     * prepended with a namespace to group the repository into a category (such as
     * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the repository name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun repositoryName(repositoryName: String)

    /**
     * @param repositoryPolicyText The JSON repository policy text to apply to the public
     * repository.
     * For more information, see [Amazon ECR Public repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     * in the *Amazon ECR Public User Guide* .
     */
    public fun repositoryPolicyText(repositoryPolicyText: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps.Builder =
        software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps.builder()

    /**
     * @param repositoryCatalogData The details about the repository that are publicly visible in
     * the Amazon ECR Public Gallery.
     * For more information, see [Amazon ECR Public repository catalog
     * data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html)
     * in the *Amazon ECR Public User Guide* .
     */
    override fun repositoryCatalogData(repositoryCatalogData: Any) {
      cdkBuilder.repositoryCatalogData(repositoryCatalogData)
    }

    /**
     * @param repositoryName The name to use for the public repository.
     * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
     * prepended with a namespace to group the repository into a category (such as
     * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the repository name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param repositoryPolicyText The JSON repository policy text to apply to the public
     * repository.
     * For more information, see [Amazon ECR Public repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     * in the *Amazon ECR Public User Guide* .
     */
    override fun repositoryPolicyText(repositoryPolicyText: Any) {
      cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps,
  ) : CdkObject(cdkObject), CfnPublicRepositoryProps {
    /**
     * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
     *
     * For more information, see [Amazon ECR Public repository catalog
     * data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html)
     * in the *Amazon ECR Public User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorycatalogdata)
     */
    override fun repositoryCatalogData(): Any? = unwrap(this).getRepositoryCatalogData()

    /**
     * The name to use for the public repository.
     *
     * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
     * prepended with a namespace to group the repository into a category (such as
     * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the repository name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositoryname)
     */
    override fun repositoryName(): String? = unwrap(this).getRepositoryName()

    /**
     * The JSON repository policy text to apply to the public repository.
     *
     * For more information, see [Amazon ECR Public repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     * in the *Amazon ECR Public User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorypolicytext)
     */
    override fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps):
        CfnPublicRepositoryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPublicRepositoryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublicRepositoryProps):
        software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps
  }
}
