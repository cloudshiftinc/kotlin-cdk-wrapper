package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CommonConstraintOptions {
  /**
   * The description of the constraint.
   *
   * Default: - No description provided
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The language code.
   *
   * Configures the language for error messages from service catalog.
   *
   * Default: - English
   */
  public fun messageLanguage(): MessageLanguage? =
      unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

  /**
   * A builder for [CommonConstraintOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the constraint.
     */
    public fun description(description: String)

    /**
     * @param messageLanguage The language code.
     * Configures the language for error messages from service catalog.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions.builder()

    /**
     * @param description The description of the constraint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param messageLanguage The language code.
     * Configures the language for error messages from service catalog.
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions,
  ) : CdkObject(cdkObject), CommonConstraintOptions {
    /**
     * The description of the constraint.
     *
     * Default: - No description provided
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The language code.
     *
     * Configures the language for error messages from service catalog.
     *
     * Default: - English
     */
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
