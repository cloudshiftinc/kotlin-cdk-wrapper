@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStack internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnStack,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrChangeSetId(): String = unwrap(this).getAttrChangeSetId()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastUpdateTime(): String = unwrap(this).getAttrLastUpdateTime()

  public open fun attrOutputs(): IResolvable = unwrap(this).getAttrOutputs().let(IResolvable::wrap)

  public open fun attrParentId(): String = unwrap(this).getAttrParentId()

  public open fun attrRootId(): String = unwrap(this).getAttrRootId()

  public open fun attrStackId(): String = unwrap(this).getAttrStackId()

  public open fun attrStackStatus(): String = unwrap(this).getAttrStackStatus()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
      emptyList()

  public open fun notificationArns(`value`: List<String>) {
    unwrap(this).setNotificationArns(`value`)
  }

  public open fun notificationArns(vararg `value`: String): Unit =
      notificationArns(`value`.toList())

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun parameters(`value`: Map<String, String>) {
    unwrap(this).setParameters(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  public open fun templateUrl(`value`: String) {
    unwrap(this).setTemplateUrl(`value`)
  }

  public open fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  public open fun timeoutInMinutes(`value`: Number) {
    unwrap(this).setTimeoutInMinutes(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: Map<String, String>)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateUrl(templateUrl: String)

    public fun timeoutInMinutes(timeoutInMinutes: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnStack.Builder =
        software.amazon.awscdk.CfnStack.Builder.create(scope, id)

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateUrl(templateUrl: String) {
      cdkBuilder.templateUrl(templateUrl)
    }

    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): software.amazon.awscdk.CfnStack = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnStack.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnStack): CfnStack = CfnStack(cdkObject)

    internal fun unwrap(wrapped: CfnStack): software.amazon.awscdk.CfnStack = wrapped.cdkObject
  }

  public interface OutputProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun exportName(): String? = unwrap(this).getExportName()

    public fun outputKey(): String? = unwrap(this).getOutputKey()

    public fun outputValue(): String? = unwrap(this).getOutputValue()

    @CdkDslMarker
    public interface Builder {
      public fun description(description: String)

      public fun exportName(exportName: String)

      public fun outputKey(outputKey: String)

      public fun outputValue(outputValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.CfnStack.OutputProperty.Builder =
          software.amazon.awscdk.CfnStack.OutputProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun exportName(exportName: String) {
        cdkBuilder.exportName(exportName)
      }

      override fun outputKey(outputKey: String) {
        cdkBuilder.outputKey(outputKey)
      }

      override fun outputValue(outputValue: String) {
        cdkBuilder.outputValue(outputValue)
      }

      public fun build(): software.amazon.awscdk.CfnStack.OutputProperty = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.CfnStack.OutputProperty,
    ) : CdkObject(cdkObject), OutputProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun exportName(): String? = unwrap(this).getExportName()

      override fun outputKey(): String? = unwrap(this).getOutputKey()

      override fun outputValue(): String? = unwrap(this).getOutputValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.CfnStack.OutputProperty): OutputProperty =
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty): software.amazon.awscdk.CfnStack.OutputProperty =
          (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnStack.OutputProperty
    }
  }
}
