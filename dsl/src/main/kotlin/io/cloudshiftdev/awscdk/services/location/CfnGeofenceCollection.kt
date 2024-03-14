package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGeofenceCollection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.location.CfnGeofenceCollection,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCollectionArn(): String = unwrap(this).getAttrCollectionArn()

  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun collectionName(): String = unwrap(this).getCollectionName()

  public open fun collectionName(`value`: String) {
    unwrap(this).setCollectionName(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlan(`value`: String) {
    unwrap(this).setPricingPlan(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlanDataSource(): String? = unwrap(this).getPricingPlanDataSource()

  @Deprecated(message = "deprecated in CDK")
  public open fun pricingPlanDataSource(`value`: String) {
    unwrap(this).setPricingPlanDataSource(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun collectionName(collectionName: String) {
    }

    public fun description(description: String) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnGeofenceCollection.Builder =
        software.amazon.awscdk.services.location.CfnGeofenceCollection.Builder.create(scope, id)

    public override fun collectionName(collectionName: String) {
      cdkBuilder.collectionName(collectionName)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun pricingPlanDataSource(pricingPlanDataSource: String) {
      cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.location.CfnGeofenceCollection =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGeofenceCollection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGeofenceCollection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnGeofenceCollection):
        CfnGeofenceCollection = CfnGeofenceCollection(cdkObject)

    internal fun unwrap(wrapped: CfnGeofenceCollection):
        software.amazon.awscdk.services.location.CfnGeofenceCollection = wrapped.cdkObject
  }
}
