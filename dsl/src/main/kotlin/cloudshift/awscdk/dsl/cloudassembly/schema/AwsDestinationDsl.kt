@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.AwsDestination

@CdkDslMarker
public class AwsDestinationDsl {
  private val cdkBuilder: AwsDestination.Builder = AwsDestination.builder()

  public fun assumeRoleArn(assumeRoleArn: String) {
    cdkBuilder.assumeRoleArn(assumeRoleArn)
  }

  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): AwsDestination = cdkBuilder.build()
}
