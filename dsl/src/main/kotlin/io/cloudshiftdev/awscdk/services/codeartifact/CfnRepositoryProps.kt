package io.cloudshiftdev.awscdk.services.codeartifact

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRepositoryProps {
  /**
   * A text description of the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the domain that contains the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainname)
   */
  public fun domainName(): String

  /**
   * The 12-digit account ID of the AWS account that owns the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainowner)
   */
  public fun domainOwner(): String? = unwrap(this).getDomainOwner()

  /**
   * An array of external connections associated with the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-externalconnections)
   */
  public fun externalConnections(): List<String> = unwrap(this).getExternalConnections() ?:
      emptyList()

  /**
   * The document that defines the resource policy that is set on a repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-permissionspolicydocument)
   */
  public fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

  /**
   * The name of an upstream repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-repositoryname)
   */
  public fun repositoryName(): String

  /**
   * A list of tags to be applied to the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of upstream repositories to associate with the repository.
   *
   * The order of the upstream repositories in the list determines their priority order when AWS
   * CodeArtifact looks for a requested package version. For more information, see [Working with
   * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-upstreams)
   */
  public fun upstreams(): List<String> = unwrap(this).getUpstreams() ?: emptyList()

  /**
   * A builder for [CfnRepositoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A text description of the repository.
     */
    public fun description(description: String)

    /**
     * @param domainName The name of the domain that contains the repository. 
     */
    public fun domainName(domainName: String)

    /**
     * @param domainOwner The 12-digit account ID of the AWS account that owns the domain.
     */
    public fun domainOwner(domainOwner: String)

    /**
     * @param externalConnections An array of external connections associated with the repository.
     */
    public fun externalConnections(externalConnections: List<String>)

    /**
     * @param externalConnections An array of external connections associated with the repository.
     */
    public fun externalConnections(vararg externalConnections: String)

    /**
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     * a repository.
     */
    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any)

    /**
     * @param repositoryName The name of an upstream repository. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * @param tags A list of tags to be applied to the repository.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to be applied to the repository.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param upstreams A list of upstream repositories to associate with the repository.
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     */
    public fun upstreams(upstreams: List<String>)

    /**
     * @param upstreams A list of upstream repositories to associate with the repository.
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     */
    public fun upstreams(vararg upstreams: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeartifact.CfnRepositoryProps.Builder
        = software.amazon.awscdk.services.codeartifact.CfnRepositoryProps.builder()

    /**
     * @param description A text description of the repository.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainName The name of the domain that contains the repository. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainOwner The 12-digit account ID of the AWS account that owns the domain.
     */
    override fun domainOwner(domainOwner: String) {
      cdkBuilder.domainOwner(domainOwner)
    }

    /**
     * @param externalConnections An array of external connections associated with the repository.
     */
    override fun externalConnections(externalConnections: List<String>) {
      cdkBuilder.externalConnections(externalConnections)
    }

    /**
     * @param externalConnections An array of external connections associated with the repository.
     */
    override fun externalConnections(vararg externalConnections: String): Unit =
        externalConnections(externalConnections.toList())

    /**
     * @param permissionsPolicyDocument The document that defines the resource policy that is set on
     * a repository.
     */
    override fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
      cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    /**
     * @param repositoryName The name of an upstream repository. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param tags A list of tags to be applied to the repository.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags to be applied to the repository.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param upstreams A list of upstream repositories to associate with the repository.
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     */
    override fun upstreams(upstreams: List<String>) {
      cdkBuilder.upstreams(upstreams)
    }

    /**
     * @param upstreams A list of upstream repositories to associate with the repository.
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     */
    override fun upstreams(vararg upstreams: String): Unit = upstreams(upstreams.toList())

    public fun build(): software.amazon.awscdk.services.codeartifact.CfnRepositoryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codeartifact.CfnRepositoryProps,
  ) : CdkObject(cdkObject), CfnRepositoryProps {
    /**
     * A text description of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the domain that contains the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The 12-digit account ID of the AWS account that owns the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-domainowner)
     */
    override fun domainOwner(): String? = unwrap(this).getDomainOwner()

    /**
     * An array of external connections associated with the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-externalconnections)
     */
    override fun externalConnections(): List<String> = unwrap(this).getExternalConnections() ?:
        emptyList()

    /**
     * The document that defines the resource policy that is set on a repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-permissionspolicydocument)
     */
    override fun permissionsPolicyDocument(): Any? = unwrap(this).getPermissionsPolicyDocument()

    /**
     * The name of an upstream repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-repositoryname)
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    /**
     * A list of tags to be applied to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of upstream repositories to associate with the repository.
     *
     * The order of the upstream repositories in the list determines their priority order when AWS
     * CodeArtifact looks for a requested package version. For more information, see [Working with
     * upstream repositories](https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeartifact-repository.html#cfn-codeartifact-repository-upstreams)
     */
    override fun upstreams(): List<String> = unwrap(this).getUpstreams() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeartifact.CfnRepositoryProps):
        CfnRepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryProps):
        software.amazon.awscdk.services.codeartifact.CfnRepositoryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeartifact.CfnRepositoryProps
  }
}
