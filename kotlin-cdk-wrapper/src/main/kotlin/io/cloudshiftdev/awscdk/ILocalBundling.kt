@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Local bundling.
 */
public interface ILocalBundling {
  /**
   * This method is called before attempting docker bundling to allow the bundler to be executed
   * locally.
   *
   * If the local bundler exists, and bundling
   * was performed locally, return `true`. Otherwise, return `false`.
   *
   * @param outputDir the directory where the bundled asset should be output. 
   * @param options bundling options for this asset. 
   */
  public fun tryBundle(outputDir: String, options: BundlingOptions): Boolean

  /**
   * This method is called before attempting docker bundling to allow the bundler to be executed
   * locally.
   *
   * If the local bundler exists, and bundling
   * was performed locally, return `true`. Otherwise, return `false`.
   *
   * @param outputDir the directory where the bundled asset should be output. 
   * @param options bundling options for this asset. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("20d66aa0f98dd5c1f458da3bb81456739e3ba5b9094de168036e0dc9ebf92d07")
  public fun tryBundle(outputDir: String, options: BundlingOptions.Builder.() -> Unit): Boolean

  private class Wrapper(
    cdkObject: software.amazon.awscdk.ILocalBundling,
  ) : CdkObject(cdkObject), ILocalBundling {
    /**
     * This method is called before attempting docker bundling to allow the bundler to be executed
     * locally.
     *
     * If the local bundler exists, and bundling
     * was performed locally, return `true`. Otherwise, return `false`.
     *
     * @param outputDir the directory where the bundled asset should be output. 
     * @param options bundling options for this asset. 
     */
    override fun tryBundle(outputDir: String, options: BundlingOptions): Boolean =
        unwrap(this).tryBundle(outputDir, options.let(BundlingOptions::unwrap))

    /**
     * This method is called before attempting docker bundling to allow the bundler to be executed
     * locally.
     *
     * If the local bundler exists, and bundling
     * was performed locally, return `true`. Otherwise, return `false`.
     *
     * @param outputDir the directory where the bundled asset should be output. 
     * @param options bundling options for this asset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20d66aa0f98dd5c1f458da3bb81456739e3ba5b9094de168036e0dc9ebf92d07")
    override fun tryBundle(outputDir: String, options: BundlingOptions.Builder.() -> Unit): Boolean
        = tryBundle(outputDir, BundlingOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ILocalBundling): ILocalBundling =
        CdkObjectWrappers.wrap(cdkObject) as? ILocalBundling ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILocalBundling): software.amazon.awscdk.ILocalBundling = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.ILocalBundling
  }
}
