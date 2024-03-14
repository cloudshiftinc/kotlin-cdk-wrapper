package io.cloudshiftdev.awscdk.services.ses

public enum class EmailSendingEvent(
  private val cdkObject: software.amazon.awscdk.services.ses.EmailSendingEvent,
) {
  SEND(software.amazon.awscdk.services.ses.EmailSendingEvent.SEND),
  REJECT(software.amazon.awscdk.services.ses.EmailSendingEvent.REJECT),
  BOUNCE(software.amazon.awscdk.services.ses.EmailSendingEvent.BOUNCE),
  COMPLAINT(software.amazon.awscdk.services.ses.EmailSendingEvent.COMPLAINT),
  DELIVERY(software.amazon.awscdk.services.ses.EmailSendingEvent.DELIVERY),
  OPEN(software.amazon.awscdk.services.ses.EmailSendingEvent.OPEN),
  CLICK(software.amazon.awscdk.services.ses.EmailSendingEvent.CLICK),
  RENDERING_FAILURE(software.amazon.awscdk.services.ses.EmailSendingEvent.RENDERING_FAILURE),
  DELIVERY_DELAY(software.amazon.awscdk.services.ses.EmailSendingEvent.DELIVERY_DELAY),
  SUBSCRIPTION(software.amazon.awscdk.services.ses.EmailSendingEvent.SUBSCRIPTION),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.EmailSendingEvent):
        EmailSendingEvent = when (cdkObject) {
      software.amazon.awscdk.services.ses.EmailSendingEvent.SEND -> EmailSendingEvent.SEND
      software.amazon.awscdk.services.ses.EmailSendingEvent.REJECT -> EmailSendingEvent.REJECT
      software.amazon.awscdk.services.ses.EmailSendingEvent.BOUNCE -> EmailSendingEvent.BOUNCE
      software.amazon.awscdk.services.ses.EmailSendingEvent.COMPLAINT -> EmailSendingEvent.COMPLAINT
      software.amazon.awscdk.services.ses.EmailSendingEvent.DELIVERY -> EmailSendingEvent.DELIVERY
      software.amazon.awscdk.services.ses.EmailSendingEvent.OPEN -> EmailSendingEvent.OPEN
      software.amazon.awscdk.services.ses.EmailSendingEvent.CLICK -> EmailSendingEvent.CLICK
      software.amazon.awscdk.services.ses.EmailSendingEvent.RENDERING_FAILURE ->
          EmailSendingEvent.RENDERING_FAILURE
      software.amazon.awscdk.services.ses.EmailSendingEvent.DELIVERY_DELAY ->
          EmailSendingEvent.DELIVERY_DELAY
      software.amazon.awscdk.services.ses.EmailSendingEvent.SUBSCRIPTION ->
          EmailSendingEvent.SUBSCRIPTION
    }

    internal fun unwrap(wrapped: EmailSendingEvent):
        software.amazon.awscdk.services.ses.EmailSendingEvent = wrapped.cdkObject
  }
}
