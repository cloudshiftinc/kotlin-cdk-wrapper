@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codecommit.Code
import software.amazon.awscdk.services.codecommit.Repository
import software.constructs.Construct

@CdkDslMarker
public class RepositoryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Repository.Builder = Repository.Builder.create(scope, id)

  /**
   * The contents with which to initialize the repository after it has been created.
   *
   * Default: - No initialization (create empty repo)
   *
   * @param code The contents with which to initialize the repository after it has been created. 
   */
  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  /**
   * A description of the repository.
   *
   * Use the description to identify the
   * purpose of the repository.
   *
   * Default: - No description.
   *
   * @param description A description of the repository. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Name of the repository.
   *
   * This property is required for all CodeCommit repositories.
   *
   * @param repositoryName Name of the repository. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): Repository = cdkBuilder.build()
}
