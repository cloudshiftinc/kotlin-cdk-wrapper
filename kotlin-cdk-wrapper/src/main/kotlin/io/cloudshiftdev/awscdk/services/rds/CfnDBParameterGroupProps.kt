@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDBParameterGroupProps {
  public fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  public fun description(): String

  public fun family(): String

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dbParameterGroupName(dbParameterGroupName: String)

    public fun description(description: String)

    public fun family(family: String)

    public fun parameters(parameters: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBParameterGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBParameterGroupProps.builder()

    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBParameterGroupProps,
  ) : CdkObject(cdkObject), CfnDBParameterGroupProps {
    override fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

    override fun description(): String = unwrap(this).getDescription()

    override fun family(): String = unwrap(this).getFamily()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBParameterGroupProps):
        CfnDBParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBParameterGroupProps):
        software.amazon.awscdk.services.rds.CfnDBParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBParameterGroupProps
  }
}
