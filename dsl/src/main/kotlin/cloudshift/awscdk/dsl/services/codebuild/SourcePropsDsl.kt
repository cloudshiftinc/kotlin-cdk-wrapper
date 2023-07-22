@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.SourceProps

@CdkDslMarker
public class SourcePropsDsl {
  private val cdkBuilder: SourceProps.Builder = SourceProps.builder()

  /**
   * @param identifier The source identifier.
   * This property is required on secondary sources.
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun build(): SourceProps = cdkBuilder.build()
}
