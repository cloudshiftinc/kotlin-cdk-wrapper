@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnOptionGroupProps {
  public fun engineName(): String

  public fun majorEngineVersion(): String

  public fun optionConfigurations(): Any? = unwrap(this).getOptionConfigurations()

  public fun optionGroupDescription(): String

  public fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun engineName(engineName: String)

    public fun majorEngineVersion(majorEngineVersion: String)

    public fun optionConfigurations(optionConfigurations: IResolvable)

    public fun optionConfigurations(optionConfigurations: List<Any>)

    public fun optionConfigurations(vararg optionConfigurations: Any)

    public fun optionGroupDescription(optionGroupDescription: String)

    public fun optionGroupName(optionGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnOptionGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnOptionGroupProps.builder()

    override fun engineName(engineName: String) {
      cdkBuilder.engineName(engineName)
    }

    override fun majorEngineVersion(majorEngineVersion: String) {
      cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    override fun optionConfigurations(optionConfigurations: IResolvable) {
      cdkBuilder.optionConfigurations(optionConfigurations.let(IResolvable::unwrap))
    }

    override fun optionConfigurations(optionConfigurations: List<Any>) {
      cdkBuilder.optionConfigurations(optionConfigurations)
    }

    override fun optionConfigurations(vararg optionConfigurations: Any): Unit =
        optionConfigurations(optionConfigurations.toList())

    override fun optionGroupDescription(optionGroupDescription: String) {
      cdkBuilder.optionGroupDescription(optionGroupDescription)
    }

    override fun optionGroupName(optionGroupName: String) {
      cdkBuilder.optionGroupName(optionGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnOptionGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroupProps,
  ) : CdkObject(cdkObject), CfnOptionGroupProps {
    override fun engineName(): String = unwrap(this).getEngineName()

    override fun majorEngineVersion(): String = unwrap(this).getMajorEngineVersion()

    override fun optionConfigurations(): Any? = unwrap(this).getOptionConfigurations()

    override fun optionGroupDescription(): String = unwrap(this).getOptionGroupDescription()

    override fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOptionGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnOptionGroupProps):
        CfnOptionGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOptionGroupProps):
        software.amazon.awscdk.services.rds.CfnOptionGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnOptionGroupProps
  }
}
