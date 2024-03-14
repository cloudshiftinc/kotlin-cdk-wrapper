package io.cloudshiftdev.awscdk

public enum class BundlingOutput(
  private val cdkObject: software.amazon.awscdk.BundlingOutput,
) {
  ARCHIVED(software.amazon.awscdk.BundlingOutput.ARCHIVED),
  NOT_ARCHIVED(software.amazon.awscdk.BundlingOutput.NOT_ARCHIVED),
  AUTO_DISCOVER(software.amazon.awscdk.BundlingOutput.AUTO_DISCOVER),
  SINGLE_FILE(software.amazon.awscdk.BundlingOutput.SINGLE_FILE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.BundlingOutput): BundlingOutput = when
        (cdkObject) {
      software.amazon.awscdk.BundlingOutput.ARCHIVED -> BundlingOutput.ARCHIVED
      software.amazon.awscdk.BundlingOutput.NOT_ARCHIVED -> BundlingOutput.NOT_ARCHIVED
      software.amazon.awscdk.BundlingOutput.AUTO_DISCOVER -> BundlingOutput.AUTO_DISCOVER
      software.amazon.awscdk.BundlingOutput.SINGLE_FILE -> BundlingOutput.SINGLE_FILE
    }

    internal fun unwrap(wrapped: BundlingOutput): software.amazon.awscdk.BundlingOutput =
        wrapped.cdkObject
  }
}
