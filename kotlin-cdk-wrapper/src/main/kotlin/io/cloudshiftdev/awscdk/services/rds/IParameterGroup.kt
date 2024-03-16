@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A parameter group.
 *
 * Represents both a cluster parameter group,
 * and an instance parameter group.
 */
public interface IParameterGroup : IResource {
  /**
   * Adds a parameter to this group.
   *
   * If this is an imported parameter group,
   * this method does nothing.
   *
   * @return true if the parameter was actually added
   * (i.e., this ParameterGroup is not imported),
   * false otherwise
   * @param key 
   * @param value 
   */
  public fun addParameter(key: String, `value`: String): Boolean

  /**
   * Method called when this Parameter Group is used when defining a database cluster.
   *
   * @param options 
   */
  public fun bindToCluster(options: ParameterGroupClusterBindOptions): ParameterGroupClusterConfig

  /**
   * Method called when this Parameter Group is used when defining a database cluster.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d28cdc7226268867666e1b55a9f41f9760704e0a8aea5aed647fb9bc4accfa14")
  public fun bindToCluster(options: ParameterGroupClusterBindOptions.Builder.() -> Unit):
      ParameterGroupClusterConfig

  /**
   * Method called when this Parameter Group is used when defining a database instance.
   *
   * @param options 
   */
  public fun bindToInstance(options: ParameterGroupInstanceBindOptions):
      ParameterGroupInstanceConfig

  /**
   * Method called when this Parameter Group is used when defining a database instance.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fda7f99b0973a1794d583b4748a0034342e5fc0557269fbcea9db1b8801b312b")
  public fun bindToInstance(options: ParameterGroupInstanceBindOptions.Builder.() -> Unit):
      ParameterGroupInstanceConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IParameterGroup):
        IParameterGroup = CdkObjectWrappers.wrap(cdkObject) as IParameterGroup

    internal fun unwrap(wrapped: IParameterGroup):
        software.amazon.awscdk.services.rds.IParameterGroup = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IParameterGroup
  }
}
