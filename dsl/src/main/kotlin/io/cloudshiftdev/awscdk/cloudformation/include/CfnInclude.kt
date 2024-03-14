package io.cloudshiftdev.awscdk.cloudformation.include

import io.cloudshiftdev.awscdk.CfnCondition
import io.cloudshiftdev.awscdk.CfnElement
import io.cloudshiftdev.awscdk.CfnHook
import io.cloudshiftdev.awscdk.CfnMapping
import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.CfnParameter
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnRule
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInclude internal constructor(
  private val cdkObject: software.amazon.awscdk.cloudformation.include.CfnInclude,
) : CfnElement(cdkObject) {
  public open fun condition(conditionName: String): CfnCondition =
      unwrap(this).getCondition(conditionName).let(CfnCondition::wrap)

  public open fun hook(hookLogicalId: String): CfnHook =
      unwrap(this).getHook(hookLogicalId).let(CfnHook::wrap)

  public open fun loadNestedStack(logicalId: String, nestedStackProps: CfnIncludeProps):
      IncludedNestedStack = unwrap(this).loadNestedStack(logicalId,
      nestedStackProps.let(CfnIncludeProps::unwrap)).let(IncludedNestedStack::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("73567903f70875c05bac0054e5221db2830d6b52f57afdec22ec5ea29c3830c5")
  public open fun loadNestedStack(logicalId: String,
      nestedStackProps: CfnIncludeProps.Builder.() -> Unit): IncludedNestedStack =
      loadNestedStack(logicalId, CfnIncludeProps(nestedStackProps))

  public open fun mapping(mappingName: String): CfnMapping =
      unwrap(this).getMapping(mappingName).let(CfnMapping::wrap)

  public open fun nestedStack(logicalId: String): IncludedNestedStack =
      unwrap(this).getNestedStack(logicalId).let(IncludedNestedStack::wrap)

  public open fun output(logicalId: String): CfnOutput =
      unwrap(this).getOutput(logicalId).let(CfnOutput::wrap)

  public open fun parameter(parameterName: String): CfnParameter =
      unwrap(this).getParameter(parameterName).let(CfnParameter::wrap)

  public open fun resource(logicalId: String): CfnResource =
      unwrap(this).getResource(logicalId).let(CfnResource::wrap)

  public open fun rule(ruleName: String): CfnRule =
      unwrap(this).getRule(ruleName).let(CfnRule::wrap)

  public interface Builder {
    public fun allowCyclicalReferences(allowCyclicalReferences: Boolean)

    public fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>)

    public fun parameters(parameters: Map<String, Any>)

    public fun preserveLogicalIds(preserveLogicalIds: Boolean)

    public fun templateFile(templateFile: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudformation.include.CfnInclude.Builder =
        software.amazon.awscdk.cloudformation.include.CfnInclude.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.cloudformation.include.CfnInclude =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInclude {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInclude(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudformation.include.CfnInclude):
        CfnInclude = CfnInclude(cdkObject)

    internal fun unwrap(wrapped: CfnInclude):
        software.amazon.awscdk.cloudformation.include.CfnInclude = wrapped.cdkObject
  }
}
