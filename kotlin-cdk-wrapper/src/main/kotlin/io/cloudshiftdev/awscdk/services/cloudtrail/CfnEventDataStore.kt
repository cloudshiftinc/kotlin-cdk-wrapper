@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEventDataStore internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

  public open fun advancedEventSelectors(`value`: IResolvable) {
    unwrap(this).setAdvancedEventSelectors(`value`.let(IResolvable::unwrap))
  }

  public open fun advancedEventSelectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdvancedEventSelectors(__idx_ac66f0)
  }

  public open fun advancedEventSelectors(vararg __idx_ac66f0: Any): Unit =
      advancedEventSelectors(__idx_ac66f0.toList())

  public open fun attrCreatedTimestamp(): String = unwrap(this).getAttrCreatedTimestamp()

  public open fun attrEventDataStoreArn(): String = unwrap(this).getAttrEventDataStoreArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrUpdatedTimestamp(): String = unwrap(this).getAttrUpdatedTimestamp()

  public open fun billingMode(): String? = unwrap(this).getBillingMode()

  public open fun billingMode(`value`: String) {
    unwrap(this).setBillingMode(`value`)
  }

  public open fun federationEnabled(): Any? = unwrap(this).getFederationEnabled()

  public open fun federationEnabled(`value`: Boolean) {
    unwrap(this).setFederationEnabled(`value`)
  }

  public open fun federationEnabled(`value`: IResolvable) {
    unwrap(this).setFederationEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun federationRoleArn(): String? = unwrap(this).getFederationRoleArn()

  public open fun federationRoleArn(`value`: String) {
    unwrap(this).setFederationRoleArn(`value`)
  }

  public open fun ingestionEnabled(): Any? = unwrap(this).getIngestionEnabled()

  public open fun ingestionEnabled(`value`: Boolean) {
    unwrap(this).setIngestionEnabled(`value`)
  }

  public open fun ingestionEnabled(`value`: IResolvable) {
    unwrap(this).setIngestionEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

  public open fun insightSelectors(`value`: IResolvable) {
    unwrap(this).setInsightSelectors(`value`.let(IResolvable::unwrap))
  }

  public open fun insightSelectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setInsightSelectors(__idx_ac66f0)
  }

  public open fun insightSelectors(vararg __idx_ac66f0: Any): Unit =
      insightSelectors(__idx_ac66f0.toList())

  public open fun insightsDestination(): String? = unwrap(this).getInsightsDestination()

  public open fun insightsDestination(`value`: String) {
    unwrap(this).setInsightsDestination(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun multiRegionEnabled(): Any? = unwrap(this).getMultiRegionEnabled()

  public open fun multiRegionEnabled(`value`: Boolean) {
    unwrap(this).setMultiRegionEnabled(`value`)
  }

  public open fun multiRegionEnabled(`value`: IResolvable) {
    unwrap(this).setMultiRegionEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun organizationEnabled(): Any? = unwrap(this).getOrganizationEnabled()

  public open fun organizationEnabled(`value`: Boolean) {
    unwrap(this).setOrganizationEnabled(`value`)
  }

  public open fun organizationEnabled(`value`: IResolvable) {
    unwrap(this).setOrganizationEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

  public open fun retentionPeriod(`value`: Number) {
    unwrap(this).setRetentionPeriod(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun terminationProtectionEnabled(): Any? =
      unwrap(this).getTerminationProtectionEnabled()

  public open fun terminationProtectionEnabled(`value`: Boolean) {
    unwrap(this).setTerminationProtectionEnabled(`value`)
  }

  public open fun terminationProtectionEnabled(`value`: IResolvable) {
    unwrap(this).setTerminationProtectionEnabled(`value`.let(IResolvable::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable)

    public fun advancedEventSelectors(advancedEventSelectors: List<Any>)

    public fun advancedEventSelectors(vararg advancedEventSelectors: Any)

    public fun billingMode(billingMode: String)

    public fun federationEnabled(federationEnabled: Boolean)

    public fun federationEnabled(federationEnabled: IResolvable)

    public fun federationRoleArn(federationRoleArn: String)

    public fun ingestionEnabled(ingestionEnabled: Boolean)

    public fun ingestionEnabled(ingestionEnabled: IResolvable)

    public fun insightSelectors(insightSelectors: IResolvable)

    public fun insightSelectors(insightSelectors: List<Any>)

    public fun insightSelectors(vararg insightSelectors: Any)

    public fun insightsDestination(insightsDestination: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun multiRegionEnabled(multiRegionEnabled: Boolean)

    public fun multiRegionEnabled(multiRegionEnabled: IResolvable)

    public fun name(name: String)

    public fun organizationEnabled(organizationEnabled: Boolean)

    public fun organizationEnabled(organizationEnabled: IResolvable)

    public fun retentionPeriod(retentionPeriod: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean)

    public fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.Builder.create(scope, id)

    override fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors.let(IResolvable::unwrap))
    }

    override fun advancedEventSelectors(advancedEventSelectors: List<Any>) {
      cdkBuilder.advancedEventSelectors(advancedEventSelectors)
    }

    override fun advancedEventSelectors(vararg advancedEventSelectors: Any): Unit =
        advancedEventSelectors(advancedEventSelectors.toList())

    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    override fun federationEnabled(federationEnabled: Boolean) {
      cdkBuilder.federationEnabled(federationEnabled)
    }

    override fun federationEnabled(federationEnabled: IResolvable) {
      cdkBuilder.federationEnabled(federationEnabled.let(IResolvable::unwrap))
    }

    override fun federationRoleArn(federationRoleArn: String) {
      cdkBuilder.federationRoleArn(federationRoleArn)
    }

    override fun ingestionEnabled(ingestionEnabled: Boolean) {
      cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    override fun ingestionEnabled(ingestionEnabled: IResolvable) {
      cdkBuilder.ingestionEnabled(ingestionEnabled.let(IResolvable::unwrap))
    }

    override fun insightSelectors(insightSelectors: IResolvable) {
      cdkBuilder.insightSelectors(insightSelectors.let(IResolvable::unwrap))
    }

    override fun insightSelectors(insightSelectors: List<Any>) {
      cdkBuilder.insightSelectors(insightSelectors)
    }

    override fun insightSelectors(vararg insightSelectors: Any): Unit =
        insightSelectors(insightSelectors.toList())

    override fun insightsDestination(insightsDestination: String) {
      cdkBuilder.insightsDestination(insightsDestination)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun multiRegionEnabled(multiRegionEnabled: Boolean) {
      cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    override fun multiRegionEnabled(multiRegionEnabled: IResolvable) {
      cdkBuilder.multiRegionEnabled(multiRegionEnabled.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun organizationEnabled(organizationEnabled: Boolean) {
      cdkBuilder.organizationEnabled(organizationEnabled)
    }

    override fun organizationEnabled(organizationEnabled: IResolvable) {
      cdkBuilder.organizationEnabled(organizationEnabled.let(IResolvable::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: Number) {
      cdkBuilder.retentionPeriod(retentionPeriod)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    override fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable) {
      cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnEventDataStore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventDataStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventDataStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore):
        CfnEventDataStore = CfnEventDataStore(cdkObject)

    internal fun unwrap(wrapped: CfnEventDataStore):
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStore = wrapped.cdkObject
  }

  public interface InsightSelectorProperty {
    public fun insightType(): String? = unwrap(this).getInsightType()

    @CdkDslMarker
    public interface Builder {
      public fun insightType(insightType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty.builder()

      override fun insightType(insightType: String) {
        cdkBuilder.insightType(insightType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty,
    ) : CdkObject(cdkObject), InsightSelectorProperty {
      override fun insightType(): String? = unwrap(this).getInsightType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InsightSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty):
          InsightSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InsightSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.InsightSelectorProperty
    }
  }

  public interface AdvancedFieldSelectorProperty {
    public fun endsWith(): List<String> = unwrap(this).getEndsWith() ?: emptyList()

    public fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

    public fun `field`(): String

    public fun notEndsWith(): List<String> = unwrap(this).getNotEndsWith() ?: emptyList()

    public fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

    public fun notStartsWith(): List<String> = unwrap(this).getNotStartsWith() ?: emptyList()

    public fun startsWith(): List<String> = unwrap(this).getStartsWith() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun endsWith(endsWith: List<String>)

      public fun endsWith(vararg endsWith: String)

      public fun equalTo(equalTo: List<String>)

      public fun equalTo(vararg equalTo: String)

      public fun `field`(`field`: String)

      public fun notEndsWith(notEndsWith: List<String>)

      public fun notEndsWith(vararg notEndsWith: String)

      public fun notEquals(notEquals: List<String>)

      public fun notEquals(vararg notEquals: String)

      public fun notStartsWith(notStartsWith: List<String>)

      public fun notStartsWith(vararg notStartsWith: String)

      public fun startsWith(startsWith: List<String>)

      public fun startsWith(vararg startsWith: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty.builder()

      override fun endsWith(endsWith: List<String>) {
        cdkBuilder.endsWith(endsWith)
      }

      override fun endsWith(vararg endsWith: String): Unit = endsWith(endsWith.toList())

      override fun equalTo(equalTo: List<String>) {
        cdkBuilder.equalTo(equalTo)
      }

      override fun equalTo(vararg equalTo: String): Unit = equalTo(equalTo.toList())

      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      override fun notEndsWith(notEndsWith: List<String>) {
        cdkBuilder.notEndsWith(notEndsWith)
      }

      override fun notEndsWith(vararg notEndsWith: String): Unit = notEndsWith(notEndsWith.toList())

      override fun notEquals(notEquals: List<String>) {
        cdkBuilder.notEquals(notEquals)
      }

      override fun notEquals(vararg notEquals: String): Unit = notEquals(notEquals.toList())

      override fun notStartsWith(notStartsWith: List<String>) {
        cdkBuilder.notStartsWith(notStartsWith)
      }

      override fun notStartsWith(vararg notStartsWith: String): Unit =
          notStartsWith(notStartsWith.toList())

      override fun startsWith(startsWith: List<String>) {
        cdkBuilder.startsWith(startsWith)
      }

      override fun startsWith(vararg startsWith: String): Unit = startsWith(startsWith.toList())

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty,
    ) : CdkObject(cdkObject), AdvancedFieldSelectorProperty {
      override fun endsWith(): List<String> = unwrap(this).getEndsWith() ?: emptyList()

      override fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

      override fun `field`(): String = unwrap(this).getField()

      override fun notEndsWith(): List<String> = unwrap(this).getNotEndsWith() ?: emptyList()

      override fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

      override fun notStartsWith(): List<String> = unwrap(this).getNotStartsWith() ?: emptyList()

      override fun startsWith(): List<String> = unwrap(this).getStartsWith() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedFieldSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty):
          AdvancedFieldSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedFieldSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedFieldSelectorProperty
    }
  }

  public interface AdvancedEventSelectorProperty {
    public fun fieldSelectors(): Any

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun fieldSelectors(fieldSelectors: IResolvable)

      public fun fieldSelectors(fieldSelectors: List<Any>)

      public fun fieldSelectors(vararg fieldSelectors: Any)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty.Builder
          =
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty.builder()

      override fun fieldSelectors(fieldSelectors: IResolvable) {
        cdkBuilder.fieldSelectors(fieldSelectors.let(IResolvable::unwrap))
      }

      override fun fieldSelectors(fieldSelectors: List<Any>) {
        cdkBuilder.fieldSelectors(fieldSelectors)
      }

      override fun fieldSelectors(vararg fieldSelectors: Any): Unit =
          fieldSelectors(fieldSelectors.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty,
    ) : CdkObject(cdkObject), AdvancedEventSelectorProperty {
      override fun fieldSelectors(): Any = unwrap(this).getFieldSelectors()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedEventSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty):
          AdvancedEventSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedEventSelectorProperty):
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnEventDataStore.AdvancedEventSelectorProperty
    }
  }
}
