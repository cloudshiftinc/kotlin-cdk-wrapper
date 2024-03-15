@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.cxapi.CloudAssemblyBuilder
import kotlin.Boolean
import kotlin.String

public interface ISynthesisSession {
  public fun assembly(): CloudAssemblyBuilder

  public fun assembly(arg0: CloudAssemblyBuilder)

  public fun outdir(): String

  public fun outdir(arg0: String)

  public fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

  public fun validateOnSynth(`value`: Boolean) {
    unwrap(this).setValidateOnSynth(`value`)
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ISynthesisSession,
  ) : CdkObject(cdkObject), ISynthesisSession {
    override fun assembly(): CloudAssemblyBuilder =
        unwrap(this).getAssembly().let(CloudAssemblyBuilder::wrap)

    override fun assembly(arg0: CloudAssemblyBuilder) {
      unwrap(this).setAssembly(arg0.let(CloudAssemblyBuilder::unwrap))
    }

    override fun outdir(): String = unwrap(this).getOutdir()

    override fun outdir(arg0: String) {
      unwrap(this).setOutdir(arg0)
    }

    override fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

    override fun validateOnSynth(`value`: Boolean) {
      unwrap(this).setValidateOnSynth(`value`)
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ISynthesisSession): ISynthesisSession =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISynthesisSession): software.amazon.awscdk.ISynthesisSession =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.ISynthesisSession
  }
}
