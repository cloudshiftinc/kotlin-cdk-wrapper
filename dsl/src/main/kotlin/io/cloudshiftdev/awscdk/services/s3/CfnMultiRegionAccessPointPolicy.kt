package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMultiRegionAccessPointPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrPolicyStatus(): IResolvable =
      unwrap(this).getAttrPolicyStatus().let(IResolvable::wrap)

  public open fun attrPolicyStatusIsPublic(): String = unwrap(this).getAttrPolicyStatusIsPublic()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mrapName(): String = unwrap(this).getMrapName()

  public open fun mrapName(`value`: String) {
    unwrap(this).setMrapName(`value`)
  }

  public open fun policy(): Any = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public interface Builder {
    public fun mrapName(mrapName: String)

    public fun policy(policy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.Builder =
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.Builder.create(scope, id)

    override fun mrapName(mrapName: String) {
      cdkBuilder.mrapName(mrapName)
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMultiRegionAccessPointPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMultiRegionAccessPointPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy):
        CfnMultiRegionAccessPointPolicy = CfnMultiRegionAccessPointPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnMultiRegionAccessPointPolicy):
        software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy = wrapped.cdkObject
  }

  public interface PolicyStatusProperty {
    public fun isPublic(): String

    public interface Builder {
      public fun isPublic(isPublic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.builder()

      override fun isPublic(isPublic: String) {
        cdkBuilder.isPublic(isPublic)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty,
    ) : PolicyStatusProperty {
      override fun isPublic(): String = unwrap(this).getIsPublic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty):
          PolicyStatusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyStatusProperty):
          software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy.PolicyStatusProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
