@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBase
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.apigateway.RestApiBase as CloudshiftdevAwscdkServicesApigatewayRestApiBase
import software.amazon.awscdk.services.apigateway.RestApiBase as AmazonAwscdkServicesApigatewayRestApiBase

public open class RestApiOrigin internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin,
) : OriginBase(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun connectionAttempts(connectionAttempts: Number)

    public fun connectionTimeout(connectionTimeout: Duration)

    public fun customHeaders(customHeaders: Map<String, String>)

    public fun keepaliveTimeout(keepaliveTimeout: Duration)

    public fun originId(originId: String)

    public fun originPath(originPath: String)

    public fun originShieldEnabled(originShieldEnabled: Boolean)

    public fun originShieldRegion(originShieldRegion: String)

    public fun readTimeout(readTimeout: Duration)
  }

  private class BuilderImpl(
    restApi: AmazonAwscdkServicesApigatewayRestApiBase,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin.Builder
        = software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin.Builder.create(restApi)

    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
    }

    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    override fun keepaliveTimeout(keepaliveTimeout: Duration) {
      cdkBuilder.keepaliveTimeout(keepaliveTimeout.let(Duration::unwrap))
    }

    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    override fun originShieldEnabled(originShieldEnabled: Boolean) {
      cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    override fun readTimeout(readTimeout: Duration) {
      cdkBuilder.readTimeout(readTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(restApi: CloudshiftdevAwscdkServicesApigatewayRestApiBase,
        block: Builder.() -> Unit = {}): RestApiOrigin {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesApigatewayRestApiBase.unwrap(restApi))
      return RestApiOrigin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin):
        RestApiOrigin = RestApiOrigin(cdkObject)

    internal fun unwrap(wrapped: RestApiOrigin):
        software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin = wrapped.cdkObject
  }
}
