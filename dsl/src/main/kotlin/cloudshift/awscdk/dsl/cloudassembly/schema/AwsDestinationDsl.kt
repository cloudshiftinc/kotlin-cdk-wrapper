@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.AwsDestination

@CdkDslMarker
public class AwsDestinationDsl {
  private val cdkBuilder: AwsDestination.Builder = AwsDestination.builder()

  /**
   * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
   */
  public fun assumeRoleArn(assumeRoleArn: String) {
    cdkBuilder.assumeRoleArn(assumeRoleArn)
  }

  /**
   * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this role.
   */
  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  /**
   * @param region The region where this asset will need to be published.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): AwsDestination = cdkBuilder.build()
}
