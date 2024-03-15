@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Commands to run at predefined points during the integration test workflow.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * Hooks hooks = Hooks.builder()
 * .postDeploy(List.of("postDeploy"))
 * .postDestroy(List.of("postDestroy"))
 * .preDeploy(List.of("preDeploy"))
 * .preDestroy(List.of("preDestroy"))
 * .build();
 * ```
 */
public interface Hooks {
  /**
   * Commands to run prior after deploying the cdk stacks in the integration test.
   *
   * Default: - no commands
   */
  public fun postDeploy(): List<String> = unwrap(this).getPostDeploy() ?: emptyList()

  /**
   * Commands to run after destroying the cdk stacks in the integration test.
   *
   * Default: - no commands
   */
  public fun postDestroy(): List<String> = unwrap(this).getPostDestroy() ?: emptyList()

  /**
   * Commands to run prior to deploying the cdk stacks in the integration test.
   *
   * Default: - no commands
   */
  public fun preDeploy(): List<String> = unwrap(this).getPreDeploy() ?: emptyList()

  /**
   * Commands to run prior to destroying the cdk stacks in the integration test.
   *
   * Default: - no commands
   */
  public fun preDestroy(): List<String> = unwrap(this).getPreDestroy() ?: emptyList()

  /**
   * A builder for [Hooks]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param postDeploy Commands to run prior after deploying the cdk stacks in the integration
     * test.
     */
    public fun postDeploy(postDeploy: List<String>)

    /**
     * @param postDeploy Commands to run prior after deploying the cdk stacks in the integration
     * test.
     */
    public fun postDeploy(vararg postDeploy: String)

    /**
     * @param postDestroy Commands to run after destroying the cdk stacks in the integration test.
     */
    public fun postDestroy(postDestroy: List<String>)

    /**
     * @param postDestroy Commands to run after destroying the cdk stacks in the integration test.
     */
    public fun postDestroy(vararg postDestroy: String)

    /**
     * @param preDeploy Commands to run prior to deploying the cdk stacks in the integration test.
     */
    public fun preDeploy(preDeploy: List<String>)

    /**
     * @param preDeploy Commands to run prior to deploying the cdk stacks in the integration test.
     */
    public fun preDeploy(vararg preDeploy: String)

    /**
     * @param preDestroy Commands to run prior to destroying the cdk stacks in the integration test.
     */
    public fun preDestroy(preDestroy: List<String>)

    /**
     * @param preDestroy Commands to run prior to destroying the cdk stacks in the integration test.
     */
    public fun preDestroy(vararg preDestroy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.Hooks.Builder =
        software.amazon.awscdk.cloudassembly.schema.Hooks.builder()

    /**
     * @param postDeploy Commands to run prior after deploying the cdk stacks in the integration
     * test.
     */
    override fun postDeploy(postDeploy: List<String>) {
      cdkBuilder.postDeploy(postDeploy)
    }

    /**
     * @param postDeploy Commands to run prior after deploying the cdk stacks in the integration
     * test.
     */
    override fun postDeploy(vararg postDeploy: String): Unit = postDeploy(postDeploy.toList())

    /**
     * @param postDestroy Commands to run after destroying the cdk stacks in the integration test.
     */
    override fun postDestroy(postDestroy: List<String>) {
      cdkBuilder.postDestroy(postDestroy)
    }

    /**
     * @param postDestroy Commands to run after destroying the cdk stacks in the integration test.
     */
    override fun postDestroy(vararg postDestroy: String): Unit = postDestroy(postDestroy.toList())

    /**
     * @param preDeploy Commands to run prior to deploying the cdk stacks in the integration test.
     */
    override fun preDeploy(preDeploy: List<String>) {
      cdkBuilder.preDeploy(preDeploy)
    }

    /**
     * @param preDeploy Commands to run prior to deploying the cdk stacks in the integration test.
     */
    override fun preDeploy(vararg preDeploy: String): Unit = preDeploy(preDeploy.toList())

    /**
     * @param preDestroy Commands to run prior to destroying the cdk stacks in the integration test.
     */
    override fun preDestroy(preDestroy: List<String>) {
      cdkBuilder.preDestroy(preDestroy)
    }

    /**
     * @param preDestroy Commands to run prior to destroying the cdk stacks in the integration test.
     */
    override fun preDestroy(vararg preDestroy: String): Unit = preDestroy(preDestroy.toList())

    public fun build(): software.amazon.awscdk.cloudassembly.schema.Hooks = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.Hooks,
  ) : CdkObject(cdkObject), Hooks {
    /**
     * Commands to run prior after deploying the cdk stacks in the integration test.
     *
     * Default: - no commands
     */
    override fun postDeploy(): List<String> = unwrap(this).getPostDeploy() ?: emptyList()

    /**
     * Commands to run after destroying the cdk stacks in the integration test.
     *
     * Default: - no commands
     */
    override fun postDestroy(): List<String> = unwrap(this).getPostDestroy() ?: emptyList()

    /**
     * Commands to run prior to deploying the cdk stacks in the integration test.
     *
     * Default: - no commands
     */
    override fun preDeploy(): List<String> = unwrap(this).getPreDeploy() ?: emptyList()

    /**
     * Commands to run prior to destroying the cdk stacks in the integration test.
     *
     * Default: - no commands
     */
    override fun preDestroy(): List<String> = unwrap(this).getPreDestroy() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Hooks {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.Hooks): Hooks =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Hooks): software.amazon.awscdk.cloudassembly.schema.Hooks =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.Hooks
  }
}
