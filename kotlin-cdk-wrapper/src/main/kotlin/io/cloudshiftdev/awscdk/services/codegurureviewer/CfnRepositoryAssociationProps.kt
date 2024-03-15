@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codegurureviewer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRepositoryAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codegurureviewer.*;
 * CfnRepositoryAssociationProps cfnRepositoryAssociationProps =
 * CfnRepositoryAssociationProps.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .bucketName("bucketName")
 * .connectionArn("connectionArn")
 * .owner("owner")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html)
 */
public interface CfnRepositoryAssociationProps {
  /**
   * The name of the bucket.
   *
   * This is required for your S3Bucket repository. The name must start with the prefix
   * `codeguru-reviewer-*` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-bucketname)
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
   *
   * Its format is `arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id`
   * . For more information, see
   * [Connection](https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html)
   * in the *AWS CodeStar Connections API Reference* .
   *
   * `ConnectionArn` must be specified for Bitbucket and GitHub Enterprise Server repositories. It
   * has no effect if it is specified for an AWS CodeCommit repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-connectionarn)
   */
  public fun connectionArn(): String? = unwrap(this).getConnectionArn()

  /**
   * The name of the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-name)
   */
  public fun name(): String

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
   */
  public fun owner(): String? = unwrap(this).getOwner()

  /**
   * An array of key-value pairs used to tag an associated repository.
   *
   * A tag is a custom attribute label with two parts:
   *
   * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag keys
   * are case sensitive.
   * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
   * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values
   * are case sensitive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of repository that contains the source code to be reviewed. The valid values are:.
   *
   * * `CodeCommit`
   * * `Bitbucket`
   * * `GitHubEnterpriseServer`
   * * `S3Bucket`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnRepositoryAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketName The name of the bucket.
     * This is required for your S3Bucket repository. The name must start with the prefix
     * `codeguru-reviewer-*` .
     */
    public fun bucketName(bucketName: String)

    /**
     * @param connectionArn The Amazon Resource Name (ARN) of an AWS CodeStar Connections
     * connection.
     * Its format is
     * `arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id` . For more
     * information, see
     * [Connection](https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html)
     * in the *AWS CodeStar Connections API Reference* .
     *
     * `ConnectionArn` must be specified for Bitbucket and GitHub Enterprise Server repositories. It
     * has no effect if it is specified for an AWS CodeCommit repository.
     */
    public fun connectionArn(connectionArn: String)

    /**
     * @param name The name of the repository. 
     */
    public fun name(name: String)

    /**
     * @param owner The owner of the repository.
     * For a GitHub Enterprise Server or Bitbucket repository, this is the username for the account
     * that owns the repository.
     *
     * `Owner` must be specified for Bitbucket and GitHub Enterprise Server repositories. It has no
     * effect if it is specified for an AWS CodeCommit repository.
     */
    public fun owner(owner: String)

    /**
     * @param tags An array of key-value pairs used to tag an associated repository.
     * A tag is a custom attribute label with two parts:
     *
     * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * keys are case sensitive.
     * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
     * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag
     * values are case sensitive.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs used to tag an associated repository.
     * A tag is a custom attribute label with two parts:
     *
     * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * keys are case sensitive.
     * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
     * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag
     * values are case sensitive.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of repository that contains the source code to be reviewed. The valid
     * values are:. 
     * * `CodeCommit`
     * * `Bitbucket`
     * * `GitHubEnterpriseServer`
     * * `S3Bucket`
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps.Builder =
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps.builder()

    /**
     * @param bucketName The name of the bucket.
     * This is required for your S3Bucket repository. The name must start with the prefix
     * `codeguru-reviewer-*` .
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param connectionArn The Amazon Resource Name (ARN) of an AWS CodeStar Connections
     * connection.
     * Its format is
     * `arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id` . For more
     * information, see
     * [Connection](https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html)
     * in the *AWS CodeStar Connections API Reference* .
     *
     * `ConnectionArn` must be specified for Bitbucket and GitHub Enterprise Server repositories. It
     * has no effect if it is specified for an AWS CodeCommit repository.
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param name The name of the repository. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param owner The owner of the repository.
     * For a GitHub Enterprise Server or Bitbucket repository, this is the username for the account
     * that owns the repository.
     *
     * `Owner` must be specified for Bitbucket and GitHub Enterprise Server repositories. It has no
     * effect if it is specified for an AWS CodeCommit repository.
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    /**
     * @param tags An array of key-value pairs used to tag an associated repository.
     * A tag is a custom attribute label with two parts:
     *
     * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * keys are case sensitive.
     * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
     * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag
     * values are case sensitive.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs used to tag an associated repository.
     * A tag is a custom attribute label with two parts:
     *
     * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag
     * keys are case sensitive.
     * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
     * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag
     * values are case sensitive.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of repository that contains the source code to be reviewed. The valid
     * values are:. 
     * * `CodeCommit`
     * * `Bitbucket`
     * * `GitHubEnterpriseServer`
     * * `S3Bucket`
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build():
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps,
  ) : CdkObject(cdkObject), CfnRepositoryAssociationProps {
    /**
     * The name of the bucket.
     *
     * This is required for your S3Bucket repository. The name must start with the prefix
     * `codeguru-reviewer-*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-bucketname)
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

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
     */
    override fun connectionArn(): String? = unwrap(this).getConnectionArn()

    /**
     * The name of the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun owner(): String? = unwrap(this).getOwner()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of repository that contains the source code to be reviewed. The valid values are:.
     *
     * * `CodeCommit`
     * * `Bitbucket`
     * * `GitHubEnterpriseServer`
     * * `S3Bucket`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps):
        CfnRepositoryAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryAssociationProps):
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps
  }
}
