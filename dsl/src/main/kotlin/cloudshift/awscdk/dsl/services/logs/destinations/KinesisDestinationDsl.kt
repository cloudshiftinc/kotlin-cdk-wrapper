@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs.destinations

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.logs.destinations.KinesisDestination

/**
 * Use a Kinesis stream as the destination for a log subscription.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.kinesis.*;
 * import software.amazon.awscdk.services.logs.destinations.*;
 * Role role;
 * Stream stream;
 * KinesisDestination kinesisDestination = KinesisDestination.Builder.create(stream)
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class KinesisDestinationDsl(
  stream: IStream,
) {
  private val cdkBuilder: KinesisDestination.Builder = KinesisDestination.Builder.create(stream)

  /**
   * The role to assume to write log events to the destination.
   *
   * Default: - A new Role is created
   *
   * @param role The role to assume to write log events to the destination. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): KinesisDestination = cdkBuilder.build()
}
