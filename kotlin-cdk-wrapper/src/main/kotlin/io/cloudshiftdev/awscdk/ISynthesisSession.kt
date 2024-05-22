@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.cxapi.CloudAssemblyBuilder
import kotlin.Boolean
import kotlin.String

/**
 * Represents a single session of synthesis.
 *
 * Passed into `Construct.synthesize()` methods.
 */
public interface ISynthesisSession {
  /**
   * Cloud assembly builder.
   */
  public fun assembly(): CloudAssemblyBuilder

  /**
   * Cloud assembly builder.
   */
  public fun assembly(`value`: CloudAssemblyBuilder)

  /**
   * The output directory for this synthesis session.
   */
  public fun outdir(): String

  /**
   * The output directory for this synthesis session.
   */
  public fun outdir(`value`: String)

  /**
   * Whether the stack should be validated after synthesis to check for error metadata.
   *
   * Default: - false
   */
  public fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

  /**
   * Whether the stack should be validated after synthesis to check for error metadata.
   *
   * Default: - false
   */
  public fun validateOnSynth(`value`: Boolean) {
    unwrap(this).setValidateOnSynth(`value`)
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.ISynthesisSession,
  ) : CdkObject(cdkObject), ISynthesisSession {
    /**
     * Cloud assembly builder.
     */
    override fun assembly(): CloudAssemblyBuilder =
        unwrap(this).getAssembly().let(CloudAssemblyBuilder::wrap)

    /**
     * Cloud assembly builder.
     */
    override fun assembly(`value`: CloudAssemblyBuilder) {
      unwrap(this).setAssembly(`value`.let(CloudAssemblyBuilder.Companion::unwrap))
    }

    /**
     * The output directory for this synthesis session.
     */
    override fun outdir(): String = unwrap(this).getOutdir()

    /**
     * The output directory for this synthesis session.
     */
    override fun outdir(`value`: String) {
      unwrap(this).setOutdir(`value`)
    }

    /**
     * Whether the stack should be validated after synthesis to check for error metadata.
     *
     * Default: - false
     */
    override fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

    /**
     * Whether the stack should be validated after synthesis to check for error metadata.
     *
     * Default: - false
     */
    override fun validateOnSynth(`value`: Boolean) {
      unwrap(this).setValidateOnSynth(`value`)
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ISynthesisSession): ISynthesisSession =
        CdkObjectWrappers.wrap(cdkObject) as? ISynthesisSession ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISynthesisSession): software.amazon.awscdk.ISynthesisSession =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.ISynthesisSession
  }
}
