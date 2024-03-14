package io.cloudshiftdev.awscdk.services.codegurureviewer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRepositoryAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the
   * [`RepositoryAssociation`](https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html)
   * object. You can retrieve this ARN by calling `ListRepositories` .
   */
  public open fun attrAssociationArn(): String = unwrap(this).getAttrAssociationArn()

  /**
   * The name of the bucket.
   */
  public open fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * The name of the bucket.
   */
  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
   */
  public open fun connectionArn(): String? = unwrap(this).getConnectionArn()

  /**
   * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
   */
  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the repository.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the repository.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The owner of the repository.
   */
  public open fun owner(): String? = unwrap(this).getOwner()

  /**
   * The owner of the repository.
   */
  public open fun owner(`value`: String) {
    unwrap(this).setOwner(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs used to tag an associated repository.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs used to tag an associated repository.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs used to tag an associated repository.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of repository that contains the source code to be reviewed.
   *
   * The valid values are:.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of repository that contains the source code to be reviewed.
   *
   * The valid values are:.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codegurureviewer.CfnRepositoryAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the bucket.
     *
     * This is required for your S3Bucket repository. The name must start with the prefix
     * `codeguru-reviewer-*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-bucketname)
     * @param bucketName The name of the bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     *
     * Its format is
     * `arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id` . For more
     * information, see
     * [Connection](https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html)
     * in the *AWS CodeStar Connections API Reference* .
     *
     * `ConnectionArn` must be specified for Bitbucket and GitHub Enterprise Server repositories. It
     * has no effect if it is specified for an AWS CodeCommit repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-connectionarn)
     * @param connectionArn The Amazon Resource Name (ARN) of an AWS CodeStar Connections
     * connection. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * The name of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-name)
     * @param name The name of the repository. 
     */
    public fun name(name: String)

    /**
     * The owner of the repository.
     *
     * For a GitHub Enterprise Server or Bitbucket repository, this is the username for the account
     * that owns the repository.
     *
     * `Owner` must be specified for Bitbucket and GitHub Enterprise Server repositories. It has no
     * effect if it is specified for an AWS CodeCommit repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-owner)
     * @param owner The owner of the repository. 
     */
    public fun owner(owner: String)

    /**
     * An array of key-value pairs used to tag an associated repository.
     *
     * A tag is a custom attribute label with two parts:
     *
     * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * keys are case sensitive.
     * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
     * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag
     * values are case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-tags)
     * @param tags An array of key-value pairs used to tag an associated repository. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs used to tag an associated repository.
     *
     * A tag is a custom attribute label with two parts:
     *
     * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * keys are case sensitive.
     * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
     * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag
     * values are case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-tags)
     * @param tags An array of key-value pairs used to tag an associated repository. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of repository that contains the source code to be reviewed. The valid values are:.
     *
     * * `CodeCommit`
     * * `Bitbucket`
     * * `GitHubEnterpriseServer`
     * * `S3Bucket`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-type)
     * @param type The type of repository that contains the source code to be reviewed. The valid
     * values are:. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation.Builder =
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation.Builder.create(scope,
        id)

    /**
     * The name of the bucket.
     *
     * This is required for your S3Bucket repository. The name must start with the prefix
     * `codeguru-reviewer-*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-bucketname)
     * @param bucketName The name of the bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     *
     * Its format is
     * `arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id` . For more
     * information, see
     * [Connection](https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html)
     * in the *AWS CodeStar Connections API Reference* .
     *
     * `ConnectionArn` must be specified for Bitbucket and GitHub Enterprise Server repositories. It
     * has no effect if it is specified for an AWS CodeCommit repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-connectionarn)
     * @param connectionArn The Amazon Resource Name (ARN) of an AWS CodeStar Connections
     * connection. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * The name of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-name)
     * @param name The name of the repository. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The owner of the repository.
     *
     * For a GitHub Enterprise Server or Bitbucket repository, this is the username for the account
     * that owns the repository.
     *
     * `Owner` must be specified for Bitbucket and GitHub Enterprise Server repositories. It has no
     * effect if it is specified for an AWS CodeCommit repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-owner)
     * @param owner The owner of the repository. 
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * An array of key-value pairs used to tag an associated repository.
     *
     * A tag is a custom attribute label with two parts:
     *
     * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * keys are case sensitive.
     * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
     * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag
     * values are case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-tags)
     * @param tags An array of key-value pairs used to tag an associated repository. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs used to tag an associated repository.
     *
     * A tag is a custom attribute label with two parts:
     *
     * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * keys are case sensitive.
     * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
     * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag
     * values are case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-tags)
     * @param tags An array of key-value pairs used to tag an associated repository. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of repository that contains the source code to be reviewed. The valid values are:.
     *
     * * `CodeCommit`
     * * `Bitbucket`
     * * `GitHubEnterpriseServer`
     * * `S3Bucket`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-type)
     * @param type The type of repository that contains the source code to be reviewed. The valid
     * values are:. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepositoryAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepositoryAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation):
        CfnRepositoryAssociation = CfnRepositoryAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryAssociation):
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation =
        wrapped.cdkObject
  }
}
