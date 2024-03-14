package io.cloudshiftdev.awscdk.services.resiliencehub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResiliencyPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrPolicyArn(): String = unwrap(this).getAttrPolicyArn()

  public open fun dataLocationConstraint(): String? = unwrap(this).getDataLocationConstraint()

  public open fun dataLocationConstraint(`value`: String) {
    unwrap(this).setDataLocationConstraint(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policy(): Any = unwrap(this).getPolicy()

  public open fun policy(`value`: IResolvable) {
    unwrap(this).setPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun policy(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setPolicy(__item_ac66f0)
  }

  public open fun policyDescription(): String? = unwrap(this).getPolicyDescription()

  public open fun policyDescription(`value`: String) {
    unwrap(this).setPolicyDescription(`value`)
  }

  public open fun policyName(): String = unwrap(this).getPolicyName()

  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun tier(): String = unwrap(this).getTier()

  public open fun tier(`value`: String) {
    unwrap(this).setTier(`value`)
  }

  public interface Builder {
    public fun dataLocationConstraint(dataLocationConstraint: String)

    public fun policy(policy: IResolvable)

    public fun policy(policy: Map<String, Any>)

    public fun policyDescription(policyDescription: String)

    public fun policyName(policyName: String)

    public fun tags(tags: Map<String, String>)

    public fun tier(tier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.Builder =
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.Builder.create(scope, id)

    override fun dataLocationConstraint(dataLocationConstraint: String) {
      cdkBuilder.dataLocationConstraint(dataLocationConstraint)
    }

    override fun policy(policy: IResolvable) {
      cdkBuilder.policy(policy.let(IResolvable::unwrap))
    }

    override fun policy(policy: Map<String, Any>) {
      cdkBuilder.policy(policy)
    }

    override fun policyDescription(policyDescription: String) {
      cdkBuilder.policyDescription(policyDescription)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    public fun build(): software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResiliencyPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResiliencyPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy):
        CfnResiliencyPolicy = CfnResiliencyPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResiliencyPolicy):
        software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy = wrapped.cdkObject
  }

  public interface FailurePolicyProperty {
    public fun rpoInSecs(): Number

    public fun rtoInSecs(): Number

    public interface Builder {
      public fun rpoInSecs(rpoInSecs: Number)

      public fun rtoInSecs(rtoInSecs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty.Builder
          =
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty.builder()

      override fun rpoInSecs(rpoInSecs: Number) {
        cdkBuilder.rpoInSecs(rpoInSecs)
      }

      override fun rtoInSecs(rtoInSecs: Number) {
        cdkBuilder.rtoInSecs(rtoInSecs)
      }

      public fun build():
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty,
    ) : FailurePolicyProperty {
      override fun rpoInSecs(): Number = unwrap(this).getRpoInSecs()

      override fun rtoInSecs(): Number = unwrap(this).getRtoInSecs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FailurePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty):
          FailurePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailurePolicyProperty):
          software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy.FailurePolicyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
