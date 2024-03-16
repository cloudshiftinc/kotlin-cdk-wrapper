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
 * An option group.
 */
public interface IOptionGroup : IResource {
  /**
   * Adds a configuration to this OptionGroup.
   *
   * This method is a no-op for an imported OptionGroup.
   *
   * @return true if the OptionConfiguration was successfully added.
   * @param configuration 
   */
  public fun addConfiguration(configuration: OptionConfiguration): Boolean

  /**
   * Adds a configuration to this OptionGroup.
   *
   * This method is a no-op for an imported OptionGroup.
   *
   * @return true if the OptionConfiguration was successfully added.
   * @param configuration 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12b43bc5b68d5862bb4430eddcc0fef9fc36fe009a38b9e972fbd6e89f47a190")
  public fun addConfiguration(configuration: OptionConfiguration.Builder.() -> Unit): Boolean

  /**
   * The name of the option group.
   */
  public fun optionGroupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IOptionGroup): IOptionGroup =
        CdkObjectWrappers.wrap(cdkObject) as IOptionGroup

    internal fun unwrap(wrapped: IOptionGroup): software.amazon.awscdk.services.rds.IOptionGroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.IOptionGroup
  }
}
