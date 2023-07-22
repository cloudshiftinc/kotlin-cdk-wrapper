@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectBatchRestrictionsPropertyDsl {
  private val cdkBuilder: CfnProject.BatchRestrictionsProperty.Builder =
      CfnProject.BatchRestrictionsProperty.builder()

  private val _computeTypesAllowed: MutableList<String> = mutableListOf()

  /**
   * @param computeTypesAllowed An array of strings that specify the compute types that are allowed
   * for the batch build.
   * See [Build environment compute
   * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in
   * the *AWS CodeBuild User Guide* for these values.
   */
  public fun computeTypesAllowed(vararg computeTypesAllowed: String) {
    _computeTypesAllowed.addAll(listOf(*computeTypesAllowed))
  }

  /**
   * @param computeTypesAllowed An array of strings that specify the compute types that are allowed
   * for the batch build.
   * See [Build environment compute
   * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in
   * the *AWS CodeBuild User Guide* for these values.
   */
  public fun computeTypesAllowed(computeTypesAllowed: Collection<String>) {
    _computeTypesAllowed.addAll(computeTypesAllowed)
  }

  /**
   * @param maximumBuildsAllowed Specifies the maximum number of builds allowed.
   */
  public fun maximumBuildsAllowed(maximumBuildsAllowed: Number) {
    cdkBuilder.maximumBuildsAllowed(maximumBuildsAllowed)
  }

  public fun build(): CfnProject.BatchRestrictionsProperty {
    if(_computeTypesAllowed.isNotEmpty()) cdkBuilder.computeTypesAllowed(_computeTypesAllowed)
    return cdkBuilder.build()
  }
}
