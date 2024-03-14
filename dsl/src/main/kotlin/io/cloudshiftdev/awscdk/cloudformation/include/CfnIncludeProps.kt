package io.cloudshiftdev.awscdk.cloudformation.include

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnIncludeProps {
  public fun allowCyclicalReferences(): Boolean? = unwrap(this).getAllowCyclicalReferences()

  public fun loadNestedStacks(): Map<String, CfnIncludeProps> =
      unwrap(this).getLoadNestedStacks()?.mapValues{CfnIncludeProps.wrap(it.value)} ?: emptyMap()

  public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  public fun preserveLogicalIds(): Boolean? = unwrap(this).getPreserveLogicalIds()

  public fun templateFile(): String

  public interface Builder {
    public fun allowCyclicalReferences(allowCyclicalReferences: Boolean)

    public fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>)

    public fun parameters(parameters: Map<String, Any>)

    public fun preserveLogicalIds(preserveLogicalIds: Boolean)

    public fun templateFile(templateFile: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudformation.include.CfnIncludeProps.Builder =
        software.amazon.awscdk.cloudformation.include.CfnIncludeProps.builder()

    override fun allowCyclicalReferences(allowCyclicalReferences: Boolean) {
      cdkBuilder.allowCyclicalReferences(allowCyclicalReferences)
    }

    override fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>) {
      cdkBuilder.loadNestedStacks(loadNestedStacks.mapValues{CfnIncludeProps.unwrap(it.value)})
    }

    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun preserveLogicalIds(preserveLogicalIds: Boolean) {
      cdkBuilder.preserveLogicalIds(preserveLogicalIds)
    }

    override fun templateFile(templateFile: String) {
      cdkBuilder.templateFile(templateFile)
    }

    public fun build(): software.amazon.awscdk.cloudformation.include.CfnIncludeProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudformation.include.CfnIncludeProps,
  ) : CfnIncludeProps {
    override fun allowCyclicalReferences(): Boolean? = unwrap(this).getAllowCyclicalReferences()

    override fun loadNestedStacks(): Map<String, CfnIncludeProps> =
        unwrap(this).getLoadNestedStacks()?.mapValues{CfnIncludeProps.wrap(it.value)} ?: emptyMap()

    override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    override fun preserveLogicalIds(): Boolean? = unwrap(this).getPreserveLogicalIds()

    override fun templateFile(): String = unwrap(this).getTemplateFile()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIncludeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudformation.include.CfnIncludeProps):
        CfnIncludeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIncludeProps):
        software.amazon.awscdk.cloudformation.include.CfnIncludeProps = (wrapped as
        Wrapper).cdkObject
  }
}
