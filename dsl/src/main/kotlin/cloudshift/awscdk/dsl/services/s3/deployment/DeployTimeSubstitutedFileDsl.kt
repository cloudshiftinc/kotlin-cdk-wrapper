@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile
import software.constructs.Construct

@CdkDslMarker
public class DeployTimeSubstitutedFileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: DeployTimeSubstitutedFile.Builder =
      DeployTimeSubstitutedFile.Builder.create(scope, id)

  public fun destinationBucket(destinationBucket: IBucket) {
    cdkBuilder.destinationBucket(destinationBucket)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun substitutions(substitutions: Map<String, String>) {
    cdkBuilder.substitutions(substitutions)
  }

  public fun build(): DeployTimeSubstitutedFile = cdkBuilder.build()
}
