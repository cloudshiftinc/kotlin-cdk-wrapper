@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata

@CdkDslMarker
public class UserDefinedObjectMetadataDsl {
  private val cdkBuilder: UserDefinedObjectMetadata.Builder = UserDefinedObjectMetadata.builder()

  public fun build(): UserDefinedObjectMetadata = cdkBuilder.build()
}
