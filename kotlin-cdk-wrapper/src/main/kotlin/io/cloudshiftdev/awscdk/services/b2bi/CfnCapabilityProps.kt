@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCapabilityProps {
  public fun configuration(): Any

  public fun instructionsDocuments(): Any? = unwrap(this).getInstructionsDocuments()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b77b4790aea029c3988f383f33d366a1b782e568cac552b36d6f1777c4d7e6af")
    public
        fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty.Builder.() -> Unit)

    public fun instructionsDocuments(instructionsDocuments: IResolvable)

    public fun instructionsDocuments(instructionsDocuments: List<Any>)

    public fun instructionsDocuments(vararg instructionsDocuments: Any)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnCapabilityProps.Builder =
        software.amazon.awscdk.services.b2bi.CfnCapabilityProps.builder()

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnCapability.CapabilityConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b77b4790aea029c3988f383f33d366a1b782e568cac552b36d6f1777c4d7e6af")
    override
        fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnCapability.CapabilityConfigurationProperty(configuration))

    override fun instructionsDocuments(instructionsDocuments: IResolvable) {
      cdkBuilder.instructionsDocuments(instructionsDocuments.let(IResolvable::unwrap))
    }

    override fun instructionsDocuments(instructionsDocuments: List<Any>) {
      cdkBuilder.instructionsDocuments(instructionsDocuments)
    }

    override fun instructionsDocuments(vararg instructionsDocuments: Any): Unit =
        instructionsDocuments(instructionsDocuments.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.b2bi.CfnCapabilityProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.b2bi.CfnCapabilityProps,
  ) : CdkObject(cdkObject), CfnCapabilityProps {
    override fun configuration(): Any = unwrap(this).getConfiguration()

    override fun instructionsDocuments(): Any? = unwrap(this).getInstructionsDocuments()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapabilityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnCapabilityProps):
        CfnCapabilityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapabilityProps):
        software.amazon.awscdk.services.b2bi.CfnCapabilityProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.b2bi.CfnCapabilityProps
  }
}
