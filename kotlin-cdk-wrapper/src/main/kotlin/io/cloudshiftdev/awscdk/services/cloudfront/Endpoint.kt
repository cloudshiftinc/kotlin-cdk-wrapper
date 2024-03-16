@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kinesis.IStream

/**
 * Represents the endpoints available for targetting within a realtime log config resource.
 *
 * Example:
 *
 * ```
 * // Adding realtime logs config to a Cloudfront Distribution on default behavior.
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * Stream stream;
 * RealtimeLogConfig realTimeConfig = RealtimeLogConfig.Builder.create(this, "realtimeLog")
 * .endPoints(List.of(Endpoint.fromKinesisStream(stream)))
 * .fields(List.of("timestamp", "c-ip", "time-to-first-byte", "sc-status"))
 * .realtimeLogConfigName("my-delivery-stream")
 * .samplingRate(100)
 * .build();
 * Distribution.Builder.create(this, "myCdn")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new HttpOrigin("www.example.com"))
 * .realtimeLogConfig(realTimeConfig)
 * .build())
 * .build();
 * ```
 */
public abstract class Endpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.Endpoint,
) : CdkObject(cdkObject) {
  public companion object {
    public fun fromKinesisStream(stream: IStream): Endpoint =
        software.amazon.awscdk.services.cloudfront.Endpoint.fromKinesisStream(stream.let(IStream::unwrap)).let(Endpoint::wrap)

    public fun fromKinesisStream(stream: IStream, role: IRole): Endpoint =
        software.amazon.awscdk.services.cloudfront.Endpoint.fromKinesisStream(stream.let(IStream::unwrap),
        role.let(IRole::unwrap)).let(Endpoint::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.Endpoint): Endpoint =
        CdkObjectWrappers.wrap(cdkObject) as Endpoint

    internal fun unwrap(wrapped: Endpoint): software.amazon.awscdk.services.cloudfront.Endpoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.Endpoint
  }
}
