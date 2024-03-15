@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnIntegrationProps {
  public fun domainName(): String

  public fun flowDefinition(): Any? = unwrap(this).getFlowDefinition()

  public fun objectTypeName(): String? = unwrap(this).getObjectTypeName()

  public fun objectTypeNames(): Any? = unwrap(this).getObjectTypeNames()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun uri(): String? = unwrap(this).getUri()

  @CdkDslMarker
  public interface Builder {
    public fun domainName(domainName: String)

    public fun flowDefinition(flowDefinition: IResolvable)

    public fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("361b13d8b8317e8d987995200f2e4c8bfaa0838337f56983e387615fef506b97")
    public
        fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty.Builder.() -> Unit)

    public fun objectTypeName(objectTypeName: String)

    public fun objectTypeNames(objectTypeNames: IResolvable)

    public fun objectTypeNames(objectTypeNames: List<Any>)

    public fun objectTypeNames(vararg objectTypeNames: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps.builder()

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun flowDefinition(flowDefinition: IResolvable) {
      cdkBuilder.flowDefinition(flowDefinition.let(IResolvable::unwrap))
    }

    override fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty) {
      cdkBuilder.flowDefinition(flowDefinition.let(CfnIntegration.FlowDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("361b13d8b8317e8d987995200f2e4c8bfaa0838337f56983e387615fef506b97")
    override
        fun flowDefinition(flowDefinition: CfnIntegration.FlowDefinitionProperty.Builder.() -> Unit):
        Unit = flowDefinition(CfnIntegration.FlowDefinitionProperty(flowDefinition))

    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    override fun objectTypeNames(objectTypeNames: IResolvable) {
      cdkBuilder.objectTypeNames(objectTypeNames.let(IResolvable::unwrap))
    }

    override fun objectTypeNames(objectTypeNames: List<Any>) {
      cdkBuilder.objectTypeNames(objectTypeNames)
    }

    override fun objectTypeNames(vararg objectTypeNames: Any): Unit =
        objectTypeNames(objectTypeNames.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps,
  ) : CdkObject(cdkObject), CfnIntegrationProps {
    override fun domainName(): String = unwrap(this).getDomainName()

    override fun flowDefinition(): Any? = unwrap(this).getFlowDefinition()

    override fun objectTypeName(): String? = unwrap(this).getObjectTypeName()

    override fun objectTypeNames(): Any? = unwrap(this).getObjectTypeNames()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun uri(): String? = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps):
        CfnIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationProps):
        software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps
  }
}
