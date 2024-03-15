@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEventDataStoreProps {
  public fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

  public fun billingMode(): String? = unwrap(this).getBillingMode()

  public fun federationEnabled(): Any? = unwrap(this).getFederationEnabled()

  public fun federationRoleArn(): String? = unwrap(this).getFederationRoleArn()

  public fun ingestionEnabled(): Any? = unwrap(this).getIngestionEnabled()

  public fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

  public fun insightsDestination(): String? = unwrap(this).getInsightsDestination()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun multiRegionEnabled(): Any? = unwrap(this).getMultiRegionEnabled()

  public fun name(): String? = unwrap(this).getName()

  public fun organizationEnabled(): Any? = unwrap(this).getOrganizationEnabled()

  public fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun terminationProtectionEnabled(): Any? = unwrap(this).getTerminationProtectionEnabled()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps.builder()

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

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps,
  ) : CdkObject(cdkObject), CfnEventDataStoreProps {
    override fun advancedEventSelectors(): Any? = unwrap(this).getAdvancedEventSelectors()

    override fun billingMode(): String? = unwrap(this).getBillingMode()

    override fun federationEnabled(): Any? = unwrap(this).getFederationEnabled()

    override fun federationRoleArn(): String? = unwrap(this).getFederationRoleArn()

    override fun ingestionEnabled(): Any? = unwrap(this).getIngestionEnabled()

    override fun insightSelectors(): Any? = unwrap(this).getInsightSelectors()

    override fun insightsDestination(): String? = unwrap(this).getInsightsDestination()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun multiRegionEnabled(): Any? = unwrap(this).getMultiRegionEnabled()

    override fun name(): String? = unwrap(this).getName()

    override fun organizationEnabled(): Any? = unwrap(this).getOrganizationEnabled()

    override fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun terminationProtectionEnabled(): Any? =
        unwrap(this).getTerminationProtectionEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventDataStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps):
        CfnEventDataStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventDataStoreProps):
        software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.CfnEventDataStoreProps
  }
}
