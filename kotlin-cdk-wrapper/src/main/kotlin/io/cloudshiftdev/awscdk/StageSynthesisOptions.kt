@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface StageSynthesisOptions {
  public fun force(): Boolean? = unwrap(this).getForce()

  public fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()

  public fun validateOnSynthesis(): Boolean? = unwrap(this).getValidateOnSynthesis()

  @CdkDslMarker
  public interface Builder {
    public fun force(force: Boolean)

    public fun skipValidation(skipValidation: Boolean)

    public fun validateOnSynthesis(validateOnSynthesis: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.StageSynthesisOptions.Builder =
        software.amazon.awscdk.StageSynthesisOptions.builder()

    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    override fun skipValidation(skipValidation: Boolean) {
      cdkBuilder.skipValidation(skipValidation)
    }

    override fun validateOnSynthesis(validateOnSynthesis: Boolean) {
      cdkBuilder.validateOnSynthesis(validateOnSynthesis)
    }

    public fun build(): software.amazon.awscdk.StageSynthesisOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.StageSynthesisOptions,
  ) : CdkObject(cdkObject), StageSynthesisOptions {
    override fun force(): Boolean? = unwrap(this).getForce()

    override fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()

    override fun validateOnSynthesis(): Boolean? = unwrap(this).getValidateOnSynthesis()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageSynthesisOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.StageSynthesisOptions):
        StageSynthesisOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageSynthesisOptions):
        software.amazon.awscdk.StageSynthesisOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.StageSynthesisOptions
  }
}