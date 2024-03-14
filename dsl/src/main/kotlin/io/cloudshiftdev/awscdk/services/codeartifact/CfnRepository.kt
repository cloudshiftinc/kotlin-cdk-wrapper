package io.cloudshiftdev.awscdk.services.codeartifact

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRepository internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codeartifact.CfnRepository,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * When you pass the logical ID of this resource, the function returns the Amazon Resource Name
   * (ARN) of the repository.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When you pass the logical ID of this resource, the function returns the domain name that
   * contains the repository.
   */
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  /**
   * When you pass the logical ID of this resource, the function returns the 12-digit account number
   * of the AWS account that owns the domain that contains the repository.
   */
  public open fun attrDomainOwner(): String = unwrap(this).getAttrDomainOwner()

  /**
   * When you pass the logical ID of this resource, the function returns the name of the repository.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * A text description of the repository.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A text description of the repository.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the domain that contains the repository.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The name of the domain that contains the repository.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The 12-digit account ID of the AWS account that owns the domain.
   */
  public open fun domainOwner(): String? = unwrap(this).getDomainOwner()

  /**
   * The 12-digit account ID of the AWS account that owns the domain.
   */
  public open fun domainOwner(`value`: String) {
    unwrap(this).setDomainOwner(`value`)
  }

  /**
   * An array of external connections associated with the repository.
   */
  public open fun externalConnections(): List<String> = unwrap(this).getExternalConnections() ?:
      emptyList()

  /**
   * An array of external connections associated with the repository.
   */
  public open fun externalConnections(`value`: List<String>) {
    unwrap(this).setExternalConnections(`value`)
  }

  /**
   * An array of external connections associated with the repository.
   */
  public open fun externalConnections(vararg `value`: String): Unit =
      externalConnections(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The document that defines the resource policy that is set on a repository.
   */
  public open fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

  /**
   * The document that defines the resource policy that is set on a repository.
   */
  public open fun permissionsPolicyDocument(`value`: Any) {
    unwrap(this).setPermissionsPolicyDocument(`value`)
  }

  /**
   * The name of an upstream repository.
   */
  public open fun repositoryName(): String = unwrap(this).getRepositoryName()

  /**
   * The name of an upstream repository.
   */
  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to be applied to the repository.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags to be applied to the repository.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags to be applied to the repository.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A list of upstream repositories to associate with the repository.
   */
  public open fun upstreams(): List<String> = unwrap(this).getUpstreams() ?: emptyList()

  /**
   * A list of upstream repositories to associate with the repository.
   */
  public open fun upstreams(`value`: List<String>) {
    unwrap(this).setUpstreams(`value`)
  }

  /**
   * A list of upstream repositories to associate with the repository.
   */
  public open fun upstreams(vararg `value`: String): Unit = upstreams(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codeartifact.CfnRepository].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A text description of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-description)
     * @param description A text description of the repository. 
     */
    public fun description(description: String)

    /**
     * The name of the domain that contains the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainname)
     * @param domainName The name of the domain that contains the repository. 
     */
    public fun domainName(domainName: String)

    /**
     * The 12-digit account ID of the AWS account that owns the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainowner)
     * @param domainOwner The 12-digit account ID of the AWS account that owns the domain. 
     */
    public fun domainOwner(domainOwner: String)

    /**
     * An array of external connections associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-externalconnections)
     * @param externalConnections An array of external connections associated with the repository. 
     */
    public fun externalConnections(externalConnections: List<String>)

    /**
     * An array of external connections associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-externalconnections)
     * @param externalConnections An array of external connections associated with the repository. 
     */
    public fun externalConnections(vararg externalConnections: String)

    /**
     * The document that defines the resource policy that is set on a repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-permissionspolicydocument)
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     * a repository. 
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any)

    /**
     * The name of an upstream repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-repositoryname)
     * @param repositoryName The name of an upstream repository. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * A list of tags to be applied to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-tags)
     * @param tags A list of tags to be applied to the repository. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to be applied to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-tags)
     * @param tags A list of tags to be applied to the repository. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A list of upstream repositories to associate with the repository.
     *
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-upstreams)
     * @param upstreams A list of upstream repositories to associate with the repository. 
     */
    public fun upstreams(upstreams: List<String>)

    /**
     * A list of upstream repositories to associate with the repository.
     *
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-upstreams)
     * @param upstreams A list of upstream repositories to associate with the repository. 
     */
    public fun upstreams(vararg upstreams: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeartifact.CfnRepository.Builder =
        software.amazon.awscdk.services.codeartifact.CfnRepository.Builder.create(scope, id)

    /**
     * A text description of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-description)
     * @param description A text description of the repository. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the domain that contains the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainname)
     * @param domainName The name of the domain that contains the repository. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The 12-digit account ID of the AWS account that owns the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainowner)
     * @param domainOwner The 12-digit account ID of the AWS account that owns the domain. 
     */
    override fun domainOwner(domainOwner: String) {
      cdkBuilder.domainOwner(domainOwner)
    }

    /**
     * An array of external connections associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-externalconnections)
     * @param externalConnections An array of external connections associated with the repository. 
     */
    override fun externalConnections(externalConnections: List<String>) {
      cdkBuilder.externalConnections(externalConnections)
    }

    /**
     * An array of external connections associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-externalconnections)
     * @param externalConnections An array of external connections associated with the repository. 
     */
    override fun externalConnections(vararg externalConnections: String): Unit =
        externalConnections(externalConnections.toList())

    /**
     * The document that defines the resource policy that is set on a repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-permissionspolicydocument)
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     * a repository. 
     */
    override fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
      cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    /**
     * The name of an upstream repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-repositoryname)
     * @param repositoryName The name of an upstream repository. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * A list of tags to be applied to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-tags)
     * @param tags A list of tags to be applied to the repository. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags to be applied to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-tags)
     * @param tags A list of tags to be applied to the repository. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A list of upstream repositories to associate with the repository.
     *
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-upstreams)
     * @param upstreams A list of upstream repositories to associate with the repository. 
     */
    override fun upstreams(upstreams: List<String>) {
      cdkBuilder.upstreams(upstreams)
    }

    /**
     * A list of upstream repositories to associate with the repository.
     *
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-upstreams)
     * @param upstreams A list of upstream repositories to associate with the repository. 
     */
    override fun upstreams(vararg upstreams: String): Unit = upstreams(upstreams.toList())

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnRepository =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codeartifact.CfnRepository.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnRepository):
        CfnRepository = CfnRepository(cdkObject)

    internal fun unwrap(wrapped: CfnRepository):
        software.amazon.awscdk.services.codeartifact.CfnRepository = wrapped.cdkObject
  }
}
