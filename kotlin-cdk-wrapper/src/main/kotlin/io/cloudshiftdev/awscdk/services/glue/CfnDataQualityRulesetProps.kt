@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDataQualityRulesetProps {
  public fun clientToken(): String? = unwrap(this).getClientToken()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun ruleset(): String? = unwrap(this).getRuleset()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun targetTable(): Any? = unwrap(this).getTargetTable()

  @CdkDslMarker
  public interface Builder {
    public fun clientToken(clientToken: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun ruleset(ruleset: String)

    public fun tags(tags: Any)

    public fun targetTable(targetTable: IResolvable)

    public fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b1d684fd96de3bf4beb5dbc7b38dd9a39037b5c421db70fa0c976fcdba6b489")
    public
        fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps.Builder
        = software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps.builder()

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ruleset(ruleset: String) {
      cdkBuilder.ruleset(ruleset)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun targetTable(targetTable: IResolvable) {
      cdkBuilder.targetTable(targetTable.let(IResolvable::unwrap))
    }

    override fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty) {
      cdkBuilder.targetTable(targetTable.let(CfnDataQualityRuleset.DataQualityTargetTableProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b1d684fd96de3bf4beb5dbc7b38dd9a39037b5c421db70fa0c976fcdba6b489")
    override
        fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder.() -> Unit):
        Unit = targetTable(CfnDataQualityRuleset.DataQualityTargetTableProperty(targetTable))

    public fun build(): software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps,
  ) : CdkObject(cdkObject), CfnDataQualityRulesetProps {
    override fun clientToken(): String? = unwrap(this).getClientToken()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun ruleset(): String? = unwrap(this).getRuleset()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun targetTable(): Any? = unwrap(this).getTargetTable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataQualityRulesetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps):
        CfnDataQualityRulesetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataQualityRulesetProps):
        software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps
  }
}
