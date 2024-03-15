@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOutput internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnOutput,
) : CfnElement(cdkObject) {
  public open fun condition(): CfnCondition? = unwrap(this).getCondition()?.let(CfnCondition::wrap)

  public open fun condition(`value`: CfnCondition) {
    unwrap(this).setCondition(`value`.let(CfnCondition::unwrap))
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun exportName(): String? = unwrap(this).getExportName()

  public open fun exportName(`value`: String) {
    unwrap(this).setExportName(`value`)
  }

  public open fun importValue(): String = unwrap(this).getImportValue()

  public open fun `value`(): Any = unwrap(this).getValue()

  public open fun `value`(`value`: Any) {
    unwrap(this).setValue(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun condition(condition: CfnCondition)

    public fun description(description: String)

    public fun exportName(exportName: String)

    public fun key(key: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnOutput.Builder =
        software.amazon.awscdk.CfnOutput.Builder.create(scope, id)

    override fun condition(condition: CfnCondition) {
      cdkBuilder.condition(condition.let(CfnCondition::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun exportName(exportName: String) {
      cdkBuilder.exportName(exportName)
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.CfnOutput = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOutput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOutput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnOutput): CfnOutput = CfnOutput(cdkObject)

    internal fun unwrap(wrapped: CfnOutput): software.amazon.awscdk.CfnOutput = wrapped.cdkObject
  }
}
