@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for a cluster parameter group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.docdb.*;
 * ClusterParameterGroupProps clusterParameterGroupProps = ClusterParameterGroupProps.builder()
 * .family("family")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * // the properties below are optional
 * .dbClusterParameterGroupName("dbClusterParameterGroupName")
 * .description("description")
 * .build();
 * ```
 */
public interface ClusterParameterGroupProps {
  /**
   * The name of the cluster parameter group.
   *
   * Default: A CDK generated name for the cluster parameter group
   */
  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

  /**
   * Description for this parameter group.
   *
   * Default: a CDK generated description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Database family of this parameter group.
   */
  public fun family(): String

  /**
   * The parameters in this parameter group.
   */
  public fun parameters(): Map<String, String>

  /**
   * A builder for [ClusterParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbClusterParameterGroupName The name of the cluster parameter group.
     */
    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    /**
     * @param description Description for this parameter group.
     */
    public fun description(description: String)

    /**
     * @param family Database family of this parameter group. 
     */
    public fun family(family: String)

    /**
     * @param parameters The parameters in this parameter group. 
     */
    public fun parameters(parameters: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.ClusterParameterGroupProps.Builder
        = software.amazon.awscdk.services.docdb.ClusterParameterGroupProps.builder()

    /**
     * @param dbClusterParameterGroupName The name of the cluster parameter group.
     */
    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    /**
     * @param description Description for this parameter group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param family Database family of this parameter group. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param parameters The parameters in this parameter group. 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    public fun build(): software.amazon.awscdk.services.docdb.ClusterParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.ClusterParameterGroupProps,
  ) : CdkObject(cdkObject),
      ClusterParameterGroupProps {
    /**
     * The name of the cluster parameter group.
     *
     * Default: A CDK generated name for the cluster parameter group
     */
    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    /**
     * Description for this parameter group.
     *
     * Default: a CDK generated description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Database family of this parameter group.
     */
    override fun family(): String = unwrap(this).getFamily()

    /**
     * The parameters in this parameter group.
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.ClusterParameterGroupProps):
        ClusterParameterGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        ClusterParameterGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterParameterGroupProps):
        software.amazon.awscdk.services.docdb.ClusterParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.ClusterParameterGroupProps
  }
}
