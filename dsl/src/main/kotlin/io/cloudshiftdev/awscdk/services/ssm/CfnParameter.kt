package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnParameter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnParameter,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  public open fun allowedPattern(`value`: String) {
    unwrap(this).setAllowedPattern(`value`)
  }

  public open fun attrType(): String = unwrap(this).getAttrType()

  public open fun attrValue(): String = unwrap(this).getAttrValue()

  public open fun dataType(): String? = unwrap(this).getDataType()

  public open fun dataType(`value`: String) {
    unwrap(this).setDataType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun policies(): String? = unwrap(this).getPolicies()

  public open fun policies(`value`: String) {
    unwrap(this).setPolicies(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun tier(): String? = unwrap(this).getTier()

  public open fun tier(`value`: String) {
    unwrap(this).setTier(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun `value`(): String = unwrap(this).getValue()

  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  public interface Builder {
    public fun allowedPattern(allowedPattern: String) {
    }

    public fun dataType(dataType: String) {
    }

    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun policies(policies: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun tier(tier: String) {
    }

    public fun type(type: String) {
    }

    public fun `value`(`value`: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnParameter.Builder =
        software.amazon.awscdk.services.ssm.CfnParameter.Builder.create(scope, id)

    public override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    public override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnParameter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnParameter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnParameter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnParameter): CfnParameter =
        CfnParameter(cdkObject)

    internal fun unwrap(wrapped: CfnParameter): software.amazon.awscdk.services.ssm.CfnParameter =
        wrapped.cdkObject
  }
}
