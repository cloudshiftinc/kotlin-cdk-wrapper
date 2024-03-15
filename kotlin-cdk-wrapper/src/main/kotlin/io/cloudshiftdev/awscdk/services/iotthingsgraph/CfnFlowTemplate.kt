@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotthingsgraph

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFlowTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun compatibleNamespaceVersion(): Number? =
      unwrap(this).getCompatibleNamespaceVersion()

  public open fun compatibleNamespaceVersion(`value`: Number) {
    unwrap(this).setCompatibleNamespaceVersion(`value`)
  }

  public open fun definition(): Any = unwrap(this).getDefinition()

  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  public open fun definition(`value`: DefinitionDocumentProperty) {
    unwrap(this).setDefinition(`value`.let(DefinitionDocumentProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cbfb4b5ded281f72a03b165e90c15dd3990685e549d89f205bfaa093b6442958")
  public open fun definition(`value`: DefinitionDocumentProperty.Builder.() -> Unit): Unit =
      definition(DefinitionDocumentProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number)

    public fun definition(definition: IResolvable)

    public fun definition(definition: DefinitionDocumentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c331c8943b5b6668ac1676353f38fa58f716cbc4897b8c585183210d19ddbbc")
    public fun definition(definition: DefinitionDocumentProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.Builder =
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.Builder.create(scope, id)

    override fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
      cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
    }

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: DefinitionDocumentProperty) {
      cdkBuilder.definition(definition.let(DefinitionDocumentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c331c8943b5b6668ac1676353f38fa58f716cbc4897b8c585183210d19ddbbc")
    override fun definition(definition: DefinitionDocumentProperty.Builder.() -> Unit): Unit =
        definition(DefinitionDocumentProperty(definition))

    public fun build(): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate):
        CfnFlowTemplate = CfnFlowTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnFlowTemplate):
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate = wrapped.cdkObject
  }

  public interface DefinitionDocumentProperty {
    public fun language(): String

    public fun text(): String

    @CdkDslMarker
    public interface Builder {
      public fun language(language: String)

      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty.Builder
          =
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty.builder()

      override fun language(language: String) {
        cdkBuilder.language(language)
      }

      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty,
    ) : CdkObject(cdkObject), DefinitionDocumentProperty {
      override fun language(): String = unwrap(this).getLanguage()

      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionDocumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty):
          DefinitionDocumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefinitionDocumentProperty):
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty
    }
  }
}
