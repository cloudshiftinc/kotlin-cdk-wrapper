@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApiCache internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.CfnApiCache,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiCachingBehavior(): String = unwrap(this).getApiCachingBehavior()

  public open fun apiCachingBehavior(`value`: String) {
    unwrap(this).setApiCachingBehavior(`value`)
  }

  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

  public open fun atRestEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setAtRestEncryptionEnabled(`value`)
  }

  public open fun atRestEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setAtRestEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun healthMetricsConfig(): String? = unwrap(this).getHealthMetricsConfig()

  public open fun healthMetricsConfig(`value`: String) {
    unwrap(this).setHealthMetricsConfig(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  public open fun transitEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setTransitEncryptionEnabled(`value`)
  }

  public open fun transitEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setTransitEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun ttl(): Number = unwrap(this).getTtl()

  public open fun ttl(`value`: Number) {
    unwrap(this).setTtl(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiCache.Builder =
        software.amazon.awscdk.services.appsync.CfnApiCache.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiCache = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnApiCache.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiCache {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiCache(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiCache): CfnApiCache =
        CfnApiCache(cdkObject)

    internal fun unwrap(wrapped: CfnApiCache): software.amazon.awscdk.services.appsync.CfnApiCache =
        wrapped.cdkObject
  }
}
