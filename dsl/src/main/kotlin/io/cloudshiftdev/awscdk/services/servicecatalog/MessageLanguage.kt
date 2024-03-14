package io.cloudshiftdev.awscdk.services.servicecatalog

public enum class MessageLanguage(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.MessageLanguage,
) {
  EN(software.amazon.awscdk.services.servicecatalog.MessageLanguage.EN),
  JP(software.amazon.awscdk.services.servicecatalog.MessageLanguage.JP),
  ZH(software.amazon.awscdk.services.servicecatalog.MessageLanguage.ZH),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.MessageLanguage):
        MessageLanguage = when (cdkObject) {
      software.amazon.awscdk.services.servicecatalog.MessageLanguage.EN -> MessageLanguage.EN
      software.amazon.awscdk.services.servicecatalog.MessageLanguage.JP -> MessageLanguage.JP
      software.amazon.awscdk.services.servicecatalog.MessageLanguage.ZH -> MessageLanguage.ZH
    }

    internal fun unwrap(wrapped: MessageLanguage):
        software.amazon.awscdk.services.servicecatalog.MessageLanguage = wrapped.cdkObject
  }
}
