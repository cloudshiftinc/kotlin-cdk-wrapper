@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrackerProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun eventBridgeEnabled(): Any? = unwrap(this).getEventBridgeEnabled()

  public fun kmsKeyEnableGeospatialQueries(): Any? = unwrap(this).getKmsKeyEnableGeospatialQueries()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun positionFiltering(): String? = unwrap(this).getPositionFiltering()

  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trackerName(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

    public fun eventBridgeEnabled(eventBridgeEnabled: IResolvable)

    public fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: Boolean)

    public fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: IResolvable)

    public fun kmsKeyId(kmsKeyId: String)

    public fun positionFiltering(positionFiltering: String)

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String)

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trackerName(trackerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnTrackerProps.Builder =
        software.amazon.awscdk.services.location.CfnTrackerProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    override fun eventBridgeEnabled(eventBridgeEnabled: IResolvable) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled.let(IResolvable::unwrap))
    }

    override fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: Boolean) {
      cdkBuilder.kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries)
    }

    override fun kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries: IResolvable) {
      cdkBuilder.kmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries.let(IResolvable::unwrap))
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun positionFiltering(positionFiltering: String) {
      cdkBuilder.positionFiltering(positionFiltering)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlanDataSource(pricingPlanDataSource: String) {
      cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trackerName(trackerName: String) {
      cdkBuilder.trackerName(trackerName)
    }

    public fun build(): software.amazon.awscdk.services.location.CfnTrackerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnTrackerProps,
  ) : CdkObject(cdkObject), CfnTrackerProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun eventBridgeEnabled(): Any? = unwrap(this).getEventBridgeEnabled()

    override fun kmsKeyEnableGeospatialQueries(): Any? =
        unwrap(this).getKmsKeyEnableGeospatialQueries()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun positionFiltering(): String? = unwrap(this).getPositionFiltering()

    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trackerName(): String = unwrap(this).getTrackerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrackerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnTrackerProps):
        CfnTrackerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrackerProps):
        software.amazon.awscdk.services.location.CfnTrackerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.location.CfnTrackerProps
  }
}
