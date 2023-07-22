@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs.destinations

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps

@CdkDslMarker
public class KinesisDestinationPropsDsl {
  private val cdkBuilder: KinesisDestinationProps.Builder = KinesisDestinationProps.builder()

  /**
   * @param role The role to assume to write log events to the destination.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): KinesisDestinationProps = cdkBuilder.build()
}
