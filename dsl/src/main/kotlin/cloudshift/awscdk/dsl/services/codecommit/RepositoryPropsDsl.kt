@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codecommit.Code
import software.amazon.awscdk.services.codecommit.RepositoryProps

@CdkDslMarker
public class RepositoryPropsDsl {
  private val cdkBuilder: RepositoryProps.Builder = RepositoryProps.builder()

  /**
   * @param code The contents with which to initialize the repository after it has been created.
   */
  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  /**
   * @param description A description of the repository.
   * Use the description to identify the
   * purpose of the repository.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param repositoryName Name of the repository. 
   * This property is required for all CodeCommit repositories.
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): RepositoryProps = cdkBuilder.build()
}
