@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codegurureviewer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps

@CdkDslMarker
public class CfnRepositoryAssociationPropsDsl {
  private val cdkBuilder: CfnRepositoryAssociationProps.Builder =
      CfnRepositoryAssociationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param bucketName The name of the bucket.
   * This is required for your S3Bucket repository. The name must start with the prefix
   * `codeguru-reviewer-*` .
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param connectionArn The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
   * Its format is `arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id`
   * . For more information, see
   * [Connection](https://docs.aws.amazon.com/codestar-connections/latest/APIReference/API_Connection.html)
   * in the *AWS CodeStar Connections API Reference* .
   *
   * `ConnectionArn` must be specified for Bitbucket and GitHub Enterprise Server repositories. It
   * has no effect if it is specified for an AWS CodeCommit repository.
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  /**
   * @param name The name of the repository. 
   */
  public fun name(name: String) {
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
  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  /**
   * @param tags An array of key-value pairs used to tag an associated repository.
   * A tag is a custom attribute label with two parts:
   *
   * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag keys
   * are case sensitive.
   * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
   * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values
   * are case sensitive.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs used to tag an associated repository.
   * A tag is a custom attribute label with two parts:
   *
   * * A *tag key* (for example, `CostCenter` , `Environment` , `Project` , or `Secret` ). Tag keys
   * are case sensitive.
   * * An optional field known as a *tag value* (for example, `111122223333` , `Production` , or a
   * team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values
   * are case sensitive.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param type The type of repository that contains the source code to be reviewed. The valid
   * values are:. 
   * * `CodeCommit`
   * * `Bitbucket`
   * * `GitHubEnterpriseServer`
   * * `S3Bucket`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnRepositoryAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
