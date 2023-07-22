@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.RepositoryAttributes

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * RepositoryAttributes repositoryAttributes = RepositoryAttributes.builder()
 * .repositoryArn("repositoryArn")
 * .repositoryName("repositoryName")
 * .build();
 * ```
 */
@CdkDslMarker
public class RepositoryAttributesDsl {
  private val cdkBuilder: RepositoryAttributes.Builder = RepositoryAttributes.builder()

  /**
   * @param repositoryArn the value to be set. 
   */
  public fun repositoryArn(repositoryArn: String) {
    cdkBuilder.repositoryArn(repositoryArn)
  }

  /**
   * @param repositoryName the value to be set. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): RepositoryAttributes = cdkBuilder.build()
}
