@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUsagePlan internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun apiStages(): Any? = unwrap(this).getApiStages()

  public open fun apiStages(`value`: IResolvable) {
    unwrap(this).setApiStages(`value`.let(IResolvable::unwrap))
  }

  public open fun apiStages(__idx_ac66f0: List<Any>) {
    unwrap(this).setApiStages(__idx_ac66f0)
  }

  public open fun apiStages(vararg __idx_ac66f0: Any): Unit = apiStages(__idx_ac66f0.toList())

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun quota(): Any? = unwrap(this).getQuota()

  public open fun quota(`value`: IResolvable) {
    unwrap(this).setQuota(`value`.let(IResolvable::unwrap))
  }

  public open fun quota(`value`: QuotaSettingsProperty) {
    unwrap(this).setQuota(`value`.let(QuotaSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("513d79bf55b0fc7e5fb826298997daf8a100ce76df384d6dccc51c8f4eb8ef1c")
  public open fun quota(`value`: QuotaSettingsProperty.Builder.() -> Unit): Unit =
      quota(QuotaSettingsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun throttle(): Any? = unwrap(this).getThrottle()

  public open fun throttle(`value`: IResolvable) {
    unwrap(this).setThrottle(`value`.let(IResolvable::unwrap))
  }

  public open fun throttle(`value`: ThrottleSettingsProperty) {
    unwrap(this).setThrottle(`value`.let(ThrottleSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9aa0bbb41cec396f73144459cccf376bbbf026fcd61769dfe3241000d44b5798")
  public open fun throttle(`value`: ThrottleSettingsProperty.Builder.() -> Unit): Unit =
      throttle(ThrottleSettingsProperty(`value`))

  public open fun usagePlanName(): String? = unwrap(this).getUsagePlanName()

  public open fun usagePlanName(`value`: String) {
    unwrap(this).setUsagePlanName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun apiStages(apiStages: IResolvable)

    public fun apiStages(apiStages: List<Any>)

    public fun apiStages(vararg apiStages: Any)

    public fun description(description: String)

    public fun quota(quota: IResolvable)

    public fun quota(quota: QuotaSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0183b02f64044bdf04ca00b27cc24e485809a67d79639146ce7dcb23f42d1edc")
    public fun quota(quota: QuotaSettingsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun throttle(throttle: IResolvable)

    public fun throttle(throttle: ThrottleSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee354e813e0a512cded8fda38274ee50c28a68c3b2cdc4b5daff523545d7b71d")
    public fun throttle(throttle: ThrottleSettingsProperty.Builder.() -> Unit)

    public fun usagePlanName(usagePlanName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnUsagePlan.Builder =
        software.amazon.awscdk.services.apigateway.CfnUsagePlan.Builder.create(scope, id)

    override fun apiStages(apiStages: IResolvable) {
      cdkBuilder.apiStages(apiStages.let(IResolvable::unwrap))
    }

    override fun apiStages(apiStages: List<Any>) {
      cdkBuilder.apiStages(apiStages)
    }

    override fun apiStages(vararg apiStages: Any): Unit = apiStages(apiStages.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun quota(quota: IResolvable) {
      cdkBuilder.quota(quota.let(IResolvable::unwrap))
    }

    override fun quota(quota: QuotaSettingsProperty) {
      cdkBuilder.quota(quota.let(QuotaSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0183b02f64044bdf04ca00b27cc24e485809a67d79639146ce7dcb23f42d1edc")
    override fun quota(quota: QuotaSettingsProperty.Builder.() -> Unit): Unit =
        quota(QuotaSettingsProperty(quota))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun throttle(throttle: IResolvable) {
      cdkBuilder.throttle(throttle.let(IResolvable::unwrap))
    }

    override fun throttle(throttle: ThrottleSettingsProperty) {
      cdkBuilder.throttle(throttle.let(ThrottleSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee354e813e0a512cded8fda38274ee50c28a68c3b2cdc4b5daff523545d7b71d")
    override fun throttle(throttle: ThrottleSettingsProperty.Builder.() -> Unit): Unit =
        throttle(ThrottleSettingsProperty(throttle))

    override fun usagePlanName(usagePlanName: String) {
      cdkBuilder.usagePlanName(usagePlanName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlan = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnUsagePlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUsagePlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUsagePlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan):
        CfnUsagePlan = CfnUsagePlan(cdkObject)

    internal fun unwrap(wrapped: CfnUsagePlan):
        software.amazon.awscdk.services.apigateway.CfnUsagePlan = wrapped.cdkObject
  }

  public interface ThrottleSettingsProperty {
    public fun burstLimit(): Number? = unwrap(this).getBurstLimit()

    public fun rateLimit(): Number? = unwrap(this).getRateLimit()

    @CdkDslMarker
    public interface Builder {
      public fun burstLimit(burstLimit: Number)

      public fun rateLimit(rateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty.builder()

      override fun burstLimit(burstLimit: Number) {
        cdkBuilder.burstLimit(burstLimit)
      }

      override fun rateLimit(rateLimit: Number) {
        cdkBuilder.rateLimit(rateLimit)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty,
    ) : CdkObject(cdkObject), ThrottleSettingsProperty {
      override fun burstLimit(): Number? = unwrap(this).getBurstLimit()

      override fun rateLimit(): Number? = unwrap(this).getRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThrottleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty):
          ThrottleSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThrottleSettingsProperty):
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty
    }
  }

  public interface QuotaSettingsProperty {
    public fun limit(): Number? = unwrap(this).getLimit()

    public fun offset(): Number? = unwrap(this).getOffset()

    public fun period(): String? = unwrap(this).getPeriod()

    @CdkDslMarker
    public interface Builder {
      public fun limit(limit: Number)

      public fun offset(offset: Number)

      public fun period(period: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty.builder()

      override fun limit(limit: Number) {
        cdkBuilder.limit(limit)
      }

      override fun offset(offset: Number) {
        cdkBuilder.offset(offset)
      }

      override fun period(period: String) {
        cdkBuilder.period(period)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty,
    ) : CdkObject(cdkObject), QuotaSettingsProperty {
      override fun limit(): Number? = unwrap(this).getLimit()

      override fun offset(): Number? = unwrap(this).getOffset()

      override fun period(): String? = unwrap(this).getPeriod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QuotaSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty):
          QuotaSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuotaSettingsProperty):
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty
    }
  }

  public interface ApiStageProperty {
    public fun apiId(): String? = unwrap(this).getApiId()

    public fun stage(): String? = unwrap(this).getStage()

    public fun throttle(): Any? = unwrap(this).getThrottle()

    @CdkDslMarker
    public interface Builder {
      public fun apiId(apiId: String)

      public fun stage(stage: String)

      public fun throttle(throttle: IResolvable)

      public fun throttle(throttle: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty.builder()

      override fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
      }

      override fun stage(stage: String) {
        cdkBuilder.stage(stage)
      }

      override fun throttle(throttle: IResolvable) {
        cdkBuilder.throttle(throttle.let(IResolvable::unwrap))
      }

      override fun throttle(throttle: Map<String, Any>) {
        cdkBuilder.throttle(throttle)
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty,
    ) : CdkObject(cdkObject), ApiStageProperty {
      override fun apiId(): String? = unwrap(this).getApiId()

      override fun stage(): String? = unwrap(this).getStage()

      override fun throttle(): Any? = unwrap(this).getThrottle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiStageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty):
          ApiStageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiStageProperty):
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnUsagePlan.ApiStageProperty
    }
  }
}
