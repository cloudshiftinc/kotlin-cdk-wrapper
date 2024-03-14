package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnabledBaseline internal constructor(
  private val cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaseline,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrEnabledBaselineIdentifier(): String =
      unwrap(this).getAttrEnabledBaselineIdentifier()

  public open fun baselineIdentifier(): String = unwrap(this).getBaselineIdentifier()

  public open fun baselineIdentifier(`value`: String) {
    unwrap(this).setBaselineIdentifier(`value`)
  }

  public open fun baselineVersion(): String = unwrap(this).getBaselineVersion()

  public open fun baselineVersion(`value`: String) {
    unwrap(this).setBaselineVersion(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun parameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setParameters(__idx_ac66f0)
  }

  public open fun parameters(vararg __idx_ac66f0: Any): Unit = parameters(__idx_ac66f0.toList())

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun targetIdentifier(): String = unwrap(this).getTargetIdentifier()

  public open fun targetIdentifier(`value`: String) {
    unwrap(this).setTargetIdentifier(`value`)
  }

  public interface Builder {
    public fun baselineIdentifier(baselineIdentifier: String)

    public fun baselineVersion(baselineVersion: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: List<Any>)

    public fun parameters(vararg parameters: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetIdentifier(targetIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.controltower.CfnEnabledBaseline.Builder
        = software.amazon.awscdk.services.controltower.CfnEnabledBaseline.Builder.create(scope, id)

    override fun baselineIdentifier(baselineIdentifier: String) {
      cdkBuilder.baselineIdentifier(baselineIdentifier)
    }

    override fun baselineVersion(baselineVersion: String) {
      cdkBuilder.baselineVersion(baselineVersion)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetIdentifier(targetIdentifier: String) {
      cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnEnabledBaseline =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnabledBaseline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnabledBaseline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaseline):
        CfnEnabledBaseline = CfnEnabledBaseline(cdkObject)

    internal fun unwrap(wrapped: CfnEnabledBaseline):
        software.amazon.awscdk.services.controltower.CfnEnabledBaseline = wrapped.cdkObject
  }

  public interface ParameterProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): Any? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty.Builder
          =
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty,
    ) : ParameterProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty):
          ParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.controltower.CfnEnabledBaseline.ParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
