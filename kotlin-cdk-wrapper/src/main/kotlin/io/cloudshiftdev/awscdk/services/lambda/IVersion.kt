@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 *
 */
public interface IVersion : IFunction {
  /**
   * (deprecated) Defines an alias for this version.
   *
   * @deprecated Calling `addAlias` on a `Version` object will cause the Alias to be replaced on
   * every function update. Call `function.addAlias()` or `new Alias()` instead.
   * @param aliasName The name of the alias. 
   * @param options Alias options.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun addAlias(aliasName: String): Alias

  /**
   * (deprecated) Defines an alias for this version.
   *
   * @deprecated Calling `addAlias` on a `Version` object will cause the Alias to be replaced on
   * every function update. Call `function.addAlias()` or `new Alias()` instead.
   * @param aliasName The name of the alias. 
   * @param options Alias options.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun addAlias(aliasName: String, options: AliasOptions): Alias

  /**
   * (deprecated) Defines an alias for this version.
   *
   * @deprecated Calling `addAlias` on a `Version` object will cause the Alias to be replaced on
   * every function update. Call `function.addAlias()` or `new Alias()` instead.
   * @param aliasName The name of the alias. 
   * @param options Alias options.
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ff57343b4e1566ac76515fa826125e96564152d30ba0ef3d24569a9cf452484")
  public fun addAlias(aliasName: String, options: AliasOptions.Builder.() -> Unit): Alias

  /**
   * The ARN of the version for Lambda&#64;Edge.
   */
  public fun edgeArn(): String

  /**
   * The underlying AWS Lambda function.
   */
  public fun lambda(): IFunction

  /**
   * The most recently deployed version of this function.
   */
  public fun version(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IVersion): IVersion =
        CdkObjectWrappers.wrap(cdkObject) as IVersion

    internal fun unwrap(wrapped: IVersion): software.amazon.awscdk.services.lambda.IVersion =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IVersion
  }
}
