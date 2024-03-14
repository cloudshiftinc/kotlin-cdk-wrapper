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
  /**
   * The name of the parameter group.
   */
  public override fun parameterGroupName(): String = unwrap(this).getParameterGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.docdb.ClusterParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the cluster parameter group.
     *
     * Default: A CDK generated name for the cluster parameter group
     *
     * @param dbClusterParameterGroupName The name of the cluster parameter group. 
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    /**
     * Description for this parameter group.
     *
     * Default: a CDK generated description
     *
     * @param description Description for this parameter group. 
     */
    public fun description(description: String)

    /**
     * Database family of this parameter group.
     *
     * @param family Database family of this parameter group. 
     */
    public fun family(family: String)

    /**
     * The parameters in this parameter group.
     *
     * @param parameters The parameters in this parameter group. 
     */
    public fun parameters(parameters: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.ClusterParameterGroup.Builder =
        software.amazon.awscdk.services.docdb.ClusterParameterGroup.Builder.create(scope, id)

    /**
     * The name of the cluster parameter group.
     *
     * Default: A CDK generated name for the cluster parameter group
     *
     * @param dbClusterParameterGroupName The name of the cluster parameter group. 
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    /**
     * Description for this parameter group.
     *
     * Default: a CDK generated description
     *
     * @param description Description for this parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Database family of this parameter group.
     *
     * @param family Database family of this parameter group. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * The parameters in this parameter group.
     *
     * @param parameters The parameters in this parameter group. 
     */
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
