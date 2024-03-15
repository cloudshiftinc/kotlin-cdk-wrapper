@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInputProps {
  public fun inputDefinition(): Any

  public fun inputDescription(): String? = unwrap(this).getInputDescription()

  public fun inputName(): String? = unwrap(this).getInputName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun inputDefinition(inputDefinition: IResolvable)

    public fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8afb78ab9fdc53ab6e2a745a441372dd97e0466473da9d656679745ad031e2cd")
    public fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty.Builder.() -> Unit)

    public fun inputDescription(inputDescription: String)

    public fun inputName(inputName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnInputProps.Builder =
        software.amazon.awscdk.services.iotevents.CfnInputProps.builder()

    override fun inputDefinition(inputDefinition: IResolvable) {
      cdkBuilder.inputDefinition(inputDefinition.let(IResolvable::unwrap))
    }

    override fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty) {
      cdkBuilder.inputDefinition(inputDefinition.let(CfnInput.InputDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8afb78ab9fdc53ab6e2a745a441372dd97e0466473da9d656679745ad031e2cd")
    override
        fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty.Builder.() -> Unit):
        Unit = inputDefinition(CfnInput.InputDefinitionProperty(inputDefinition))

    override fun inputDescription(inputDescription: String) {
      cdkBuilder.inputDescription(inputDescription)
    }

    override fun inputName(inputName: String) {
      cdkBuilder.inputName(inputName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnInputProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotevents.CfnInputProps,
  ) : CdkObject(cdkObject), CfnInputProps {
    override fun inputDefinition(): Any = unwrap(this).getInputDefinition()

    override fun inputDescription(): String? = unwrap(this).getInputDescription()

    override fun inputName(): String? = unwrap(this).getInputName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnInputProps):
        CfnInputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInputProps):
        software.amazon.awscdk.services.iotevents.CfnInputProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iotevents.CfnInputProps
  }
}
