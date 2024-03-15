@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ClusterParameterGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.docdb.ClusterParameterGroup,
) : Resource(cdkObject), IClusterParameterGroup {
  public override fun parameterGroupName(): String = unwrap(this).getParameterGroupName()

  @CdkDslMarker
  public interface Builder {
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    public fun description(description: String)

    public fun family(family: String)

    public fun parameters(parameters: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.ClusterParameterGroup.Builder =
        software.amazon.awscdk.services.docdb.ClusterParameterGroup.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.docdb.ClusterParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromParameterGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      parameterGroupName: String,
    ): IClusterParameterGroup =
        software.amazon.awscdk.services.docdb.ClusterParameterGroup.fromParameterGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, parameterGroupName).let(IClusterParameterGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ClusterParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ClusterParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.ClusterParameterGroup):
        ClusterParameterGroup = ClusterParameterGroup(cdkObject)

    internal fun unwrap(wrapped: ClusterParameterGroup):
        software.amazon.awscdk.services.docdb.ClusterParameterGroup = wrapped.cdkObject
  }
}
