@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnabledControl internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControl,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun controlIdentifier(): String = unwrap(this).getControlIdentifier()

  public open fun controlIdentifier(`value`: String) {
    unwrap(this).setControlIdentifier(`value`)
  }

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

  @CdkDslMarker
  public interface Builder {
    public fun controlIdentifier(controlIdentifier: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.controltower.CfnEnabledControl.Builder =
        software.amazon.awscdk.services.controltower.CfnEnabledControl.Builder.create(scope, id)

    override fun controlIdentifier(controlIdentifier: String) {
      cdkBuilder.controlIdentifier(controlIdentifier)
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

    public fun build(): software.amazon.awscdk.services.controltower.CfnEnabledControl =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.controltower.CfnEnabledControl.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnabledControl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnabledControl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControl):
        CfnEnabledControl = CfnEnabledControl(cdkObject)

    internal fun unwrap(wrapped: CfnEnabledControl):
        software.amazon.awscdk.services.controltower.CfnEnabledControl = wrapped.cdkObject
  }

  public interface EnabledControlParameterProperty {
    public fun key(): String

    public fun `value`(): Any

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty.Builder
          =
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty,
    ) : CdkObject(cdkObject), EnabledControlParameterProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnabledControlParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty):
          EnabledControlParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnabledControlParameterProperty):
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.controltower.CfnEnabledControl.EnabledControlParameterProperty
    }
  }
}
