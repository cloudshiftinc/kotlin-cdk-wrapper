package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDevicePool internal constructor(
  private val cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePool,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxDevices(): Number? = unwrap(this).getMaxDevices()

  public open fun maxDevices(`value`: Number) {
    unwrap(this).setMaxDevices(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun projectArn(): String = unwrap(this).getProjectArn()

  public open fun projectArn(`value`: String) {
    unwrap(this).setProjectArn(`value`)
  }

  public open fun rules(): Any = unwrap(this).getRules()

  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable::unwrap))
  }

  public open fun rules(__idx_ac66f0: List<Any>) {
    unwrap(this).setRules(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun maxDevices(maxDevices: Number)

    public fun name(name: String)

    public fun projectArn(projectArn: String)

    public fun rules(rules: IResolvable)

    public fun rules(rules: List<Any>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnDevicePool.Builder =
        software.amazon.awscdk.services.devicefarm.CfnDevicePool.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun maxDevices(maxDevices: Number) {
      cdkBuilder.maxDevices(maxDevices)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun projectArn(projectArn: String) {
      cdkBuilder.projectArn(projectArn)
    }

    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnDevicePool =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDevicePool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDevicePool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePool):
        CfnDevicePool = CfnDevicePool(cdkObject)

    internal fun unwrap(wrapped: CfnDevicePool):
        software.amazon.awscdk.services.devicefarm.CfnDevicePool = wrapped.cdkObject
  }

  public interface RuleProperty {
    public fun attribute(): String? = unwrap(this).getAttribute()

    public fun `operator`(): String? = unwrap(this).getOperator()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun attribute(attribute: String)

      public fun `operator`(`operator`: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty.Builder =
          software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty.builder()

      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty,
    ) : RuleProperty {
      override fun attribute(): String? = unwrap(this).getAttribute()

      override fun `operator`(): String? = unwrap(this).getOperator()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.devicefarm.CfnDevicePool.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
