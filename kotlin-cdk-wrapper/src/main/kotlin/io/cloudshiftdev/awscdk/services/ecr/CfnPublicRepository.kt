@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ECR::PublicRepository` resource specifies an Amazon Elastic Container Registry Public
 * (Amazon ECR Public) repository, where users can push and pull Docker images, Open Container
 * Initiative (OCI) images, and OCI compatible artifacts.
 *
 * For more information, see [Amazon ECR public
 * repositories](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repositories.html) in the
 * *Amazon ECR Public User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
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
public open class CfnPublicRepository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepository,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name (ARN) for the specified `AWS::ECR::PublicRepository` resource.
   *
   * For example, `arn:aws:ecr-public:: *123456789012* :repository/ *test-repository*` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
   */
  public open fun repositoryCatalogData(): Any? = unwrap(this).getRepositoryCatalogData()

  /**
   * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
   */
  public open fun repositoryCatalogData(`value`: Any) {
    unwrap(this).setRepositoryCatalogData(`value`)
  }

  /**
   * The name to use for the public repository.
   */
  public open fun repositoryName(): String? = unwrap(this).getRepositoryName()

  /**
   * The name to use for the public repository.
   */
  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  /**
   * The JSON repository policy text to apply to the public repository.
   */
  public open fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

  /**
   * The JSON repository policy text to apply to the public repository.
   */
  public open fun repositoryPolicyText(`value`: Any) {
    unwrap(this).setRepositoryPolicyText(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnPublicRepository].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
     *
     * For more information, see [Amazon ECR Public repository catalog
     * data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html)
     * in the *Amazon ECR Public User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorycatalogdata)
     * @param repositoryCatalogData The details about the repository that are publicly visible in
     * the Amazon ECR Public Gallery. 
     */
    public fun repositoryCatalogData(repositoryCatalogData: Any)

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
     * @param repositoryName The name to use for the public repository. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * The JSON repository policy text to apply to the public repository.
     *
     * For more information, see [Amazon ECR Public repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     * in the *Amazon ECR Public User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorypolicytext)
     * @param repositoryPolicyText The JSON repository policy text to apply to the public
     * repository. 
     */
    public fun repositoryPolicyText(repositoryPolicyText: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnPublicRepository.Builder =
        software.amazon.awscdk.services.ecr.CfnPublicRepository.Builder.create(scope, id)

    /**
     * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
     *
     * For more information, see [Amazon ECR Public repository catalog
     * data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html)
     * in the *Amazon ECR Public User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorycatalogdata)
     * @param repositoryCatalogData The details about the repository that are publicly visible in
     * the Amazon ECR Public Gallery. 
     */
    override fun repositoryCatalogData(repositoryCatalogData: Any) {
      cdkBuilder.repositoryCatalogData(repositoryCatalogData)
    }

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
     * @param repositoryName The name to use for the public repository. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * The JSON repository policy text to apply to the public repository.
     *
     * For more information, see [Amazon ECR Public repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-policies.html)
     * in the *Amazon ECR Public User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-repositorypolicytext)
     * @param repositoryPolicyText The JSON repository policy text to apply to the public
     * repository. 
     */
    override fun repositoryPolicyText(repositoryPolicyText: Any) {
      cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html#cfn-ecr-publicrepository-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnPublicRepository = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecr.CfnPublicRepository.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublicRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublicRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepository):
        CfnPublicRepository = CfnPublicRepository(cdkObject)

    internal fun unwrap(wrapped: CfnPublicRepository):
        software.amazon.awscdk.services.ecr.CfnPublicRepository = wrapped.cdkObject
  }

  /**
   * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
   *
   * For more information, see [Amazon ECR Public repository catalog
   * data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html) in
   * the *Amazon ECR Public User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * RepositoryCatalogDataProperty repositoryCatalogDataProperty =
   * RepositoryCatalogDataProperty.builder()
   * .aboutText("aboutText")
   * .architectures(List.of("architectures"))
   * .operatingSystems(List.of("operatingSystems"))
   * .repositoryDescription("repositoryDescription")
   * .usageText("usageText")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html)
   */
  public interface RepositoryCatalogDataProperty {
    /**
     * The longform description of the contents of the repository.
     *
     * This text appears in the repository details on the Amazon ECR Public Gallery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-abouttext)
     */
    public fun aboutText(): String? = unwrap(this).getAboutText()

    /**
     * The architecture tags that are associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-architectures)
     */
    public fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

    /**
     * The operating system tags that are associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-operatingsystems)
     */
    public fun operatingSystems(): List<String> = unwrap(this).getOperatingSystems() ?: emptyList()

    /**
     * The short description of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-repositorydescription)
     */
    public fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

    /**
     * The longform usage details of the contents of the repository.
     *
     * The usage text provides context for users of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-usagetext)
     */
    public fun usageText(): String? = unwrap(this).getUsageText()

    /**
     * A builder for [RepositoryCatalogDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aboutText The longform description of the contents of the repository.
       * This text appears in the repository details on the Amazon ECR Public Gallery.
       */
      public fun aboutText(aboutText: String)

      /**
       * @param architectures The architecture tags that are associated with the repository.
       */
      public fun architectures(architectures: List<String>)

      /**
       * @param architectures The architecture tags that are associated with the repository.
       */
      public fun architectures(vararg architectures: String)

      /**
       * @param operatingSystems The operating system tags that are associated with the repository.
       */
      public fun operatingSystems(operatingSystems: List<String>)

      /**
       * @param operatingSystems The operating system tags that are associated with the repository.
       */
      public fun operatingSystems(vararg operatingSystems: String)

      /**
       * @param repositoryDescription The short description of the repository.
       */
      public fun repositoryDescription(repositoryDescription: String)

      /**
       * @param usageText The longform usage details of the contents of the repository.
       * The usage text provides context for users of the repository.
       */
      public fun usageText(usageText: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty.builder()

      /**
       * @param aboutText The longform description of the contents of the repository.
       * This text appears in the repository details on the Amazon ECR Public Gallery.
       */
      override fun aboutText(aboutText: String) {
        cdkBuilder.aboutText(aboutText)
      }

      /**
       * @param architectures The architecture tags that are associated with the repository.
       */
      override fun architectures(architectures: List<String>) {
        cdkBuilder.architectures(architectures)
      }

      /**
       * @param architectures The architecture tags that are associated with the repository.
       */
      override fun architectures(vararg architectures: String): Unit =
          architectures(architectures.toList())

      /**
       * @param operatingSystems The operating system tags that are associated with the repository.
       */
      override fun operatingSystems(operatingSystems: List<String>) {
        cdkBuilder.operatingSystems(operatingSystems)
      }

      /**
       * @param operatingSystems The operating system tags that are associated with the repository.
       */
      override fun operatingSystems(vararg operatingSystems: String): Unit =
          operatingSystems(operatingSystems.toList())

      /**
       * @param repositoryDescription The short description of the repository.
       */
      override fun repositoryDescription(repositoryDescription: String) {
        cdkBuilder.repositoryDescription(repositoryDescription)
      }

      /**
       * @param usageText The longform usage details of the contents of the repository.
       * The usage text provides context for users of the repository.
       */
      override fun usageText(usageText: String) {
        cdkBuilder.usageText(usageText)
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty,
    ) : CdkObject(cdkObject), RepositoryCatalogDataProperty {
      /**
       * The longform description of the contents of the repository.
       *
       * This text appears in the repository details on the Amazon ECR Public Gallery.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-abouttext)
       */
      override fun aboutText(): String? = unwrap(this).getAboutText()

      /**
       * The architecture tags that are associated with the repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-architectures)
       */
      override fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

      /**
       * The operating system tags that are associated with the repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-operatingsystems)
       */
      override fun operatingSystems(): List<String> = unwrap(this).getOperatingSystems() ?:
          emptyList()

      /**
       * The short description of the repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-repositorydescription)
       */
      override fun repositoryDescription(): String? = unwrap(this).getRepositoryDescription()

      /**
       * The longform usage details of the contents of the repository.
       *
       * The usage text provides context for users of the repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html#cfn-ecr-publicrepository-repositorycatalogdata-usagetext)
       */
      override fun usageText(): String? = unwrap(this).getUsageText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryCatalogDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty):
          RepositoryCatalogDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryCatalogDataProperty):
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnPublicRepository.RepositoryCatalogDataProperty
    }
  }
}
