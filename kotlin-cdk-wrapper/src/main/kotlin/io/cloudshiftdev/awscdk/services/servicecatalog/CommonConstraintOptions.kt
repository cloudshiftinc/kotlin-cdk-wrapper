@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CommonConstraintOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun messageLanguage(): MessageLanguage? =
      unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun messageLanguage(messageLanguage: MessageLanguage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions,
  ) : CdkObject(cdkObject), CommonConstraintOptions {
    override fun description(): String? = unwrap(this).getDescription()

    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonConstraintOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions):
        CommonConstraintOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonConstraintOptions):
        software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions
  }
}
