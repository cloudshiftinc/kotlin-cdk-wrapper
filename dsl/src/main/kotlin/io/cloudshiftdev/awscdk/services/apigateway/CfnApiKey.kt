package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApiKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKey,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrApiKeyId(): String = unwrap(this).getAttrApiKeyId()

  public open fun customerId(): String? = unwrap(this).getCustomerId()

  public open fun customerId(`value`: String) {
    unwrap(this).setCustomerId(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun generateDistinctId(): Any? = unwrap(this).getGenerateDistinctId()

  public open fun generateDistinctId(`value`: Boolean) {
    unwrap(this).setGenerateDistinctId(`value`)
  }

  public open fun generateDistinctId(`value`: IResolvable) {
    unwrap(this).setGenerateDistinctId(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun stageKeys(): Any? = unwrap(this).getStageKeys()

  public open fun stageKeys(`value`: IResolvable) {
    unwrap(this).setStageKeys(`value`.let(IResolvable::unwrap))
  }

  public open fun stageKeys(__idx_ac66f0: List<Any>) {
    unwrap(this).setStageKeys(__idx_ac66f0)
  }

  public open fun stageKeys(vararg __idx_ac66f0: Any): Unit = stageKeys(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun `value`(): String? = unwrap(this).getValue()

  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  public interface Builder {
    public fun customerId(customerId: String)

    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun generateDistinctId(generateDistinctId: Boolean)

    public fun generateDistinctId(generateDistinctId: IResolvable)

    public fun name(name: String)

    public fun stageKeys(stageKeys: IResolvable)

    public fun stageKeys(stageKeys: List<Any>)

    public fun stageKeys(vararg stageKeys: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnApiKey.Builder =
        software.amazon.awscdk.services.apigateway.CfnApiKey.Builder.create(scope, id)

    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    override fun generateDistinctId(generateDistinctId: IResolvable) {
      cdkBuilder.generateDistinctId(generateDistinctId.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun stageKeys(stageKeys: IResolvable) {
      cdkBuilder.stageKeys(stageKeys.let(IResolvable::unwrap))
    }

    override fun stageKeys(stageKeys: List<Any>) {
      cdkBuilder.stageKeys(stageKeys)
    }

    override fun stageKeys(vararg stageKeys: Any): Unit = stageKeys(stageKeys.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnApiKey = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKey): CfnApiKey =
        CfnApiKey(cdkObject)

    internal fun unwrap(wrapped: CfnApiKey): software.amazon.awscdk.services.apigateway.CfnApiKey =
        wrapped.cdkObject
  }

  public interface StageKeyProperty {
    public fun restApiId(): String? = unwrap(this).getRestApiId()

    public fun stageName(): String? = unwrap(this).getStageName()

    public interface Builder {
      public fun restApiId(restApiId: String)

      public fun stageName(stageName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty.builder()

      override fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
      }

      override fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty,
    ) : StageKeyProperty {
      override fun restApiId(): String? = unwrap(this).getRestApiId()

      override fun stageName(): String? = unwrap(this).getStageName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StageKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty):
          StageKeyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageKeyProperty):
          software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
