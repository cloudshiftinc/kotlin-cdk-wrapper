@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ClusterParameterGroupProps {
  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun family(): String

  public fun parameters(): Map<String, String>

  @CdkDslMarker
  public interface Builder {
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    public fun description(description: String)

    public fun family(family: String)

    public fun parameters(parameters: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.ClusterParameterGroupProps.Builder
        = software.amazon.awscdk.services.docdb.ClusterParameterGroupProps.builder()

    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    public fun build(): software.amazon.awscdk.services.docdb.ClusterParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.ClusterParameterGroupProps,
  ) : CdkObject(cdkObject), ClusterParameterGroupProps {
    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun family(): String = unwrap(this).getFamily()

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.ClusterParameterGroupProps):
        ClusterParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterParameterGroupProps):
        software.amazon.awscdk.services.docdb.ClusterParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.ClusterParameterGroupProps
  }
}
