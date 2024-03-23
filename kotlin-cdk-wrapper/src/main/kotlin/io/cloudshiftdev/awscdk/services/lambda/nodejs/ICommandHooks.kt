@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.nodejs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * Command hooks.
 *
 * These commands will run in the environment in which bundling occurs: inside
 * the container for Docker bundling or on the host OS for local bundling.
 *
 * Commands are chained with `&amp;&amp;`.
 *
 * The following example (specified in TypeScript) copies a file from the input
 * directory to the output directory to include it in the bundled asset:
 *
 * ```
 * afterBundling(inputDir: string, outputDir: string): string[]{
 * return [`cp ${inputDir}/my-binary.node ${outputDir}`];
 * }
 * ```
 */
public interface ICommandHooks {
  /**
   * Returns commands to run after bundling.
   *
   * Commands are chained with `&amp;&amp;`.
   *
   * @param inputDir 
   * @param outputDir 
   */
  public fun afterBundling(inputDir: String, outputDir: String): List<String>

  /**
   * Returns commands to run before bundling.
   *
   * Commands are chained with `&amp;&amp;`.
   *
   * @param inputDir 
   * @param outputDir 
   */
  public fun beforeBundling(inputDir: String, outputDir: String): List<String>

  /**
   * Returns commands to run before installing node modules.
   *
   * This hook only runs when node modules are installed.
   *
   * Commands are chained with `&amp;&amp;`.
   *
   * @param inputDir 
   * @param outputDir 
   */
  public fun beforeInstall(inputDir: String, outputDir: String): List<String>

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.nodejs.ICommandHooks,
  ) : CdkObject(cdkObject), ICommandHooks {
    /**
     * Returns commands to run after bundling.
     *
     * Commands are chained with `&amp;&amp;`.
     *
     * @param inputDir 
     * @param outputDir 
     */
    override fun afterBundling(inputDir: String, outputDir: String): List<String> =
        unwrap(this).afterBundling(inputDir, outputDir)

    /**
     * Returns commands to run before bundling.
     *
     * Commands are chained with `&amp;&amp;`.
     *
     * @param inputDir 
     * @param outputDir 
     */
    override fun beforeBundling(inputDir: String, outputDir: String): List<String> =
        unwrap(this).beforeBundling(inputDir, outputDir)

    /**
     * Returns commands to run before installing node modules.
     *
     * This hook only runs when node modules are installed.
     *
     * Commands are chained with `&amp;&amp;`.
     *
     * @param inputDir 
     * @param outputDir 
     */
    override fun beforeInstall(inputDir: String, outputDir: String): List<String> =
        unwrap(this).beforeInstall(inputDir, outputDir)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.ICommandHooks):
        ICommandHooks = CdkObjectWrappers.wrap(cdkObject) as? ICommandHooks ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICommandHooks):
        software.amazon.awscdk.services.lambda.nodejs.ICommandHooks = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.nodejs.ICommandHooks
  }
}
