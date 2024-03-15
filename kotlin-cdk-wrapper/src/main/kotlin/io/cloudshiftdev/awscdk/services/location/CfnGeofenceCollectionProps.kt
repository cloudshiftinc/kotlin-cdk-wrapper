@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGeofenceCollectionProps {
  public fun collectionName(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun collectionName(collectionName: String)

    public fun description(description: String)

    public fun kmsKeyId(kmsKeyId: String)

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String)

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.location.CfnGeofenceCollectionProps.Builder =
        software.amazon.awscdk.services.location.CfnGeofenceCollectionProps.builder()

    override fun collectionName(collectionName: String) {
      cdkBuilder.collectionName(collectionName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
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

    public fun build(): software.amazon.awscdk.services.location.CfnGeofenceCollectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnGeofenceCollectionProps,
  ) : CdkObject(cdkObject), CfnGeofenceCollectionProps {
    override fun collectionName(): String = unwrap(this).getCollectionName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    @Deprecated(message = "deprecated in CDK")
    override fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGeofenceCollectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnGeofenceCollectionProps):
        CfnGeofenceCollectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGeofenceCollectionProps):
        software.amazon.awscdk.services.location.CfnGeofenceCollectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnGeofenceCollectionProps
  }
}
