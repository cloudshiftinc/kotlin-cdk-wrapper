@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotthingsgraph

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFlowTemplateProps {
  public fun compatibleNamespaceVersion(): Number? = unwrap(this).getCompatibleNamespaceVersion()

  public fun definition(): Any

  @CdkDslMarker
  public interface Builder {
    public fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number)

    public fun definition(definition: IResolvable)

    public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfe3444581bfba06dab5d1cceb485ad24772cf206999b808840c98162033af84")
    public fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps.Builder =
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps.builder()

    override fun compatibleNamespaceVersion(compatibleNamespaceVersion: Number) {
      cdkBuilder.compatibleNamespaceVersion(compatibleNamespaceVersion)
    }

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty) {
      cdkBuilder.definition(definition.let(CfnFlowTemplate.DefinitionDocumentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfe3444581bfba06dab5d1cceb485ad24772cf206999b808840c98162033af84")
    override
        fun definition(definition: CfnFlowTemplate.DefinitionDocumentProperty.Builder.() -> Unit):
        Unit = definition(CfnFlowTemplate.DefinitionDocumentProperty(definition))

    public fun build(): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps,
  ) : CdkObject(cdkObject), CfnFlowTemplateProps {
    override fun compatibleNamespaceVersion(): Number? =
        unwrap(this).getCompatibleNamespaceVersion()

    override fun definition(): Any = unwrap(this).getDefinition()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps):
        CfnFlowTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowTemplateProps):
        software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps
  }
}
