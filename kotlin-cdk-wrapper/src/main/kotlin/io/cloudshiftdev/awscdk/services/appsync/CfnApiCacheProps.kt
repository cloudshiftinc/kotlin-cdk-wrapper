@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnApiCacheProps {
  public fun apiCachingBehavior(): String

  public fun apiId(): String

  public fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

  public fun healthMetricsConfig(): String? = unwrap(this).getHealthMetricsConfig()

  public fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  public fun ttl(): Number

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiCachingBehavior(apiCachingBehavior: String)

    public fun apiId(apiId: String)

    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean)

    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable)

    public fun healthMetricsConfig(healthMetricsConfig: String)

    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    public fun ttl(ttl: Number)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiCacheProps.Builder =
        software.amazon.awscdk.services.appsync.CfnApiCacheProps.builder()

    override fun apiCachingBehavior(apiCachingBehavior: String) {
      cdkBuilder.apiCachingBehavior(apiCachingBehavior)
    }

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled.let(IResolvable::unwrap))
    }

    override fun healthMetricsConfig(healthMetricsConfig: String) {
      cdkBuilder.healthMetricsConfig(healthMetricsConfig)
    }

    override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable::unwrap))
    }

    override fun ttl(ttl: Number) {
      cdkBuilder.ttl(ttl)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiCacheProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnApiCacheProps,
  ) : CdkObject(cdkObject), CfnApiCacheProps {
    override fun apiCachingBehavior(): String = unwrap(this).getApiCachingBehavior()

    override fun apiId(): String = unwrap(this).getApiId()

    override fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

    override fun healthMetricsConfig(): String? = unwrap(this).getHealthMetricsConfig()

    override fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

    override fun ttl(): Number = unwrap(this).getTtl()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiCacheProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiCacheProps):
        CfnApiCacheProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiCacheProps):
        software.amazon.awscdk.services.appsync.CfnApiCacheProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.CfnApiCacheProps
  }
}
