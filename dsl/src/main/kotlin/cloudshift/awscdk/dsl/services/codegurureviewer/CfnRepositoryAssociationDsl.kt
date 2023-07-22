@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codegurureviewer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnRepositoryAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRepositoryAssociation.Builder =
      CfnRepositoryAssociation.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the bucket.
   *
   * This is required for your S3Bucket repository. The name must start with the prefix
   * `codeguru-reviewer-*` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-bucketname)
   * @param bucketName The name of the bucket. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

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
   * @param connectionArn The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. 
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * The name of the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codegurureviewer-repositoryassociation.html#cfn-codegurureviewer-repositoryassociation-name)
   * @param name The name of the repository. 
   */
  public fun name(name: String) {
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
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

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
   * @param tags An array of key-value pairs used to tag an associated repository. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

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
   * @param tags An array of key-value pairs used to tag an associated repository. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

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
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnRepositoryAssociation {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
