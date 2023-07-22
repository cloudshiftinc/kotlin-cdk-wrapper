@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CfnRepositoryProps

@CdkDslMarker
public class CfnRepositoryPropsDsl {
  private val cdkBuilder: CfnRepositoryProps.Builder = CfnRepositoryProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _triggers: MutableList<Any> = mutableListOf()

  /**
   * @param code Information about code to be committed to a repository after it is created in an
   * AWS CloudFormation stack.
   * Information about code is only used in resource creation. Updates to a stack will not reflect
   * changes made to code properties after initial resource creation.
   *
   *
   * You can only use this property to add code when creating a repository with a AWS CloudFormation
   * template at creation time. This property cannot be used for updating code to an existing
   * repository.
   */
  public fun code(code: IResolvable) {
    cdkBuilder.code(code)
  }

  /**
   * @param code Information about code to be committed to a repository after it is created in an
   * AWS CloudFormation stack.
   * Information about code is only used in resource creation. Updates to a stack will not reflect
   * changes made to code properties after initial resource creation.
   *
   *
   * You can only use this property to add code when creating a repository with a AWS CloudFormation
   * template at creation time. This property cannot be used for updating code to an existing
   * repository.
   */
  public fun code(code: CfnRepository.CodeProperty) {
    cdkBuilder.code(code)
  }

  /**
   * @param repositoryDescription A comment or description about the new repository.
   *
   * The description field for a repository accepts all HTML characters and all valid Unicode
   * characters. Applications that do not HTML-encode the description and display it in a webpage can
   * expose users to potentially malicious code. Make sure that you HTML-encode the description field
   * in any application that uses this API to display the repository description on a webpage.
   */
  public fun repositoryDescription(repositoryDescription: String) {
    cdkBuilder.repositoryDescription(repositoryDescription)
  }

  /**
   * @param repositoryName The name of the new repository to be created. 
   *
   * The repository name must be unique across the calling AWS account . Repository names are
   * limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain
   * characters. For more information about the limits on repository names, see
   * [Quotas](https://docs.aws.amazon.com/codecommit/latest/userguide/limits.html) in the *AWS
   * CodeCommit User Guide* . The suffix .git is prohibited.
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  /**
   * @param tags One or more tag key-value pairs to use when tagging this repository.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags One or more tag key-value pairs to use when tagging this repository.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param triggers The JSON block of configuration information for each trigger.
   */
  public fun triggers(vararg triggers: Any) {
    _triggers.addAll(listOf(*triggers))
  }

  /**
   * @param triggers The JSON block of configuration information for each trigger.
   */
  public fun triggers(triggers: Collection<Any>) {
    _triggers.addAll(triggers)
  }

  /**
   * @param triggers The JSON block of configuration information for each trigger.
   */
  public fun triggers(triggers: IResolvable) {
    cdkBuilder.triggers(triggers)
  }

  public fun build(): CfnRepositoryProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_triggers.isNotEmpty()) cdkBuilder.triggers(_triggers)
    return cdkBuilder.build()
  }
}
