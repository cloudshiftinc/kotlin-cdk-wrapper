@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingSchedule
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface for scalable attributes.
 */
public interface IScalableTableAttribute {
  /**
   * Add scheduled scaling for this scaling attribute.
   *
   * @param id 
   * @param actions 
   */
  public fun scaleOnSchedule(id: String, actions: ScalingSchedule)

  /**
   * Add scheduled scaling for this scaling attribute.
   *
   * @param id 
   * @param actions 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
  public fun scaleOnSchedule(id: String, actions: ScalingSchedule.Builder.() -> Unit)

  /**
   * Scale out or in to keep utilization at a given level.
   *
   * @param props 
   */
  public fun scaleOnUtilization(props: UtilizationScalingProps)

  /**
   * Scale out or in to keep utilization at a given level.
   *
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df7aa7d44150d61decd5c4ccb502479fe291ac38d35d0eed8af5ae5676750e45")
  public fun scaleOnUtilization(props: UtilizationScalingProps.Builder.() -> Unit)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.IScalableTableAttribute):
        IScalableTableAttribute = CdkObjectWrappers.wrap(cdkObject) as IScalableTableAttribute

    internal fun unwrap(wrapped: IScalableTableAttribute):
        software.amazon.awscdk.services.dynamodb.IScalableTableAttribute = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.IScalableTableAttribute
  }
}
