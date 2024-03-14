package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInputSecurityGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun whitelistRules(): Any? = unwrap(this).getWhitelistRules()

  public open fun whitelistRules(`value`: IResolvable) {
    unwrap(this).setWhitelistRules(`value`.let(IResolvable::unwrap))
  }

  public open fun whitelistRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setWhitelistRules(__idx_ac66f0)
  }

  public interface Builder {
    public fun tags(tags: Any) {
    }

    public fun whitelistRules(whitelistRules: IResolvable) {
    }

    public fun whitelistRules(whitelistRules: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.Builder
        = software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.Builder.create(scope, id)

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public override fun whitelistRules(whitelistRules: IResolvable) {
      cdkBuilder.whitelistRules(whitelistRules.let(IResolvable::unwrap))
    }

    public override fun whitelistRules(whitelistRules: List<Any>) {
      cdkBuilder.whitelistRules(whitelistRules)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnInputSecurityGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInputSecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInputSecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroup):
        CfnInputSecurityGroup = CfnInputSecurityGroup(cdkObject)

    internal fun unwrap(wrapped: CfnInputSecurityGroup):
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroup = wrapped.cdkObject
  }

  public interface InputWhitelistRuleCidrProperty {
    public fun cidr(): String? = unwrap(this).getCidr()

    public interface Builder {
      public fun cidr(cidr: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.builder()

      public override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty,
    ) : InputWhitelistRuleCidrProperty {
      public override fun cidr(): String? = unwrap(this).getCidr()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputWhitelistRuleCidrProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty):
          InputWhitelistRuleCidrProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputWhitelistRuleCidrProperty):
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
