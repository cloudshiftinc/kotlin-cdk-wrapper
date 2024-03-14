package io.cloudshiftdev.awscdk.services.lambda.nodejs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.collections.List

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
    override val cdkObject: software.amazon.awscdk.services.lambda.nodejs.ICommandHooks,
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
        ICommandHooks = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICommandHooks):
        software.amazon.awscdk.services.lambda.nodejs.ICommandHooks = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.nodejs.ICommandHooks
  }
}
