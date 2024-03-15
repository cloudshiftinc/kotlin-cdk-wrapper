@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnOutputProps {
  public fun condition(): CfnCondition? = unwrap(this).getCondition()?.let(CfnCondition::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun exportName(): String? = unwrap(this).getExportName()

  public fun key(): String? = unwrap(this).getKey()

  public fun `value`(): String

  @CdkDslMarker
  public interface Builder {
    public fun condition(condition: CfnCondition)

    public fun description(description: String)

    public fun exportName(exportName: String)

    public fun key(key: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnOutputProps.Builder =
        software.amazon.awscdk.CfnOutputProps.builder()

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

    public fun build(): software.amazon.awscdk.CfnOutputProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnOutputProps,
  ) : CdkObject(cdkObject), CfnOutputProps {
    override fun condition(): CfnCondition? = unwrap(this).getCondition()?.let(CfnCondition::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun exportName(): String? = unwrap(this).getExportName()

    override fun key(): String? = unwrap(this).getKey()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOutputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnOutputProps): CfnOutputProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOutputProps): software.amazon.awscdk.CfnOutputProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.CfnOutputProps
  }
}
