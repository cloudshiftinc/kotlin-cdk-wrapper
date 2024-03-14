package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeploymentStrategy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun deploymentDurationInMinutes(): Number =
      unwrap(this).getDeploymentDurationInMinutes()

  public open fun deploymentDurationInMinutes(`value`: Number) {
    unwrap(this).setDeploymentDurationInMinutes(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

  public open fun finalBakeTimeInMinutes(`value`: Number) {
    unwrap(this).setFinalBakeTimeInMinutes(`value`)
  }

  public open fun growthFactor(): Number = unwrap(this).getGrowthFactor()

  public open fun growthFactor(`value`: Number) {
    unwrap(this).setGrowthFactor(`value`)
  }

  public open fun growthType(): String? = unwrap(this).getGrowthType()

  public open fun growthType(`value`: String) {
    unwrap(this).setGrowthType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun replicateTo(): String = unwrap(this).getReplicateTo()

  public open fun replicateTo(`value`: String) {
    unwrap(this).setReplicateTo(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number)

    public fun description(description: String)

    public fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number)

    public fun growthFactor(growthFactor: Number)

    public fun growthType(growthType: String)

    public fun name(name: String)

    public fun replicateTo(replicateTo: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy.Builder
        = software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy.Builder.create(scope, id)

    override fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number) {
      cdkBuilder.deploymentDurationInMinutes(deploymentDurationInMinutes)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number) {
      cdkBuilder.finalBakeTimeInMinutes(finalBakeTimeInMinutes)
    }

    override fun growthFactor(growthFactor: Number) {
      cdkBuilder.growthFactor(growthFactor)
    }

    override fun growthType(growthType: String) {
      cdkBuilder.growthType(growthType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun replicateTo(replicateTo: String) {
      cdkBuilder.replicateTo(replicateTo)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeploymentStrategy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeploymentStrategy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy):
        CfnDeploymentStrategy = CfnDeploymentStrategy(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentStrategy):
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy = wrapped.cdkObject
  }
}
