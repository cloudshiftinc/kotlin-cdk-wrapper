@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 *
 */
public interface IExtension : IResource {
  /**
   * The actions for the extension.
   */
  public fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?: emptyList()

  /**
   * The description of the extension.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the extension.
   */
  public fun extensionArn(): String

  /**
   * The ID of the extension.
   */
  public fun extensionId(): String

  /**
   * The version number of the extension.
   */
  public fun extensionVersionNumber(): Number

  /**
   * The latest version number of the extension.
   */
  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * The name of the extension.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The parameters of the extension.
   */
  public fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap) ?:
      emptyList()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IExtension): IExtension =
        CdkObjectWrappers.wrap(cdkObject) as IExtension

    internal fun unwrap(wrapped: IExtension): software.amazon.awscdk.services.appconfig.IExtension =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IExtension
  }
}
